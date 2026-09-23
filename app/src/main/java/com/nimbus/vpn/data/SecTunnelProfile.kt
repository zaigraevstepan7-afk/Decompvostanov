package com.nimbus.vpn.data

/**
 * A sec-tunnel profile is not a WireGuard config. The exit is issued at
 * connect time; the saved text only names the region.
 */
data class SecRegion(
    val id: String,
    val name: String,
    val flag: String,
)

data class SecTunnelSpec(
    val region: String,
    val name: String,
    val flag: String,
)

object SecTunnelProfile {
    const val ENGINE = "sec-tunnel"

    val regions: List<SecRegion> = listOf(
        SecRegion("AUTO", "Авто", "🌐"),
        SecRegion("EU", "Европа", "🇪🇺"),
        SecRegion("AS", "Азия", "🌏"),
        SecRegion("AM", "Америка", "🌎"),
    )

    fun region(id: String): SecRegion? = regions.firstOrNull { it.id.equals(id, ignoreCase = true) }

    fun isSec(raw: String): Boolean = read(raw) != null

    fun read(raw: String): SecTunnelSpec? {
        var engine: String? = null
        var regionId: String? = null
        raw.replace("\r\n", "\n").lineSequence().forEach { original ->
            val line = original.substringBefore('#').trim()
            val eq = line.indexOf('=')
            if (eq <= 0) return@forEach
            val key = line.substring(0, eq).trim()
            val value = line.substring(eq + 1).trim()
            when {
                key.equals("Engine", ignoreCase = true) -> engine = value
                key.equals("Region", ignoreCase = true) -> regionId = value
            }
        }
        if (!engine.equals(ENGINE, ignoreCase = true)) return null
        val known = region(regionId ?: return null) ?: return null
        return SecTunnelSpec(known.id, known.name, known.flag)
    }

    fun build(regionId: String): String {
        val known = region(regionId) ?: error("Неизвестный регион: $regionId")
        return "[Bozya]\nEngine = $ENGINE\nRegion = ${known.id}\n"
    }

    fun create(regionId: String): VpnProfile {
        val known = region(regionId) ?: error("Неизвестный регион: $regionId")
        return VpnProfile(
            id = "sec:${known.id}",
            name = known.name,
            rawConfig = build(known.id),
        )
    }
}
