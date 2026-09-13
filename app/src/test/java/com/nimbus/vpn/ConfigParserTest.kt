package com.nimbus.vpn

import com.google.common.truth.Truth.assertThat
import com.nimbus.vpn.data.ConfigParser
import org.junit.Test

class ConfigParserTest {
    private val sample = """
        [Interface]
        PrivateKey = cNb7vK3pQ9LmR2sT8uW1xY4zA6bC0dE5fG7hI9jK2M=
        Address = 172.16.0.2, 2606:4700:110::1
        DNS = 1.1.1.1, 1.0.0.1
        MTU = 1280
        S1 = 0
        S2 = 0
        Jc = 4
        Jmin = 40
        Jmax = 70
        H1 = 1
        H2 = 2
        H3 = 3
        H4 = 4
        I1 = <b 0xce000000010897a297ecc34cd6dd000044d0ec2e>

        [Peer]
        PublicKey = bmXOC+F1FxEMF9dyiK2H5/1SUtzH0JuVo51h2wPfgyo=
        AllowedIPs = 0.0.0.0/0, ::/0
        Endpoint = de.example.tld:4500
    """.trimIndent()

    @Test
    fun parsesAmneziaFieldsAndEndpoint() {
        val preview = ConfigParser.parse(sample)
        assertThat(preview.canConnect).isTrue()
        assertThat(preview.isAmnezia).isTrue()
        assertThat(preview.endpoint).isEqualTo("de.example.tld:4500")
        assertThat(preview.amnezia.jc).isEqualTo("4")
        assertThat(preview.amnezia.i1).isTrue()
        assertThat(preview.mtu).isEqualTo(1280)
        assertThat(preview.interfaceAddress).contains("172.16.0.2")
    }

    @Test
    fun rejectsEmpty() {
        val preview = ConfigParser.parse("  ")
        assertThat(preview.canConnect).isFalse()
        assertThat(preview.issues).isNotEmpty()
    }

    @Test
    fun addsKeepaliveOnce() {
        val once = ConfigParser.withKeepaliveIfMissing(sample, 25)
        val twice = ConfigParser.withKeepaliveIfMissing(once, 25)
        assertThat(once).contains("PersistentKeepalive = 25")
        assertThat(twice.indexOf("PersistentKeepalive")).isEqualTo(twice.lastIndexOf("PersistentKeepalive"))
    }

    @Test
    fun masksPrivateKey() {
        val masked = ConfigParser.maskSecrets(sample)
        assertThat(masked).doesNotContain("cNb7vK3pQ9LmR2sT8uW1xY4zA6bC0dE5fG7hI9jK2M=")
        assertThat(masked).contains("PrivateKey = ••••••••")
        assertThat(masked).contains("<hidden>")
    }

    @Test
    fun suggestNameFromHost() {
        assertThat(ConfigParser.suggestName(sample)).isEqualTo("de")
    }
}
