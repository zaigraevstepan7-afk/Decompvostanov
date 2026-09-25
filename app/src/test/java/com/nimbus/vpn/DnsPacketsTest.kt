package com.nimbus.vpn

import com.google.common.truth.Truth.assertThat
import com.nimbus.vpn.tunnel.DnsPackets
import org.junit.Test

class DnsPacketsTest {
    @Test
    fun swapsAddressesAndKeepsTheAnswer() {
        val request = ByteArray(32)
        request[0] = 0x45
        request[9] = 17
        request[2] = 0
        request[3] = 32
        request[12] = 10
        request[16] = 20
        request[20] = 0x12
        request[21] = 0x34
        request[22] = 0
        request[23] = 53
        request[24] = 0
        request[25] = 12
        request[28] = 9
        val payload = byteArrayOf(1, 2, 3, 4)
        val answer = DnsPackets.answer(request, request.size, payload)!!
        assertThat(answer[12]).isEqualTo(20)
        assertThat(answer[16]).isEqualTo(10)
        assertThat(answer[22]).isEqualTo(0x12)
        assertThat(answer[23]).isEqualTo(0x34)
        assertThat(answer.copyOfRange(answer.size - 4, answer.size)).isEqualTo(payload)
        assertThat(DnsPackets.queryPayload(answer, answer.size)).isNull()
    }
}
