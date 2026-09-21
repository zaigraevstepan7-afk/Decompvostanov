package com.nimbus.vpn

import com.google.common.truth.Truth.assertThat
import com.nimbus.vpn.data.ServerPing
import org.junit.Test

class ServerPingTest {
    @Test
    fun hostOfStripsPort() {
        assertThat(ServerPing.hostOf("de.tribukvy.ltd:4500")).isEqualTo("de.tribukvy.ltd")
        assertThat(ServerPing.hostOf("tel.pl.tribukvy.ltd:988")).isEqualTo("tel.pl.tribukvy.ltd")
        assertThat(ServerPing.hostOf("[2001:db8::1]:4500")).isEqualTo("2001:db8::1")
        assertThat(ServerPing.hostOf("engage.cloudflareclient.com")).isEqualTo("engage.cloudflareclient.com")
        assertThat(ServerPing.hostOf(null)).isNull()
        assertThat(ServerPing.hostOf("  ")).isNull()
    }

    @Test
    fun parseRttFromPingOutput() {
        val output = """
            PING de.tribukvy.ltd (1.2.3.4) 56(84) bytes of data.
            64 bytes from 1.2.3.4: icmp_seq=1 ttl=54 time=42.7 ms
        """.trimIndent()
        assertThat(ServerPing.parseRttMs(output)).isEqualTo(42)
        assertThat(ServerPing.parseRttMs("time<1 ms")).isEqualTo(1)
        assertThat(ServerPing.parseRttMs("время=18,4 мс")).isEqualTo(18)
        assertThat(ServerPing.parseRttMs("Request timeout")).isNull()
    }
}
