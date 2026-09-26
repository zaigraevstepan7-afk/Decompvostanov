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

    @Test
    fun picksActivationLink() {
        assertThat(AccessApi.urlFor(1)).isEqualTo(
            "https://relay.tribukvy.ltd/activate/eda7da9c3c724702",
        )
        assertThat(AccessApi.urlFor(2)).isEqualTo(
            "https://relay.tribukvy.ltd/activate/047e68e90d19488b",
        )
        assertThat(AccessApi.urlFor(0)).isEqualTo(AccessApi.URL_1)
    }
}
