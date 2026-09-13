package com.nimbus.vpn.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.net.HttpURLConnection
import java.net.URL

data class WarpKeys(
    val privateKey: String,
    val peerPublicKey: String,
    val clientIpv4: String,
    val clientIpv6: String?,
)

data class WarpServer(
    val id: String,
    val name: String,
    val host: String,
)

object WarpConfigBuilder {
    const val DEFAULT_PORT = 4500
    const val DNS = "1.1.1.1, 1.0.0.1, 2606:4700:4700::1111, 2606:4700:4700::1001"
    const val ALLOWED_IPS = "0.0.0.0/0, ::/0"
    const val MTU = 1280
    const val KEEPALIVE = 25

    val servers: List<WarpServer> = listOf(
        WarpServer("de", "Германия", "de.tribukvy.ltd"),
        WarpServer("pl", "Польша", "pl.tribukvy.ltd"),
        WarpServer("nl", "Нидерланды", "nl.tribukvy.ltd"),
        WarpServer("fi", "Финляндия", "fi.tribukvy.ltd"),
        WarpServer("ee", "Эстония", "ee.tribukvy.ltd"),
        WarpServer("lv", "Латвия", "lv.tribukvy.ltd"),
        WarpServer("ru", "Россия", "ru0.tribukvy.ltd"),
    )

    fun profileId(serverId: String): String = "warp:$serverId"

    fun isWarpProfile(id: String): Boolean = id.startsWith("warp:")

    fun build(keys: WarpKeys, host: String, port: Int = DEFAULT_PORT): String {
        val ipv6 = keys.clientIpv6?.trim().orEmpty()
        val address = if (ipv6.isNotEmpty()) {
            "${keys.clientIpv4.trim()}, $ipv6"
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

    fun profiles(keys: WarpKeys, port: Int = DEFAULT_PORT): List<VpnProfile> {
        val createdAt = System.currentTimeMillis()
        return servers.map { server ->
            VpnProfile(
                id = profileId(server.id),
                name = server.name,
                rawConfig = build(keys, server.host, port),
                createdAt = createdAt,
            )
        }
    }
}

object WarpApi {
    const val DEFAULT_URL = "https://generator-config-warp.vercel.app/api/warp-data"

    private val json = Json { ignoreUnknownKeys = true }

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

    fun fetch(url: String = DEFAULT_URL): WarpKeys {
        val connection = (URL(url).openConnection() as HttpURLConnection).apply {
            connectTimeout = 15_000
            readTimeout = 20_000
            requestMethod = "GET"
            instanceFollowRedirects = true
            setRequestProperty("Accept", "application/json")
            setRequestProperty("User-Agent", "NimbusVPN/1.0.3")
        }
        try {
            val code = connection.responseCode
            val stream = if (code in 200..299) connection.inputStream else connection.errorStream
            val body = stream?.bufferedReader()?.use { it.readText() }.orEmpty()
            require(code in 200..299) { "WARP HTTP $code" }
            return parse(body)
        } finally {
            connection.disconnect()
        }
    }
}

object WarpGenerator {
    fun generate(fetchKeys: () -> WarpKeys = { WarpApi.fetch() }): List<VpnProfile> {
        val profiles = WarpConfigBuilder.profiles(fetchKeys())
        require(profiles.isNotEmpty()) { "Список серверов WARP пуст" }
        profiles.forEach { profile ->
            val preview = ConfigParser.parse(profile.rawConfig)
            require(preview.canConnect) {
                "Собранный WARP-конфиг невалиден: ${preview.issues.joinToString()}"
            }
        }
        return profiles
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
