package com.antigravity.core.auth

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.Socket
import java.net.URL
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class OAuthCallbackServerTest {
    @Test
    fun parseLoopbackRedirect() {
        val url = "http://127.0.0.1:51121/oauth-callback?code=AUTH&state=abc"
        val parsed = parseOAuthRedirect(url, "abc")
        assertEquals("AUTH", parsed?.code)
        assertTrue(isLoopbackRedirect(url))
        assertNull(parseOAuthRedirect(url, "other"))
    }

    @Test
    fun receivesCodeFromLoopbackRedirect() {
        val probe = java.net.ServerSocket(0)
        val port = probe.localPort
        probe.close()
        val expected = "state-token"
        val executor = Executors.newSingleThreadExecutor()
        val future = executor.submit<OAuthCallback> {
            OAuthCallbackServer(port).awaitCode(expected, timeoutMs = 8_000)
        }
        Thread.sleep(200)
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

    @Test
    fun ignoresProbeThenAcceptsCodeAfterBrokenPipe() {
        val probe = java.net.ServerSocket(0)
        val port = probe.localPort
        probe.close()
        val expected = "st"
        val executor = Executors.newSingleThreadExecutor()
        val future = executor.submit<OAuthCallback> {
            OAuthCallbackServer(port).awaitCode(expected, timeoutMs = 8_000)
        }
        Thread.sleep(200)
        Socket("127.0.0.1", port).use { socket ->
            socket.getOutputStream().write("GET /favicon.ico HTTP/1.1\r\nHost: 127.0.0.1\r\n\r\n".toByteArray())
            socket.getOutputStream().flush()
        }
        Thread.sleep(120)
        Socket("127.0.0.1", port).use { socket ->
            val req = "GET /oauth-callback?code=XYZ&state=$expected HTTP/1.1\r\nHost: 127.0.0.1\r\n\r\n"
            socket.getOutputStream().write(req.toByteArray())
            socket.getOutputStream().flush()
        }
        val callback = future.get(5, TimeUnit.SECONDS)
        assertEquals("XYZ", callback.code)
        executor.shutdownNow()
    }
}
