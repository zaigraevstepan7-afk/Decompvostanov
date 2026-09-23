package com.nimbus.vpn

import com.google.common.truth.Truth.assertThat
import com.nimbus.vpn.ui.home.MarbleLook
import com.nimbus.vpn.ui.home.marbleMotion
import kotlin.math.abs
import org.junit.Test

class MarbleLookTest {
    @Test
    fun marbleKeepsAGentleClock() {
        assertThat(MarbleLook.SPEED).isGreaterThan(0.05f)
        assertThat(MarbleLook.SPEED).isAtMost(0.09f)
        assertThat(MarbleLook.AGSL).contains("uv * 2.35 + iShift")
    }

    @Test
    fun serversDoNotShareOneClock() {
        val europe = marbleMotion("sec:EU")
        val america = marbleMotion("sec:AM")
        val asia = marbleMotion("sec:AS")
        assertThat(abs(europe.phase - america.phase)).isGreaterThan(0.5f)
        assertThat(europe.rate).isNotEqualTo(america.rate)
        assertThat(europe.shiftX).isNotEqualTo(asia.shiftX)
        assertThat(europe.shiftY).isNotEqualTo(asia.shiftY)
        assertThat(marbleMotion("sec:EU")).isEqualTo(europe)
    }
}
