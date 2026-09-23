package com.nimbus.vpn

import com.google.common.truth.Truth.assertThat
import com.nimbus.vpn.data.BankBypass
import com.nimbus.vpn.data.ProfileBundle
import com.nimbus.vpn.data.ProfileIndex
import com.nimbus.vpn.data.SecExit
import com.nimbus.vpn.data.SecExitOrder
import com.nimbus.vpn.data.VpnProfile
import org.junit.Test

class BundleAndBypassTest {
    @Test
    fun bankPresetKeepsOnlyInstalledPackages() {
        val installed = setOf("ru.sberbankmobile", "com.android.settings", "com.yandex.bank")
        assertThat(BankBypass.matching(installed))
            .containsExactly("ru.sberbankmobile", "com.yandex.bank")
            .inOrder()
    }

    @Test
    fun serverListRoundTripsAndWireGuardStaysAConfig() {
        val index = ProfileIndex(
            profiles = listOf(
                VpnProfile(id = "sec:EU", name = "Европа", rawConfig = "[Bozya]\nEngine = sec-tunnel\nRegion = EU\n", createdAt = 1),
                VpnProfile(id = "warp", name = "Дом", rawConfig = "[Interface]\nPrivateKey = abc\n", createdAt = 2),
            ),
            activeId = "warp",
        )
        val parsed = ProfileBundle.parse(ProfileBundle.export(index))
        assertThat(parsed!!.activeId).isEqualTo("warp")
        assertThat(parsed.profiles.map { it.id }).containsExactly("sec:EU", "warp").inOrder()
        assertThat(ProfileBundle.parse("[Interface]\nPrivateKey = abc\n")).isNull()
    }

    @Test
    fun rememberedExitMovesToTheFrontOfItsRegion() {
        val first = SecExit("203.0.113.10", 443, "eu0.sec-tunnel.com", "USER", "pw")
        val saved = SecExit("203.0.113.11", 443, "eu0.sec-tunnel.com", "USER", "pw")
        val ordered = SecExitOrder.prefer(listOf(first, saved), "203.0.113.11")
        assertThat(ordered.map { it.ip }).containsExactly("203.0.113.11", "203.0.113.10").inOrder()
        assertThat(SecExitOrder.prefer(listOf(first, saved), "198.51.100.1")).isEqualTo(listOf(first, saved))
    }
}
