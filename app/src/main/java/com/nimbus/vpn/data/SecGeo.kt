package com.nimbus.vpn.data

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

object SecGeo {
    private val json = Json { ignoreUnknownKeys = true }

    fun parsePlace(raw: String): String? {
        val start = raw.indexOf('{')
        val end = raw.lastIndexOf('}')
        if (start < 0 || end <= start) return null
        val root = runCatching { json.parseToJsonElement(raw.substring(start, end + 1)).jsonObject }.getOrNull()
            ?: return null
        val status = root["status"]?.jsonPrimitive?.contentOrNull
        if (status != null && !status.equals("success", true)) return null
        val country = root.text("country") ?: return null
        val city = root.text("city")
        return if (city.isNullOrBlank() || city.equals(country, true)) country else "$country, $city"
    }

    private fun JsonObject.text(key: String): String? {
        val value = this[key] as? JsonPrimitive ?: return null
        return value.contentOrNull?.takeIf { it.isNotBlank() }
    }
}
