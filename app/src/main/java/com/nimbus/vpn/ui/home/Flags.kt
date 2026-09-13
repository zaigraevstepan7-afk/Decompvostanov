package com.nimbus.vpn.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.R
import com.nimbus.vpn.data.ConfigParser

fun countryCodeForEndpoint(endpoint: String?): String? {
    val host = endpoint?.substringBefore(":")?.lowercase().orEmpty()
    val labels = host.split('.').filter { it.isNotBlank() }
    labels.forEach { label ->
        if (FLAG_EMOJI.containsKey(label)) return label
    }
    labels.forEach { label ->
        FLAG_EMOJI.keys.forEach { code ->
            val suffix = label.removePrefix(code)
            if (suffix != label && suffix.isNotEmpty() && suffix.all { it.isDigit() }) {
                return code
            }
        }
    }
    FLAG_EMOJI.keys.forEach { code ->
        if (host.contains(".$code.") || host.startsWith("$code-") || host.contains("-$code-")) {
            return code
        }
    }
    return null
}

fun flagForEndpoint(endpoint: String?): String {
    val code = countryCodeForEndpoint(endpoint)
    return FLAG_EMOJI[code] ?: "🌐"
}

fun flagResForEndpoint(endpoint: String?): Int? {
    val code = countryCodeForEndpoint(endpoint) ?: return null
    return FLAG_DRAWABLES[code]
}

fun subtitleForConfig(raw: String): String {
    val preview = ConfigParser.parse(raw)
    val proto = if (preview.isAmnezia) "AmneziaWG" else "WireGuard"
    return listOfNotNull(preview.endpoint, proto).joinToString(" · ")
}

@Composable
fun FlagBadge(endpoint: String?, modifier: Modifier = Modifier) {
    val res = flagResForEndpoint(endpoint)
    if (res != null) {
        Image(
            painter = painterResource(res),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier.size(36.dp).clip(CircleShape),
        )
    } else {
        Text(flagForEndpoint(endpoint), fontSize = 22.sp, modifier = modifier)
    }
}

private val FLAG_EMOJI = mapOf(
    "de" to "🇩🇪", "ru" to "🇷🇺", "se" to "🇸🇪", "lv" to "🇱🇻", "nl" to "🇳🇱",
    "us" to "🇺🇸", "uk" to "🇬🇧", "gb" to "🇬🇧", "fr" to "🇫🇷", "pl" to "🇵🇱",
    "fi" to "🇫🇮", "no" to "🇳🇴", "dk" to "🇩🇰", "ee" to "🇪🇪", "lt" to "🇱🇹",
    "cz" to "🇨🇿", "at" to "🇦🇹", "ch" to "🇨🇭", "it" to "🇮🇹", "es" to "🇪🇸",
    "tr" to "🇹🇷", "ua" to "🇺🇦", "by" to "🇧🇾", "kz" to "🇰🇿", "jp" to "🇯🇵",
    "sg" to "🇸🇬", "hk" to "🇭🇰", "ca" to "🇨🇦", "au" to "🇦🇺", "br" to "🇧🇷",
    "in" to "🇮🇳", "ae" to "🇦🇪", "il" to "🇮🇱", "ro" to "🇷🇴", "md" to "🇲🇩",
    "ge" to "🇬🇪", "am" to "🇦🇲", "az" to "🇦🇿", "kg" to "🇰🇬", "uz" to "🇺🇿",
)

private val FLAG_DRAWABLES = mapOf(
    "de" to R.drawable.flag_de,
    "pl" to R.drawable.flag_pl,
    "nl" to R.drawable.flag_nl,
    "fi" to R.drawable.flag_fi,
    "ee" to R.drawable.flag_ee,
    "lv" to R.drawable.flag_lv,
    "ru" to R.drawable.flag_ru,
    "us" to R.drawable.flag_us,
    "gb" to R.drawable.flag_gb,
    "uk" to R.drawable.flag_gb,
    "fr" to R.drawable.flag_fr,
    "ua" to R.drawable.flag_ua,
    "tr" to R.drawable.flag_tr,
    "cz" to R.drawable.flag_cz,
    "at" to R.drawable.flag_at,
    "it" to R.drawable.flag_it,
    "es" to R.drawable.flag_es,
    "se" to R.drawable.flag_se,
    "no" to R.drawable.flag_no,
    "dk" to R.drawable.flag_dk,
    "lt" to R.drawable.flag_lt,
)
