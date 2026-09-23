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
import com.nimbus.vpn.data.DayStreak
import com.nimbus.vpn.data.ProfileBundle
import com.nimbus.vpn.data.SecTunnelApi
import com.nimbus.vpn.data.SecTunnelProfile
import com.nimbus.vpn.data.ServerPing
import com.nimbus.vpn.data.VpnProfile
import com.nimbus.vpn.data.WarpGenerator
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.coach.CoachStep
import java.time.LocalDate
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
    private val _joy = MutableStateFlow(0)
    val joy: StateFlow<Int> = _joy.asStateFlow()
    private val opMutex = Mutex()
    private val toggleGate = AtomicBoolean(false)
    private var switchJob: Job? = null

    fun activateAccess() {
        if (_access.value.status == AccessStatus.WORKING) return
        noteAccessPressed()
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

    fun createServer(engine: String, id: String, lte: Boolean) {
        if (_warp.value.generating) return
        _warp.value = WarpUiState(generating = true)
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) {
                runCatching {
                    if (engine == "sec") SecTunnelProfile.create(id)
                    else WarpGenerator.generateOne(id, lte)
                }
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
                        error = error.message ?: "Не удалось создать сервер",
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
                            val host = if (SecTunnelProfile.isSec(profile.rawConfig)) {
                                SecTunnelProfile.read(profile.rawConfig)?.region?.let { region ->
                                    runCatching { SecTunnelApi.lease(region).ip }.getOrNull()
                                }
                            } else {
                                ServerPing.hostOf(ConfigParser.endpointOf(profile.rawConfig))
                            }
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

    fun rotateExit() {
        app.container.tunnel.rotateExit()
    }

    fun prepareFallback(): Boolean {
        val id = tunnel.value.fallbackId ?: return false
        if (app.container.profiles.profiles.none { it.id == id }) return false
        app.container.profiles.setActive(id)
        return true
    }

    fun exportServers(): String = ProfileBundle.export(app.container.profiles.index.value)

    fun importText(name: String, raw: String): Result<VpnProfile> {
        val bundle = ProfileBundle.parse(raw)
        if (bundle != null) {
            val current = app.container.profiles.index.value
            val bare = current.profiles.all { it.id == "sec:AUTO" }
            val active = if (bare) bundle.activeId ?: bundle.profiles.first().id else current.activeId
            app.container.profiles.upsertAll(bundle.profiles, activeId = active)
            return Result.success(bundle.profiles.first())
        }
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
    fun setMarble(value: Boolean) = viewModelScope.launch { app.container.settings.setMarble(value) }
    fun setAccessLink(value: Int) = viewModelScope.launch {
        app.container.settings.setAccessLink(value)
        _access.value = AccessUiState()
    }

    fun setBypassPackages(packages: Set<String>) = viewModelScope.launch {
        app.container.settings.setBypassPackages(packages)
    }

    fun reconnectForBypass() = viewModelScope.launch {
        opMutex.withLock {
            val status = tunnel.value.status
            if (status != ConnectionStatus.CONNECTED && status != ConnectionStatus.CONNECTING) return@withLock
            runCatching { app.container.tunnel.disconnect() }
            runCatching { app.container.tunnel.connectActive() }
        }
    }

    fun coachYes() {
        advanceCoach(CoachStep.ABOUT)
    }

    fun onCoachAboutNext(hasProfiles: Boolean, connected: Boolean) {
        viewModelScope.launch {
            val current = CoachStep.from(app.container.settings.settings.first().coachStep)
            if (current != CoachStep.ABOUT) return@launch
            val target = when {
                connected -> CoachStep.CELEBRATE
                hasProfiles -> CoachStep.ACCESS
                else -> CoachStep.CREATE
            }
            app.container.settings.setCoachStep(target.id)
        }
    }

    fun onCoachAddTapped() = advanceCoach(CoachStep.PICK)

    fun onCoachWarpCreated() {
        viewModelScope.launch {
            val settings = app.container.settings.settings.first()
            val current = CoachStep.from(settings.coachStep)
            val next = current.afterServerCreated(settings.heardAccess)
            if (next != current) app.container.settings.setCoachStep(next.id)
        }
    }

    private fun noteAccessPressed() {
        viewModelScope.launch {
            app.container.settings.setHeardAccess(true)
            val current = CoachStep.from(app.container.settings.settings.first().coachStep)
            if (current == CoachStep.ACCESS) {
                app.container.settings.setCoachStep(CoachStep.CONNECT.id)
            }
        }
    }

    fun onCoachCelebrateNext() = advanceCoach(CoachStep.SETTINGS)

    fun onEnterSettings() {
        viewModelScope.launch {
            val current = CoachStep.from(app.container.settings.settings.first().coachStep)
            if (current == CoachStep.SETTINGS || current == CoachStep.CELEBRATE) {
                app.container.settings.setCoachStep(CoachStep.TOUR_AUTO.id)
            }
        }
    }

    fun onCoachTourNext(step: CoachStep) = advanceCoach(step.nextTour())

    fun moveDog(x: Float, y: Float) = viewModelScope.launch {
        app.container.settings.setDogAnchor(x.coerceIn(0f, 0.92f), y.coerceIn(0f, 0.92f))
    }

    init {
        viewModelScope.launch {
            var seen = false
            var wasConnected = false
            tunnel.collect { state ->
                val connected = state.status == ConnectionStatus.CONNECTED
                if (!seen) {
                    seen = true
                    wasConnected = connected
                    if (connected) {
                        recordStreak()
                        app.container.settings.setHeardAccess(true)
                    }
                    return@collect
                }
                if (connected && !wasConnected) {
                    recordStreak()
                    _joy.update { it + 1 }
                    val saved = app.container.settings.settings.first()
                    val step = CoachStep.from(saved.coachStep)
                    val next = if (
                        saved.heardAccess &&
                        (step == CoachStep.CELEBRATE || step == CoachStep.ACCESS || step == CoachStep.SETTINGS)
                    ) {
                        CoachStep.DONE
                    } else {
                        step.afterTunnelUp()
                    }
                    if (next != step) app.container.settings.setCoachStep(next.id)
                    app.container.settings.setHeardAccess(true)
                }
                wasConnected = connected
            }
        }
    }

    private fun advanceCoach(target: CoachStep, onlyFrom: CoachStep? = null) {
        viewModelScope.launch {
            val current = CoachStep.from(app.container.settings.settings.first().coachStep)
            if (onlyFrom != null && current != onlyFrom) return@launch
            if (target.id > current.id) {
                app.container.settings.setCoachStep(target.id)
            }
        }
    }

    private suspend fun recordStreak() {
        val today = LocalDate.now().toEpochDay()
        val current = app.container.settings.settings.first()
        val streak = DayStreak.next(current.streak, current.streakDay, today)
        if (streak != current.streak || current.streakDay != today) {
            app.container.settings.setStreak(streak, today)
        }
    }
}
