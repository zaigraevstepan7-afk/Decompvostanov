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
    val thoughts: String = "",
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
        val resolved = GeminiModels.resolve(model)
        var lastError: String? = null
        for (wireId in resolved.wireIds) {
            var currentTools = tools
            var strippedGrounding = false
            while (true) {
                val envelope = buildEnvelope(
                    projectId = session.projectId,
                    wireId = wireId,
                    thinkingLevel = resolved.thinkingLevel,
                    systemInstruction = systemInstruction,
                    contents = contents,
                    tools = currentTools,
                )
                val url = "$baseUrl/${AntigravityOAuth.API_VERSION}:generateContent"
                val request = Request.Builder()
                    .url(url)
                    .header("Authorization", "Bearer ${session.accessToken}")
                    .header("Content-Type", "application/json")
                    .header("User-Agent", AntigravityOAuth.USER_AGENT)
                    .post(envelope.toString().toRequestBody(JSON))
                    .build()
                val outcome = http.newCall(request).execute().use { response ->
                    val text = response.body?.string().orEmpty()
                    Triple(response.isSuccessful, response.code, text)
                }
                val (ok, code, text) = outcome
                if (ok) {
                    return parseReply(text)
                }
                lastError = "Antigravity $code: $text"
                if (!strippedGrounding && shouldDropGrounding(code, text) && hasGrounding(currentTools)) {
                    currentTools = stripGrounding(currentTools)
                    strippedGrounding = true
                    continue
                }
                if (!isNotFound(code, text)) {
                    error(lastError!!)
                }
                break
            }
        }
        error(lastError ?: "Antigravity 404: модель ${resolved.pickerId} не найдена")
    }

    fun buildEnvelope(
        projectId: String,
        wireId: String,
        thinkingLevel: String?,
        systemInstruction: String,
        contents: List<ContentTurn>,
        tools: JsonArray,
    ): JsonObject = buildJsonObject {
        put("project", projectId)
        put("model", wireId)
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
                    put("includeThoughts", true)
                    if (!thinkingLevel.isNullOrBlank()) {
                        put("thinkingLevel", thinkingLevel)
                    }
                })
            })
            if (tools.isNotEmpty()) {
                put("tools", tools)
            }
        })
    }

    private fun isNotFound(code: Int, body: String): Boolean =
        code == 404 || body.contains("NOT_FOUND") || body.contains("Requested entity was not found")

    fun hasGrounding(tools: JsonArray): Boolean =
        tools.any { item ->
            val obj = item as? JsonObject ?: return@any false
            obj.containsKey("googleSearch") || obj.containsKey("urlContext") || obj.containsKey("googleSearchRetrieval")
        }

    fun stripGrounding(tools: JsonArray): JsonArray =
        JsonArray(
            tools.filterNot { item ->
                val obj = item as? JsonObject ?: return@filterNot false
                obj.containsKey("googleSearch") || obj.containsKey("urlContext") || obj.containsKey("googleSearchRetrieval")
            },
        )

    private fun shouldDropGrounding(code: Int, body: String): Boolean {
        if (code != 400 && !body.contains("INVALID_ARGUMENT")) return false
        val lower = body.lowercase()
        return lower.contains("googlesearch") ||
            lower.contains("urlcontext") ||
            lower.contains("google_search") ||
            lower.contains("url_context") ||
            lower.contains("tool") ||
            lower.contains("grounding")
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
            if (isThoughtPart(part)) null else part["text"]?.jsonPrimitive?.content
        }.joinToString("")
        val thoughts = parts.mapNotNull { part ->
            if (!isThoughtPart(part)) null else part["text"]?.jsonPrimitive?.content
        }.joinToString("\n").trim()
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
        return ModelReply(
            parts = parts,
            finishReason = finish,
            text = text,
            functionCalls = calls,
            thoughts = thoughts,
        )
    }

    private fun isThoughtPart(part: JsonObject): Boolean {
        val flag = part["thought"] ?: return false
        return when (flag) {
            is JsonPrimitive -> flag.content.equals("true", ignoreCase = true) || flag.toString() == "true"
            else -> false
        }
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

fun userTurn(text: String, extraParts: List<JsonObject> = emptyList()): ContentTurn {
    val parts = buildList {
        if (text.isNotBlank()) add(buildJsonObject { put("text", text) })
        addAll(extraParts)
        if (isEmpty()) add(buildJsonObject { put("text", "(пустое сообщение)") })
    }
    return ContentTurn("user", parts)
}

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
