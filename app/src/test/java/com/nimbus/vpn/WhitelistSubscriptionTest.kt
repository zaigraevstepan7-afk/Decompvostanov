package com.nimbus.vpn

import com.google.common.truth.Truth.assertThat
import com.nimbus.vpn.data.ServerPing
import com.nimbus.vpn.data.VpnProfile
import com.nimbus.vpn.data.WhitelistConfig
import com.nimbus.vpn.data.WhitelistProfile
import com.nimbus.vpn.data.WhitelistSubscription
import java.util.Base64
import org.junit.Test

class WhitelistSubscriptionTest {
    @Test
    fun parsesNamesAndSkipsNotices() {
        val body = """
            vless://00000000-0000-0000-0000-000000000001@de.example.com:443?type=tcp#${encode("🇩🇪 Germany — #1")}
            vless://00000000-0000-0000-0000-000000000002@lt.example.com:8443?type=xhttp#${encode("🇱🇹 Lithuania")}
            vless://00000000-0000-0000-0000-000000000003@zieng2.org:1?security=reality#${encode("⚠️ Lite-версия подписки устарела")}
            vless://00000000-0000-0000-0000-000000000004@zieng2.org:3?security=reality#https://github.com/zieng2/wl
        """.trimIndent()

        val profiles = WhitelistSubscription.profilesFrom(body)

        assertThat(profiles.map { it.name }).containsExactly("🇩🇪 Germany — #1", "🇱🇹 Lithuania").inOrder()
        assertThat(WhitelistProfile.endpoint(profiles[0].rawConfig)).isEqualTo("de.example.com:443")
        assertThat(WhitelistProfile.endpoint(profiles[1].rawConfig)).isEqualTo("lt.example.com:8443")
        assertThat(WhitelistProfile.isOne(profiles[0].rawConfig)).isTrue()
        assertThat(WhitelistProfile.flagEmoji(profiles[0].name)).isEqualTo("🇩🇪")
        assertThat(WhitelistProfile.link(profiles[0].rawConfig)).contains("de.example.com:443")
        assertThat(profiles[0].id).isEqualTo(profilesFromAgain(body)[0].id)
        assertThat(ServerPing.portOf(WhitelistProfile.endpoint(profiles[1].rawConfig))).isEqualTo(8443)
    }

    @Test
    fun buildsCoreConfigWithoutWaitingForPing() {
        val link = "vless://00000000-0000-0000-0000-000000000001@de.example.com:443?type=raw&security=reality&pbk=PUBLIC&sid=ab&fp=firefox&sni=ya.ru&flow=xtls-rprx-vision#Germany"
        val json = WhitelistConfig.toCoreJson(link)
        assertThat(json).contains("\"name\":\"xray0\"")
        assertThat(json).contains("\"protocol\":\"dns\"")
        assertThat(json).contains("https://1.1.1.1/dns-query")
        assertThat(json).contains("\"outboundTag\":\"dns-out\"")
        assertThat(json).contains("\"protocol\":\"vless\"")
        assertThat(json).contains("\"address\":\"de.example.com\"")
        assertThat(json).contains("\"port\":443")
        assertThat(json).contains("\"network\":\"raw\"")
        assertThat(json).contains("\"security\":\"reality\"")
        assertThat(json).contains("\"publicKey\":\"PUBLIC\"")
        assertThat(json).contains("\"flow\":\"xtls-rprx-vision\"")
        val extraLink = "vless://00000000-0000-0000-0000-000000000005@lt.example.com:443?type=xhttp&security=tls&sni=ya.ru&path=/ray&extra=${encode("{\"scMaxEachPostBytes\":\"100-200\"}")}&alpn=h2"
        val extraJson = WhitelistConfig.toCoreJson(extraLink)
        assertThat(extraJson).contains("\"network\":\"xhttp\"")
        assertThat(extraJson).contains("\"scMaxEachPostBytes\":\"100-200\"")
        assertThat(extraJson).contains("\"fingerprint\":\"chrome\"")
        assertThat(extraJson).contains("\"alpn\":[\"h2\"]")
    }

    @Test
    fun sortsFastestPingFirst() {
        val profiles = listOf(
            VpnProfile(id = "slow", name = "s", rawConfig = "x"),
            VpnProfile(id = "fast", name = "f", rawConfig = "x"),
            VpnProfile(id = "wait", name = "w", rawConfig = "x"),
            VpnProfile(id = "dead", name = "d", rawConfig = "x"),
            VpnProfile(id = "mid", name = "m", rawConfig = "x"),
        )
        val sorted = WhitelistSubscription.sortedByPing(
            profiles,
            mapOf("slow" to 400, "fast" to 20, "dead" to null, "mid" to 80),
        )
        assertThat(sorted.map { it.id }).containsExactly("fast", "mid", "slow", "wait", "dead").inOrder()
    }

    @Test
    fun skipsOrdinaryNamesInMixedList() {
        val body = """
            vless://00000000-0000-0000-0000-000000000011@nl.example.com:443#${encode("🇳🇱 LTE Нидерланды")}
            vless://00000000-0000-0000-0000-000000000012@de.example.com:443#${encode("🇩🇪 Германия")}
            vless://00000000-0000-0000-0000-000000000013@fi.example.com:443#${encode("Белые списки 1")}
            vless://00000000-0000-0000-0000-000000000014@pl.example.com:443#${encode("🇵🇱 БС Польша")}
            vless://00000000-0000-0000-0000-000000000015@be.example.com:443#${encode("🇧🇪 Бельгия")}
        """.trimIndent()
        val kept = WhitelistSubscription.profilesFrom(body, onlyWhitelistNames = true)
        assertThat(kept.map { it.name }).containsExactly(
            "🇳🇱 LTE Нидерланды",
            "Белые списки 1",
            "🇵🇱 БС Польша",
        ).inOrder()
    }

    @Test
    fun readsXrayJsonAndKeepsWhitelistHop() {
        val body = """
            [
              {"remarks":"🇧🇪 Бельгия","outbounds":[${vlessOutbound("proxy", "be.example.com", 443, "00000000-0000-0000-0000-000000000021", "tcp", "DECOY")}]},
              {"remarks":"🇨🇭 Швейцария (БС-1)","routing":{"balancers":[{"tag":"WL_Balancer","fallbackTag":"proxy-wl"}]},"outbounds":[
                ${vlessOutbound("proxy-decoy", "decoy.example.com", 443, "00000000-0000-0000-0000-000000000022", "tcp", "DECOY")},
                ${vlessOutbound("proxy-wl", "wl.example.com", 10443, "00000000-0000-0000-0000-000000000023", "xhttp", "WLKEY")}
              ]}
            ]
        """.trimIndent()
        val profiles = WhitelistSubscription.profilesFrom(body, onlyWhitelistNames = true)
        assertThat(profiles.map { it.name }).containsExactly("🇨🇭 Швейцария (БС-1)")
        val json = WhitelistProfile.core(profiles[0].rawConfig)!!
        assertThat(json).contains("\"name\":\"xray0\"")
        assertThat(json).contains("wl.example.com")
        assertThat(json).contains("decoy.example.com")
        assertThat(json).contains("\"protocol\":\"dns\"")
        assertThat(json).contains("WL_Balancer")
        assertThat(json).doesNotContain("\"protocol\":\"socks\"")
        assertThat(json).contains("\"publicKey\":\"WLKEY\"")
        assertThat(WhitelistProfile.endpoint(profiles[0].rawConfig)).isEqualTo("wl.example.com:10443")
    }

    @Test
    fun keepsOnlyVless() {
        val body = """
            hysteria2://secret@lv.example.com:443?sni=ya.ru#Latvia
            vless://00000000-0000-0000-0000-000000000006@uk.example.com:443?type=grpc#${encode("🇬🇧 United Kingdom")}
        """.trimIndent()
        val profiles = WhitelistSubscription.profilesFrom(body)
        assertThat(profiles.map { it.name }).containsExactly("🇬🇧 United Kingdom")
    }

    @Test
    fun unwrapsBase64Body() {
        val plain = "vless://00000000-0000-0000-0000-000000000009@ch.example.com:2053?type=raw#${encode("🇨🇭 Switzerland")}"
        val encoded = Base64.getMimeEncoder().encodeToString(plain.toByteArray())
        val profiles = WhitelistSubscription.profilesFrom(encoded)
        assertThat(profiles).hasSize(1)
        assertThat(profiles[0].name).isEqualTo("🇨🇭 Switzerland")
        assertThat(WhitelistProfile.endpoint(profiles[0].rawConfig)).isEqualTo("ch.example.com:2053")
    }

    private fun profilesFromAgain(body: String) = WhitelistSubscription.profilesFrom(body)

    private fun vlessOutbound(
        tag: String,
        host: String,
        port: Int,
        id: String,
        network: String,
        publicKey: String,
    ): String {
        val transport = if (network == "xhttp") {
            """"xhttpSettings":{"path":"/ray","host":"","mode":"stream-one","extra":{"xPaddingBytes":"50-150"}}"""
        } else {
            """"tcpSettings":{}"""
        }
        return """
            {"tag":"$tag","protocol":"vless","settings":{"vnext":[{"address":"$host","port":$port,"users":[{"id":"$id","encryption":"none","flow":"xtls-rprx-vision"}]}]},"streamSettings":{"network":"$network",$transport,"security":"reality","realitySettings":{"serverName":"ya.ru","publicKey":"$publicKey","shortId":"ab","fingerprint":"firefox"}}}
        """.trimIndent()
    }

    private fun encode(text: String): String = java.net.URLEncoder.encode(text, Charsets.UTF_8)
}
