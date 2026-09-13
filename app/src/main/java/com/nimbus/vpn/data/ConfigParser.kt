package com.nimbus.vpn.data

/**
 * Lightweight AmneziaWG / WireGuard config inspector.
 * Used for validation and UI preview. The tunnel backend parses the raw
 * config again with the official AmneziaWG library at connect time.
 */
data class ParsedConfigPreview(
    val interfaceAddress: String?,
    val dns: String?,
    val mtu: Int?,
    val endpoint: String?,
    val publicKey: String?,
    val allowedIps: String?,
    val hasPrivateKey: Boolean,
    val amnezia: AmneziaParams,
    val issues: List<String>,
) {
    val isAmnezia: Boolean
        get() = amnezia.isPresent

    val canConnect: Boolean
        get() = issues.isEmpty() && hasPrivateKey && !endpoint.isNullOrBlank()
}

data class AmneziaParams(
    val jc: String? = null,
    val jmin: String? = null,
    val jmax: String? = null,
    val s1: String? = null,
    val s2: String? = null,
    val s3: String? = null,
    val s4: String? = null,
    val h1: String? = null,
    val h2: String? = null,
    val h3: String? = null,
    val h4: String? = null,
    val i1: Boolean = false,
) {
    val isPresent: Boolean
        get() = listOf(jc, jmin, jmax, s1, s2, s3, s4, h1, h2, h3, h4).any { !it.isNullOrBlank() } || i1
}

object ConfigParser {
    private val KEY_LINE = Regex("""^\s*([A-Za-z][A-Za-z0-9]*)\s*=\s*(.*)\s*$""")

    fun parse(raw: String): ParsedConfigPreview {
        val issues = mutableListOf<String>()
        val text = raw.replace("\r\n", "\n").trim()
        if (text.isEmpty()) {
            return ParsedConfigPreview(
                interfaceAddress = null,
                dns = null,
                mtu = null,
                endpoint = null,
                publicKey = null,
                allowedIps = null,
                hasPrivateKey = false,
                amnezia = AmneziaParams(),
                issues = listOf("Конфиг пустой"),
            )
        }

        val sections = linkedMapOf<String, MutableList<MutableMap<String, String>>>()
        var currentKind: String? = null
        var current: MutableMap<String, String>? = null

        text.lineSequence().forEach { original ->
            val commentIndex = original.indexOf('#')
            val line = (if (commentIndex >= 0) original.substring(0, commentIndex) else original).trim()
            if (line.isEmpty()) return@forEach
            if (line.startsWith("[") && line.endsWith("]")) {
                currentKind = line.substring(1, line.length - 1).trim()
                current = mutableMapOf()
                sections.getOrPut(currentKind!!) { mutableListOf() }.add(current!!)
                return@forEach
            }
            val match = KEY_LINE.matchEntire(line)
            if (match == null) {
                if (current == null) {
                    issues += "Строка вне секции: $line"
                }
                return@forEach
            }
            if (current == null || currentKind == null) {
                issues += "Ключ ${match.groupValues[1]} вне секции"
                return@forEach
            }
            current!![match.groupValues[1]] = match.groupValues[2].trim()
        }

        val iface = sections["Interface"]?.firstOrNull()
        val peer = sections["Peer"]?.firstOrNull()
        if (iface == null) issues += "Нет секции [Interface]"
        if (peer == null) issues += "Нет секции [Peer]"

        val privateKey = iface?.get("PrivateKey")
        val address = iface?.get("Address")
        val dns = iface?.get("DNS")
        val mtu = iface?.get("MTU")?.toIntOrNull()
        val endpoint = peer?.get("Endpoint")
        val publicKey = peer?.get("PublicKey")
        val allowedIps = peer?.get("AllowedIPs")

        if (privateKey.isNullOrBlank()) issues += "Нет PrivateKey"
        else if (!looksLikeKey(privateKey)) issues += "PrivateKey выглядит некорректно"

        if (address.isNullOrBlank()) issues += "Нет Address"
        if (publicKey.isNullOrBlank()) issues += "Нет PublicKey"
        else if (!looksLikeKey(publicKey)) issues += "PublicKey выглядит некорректно"
        if (endpoint.isNullOrBlank()) issues += "Нет Endpoint"
        if (allowedIps.isNullOrBlank()) issues += "Нет AllowedIPs"

        val amnezia = AmneziaParams(
            jc = iface?.get("Jc"),
            jmin = iface?.get("Jmin"),
            jmax = iface?.get("Jmax"),
            s1 = iface?.get("S1"),
            s2 = iface?.get("S2"),
            s3 = iface?.get("S3"),
            s4 = iface?.get("S4"),
            h1 = iface?.get("H1"),
            h2 = iface?.get("H2"),
            h3 = iface?.get("H3"),
            h4 = iface?.get("H4"),
            i1 = !iface?.get("I1").isNullOrBlank(),
        )

        return ParsedConfigPreview(
            interfaceAddress = address,
            dns = dns,
            mtu = mtu,
            endpoint = endpoint,
            publicKey = publicKey,
            allowedIps = allowedIps,
            hasPrivateKey = !privateKey.isNullOrBlank(),
            amnezia = amnezia,
            issues = issues,
        )
    }

    fun suggestName(raw: String, fallback: String = "Bozya"): String {
        val preview = parse(raw)
        val host = preview.endpoint?.substringBefore(":")?.substringBefore(".")
        return host?.replace(Regex("[^A-Za-z0-9_+.-]"), "")?.take(12)?.ifBlank { fallback } ?: fallback
    }

    fun withKeepaliveIfMissing(raw: String, keepalive: Int = 25): String {
        val text = raw.replace("\r\n", "\n")
        if (Regex("""(?im)^\s*PersistentKeepalive\s*=""").containsMatchIn(text)) return text
        if (!text.contains("[Peer]", ignoreCase = true)) return text
        return text.trimEnd() + "\nPersistentKeepalive = $keepalive\n"
    }

    fun maskSecrets(raw: String): String {
        return raw.replace(Regex("""(?im)^(\s*PrivateKey\s*=\s*).+$"""), "$1••••••••")
            .replace(Regex("""(?im)^(\s*PresharedKey\s*=\s*).+$"""), "$1••••••••")
            .replace(Regex("""(?im)^(\s*I1\s*=\s*).+$"""), "$1<hidden>")
    }

    private fun looksLikeKey(value: String): Boolean {
        val compact = value.trim()
        return compact.length in 42..46 && compact.matches(Regex("[A-Za-z0-9+/=_-]+"))
    }
}
