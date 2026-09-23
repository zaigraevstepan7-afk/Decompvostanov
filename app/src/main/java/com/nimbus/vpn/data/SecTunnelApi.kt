package com.nimbus.vpn.data

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.intOrNull
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.security.MessageDigest
import java.security.SecureRandom

data class SecStatus(val code: Long, val message: String)

data class SecDevice(val id: String, val password: String)

data class SecEndpoint(
    val ip: String,
    val host: String?,
    val ports: List<Int>,
    val country: String?,
) {
    val port: Int
        get() = when {
            443 in ports -> 443
            ports.isNotEmpty() -> ports.first()
            else -> 443
        }

    fun verifyName(region: String): String {
        val named = host?.trim().orEmpty()
        if (named.isNotEmpty()) return named
        val code = (country ?: region).trim().lowercase()
        return "${code}0.sec-tunnel.com"
    }
}

data class SecExit(
    val ip: String,
    val port: Int,
    val verifyName: String,
    val username: String,
    val password: String,
) {
    override fun toString(): String = "$ip:$port"
}

/**
 * SurfEasy / sec-tunnel registration. The digest login is the application
 * credential shipped in every Opera client, not a user password.
 */
object SecTunnelApi {
    const val REGISTER = "https://api2.sec-tunnel.com/v4/register_subscriber"
    const val REGISTER_DEVICE = "https://api2.sec-tunnel.com/v4/register_device"
    const val DISCOVER = "https://api2.sec-tunnel.com/v4/discover"

    private val json = Json { ignoreUnknownKeys = true }

    fun capitalHexSha1(input: String): String {
        val digest = MessageDigest.getInstance("SHA-1").digest(input.toByteArray(Charsets.UTF_8))
        return digest.joinToString("") { "%02X".format(it) }
    }

    fun requestedGeo(region: String): String = "\"${region.trim().uppercase()}\",,"

    fun parseStatus(body: String): SecStatus {
        val root = json.parseToJsonElement(body).jsonObject
        val codeObject = root["return_code"]?.jsonObject ?: error("Нет return_code")
        val entry = codeObject.entries.singleOrNull() ?: error("Непонятный статус sec-tunnel")
        val code = entry.key.toLongOrNull() ?: error("Плохой код sec-tunnel")
        val message = when (val value = entry.value) {
            is JsonPrimitive -> value.contentOrNull ?: value.toString()
            else -> value.toString()
        }
        return SecStatus(code, message)
    }

    fun parseDevice(body: String): SecDevice {
        val status = parseStatus(body)
        if (status.code != 0L) error("sec-tunnel ${status.code}: ${status.message}")
        val data = json.parseToJsonElement(body).jsonObject["data"]?.jsonObject
            ?: error("Нет данных устройства")
        val id = data.string("device_id") ?: error("Нет device_id")
        val password = data.string("device_password") ?: error("Нет пароля устройства")
        return SecDevice(id, password)
    }

    fun parseDiscover(body: String): List<SecEndpoint> {
        val status = parseStatus(body)
        if (status.code != 0L) error("sec-tunnel ${status.code}: ${status.message}")
        val ips = json.parseToJsonElement(body).jsonObject["data"]?.jsonObject
            ?.get("ips") as? JsonArray ?: return emptyList()
        return ips.mapNotNull { element ->
            val item = element as? JsonObject ?: return@mapNotNull null
            val ip = item.string("ip") ?: return@mapNotNull null
            val ports = (item["ports"] as? JsonArray)?.mapNotNull { port ->
                val primitive = port as? JsonPrimitive ?: return@mapNotNull null
                primitive.intOrNull ?: primitive.contentOrNull?.toIntOrNull()
            }.orEmpty()
            val country = (item["geo"] as? JsonObject)?.string("country_code")
            SecEndpoint(ip = ip, host = item.string("host"), ports = ports, country = country)
        }
    }

    fun lease(region: String, http: SecHttp = SecHttp()): SecExit {
        val known = SecTunnelProfile.region(region) ?: error("Неизвестный регион: $region")
        val email = "${randomHex(32)}@se0316.best.vpn"
        http.post(
            REGISTER,
            mapOf("email" to email, "password" to capitalHexSha1(email)),
        ).also { body ->
            val status = parseStatus(body)
            if (status.code != 0L) error("sec-tunnel ${status.code}: ${status.message}")
        }
        val device = parseDevice(
            http.post(
                REGISTER_DEVICE,
                mapOf(
                    "client_type" to "se0316",
                    "device_hash" to randomHex(20),
                    "device_name" to "Opera-Browser-Client",
                ),
            ),
        )
        val endpoints = parseDiscover(
            http.post(
                DISCOVER,
                mapOf(
                    "serial_no" to capitalHexSha1(device.id),
                    "requested_geo" to requestedGeo(known.id),
                ),
            ),
        )
        val chosen = endpoints.randomOrNull() ?: error("sec-tunnel не выдал выход для ${known.name}")
        return SecExit(
            ip = chosen.ip,
            port = chosen.port,
            verifyName = chosen.verifyName(known.id),
            username = capitalHexSha1(device.id),
            password = device.password,
        )
    }

    private fun JsonObject.string(key: String): String? {
        val value = this[key] as? JsonPrimitive ?: return null
        return value.contentOrNull?.takeIf { it.isNotBlank() }
    }

    private fun randomHex(bytes: Int): String {
        val buffer = ByteArray(bytes)
        SecureRandom().nextBytes(buffer)
        return buffer.joinToString("") { "%02X".format(it) }
    }
}

object SecDigest {
    fun authorization(
        method: String,
        uri: String,
        username: String,
        password: String,
        challenge: String,
        nc: String,
        cnonce: String,
    ): String {
        val realm = param(challenge, "realm") ?: error("Нет realm")
        val nonce = param(challenge, "nonce") ?: error("Нет nonce")
        val opaque = param(challenge, "opaque")
        val qop = param(challenge, "qop")
            ?.split(',')
            ?.map { it.trim() }
            ?.firstOrNull { it.equals("auth", ignoreCase = true) }
        val ha1 = md5("$username:$realm:$password")
        val ha2 = md5("$method:$uri")
        val response = if (qop != null) {
            md5("$ha1:$nonce:$nc:$cnonce:$qop:$ha2")
        } else {
            md5("$ha1:$nonce:$ha2")
        }
        val parts = mutableListOf(
            "Digest username=\"$username\"",
            "realm=\"$realm\"",
            "nonce=\"$nonce\"",
            "uri=\"$uri\"",
        )
        if (qop != null) {
            parts += "qop=$qop"
            parts += "nc=$nc"
            parts += "cnonce=\"$cnonce\""
        }
        parts += "response=\"$response\""
        if (!opaque.isNullOrEmpty()) parts += "opaque=\"$opaque\""
        return parts.joinToString(", ")
    }

    fun param(header: String, name: String): String? {
        val match = Regex("""(?i)\b${Regex.escape(name)}\s*=\s*("([^"]*)"|([^,\s]+))""").find(header)
            ?: return null
        return if (match.groupValues[1].startsWith("\"")) match.groupValues[2] else match.groupValues[3]
    }

    fun md5(text: String): String {
        val digest = MessageDigest.getInstance("MD5").digest(text.toByteArray(Charsets.ISO_8859_1))
        return digest.joinToString("") { "%02x".format(it) }
    }
}

class SecHttp {
    private val cookies = linkedMapOf<String, String>()
    private var challenge: String? = null
    private var nonce: String? = null
    private var nc = 0

    fun post(url: String, form: Map<String, String>): String {
        val body = form.entries.joinToString("&") { (key, value) ->
            URLEncoder.encode(key, Charsets.UTF_8.name()) + "=" + URLEncoder.encode(value, Charsets.UTF_8.name())
        }
        val uri = URL(url).path.ifBlank { "/" }
        val cached = challenge
        if (cached != null) {
            val authed = exchange(url, body, authorization(uri, cached))
            if (authed.code != 401) return requireOk(authed)
            remember(authed.wwwAuthenticate)
        }
        val probe = exchange(url, body, null)
        if (probe.code == 401) {
            val next = probe.wwwAuthenticate ?: error("sec-tunnel не прислал Digest")
            remember(next)
            return requireOk(exchange(url, body, authorization(uri, next)))
        }
        return requireOk(probe)
    }

    private fun remember(header: String?) {
        if (header.isNullOrBlank()) return
        val nextNonce = SecDigest.param(header, "nonce")
        if (nextNonce != nonce) nc = 0
        nonce = nextNonce
        challenge = header
    }

    private fun authorization(uri: String, header: String): String {
        nc += 1
        val cnonce = ByteArray(4).also { SecureRandom().nextBytes(it) }
            .joinToString("") { "%02x".format(it) }
        return SecDigest.authorization(
            method = "POST",
            uri = uri,
            username = SecApiAuth.LOGIN,
            password = SecApiAuth.PASSWORD,
            challenge = header,
            nc = "%08x".format(nc),
            cnonce = cnonce,
        )
    }

    private fun requireOk(result: HttpResult): String {
        if (result.code !in 200..299) {
            error("sec-tunnel HTTP ${result.code}")
        }
        return result.body
    }

    private fun exchange(url: String, body: String, authorization: String?): HttpResult {
        val connection = (URL(url).openConnection() as HttpURLConnection).apply {
            requestMethod = "POST"
            connectTimeout = 12_000
            readTimeout = 15_000
            doOutput = true
            instanceFollowRedirects = false
            setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
            setRequestProperty("Accept", "application/json")
            setRequestProperty("SE-Client-Version", SecApiAuth.CLIENT_VERSION)
            setRequestProperty("SE-Operating-System", "Windows")
            setRequestProperty("User-Agent", SecApiAuth.USER_AGENT)
            authorization?.let { setRequestProperty("Authorization", it) }
            cookieHeader()?.let { setRequestProperty("Cookie", it) }
            setFixedLengthStreamingMode(body.toByteArray(Charsets.UTF_8).size)
        }
        try {
            connection.outputStream.use { it.write(body.toByteArray(Charsets.UTF_8)) }
            val code = connection.responseCode
            val stream = if (code in 200..299) connection.inputStream else connection.errorStream
            val text = stream?.bufferedReader()?.use { it.readText() }.orEmpty()
            storeCookies(connection)
            return HttpResult(code, text, connection.getHeaderField("WWW-Authenticate"))
        } finally {
            connection.disconnect()
        }
    }

    private fun cookieHeader(): String? {
        if (cookies.isEmpty()) return null
        return cookies.entries.joinToString("; ") { (name, value) -> "$name=$value" }
    }

    private fun storeCookies(connection: HttpURLConnection) {
        connection.headerFields.forEach { (key, values) ->
            if (!key.equals("Set-Cookie", ignoreCase = true)) return@forEach
            values.forEach { raw ->
                val pair = raw.substringBefore(';').trim()
                val eq = pair.indexOf('=')
                if (eq > 0) cookies[pair.substring(0, eq)] = pair.substring(eq + 1)
            }
        }
    }

    private data class HttpResult(val code: Int, val body: String, val wwwAuthenticate: String?)
}

internal object SecApiAuth {
    const val LOGIN = "se0316"
    const val PASSWORD = "SILrMEPBmJuhomxWkfm3JalqHX2Eheg1YhlEZiMh8II"
    const val CLIENT_VERSION = "Stable 114.0.5282.21"
    const val USER_AGENT =
        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36 OPR/114.0.0.0"
}
