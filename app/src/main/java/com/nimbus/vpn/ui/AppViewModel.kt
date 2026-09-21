package com.nimbus.vpn.ui

import android.app.Application
import android.content.Intent
import android.net.Uri
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.nimbus.vpn.BozyaApp
import com.nimbus.vpn.data.AccessApi
import com.nimbus.vpn.data.AppSettings
import com.nimbus.vpn.data.ConfigParser
import com.nimbus.vpn.data.ServerPing
import com.nimbus.vpn.data.VpnProfile
import com.nimbus.vpn.data.WarpGenerator
import com.nimbus.vpn.tunnel.ConnectionStatus
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.sync.withPermit
import kotlinx.coroutines.withContext
import java.util.UUID
import java.util.concurrent.atomic.AtomicBoolean

enum class AccessStatus { IDLE, WORKING, OK, FAIL }

data class AccessUiState(
    val status: AccessStatus = AccessStatus.IDLE,
    val message: String? = null,
)

data class WarpUiState(
    val generating: Boolean = false,
    val error: String? = null,
    val message: String? = null,
    val created: Boolean = false,
)

data class ServerPingState(
    val runningIds: Set<String> = emptySet(),
    val millis: Map<String, Int?> = emptyMap(),
)

class AppViewModel(application: Application) : AndroidViewModel(application) {
    private val app = application as BozyaApp
    val tunnel = app.container.tunnel.ui
    val root = app.container.tunnel.rootStatus
    val profiles = app.container.profiles.index
    val settings: StateFlow<AppSettings> = app.container.settings.settings.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5_000),
        AppSettings(),
    )

    private val _warp = MutableStateFlow(WarpUiState())
    val warp: StateFlow<WarpUiState> = _warp.asStateFlow()

    private val _access = MutableStateFlow(AccessUiState())
    val access: StateFlow<AccessUiState> = _access.asStateFlow()

    private val _ping = MutableStateFlow(ServerPingState())
    val ping: StateFlow<ServerPingState> = _ping.asStateFlow()
    private val opMutex = Mutex()
    private val toggleGate = AtomicBoolean(false)
    private var switchJob: Job? = null

    fun activateAccess() {
        if (_access.value.status == AccessStatus.WORKING) return
        _access.value = AccessUiState(AccessStatus.WORKING)
        viewModelScope.launch {
            val url = AccessApi.urlFor(app.container.settings.settings.first().accessLink)
            val result = withContext(Dispatchers.IO) {
                runCatching { AccessApi.activate(url) }
            }
            result.fold(
                onSuccess = {
                    _access.value = AccessUiState(AccessStatus.OK, it)
                },
                onFailure = { error ->
                    _access.value = AccessUiState(
                        AccessStatus.FAIL,
                        error.message ?: "Не удалось активировать",
                    )
                },
            )
        }
    }

    fun createWarp(countryId: String, lte: Boolean) {
        if (_warp.value.generating) return
        _warp.value = WarpUiState(generating = true)
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) {
                runCatching { WarpGenerator.generateOne(countryId, lte) }
            }
            result.fold(
                onSuccess = { profile ->
                    opMutex.withLock {
                        val running = tunnel.value.status == ConnectionStatus.CONNECTED ||
                            tunnel.value.status == ConnectionStatus.CONNECTING
                        app.container.profiles.upsert(profile, makeActive = true)
                        if (running) {
                            runCatching { app.container.tunnel.disconnect() }
                            runCatching { app.container.tunnel.connectActive() }
                        }
                    }
                    _warp.value = WarpUiState(
                        message = "Создан ${profile.name}",
                        created = true,
                    )
                },
                onFailure = { error ->
                    _warp.value = WarpUiState(
                        error = error.message ?: "Не удалось создать WARP-конфиг",
                    )
                },
            )
        }
    }

    fun consumeWarpCreated() {
        if (_warp.value.created) {
            _warp.value = _warp.value.copy(created = false)
        }
    }

    fun pingServers() {
        if (_ping.value.runningIds.isNotEmpty()) return
        val snapshot = app.container.profiles.profiles
        if (snapshot.isEmpty()) return
        _ping.update { it.copy(runningIds = snapshot.map { profile -> profile.id }.toSet()) }
        viewModelScope.launch {
            val gate = Semaphore(4)
            coroutineScope {
                snapshot.map { profile ->
                    async(Dispatchers.IO) {
                        gate.withPermit {
                            val host = ServerPing.hostOf(ConfigParser.endpointOf(profile.rawConfig))
                            val ms = if (host == null) null else ServerPing.ping(host)
                            _ping.update { state ->
                                state.copy(
                                    runningIds = state.runningIds - profile.id,
                                    millis = state.millis + (profile.id to ms),
                                )
                            }
                        }
                    }
                }.awaitAll()
            }
        }
    }

    fun setUiVisible(visible: Boolean) = app.container.tunnel.setUiVisible(visible)

    fun prepareVpn(): Intent? = app.container.tunnel.prepareVpnIntent()

    fun batteryIntent(): Intent? = app.container.tunnel.requestBatteryExemption()

    fun toggle() {
        if (!toggleGate.compareAndSet(false, true)) return
        viewModelScope.launch {
            try {
                opMutex.withLock { app.container.tunnel.toggle() }
            } finally {
                delay(320)
                toggleGate.set(false)
            }
        }
    }

    fun connect() = viewModelScope.launch {
        opMutex.withLock { runCatching { app.container.tunnel.connectActive() } }
    }

    fun disconnect() = viewModelScope.launch {
        opMutex.withLock { runCatching { app.container.tunnel.disconnect() } }
    }

    fun selectProfile(id: String) {
        switchJob?.cancel()
        switchJob = viewModelScope.launch {
            opMutex.withLock {
                val running = tunnel.value.status == ConnectionStatus.CONNECTED ||
                    tunnel.value.status == ConnectionStatus.CONNECTING
                app.container.profiles.setActive(id)
                if (running) {
                    runCatching { app.container.tunnel.disconnect() }
                    runCatching { app.container.tunnel.connectActive() }
                }
            }
        }
    }

    fun deleteProfile(id: String) {
        viewModelScope.launch {
            opMutex.withLock {
                val wasActive = app.container.profiles.active?.id == id
                val connected = tunnel.value.status == ConnectionStatus.CONNECTED ||
                    tunnel.value.status == ConnectionStatus.CONNECTING
                app.container.profiles.delete(id)
                if (wasActive && connected) {
                    runCatching { app.container.tunnel.disconnect() }
                }
            }
        }
    }

    fun importText(name: String, raw: String): Result<VpnProfile> {
        val prepared = ConfigParser.withKeepaliveIfMissing(raw)
        val preview = ConfigParser.parse(prepared)
        if (!preview.canConnect) {
            return Result.failure(IllegalArgumentException(preview.issues.joinToString("\n")))
        }
        val profile = VpnProfile(
            id = UUID.randomUUID().toString(),
            name = name.ifBlank { ConfigParser.suggestName(prepared) },
            rawConfig = prepared,
        )
        app.container.profiles.upsert(profile, makeActive = true)
        return Result.success(profile)
    }

    suspend fun importUri(uri: Uri, fallbackName: String): Result<VpnProfile> = withContext(Dispatchers.IO) {
        runCatching {
            val text = app.contentResolver.openInputStream(uri)?.bufferedReader()?.use { it.readText() }
                ?: error("Не удалось прочитать файл")
            val name = fallbackName.substringBeforeLast('.').ifBlank { ConfigParser.suggestName(text) }
            importText(name, text).getOrThrow()
        }
    }

    fun importUriFromIntent(uri: Uri) {
        viewModelScope.launch { importUri(uri, uri.lastPathSegment ?: "imported") }
    }

    fun setAutoConnect(value: Boolean) = viewModelScope.launch {
        app.container.settings.setAutoConnect(value)
        val killSwitch = app.container.settings.settings.first().killSwitch
        app.container.tunnel.applyVpnPolicy(value, killSwitch)
    }

    fun setKillSwitch(value: Boolean) = viewModelScope.launch {
        app.container.settings.setKillSwitch(value)
        val auto = app.container.settings.settings.first().autoConnect
        app.container.tunnel.applyVpnPolicy(auto, value)
    }
    fun setRootBattery(value: Boolean) = viewModelScope.launch { app.container.settings.setRootBatteryGuard(value) }
    fun setAccessLink(value: Int) = viewModelScope.launch {
        app.container.settings.setAccessLink(value)
        _access.value = AccessUiState()
    }
}
