package com.nimbus.vpn

import com.google.common.truth.Truth.assertThat
import com.nimbus.vpn.tunnel.KeepAlivePolicy
import com.nimbus.vpn.tunnel.SessionPolicy
import org.junit.Test

class KeepAlivePolicyTest {
    @Test
    fun namedServerStaysInTheForeground() {
        val plan = KeepAlivePolicy.plan(
            KeepAlivePolicy.Command(
                stopRequested = false,
                title = "Польша",
                savedTitle = null,
                sessionWanted = true,
                restarted = false,
            ),
        )
        assertThat(plan.showForeground).isTrue()
        assertThat(plan.sticky).isTrue()
        assertThat(plan.stop).isFalse()
        assertThat(plan.title).isEqualTo("Польша")
        assertThat(plan.title).isNotEqualTo(KeepAlivePolicy.FORBIDDEN_TITLE)
    }

    @Test
    fun restartWithoutExtrasRestoresTheSavedServer() {
        val plan = KeepAlivePolicy.plan(
            KeepAlivePolicy.Command(
                stopRequested = false,
                title = null,
                savedTitle = "Nikitok",
                sessionWanted = true,
                restarted = true,
            ),
        )
        assertThat(plan.showForeground).isTrue()
        assertThat(plan.sticky).isTrue()
        assertThat(plan.stop).isFalse()
        assertThat(plan.restoreTunnel).isTrue()
        assertThat(plan.title).isEqualTo("Nikitok")
        assertThat(plan.title).isNotEqualTo(KeepAlivePolicy.FORBIDDEN_TITLE)
    }

    @Test
    fun restartWithNothingToRestoreDoesNotShowReady() {
        val plan = KeepAlivePolicy.plan(
            KeepAlivePolicy.Command(
                stopRequested = false,
                title = null,
                savedTitle = null,
                sessionWanted = false,
                restarted = true,
            ),
        )
        assertThat(plan.stop).isTrue()
        assertThat(plan.sticky).isFalse()
        assertThat(plan.title).isEqualTo(KeepAlivePolicy.IDLE_TITLE)
        assertThat(plan.title).isNotEqualTo(KeepAlivePolicy.FORBIDDEN_TITLE)
        assertThat(KeepAlivePolicy.usable("Ready")).isNull()
        assertThat(KeepAlivePolicy.usable(" ready ")).isNull()
    }

    @Test
    fun stopActionDoesNotComeBack() {
        val plan = KeepAlivePolicy.plan(
            KeepAlivePolicy.Command(
                stopRequested = true,
                title = "Польша",
                savedTitle = "Польша",
                sessionWanted = true,
                restarted = false,
            ),
        )
        assertThat(plan.stop).isTrue()
        assertThat(plan.sticky).isFalse()
        assertThat(plan.showForeground).isFalse()
        assertThat(plan.restoreTunnel).isFalse()
    }

    @Test
    fun droppedTunnelKeepsTheProcessAlive() {
        assertThat(
            SessionPolicy.keepForeground(userStopped = false, userInitiated = false, autoConnect = false),
        ).isTrue()
        assertThat(
            SessionPolicy.keepForeground(userStopped = true, userInitiated = false, autoConnect = true),
        ).isFalse()
        assertThat(
            SessionPolicy.keepForeground(userStopped = false, userInitiated = true, autoConnect = false),
        ).isFalse()
        assertThat(
            SessionPolicy.keepForeground(userStopped = false, userInitiated = true, autoConnect = true),
        ).isTrue()
    }
}
