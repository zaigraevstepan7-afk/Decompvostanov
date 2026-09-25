package com.nimbus.vpn.tunnel

/** IPv4 UDP packets that carry DNS to the virtual resolver. */
internal object DnsPackets {
    fun queryPayload(packet: ByteArray, length: Int): ByteArray? {
        if (length < 28) return null
        if ((packet[0].toInt() ushr 4) != 4) return null
        val header = (packet[0].toInt() and 0x0f) * 4
        if (header < 20 || length < header + 8) return null
        if ((packet[9].toInt() and 0xff) != 17) return null
        val destPort = u16(packet, header + 2)
        if (destPort != 53) return null
        val udpLength = u16(packet, header + 4)
        val payloadStart = header + 8
        val payloadLength = udpLength - 8
        if (payloadLength <= 0 || payloadStart + payloadLength > length) return null
        return packet.copyOfRange(payloadStart, payloadStart + payloadLength)
    }

    fun answer(request: ByteArray, length: Int, payload: ByteArray): ByteArray? {
        if (queryPayload(request, length) == null) return null
        val header = (request[0].toInt() and 0x0f) * 4
        val total = header + 8 + payload.size
        val out = ByteArray(total)
        request.copyInto(out, 0, 0, header + 8)
        payload.copyInto(out, header + 8)
        for (index in 0 until 4) {
            val src = out[12 + index]
            out[12 + index] = out[16 + index]
            out[16 + index] = src
        }
        val srcPort = u16(out, header)
        val destPort = u16(out, header + 2)
        put16(out, header, destPort)
        put16(out, header + 2, srcPort)
        put16(out, header + 4, 8 + payload.size)
        put16(out, header + 6, 0)
        put16(out, 2, total)
        put16(out, 10, 0)
        put16(out, 10, checksum(out, header))
        return out
    }

    private fun u16(packet: ByteArray, offset: Int): Int {
        return ((packet[offset].toInt() and 0xff) shl 8) or (packet[offset + 1].toInt() and 0xff)
    }

    private fun put16(packet: ByteArray, offset: Int, value: Int) {
        packet[offset] = (value ushr 8).toByte()
        packet[offset + 1] = value.toByte()
    }

    private fun checksum(header: ByteArray, length: Int): Int {
        var sum = 0
        var index = 0
        while (index + 1 < length) {
            sum += u16(header, index)
            index += 2
        }
        while (sum > 0xffff) sum = (sum and 0xffff) + (sum ushr 16)
        return sum.inv() and 0xffff
    }
}
