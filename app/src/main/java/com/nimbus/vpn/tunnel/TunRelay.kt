package com.nimbus.vpn.tunnel

import java.io.Closeable
import java.io.InputStream
import java.io.OutputStream
import java.util.ArrayDeque
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicInteger
import kotlin.random.Random

interface UpstreamConn : Closeable {
    val input: InputStream
    val output: OutputStream
}

/**
 * Userspace IPv4 TCP relay plus DNS (UDP/53 answered over a TCP proxy).
 * Other UDP is dropped. IPv6 TCP is reset so apps fall back to IPv4.
 */
class TunRelay(
    private val dial: (String, Int) -> UpstreamConn,
    private val dns: (ByteArray) -> ByteArray,
    private val emit: (ByteArray) -> Unit,
    private val onBroken: () -> Unit = {},
) {
    private val workers: ExecutorService = Executors.newCachedThreadPool { runnable ->
        Thread(runnable, "sec-flow").apply { isDaemon = true }
    }
    private val flows = ConcurrentHashMap<String, Flow>()
    private val ipIds = AtomicInteger(1)
    @Volatile private var closed = false

    fun onPacket(buffer: ByteArray, length: Int) {
        if (closed || length < 1) return
        val version = (buffer[0].toInt() ushr 4) and 0x0f
        if (version == 6) {
            Packets.tcpResetV6(buffer, length)?.let(emit)
            return
        }
        val ip = Packets.parseIpv4(buffer, length) ?: return
        when (ip.protocol) {
            Packets.PROTO_TCP -> onTcp(ip)
            Packets.PROTO_UDP -> onUdp(ip)
        }
    }

    fun dropUnanswered() {
        flows.values.filter { !it.answered && !it.dead }.forEach { flow ->
            synchronized(flow) {
                if (!flow.dead) emitReset(flow)
                flow.dead = true
            }
            flow.shutdown()
            flows.remove(flow.key, flow)
        }
    }

    fun close() {
        closed = true
        flows.values.forEach { it.shutdown() }
        flows.clear()
        workers.shutdownNow()
    }

    private fun onUdp(ip: Ipv4Packet) {
        val udp = Packets.parseUdp(ip.payload) ?: return
        if (udp.dstPort != 53 || udp.payload.isEmpty()) return
        val query = udp.payload
        val src = ip.src
        val dst = ip.dst
        val srcPort = udp.srcPort
        workers.execute {
            if (closed) return@execute
            val response = runCatching { dns(query) }.getOrNull() ?: return@execute
            if (response.isEmpty() || closed) return@execute
            emit(
                Packets.buildIpv4Udp(
                    src = dst,
                    dst = src,
                    srcPort = 53,
                    dstPort = srcPort,
                    payload = response,
                    ipId = nextIpId(),
                ),
            )
        }
    }

    private fun onTcp(ip: Ipv4Packet) {
        val tcp = Packets.parseTcp(ip.payload) ?: return
        val key = "${Packets.formatIpv4(ip.src)}:${tcp.srcPort}-${Packets.formatIpv4(ip.dst)}:${tcp.dstPort}"
        if (tcp.flags and Packets.TCP_RST != 0) {
            flows.remove(key)?.shutdown()
            return
        }
        val existing = flows[key]
        if (existing == null) {
            if (tcp.flags and Packets.TCP_SYN == 0 || tcp.flags and Packets.TCP_ACK != 0) return
            if (flows.size >= MAX_FLOWS) {
                emitReset(ip, tcp)
                return
            }
            val flow = Flow(
                key = key,
                localIp = ip.src,
                remoteIp = ip.dst,
                localPort = tcp.srcPort,
                remotePort = tcp.dstPort,
                theirSeq = (tcp.seq + 1) and MASK,
                ourIsn = Random.nextInt().toLong() and MASK,
            )
            flow.ourSeq = (flow.ourIsn + 1) and MASK
            val raced = flows.putIfAbsent(key, flow)
            if (raced != null) return
            emit(
                Packets.buildIpv4Tcp(
                    src = flow.remoteIp,
                    dst = flow.localIp,
                    srcPort = flow.remotePort,
                    dstPort = flow.localPort,
                    seq = flow.ourIsn,
                    ack = flow.theirSeq,
                    flags = Packets.TCP_SYN or Packets.TCP_ACK,
                    ipId = nextIpId(),
                    mss = MSS,
                ),
            )
            val target = Packets.formatIpv4(ip.dst)
            val port = tcp.dstPort
            workers.execute { serve(flow, target, port) }
            return
        }
        var outbound: Pair<UpstreamConn, ByteArray>? = null
        var closeAfterWrite = false
        synchronized(existing) {
            if (existing.dead) return@synchronized
            if (tcp.flags and Packets.TCP_SYN != 0 && tcp.flags and Packets.TCP_ACK == 0) {
                emit(
                    Packets.buildIpv4Tcp(
                        src = existing.remoteIp,
                        dst = existing.localIp,
                        srcPort = existing.remotePort,
                        dstPort = existing.localPort,
                        seq = existing.ourIsn,
                        ack = existing.theirSeq,
                        flags = Packets.TCP_SYN or Packets.TCP_ACK,
                        ipId = nextIpId(),
                        mss = MSS,
                    ),
                )
                return@synchronized
            }
            val fin = tcp.flags and Packets.TCP_FIN != 0
            val payload = tcp.payload
            if (tcp.seq != existing.theirSeq || (payload.isEmpty() && !fin)) {
                if (payload.isEmpty() && !fin) return@synchronized
                emitAck(existing, withFin = false)
                return@synchronized
            }
            existing.theirSeq = (existing.theirSeq + payload.size + if (fin) 1 else 0) and MASK
            if (payload.isNotEmpty()) {
                val conn = existing.conn
                if (conn == null) existing.pending.add(payload.copyOf())
                else outbound = conn to payload.copyOf()
            }
            if (fin) {
                existing.finSent = true
                existing.dead = true
                closeAfterWrite = true
            }
            emitAck(existing, withFin = fin)
        }
        outbound?.let { (conn, bytes) ->
            try {
                conn.output.write(bytes)
                conn.output.flush()
            } catch (_: Throwable) {
                synchronized(existing) {
                    if (!existing.dead) emitReset(existing)
                    existing.dead = true
                }
                closeAfterWrite = true
            }
        }
        if (closeAfterWrite) runCatching { existing.conn?.close() }
    }

    private fun serve(flow: Flow, target: String, port: Int) {
        var sentToClient = false
        var replay = ByteArray(0)
        var attempt = 0
        try {
            while (attempt < 2 && !closed && !flow.dead) {
                attempt++
            val conn = try {
                dial(target, port)
            } catch (_: Throwable) {
                onBroken()
                if (attempt < 2 && !closed && !flow.dead) continue
                synchronized(flow) {
                    if (!flow.dead) emitReset(flow)
                    flow.dead = true
                }
                return
            }
            val queued = synchronized(flow) {
                if (flow.dead || closed) {
                    runCatching { conn.close() }
                    return
                }
                flow.conn = conn
                val pending = flow.pending.toList()
                flow.pending.clear()
                pending
            }
            val outbound = concat(listOf(replay) + queued)
            if (!sentToClient) replay = outbound
            var retry = false
            try {
                if (outbound.isNotEmpty()) {
                    conn.output.write(outbound)
                    conn.output.flush()
                }
                val buffer = ByteArray(16 * 1024)
                while (!closed && !flow.dead) {
                    val read = conn.input.read(buffer)
                    if (read < 0) break
                    if (read == 0) continue
                    replay = ByteArray(0)
                    sentToClient = true
                    flow.answered = true
                    val chunk = buffer.copyOf(read)
                    synchronized(flow) {
                        if (!flow.dead) writeToClient(flow, chunk)
                    }
                }
            } catch (_: Throwable) {
                if (!sentToClient && attempt < 2 && !closed && !flow.dead) {
                    onBroken()
                    retry = true
                } else {
                    onBroken()
                    synchronized(flow) {
                        if (!flow.dead) emitReset(flow)
                        flow.dead = true
                    }
                }
            }
                if (retry) {
                    runCatching { conn.close() }
                    synchronized(flow) { if (flow.conn === conn) flow.conn = null }
                } else {
                    break
                }
            }
        } finally {
            synchronized(flow) {
                if (!flow.finSent && !flow.dead) {
                    emitAck(flow, withFin = true)
                    flow.finSent = true
                }
                flow.dead = true
            }
            runCatching { flow.conn?.close() }
            flows.remove(flow.key, flow)
        }
    }

    private fun concat(parts: List<ByteArray>): ByteArray {
        val size = parts.sumOf { it.size }
        if (size == 0) return ByteArray(0)
        val out = ByteArray(size)
        var at = 0
        for (part in parts) {
            part.copyInto(out, at)
            at += part.size
        }
        return out
    }

    private fun writeToClient(flow: Flow, payload: ByteArray) {
        var offset = 0
        while (offset < payload.size) {
            val size = minOf(MSS, payload.size - offset)
            val slice = payload.copyOfRange(offset, offset + size)
            emit(
                Packets.buildIpv4Tcp(
                    src = flow.remoteIp,
                    dst = flow.localIp,
                    srcPort = flow.remotePort,
                    dstPort = flow.localPort,
                    seq = flow.ourSeq,
                    ack = flow.theirSeq,
                    flags = Packets.TCP_PSH or Packets.TCP_ACK,
                    payload = slice,
                    ipId = nextIpId(),
                ),
            )
            flow.ourSeq = (flow.ourSeq + size) and MASK
            offset += size
        }
    }

    private fun emitAck(flow: Flow, withFin: Boolean) {
        emit(
            Packets.buildIpv4Tcp(
                src = flow.remoteIp,
                dst = flow.localIp,
                srcPort = flow.remotePort,
                dstPort = flow.localPort,
                seq = flow.ourSeq,
                ack = flow.theirSeq,
                flags = Packets.TCP_ACK or (if (withFin) Packets.TCP_FIN else 0),
                ipId = nextIpId(),
            ),
        )
        if (withFin) flow.ourSeq = (flow.ourSeq + 1) and MASK
    }

    private fun emitReset(flow: Flow) {
        emit(
            Packets.buildIpv4Tcp(
                src = flow.remoteIp,
                dst = flow.localIp,
                srcPort = flow.remotePort,
                dstPort = flow.localPort,
                seq = flow.ourSeq,
                ack = flow.theirSeq,
                flags = Packets.TCP_RST or Packets.TCP_ACK,
                ipId = nextIpId(),
            ),
        )
    }

    private fun emitReset(ip: Ipv4Packet, tcp: TcpSegment) {
        val ack = (tcp.seq + 1) and MASK
        emit(
            Packets.buildIpv4Tcp(
                src = ip.dst,
                dst = ip.src,
                srcPort = tcp.dstPort,
                dstPort = tcp.srcPort,
                seq = 0,
                ack = ack,
                flags = Packets.TCP_RST or Packets.TCP_ACK,
                ipId = nextIpId(),
            ),
        )
    }

    private fun nextIpId(): Int = ipIds.getAndIncrement() and 0xffff

    private class Flow(
        val key: String,
        val localIp: ByteArray,
        val remoteIp: ByteArray,
        val localPort: Int,
        val remotePort: Int,
        var theirSeq: Long,
        val ourIsn: Long,
    ) {
        var ourSeq: Long = 0
        var conn: UpstreamConn? = null
        val pending = ArrayDeque<ByteArray>()
        @Volatile var dead = false
        var finSent = false
        @Volatile var answered = false

        fun shutdown() {
            dead = true
            runCatching { conn?.close() }
        }
    }

    companion object {
        private const val MSS = 1200
        private const val MAX_FLOWS = 96
        private const val MASK = 0xffffffffL
    }
}
