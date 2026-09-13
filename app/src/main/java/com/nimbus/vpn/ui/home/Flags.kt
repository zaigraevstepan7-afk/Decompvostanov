package com.nimbus.vpn.ui.home

import com.nimbus.vpn.data.ConfigParser

fun flagForEndpoint(endpoint: String?): String {
    val host = endpoint?.substringBefore(":")?.lowercase().orEmpty()
    val token = host.substringBefore(".")
    val mapped = COUNTRY_FLAGS[token]
    if (mapped != null) return mapped
    COUNTRY_FLAGS.forEach { (code, flag) ->
        if (host.contains(".$code.") || host.startsWith("$code-") || host.contains("-$code-")) {
            return flag
        }
    }
    return "🌐"
}

fun subtitleForConfig(raw: String): String {
    val preview = ConfigParser.parse(raw)
    val proto = if (preview.isAmnezia) "AmneziaWG" else "WireGuard"
    return listOfNotNull(preview.endpoint, proto).joinToString(" · ")
}

private val COUNTRY_FLAGS = mapOf(
    "de" to "🇩🇪", "ru" to "🇷🇺", "se" to "🇸🇪", "lv" to "🇱🇻", "nl" to "🇳🇱",
    "us" to "🇺🇸", "uk" to "🇬🇧", "gb" to "🇬🇧", "fr" to "🇫🇷", "pl" to "🇵🇱",
    "fi" to "🇫🇮", "no" to "🇳🇴", "dk" to "🇩🇰", "ee" to "🇪🇪", "lt" to "🇱🇹",
    "cz" to "🇨🇿", "at" to "🇦🇹", "ch" to "🇨🇭", "it" to "🇮🇹", "es" to "🇪🇸",
    "tr" to "🇹🇷", "ua" to "🇺🇦", "by" to "🇧🇾", "kz" to "🇰🇿", "jp" to "🇯🇵",
    "sg" to "🇸🇬", "hk" to "🇭🇰", "ca" to "🇨🇦", "au" to "🇦🇺", "br" to "🇧🇷",
    "in" to "🇮🇳", "ae" to "🇦🇪", "il" to "🇮🇱", "ro" to "🇷🇴", "md" to "🇲🇩",
    "ge" to "🇬🇪", "am" to "🇦🇲", "az" to "🇦🇿", "kg" to "🇰🇬", "uz" to "🇺🇿",
)
