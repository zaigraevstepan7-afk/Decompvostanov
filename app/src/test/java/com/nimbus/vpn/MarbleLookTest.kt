package com.nimbus.vpn

import com.google.common.truth.Truth.assertThat
import com.nimbus.vpn.ui.home.MarbleLook
import com.nimbus.vpn.ui.home.marblePhase
import org.junit.Test

class MarbleLookTest {
    @Test
    fun marbleDriftsSlowerThanThePack() {
        assertThat(MarbleLook.SPEED).isLessThan(0.09f)
        assertThat(MarbleLook.SPEED).isGreaterThan(0.01f)
        assertThat(MarbleLook.AGSL).contains("pow(1.0 - clamp(vein, 0.0, 1.0), 9.5)")
    }

    @Test
    fun eachServerGetsItsOwnVeinOffset() {
        assertThat(marblePhase("sec:EU")).isNotEqualTo(marblePhase("sec:AM"))
        assertThat(marblePhase("sec:EU")).isEqualTo(marblePhase("sec:EU"))
    }
}
