package com.nimbus.vpn.tunnel

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.content.pm.ServiceInfo
import android.net.VpnService
import android.os.Build
import android.os.ParcelFileDescriptor
import android.util.Log
import androidx.core.app.NotificationCompat
import com.nimbus.vpn.MainActivity
import com.nimbus.vpn.R
import com.nimbus.vpn.data.SecTunnelApi
import com.nimbus.vpn.data.SecTunnelProfile
import java.io.FileInputStream
import java.io.FileOutputStream
import java.net.Socket
import java.util.concurrent.atomic.AtomicBoolean

class SecTunnelService : VpnService() {
    private val stopped = AtomicBoolean(false)
    private val writeLock = Any()
    private var tun: ParcelFileDescriptor? = null
    private var tunOut: FileOutputStream? = null
    private var relay: TunRelay? = null
    private var worker: Thread? = null
    @Volatile private var activeToken = 0

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent?.action == ACTION_STOP) {
            shutdown()
            stopSelf(startId)
            return START_NOT_STICKY
        }
        val token = intent?.getIntExtra(EXTRA_TOKEN, 0) ?: 0
        if (!SecTunnelRuntime.isCurrent(token)) {
            stopSelf(startId)
            return START_NOT_STICKY
        }
        if (!promote()) {
            SecTunnelRuntime.fail(IllegalStateException("Не удалось показать уведомление VPN"))
            stopSelf(startId)
            return START_NOT_STICKY
        }
        activeToken = token
        stopped.set(false)
        if (worker != null) {
            shutdown()
            stopped.set(false)
        }
        val raw = intent?.getStringExtra(EXTRA_CONFIG).orEmpty()
        val bypass = intent?.getStringArrayListExtra(EXTRA_BYPASS).orEmpty()
        worker = Thread({
            var unexpected = false
            try {
                runTunnel(token, raw, bypass)
            } catch (error: Throwable) {
                Log.e(TAG, "sec-tunnel failed", error)
                if (SecTunnelRuntime.isCurrent(token)) SecTunnelRuntime.fail(error)
            } finally {
                unexpected = SecTunnelRuntime.active && SecTunnelRuntime.isCurrent(token)
                if (activeToken == token) shutdown()
                if (activeToken == token) {
                    SecTunnelRuntime.markStopped()
                    if (unexpected) SecTunnelRuntime.notifyDown()
                    stopSelf()
                }
            }
        }, "sec-tun")
        worker?.start()
        return START_STICKY
    }

    override fun onRevoke() {
        SecTunnelRuntime.abort = true
        shutdown()
        if (SecTunnelRuntime.active) SecTunnelRuntime.notifyDown()
        SecTunnelRuntime.markStopped()
        stopSelf()
    }

    override fun onDestroy() {
        shutdown()
        super.onDestroy()
    }

    private fun runTunnel(token: Int, raw: String, bypass: List<String>) {
        val spec = SecTunnelProfile.read(raw) ?: error("Это не профиль sec-tunnel")
        val exit = SecTunnelApi.lease(spec.region)
        if (!SecTunnelRuntime.isCurrent(token)) return
        val pfd = openTun(bypass)
        if (!SecTunnelRuntime.isCurrent(token)) {
            pfd.close()
            return
        }
        tun = pfd
        tunOut = FileOutputStream(pfd.fileDescriptor)
        val guard: (Socket) -> Boolean = { socket -> this@SecTunnelService.protect(socket) }
        val engine = TunRelay(
            dial = { host, port -> SecProxy.open(guard, exit, host, port) },
            dns = { query -> SecProxy.queryDns(guard, exit, query) },
            emit = { packet -> writeTun(packet) },
        )
        relay = engine
        SecTunnelRuntime.succeed()
        val input = FileInputStream(pfd.fileDescriptor)
        val buffer = ByteArray(32767)
        while (SecTunnelRuntime.isCurrent(token) && !stopped.get()) {
            val count = input.read(buffer)
            if (count < 0) break
            SecTunnelRuntime.addTx(count)
            engine.onPacket(buffer, count)
        }
    }

    private fun writeTun(packet: ByteArray) {
        synchronized(writeLock) {
            tunOut?.write(packet)
            SecTunnelRuntime.addRx(packet.size)
        }
    }

    private fun openTun(bypass: List<String>): ParcelFileDescriptor {
        val builder = Builder()
            .setSession("Bozya")
            .setMtu(1280)
            .setBlocking(true)
            .addAddress("10.77.0.2", 32)
            .addRoute("0.0.0.0", 0)
            .addDnsServer("1.1.1.1")
            .addDnsServer("1.0.0.1")
        if (Build.VERSION.SDK_INT >= 29) builder.setMetered(false)
        runCatching {
            builder.addAddress("fd00:b07a::2", 128)
            builder.addRoute("::", 0)
        }
        runCatching { builder.addDisallowedApplication(packageName) }
        bypass.forEach { packageName ->
            if (packageName == this.packageName) return@forEach
            runCatching { builder.addDisallowedApplication(packageName) }
        }
        return builder.establish() ?: error("Не удалось создать туннель")
    }

    private fun shutdown() {
        if (!stopped.compareAndSet(false, true)) {
            relay?.close()
            return
        }
        relay?.close()
        relay = null
        synchronized(writeLock) {
            runCatching { tunOut?.close() }
            tunOut = null
        }
        runCatching { tun?.close() }
        tun = null
    }

    private fun promote(): Boolean {
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
            2,
            Intent(this, MainActivity::class.java),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        val notification: Notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_bozya)
            .setContentTitle(getString(R.string.app_name))
            .setContentText("sec-tunnel")
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

    companion object {
        const val ACTION_STOP = "com.nimbus.vpn.SEC_STOP"
        const val ACTION_CONNECT = "com.nimbus.vpn.SEC_CONNECT"
        const val EXTRA_CONFIG = "config"
        const val EXTRA_BYPASS = "bypass"
        const val EXTRA_TOKEN = "token"
        private const val CHANNEL_ID = "bozya.keepalive"
        private const val NOTIF_ID = 18
        private const val TAG = "Bozya/SecTunnel"
    }
}
