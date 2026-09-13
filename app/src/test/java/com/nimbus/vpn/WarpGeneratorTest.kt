package com.nimbus.vpn

import com.google.common.truth.Truth.assertThat
import com.nimbus.vpn.data.ConfigParser
import com.nimbus.vpn.data.WarpApi
import com.nimbus.vpn.data.WarpConfigBuilder
import com.nimbus.vpn.data.WarpGenerator
import com.nimbus.vpn.data.WarpKeys
import com.nimbus.vpn.ui.home.flagForEndpoint
import org.junit.Test

class WarpGeneratorTest {
    private val fakeKeys = WarpKeys(
        privateKey = "cNb7vK3pQ9LmR2sT8uW1xY4zA6bC0dE5fG7hI9jK2M=",
        peerPublicKey = "bmXOC+F1FxEMF9dyiK2H5/1SUtzH0JuVo51h2wPfgyo=",
        clientIpv4 = "172.16.0.2",
        clientIpv6 = "2606:4700:110:abcd::a",
    )

    @Test
    fun buildsValidAmneziaConfig() {
        val conf = WarpConfigBuilder.build(fakeKeys, "de.tribukvy.ltd", 4500)
        val preview = ConfigParser.parse(conf)
        assertThat(preview.canConnect).isTrue()
        assertThat(preview.isAmnezia).isTrue()
        assertThat(preview.endpoint).isEqualTo("de.tribukvy.ltd:4500")
        assertThat(preview.interfaceAddress).contains("172.16.0.2")
        assertThat(preview.interfaceAddress).contains("2606:4700:110:abcd::a")
        assertThat(preview.amnezia.jc).isEqualTo("4")
        assertThat(preview.amnezia.i1).isTrue()
        assertThat(conf).contains("PersistentKeepalive = 25")
        assertThat(conf).contains("I1 = <b 0xce")
        assertThat(conf).contains("PrivateKey = cNb7vK3pQ9LmR2sT8uW1xY4zA6bC0dE5fG7hI9jK2M=")
    }

    @Test
    fun omitsBlankIpv6() {
        val conf = WarpConfigBuilder.build(fakeKeys.copy(clientIpv6 = "  "), "pl.tribukvy.ltd")
        assertThat(ConfigParser.parse(conf).interfaceAddress).isEqualTo("172.16.0.2")
    }

    @Test
    fun generatesOneProfilePerServer() {
        val profiles = WarpGenerator.generate { fakeKeys }
        assertThat(profiles).hasSize(WarpConfigBuilder.servers.size)
        assertThat(profiles.map { it.id }).containsExactly(
            "warp:de", "warp:pl", "warp:nl", "warp:fi", "warp:ee", "warp:lv", "warp:ru",
        ).inOrder()
        assertThat(profiles.map { it.name }).contains("Германия")
        profiles.forEach { assertThat(ConfigParser.parse(it.rawConfig).canConnect).isTrue() }
        assertThat(flagForEndpoint("ru0.tribukvy.ltd:4500")).isEqualTo("🇷🇺")
        assertThat(flagForEndpoint("tel.pl.tribukvy.ltd:500")).isEqualTo("🇵🇱")
    }

    @Test
    fun parsesWarpApiJson() {
        val keys = WarpApi.parse(
            """
            {
              "success": true,
              "privKey": "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA=",
              "peer_pub": "bmXOC+F1FxEMF9dyiK2H5/1SUtzH0JuVo51h2wPfgyo=",
              "client_ipv4": "172.16.0.2",
              "client_ipv6": "2606:4700:110::1"
            }
            """.trimIndent(),
        )
        assertThat(keys.privateKey).startsWith("AAA")
        assertThat(keys.peerPublicKey).isEqualTo("bmXOC+F1FxEMF9dyiK2H5/1SUtzH0JuVo51h2wPfgyo=")
        assertThat(keys.clientIpv4).isEqualTo("172.16.0.2")
    }

    @Test(expected = IllegalArgumentException::class)
    fun rejectsFailedWarpApi() {
        WarpApi.parse("""{"success":false,"message":"rate limited"}""")
    }
}
