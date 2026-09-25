package com.nimbus.vpn.tunnel

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.ServiceInfo
import android.net.VpnService
import android.os.Build
import android.os.ParcelFileDescriptor
import android.util.Log
import androidx.core.app.NotificationCompat
import com.nimbus.vpn.MainActivity
import com.nimbus.vpn.R
import go.Seq
import libv2ray.CoreCallbackHandler
import libv2ray.CoreController
import libv2ray.Libv2ray

/**
 * White-list servers are VLESS. This service owns the VPN interface and hands
 * the tun to Xray. The app itself stays outside the tunnel so the outbound
 * sockets do not loop back in.
 */
class WhitelistTunnelService : VpnService() {
    private val life = Any()
    private var tun: ParcelFileDescriptor? = null
    private var core: CoreController? = null
    private var worker: Thread? = null
    private var generation = 0
    private var activeTicket = 0

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent?.action == ACTION_STOP) {
            shutdown()
            WhitelistRuntime.markDown()
            stopSelf(startId)
            return START_NOT_STICKY
        }
        val json = intent?.getStringExtra(EXTRA_CONFIG).orEmpty()
        val label = intent?.getStringExtra(EXTRA_LABEL)?.takeIf { it.isNotBlank() } ?: "Белые списки"
        val bypass = intent?.getStringArrayListExtra(EXTRA_BYPASS).orEmpty()
        val ticket = intent?.getIntExtra(EXTRA_TICKET, 0) ?: 0
        if (!promote(label)) {
            WhitelistRuntime.fail(ticket, "Не удалось показать уведомление VPN")
            stopSelf(startId)
            return START_NOT_STICKY
        }
        if (json.isBlank()) {
            WhitelistRuntime.fail(ticket, "Пустой конфиг")
            stopSelf(startId)
            return START_NOT_STICKY
        }
        val token = synchronized(life) {
            generation += 1
            activeTicket = ticket
            generation
        }
        worker?.interrupt()
        val commandId = startId
        worker = Thread({
            val mine = synchronized(life) { generation == token }
            if (!mine) return@Thread
            try {
                releaseCore()
                val fd = openTun(label, bypass)
                prepareCore()
                val controller = Libv2ray.newCoreController(Callbacks())
                synchronized(life) {
                    if (generation != token) {
                        runCatching { fd.close() }
                        return@Thread
                    }
                    core = controller
                    tun = fd
                }
                controller.startLoop(json, fd.fd)
                val stale = synchronized(life) { generation != token }
                if (stale) {
                    runCatching { controller.stopLoop() }
                    runCatching { fd.close() }
                    return@Thread
                }
                if (!controller.isRunning) error("Ядро не запустилось")
                WhitelistRuntime.succeed(ticket)
                promote(label)
            } catch (error: Throwable) {
                Log.e(TAG, "whitelist start failed", error)
                if (synchronized(life) { generation == token }) {
                    shutdownLocked()
                    WhitelistRuntime.fail(ticket, error.message ?: "Не удалось подключиться")
                    stopSelf(commandId)
                }
            }
        }, "wl-tun")
        worker?.start()
        return START_NOT_STICKY
    }

    override fun onRevoke() {
        val ticket = synchronized(life) { activeTicket }
        shutdown()
        WhitelistRuntime.fail(ticket, "Разрешение VPN снято")
        WhitelistRuntime.markDown()
        stopSelf()
    }

    override fun onDestroy() {
        shutdown()
        WhitelistRuntime.markDown()
        super.onDestroy()
    }

    private fun openTun(label: String, bypass: List<String>): ParcelFileDescriptor {
        val builder = Builder()
            .setSession(label)
            .setMtu(1500)
            .addAddress("10.0.0.2", 30)
            .addRoute("0.0.0.0", 0)
            .addDnsServer("1.1.1.1")
            .addDnsServer("8.8.8.8")
        if (Build.VERSION.SDK_INT >= 29) builder.setMetered(false)
        runCatching {
            builder.addAddress("fd00:1::2", 126)
            builder.addRoute("::", 0)
        }
        val excluded = LinkedHashSet<String>()
        excluded += packageName
        bypass.forEach { name -> if (name.isNotBlank()) excluded += name }
        excluded.forEach { name ->
            runCatching { builder.addDisallowedApplication(name) }
        }
        return builder.establish() ?: error("Не удалось создать туннель")
    }

    private fun shutdown() {
        synchronized(life) {
            generation += 1
            shutdownLocked()
        }
    }

    private fun releaseCore() {
        val controller = core
        core = null
        runCatching { controller?.stopLoop() }
        runCatching { tun?.close() }
        tun = null
    }

    private fun shutdownLocked() {
        releaseCore()
        runCatching { stopForeground(STOP_FOREGROUND_REMOVE) }
    }

    private fun promote(label: String): Boolean {
        val manager = getSystemService(NotificationManager::class.java)
        val channel = NotificationChannel(
            CHANNEL_ID,
            getString(R.string.notification_channel),
            NotificationManager.IMPORTANCE_LOW,
        ).apply {
            setShowBadge(false)
            enableVibration(false)
            setSound(null, null)
        }
        manager?.createNotificationChannel(channel)
        val open = PendingIntent.getActivity(
            this,
            4,
            Intent(this, MainActivity::class.java),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        val notification: Notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_bozya)
            .setContentTitle(getString(R.string.app_name))
            .setContentText(label)
            .setContentIntent(open)
            .setOngoing(true)
            .setSilent(true)
            .setOnlyAlertOnce(true)
            .setCategory(NotificationCompat.CATEGORY_SERVICE)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .build()
        return try {
            if (Build.VERSION.SDK_INT >= 34) {
                startForeground(NOTIF_ID, notification, ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE)
            } else {
                startForeground(NOTIF_ID, notification)
            }
            true
        } catch (error: Throwable) {
            Log.e(TAG, "startForeground failed", error)
            false
        }
    }

    private class Callbacks : CoreCallbackHandler {
        override fun startup(): Long = 0
        override fun shutdown(): Long = 0
        override fun onEmitStatus(p0: Long, p1: String?): Long = 0
    }

    companion object {
        const val ACTION_STOP = "com.nimbus.vpn.WL_STOP"
        const val EXTRA_CONFIG = "config"
        const val EXTRA_LABEL = "label"
        const val EXTRA_BYPASS = "bypass"
        const val EXTRA_TICKET = "ticket"
        private const val CHANNEL_ID = "bozya.keepalive"
        private const val NOTIF_ID = 19
        private const val TAG = "Bozya/Whitelist"
        private val coreReady = java.util.concurrent.atomic.AtomicBoolean(false)

        fun stop(context: Context) {
            runCatching {
                context.startService(
                    Intent(context, WhitelistTunnelService::class.java).setAction(ACTION_STOP),
                )
            }
        }
    }

    private fun prepareCore() {
        Seq.setContext(applicationContext)
        if (!coreReady.compareAndSet(false, true)) return
        Libv2ray.initCoreEnv(filesDir.absolutePath, "")
    }
}
