package com.nimbus.vpn.tunnel

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.ServiceInfo
import android.net.IpPrefix
import android.net.VpnService
import android.os.Build
import android.os.ParcelFileDescriptor
import android.util.Log
import androidx.core.app.NotificationCompat
import com.nimbus.vpn.MainActivity
import com.nimbus.vpn.R
import com.nimbus.vpn.data.DnsProfile
import java.io.ByteArrayOutputStream
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStream
import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetAddress
import java.net.InetSocketAddress
import java.net.Socket
import javax.net.ssl.SNIHostName
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSocket
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicInteger

/**
 * DNS-only tunnel. Lookups go to xbox-dns.ru. On Android 13+ every other
 * packet stays on the phone's own network.
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
        if (intent == null) return restartedSticky()
        val label = intent.getStringExtra(EXTRA_LABEL)?.takeIf { it.isNotBlank() } ?: "AI Ultra"
        val ticket = intent.getIntExtra(EXTRA_TICKET, 0)
        val servers = intent.getStringArrayListExtra(EXTRA_SERVERS).orEmpty().ifEmpty {
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
            try {
                closeTun()
                val created = openTun(label)
                val fd = created.fd
                synchronized(life) {
                    if (generation != token) {
                        runCatching { fd.close() }
                        return@Thread
                    }
                    tun = fd
                }
                DnsRuntime.succeed(ticket)
                promote(label)
                pump(fd, created.dnsOnly, servers)
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
        return START_STICKY
    }

    private fun restartedSticky(): Int {
        val snap = TunnelSession(this).read()
        val title = KeepAlivePolicy.usable(snap.title) ?: getString(R.string.app_name)
        if (snap.wanted) {
            promote(title)
            return START_STICKY
        }
        promote(title)
        runCatching { stopForeground(STOP_FOREGROUND_REMOVE) }
        stopSelf()
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

    private fun openTun(label: String): Opened {
        if (Build.VERSION.SDK_INT >= 33) {
            val both = runCatching { establish(label, dnsOnly = true, ipv6 = true) }.getOrNull()
            if (both != null) return Opened(both, dnsOnly = true)
            val v4 = runCatching { establish(label, dnsOnly = true, ipv6 = false) }.getOrNull()
            if (v4 != null) return Opened(v4, dnsOnly = true)
        }
        val legacy = establish(label, dnsOnly = false, ipv6 = false) ?: error("Не удалось создать DNS")
        return Opened(legacy, dnsOnly = false)
    }

    private fun establish(label: String, dnsOnly: Boolean, ipv6: Boolean): ParcelFileDescriptor? {
        val builder = Builder()
            .setSession(label)
            .setMtu(1500)
            .setBlocking(true)
            .addAddress(VIRTUAL, 32)
            .addDnsServer(VIRTUAL)
            .addRoute("0.0.0.0", 0)
        if (dnsOnly && Build.VERSION.SDK_INT >= 33) {
            if (ipv6) {
                builder.addAddress(VIRTUAL_V6, 128)
                builder.addRoute("::", 0)
                builder.excludeRoute(prefix(ByteArray(16), 1))
                builder.excludeRoute(prefix(byteArrayOf(0x80.toByte()) + ByteArray(15), 1))
            }
            builder.excludeRoute(prefix(byteArrayOf(0, 0, 0, 0), 1))
            builder.excludeRoute(prefix(byteArrayOf(128.toByte(), 0, 0, 0), 1))
        }
        if (Build.VERSION.SDK_INT >= 29) builder.setMetered(false)
        runCatching { builder.addDisallowedApplication(packageName) }
        return builder.establish()
    }

    private fun prefix(address: ByteArray, length: Int): IpPrefix {
        return IpPrefix(InetAddress.getByAddress(address), length)
    }

    private fun pump(fd: ParcelFileDescriptor, dnsOnly: Boolean, servers: List<String>) {
        if (dnsOnly) pumpDns(fd, servers) else pumpForward(fd, servers)
    }

    private fun pumpDns(fd: ParcelFileDescriptor, servers: List<String>) {
        val input = FileInputStream(fd.fileDescriptor)
        val output = FileOutputStream(fd.fileDescriptor)
        val workers = Executors.newCachedThreadPool { runnable ->
            Thread(runnable, "dns-query").apply { isDaemon = true }
        }
        val buffer = ByteArray(32767)
        try {
            while (!Thread.currentThread().isInterrupted) {
                val read = input.read(buffer)
                if (read <= 0) continue
                val packet = buffer.copyOf(read)
                val query = DnsPackets.queryPayload(packet, packet.size)
                if (query == null) {
                    resetTcp(packet, output)
                    continue
                }
                workers.execute {
                    val payload = runCatching { lookup(query, servers) }.getOrNull() ?: return@execute
                    val answer = DnsPackets.answer(packet, packet.size, payload) ?: return@execute
                    synchronized(output) { output.write(answer) }
                }
            }
        } finally {
            workers.shutdownNow()
        }
    }

    private fun resetTcp(packet: ByteArray, output: FileOutputStream) {
        val v6 = Packets.tcpResetV6(packet, packet.size)
        if (v6 != null) {
            synchronized(output) { output.write(v6) }
            return
        }
        val ip = Packets.parseIpv4(packet, packet.size) ?: return
        if (ip.protocol != Packets.PROTO_TCP) return
        val tcp = Packets.parseTcp(ip.payload) ?: return
        if (tcp.flags and Packets.TCP_RST != 0) return
        val ack = (tcp.seq + tcp.payload.size +
            (if (tcp.flags and Packets.TCP_SYN != 0) 1 else 0) +
            (if (tcp.flags and Packets.TCP_FIN != 0) 1 else 0)) and 0xffffffffL
        val rst = Packets.buildIpv4Tcp(
            src = ip.dst,
            dst = ip.src,
            srcPort = tcp.dstPort,
            dstPort = tcp.srcPort,
            seq = 0,
            ack = ack,
            flags = Packets.TCP_RST or Packets.TCP_ACK,
            ipId = 1,
        )
        synchronized(output) { output.write(rst) }
    }

    private fun pumpForward(fd: ParcelFileDescriptor, servers: List<String>) {
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
        try {
            return dohLookup(query)
        } catch (error: Throwable) {
            Log.w(TAG, "doh failed", error)
        }
        return udpLookup(query, servers) ?: error("xbox-dns.ru не ответил")
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
        var last: Throwable? = null
        for (ip in DOH_IPS) {
            try {
                return dohPost(ip, query)
            } catch (error: Throwable) {
                last = error
                Log.w(TAG, "doh $ip failed", error)
            }
        }
        throw last ?: error("xbox-dns.ru не ответил")
    }

    private fun dohPost(ip: String, query: ByteArray): ByteArray {
        val raw = Socket()
        var ssl: SSLSocket? = null
        try {
            if (!protect(raw)) error("DNS не обошёл туннель")
            raw.tcpNoDelay = true
            raw.connect(InetSocketAddress(InetAddress.getByName(ip), 443), 3_000)
            raw.soTimeout = 5_000
            val created = SSLContext.getDefault().socketFactory
                .createSocket(raw, DnsProfile.HOST, 443, true) as SSLSocket
            ssl = created
            val params = created.sslParameters
            params.serverNames = listOf(SNIHostName(DnsProfile.HOST))
            params.endpointIdentificationAlgorithm = "HTTPS"
            created.sslParameters = params
            created.startHandshake()
            val header = (
                "POST /dns-query HTTP/1.1\r\n" +
                    "Host: ${DnsProfile.HOST}\r\n" +
                    "Content-Type: application/dns-message\r\n" +
                    "Accept: application/dns-message\r\n" +
                    "Content-Length: ${query.size}\r\n" +
                    "Connection: close\r\n\r\n"
                ).toByteArray()
            val out = created.outputStream
            out.write(header)
            out.write(query)
            out.flush()
            val body = readHttpMessage(created.inputStream)
            if (body.size < 12) error("xbox-dns.ru пустой ответ")
            return body
        } finally {
            runCatching { ssl?.close() }
            runCatching { raw.close() }
        }
    }

    private fun readHttpMessage(input: InputStream): ByteArray {
        val buf = ByteArrayOutputStream()
        val tmp = ByteArray(2048)
        var headerEnd = -1
        while (headerEnd < 0) {
            val read = input.read(tmp)
            if (read < 0) error("xbox-dns.ru обрезанный ответ")
            buf.write(tmp, 0, read)
            headerEnd = indexOfCrLf(buf.toByteArray())
            if (buf.size() > 16_384) error("xbox-dns.ru длинный заголовок")
        }
        val raw = buf.toByteArray()
        val header = raw.toString(Charsets.ISO_8859_1).substring(0, headerEnd)
        val code = header.substringAfter(' ').substringBefore(' ').toIntOrNull() ?: 0
        if (code !in 200..299) error("xbox-dns.ru HTTP $code")
        val length = header.lineSequence()
            .map { it.trim() }
            .firstOrNull { it.startsWith("content-length:", ignoreCase = true) }
            ?.substringAfter(':')
            ?.trim()
            ?.toIntOrNull()
            ?: error("xbox-dns.ru без длины")
        if (length !in 12..8_192) error("xbox-dns.ru странный ответ")
        val body = ByteArrayOutputStream()
        val already = raw.size - (headerEnd + 4)
        if (already > 0) body.write(raw, headerEnd + 4, minOf(already, length))
        while (body.size() < length) {
            val read = input.read(tmp, 0, minOf(tmp.size, length - body.size()))
            if (read < 0) error("xbox-dns.ru обрезанный ответ")
            body.write(tmp, 0, read)
        }
        return body.toByteArray()
    }

    private fun indexOfCrLf(raw: ByteArray): Int {
        for (index in 0 until raw.size - 3) {
            if (raw[index] == 13.toByte() && raw[index + 1] == 10.toByte() &&
                raw[index + 2] == 13.toByte() && raw[index + 3] == 10.toByte()
            ) {
                return index
            }
        }
        return -1
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
        private val DOH_IPS = listOf("111.88.96.54", "111.88.96.55", "111.88.96.57", "111.88.96.56")
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

    private class Opened(val fd: ParcelFileDescriptor, val dnsOnly: Boolean)
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
