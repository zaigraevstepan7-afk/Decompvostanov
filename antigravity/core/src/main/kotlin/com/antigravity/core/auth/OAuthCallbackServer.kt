package com.antigravity.core.auth

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.InetSocketAddress
import java.net.ServerSocket
import java.net.Socket
import java.net.SocketException
import java.net.SocketTimeoutException
import java.net.URI
import java.nio.charset.StandardCharsets

data class OAuthCallback(val code: String, val state: String)

fun parseQuery(raw: String): Map<String, String> {
    if (raw.isBlank()) return emptyMap()
    return raw.split("&").mapNotNull { part ->
        val idx = part.indexOf('=')
        if (idx <= 0) return@mapNotNull null
        val key = java.net.URLDecoder.decode(part.substring(0, idx), "UTF-8")
        val value = java.net.URLDecoder.decode(part.substring(idx + 1), "UTF-8")
        key to value
    }.toMap()
}

fun isLoopbackRedirect(url: String): Boolean {
    val lower = url.lowercase()
    val loopback = lower.startsWith("http://127.0.0.1") ||
        lower.startsWith("http://localhost") ||
        lower.startsWith("http://[::1]")
    return loopback && lower.contains("/oauth-callback")
}

fun parseOAuthRedirect(url: String, expectedState: String? = null): OAuthCallback? {
    if (!isLoopbackRedirect(url)) return null
    val uri = runCatching { URI(url) }.getOrNull() ?: return null
    val query = parseQuery(uri.rawQuery.orEmpty())
    val code = query["code"] ?: return null
    val state = query["state"] ?: return null
    if (expectedState != null && state != expectedState) return null
    if (query["error"] != null) return null
    return OAuthCallback(code, state)
}

/**
 * Local loopback server used by Antigravity / CLIProxyAPI login.
 * Chrome on Android often opens extra sockets (favicon/preload) and then
 * closes the callback connection before reading the HTML ("Broken pipe").
 * We keep accepting until a real code arrives and never fail the login
 * just because the response write was reset.
 */
class OAuthCallbackServer(
    private val port: Int = AntigravityOAuth.CALLBACK_PORT,
) {
    fun awaitCode(expectedState: String, timeoutMs: Long = 180_000): OAuthCallback {
        val deadline = System.currentTimeMillis() + timeoutMs
        ServerSocket().use { server ->
            server.reuseAddress = true
            server.bind(InetSocketAddress("0.0.0.0", port), 64)
            while (System.currentTimeMillis() < deadline) {
                server.soTimeout = (deadline - System.currentTimeMillis()).toInt().coerceAtLeast(50)
                val socket = try {
                    server.accept()
                } catch (_: SocketTimeoutException) {
                    break
                }
                val requestUrl = socket.use { sock ->
                    val line = runCatching { readRequestLine(sock) }.getOrNull()
                    val path = line?.split(" ")?.getOrNull(1) ?: "/"
                    val full = if (path.startsWith("http")) path else "http://127.0.0.1:$port$path"
                    val parsed = parseOAuthRedirect(full, expectedState)
                    val query = parseQuery(runCatching { URI(full).rawQuery.orEmpty() }.getOrDefault(""))
                    val oauthError = query["error"]
                    runCatching { writeHtml(sock, parsed != null, oauthError) }
                    if (oauthError != null) {
                        error("Google OAuth: $oauthError")
                    }
                    parsed
                }
                if (requestUrl != null) return requestUrl
            }
        }
        error("Таймаут входа Google. Нажмите Sign in на предупреждении Google и дождитесь возврата в приложение.")
    }

    private fun readRequestLine(socket: Socket): String {
        val reader = BufferedReader(InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8))
        val requestLine = reader.readLine() ?: error("Пустой HTTP-запрос на OAuth callback")
        while (true) {
            val header = reader.readLine() ?: break
            if (header.isEmpty()) break
        }
        return requestLine
    }

    private fun writeHtml(socket: Socket, ok: Boolean, error: String?) {
        val title = if (ok) "Вход выполнен" else "Ошибка входа"
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
        val header = buildString {
            append("HTTP/1.1 ${if (ok) 200 else 400} OK\r\n")
            append("Content-Type: text/html; charset=utf-8\r\n")
            append("Content-Length: ${bytes.size}\r\n")
            append("Connection: close\r\n\r\n")
        }.toByteArray(StandardCharsets.UTF_8)
        try {
            val out = socket.getOutputStream()
            out.write(header)
            out.write(bytes)
            out.flush()
        } catch (_: SocketException) {
            // Chrome Custom Tabs often reset localhost after the redirect. Code is already parsed.
        }
    }
}
