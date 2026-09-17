package com.antigravity.core.auth

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class OAuthCallbackServerTest {
    @Test
    fun receivesCodeFromLoopbackRedirect() {
        val server = OAuthCallbackServer(port = 0) // can't use 0 easily with our ServerSocket(port)
        // Bind an ephemeral port by constructing ServerSocket ourselves via a known free port.
        val probe = java.net.ServerSocket(0)
        val port = probe.localPort
        probe.close()
        val expected = "state-token"
        val executor = Executors.newSingleThreadExecutor()
        val future = executor.submit<OAuthCallback> {
            OAuthCallbackServer(port).awaitCode(expected, timeoutMs = 8_000)
        }
        Thread.sleep(150)
        val url = URL("http://127.0.0.1:$port/oauth-callback?code=AUTHCODE&state=$expected")
        val connection = url.openConnection() as HttpURLConnection
        connection.connectTimeout = 3000
        connection.readTimeout = 3000
        connection.requestMethod = "GET"
        val body = BufferedReader(InputStreamReader(connection.inputStream)).readText()
        assertEquals(200, connection.responseCode)
        assertTrue(body.contains("Вход через Google выполнен"))
        val callback = future.get(5, TimeUnit.SECONDS)
        assertEquals("AUTHCODE", callback.code)
        assertEquals(expected, callback.state)
        executor.shutdownNow()
    }
}
