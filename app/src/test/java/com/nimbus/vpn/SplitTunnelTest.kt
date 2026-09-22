package com.nimbus.vpn

import com.google.common.truth.Truth.assertThat
import com.nimbus.vpn.data.SplitTunnel
import org.junit.Test

class SplitTunnelTest {
    private val sample = """
        [Interface]
        PrivateKey = cNb7vK3pQ9LmR2sT8uW1xY4zA6bC0dE5fG7hI9jK2M=
        Address = 172.16.0.2/32

        [Peer]
        PublicKey = bmXOC+F1FxEMF9dyiK2H5/1SUtzH0JuVo51h2wPfgyo=
        Endpoint = de.example.tld:4500
    """.trimIndent()

    @Test
    fun emptySelectionLeavesConfigUntouched() {
        val withLine = sample.replace(
            "Address = 172.16.0.2/32",
            "Address = 172.16.0.2/32\nExcludedApplications = com.bank.app",
        )
        assertThat(SplitTunnel.apply(sample, emptyList())).isEqualTo(sample)
        assertThat(SplitTunnel.apply(withLine, emptySet())).isEqualTo(withLine)
    }

    @Test
    fun insertsExcludedApplicationsBeforePeer() {
        val out = SplitTunnel.apply(sample, listOf("com.maps.app", "com.bank.app"))
        assertThat(out).contains("ExcludedApplications = com.bank.app, com.maps.app")
        assertThat(out.indexOf("ExcludedApplications")).isLessThan(out.indexOf("[Peer]"))
        assertThat(out).contains("PrivateKey = cNb7vK3pQ9LmR2sT8uW1xY4zA6bC0dE5fG7hI9jK2M=")
        assertThat(out).doesNotContain("IncludedApplications")
    }

    @Test
    fun mergesExistingLineAndDropsInvalidNames() {
        val raw = sample.replace(
            "Address = 172.16.0.2/32",
            "Address = 172.16.0.2/32\nExcludedApplications = com.maps.app, not a package",
        )
        val once = SplitTunnel.apply(raw, listOf("com.bank.app", "com.maps.app", "../evil", "x"))
        val twice = SplitTunnel.apply(once, listOf("com.mail.app"))
        assertThat(once).contains("ExcludedApplications = com.bank.app, com.maps.app")
        assertThat(twice).contains("ExcludedApplications = com.bank.app, com.mail.app, com.maps.app")
        assertThat(twice.split("ExcludedApplications").size - 1).isEqualTo(1)
    }

    @Test
    fun keepDropsMissingPackagesAndOwnApp() {
        val raw = sample.replace(
            "Address = 172.16.0.2/32",
            "Address = 172.16.0.2/32\nExcludedApplications = com.gone.app, com.stay.app",
        )
        val installed = setOf("com.stay.app", "com.bank.app")
        val out = SplitTunnel.apply(raw, listOf("com.bank.app", "com.nimbus.vpn")) { it in installed }
        assertThat(out).contains("ExcludedApplications = com.bank.app, com.stay.app")
        assertThat(out).doesNotContain("com.gone.app")
        assertThat(out).doesNotContain("com.nimbus.vpn")
    }

    @Test
    fun removesIncludedApplicationsWhenExclusionsAreWritten() {
        val raw = sample.replace(
            "Address = 172.16.0.2/32",
            "Address = 172.16.0.2/32\nIncludedApplications = com.only.browser",
        )
        val out = SplitTunnel.apply(raw, listOf("com.bank.app"))
        assertThat(out).contains("ExcludedApplications = com.bank.app")
        assertThat(out).doesNotContain("IncludedApplications")
        assertThat(SplitTunnel.apply(raw, emptyList())).contains("IncludedApplications = com.only.browser")
    }
}
