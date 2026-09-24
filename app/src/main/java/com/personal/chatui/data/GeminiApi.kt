package com.personal.chatui.data

import org.json.JSONArray
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import java.util.Base64

object GeminiApi {
    const val MODEL = "gemini-3.8-flash"

    fun complete(
        apiKey: String,
        history: List<ChatMessage>,
        deep: Boolean,
        jpeg: ByteArray?,
    ): String {
        val url = URL(
            "https://generativelanguage.googleapis.com/v1beta/models/$MODEL:generateContent?key=$apiKey",
        )
        val attempts = listOf(
            body(history, deep, jpeg, search = true),
            body(history, deep = false, jpeg, search = true),
            body(history, deep = false, jpeg, search = false),
        )
        var lastCode = 0
        var lastBody = ""
        for (payload in attempts) {
            val reply = post(url, payload)
            if (reply.code in 200..299) return reply.text
            lastCode = reply.code
            lastBody = reply.text
            if (reply.code != 400) break
        }
        val message = runCatching {
            JSONObject(lastBody).getJSONObject("error").getString("message")
        }.getOrNull()
        throw IllegalStateException(message ?: "HTTP $lastCode")
    }

    private fun body(history: List<ChatMessage>, deep: Boolean, jpeg: ByteArray?, search: Boolean): String {
        val contents = JSONArray()
        history.forEachIndexed { index, message ->
            val parts = JSONArray()
            val lastUser = message.fromUser && index == history.lastIndex
            if (lastUser && jpeg != null && jpeg.isNotEmpty()) {
                parts.put(
                    JSONObject()
                        .put(
                            "inlineData",
                            JSONObject()
                                .put("mimeType", "image/jpeg")
                                .put("data", Base64.getEncoder().encodeToString(jpeg)),
                        ),
                )
            }
            parts.put(JSONObject().put("text", message.text))
            contents.put(
                JSONObject()
                    .put("role", if (message.fromUser) "user" else "model")
                    .put("parts", parts),
            )
        }
        val root = JSONObject()
            .put("contents", contents)
            .put(
                "systemInstruction",
                JSONObject().put(
                    "parts",
                    JSONArray().put(
                        JSONObject().put(
                            "text",
                            "Ты Gemini 3.8 Flash в личном чате. Отвечай на языке пользователя. " +
                                "Можно искать в интернете и отвечать по найденному. " +
                                "Не проси пароли и не проси ключи от чужих аккаунтов.",
                        ),
                    ),
                ),
            )
        if (search) {
            root.put("tools", JSONArray().put(JSONObject().put("google_search", JSONObject())))
        }
        if (deep) {
            root.put(
                "generationConfig",
                JSONObject().put("thinkingConfig", JSONObject().put("thinkingBudget", 2048)),
            )
        }
        return root.toString()
    }

    private fun post(url: URL, payload: String): Reply {
        val connection = (url.openConnection() as HttpURLConnection).apply {
            requestMethod = "POST"
            connectTimeout = 20_000
            readTimeout = 60_000
            doOutput = true
            setRequestProperty("Content-Type", "application/json; charset=utf-8")
        }
        connection.outputStream.use { it.write(payload.toByteArray(Charsets.UTF_8)) }
        val code = connection.responseCode
        val stream = if (code in 200..299) connection.inputStream else connection.errorStream
        val raw = stream?.bufferedReader()?.use { it.readText() }.orEmpty()
        connection.disconnect()
        if (code !in 200..299) {
            if (code == 400) return Reply(code, raw)
            val message = runCatching {
                JSONObject(raw).getJSONObject("error").getString("message")
            }.getOrNull()
            throw IllegalStateException(message ?: "HTTP $code")
        }
        return Reply(code, readText(raw))
    }

    private fun readText(raw: String): String {
        val root = JSONObject(raw)
        val candidates = root.optJSONArray("candidates") ?: return "Модель ничего не вернула."
        if (candidates.length() == 0) return "Модель ничего не вернула."
        val parts = candidates.getJSONObject(0)
            .getJSONObject("content")
            .getJSONArray("parts")
        val text = buildString {
            for (i in 0 until parts.length()) {
                val part = parts.getJSONObject(i)
                if (part.optBoolean("thought")) continue
                val chunk = part.optString("text")
                if (chunk.isNotBlank()) {
                    if (isNotEmpty()) append("\n")
                    append(chunk)
                }
            }
        }
        return text.ifBlank { "Модель ничего не вернула." }
    }

    private data class Reply(val code: Int, val text: String)
}
