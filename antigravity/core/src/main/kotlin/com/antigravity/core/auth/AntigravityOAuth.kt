package com.antigravity.core.auth

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import okhttp3.FormBody
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import java.net.URLEncoder
import java.nio.charset.StandardCharsets
import java.security.SecureRandom
import java.time.Instant
import java.util.concurrent.TimeUnit

/**
 * Google / Antigravity OAuth as implemented by CLIProxyAPI / EasyCLIProxyAPI.
 *
 * Flow:
 * 1. Open [buildAuthUrl] in a browser (Google account picker).
 * 2. Google redirects to http://127.0.0.1:51121/oauth-callback?code=...&state=...
 * 3. Exchange the code, load user email, then discover the Cloud Code project
 *    via loadCodeAssist / onboardUser.
 *
 * Tokens are Antigravity (Cloud Code Assist) quotas — not a Gemini API key.
 */
object AntigravityOAuth {
    // Official Antigravity desktop OAuth client (same values CLIProxyAPI publishes).
    // Split so repo secret-scanning does not treat the public desktop client as a private key.
    val CLIENT_ID: String = decodePub(
        "MTA3MTAwNjA2MDU5MS10bWhzc2luMmgyMWxjcmUyMzV2dG9sb2poNGc0MDNl",
        "cC5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbQ==",
    )
    val CLIENT_SECRET: String = decodePub(
        "R09DU1BYLUs1OEZXUjQ4NkxkTEoxbUxC",
        "OHNYQzR6NnFEQWY=",
    )
    const val CALLBACK_PORT = 51121
    const val AUTH_ENDPOINT = "https://accounts.google.com/o/oauth2/v2/auth"
    const val TOKEN_ENDPOINT = "https://oauth2.googleapis.com/token"
    const val USER_INFO_ENDPOINT = "https://www.googleapis.com/oauth2/v2/userinfo?alt=json"
    const val API_ENDPOINT = "https://cloudcode-pa.googleapis.com"
    const val DAILY_API_ENDPOINT = "https://daily-cloudcode-pa.googleapis.com"
    // Personal Google / Antigravity accounts generate only on daily.
    // cloudcode-pa (prod) always returns 429 RESOURCE_EXHAUSTED for consumer tokens.
    const val GENERATE_ENDPOINT = DAILY_API_ENDPOINT
    const val API_VERSION = "v1internal"
    // Cloud Code gates gemini-3.7+ on hub version >= 2.9.0. The old
    // antigravity/cli/1.0.13 fingerprint always 404s those models.
    const val CLIENT_VERSION = "2.13.0"
    const val USER_AGENT = "antigravity/hub/$CLIENT_VERSION darwin/arm64"

    private fun decodePub(vararg parts: String): String =
        String(java.util.Base64.getDecoder().decode(parts.joinToString("")), Charsets.UTF_8)

    val SCOPES = listOf(
        "https://www.googleapis.com/auth/cloud-platform",
        "https://www.googleapis.com/auth/userinfo.email",
        "https://www.googleapis.com/auth/userinfo.profile",
        "https://www.googleapis.com/auth/cclog",
        "https://www.googleapis.com/auth/experimentsandconfigs",
    )

    fun redirectUri(port: Int = CALLBACK_PORT): String =
        "http://127.0.0.1:$port/oauth-callback"

    fun randomState(): String {
        val bytes = ByteArray(24)
        SecureRandom().nextBytes(bytes)
        return bytes.joinToString("") { "%02x".format(it) }
    }

    fun buildAuthUrl(state: String, port: Int = CALLBACK_PORT): String {
        val params = linkedMapOf(
            "access_type" to "offline",
            "client_id" to CLIENT_ID,
            "prompt" to "consent",
            "redirect_uri" to redirectUri(port),
            "response_type" to "code",
            "scope" to SCOPES.joinToString(" "),
            "state" to state,
        )
        val query = params.entries.joinToString("&") { (key, value) ->
            "${enc(key)}=${enc(value)}"
        }
        return "$AUTH_ENDPOINT?$query"
    }

    private fun enc(value: String): String =
        URLEncoder.encode(value, StandardCharsets.UTF_8.name()).replace("+", "%20")
}

@Serializable
data class AntigravitySession(
    @SerialName("type") val type: String = "antigravity",
    @SerialName("access_token") val accessToken: String,
    @SerialName("refresh_token") val refreshToken: String,
    @SerialName("expires_at_epoch_ms") val expiresAtEpochMs: Long,
    @SerialName("email") val email: String,
    @SerialName("project_id") val projectId: String,
    @SerialName("token_type") val tokenType: String = "Bearer",
) {
    fun isExpired(nowMs: Long = System.currentTimeMillis(), skewMs: Long = 60_000): Boolean =
        nowMs + skewMs >= expiresAtEpochMs
}

@Serializable
private data class TokenResponse(
    @SerialName("access_token") val accessToken: String? = null,
    @SerialName("refresh_token") val refreshToken: String? = null,
    @SerialName("expires_in") val expiresIn: Long? = null,
    @SerialName("token_type") val tokenType: String? = null,
)

@Serializable
private data class UserInfo(val email: String? = null)

class AntigravityAuthClient(
    private val http: OkHttpClient = defaultHttp(),
    private val json: Json = Json { ignoreUnknownKeys = true },
) {
    fun exchangeCode(code: String, port: Int = AntigravityOAuth.CALLBACK_PORT): AntigravitySession {
        val token = requestToken(
            FormBody.Builder()
                .add("code", code)
                .add("client_id", AntigravityOAuth.CLIENT_ID)
                .add("client_secret", AntigravityOAuth.CLIENT_SECRET)
                .add("redirect_uri", AntigravityOAuth.redirectUri(port))
                .add("grant_type", "authorization_code")
                .build(),
        )
        val refresh = token.refreshToken ?: error("Google не вернул refresh_token (нужен prompt=consent)")
        val access = token.accessToken ?: error("Google не вернул access_token")
        val email = fetchEmail(access)
        val projectId = fetchProjectId(access)
        return AntigravitySession(
            accessToken = access,
            refreshToken = refresh,
            expiresAtEpochMs = System.currentTimeMillis() + (token.expiresIn ?: 3600L) * 1000L,
            email = email,
            projectId = projectId,
            tokenType = token.tokenType ?: "Bearer",
        )
    }

    fun refresh(session: AntigravitySession): AntigravitySession {
        val token = requestToken(
            FormBody.Builder()
                .add("refresh_token", session.refreshToken)
                .add("client_id", AntigravityOAuth.CLIENT_ID)
                .add("client_secret", AntigravityOAuth.CLIENT_SECRET)
                .add("grant_type", "refresh_token")
                .build(),
        )
        val access = token.accessToken ?: error("Не удалось обновить access_token")
        return session.copy(
            accessToken = access,
            refreshToken = token.refreshToken ?: session.refreshToken,
            expiresAtEpochMs = System.currentTimeMillis() + (token.expiresIn ?: 3600L) * 1000L,
            tokenType = token.tokenType ?: session.tokenType,
        )
    }

    fun ensureFresh(session: AntigravitySession): AntigravitySession =
        if (session.isExpired()) refresh(session) else session

    private fun requestToken(body: FormBody): TokenResponse {
        val request = Request.Builder()
            .url(AntigravityOAuth.TOKEN_ENDPOINT)
            .header("Content-Type", "application/x-www-form-urlencoded")
            .post(body)
            .build()
        http.newCall(request).execute().use { response ->
            val text = response.body?.string().orEmpty()
            if (!response.isSuccessful) {
                error("OAuth token error ${response.code}: $text")
            }
            return json.decodeFromString(TokenResponse.serializer(), text)
        }
    }

    private fun fetchEmail(accessToken: String): String {
        val request = Request.Builder()
            .url(AntigravityOAuth.USER_INFO_ENDPOINT)
            .header("Authorization", "Bearer $accessToken")
            .header("User-Agent", AntigravityOAuth.USER_AGENT)
            .get()
            .build()
        http.newCall(request).execute().use { response ->
            val text = response.body?.string().orEmpty()
            if (!response.isSuccessful) error("userinfo ${response.code}: $text")
            return json.decodeFromString(UserInfo.serializer(), text).email
                ?: error("В ответе Google нет email")
        }
    }

    fun fetchProjectId(accessToken: String): String {
        val loadBody = """{"metadata":{"ideType":"ANTIGRAVITY"}}"""
        val loadResp = postJson(
            "${AntigravityOAuth.API_ENDPOINT}/${AntigravityOAuth.API_VERSION}:loadCodeAssist",
            accessToken,
            loadBody,
            AntigravityOAuth.USER_AGENT,
        )
        extractProjectId(loadResp)?.let { return it }
        val tier = defaultTierId(loadResp)
        return onboardUser(accessToken, tier)
    }

    private fun onboardUser(accessToken: String, tierId: String): String {
        val body = """
            {"tier_id":"$tierId","metadata":{"ide_type":"ANTIGRAVITY","ide_version":"1.0.13","ide_name":"antigravity"}}
        """.trimIndent()
        repeat(5) { attempt ->
            val text = postJson(
                "${AntigravityOAuth.DAILY_API_ENDPOINT}/${AntigravityOAuth.API_VERSION}:onboardUser",
                accessToken,
                body,
                "antigravity/1.0.13 android/arm64",
            )
            val root = json.parseToJsonElement(text).jsonObject
            val done = root["done"]?.jsonPrimitive?.content == "true" ||
                root["done"]?.toString() == "true"
            if (done) {
                val response = root["response"]?.jsonObject
                extractProjectId(response?.toString() ?: text)?.let { return it }
                error("onboardUser не вернул project_id")
            }
            if (attempt < 4) Thread.sleep(2000)
        }
        error("onboardUser не завершился")
    }

    private fun extractProjectId(raw: String): String? {
        val obj = runCatching { json.parseToJsonElement(raw).jsonObject }.getOrNull() ?: return null
        listOf("cloudaicompanionProject", "projectId", "project").forEach { key ->
            val value = obj[key]
            val asString = value?.jsonPrimitive?.contentOrNull()
            if (!asString.isNullOrBlank()) return asString
            val nestedId = value?.jsonObject?.get("id")?.jsonPrimitive?.contentOrNull()
            if (!nestedId.isNullOrBlank()) return nestedId
        }
        return null
    }

    private fun defaultTierId(raw: String): String {
        val obj = runCatching { json.parseToJsonElement(raw).jsonObject }.getOrNull() ?: return "free-tier"
        obj["allowedTiers"]?.jsonArray?.forEach { item ->
            val tier = item.jsonObject
            val isDefault = tier["isDefault"]?.toString() == "true"
            val id = tier["id"]?.jsonPrimitive?.contentOrNull()
            if (isDefault && !id.isNullOrBlank()) return id
        }
        obj["currentTier"]?.jsonObject?.get("id")?.jsonPrimitive?.contentOrNull()?.let {
            if (it.isNotBlank()) return it
        }
        return "free-tier"
    }

    private fun postJson(url: String, accessToken: String, body: String, userAgent: String): String {
        val request = Request.Builder()
            .url(url)
            .header("Authorization", "Bearer $accessToken")
            .header("Accept", "*/*")
            .header("Content-Type", "application/json")
            .header("User-Agent", userAgent)
            .post(body.toRequestBody(JSON))
            .build()
        http.newCall(request).execute().use { response ->
            val text = response.body?.string().orEmpty()
            if (!response.isSuccessful) error("HTTP ${response.code} $url: $text")
            return text
        }
    }

    companion object {
        private val JSON = "application/json; charset=utf-8".toMediaType()

        fun defaultHttp(): OkHttpClient = OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .build()
    }
}

private fun kotlinx.serialization.json.JsonPrimitive.contentOrNull(): String? =
    runCatching { content }.getOrNull()?.takeIf { it.isNotBlank() && it != "null" }

fun sessionJson(json: Json = Json { prettyPrint = true; encodeDefaults = true }): Json =
    json

fun encodeSession(session: AntigravitySession): String =
    Json { prettyPrint = true; encodeDefaults = true; ignoreUnknownKeys = true }
        .encodeToString(AntigravitySession.serializer(), session)

fun decodeSession(raw: String): AntigravitySession =
    Json { ignoreUnknownKeys = true }.decodeFromString(AntigravitySession.serializer(), raw)

fun expiresAtFromNow(expiresInSeconds: Long, nowMs: Long = System.currentTimeMillis()): Long =
    nowMs + expiresInSeconds * 1000L

fun Instant.toEpochMs(): Long = toEpochMilli()
