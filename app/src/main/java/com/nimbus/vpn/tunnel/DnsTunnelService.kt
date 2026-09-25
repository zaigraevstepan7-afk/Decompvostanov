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
import java.io.FileInputStream
import java.io.FileOutputStream
import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetAddress

/**
 * DNS-only tunnel. The phone keeps its own route for everything except
 * lookups, which are forwarded to xbox-dns.ru.
 */
class DnsTunnelService : VpnService() {
    private val life = Any()
    private var tun: ParcelFileDescriptor? = null
    private var worker: Thread? = null
    private var generation = 0

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent?.action == ACTION_STOP) {
            shutdown()
            DnsRuntime.markDown()
            stopSelf(startId)
            return START_NOT_STICKY
        }
        val label = intent?.getStringExtra(EXTRA_LABEL)?.takeIf { it.isNotBlank() } ?: "AI Ultra"
        val ticket = intent?.getIntExtra(EXTRA_TICKET, 0) ?: 0
        val servers = intent?.getStringArrayListExtra(EXTRA_SERVERS).orEmpty().ifEmpty {
            arrayListOf("111.88.96.56", "111.88.96.57")
        }
        if (!promote(label)) {
            DnsRuntime.fail(ticket, "Не удалось показать уведомление")
            stopSelf(startId)
            return START_NOT_STICKY
        }
        val token = synchronized(life) {
            generation += 1
            generation
        }
        worker?.interrupt()
        val commandId = startId
        worker = Thread({
            if (synchronized(life) { generation != token }) return@Thread
            var fd: ParcelFileDescriptor? = null
            try {
                closeTun()
                fd = openTun(label)
                synchronized(life) {
                    if (generation != token) {
                        runCatching { fd.close() }
                        return@Thread
                    }
                    tun = fd
                }
                DnsRuntime.succeed(ticket)
                promote(label)
                pump(fd, servers)
            } catch (error: Throwable) {
                Log.e(TAG, "dns tunnel failed", error)
                if (synchronized(life) { generation == token }) {
                    shutdownLocked()
                    DnsRuntime.fail(ticket, error.message ?: "DNS не поднялся")
                    DnsRuntime.markDown()
                    stopSelf(commandId)
                }
            }
        }, "dns-tun")
        worker?.start()
        return START_NOT_STICKY
    }

    override fun onRevoke() {
        shutdown()
        DnsRuntime.markDown()
        stopSelf()
    }

    override fun onDestroy() {
        shutdown()
        DnsRuntime.markDown()
        super.onDestroy()
    }

    private fun openTun(label: String): ParcelFileDescriptor {
        val builder = Builder()
            .setSession(label)
            .setMtu(1500)
            .addAddress(VIRTUAL, 32)
            .addDnsServer(VIRTUAL)
            .addRoute(VIRTUAL, 32)
        if (Build.VERSION.SDK_INT >= 29) builder.setMetered(false)
        runCatching { builder.addDisallowedApplication(packageName) }
        return builder.establish() ?: error("Не удалось создать DNS")
    }

    private fun pump(fd: ParcelFileDescriptor, servers: List<String>) {
        val input = FileInputStream(fd.fileDescriptor)
        val output = FileOutputStream(fd.fileDescriptor)
        val buffer = ByteArray(32767)
        val socket = DatagramSocket()
        try {
            protect(socket)
            socket.soTimeout = 2_500
            while (!Thread.currentThread().isInterrupted) {
                val read = input.read(buffer)
                if (read <= 0) continue
                val query = DnsPackets.queryPayload(buffer, read) ?: continue
                val payload = forward(socket, query, servers) ?: continue
                val answer = DnsPackets.answer(buffer, read, payload) ?: continue
                output.write(answer)
            }
        } finally {
            runCatching { socket.close() }
        }
    }

    private fun forward(socket: DatagramSocket, query: ByteArray, servers: List<String>): ByteArray? {
        val packet = DatagramPacket(query, query.size)
        for (server in servers) {
            try {
                packet.address = InetAddress.getByName(server)
                packet.port = 53
                packet.length = query.size
                socket.send(packet)
                val reply = ByteArray(2048)
                val incoming = DatagramPacket(reply, reply.size)
                socket.receive(incoming)
                if (incoming.length > 0) return reply.copyOf(incoming.length)
            } catch (error: Throwable) {
                Log.w(TAG, "dns $server failed", error)
            }
        }
        return null
    }

    private fun shutdown() {
        synchronized(life) {
            generation += 1
            shutdownLocked()
        }
    }

    private fun closeTun() {
        runCatching { tun?.close() }
        tun = null
    }

    private fun shutdownLocked() {
        worker?.interrupt()
        closeTun()
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
            6,
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

    companion object {
        const val ACTION_STOP = "com.nimbus.vpn.DNS_STOP"
        const val EXTRA_LABEL = "label"
        const val EXTRA_TICKET = "ticket"
        const val EXTRA_SERVERS = "servers"
        private const val VIRTUAL = "172.19.0.2"
        private const val CHANNEL_ID = "bozya.keepalive"
        private const val NOTIF_ID = 20
        private const val TAG = "Bozya/Dns"

        fun stop(context: Context) {
            runCatching {
                context.startService(
                    Intent(context, DnsTunnelService::class.java).setAction(ACTION_STOP),
                )
            }
        }
    }
}
