package com.nimbus.vpn

import com.google.common.truth.Truth.assertThat
import com.nimbus.vpn.data.ServerPing
import com.nimbus.vpn.data.VpnProfile
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
    fun unwrapsBase64Body() {
        val plain = "vless://00000000-0000-0000-0000-000000000009@ch.example.com:2053?type=raw#${encode("🇨🇭 Switzerland")}"
        val encoded = Base64.getMimeEncoder().encodeToString(plain.toByteArray())
        val profiles = WhitelistSubscription.profilesFrom(encoded)
        assertThat(profiles).hasSize(1)
        assertThat(profiles[0].name).isEqualTo("🇨🇭 Switzerland")
        assertThat(WhitelistProfile.endpoint(profiles[0].rawConfig)).isEqualTo("ch.example.com:2053")
    }

    private fun profilesFromAgain(body: String) = WhitelistSubscription.profilesFrom(body)

    private fun encode(text: String): String = java.net.URLEncoder.encode(text, Charsets.UTF_8)
}
