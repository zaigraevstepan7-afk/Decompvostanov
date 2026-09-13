package com.nimbus.vpn

import com.google.common.truth.Truth.assertThat
import com.nimbus.vpn.data.AccessApi
import org.junit.Test

class AccessApiTest {
    @Test
    fun acceptsActivatedHtml() {
        assertThat(AccessApi.isActivated("Доступ активирован", 200)).isTrue()
        assertThat(AccessApi.isActivated("<html>activated</html>", 200)).isTrue()
        assertThat(AccessApi.isActivated("ok", 200)).isTrue()
    }

    @Test
    fun rejectsServerError() {
        assertThat(AccessApi.isActivated("Доступ", 500)).isFalse()
    }
}
