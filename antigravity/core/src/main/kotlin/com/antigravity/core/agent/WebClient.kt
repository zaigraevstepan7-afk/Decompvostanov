package com.antigravity.core.agent

import okhttp3.OkHttpClient
import okhttp3.Request
import java.net.URI
import java.net.URLDecoder
import java.net.URLEncoder
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.util.concurrent.TimeUnit

data class SearchHit(
    val title: String,
    val url: String,
    val snippet: String = "",
)

object WebSearch {
    fun parseDuckDuckGo(html: String, limit: Int = 8): List<SearchHit> {
        val hits = mutableListOf<SearchHit>()
        val seen = mutableSetOf<String>()
        val link = Regex(
            """<a[^>]*class="[^"]*result__a[^"]*"[^>]*href="([^"]+)"[^>]*>(.*?)</a>""",
            setOf(RegexOption.IGNORE_CASE, RegexOption.DOT_MATCHES_ALL),
        )
        val snippet = Regex(
            """class="[^"]*result__snippet[^"]*"[^>]*>(.*?)</(?:a|td|span|div)>""",
            setOf(RegexOption.IGNORE_CASE, RegexOption.DOT_MATCHES_ALL),
        )
        val snippets = snippet.findAll(html).map { htmlToText(it.groupValues[1], 400) }.toList()
        link.findAll(html).forEachIndexed { index, match ->
            if (hits.size >= limit) return@forEachIndexed
            val url = unwrapDuckDuckGo(decodeEntities(match.groupValues[1])).trim()
            if (url.isBlank() || !url.startsWith("http") || !seen.add(url)) return@forEachIndexed
            val title = htmlToText(match.groupValues[2], 180).ifBlank { url }
            hits += SearchHit(title = title, url = url, snippet = snippets.getOrNull(index).orEmpty())
        }
        if (hits.isNotEmpty()) return hits
        val lite = Regex(
            """<a[^>]*rel="nofollow"[^>]*href="([^"]+)"[^>]*>(.*?)</a>""",
            setOf(RegexOption.IGNORE_CASE, RegexOption.DOT_MATCHES_ALL),
        )
        lite.findAll(html).forEach { match ->
            if (hits.size >= limit) return@forEach
            val url = unwrapDuckDuckGo(decodeEntities(match.groupValues[1])).trim()
            if (!url.startsWith("http") || url.contains("duckduckgo.com") || !seen.add(url)) return@forEach
            hits += SearchHit(title = htmlToText(match.groupValues[2], 180).ifBlank { url }, url = url)
        }
        return hits
    }

    fun unwrapDuckDuckGo(href: String): String {
        val raw = href.trim().replace("&amp;", "&")
        val abs = when {
            raw.startsWith("//") -> "https:$raw"
            raw.startsWith("/l/?") || raw.startsWith("/l?") -> "https://duckduckgo.com$raw"
            else -> raw
        }
        val query = abs.substringAfter('?', "").substringBefore('#')
        if (query.isBlank()) return abs
        query.split('&').forEach { pair ->
            val key = pair.substringBefore('=')
            val value = pair.substringAfter('=', "")
            if (key == "uddg" && value.isNotBlank()) {
                return runCatching { URLDecoder.decode(value, StandardCharsets.UTF_8) }.getOrDefault(abs)
            }
        }
        return abs
    }

    fun render(query: String, hits: List<SearchHit>): String {
        if (hits.isEmpty()) {
            return "Поиск «$query»: ничего не найдено. Уточни запрос или открой конкретный URL через web_fetch."
        }
        return buildString {
            append("Поиск «$query» (${hits.size}):\n")
            hits.forEachIndexed { index, hit ->
                append("${index + 1}. ${hit.title}\n")
                append("   ${hit.url}\n")
                if (hit.snippet.isNotBlank()) append("   ${hit.snippet}\n")
            }
        }.trim()
    }

    fun htmlToText(html: String, maxChars: Int = 40_000): String {
        var s = html
        s = s.replace(Regex("(?is)<script[^>]*>.*?</script>"), " ")
        s = s.replace(Regex("(?is)<style[^>]*>.*?</style>"), " ")
        s = s.replace(Regex("(?is)<noscript[^>]*>.*?</noscript>"), " ")
        s = s.replace(Regex("(?i)<br\\s*/?>"), "\n")
        s = s.replace(Regex("(?i)</(p|div|h[1-6]|li|tr|section|article)>"), "\n")
        s = s.replace(Regex("<[^>]+>"), " ")
        s = decodeEntities(s)
        s = s.replace(Regex("[\\t\\x0B\\f\\r ]+"), " ")
        s = s.replace(Regex(" *\\n *"), "\n")
        s = s.replace(Regex("\\n{3,}"), "\n\n")
        return s.trim().take(maxChars)
    }

    fun decodeEntities(raw: String): String =
        raw.replace("&amp;", "&")
            .replace("&lt;", "<")
            .replace("&gt;", ">")
            .replace("&quot;", "\"")
            .replace("&#39;", "'")
            .replace("&nbsp;", " ")
            .replace(Regex("&#(\\d+);")) { match ->
                match.groupValues[1].toIntOrNull()?.toChar()?.toString() ?: match.value
            }
            .replace(Regex("&#x([0-9a-fA-F]+);")) { match ->
                match.groupValues[1].toIntOrNull(16)?.toChar()?.toString() ?: match.value
            }
}

class WebClient(
    private val http: OkHttpClient = defaultHttp(),
    private val searchEndpoint: String = "https://html.duckduckgo.com/html/",
) {
    fun search(query: String, limit: Int = 8): String {
        val q = query.trim()
        if (q.isEmpty()) throw DeviceException("Пустой поисковый запрос")
        val url = searchEndpoint.trimEnd('/') + "/?q=" + URLEncoder.encode(q, StandardCharsets.UTF_8)
        val html = get(url, accept = "text/html")
        val hits = WebSearch.parseDuckDuckGo(html, limit)
        return WebSearch.render(q, hits)
    }

    fun fetch(url: String, maxChars: Int = 40_000): String {
        val cleaned = url.trim()
        val uri = runCatching { URI(cleaned) }.getOrElse { throw DeviceException("Плохой URL: $cleaned") }
        if (uri.scheme != "http" && uri.scheme != "https") {
            throw DeviceException("Только http(s): $cleaned")
        }
        val response = getRaw(cleaned, accept = "*/*")
        val mime = response.mime.substringBefore(';').trim().lowercase()
        if (mime.startsWith("image/") || mime in BINARY_MIME) {
            return "Бинарный ответ $mime, ${response.body.size} байт. Чтобы сохранить на телефон, используй download."
        }
        val html = String(response.body, charsetOf(response.mime))
        val text = if (mime.contains("html") || html.contains("<html", ignoreCase = true)) {
            WebSearch.htmlToText(html, maxChars)
        } else {
            html.take(maxChars)
        }
        return "URL: $cleaned\nMIME: ${response.mime.ifBlank { "unknown" }}\n\n$text".trim()
    }

    private fun get(url: String, accept: String): String =
        getRaw(url, accept).body.toString(Charsets.UTF_8)

    private fun getRaw(url: String, accept: String): FetchBody {
        val request = Request.Builder()
            .url(url)
            .header("User-Agent", USER_AGENT)
            .header("Accept", accept)
            .header("Accept-Language", "ru,en;q=0.8")
            .get()
            .build()
        http.newCall(request).execute().use { response ->
            val bytes = response.body?.bytes() ?: ByteArray(0)
            if (!response.isSuccessful) {
                throw DeviceException("HTTP ${response.code} $url")
            }
            if (bytes.size > 2_500_000) {
                throw DeviceException("Ответ слишком большой (${bytes.size} байт)")
            }
            val mime = response.header("Content-Type").orEmpty()
            return FetchBody(bytes, mime)
        }
    }

    private fun charsetOf(mime: String): Charset {
        val lower = mime.lowercase()
        return when {
            lower.contains("utf-16") -> StandardCharsets.UTF_16
            else -> StandardCharsets.UTF_8
        }
    }

    private data class FetchBody(val body: ByteArray, val mime: String)

    companion object {
        private const val USER_AGENT =
            "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36"
        private val BINARY_MIME = setOf(
            "application/pdf",
            "application/zip",
            "application/octet-stream",
            "application/x-gzip",
            "application/vnd.android.package-archive",
        )

        fun defaultHttp(): OkHttpClient = OkHttpClient.Builder()
            .followRedirects(true)
            .followSslRedirects(true)
            .connectTimeout(20, TimeUnit.SECONDS)
            .readTimeout(45, TimeUnit.SECONDS)
            .build()
    }
}
