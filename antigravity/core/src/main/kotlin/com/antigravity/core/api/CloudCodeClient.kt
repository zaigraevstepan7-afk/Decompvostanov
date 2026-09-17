package com.antigravity.core.api

import com.antigravity.core.auth.AntigravityOAuth
import com.antigravity.core.auth.AntigravitySession
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.put
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import java.util.UUID
import java.util.concurrent.TimeUnit

data class ContentTurn(val role: String, val parts: List<JsonObject>)

data class ModelReply(
    val parts: List<JsonObject>,
    val finishReason: String?,
    val text: String,
    val functionCalls: List<FunctionCall>,
)

data class FunctionCall(
    val name: String,
    val args: JsonObject,
    val id: String?,
)

interface LlmClient {
    fun generate(
        session: AntigravitySession,
        model: String,
        systemInstruction: String,
        contents: List<ContentTurn>,
        tools: JsonArray,
    ): ModelReply
}

class CloudCodeClient(
    private val http: OkHttpClient = defaultHttp(),
    private val json: Json = Json { ignoreUnknownKeys = true },
    private val baseUrl: String = AntigravityOAuth.GENERATE_ENDPOINT,
) : LlmClient {
    override fun generate(
        session: AntigravitySession,
        model: String,
        systemInstruction: String,
        contents: List<ContentTurn>,
        tools: JsonArray,
    ): ModelReply {
        val envelope = buildJsonObject {
            put("project", session.projectId)
            put("model", model)
            put("requestType", "agent")
            put("userAgent", "antigravity")
            put("requestId", "agent-${UUID.randomUUID()}")
            put("request", buildJsonObject {
                put("contents", buildJsonArray {
                    contents.forEach { turn ->
                        add(buildJsonObject {
                            put("role", turn.role)
                            put("parts", JsonArray(turn.parts))
                        })
                    }
                })
                put("systemInstruction", buildJsonObject {
                    put("parts", buildJsonArray {
                        add(buildJsonObject { put("text", systemInstruction) })
                    })
                })
                put("generationConfig", buildJsonObject {
                    put("maxOutputTokens", 8192)
                    put("temperature", 0.4)
                    put("thinkingConfig", buildJsonObject {
                        put("includeThoughts", false)
                    })
                })
                if (tools.isNotEmpty()) {
                    put("tools", tools)
                }
            })
        }
        val url = "$baseUrl/${AntigravityOAuth.API_VERSION}:generateContent"
        val request = Request.Builder()
            .url(url)
            .header("Authorization", "Bearer ${session.accessToken}")
            .header("Content-Type", "application/json")
            .header("User-Agent", AntigravityOAuth.USER_AGENT)
            .post(envelope.toString().toRequestBody(JSON))
            .build()
        http.newCall(request).execute().use { response ->
            val text = response.body?.string().orEmpty()
            if (!response.isSuccessful) {
                error("Antigravity ${response.code}: $text")
            }
            return parseReply(text)
        }
    }

    fun parseReply(raw: String): ModelReply {
        val root = json.parseToJsonElement(raw).jsonObject
        val response = root["response"]?.jsonObject ?: root
        val candidate = response["candidates"]?.jsonArray?.firstOrNull()?.jsonObject
            ?: error("Пустой ответ модели: $raw")
        val content = candidate["content"]?.jsonObject
        val parts = content?.get("parts")?.jsonArray?.map { it.jsonObject } ?: emptyList()
        val finish = candidate["finishReason"]?.jsonPrimitive?.content
        val text = parts.mapNotNull { part ->
            val thought = part["thought"]?.toString() == "true"
            if (thought) null else part["text"]?.jsonPrimitive?.content
        }.joinToString("")
        val calls = parts.mapNotNull { part ->
            val call = part["functionCall"]?.jsonObject ?: return@mapNotNull null
            val name = call["name"]?.jsonPrimitive?.content ?: return@mapNotNull null
            val args = when (val rawArgs = call["args"]) {
                is JsonObject -> rawArgs
                is JsonPrimitive -> runCatching {
                    json.parseToJsonElement(rawArgs.content).jsonObject
                }.getOrDefault(buildJsonObject { })
                else -> buildJsonObject { }
            }
            FunctionCall(name = name, args = args, id = call["id"]?.jsonPrimitive?.content)
        }
        return ModelReply(parts = parts, finishReason = finish, text = text, functionCalls = calls)
    }

    companion object {
        private val JSON = "application/json; charset=utf-8".toMediaType()

        fun defaultHttp(): OkHttpClient = OkHttpClient.Builder()
            .protocols(listOf(Protocol.HTTP_1_1))
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(180, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .build()
    }
}

fun textTurn(role: String, text: String): ContentTurn =
    ContentTurn(role, listOf(buildJsonObject { put("text", text) }))

fun modelPartsTurn(parts: List<JsonObject>): ContentTurn = ContentTurn("model", parts)

fun functionResponseTurn(name: String, id: String?, result: String): ContentTurn {
    val payload = buildJsonObject {
        put(
            "functionResponse",
            buildJsonObject {
                put("name", name)
                if (!id.isNullOrBlank()) put("id", id)
                put("response", buildJsonObject { put("output", result.take(80_000)) })
            },
        )
    }
    return ContentTurn("user", listOf(payload))
}

fun jsonString(element: JsonElement?): String? =
    when (element) {
        null, JsonNull -> null
        is JsonPrimitive -> element.content
        else -> element.toString().trim('"')
    }
