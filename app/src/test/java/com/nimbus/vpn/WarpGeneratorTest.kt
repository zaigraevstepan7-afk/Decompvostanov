package com.nimbus.vpn

import com.google.common.truth.Truth.assertThat
import com.nimbus.vpn.data.ConfigParser
import com.nimbus.vpn.data.DnsProfile
import com.nimbus.vpn.data.WarpApi
import com.nimbus.vpn.data.WarpConfigBuilder
import com.nimbus.vpn.data.WarpGenerator
import com.nimbus.vpn.data.WarpKeys
import com.nimbus.vpn.ui.home.flagForEndpoint
import org.junit.Test
import kotlin.random.Random

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
    fun omitsIpv6WhenDisabled() {
        val conf = WarpConfigBuilder.build(fakeKeys, "pl.tribukvy.ltd", ipv6 = false)
        assertThat(ConfigParser.parse(conf).interfaceAddress).isEqualTo("172.16.0.2")
    }

    @Test
    fun resolvesGermanyLte() {
        val endpoint = WarpConfigBuilder.resolve("de", lte = true)
        assertThat(endpoint.id).isEqualTo("lte-de")
        assertThat(endpoint.name).isEqualTo("Германия LTE")
        assertThat(endpoint.host).isEqualTo("tel.de.tribukvy.ltd")
    }

    @Test
    fun ignoresLteWhenCountryHasNone() {
        val endpoint = WarpConfigBuilder.resolve("nl", lte = true)
        assertThat(endpoint.id).isEqualTo("nl")
        assertThat(endpoint.host).isEqualTo(WarpConfigBuilder.CLOUDFLARE_HOST)
        assertThat(endpoint.name).isEqualTo("Нидерланды")
    }

    @Test
    fun plainGermanyUsesTheLiveRelay() {
        val endpoint = WarpConfigBuilder.resolve("de", lte = false)
        assertThat(endpoint.host).isEqualTo("tel.de.tribukvy.ltd")
        val poland = WarpConfigBuilder.resolve("pl", lte = false)
        assertThat(poland.host).isEqualTo("tel.pl.tribukvy.ltd")
        assertThat(poland.excludedPorts).contains(988)
    }

    @Test
    fun rewritesDeadCountryRelays() {
        val raw = """
            [Peer]
            Endpoint = de.tribukvy.ltd:4500
            Endpoint = pl.tribukvy.ltd:988
        """.trimIndent() + "\n"
        val rewritten = WarpConfigBuilder.rewriteDeadRelays(raw)
        assertThat(rewritten).contains("Endpoint = tel.de.tribukvy.ltd:4500")
        assertThat(rewritten).contains("Endpoint = tel.pl.tribukvy.ltd:4500")
        assertThat(rewritten).doesNotContain("Endpoint = de.tribukvy.ltd")
        assertThat(rewritten).doesNotContain("Endpoint = pl.tribukvy.ltd")
        val finland = WarpConfigBuilder.rewriteDeadRelays("Endpoint = tel.fi.tribukvy.ltd:2408\n")
        assertThat(finland).isEqualTo("Endpoint = ${WarpConfigBuilder.CLOUDFLARE_HOST}:2408\n")
        val alreadyLive = "Endpoint = tel.de.tribukvy.ltd:4500\n"
        assertThat(WarpConfigBuilder.rewriteDeadRelays(alreadyLive)).isEqualTo(alreadyLive)
    }

    @Test
    fun generatesSelectedCountry() {
        val profile = WarpGenerator.generateOne("de", lte = true, fetchKeys = { fakeKeys }, port = 4500)
        assertThat(profile.id).isEqualTo("warp:lte-de")
        assertThat(profile.name).isEqualTo("Германия LTE")
        val preview = ConfigParser.parse(profile.rawConfig)
        assertThat(preview.canConnect).isTrue()
        assertThat(preview.endpoint).isEqualTo("tel.de.tribukvy.ltd:4500")
        assertThat(flagForEndpoint(preview.endpoint)).isEqualTo("🇩🇪")
        assertThat(flagForEndpoint("tel.pl.tribukvy.ltd:500")).isEqualTo("🇵🇱")
        assertThat(flagForEndpoint("ru0.tribukvy.ltd:4500")).isEqualTo("🇷🇺")
    }

    @Test
    fun aiUltraIsDnsOnly() {
        var called = false
        val profile = WarpGenerator.generateOne("ai", fetchKeys = {
            called = true
            fakeKeys
        })
        assertThat(called).isFalse()
        assertThat(profile.name).isEqualTo("AI Ultra")
        assertThat(profile.id).isEqualTo("warp:ai")
        assertThat(DnsProfile.isOne(profile.rawConfig)).isTrue()
        assertThat(DnsProfile.servers(profile.rawConfig)).containsExactly("111.88.96.56", "111.88.96.57").inOrder()
        assertThat(profile.rawConfig).contains("xbox-dns.ru")
        assertThat(profile.rawConfig).doesNotContain("PrivateKey")
    }

    @Test
    fun ltePolandExcludesBlockedPort() {
        val ports = WarpConfigBuilder.portsFor(WarpConfigBuilder.resolve("pl", lte = true).excludedPorts)
        assertThat(ports).doesNotContain(988)
        assertThat(ports).contains(4500)
        val plain = WarpConfigBuilder.portsFor(WarpConfigBuilder.resolve("pl", lte = false).excludedPorts)
        assertThat(plain).doesNotContain(988)
        val picked = WarpConfigBuilder.randomPort(setOf(988), Random(1))
        assertThat(picked).isNotEqualTo(988)
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
