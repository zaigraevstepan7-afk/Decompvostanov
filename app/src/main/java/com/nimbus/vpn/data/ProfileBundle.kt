package com.nimbus.vpn.data

import kotlinx.serialization.json.Json

object ProfileBundle {
    private val json = Json { ignoreUnknownKeys = true; encodeDefaults = true }

    fun export(index: ProfileIndex): String = json.encodeToString(ProfileIndex.serializer(), index)

    fun parse(text: String): ProfileIndex? {
        val trimmed = text.trim()
        if (!trimmed.startsWith("{")) return null
        val index = runCatching { json.decodeFromString(ProfileIndex.serializer(), trimmed) }.getOrNull()
            ?: return null
        if (index.profiles.isEmpty()) return null
        return index
    }
}

object SecExitOrder {
    fun prefer(exits: List<SecExit>, ip: String?): List<SecExit> {
        if (ip.isNullOrBlank()) return exits
        val index = exits.indexOfFirst { it.ip == ip }
        if (index <= 0) return exits
        val chosen = exits[index]
        return listOf(chosen) + exits.filterIndexed { at, _ -> at != index }
    }
}
