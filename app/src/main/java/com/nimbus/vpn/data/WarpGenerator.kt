package com.nimbus.vpn.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonObject
import java.net.HttpURLConnection
import java.net.URL
import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import kotlin.random.Random

data class WarpKeys(
    val privateKey: String,
    val peerPublicKey: String,
    val clientIpv4: String,
    val clientIpv6: String?,
)

data class WarpCountry(
    val id: String,
    val name: String,
    val flag: String,
    val host: String,
    val lteHost: String? = null,
    val lteExcludedPorts: Set<Int> = emptySet(),
) {
    val hasLte: Boolean get() = !lteHost.isNullOrBlank()
}

data class WarpEndpoint(
    val id: String,
    val name: String,
    val host: String,
    val excludedPorts: Set<Int> = emptySet(),
)

object WarpConfigBuilder {
    const val DEFAULT_PORT = 4500
    const val DNS = "1.1.1.1, 1.0.0.1, 2606:4700:4700::1111, 2606:4700:4700::1001"
    const val ALLOWED_IPS = "0.0.0.0/0, ::/0"
    const val MTU = 1280
    const val KEEPALIVE = 25

    val ports: List<Int> = listOf(
        500, 854, 859, 864, 878, 880, 890, 891, 894, 903, 908, 928, 934, 939, 942, 943,
        945, 946, 955, 968, 987, 988, 1002, 1010, 1014, 1018, 1070, 1074, 1180, 1387,
        1701, 1843, 2371, 2408, 2506, 3138, 3476, 3581, 3854, 4177, 4198, 4233, 4500,
        5279, 5956, 7103, 7152, 7156, 7281, 7559, 8319, 8742, 8854, 8886,
    )

    val countries: List<WarpCountry> = listOf(
        WarpCountry("de", "Германия", "🇩🇪", "de.tribukvy.ltd", lteHost = "tel.de.tribukvy.ltd"),
        WarpCountry("pl", "Польша", "🇵🇱", "pl.tribukvy.ltd", lteHost = "tel.pl.tribukvy.ltd", lteExcludedPorts = setOf(988)),
        WarpCountry("nl", "Нидерланды", "🇳🇱", "nl.tribukvy.ltd"),
        WarpCountry("fi", "Финляндия", "🇫🇮", "fi.tribukvy.ltd", lteHost = "tel.fi.tribukvy.ltd", lteExcludedPorts = setOf(1010)),
        WarpCountry("ee", "Эстония", "🇪🇪", "ee.tribukvy.ltd"),
        WarpCountry("lv", "Латвия", "🇱🇻", "lv.tribukvy.ltd"),
        WarpCountry("ru", "Россия", "🇷🇺", "ru0.tribukvy.ltd"),
    )

    fun country(id: String): WarpCountry? = countries.firstOrNull { it.id == id }

    fun resolve(countryId: String, lte: Boolean): WarpEndpoint {
        val country = country(countryId) ?: error("Неизвестная страна: $countryId")
        val useLte = lte && country.hasLte
        return WarpEndpoint(
            id = if (useLte) "lte-${country.id}" else country.id,
            name = if (useLte) "${country.name} LTE" else country.name,
            host = if (useLte) country.lteHost!! else country.host,
            excludedPorts = if (useLte) country.lteExcludedPorts else emptySet(),
        )
    }

    fun profileId(endpointId: String): String = "warp:$endpointId"

    fun portsFor(excluded: Set<Int>): List<Int> = ports.filterNot { it in excluded }

    /** Cards saved while countries were pointed at Cloudflare get their own relay back. */
    fun restoreCountryHost(profileId: String, raw: String): String {
        val endpoint = ConfigParser.endpointOf(raw) ?: return raw
        val host = endpoint.substringBefore(":").lowercase()
        if (host != "engage.cloudflareclient.com") return raw
        val endpointId = profileId.removePrefix("warp:")
        if (endpointId.isEmpty() || endpointId == profileId) return raw
        val lte = endpointId.startsWith("lte-")
        val country = country(if (lte) endpointId.removePrefix("lte-") else endpointId) ?: return raw
        val wanted = if (lte) country.lteHost ?: country.host else country.host
        val port = endpoint.substringAfter(":", DEFAULT_PORT.toString())
        return replaceEndpoint(raw, "$wanted:$port")
    }

    private fun replaceEndpoint(raw: String, endpoint: String): String {
        val newline = raw.endsWith("\n")
        val rewritten = raw.lineSequence().joinToString("\n") { line ->
            val body = line.substringBefore("#")
            val eq = body.indexOf('=')
            if (eq <= 0) return@joinToString line
            if (!body.substring(0, eq).trim().equals("Endpoint", ignoreCase = true)) return@joinToString line
            val comment = if (line.contains("#")) " " + line.substring(line.indexOf("#")) else ""
            val indent = line.substring(0, body.length - body.trimStart().length)
            "$indent${body.substring(0, eq).trim()} = $endpoint$comment"
        }
        return if (newline && !rewritten.endsWith("\n")) rewritten + "\n" else rewritten
    }

    fun randomPort(excluded: Set<Int> = emptySet(), random: Random = Random.Default): Int {
        val pool = portsFor(excluded)
        require(pool.isNotEmpty()) { "Нет доступных портов" }
        return pool.random(random)
    }

    fun build(
        keys: WarpKeys,
        host: String,
        port: Int = DEFAULT_PORT,
        ipv6: Boolean = true,
    ): String {
        val address = if (ipv6 && !keys.clientIpv6.isNullOrBlank()) {
            "${keys.clientIpv4.trim()}, ${keys.clientIpv6.trim()}"
        } else {
            keys.clientIpv4.trim()
        }
        return """
            [Interface]
            PrivateKey = ${keys.privateKey.trim()}
            MTU = $MTU
            Address = $address
            DNS = $DNS
            S1 = 0
            S2 = 0
            S3 = 0
            S4 = 0
            Jc = 4
            Jmin = 40
            Jmax = 70
            H1 = 1
            H2 = 2
            H3 = 3
            H4 = 4
            ${WarpJunkPacket.I1_LINE}

            [Peer]
            PublicKey = ${keys.peerPublicKey.trim()}
            AllowedIPs = $ALLOWED_IPS
            Endpoint = $host:$port
            PersistentKeepalive = $KEEPALIVE
        """.trimIndent() + "\n"
    }
}

object WarpApi {
    const val DEFAULT_URL = "https://generator-config-warp.vercel.app/api/warp-data"
    const val FETCH_ERROR = "Не удалось получить данные WARP"

    internal const val CF_REG_URL = "https://api.cloudflareclient.com/v0a5641/reg"

    private const val CF_USER_AGENT = "1.1.1.1/6.38.9-5641 (Android 16.0.0)"
    private const val CF_CLIENT_VERSION = "a-6.38.9-5641"

    private val json = Json { ignoreUnknownKeys = true }
    private val tosFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").withZone(ZoneOffset.UTC)

    @Volatile
    private var cached: WarpKeys? = null

    fun parse(body: String): WarpKeys {
        val parsed = json.decodeFromString(WarpApiResponse.serializer(), body)
        require(parsed.success) { parsed.message ?: FETCH_ERROR }
        val privateKey = parsed.privKey?.trim().orEmpty()
        val peer = parsed.peerPub?.trim().orEmpty()
        val ipv4 = parsed.clientIpv4?.trim().orEmpty()
        require(privateKey.isNotBlank()) { "Нет PrivateKey в ответе WARP" }
        require(peer.isNotBlank()) { "Нет PublicKey в ответе WARP" }
        require(ipv4.isNotBlank()) { "Нет Address в ответе WARP" }
        return WarpKeys(
            privateKey = privateKey,
            peerPublicKey = peer,
            clientIpv4 = ipv4,
            clientIpv6 = parsed.clientIpv6?.trim()?.takeIf { it.isNotEmpty() },
        )
    }

    /** Peer key and addresses only. The response endpoint host is ignored. */
    fun parseCloudflare(body: String, privateKey: String): WarpKeys {
        val root = json.parseToJsonElement(body) as? JsonObject ?: error(FETCH_ERROR)
        val config = root["config"] as? JsonObject ?: error(FETCH_ERROR)
        val peers = config["peers"] as? JsonArray
        val peer = peers?.firstOrNull().jsonText("public_key")
        val addresses = (config["interface"] as? JsonObject)?.get("addresses") as? JsonObject
        val ipv4 = addresses.jsonText("v4").substringBefore("/").trim()
        val ipv6 = addresses.jsonText("v6").substringBefore("/").trim().takeIf { it.isNotEmpty() }
        val own = privateKey.trim()
        require(own.isNotBlank() && peer.isNotBlank() && ipv4.isNotBlank()) { FETCH_ERROR }
        return WarpKeys(
            privateKey = own,
            peerPublicKey = peer,
            clientIpv4 = ipv4,
            clientIpv6 = ipv6,
        )
    }

    internal fun loadWarpKeys(
        generator: () -> WarpKeys,
        direct: () -> WarpKeys,
    ): WarpKeys = runCatching(generator).getOrElse {
        runCatching(direct).getOrElse { error(FETCH_ERROR) }
    }

    fun shownCreateError(message: String?): String {
        val text = message?.trim().orEmpty()
        if (text.any { it in '\u0400'..'\u04FF' }) return text
        return FETCH_ERROR
    }

    fun fetch(url: String = DEFAULT_URL, forceRefresh: Boolean = false): WarpKeys {
        if (!forceRefresh) cached?.let { return it }
        return loadWarpKeys(
            generator = { fetchGenerator(url) },
            direct = { registerDirect() },
        ).also { cached = it }
    }

    private fun fetchGenerator(url: String): WarpKeys {
        val connection = (URL(url).openConnection() as HttpURLConnection).apply {
            connectTimeout = 8_000
            readTimeout = 8_000
            requestMethod = "GET"
            instanceFollowRedirects = true
            setRequestProperty("Accept", "application/json")
            setRequestProperty("User-Agent", "BozyaVPN/${com.nimbus.vpn.BuildConfig.VERSION_NAME}")
        }
        try {
            val code = connection.responseCode
            val stream = if (code in 200..299) connection.inputStream else connection.errorStream
            val body = stream?.bufferedReader()?.use { it.readText() }.orEmpty()
            if (code !in 200..299) error(FETCH_ERROR)
            return parse(body)
        } finally {
            connection.disconnect()
        }
    }

    private fun registerDirect(): WarpKeys {
        val pair = org.amnezia.awg.crypto.KeyPair()
        val privateKey = pair.privateKey.toBase64()
        val publicKey = pair.publicKey.toBase64()
        val payload = json.encodeToString(
            CfRegRequest.serializer(),
            CfRegRequest(
                key = publicKey,
                installId = "",
                fcmToken = "",
                tos = tosFormat.format(Instant.now()),
                model = "PC",
                serialNumber = "",
                locale = "en_US",
                osVersion = "16.0.0",
                keyType = "curve25519",
                tunnelType = "wireguard",
            ),
        )
        val connection = (URL(CF_REG_URL).openConnection() as HttpURLConnection).apply {
            connectTimeout = 12_000
            readTimeout = 15_000
            requestMethod = "POST"
            doOutput = true
            instanceFollowRedirects = true
            setRequestProperty("Accept", "application/json")
            setRequestProperty("Content-Type", "application/json; charset=UTF-8")
            setRequestProperty("User-Agent", CF_USER_AGENT)
            setRequestProperty("CF-Client-Version", CF_CLIENT_VERSION)
        }
        try {
            connection.outputStream.use { it.write(payload.toByteArray(Charsets.UTF_8)) }
            val code = connection.responseCode
            val stream = if (code in 200..299) connection.inputStream else connection.errorStream
            val body = stream?.bufferedReader()?.use { it.readText() }.orEmpty()
            if (code !in 200..299) error(FETCH_ERROR)
            return parseCloudflare(body, privateKey)
        } finally {
            connection.disconnect()
        }
    }
}

private fun JsonElement?.jsonText(key: String): String {
    val obj = this as? JsonObject ?: return ""
    val prim = obj[key] as? JsonPrimitive ?: return ""
    if (prim is JsonNull) return ""
    return prim.content.trim()
}

object WarpGenerator {
    fun generateOne(
        countryId: String,
        lte: Boolean = false,
        fetchKeys: () -> WarpKeys = { WarpApi.fetch() },
        port: Int? = null,
    ): VpnProfile {
        if (countryId == DnsProfile.ID) return DnsProfile.create()
        val endpoint = WarpConfigBuilder.resolve(countryId, lte)
        val chosenPort = port ?: WarpConfigBuilder.randomPort(endpoint.excludedPorts)
        val conf = WarpConfigBuilder.build(fetchKeys(), endpoint.host, chosenPort)
        val preview = ConfigParser.parse(conf)
        require(preview.canConnect) {
            "Собранный WARP-конфиг невалиден: ${preview.issues.joinToString()}"
        }
        return VpnProfile(
            id = WarpConfigBuilder.profileId(endpoint.id),
            name = endpoint.name,
            rawConfig = conf,
        )
    }
}

@Serializable
internal data class CfRegRequest(
    val key: String,
    @SerialName("install_id") val installId: String,
    @SerialName("fcm_token") val fcmToken: String,
    val tos: String,
    val model: String,
    @SerialName("serial_number") val serialNumber: String,
    val locale: String,
    @SerialName("os_version") val osVersion: String,
    @SerialName("key_type") val keyType: String,
    @SerialName("tunnel_type") val tunnelType: String,
)

@Serializable
internal data class WarpApiResponse(
    val success: Boolean = false,
    val privKey: String? = null,
    @SerialName("peer_pub") val peerPub: String? = null,
    @SerialName("client_ipv4") val clientIpv4: String? = null,
    @SerialName("client_ipv6") val clientIpv6: String? = null,
    val message: String? = null,
)
