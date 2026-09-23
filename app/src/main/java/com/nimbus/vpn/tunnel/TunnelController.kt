package com.nimbus.vpn.tunnel

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.VpnService
import android.os.Build
import android.os.PowerManager
import android.util.Log
import com.nimbus.vpn.data.ConfigParser
import com.nimbus.vpn.data.ProfileStore
import com.nimbus.vpn.data.SecTunnelProfile
import com.nimbus.vpn.data.SettingsRepository
import com.nimbus.vpn.data.SplitTunnel
import com.nimbus.vpn.data.VpnProfile
import com.nimbus.vpn.CrashLog
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import org.amnezia.awg.backend.Backend
import org.amnezia.awg.backend.GoBackend
import org.amnezia.awg.backend.NoopTunnelActionHandler
import org.amnezia.awg.backend.RootTunnelActionHandler
import org.amnezia.awg.backend.Tunnel
import org.amnezia.awg.config.Config
import org.amnezia.awg.util.RootShell
import com.nimbus.vpn.data.SecAccountStore
import com.nimbus.vpn.data.SecExit
import com.nimbus.vpn.data.SecExitOrder
import com.nimbus.vpn.data.SecTunnelApi
import java.io.BufferedReader
import java.io.StringReader
import java.util.concurrent.ExecutionException
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.TimeoutException
import kotlin.math.min

class TunnelController(
    private val context: Context,
    private val profiles: ProfileStore,
    private val settings: SettingsRepository,
    private val accounts: SecAccountStore = SecAccountStore(context),
) {
    private val scope = CoroutineScope(
        SupervisorJob() + Dispatchers.Default + CoroutineExceptionHandler { _, error ->
            Log.e(TAG, "Tunnel coroutine failed", error)
            CrashLog.write(context, Thread.currentThread(), error)
        },
    )
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
    @Volatile private var userStopped = false
    @Volatile private var stateToken = 0
    private var connectedSince: Long? = null
    private var lastRx = 0L
    private var lastTx = 0L
    private var lastSampleAt = 0L
    private var appSettings = com.nimbus.vpn.data.AppSettings()
    private var uiVisible = false
    private var activeEngine = Engine.NONE
    private var awgRunning = false
    private var connectToken = 0
    private var quietRotated = false
    private var pinnedExit = false
    private var secRegion: String? = null
    private var lastExits: List<SecExit> = emptyList()
    private var lastReviveAt = 0L

    private val tunnel = BozyaTunnel { state ->
        val token = stateToken
        scope.launch {
            if (token != stateToken) return@launch
            onNativeState(state)
        }
    }

    init {
        SecTunnelRuntime.accounts = accounts
        scope.launch {
            settings.settings.collect { appSettings = it }
        }
        SecTunnelRuntime.onUnexpectedDown = {
            scope.launch {
                if (userStopped || activeEngine != Engine.SEC) return@launch
                if (_ui.value.status != ConnectionStatus.CONNECTED) return@launch
                activeEngine = Engine.NONE
                connectedSince = null
                _ui.update {
                    it.copy(
                        status = ConnectionStatus.DISCONNECTED,
                        connectedSince = null,
                        exitPlace = null,
                        exitIp = null,
                        fallbackId = null,
                        fallbackName = null,
                        rxRate = 0,
                        txRate = 0,
                    )
                }
                BozyaKeepAliveService.stop(context)
                scheduleReconnect()
            }
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

    fun applyVpnPolicy(autoConnect: Boolean, killSwitch: Boolean) {
        scope.launch {
            if (!_rootStatus.value.rooted) return@launch
            runCatching {
                if (autoConnect || killSwitch) {
                    rootPower.setAlwaysOn(context.packageName, lockdown = killSwitch)
                } else {
                    rootPower.clearAlwaysOn()
                }
            }.onFailure { Log.w(TAG, "VPN policy update failed", it) }
        }
    }

    suspend fun connect(profile: VpnProfile, userInitiated: Boolean = true) = mutex.withLock {
        if (userInitiated) {
            userStopped = false
            reconnectJob?.cancel()
        } else if (userStopped) {
            return@withLock
        }
        quietRotated = false
        pinnedExit = false
        SecTunnelRuntime.publishedIp = null
        _ui.update {
            it.copy(
                status = ConnectionStatus.CONNECTING,
                error = null,
                profile = profile,
                exitPlace = null,
                exitIp = null,
                fallbackId = null,
                fallbackName = null,
            )
        }
        BozyaKeepAliveService.start(context, "Подключение…")

        val fresh = settings.settings.first()
        if (fresh.rootBatteryGuard) {
            runCatching {
                rootPower.applyLowDrainKeepAlive(
                    packageName = context.packageName,
                    uid = android.os.Process.myUid(),
                    enableAlwaysOn = fresh.autoConnect || fresh.killSwitch,
                    lockdown = fresh.killSwitch,
                )
            }
        }

        if (SecTunnelProfile.isSec(profile.rawConfig)) {
            connectSec(profile, fresh, userInitiated)
            return@withLock
        }
        activeEngine = Engine.AWG
        SecTunnelRuntime.requestStop(context)

        val gate = backendOnMain()
        val result = withContext(Dispatchers.IO) {
            runCatching {
                if (userStopped && !userInitiated) error("Остановлено")
                val prepared = ConfigParser.withKeepaliveIfMissing(profile.rawConfig)
                val preview = ConfigParser.parse(prepared)
                if (!preview.canConnect) {
                    error(preview.issues.joinToString("\n"))
                }
                val routed = SplitTunnel.apply(prepared, fresh.bypassPackages, ::isInstalledPackage)
                val config = Config.parse(BufferedReader(StringReader(routed)))
                stateToken++
                gate.setState(tunnel, Tunnel.State.UP, config)
            }
        }

        if (userStopped && !userInitiated) {
            runCatching {
                withContext(Dispatchers.IO) {
                    stateToken++
                    gate.setState(tunnel, Tunnel.State.DOWN, null)
                }
            }
            return@withLock
        }

        result.onSuccess {
            awgRunning = true
            activeEngine = Engine.AWG
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
            BozyaKeepAliveService.start(context, profile.name)
            startStatsLoop()
        }.onFailure { err ->
            Log.e(TAG, "Connect failed", err)
            awgRunning = false
            if (activeEngine == Engine.AWG) activeEngine = Engine.NONE
            connectedSince = null
            _ui.update {
                it.copy(
                    status = ConnectionStatus.ERROR,
                    error = humanError(err),
                    exitPlace = null,
                    exitIp = null,
                    fallbackId = null,
                    fallbackName = null,
                )
            }
            BozyaKeepAliveService.stop(context)
            if (userInitiated) scheduleReconnect()
        }
    }

    suspend fun disconnect() {
        userStopped = true
        reconnectJob?.cancel()
        connectToken = 0
        SecTunnelRuntime.requestStop(context)
        mutex.withLock {
        activeEngine = Engine.NONE
        statsJob?.cancel()
        downAwg()
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
                exitPlace = null,
                exitIp = null,
                fallbackId = null,
                fallbackName = null,
            )
        }
        BozyaKeepAliveService.stop(context)
        }
    }

    private suspend fun backendOnMain(): Backend = withContext(Dispatchers.Main.immediate) { backend }

    private suspend fun onNativeState(state: Tunnel.State) {
        if (userStopped || activeEngine != Engine.AWG) return
        if (state == Tunnel.State.DOWN && _ui.value.status == ConnectionStatus.CONNECTED) {
            _ui.update { it.copy(status = ConnectionStatus.DISCONNECTED, connectedSince = null) }
            BozyaKeepAliveService.stop(context)
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
        if (activeEngine == Engine.SEC) {
            val now = System.currentTimeMillis()
            val rx = SecTunnelRuntime.rx.get()
            val tx = SecTunnelRuntime.tx.get()
            val dt = if (lastSampleAt == 0L) 1_500.0 else (now - lastSampleAt).coerceAtLeast(1).toDouble()
            val rxRate = ((rx - lastRx).coerceAtLeast(0) * 1000.0 / dt).toLong()
            val txRate = ((tx - lastTx).coerceAtLeast(0) * 1000.0 / dt).toLong()
            lastRx = rx
            lastTx = tx
            lastSampleAt = now
            val since = connectedSince
            if (!quietRotated && since != null && now - since > 8_000 && rx < 400) {
                quietRotated = true
                SecTunnelRuntime.requestRotate()
            }
            val ip = SecTunnelRuntime.publishedIp
            if (!pinnedExit && rx > 2_000 && ip != null && secRegion != null) {
                pinnedExit = true
                accounts.rememberIp(secRegion!!, ip)
            }
            val previousIp = _ui.value.exitIp
            _ui.update {
                it.copy(
                    rxTotal = rx,
                    txTotal = tx,
                    rxRate = rxRate,
                    txRate = txRate,
                    handshakeAgeMs = 0,
                    exitIp = ip ?: it.exitIp,
                )
            }
            if (ip != null && ip != previousIp) publishExit(ip)
            return
        }
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
        val age = if (handshake == 0L) 0L else now - handshake
        _ui.update {
            it.copy(
                rxTotal = rx,
                txTotal = tx,
                rxRate = rxRate,
                txRate = txRate,
                handshakeAgeMs = age,
            )
        }
        if (age > 90_000 && now - lastReviveAt > 180_000) {
            lastReviveAt = now
            val profile = _ui.value.profile ?: return
            scope.launch { runCatching { connect(profile, userInitiated = false) } }
        }
    }

    fun rotateExit() {
        quietRotated = true
        pinnedExit = false
        SecTunnelRuntime.requestRotate()
    }

    private fun publishExit(ip: String) {
        val exit = lastExits.firstOrNull { it.ip == ip } ?: return
        val tokenNow = connectToken
        scope.launch(Dispatchers.IO) {
            val place = runCatching { SecProxy.locate(exit) }.getOrNull() ?: return@launch
            if (connectToken != tokenNow || _ui.value.status != ConnectionStatus.CONNECTED) return@launch
            if (SecTunnelRuntime.publishedIp != ip && _ui.value.exitIp != ip) return@launch
            showExit(place, ip)
        }
    }

    private fun showExit(place: String, ip: String) {
        _ui.update { it.copy(exitPlace = place, exitIp = ip) }
        BozyaKeepAliveService.start(context, place)
        runCatching {
            context.startService(
                Intent(context, SecTunnelService::class.java)
                    .setAction(SecTunnelService.ACTION_LABEL)
                    .putExtra(SecTunnelService.EXTRA_LABEL, place),
            )
        }
    }

    private fun scheduleReconnect() {
        if (!appSettings.autoConnect || userStopped) return
        reconnectJob?.cancel()
        reconnectJob = scope.launch {
            var attempt = 0
            while (isActive && !userStopped) {
                attempt++
                val shift = (attempt - 1).coerceAtMost(4)
                val wait = min(30_000L, 1_500L * (1L shl shift))
                delay(wait)
                if (userStopped || _ui.value.status == ConnectionStatus.CONNECTED) return@launch
                val profile = profiles.active ?: return@launch
                connect(profile, userInitiated = false)
                if (userStopped || _ui.value.status == ConnectionStatus.CONNECTED) return@launch
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

    private suspend fun connectSec(
        profile: VpnProfile,
        fresh: com.nimbus.vpn.data.AppSettings,
        userInitiated: Boolean,
    ) {
        activeEngine = Engine.SEC
        downAwg()
        val spec = SecTunnelProfile.read(profile.rawConfig)
        secRegion = spec?.region
        if (spec == null) {
            activeEngine = Engine.NONE
            failConnect(IllegalStateException("Это не профиль sec-tunnel"), userInitiated)
            return
        }
        val exits = try {
            withContext(Dispatchers.IO) { fetchExits(spec.region) }
        } catch (error: Throwable) {
            activeEngine = Engine.NONE
            failConnect(unwrap(error), userInitiated)
            return
        }
        if (userStopped) {
            activeEngine = Engine.NONE
            return
        }
        lastExits = exits
        val token = SecTunnelRuntime.arm()
        connectToken = token
        SecTunnelRuntime.stage(token, exits)
        val bypass = ArrayList(fresh.bypassPackages.filter(::isInstalledPackage))
        val intent = Intent(context, SecTunnelService::class.java).apply {
            action = SecTunnelService.ACTION_CONNECT
            putExtra(SecTunnelService.EXTRA_CONFIG, profile.rawConfig)
            putExtra(SecTunnelService.EXTRA_TOKEN, token)
            putStringArrayListExtra(SecTunnelService.EXTRA_BYPASS, bypass)
            putExtra(SecTunnelService.EXTRA_LABEL, spec.place)
        }
        val started = runCatching {
            if (Build.VERSION.SDK_INT >= 26) context.startForegroundService(intent)
            else context.startService(intent)
        }
        val pending = SecTunnelRuntime.awaitHandle()
        if (started.isFailure || pending == null) {
            connectToken = 0
            activeEngine = Engine.NONE
            SecTunnelRuntime.requestStop(context)
            failConnect(
                started.exceptionOrNull() ?: IllegalStateException("sec-tunnel не запустился"),
                userInitiated,
            )
            return
        }
        val outcome = withContext(Dispatchers.IO) {
            withTimeoutOrNull(20_000) { pending.await() }
        }
        if (connectToken != token || userStopped) return
        if (outcome != null && outcome.isSuccess) {
            connectedSince = System.currentTimeMillis()
            lastRx = 0
            lastTx = 0
            lastSampleAt = 0
            activeEngine = Engine.SEC
            _ui.update {
                it.copy(
                    status = ConnectionStatus.CONNECTED,
                    error = null,
                    connectedSince = connectedSince,
                    backendLabel = "sec-tunnel",
                )
            }
            BozyaKeepAliveService.start(context, profile.name)
            startStatsLoop()
            val watched = exits.first()
            _ui.update { it.copy(exitIp = watched.ip) }
            val tokenNow = token
            scope.launch(Dispatchers.IO) {
                val place = runCatching { SecProxy.locate(watched) }.getOrNull() ?: return@launch
                if (connectToken != tokenNow || _ui.value.status != ConnectionStatus.CONNECTED) return@launch
                showExit(place, watched.ip)
            }
        } else {
            connectToken = 0
            activeEngine = Engine.NONE
            SecTunnelRuntime.requestStop(context)
            val error = outcome?.exceptionOrNull() ?: IllegalStateException("Таймаут sec-tunnel")
            failConnect(unwrap(error), userInitiated)
        }
    }

    private fun fetchExits(region: String): List<SecExit> {
        val pool = Executors.newSingleThreadExecutor()
        return try {
            val future = pool.submit<List<SecExit>> { loadExits(region) }
            try {
                future.get(30, TimeUnit.SECONDS)
            } catch (timeout: TimeoutException) {
                future.cancel(true)
                throw IllegalStateException("Таймаут sec-tunnel")
            }
        } finally {
            pool.shutdownNow()
        }
    }

    private fun loadExits(region: String): List<SecExit> {
        val saved = accounts.load()
        if (saved != null) {
            try {
                val exits = SecTunnelApi.reuse(region, saved)
                if (exits.isEmpty()) error(if (region.equals("AUTO", true)) "Сейчас нет свободных выходов" else "Для региона сейчас нет выхода")
                SecTunnelRuntime.account = saved
                return SecExitOrder.prefer(SecProxy.preferAlive(exits), accounts.lastIp(region))
            } catch (error: Throwable) {
                val message = error.message.orEmpty()
                if (message.startsWith("Для ") || message.startsWith("Сейчас нет")) throw error
                accounts.clear()
                SecTunnelRuntime.account = null
            }
        }
        val lease = SecTunnelApi.registerLease(region)
        accounts.save(lease.account)
        SecTunnelRuntime.account = lease.account
        return SecExitOrder.prefer(SecProxy.preferAlive(lease.exits), accounts.lastIp(region))
    }

    private fun unwrap(error: Throwable): Throwable {
        var current = error
        while (current is ExecutionException && current.cause != null) current = current.cause!!
        return current
    }

    private suspend fun downAwg() {
        if (!awgRunning) return
        val gate = runCatching { backendOnMain() }.getOrNull()
        runCatching {
            withContext(Dispatchers.IO) {
                stateToken++
                gate?.setState(tunnel, Tunnel.State.DOWN, null)
            }
        }
        awgRunning = false
    }

    private fun failConnect(err: Throwable, userInitiated: Boolean) {
        if (userStopped) return
        Log.e(TAG, "Connect failed", err)
        connectedSince = null
        val failed = _ui.value.profile
        val warp = if (failed != null && SecTunnelProfile.isSec(failed.rawConfig)) {
            profiles.profiles.firstOrNull { !SecTunnelProfile.isSec(it.rawConfig) }
        } else {
            null
        }
        _ui.update {
            it.copy(
                status = ConnectionStatus.ERROR,
                error = humanError(err),
                exitPlace = null,
                exitIp = null,
                fallbackId = warp?.id,
                fallbackName = warp?.name,
            )
        }
        BozyaKeepAliveService.stop(context)
        if (userInitiated) scheduleReconnect()
    }

    private fun isInstalledPackage(packageName: String): Boolean {
        if (packageName == context.packageName) return false
        return runCatching {
            if (Build.VERSION.SDK_INT >= 33) {
                context.packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0))
            } else {
                @Suppress("DEPRECATION")
                context.packageManager.getPackageInfo(packageName, 0)
            }
        }.isSuccess
    }

    private fun humanError(err: Throwable): String {
        val raw = err.message ?: err.javaClass.simpleName
        return when {
            raw.contains("VPN_NOT_AUTHORIZED", true) -> "Нужно разрешение VPN"
            raw.contains("DNS_RESOLUTION", true) -> "Не удалось резолвить сервер"
            raw.contains("TUN_CREATION", true) -> "Не удалось создать туннель"
            raw.contains("GO_ACTIVATION", true) -> "AmneziaWG не поднялся — проверь конфиг"
            raw.contains("timed out", true) -> "Сервер sec-tunnel не ответил"
            raw.contains("No Available Proxies", true) -> "Для этого региона сейчас нет выхода"
            else -> raw.take(180)
        }
    }

    private enum class Engine { NONE, AWG, SEC }

    companion object {
        private const val TAG = "Bozya/Tunnel"
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
    val exitPlace: String? = null,
    val exitIp: String? = null,
    val fallbackId: String? = null,
    val fallbackName: String? = null,
)
