package com.nimbus.vpn.data

/**
 * AI Ultra is not a VPN exit. It only sends DNS to xbox-dns.ru.
 * Traffic itself stays on the phone's own network.
 */
object DnsProfile {
    const val ID = "ai"
    const val ENGINE = "dns"
    const val NAME = "AI Ultra"
    const val HOST = "xbox-dns.ru"
    val SERVERS = listOf("111.88.96.56", "111.88.96.57")

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

    fun servers(raw: String): List<String> {
        val listed = value(raw, "DNS")
            ?.split(',')
            ?.map { it.trim() }
            ?.filter { it.isNotEmpty() }
            .orEmpty()
        return listed.ifEmpty { SERVERS }
    }

    fun create(): VpnProfile {
        val raw = """
            [Bozya]
            Engine = $ENGINE
            DNS = ${SERVERS.joinToString(", ")}
            Host = $HOST
        """.trimIndent() + "\n"
        return VpnProfile(
            id = "warp:$ID",
            name = NAME,
            rawConfig = raw,
        )
    }

    private fun value(raw: String, wanted: String): String? {
        raw.replace("\r\n", "\n").lineSequence().forEach { original ->
            val eq = original.indexOf('=')
            if (eq <= 0) return@forEach
            val key = original.substring(0, eq).trim()
            if (!key.equals(wanted, ignoreCase = true)) return@forEach
            val value = original.substring(eq + 1).trim()
            if (value.isNotEmpty()) return value
        }
        return null
    }
}
