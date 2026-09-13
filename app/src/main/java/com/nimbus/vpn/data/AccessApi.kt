package com.nimbus.vpn.data

import java.net.HttpURLConnection
import java.net.URL

object AccessApi {
    const val URL = "https://relay.tribukvy.ltd/activate/eda7da9c3c724702"

    fun isActivated(body: String, code: Int): Boolean {
        if (code !in 200..399) return false
        val text = body.lowercase()
        return text.contains("активир") ||
            text.contains("доступ") ||
            text.contains("activat") ||
            text.contains("success") ||
            code in 200..299
    }

    fun activate(url: String = URL): String {
        val connection = (URL(url).openConnection() as HttpURLConnection).apply {
            connectTimeout = 12_000
            readTimeout = 15_000
            requestMethod = "GET"
            instanceFollowRedirects = true
            setRequestProperty("Accept", "text/html,application/json")
            setRequestProperty("User-Agent", "BozyaVPN/1.0.7")
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
