package com.antigravity.core.auth

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.net.InetAddress
import java.net.ServerSocket
import java.net.Socket
import java.net.URI
import java.nio.charset.StandardCharsets
import java.util.concurrent.TimeUnit

data class OAuthCallback(val code: String, val state: String)

/**
 * Local loopback server used by the official Antigravity / CLIProxyAPI login.
 * Google redirects the browser to http://127.0.0.1:51121/oauth-callback.
 */
class OAuthCallbackServer(
    private val port: Int = AntigravityOAuth.CALLBACK_PORT,
) {
    fun awaitCode(expectedState: String, timeoutMs: Long = 180_000): OAuthCallback {
        ServerSocket(port, 1, InetAddress.getByName("127.0.0.1")).use { server ->
            server.soTimeout = timeoutMs.toInt().coerceAtLeast(1_000)
            val socket = server.accept()
            socket.use {
                val requestLine = BufferedReader(InputStreamReader(it.getInputStream(), StandardCharsets.UTF_8))
                    .readLine() ?: error("Пустой HTTP-запрос на OAuth callback")
                val path = requestLine.split(" ").getOrNull(1) ?: "/"
                val uri = URI("http://127.0.0.1$path")
                val query = parseQuery(uri.rawQuery.orEmpty())
                val error = query["error"]
                val code = query["code"]
                val state = query["state"]
                val ok = error == null && !code.isNullOrBlank() && state == expectedState
                writeHtml(it, ok, error)
                if (!ok) {
                    error(error ?: "OAuth callback без code/state (state mismatch=${state != expectedState})")
                }
                return OAuthCallback(code = code!!, state = state!!)
            }
        }
    }

    private fun writeHtml(socket: Socket, ok: Boolean, error: String?) {
        val title = if (ok) "Antigravity" else "Ошибка входа"
        val body = if (ok) {
            "Вход через Google выполнен. Можно вернуться в приложение."
        } else {
            "Не удалось войти: ${error ?: "неизвестный ответ Google"}"
        }
        val html = """
            <!doctype html>
            <html lang="ru"><head><meta charset="utf-8"><title>$title</title>
            <style>
              body{font-family:sans-serif;background:#0b0f14;color:#e8eef5;display:flex;min-height:100vh;align-items:center;justify-content:center}
              .card{background:#141a22;padding:28px 32px;border-radius:16px;max-width:420px}
              h1{color:#7cffb2;font-size:20px}
            </style></head>
            <body><div class="card"><h1>$title</h1><p>$body</p></div></body></html>
        """.trimIndent()
        val bytes = html.toByteArray(StandardCharsets.UTF_8)
        PrintWriter(socket.getOutputStream(), true, StandardCharsets.UTF_8).apply {
            println("HTTP/1.1 ${if (ok) 200 else 400} OK")
            println("Content-Type: text/html; charset=utf-8")
            println("Content-Length: ${bytes.size}")
            println("Connection: close")
            println()
            flush()
        }
        socket.getOutputStream().write(bytes)
        socket.getOutputStream().flush()
        TimeUnit.MILLISECONDS.sleep(150)
    }

    private fun parseQuery(raw: String): Map<String, String> {
        if (raw.isBlank()) return emptyMap()
        return raw.split("&").mapNotNull { part ->
            val idx = part.indexOf('=')
            if (idx <= 0) return@mapNotNull null
            val key = java.net.URLDecoder.decode(part.substring(0, idx), "UTF-8")
            val value = java.net.URLDecoder.decode(part.substring(idx + 1), "UTF-8")
            key to value
        }.toMap()
    }
}
