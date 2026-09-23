package com.nimbus.vpn.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.net.HttpURLConnection
import java.net.URL
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

    private val json = Json { ignoreUnknownKeys = true }

    @Volatile
    private var cached: WarpKeys? = null

    fun parse(body: String): WarpKeys {
        val parsed = json.decodeFromString(WarpApiResponse.serializer(), body)
        require(parsed.success) { parsed.message ?: "Не удалось получить данные WARP" }
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

    fun fetch(url: String = DEFAULT_URL, forceRefresh: Boolean = false): WarpKeys {
        if (!forceRefresh) cached?.let { return it }
        val connection = (URL(url).openConnection() as HttpURLConnection).apply {
            connectTimeout = 15_000
            readTimeout = 20_000
            requestMethod = "GET"
            instanceFollowRedirects = true
            setRequestProperty("Accept", "application/json")
            setRequestProperty("User-Agent", "BozyaVPN/${com.nimbus.vpn.BuildConfig.VERSION_NAME}")
        }
        try {
            val code = connection.responseCode
            val stream = if (code in 200..299) connection.inputStream else connection.errorStream
            val body = stream?.bufferedReader()?.use { it.readText() }.orEmpty()
            require(code in 200..299) { "WARP HTTP $code" }
            return parse(body).also { cached = it }
        } finally {
            connection.disconnect()
        }
    }
}

object WarpGenerator {
    fun generateOne(
        countryId: String,
        lte: Boolean = false,
        fetchKeys: () -> WarpKeys = { WarpApi.fetch() },
        port: Int? = null,
    ): VpnProfile {
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
internal data class WarpApiResponse(
    val success: Boolean = false,
    val privKey: String? = null,
    @SerialName("peer_pub") val peerPub: String? = null,
    @SerialName("client_ipv4") val clientIpv4: String? = null,
    @SerialName("client_ipv6") val clientIpv6: String? = null,
    val message: String? = null,
)
