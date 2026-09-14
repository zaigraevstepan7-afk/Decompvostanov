package com.nimbus.vpn.data

import java.net.HttpURLConnection
import java.net.URL

object AccessApi {
    const val URL_1 = "https://relay.tribukvy.ltd/activate/eda7da9c3c724702"
    const val URL_2 = "https://relay.tribukvy.ltd/activate/047e68e90d19488b"

    fun urlFor(slot: Int): String = if (slot == 2) URL_2 else URL_1

    fun isActivated(body: String, code: Int): Boolean {
        if (code !in 200..399) return false
        val text = body.lowercase()
        return text.contains("активир") ||
            text.contains("доступ") ||
            text.contains("activat") ||
            text.contains("success") ||
            code in 200..299
    }

    fun activate(url: String = URL_1): String {
        val connection = (URL(url).openConnection() as HttpURLConnection).apply {
            connectTimeout = 12_000
            readTimeout = 15_000
            requestMethod = "GET"
            instanceFollowRedirects = true
            setRequestProperty("Accept", "text/html,application/json")
            setRequestProperty("User-Agent", "BozyaVPN/1.0.9")
        }
        try {
            val code = connection.responseCode
            val stream = if (code in 200..399) connection.inputStream else connection.errorStream
            val body = stream?.bufferedReader()?.use { it.readText() }.orEmpty()
            require(isActivated(body, code)) { "Не удалось активировать доступ" }
            return "Активирован"
        } finally {
            connection.disconnect()
        }
    }
}
