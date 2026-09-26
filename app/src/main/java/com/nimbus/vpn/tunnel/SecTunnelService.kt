package com.nimbus.vpn.tunnel

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.content.pm.ServiceInfo
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.VpnService
import android.os.Build
import android.os.ParcelFileDescriptor
import android.util.Log
import androidx.core.app.NotificationCompat
import com.nimbus.vpn.MainActivity
import com.nimbus.vpn.R
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
    private val life = Any()

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent?.action == ACTION_LABEL) {
            val label = intent.getStringExtra(EXTRA_LABEL)?.takeIf { it.isNotBlank() } ?: return START_NOT_STICKY
            if (worker != null) {
                getSystemService(NotificationManager::class.java)?.notify(NOTIF_ID, notification(label))
            }
            return START_NOT_STICKY
        }
        if (intent?.action == ACTION_STOP) {
            val epoch = intent.getIntExtra(EXTRA_EPOCH, 0)
            val mine = synchronized(life) {
                if (!SecTunnelRuntime.shouldHonorStop(epoch)) {
                    false
                } else {
                    activeToken = 0
                    shutdown()
                    true
                }
            }
            if (mine) stopSelf(startId)
            return START_NOT_STICKY
        }
        val token = intent?.getIntExtra(EXTRA_TOKEN, 0) ?: 0
        if (!SecTunnelRuntime.isCurrent(token)) {
            if (activeToken == 0) stopSelf(startId)
            return START_NOT_STICKY
        }
        val label = intent?.getStringExtra(EXTRA_LABEL)?.takeIf { it.isNotBlank() } ?: "sec-tunnel"
        if (!promote(label)) {
            SecTunnelRuntime.fail(token, IllegalStateException("Не удалось показать уведомление VPN"))
            if (activeToken == 0) stopSelf(startId)
            return START_NOT_STICKY
        }
        val raw = intent?.getStringExtra(EXTRA_CONFIG).orEmpty()
        val bypass = intent?.getStringArrayListExtra(EXTRA_BYPASS).orEmpty()
        synchronized(life) {
            activeToken = token
            shutdown()
            stopped.set(false)
        }
        val commandId = startId
        worker = Thread({
            var running = false
            try {
                runTunnel(token, raw, bypass)
                running = SecTunnelRuntime.active && SecTunnelRuntime.isCurrent(token)
            } catch (error: Throwable) {
                running = SecTunnelRuntime.active && SecTunnelRuntime.isCurrent(token)
                Log.e(TAG, "sec-tunnel failed", error)
                SecTunnelRuntime.fail(token, error)
            } finally {
                val stopThis = synchronized(life) {
                    if (activeToken != token) {
                        false
                    } else {
                        shutdown()
                        true
                    }
                }
                if (stopThis) {
                    if (!SecTunnelRuntime.active) {
                        SecTunnelRuntime.fail(token, IllegalStateException("sec-tunnel остановился"))
                    }
                    if (running && SecTunnelRuntime.isCurrent(token)) {
                        SecTunnelRuntime.markStopped()
                        SecTunnelRuntime.notifyDown()
                    }
                    stopSelf(commandId)
                }
            }
        }, "sec-tun")
        worker?.start()
        return START_NOT_STICKY
    }

    override fun onRevoke() {
        SecTunnelRuntime.abort = true
        val wasActive = synchronized(life) {
            activeToken = 0
            shutdown()
            SecTunnelRuntime.active
        }
        if (wasActive) SecTunnelRuntime.notifyDown()
        SecTunnelRuntime.markStopped()
        stopSelf()
    }

    override fun onDestroy() {
        synchronized(life) {
            activeToken = 0
            shutdown()
        }
        super.onDestroy()
    }

    private fun runTunnel(token: Int, raw: String, bypass: List<String>) {
        val spec = SecTunnelProfile.read(raw) ?: error("Это не профиль sec-tunnel")
        val exits = SecTunnelRuntime.takeExits(token)?.takeIf { it.isNotEmpty() }
            ?: error("Нет выхода sec-tunnel")
        if (!SecTunnelRuntime.isCurrent(token)) return
        val outside = pickNetwork()
        val pfd = openTunWhenFree(bypass, token)
        if (!SecTunnelRuntime.isCurrent(token)) {
            pfd.close()
            return
        }
        tun = pfd
        if (outside != null) runCatching { setUnderlyingNetworks(arrayOf(outside)) }
        tunOut = FileOutputStream(pfd.fileDescriptor)
        val guard: (Socket) -> Boolean = { socket ->
            if (outside != null) runCatching { outside.bindSocket(socket) }
            this@SecTunnelService.protect(socket)
        }
        val roster = SecRoster(exits, spec.region)
        val engine = TunRelay(
            dial = { host, port -> roster.open(guard, host, port) },
            dns = { query -> roster.queryDns(guard, query) },
            emit = { packet -> writeTun(packet) },
            onBroken = { roster.noteFailure(roster.peek()) },
        )
        SecTunnelRuntime.onRotate = {
            roster.noteFailure(roster.peek())
            engine.dropUnanswered()
        }
        relay = engine
        SecTunnelRuntime.succeed(token)
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

    private fun openTunWhenFree(bypass: List<String>, token: Int): ParcelFileDescriptor {
        try {
            return openTun(bypass)
        } catch (error: Throwable) {
            if (!SecTunnelRuntime.isCurrent(token)) throw error
            Thread.sleep(300)
            if (!SecTunnelRuntime.isCurrent(token)) throw error
            return openTun(bypass)
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
        runCatching { builder.addDisallowedApplication(packageName) }
        bypass.forEach { packageName ->
            if (packageName == this.packageName) return@forEach
            runCatching { builder.addDisallowedApplication(packageName) }
        }
        return builder.establish() ?: error("Не удалось создать туннель")
    }

    @Suppress("DEPRECATION")
    private fun pickNetwork(): Network? {
        val manager = getSystemService(ConnectivityManager::class.java) ?: return null
        val active = manager.activeNetwork
        if (active != null && !isVpn(manager, active)) return active
        return manager.allNetworks.firstOrNull { network -> !isVpn(manager, network) }
    }

    private fun isVpn(manager: ConnectivityManager, network: Network): Boolean {
        val caps = manager.getNetworkCapabilities(network) ?: return false
        return caps.hasTransport(NetworkCapabilities.TRANSPORT_VPN)
    }

    private fun shutdown() {
        if (!stopped.compareAndSet(false, true)) {
            relay?.close()
            return
        }
        SecTunnelRuntime.onRotate = null
        relay?.close()
        relay = null
        synchronized(writeLock) {
            runCatching { tunOut?.close() }
            tunOut = null
        }
        runCatching { tun?.close() }
        tun = null
    }

    private fun notification(text: String): Notification {
        val open = PendingIntent.getActivity(
            this,
            2,
            Intent(this, MainActivity::class.java),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        return NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_bozya)
            .setContentTitle(getString(R.string.app_name))
            .setContentText(text)
            .setContentIntent(open)
            .setOngoing(true)
            .setSilent(true)
            .setOnlyAlertOnce(true)
            .setCategory(NotificationCompat.CATEGORY_SERVICE)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .build()
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
        val notification: Notification = notification(label)
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
        const val ACTION_LABEL = "com.nimbus.vpn.SEC_LABEL"
        const val EXTRA_CONFIG = "config"
        const val EXTRA_BYPASS = "bypass"
        const val EXTRA_TOKEN = "token"
        const val EXTRA_LABEL = "label"
        const val EXTRA_EPOCH = "epoch"
        private const val CHANNEL_ID = "bozya.keepalive"
        private const val NOTIF_ID = 18
        private const val TAG = "Bozya/SecTunnel"
    }
}
