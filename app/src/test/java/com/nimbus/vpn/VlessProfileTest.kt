package com.nimbus.vpn

import com.google.common.truth.Truth.assertThat
import com.nimbus.vpn.data.VlessProfile
import com.nimbus.vpn.data.WhitelistConfig
import com.nimbus.vpn.data.WhitelistProfile
import java.net.URLEncoder
import org.junit.Assert.assertThrows
import org.junit.Test

class VlessProfileTest {
    @Test
    fun pastedLinkBecomesAnOrdinaryCard() {
        val name = URLEncoder.encode("🇩🇪 Германия", Charsets.UTF_8)
        val link = "vless://00000000-0000-0000-0000-000000000001@de.example.com:443?type=tcp&security=reality&pbk=PUBLIC&sid=ab&fp=firefox&sni=ya.ru&flow=xtls-rprx-vision#$name"
        val profile = VlessProfile.fromLink("  смотри $link  ")
        assertThat(profile.name).isEqualTo("🇩🇪 Германия")
        assertThat(profile.id).startsWith("vless:")
        assertThat(profile.id).doesNotContain("00000000")
        assertThat(VlessProfile.isOne(profile.rawConfig)).isTrue()
        assertThat(WhitelistProfile.isOne(profile.rawConfig)).isFalse()
        assertThat(VlessProfile.endpoint(profile.rawConfig)).isEqualTo("de.example.com:443")
        assertThat(VlessProfile.link(profile.rawConfig)).isEqualTo(link)
        val json = WhitelistConfig.toCoreJson(VlessProfile.link(profile.rawConfig)!!)
        assertThat(json).contains("\"protocol\":\"vless\"")
        assertThat(json).contains("de.example.com")
        assertThat(json).contains("xtls-rprx-vision")
    }

    @Test
    fun sameLinkKeepsTheSameId() {
        val link = "vless://00000000-0000-0000-0000-000000000002@nl.example.com:8443?type=tcp#NL"
        assertThat(VlessProfile.fromLink(link).id).isEqualTo(VlessProfile.fromLink(link).id)
    }

    @Test
    fun rejectsTextWithoutALink() {
        assertThrows(IllegalStateException::class.java) {
            VlessProfile.fromLink("просто текст")
        }
    }
}
