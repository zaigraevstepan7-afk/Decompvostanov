package com.nimbus.vpn.tunnel

import android.content.Context
import android.content.Intent
import android.net.VpnService
import android.os.Build
import android.os.PowerManager
import android.util.Log
import com.nimbus.vpn.data.ConfigParser
import com.nimbus.vpn.data.ProfileStore
import com.nimbus.vpn.data.SettingsRepository
import com.nimbus.vpn.data.VpnProfile
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import org.amnezia.awg.backend.Backend
import org.amnezia.awg.backend.GoBackend
import org.amnezia.awg.backend.NoopTunnelActionHandler
import org.amnezia.awg.backend.RootTunnelActionHandler
import org.amnezia.awg.backend.Tunnel
import org.amnezia.awg.config.Config
import org.amnezia.awg.util.RootShell
import java.io.BufferedReader
import java.io.StringReader
import kotlin.math.min

class TunnelController(
    private val context: Context,
    private val profiles: ProfileStore,
    private val settings: SettingsRepository,
) {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private val mutex = Mutex()
    private val rootShell = RootShell(context)
    private val rootPower = RootPowerManager(rootShell)

    private val backend: Backend by lazy {
        val handler = if (rootStatus.value.rooted) {
            RootTunnelActionHandler(rootShell)
        } else {
            NoopTunnelActionHandler()
        }
        GoBackend(context, handler)
    }

    private val _ui = MutableStateFlow(TunnelUiState())
    val ui: StateFlow<TunnelUiState> = _ui.asStateFlow()

    private val _rootStatus = MutableStateFlow(RootPowerManager.Status(false, false, false, false, "Проверка root…"))
    val rootStatus: StateFlow<RootPowerManager.Status> = _rootStatus.asStateFlow()

    private var statsJob: Job? = null
    private var reconnectJob: Job? = null
    private var connectedSince: Long? = null
    private var lastRx = 0L
    private var lastTx = 0L
    private var lastSampleAt = 0L
    private var appSettings = com.nimbus.vpn.data.AppSettings()
    private var uiVisible = false

    private val tunnel = NimbusTunnel { state ->
        scope.launch { onNativeState(state) }
    }

    init {
        scope.launch {
            settings.settings.collect { appSettings = it }
        }
        scope.launch {
            profiles.index.collect { index ->
                val active = index.profiles.firstOrNull { it.id == index.activeId } ?: index.profiles.firstOrNull()
                _ui.update {
                    it.copy(
                        profile = active,
                        profileCount = index.profiles.size,
                    )
                }
            }
        }
        scope.launch {
            val status = runCatching { rootPower.probe() }.getOrElse {
                RootPowerManager.Status(false, false, false, false, "Root недоступен")
            }
            _rootStatus.value = status
            _ui.update { it.copy(backendLabel = status.message) }
        }
    }

    fun setUiVisible(visible: Boolean) {
        uiVisible = visible
        if (visible && _ui.value.status == ConnectionStatus.CONNECTED) {
            startStatsLoop()
        }
    }

    fun prepareVpnIntent(): Intent? = VpnService.prepare(context)

    suspend fun toggle() {
        when (_ui.value.status) {
            ConnectionStatus.CONNECTED, ConnectionStatus.CONNECTING -> disconnect()
            else -> connectActive()
        }
    }

    suspend fun connectActive() {
        val profile = profiles.active
        if (profile == null) {
            _ui.update { it.copy(error = "Сначала импортируй .conf") }
            return
        }
        connect(profile)
    }

    suspend fun connect(profile: VpnProfile) = mutex.withLock {
        reconnectJob?.cancel()
        _ui.update {
            it.copy(
                status = ConnectionStatus.CONNECTING,
                error = null,
                profile = profile,
            )
        }
        NimbusKeepAliveService.start(context, "Подключение…")

        if (appSettings.rootBatteryGuard) {
            runCatching {
                rootPower.applyLowDrainKeepAlive(
                    packageName = context.packageName,
                    uid = android.os.Process.myUid(),
                    enableAlwaysOn = appSettings.autoConnect,
                    lockdown = appSettings.killSwitch,
                )
            }
        }

        val result = withContext(Dispatchers.IO) {
            runCatching {
                val prepared = ConfigParser.withKeepaliveIfMissing(profile.rawConfig)
                val preview = ConfigParser.parse(prepared)
                if (!preview.canConnect) {
                    error(preview.issues.joinToString("\n"))
                }
                val config = Config.parse(BufferedReader(StringReader(prepared)))
                backend.setState(tunnel, Tunnel.State.UP, config)
            }
        }

        result.onSuccess {
            connectedSince = System.currentTimeMillis()
            lastRx = 0
            lastTx = 0
            lastSampleAt = 0
            _ui.update {
                it.copy(
                    status = ConnectionStatus.CONNECTED,
                    error = null,
                    connectedSince = connectedSince,
                    backendLabel = _rootStatus.value.message,
                )
            }
            NimbusKeepAliveService.start(context, profile.name)
            startStatsLoop()
        }.onFailure { err ->
            Log.e(TAG, "Connect failed", err)
            connectedSince = null
            _ui.update {
                it.copy(
                    status = ConnectionStatus.ERROR,
                    error = humanError(err),
                )
            }
            NimbusKeepAliveService.stop(context)
            scheduleReconnect()
        }
    }

    suspend fun disconnect() = mutex.withLock {
        reconnectJob?.cancel()
        statsJob?.cancel()
        runCatching {
            withContext(Dispatchers.IO) {
                backend.setState(tunnel, Tunnel.State.DOWN, null)
            }
        }
        connectedSince = null
        _ui.update {
            it.copy(
                status = ConnectionStatus.DISCONNECTED,
                error = null,
                rxRate = 0,
                txRate = 0,
                rxTotal = 0,
                txTotal = 0,
                handshakeAgeMs = 0,
                connectedSince = null,
            )
        }
        NimbusKeepAliveService.stop(context)
    }

    private suspend fun onNativeState(state: Tunnel.State) {
        if (state == Tunnel.State.DOWN && _ui.value.status == ConnectionStatus.CONNECTED) {
            _ui.update { it.copy(status = ConnectionStatus.DISCONNECTED, connectedSince = null) }
            NimbusKeepAliveService.stop(context)
            scheduleReconnect()
        }
    }

    private fun startStatsLoop() {
        statsJob?.cancel()
        statsJob = scope.launch {
            while (isActive && _ui.value.status == ConnectionStatus.CONNECTED) {
                sampleStats()
                delay(if (uiVisible) 1_500L else 12_000L)
            }
        }
    }

    private suspend fun sampleStats() {
        val stats = runCatching {
            withContext(Dispatchers.IO) { backend.getStatistics(tunnel) }
        }.getOrNull() ?: return
        val now = System.currentTimeMillis()
        val rx = stats.totalRx()
        val tx = stats.totalTx()
        val dt = if (lastSampleAt == 0L) 1_500.0 else (now - lastSampleAt).coerceAtLeast(1).toDouble()
        val rxRate = ((rx - lastRx).coerceAtLeast(0) * 1000.0 / dt).toLong()
        val txRate = ((tx - lastTx).coerceAtLeast(0) * 1000.0 / dt).toLong()
        lastRx = rx
        lastTx = tx
        lastSampleAt = now
        val handshake = stats.peers().firstOrNull()?.let { stats.peer(it)?.latestHandshakeEpochMillis } ?: 0L
        _ui.update {
            it.copy(
                rxTotal = rx,
                txTotal = tx,
                rxRate = rxRate,
                txRate = txRate,
                handshakeAgeMs = if (handshake == 0L) 0L else now - handshake,
            )
        }
    }

    private fun scheduleReconnect() {
        if (!appSettings.autoConnect) return
        reconnectJob?.cancel()
        reconnectJob = scope.launch {
            var attempt = 0
            while (isActive) {
                attempt++
                val wait = min(30_000L, 1_500L * (1L shl (attempt - 1).coerceAtMost(4)))
                delay(wait)
                if (_ui.value.status == ConnectionStatus.CONNECTED) return@launch
                val profile = profiles.active ?: return@launch
                connect(profile)
                if (_ui.value.status == ConnectionStatus.CONNECTED) return@launch
            }
        }
    }

    fun requestBatteryExemption(): Intent? {
        val pm = context.getSystemService(Context.POWER_SERVICE) as PowerManager
        if (pm.isIgnoringBatteryOptimizations(context.packageName)) return null
        return Intent(android.provider.Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS).apply {
            data = android.net.Uri.parse("package:${context.packageName}")
        }
    }

    private fun humanError(err: Throwable): String {
        val raw = err.message ?: err.javaClass.simpleName
        return when {
            raw.contains("VPN_NOT_AUTHORIZED", true) -> "Нужно разрешение VPN"
            raw.contains("DNS_RESOLUTION", true) -> "Не удалось резолвить сервер"
            raw.contains("TUN_CREATION", true) -> "Не удалось создать туннель"
            raw.contains("GO_ACTIVATION", true) -> "AmneziaWG не поднялся — проверь конфиг"
            else -> raw.take(180)
        }
    }

    companion object {
        private const val TAG = "Nimbus/Tunnel"
    }
}

enum class ConnectionStatus { DISCONNECTED, CONNECTING, CONNECTED, ERROR }

data class TunnelUiState(
    val status: ConnectionStatus = ConnectionStatus.DISCONNECTED,
    val profile: VpnProfile? = null,
    val profileCount: Int = 0,
    val error: String? = null,
    val backendLabel: String = "",
    val connectedSince: Long? = null,
    val rxRate: Long = 0,
    val txRate: Long = 0,
    val rxTotal: Long = 0,
    val txTotal: Long = 0,
    val handshakeAgeMs: Long = 0,
)
