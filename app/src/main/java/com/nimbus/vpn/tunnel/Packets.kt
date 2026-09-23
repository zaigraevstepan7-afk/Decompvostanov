package com.nimbus.vpn.tunnel

data class Ipv4Packet(
    val src: ByteArray,
    val dst: ByteArray,
    val protocol: Int,
    val payload: ByteArray,
)

data class TcpSegment(
    val srcPort: Int,
    val dstPort: Int,
    val seq: Long,
    val ack: Long,
    val flags: Int,
    val payload: ByteArray,
)

data class UdpDatagram(
    val srcPort: Int,
    val dstPort: Int,
    val payload: ByteArray,
)

object Packets {
    const val TCP_FIN = 0x01
    const val TCP_SYN = 0x02
    const val TCP_RST = 0x04
    const val TCP_PSH = 0x08
    const val TCP_ACK = 0x10
    const val PROTO_TCP = 6
    const val PROTO_UDP = 17

    fun parseIpv4(data: ByteArray, length: Int): Ipv4Packet? {
        if (length < 20) return null
        val version = (data[0].toInt() ushr 4) and 0x0f
        if (version != 4) return null
        val headerLength = (data[0].toInt() and 0x0f) * 4
        if (headerLength < 20 || length < headerLength) return null
        val total = u16(data, 2)
        if (total < headerLength) return null
        val fragment = u16(data, 6) and 0x1fff
        if (fragment != 0) return null
        val end = minOf(length, total)
        if (end < headerLength) return null
        return Ipv4Packet(
            src = data.copyOfRange(12, 16),
            dst = data.copyOfRange(16, 20),
            protocol = data[9].toInt() and 0xff,
            payload = data.copyOfRange(headerLength, end),
        )
    }

    fun parseTcp(payload: ByteArray): TcpSegment? {
        if (payload.size < 20) return null
        val offset = ((payload[12].toInt() ushr 4) and 0x0f) * 4
        if (offset < 20 || payload.size < offset) return null
        return TcpSegment(
            srcPort = u16(payload, 0),
            dstPort = u16(payload, 2),
            seq = u32(payload, 4),
            ack = u32(payload, 8),
            flags = payload[13].toInt() and 0xff,
            payload = payload.copyOfRange(offset, payload.size),
        )
    }

    fun parseUdp(payload: ByteArray): UdpDatagram? {
        if (payload.size < 8) return null
        val declared = u16(payload, 4)
        val end = if (declared >= 8) minOf(payload.size, declared) else payload.size
        if (end < 8) return null
        return UdpDatagram(
            srcPort = u16(payload, 0),
            dstPort = u16(payload, 2),
            payload = payload.copyOfRange(8, end),
        )
    }

    fun buildIpv4Tcp(
        src: ByteArray,
        dst: ByteArray,
        srcPort: Int,
        dstPort: Int,
        seq: Long,
        ack: Long,
        flags: Int,
        payload: ByteArray = ByteArray(0),
        ipId: Int,
        mss: Int? = null,
        window: Int = 65535,
    ): ByteArray {
        val options = if (mss != null) {
            byteArrayOf(2, 4, (mss ushr 8).toByte(), mss.toByte())
        } else {
            ByteArray(0)
        }
        val tcpLength = 20 + options.size + payload.size
        val tcp = ByteArray(tcpLength)
        put16(tcp, 0, srcPort)
        put16(tcp, 2, dstPort)
        put32(tcp, 4, seq)
        put32(tcp, 8, ack)
        tcp[12] = (((20 + options.size) / 4) shl 4).toByte()
        tcp[13] = flags.toByte()
        put16(tcp, 14, window)
        options.copyInto(tcp, 20)
        if (payload.isNotEmpty()) payload.copyInto(tcp, 20 + options.size)
        val sum = internetChecksum(pseudoHeader(src, dst, PROTO_TCP, tcpLength), tcp)
        put16(tcp, 16, sum)

        val total = 20 + tcpLength
        val ip = ByteArray(total)
        ip[0] = 0x45
        put16(ip, 2, total)
        put16(ip, 4, ipId and 0xffff)
        put16(ip, 6, 0x4000)
        ip[8] = 64
        ip[9] = PROTO_TCP.toByte()
        src.copyInto(ip, 12)
        dst.copyInto(ip, 16)
        tcp.copyInto(ip, 20)
        put16(ip, 10, internetChecksum(ip.copyOfRange(0, 20)))
        return ip
    }

    fun buildIpv4Udp(
        src: ByteArray,
        dst: ByteArray,
        srcPort: Int,
        dstPort: Int,
        payload: ByteArray,
        ipId: Int,
    ): ByteArray {
        val udpLength = 8 + payload.size
        val udp = ByteArray(udpLength)
        put16(udp, 0, srcPort)
        put16(udp, 2, dstPort)
        put16(udp, 4, udpLength)
        payload.copyInto(udp, 8)
        var sum = internetChecksum(pseudoHeader(src, dst, PROTO_UDP, udpLength), udp)
        if (sum == 0) sum = 0xffff
        put16(udp, 6, sum)

        val total = 20 + udpLength
        val ip = ByteArray(total)
        ip[0] = 0x45
        put16(ip, 2, total)
        put16(ip, 4, ipId and 0xffff)
        put16(ip, 6, 0x4000)
        ip[8] = 64
        ip[9] = PROTO_UDP.toByte()
        src.copyInto(ip, 12)
        dst.copyInto(ip, 16)
        udp.copyInto(ip, 20)
        put16(ip, 10, internetChecksum(ip.copyOfRange(0, 20)))
        return ip
    }

    fun tcpResetV6(data: ByteArray, length: Int): ByteArray? {
        if (length < 60) return null
        if (((data[0].toInt() ushr 4) and 0x0f) != 6) return null
        if ((data[6].toInt() and 0xff) != PROTO_TCP) return null
        val tcp = parseTcp(data.copyOfRange(40, length)) ?: return null
        val ack = (tcp.seq + tcp.payload.size +
            (if (tcp.flags and TCP_SYN != 0) 1 else 0) +
            (if (tcp.flags and TCP_FIN != 0) 1 else 0)) and 0xffffffffL
        return buildIpv6Tcp(
            src = data.copyOfRange(24, 40),
            dst = data.copyOfRange(8, 24),
            srcPort = tcp.dstPort,
            dstPort = tcp.srcPort,
            seq = 0,
            ack = ack,
            flags = TCP_RST or TCP_ACK,
        )
    }

    fun ipv4ChecksumOk(packet: ByteArray): Boolean {
        if (packet.size < 20) return false
        val headerLength = (packet[0].toInt() and 0x0f) * 4
        if (headerLength < 20 || packet.size < headerLength) return false
        return internetChecksum(packet.copyOfRange(0, headerLength)) == 0
    }

    fun internetChecksum(vararg parts: ByteArray): Int {
        var sum = 0
        for (part in parts) {
            var index = 0
            while (index + 1 < part.size) {
                sum += ((part[index].toInt() and 0xff) shl 8) or (part[index + 1].toInt() and 0xff)
                index += 2
            }
            if (index < part.size) sum += (part[index].toInt() and 0xff) shl 8
        }
        while (sum ushr 16 != 0) sum = (sum and 0xffff) + (sum ushr 16)
        return sum.inv() and 0xffff
    }

    fun formatIpv4(bytes: ByteArray): String =
        bytes.joinToString(".") { (it.toInt() and 0xff).toString() }

    private fun buildIpv6Tcp(
        src: ByteArray,
        dst: ByteArray,
        srcPort: Int,
        dstPort: Int,
        seq: Long,
        ack: Long,
        flags: Int,
    ): ByteArray {
        val tcp = ByteArray(20)
        put16(tcp, 0, srcPort)
        put16(tcp, 2, dstPort)
        put32(tcp, 4, seq)
        put32(tcp, 8, ack)
        tcp[12] = (5 shl 4).toByte()
        tcp[13] = flags.toByte()
        put16(tcp, 14, 0)
        val pseudo = ByteArray(40)
        src.copyInto(pseudo, 0)
        dst.copyInto(pseudo, 16)
        pseudo[35] = 20
        pseudo[39] = PROTO_TCP.toByte()
        put16(tcp, 16, internetChecksum(pseudo, tcp))

        val packet = ByteArray(60)
        packet[0] = 0x60
        packet[4] = 0
        packet[5] = 20
        packet[6] = PROTO_TCP.toByte()
        packet[7] = 64
        src.copyInto(packet, 8)
        dst.copyInto(packet, 24)
        tcp.copyInto(packet, 40)
        return packet
    }

    private fun pseudoHeader(src: ByteArray, dst: ByteArray, protocol: Int, length: Int): ByteArray {
        val header = ByteArray(12)
        src.copyInto(header, 0)
        dst.copyInto(header, 4)
        header[9] = protocol.toByte()
        put16(header, 10, length)
        return header
    }

    private fun u16(data: ByteArray, offset: Int): Int =
        ((data[offset].toInt() and 0xff) shl 8) or (data[offset + 1].toInt() and 0xff)

    private fun u32(data: ByteArray, offset: Int): Long =
        ((data[offset].toLong() and 0xff) shl 24) or
            ((data[offset + 1].toLong() and 0xff) shl 16) or
            ((data[offset + 2].toLong() and 0xff) shl 8) or
            (data[offset + 3].toLong() and 0xff)

    private fun put16(data: ByteArray, offset: Int, value: Int) {
        data[offset] = (value ushr 8).toByte()
        data[offset + 1] = value.toByte()
    }

    private fun put32(data: ByteArray, offset: Int, value: Long) {
        val bits = value and 0xffffffffL
        data[offset] = (bits ushr 24).toByte()
        data[offset + 1] = (bits ushr 16).toByte()
        data[offset + 2] = (bits ushr 8).toByte()
        data[offset + 3] = bits.toByte()
    }
}
