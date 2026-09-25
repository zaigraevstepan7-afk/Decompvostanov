package com.nimbus.vpn.data

import java.net.HttpURLConnection
import java.net.URL
import java.net.URLDecoder
import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import java.util.Base64

/**
 * White-list cards are downloaded on the phone. The LTE subscription is all
 * white-list. The other subscription is mixed, so ordinary names are skipped.
 * Only VLESS is kept. WARP profiles stay.
 */
object WhitelistProfile {
    const val ENGINE = "whitelist"

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

    fun endpoint(raw: String): String? = value(raw, "Endpoint")

    fun link(raw: String): String? = value(raw, "Link")

    fun config(endpoint: String, link: String): String {
        return "[Bozya]\nEngine = $ENGINE\nEndpoint = $endpoint\nLink = $link\n"
    }

    fun flagEmoji(name: String): String? {
        val trimmed = name.trim()
        if (trimmed.length < 4) return null
        val first = trimmed.codePointAt(0)
        val secondIndex = Character.charCount(first)
        if (secondIndex >= trimmed.length) return null
        val second = trimmed.codePointAt(secondIndex)
        if (first !in 0x1F1E6..0x1F1FF || second !in 0x1F1E6..0x1F1FF) return null
        return trimmed.substring(0, secondIndex + Character.charCount(second))
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

object WhitelistSubscription {
    /** Bumped when the feeds change so the next launch replaces old white-list cards. */
    const val SOURCE = "bs-lte-liberty-1"

    private val feeds = listOf(
        Feed(
            url = "https://cdn-sub.file-racing.online/sub/lte/f9afd2d3-3858-403e-bbc9-9a720420c188",
            label = "LTE",
            onlyWhitelistNames = false,
        ),
        Feed(
            url = "https://connliberty.com/connection/subs/dcf2b960",
            label = "вторая",
            onlyWhitelistNames = true,
        ),
    )

    private const val MAX_BYTES = 1_500_000
    private const val MAX_PROFILES = 400
    private val LINK = Regex(
        """(?i)vless://[^\s"'#]+(?:#[^\r\n"']*)?""",
    )
    private val WHITELIST_MARK = Regex("""(?<!\p{L})бс(?!\p{L})""")

    data class Fetch(val profiles: List<VpnProfile>, val note: String)

    fun download(): Fetch {
        val merged = LinkedHashMap<String, VpnProfile>()
        val failed = ArrayList<String>()
        for (feed in feeds) {
            val body = runCatching { httpGet(feed.url) }.getOrNull()
            if (body == null) {
                failed += feed.label
                continue
            }
            profilesFrom(body, feed.onlyWhitelistNames).forEach { profile ->
                if (merged.size < MAX_PROFILES) merged.putIfAbsent(profile.id, profile)
            }
        }
        if (merged.isEmpty() && failed.size == feeds.size) {
            error("Подписки не скачались")
        }
        val note = buildString {
            append("Белые списки: ${merged.size}")
            if (failed.isNotEmpty()) append(". Не скачалось: ${failed.joinToString()}")
        }
        return Fetch(merged.values.toList(), note)
    }

    private fun httpGet(url: String): String {
        val connection = (URL(url).openConnection() as HttpURLConnection).apply {
            connectTimeout = 10_000
            readTimeout = 20_000
            instanceFollowRedirects = true
            setRequestProperty("Accept", "text/plain, */*")
            setRequestProperty("User-Agent", "BozyaVPN/${com.nimbus.vpn.BuildConfig.VERSION_NAME}")
        }
        try {
            val code = connection.responseCode
            val stream = if (code in 200..399) connection.inputStream else connection.errorStream
            val body = stream?.use { input ->
                val buffer = ByteArray(4096)
                val out = java.io.ByteArrayOutputStream()
                while (out.size() < MAX_BYTES) {
                    val read = input.read(buffer)
                    if (read < 0) break
                    val room = MAX_BYTES - out.size()
                    out.write(buffer, 0, minOf(read, room))
                }
                out.toString(StandardCharsets.UTF_8)
            }.orEmpty()
            if (code !in 200..299) error("Подписка ответила $code")
            return body
        } finally {
            connection.disconnect()
        }
    }

    /**
     * Measured servers first, lowest ping at the top. Not measured yet keep
     * their order. Servers that did not answer go last.
     */
    fun sortedByPing(profiles: List<VpnProfile>, millis: Map<String, Int?>): List<VpnProfile> {
        return profiles.withIndex().sortedWith(
            compareBy<IndexedValue<VpnProfile>>(
                { entry ->
                    val id = entry.value.id
                    when {
                        millis[id] != null -> 0
                        millis.containsKey(id) -> 2
                        else -> 1
                    }
                },
                { entry -> millis[entry.value.id] ?: Int.MAX_VALUE },
                { entry -> entry.index },
            ),
        ).map { it.value }
    }

    fun profilesFrom(body: String, onlyWhitelistNames: Boolean = false): List<VpnProfile> {
        val text = unwrap(body)
        val seen = LinkedHashSet<String>()
        val profiles = ArrayList<VpnProfile>()
        LINK.findAll(text).forEach { match ->
            if (profiles.size >= MAX_PROFILES) return@forEach
            val link = match.value.trim()
            val parsed = parseLink(link) ?: return@forEach
            if (onlyWhitelistNames && !isWhitelistName(parsed.name)) return@forEach
            val id = idFor(link)
            if (!seen.add(id)) return@forEach
            profiles += VpnProfile(
                id = id,
                name = parsed.name,
                rawConfig = WhitelistProfile.config(parsed.endpoint, link),
            )
        }
        return profiles
    }

    internal fun unwrap(body: String): String {
        val trimmed = body.trim().removePrefix("\uFEFF")
        if (trimmed.contains("://")) return trimmed
        val decoded = runCatching {
            String(Base64.getMimeDecoder().decode(trimmed), StandardCharsets.UTF_8)
        }.getOrNull() ?: return trimmed
        return if (decoded.contains("://")) decoded else trimmed
    }

    internal fun idFor(link: String): String {
        val bare = link.substringBefore('#')
        val digest = MessageDigest.getInstance("SHA-256").digest(bare.toByteArray(StandardCharsets.UTF_8))
        val hex = digest.joinToString("") { byte -> "%02x".format(byte) }
        return "bs:" + hex.take(16)
    }

    private fun parseLink(link: String): Parsed? {
        val hash = link.lastIndexOf('#')
        val bare = if (hash >= 0) link.substring(0, hash) else link
        val name = if (hash >= 0) {
            runCatching { URLDecoder.decode(link.substring(hash + 1), StandardCharsets.UTF_8) }
                .getOrDefault(link.substring(hash + 1))
                .trim()
        } else {
            ""
        }
        val rest = bare.substringAfter("://", "")
        val at = rest.lastIndexOf('@')
        if (at < 0) return null
        val hostport = rest.substring(at + 1).substringBefore('?')
        val host: String
        val port: Int
        if (hostport.startsWith("[")) {
            val end = hostport.indexOf(']')
            if (end < 0) return null
            host = hostport.substring(1, end)
            port = hostport.substring(end + 1).removePrefix(":").toIntOrNull() ?: return null
        } else {
            val colon = hostport.lastIndexOf(':')
            if (colon <= 0) return null
            host = hostport.substring(0, colon)
            port = hostport.substring(colon + 1).toIntOrNull() ?: return null
        }
        if (host.isBlank() || port !in 1..65535) return null
        val display = name.ifBlank { host }.take(80)
        if (isNotice(display, host, port)) return null
        return Parsed(display, "$host:$port")
    }

    internal fun isWhitelistName(name: String): Boolean {
        val low = name.lowercase()
        if ("lte" in low || "бел" in low || "вайт" in low || "обход" in low) return true
        if ("whitelist" in low || "white list" in low || "white-list" in low) return true
        return WHITELIST_MARK.containsMatchIn(low)
    }

    private fun isNotice(name: String, host: String, port: Int): Boolean {
        val low = name.lowercase()
        if ("устарел" in low || "обновите" in low || "github.com" in low || "t.me/" in low) return true
        return host.equals("zieng2.org", ignoreCase = true) && port <= 10
    }

    private data class Feed(val url: String, val label: String, val onlyWhitelistNames: Boolean)

    private data class Parsed(val name: String, val endpoint: String)
}
