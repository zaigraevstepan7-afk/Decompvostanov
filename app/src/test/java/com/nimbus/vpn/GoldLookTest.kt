package com.nimbus.vpn

import com.google.common.truth.Truth.assertThat
import com.nimbus.vpn.ui.home.GoldLook
import org.junit.Test

class GoldLookTest {
    @Test
    fun goldRimRunsSlowerThanTheMarble() {
        assertThat(GoldLook.SPEED).isGreaterThan(0.03f)
        assertThat(GoldLook.SPEED).isLessThan(0.07f)
        assertThat(GoldLook.AGSL).contains("smoothstep(42.0, 0.0, edge)")
        assertThat(GoldLook.AGSL).contains("float3(1.0, 0.84, 0.38)")
    }
}
