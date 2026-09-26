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
import com.nimbus.vpn.data.DnsProfile
import java.io.FileInputStream
import java.io.FileOutputStream
import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.HttpURLConnection
import java.net.InetAddress
import java.net.InetSocketAddress
import java.net.Socket
import java.net.URL
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicInteger

/**
 * DNS-only tunnel. The phone keeps its own route for everything except
 * lookups, which are forwarded to xbox-dns.ru.
 */
class DnsTunnelService : VpnService() {
    private val life = Any()
    private var tun: ParcelFileDescriptor? = null
    private var worker: Thread? = null
    private var generation = 0
    @Volatile private var skipUdpUntil = 0L

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
            ArrayList(DnsProfile.SERVERS)
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
        val withIp6 = runCatching { establish(label, ipv6 = true) }.getOrNull()
        return withIp6 ?: establish(label, ipv6 = false) ?: error("Не удалось создать DNS")
    }

    private fun establish(label: String, ipv6: Boolean): ParcelFileDescriptor? {
        val builder = Builder()
            .setSession(label)
            .setMtu(1280)
            .setBlocking(true)
            .addAddress(VIRTUAL, 32)
            .addDnsServer(VIRTUAL)
            .addRoute("0.0.0.0", 0)
        if (ipv6) {
            builder.addAddress(VIRTUAL_V6, 128)
            builder.addRoute("::", 0)
        }
        if (Build.VERSION.SDK_INT >= 29) builder.setMetered(false)
        runCatching { builder.addDisallowedApplication(packageName) }
        return builder.establish()
    }

    private fun pump(fd: ParcelFileDescriptor, servers: List<String>) {
        val input = FileInputStream(fd.fileDescriptor)
        val output = FileOutputStream(fd.fileDescriptor)
        val emit = { packet: ByteArray ->
            synchronized(output) { output.write(packet) }
        }
        val relay = TunRelay(
            dial = { host, port -> dialOut(host, port) },
            dns = { query -> lookup(query, servers) },
            emit = emit,
        )
        val plainUdp = PlainUdp(protect = { socket -> protect(socket) }, emit = emit)
        val buffer = ByteArray(32767)
        try {
            while (!Thread.currentThread().isInterrupted) {
                val read = input.read(buffer)
                if (read <= 0) continue
                if (!plainUdp.offer(buffer, read)) relay.onPacket(buffer, read)
            }
        } finally {
            plainUdp.close()
            relay.close()
        }
    }

    private fun dialOut(host: String, port: Int): UpstreamConn {
        val socket = Socket()
        if (!protect(socket)) error("Сокет DNS не обошёл туннель")
        socket.tcpNoDelay = true
        socket.connect(InetSocketAddress(host, port), 10_000)
        return object : UpstreamConn {
            override val input = socket.getInputStream()
            override val output = socket.getOutputStream()
            override fun close() {
                runCatching { socket.close() }
            }
        }
    }

    private fun lookup(query: ByteArray, servers: List<String>): ByteArray {
        val now = System.currentTimeMillis()
        if (now >= skipUdpUntil) {
            val udp = udpLookup(query, servers)
            if (udp != null) return udp
            skipUdpUntil = now + 60_000
        }
        return dohLookup(query)
    }

    private fun udpLookup(query: ByteArray, servers: List<String>): ByteArray? {
        for (server in servers) {
            DatagramSocket().use { socket ->
                if (!protect(socket)) return null
                socket.soTimeout = 800
                try {
                    socket.send(DatagramPacket(query, query.size, InetAddress.getByName(server), 53))
                    val reply = ByteArray(2048)
                    val incoming = DatagramPacket(reply, reply.size)
                    socket.receive(incoming)
                    if (incoming.length >= 12) return reply.copyOf(incoming.length)
                } catch (error: Throwable) {
                    Log.w(TAG, "udp dns $server failed", error)
                }
            }
        }
        return null
    }

    private fun dohLookup(query: ByteArray): ByteArray {
        val connection = (URL(DnsProfile.DOH).openConnection() as HttpURLConnection).apply {
            requestMethod = "POST"
            connectTimeout = 5_000
            readTimeout = 5_000
            doOutput = true
            setRequestProperty("Content-Type", "application/dns-message")
            setRequestProperty("Accept", "application/dns-message")
        }
        try {
            connection.outputStream.use { it.write(query) }
            val code = connection.responseCode
            if (code !in 200..299) error("xbox-dns.ru HTTP $code")
            val body = connection.inputStream.use { it.readBytes() }
            if (body.size < 12) error("xbox-dns.ru пустой ответ")
            return body
        } finally {
            connection.disconnect()
        }
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
        private const val VIRTUAL_V6 = "fd6d:7362:2a::2"
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

/** Forwards ordinary UDP around the DNS tunnel so the phone's own network still carries it. */
private class PlainUdp(
    private val protect: (DatagramSocket) -> Boolean,
    private val emit: (ByteArray) -> Unit,
) {
    private val flows = ConcurrentHashMap<String, Flow>()
    private val ids = AtomicInteger(1)

    fun offer(packet: ByteArray, length: Int): Boolean {
        val ip = Packets.parseIpv4(packet, length) ?: return false
        if (ip.protocol != Packets.PROTO_UDP) return false
        val udp = Packets.parseUdp(ip.payload) ?: return true
        if (udp.dstPort == 53) return false
        if (udp.payload.size > 1400) return true
        val key = Packets.formatIpv4(ip.src) + ":" + udp.srcPort + ">" +
            Packets.formatIpv4(ip.dst) + ":" + udp.dstPort
        val flow = flows[key] ?: open(key, ip, udp) ?: return true
        flow.seen = System.nanoTime()
        try {
            flow.socket.send(
                DatagramPacket(udp.payload, udp.payload.size, InetAddress.getByAddress(ip.dst), udp.dstPort),
            )
        } catch (_: Throwable) {
            flows.remove(key, flow)
            runCatching { flow.socket.close() }
        }
        return true
    }

    fun close() {
        flows.values.forEach { runCatching { it.socket.close() } }
        flows.clear()
    }

    private fun open(key: String, ip: Ipv4Packet, udp: UdpDatagram): Flow? {
        if (flows.size >= 48) {
            val oldest = flows.entries.minByOrNull { it.value.seen }?.key
            if (oldest != null) flows.remove(oldest)?.let { runCatching { it.socket.close() } }
        }
        val socket = DatagramSocket()
        if (!protect(socket)) {
            socket.close()
            return null
        }
        socket.soTimeout = 20_000
        val flow = Flow(socket, ip.src.copyOf(), udp.srcPort, ip.dst.copyOf(), udp.dstPort)
        if (flows.putIfAbsent(key, flow) != null) {
            socket.close()
            return flows[key]
        }
        Thread({
            val buffer = ByteArray(2048)
            try {
                while (!Thread.currentThread().isInterrupted) {
                    val incoming = DatagramPacket(buffer, buffer.size)
                    socket.receive(incoming)
                    flow.seen = System.nanoTime()
                    emit(
                        Packets.buildIpv4Udp(
                            src = flow.remoteIp,
                            dst = flow.localIp,
                            srcPort = flow.remotePort,
                            dstPort = flow.localPort,
                            payload = buffer.copyOf(incoming.length),
                            ipId = ids.incrementAndGet() and 0xffff,
                        ),
                    )
                }
            } catch (_: Throwable) {
            } finally {
                flows.remove(key, flow)
                runCatching { socket.close() }
            }
        }, "dns-udp").apply { isDaemon = true }.start()
        return flow
    }

    private class Flow(
        val socket: DatagramSocket,
        val localIp: ByteArray,
        val localPort: Int,
        val remoteIp: ByteArray,
        val remotePort: Int,
    ) {
        @Volatile var seen: Long = System.nanoTime()
    }
}
