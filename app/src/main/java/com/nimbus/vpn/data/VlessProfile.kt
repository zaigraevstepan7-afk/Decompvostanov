package com.nimbus.vpn.data

import java.net.URLDecoder
import java.nio.charset.StandardCharsets
import java.security.MessageDigest

/**
 * A server the user pasted as one vless:// link. It stays in the ordinary list
 * and is not replaced when the white-list subscription refreshes.
 */
object VlessProfile {
    const val ID = "vless"
    const val ENGINE = "vless"

    private val LINK = Regex("""(?i)vless://[^\s"'<>]+""")

    fun isOne(raw: String): Boolean {
        raw.replace("\r\n", "\n").lineSequence().forEach { original ->
            val line = original.substringBefore('#').trim()
            val eq = line.indexOf('=')
            if (eq <= 0) return@forEach
            val key = line.substring(0, eq).trim()
            val value = line.substring(eq + 1).trim()
            if (key.equals("Engine", ignoreCase = true)) {
                return value.equals(ENGINE, ignoreCase = true)
            }
        }
        return false
    }

    fun endpoint(raw: String): String? = WhitelistProfile.endpoint(raw)

    fun link(raw: String): String? = WhitelistProfile.link(raw)

    fun fromLink(raw: String): VpnProfile {
        val link = LINK.find(raw)?.value?.trim()?.trim('"', '\'') ?: error("Вставь ссылку vless://")
        val node = WhitelistConfig.parse(link)
        WhitelistConfig.toCoreJson(link)
        val hostPort = if (node.host.contains(':')) "[${node.host}]:${node.port}" else "${node.host}:${node.port}"
        return VpnProfile(
            id = "vless:${fingerprint(link)}",
            name = title(link, node.host),
            rawConfig = "[Bozya]\nEngine = $ENGINE\nEndpoint = $hostPort\nLink = $link\n",
        )
    }

    private fun title(link: String, host: String): String {
        val fragment = link.substringAfter('#', "")
        if (fragment.isBlank()) return host
        val decoded = runCatching {
            URLDecoder.decode(fragment, StandardCharsets.UTF_8)
        }.getOrDefault(fragment).trim()
        return decoded.take(48).ifBlank { host }
    }

    private fun fingerprint(link: String): String {
        val digest = MessageDigest.getInstance("SHA-256").digest(link.toByteArray(StandardCharsets.UTF_8))
        return digest.take(8).joinToString("") { "%02x".format(it) }
    }
}
