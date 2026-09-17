package com.antigravity.core.agent

import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import java.util.Base64

data class LoadedAttachment(
    val name: String,
    val mime: String,
    val bytes: ByteArray,
    val savedPath: String,
) {
    val isImage: Boolean get() = AttachmentCodec.isImage(mime, name)
    val isPdf: Boolean get() = AttachmentCodec.isPdf(mime, name)
    val isText: Boolean get() = AttachmentCodec.isText(mime, name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LoadedAttachment) return false
        return name == other.name && mime == other.mime && savedPath == other.savedPath && bytes.contentEquals(other.bytes)
    }

    override fun hashCode(): Int = name.hashCode() * 31 + mime.hashCode()
}

object AttachmentCodec {
    const val MAX_INLINE_BYTES = 4 * 1024 * 1024
    const val MAX_TEXT_CHARS = 180_000

    fun isImage(mime: String, name: String = ""): Boolean {
        val lower = mime.lowercase()
        if (lower.startsWith("image/")) return true
        return extension(name) in IMAGE_EXT
    }

    fun isPdf(mime: String, name: String = ""): Boolean {
        val lower = mime.lowercase()
        return lower == "application/pdf" || extension(name) == "pdf"
    }

    fun isText(mime: String, name: String = ""): Boolean {
        val lower = mime.lowercase()
        if (lower.startsWith("text/")) return true
        if (lower in TEXT_MIME) return true
        return extension(name) in TEXT_EXT
    }

    fun toGeminiParts(attachments: List<LoadedAttachment>): List<JsonObject> {
        if (attachments.isEmpty()) return emptyList()
        val parts = mutableListOf<JsonObject>()
        val notes = StringBuilder()
        attachments.forEach { item ->
            when {
                item.isImage && item.bytes.size in 1..MAX_INLINE_BYTES -> {
                    parts += inlineData(normalizedImageMime(item.mime, item.name), item.bytes)
                    notes.append("Картинка «${item.name}» приложена к сообщению и лежит на телефоне: ${item.savedPath}\n")
                }
                item.isPdf && item.bytes.size in 1..MAX_INLINE_BYTES -> {
                    parts += inlineData("application/pdf", item.bytes)
                    notes.append("PDF «${item.name}» приложен и сохранён: ${item.savedPath}\n")
                }
                item.isText -> {
                    val text = item.bytes.toString(Charsets.UTF_8)
                    val body = if (text.length > MAX_TEXT_CHARS) {
                        text.take(MAX_TEXT_CHARS) + "\n… обрезано, полный файл: ${item.savedPath}"
                    } else {
                        text
                    }
                    parts += buildJsonObject {
                        put("text", "Файл «${item.name}» (${item.savedPath}):\n```\n$body\n```")
                    }
                }
                else -> {
                    notes.append(
                        "Файл «${item.name}» (${item.mime.ifBlank { "application/octet-stream" }}, ${item.bytes.size} байт) сохранён на телефоне: ${item.savedPath}. " +
                            "Читай через read_file / extract_archive / shell.\n",
                    )
                }
            }
        }
        if (notes.isNotBlank()) {
            parts.add(0, buildJsonObject { put("text", notes.toString().trim()) })
        }
        return parts
    }

    fun inlineData(mimeType: String, bytes: ByteArray): JsonObject = buildJsonObject {
        put(
            "inlineData",
            buildJsonObject {
                put("mimeType", mimeType)
                put("data", Base64.getEncoder().encodeToString(bytes))
            },
        )
    }

    private fun normalizedImageMime(mime: String, name: String): String {
        val lower = mime.lowercase()
        if (lower in setOf("image/jpeg", "image/png", "image/gif", "image/webp")) return lower
        return when (extension(name)) {
            "png" -> "image/png"
            "gif" -> "image/gif"
            "webp" -> "image/webp"
            "jpg", "jpeg" -> "image/jpeg"
            else -> if (lower.startsWith("image/")) lower else "image/jpeg"
        }
    }

    private fun extension(name: String): String = name.substringAfterLast('.', "").lowercase()

    private val IMAGE_EXT = setOf("png", "jpg", "jpeg", "gif", "webp", "heic", "heif", "bmp", "avif")
    private val TEXT_EXT = setOf(
        "txt", "md", "markdown", "json", "xml", "csv", "tsv", "kt", "kts", "java", "py", "js", "ts",
        "tsx", "jsx", "html", "htm", "css", "gradle", "toml", "yaml", "yml", "sh", "properties",
        "log", "sql", "c", "h", "cpp", "hpp", "rs", "go", "swift", "dart", "rb", "php", "ini",
        "conf", "cfg", "gitignore", "pro",
    )
    private val TEXT_MIME = setOf(
        "application/json",
        "application/xml",
        "application/javascript",
        "application/x-javascript",
        "application/yaml",
        "application/x-yaml",
        "application/sql",
    )
}
