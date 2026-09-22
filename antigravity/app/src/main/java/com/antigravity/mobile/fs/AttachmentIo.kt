package com.antigravity.mobile.fs

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.provider.OpenableColumns
import com.antigravity.core.agent.AttachmentCodec
import com.antigravity.mobile.PendingAttachment
import java.io.ByteArrayOutputStream
import java.io.File
import java.util.UUID

object AttachmentIo {
    private const val MAX_BYTES = 24 * 1024 * 1024

    fun import(context: Context, uri: Uri, inbox: File): PendingAttachment {
        inbox.mkdirs()
        val resolver = context.contentResolver
        val name = queryName(resolver, uri) ?: "file-${System.currentTimeMillis()}"
        val mime = resolver.getType(uri) ?: mimeFromName(name)
        val raw = resolver.openInputStream(uri)?.use { it.readBytes() }
            ?: error("Не прочитать вложение $name")
        if (raw.isEmpty()) error("Пустой файл $name")
        if (raw.size > MAX_BYTES) error("Файл $name больше 24 МБ")
        val (bytes, outMime) = if (AttachmentCodec.isImage(mime, name)) {
            compressImage(raw, mime, name)
        } else {
            raw to mime.ifBlank { "application/octet-stream" }
        }
        val dest = uniqueFile(inbox, sanitize(name), outMime)
        try {
            dest.writeBytes(bytes)
        } catch (error: Exception) {
            error("Не сохранить вложение ${dest.name}: ${error.message ?: "нет доступа"}")
        }
        return PendingAttachment(
            id = UUID.randomUUID().toString(),
            name = dest.name,
            mime = outMime,
            path = dest.absolutePath,
            devicePath = dest.absolutePath,
            size = dest.length(),
            isImage = AttachmentCodec.isImage(outMime, dest.name),
        )
    }

    private fun compressImage(bytes: ByteArray, mime: String, name: String): Pair<ByteArray, String> {
        val known = mime.lowercase()
        if (bytes.size <= 350_000 && known in setOf("image/jpeg", "image/png", "image/gif", "image/webp")) {
            return bytes to known
        }
        val bounds = BitmapFactory.Options().apply { inJustDecodeBounds = true }
        BitmapFactory.decodeByteArray(bytes, 0, bytes.size, bounds)
        if (bounds.outWidth <= 0 || bounds.outHeight <= 0) {
            return bytes to (if (known.startsWith("image/")) known else "image/jpeg")
        }
        var sample = 1
        val longest = maxOf(bounds.outWidth, bounds.outHeight)
        while (longest / sample > 1600) sample *= 2
        val decoded = BitmapFactory.decodeByteArray(
            bytes,
            0,
            bytes.size,
            BitmapFactory.Options().apply { inSampleSize = sample },
        ) ?: return bytes to (if (known.startsWith("image/")) known else "image/jpeg")
        val out = ByteArrayOutputStream()
        val ok = decoded.compress(Bitmap.CompressFormat.JPEG, 85, out)
        decoded.recycle()
        if (!ok) return bytes to mime.ifBlank { mimeFromName(name) }
        return out.toByteArray() to "image/jpeg"
    }

    private fun queryName(resolver: android.content.ContentResolver, uri: Uri): String? {
        return resolver.query(uri, arrayOf(OpenableColumns.DISPLAY_NAME), null, null, null)?.use { cursor ->
            if (!cursor.moveToFirst()) return@use null
            val index = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME)
            if (index >= 0) cursor.getString(index) else null
        }
    }

    private fun sanitize(name: String): String {
        val base = name.substringAfterLast('/').substringAfterLast('\\')
        val clean = base.replace(Regex("[^A-Za-z0-9._\\-\\u0400-\\u04FF ]+"), "_").trim().ifBlank { "file" }
        return clean.take(80)
    }

    private fun uniqueFile(inbox: File, name: String, mime: String): File {
        val withExt = if (name.contains('.')) name else name + extensionFor(mime)
        var dest = File(inbox, withExt)
        var i = 2
        val stem = dest.nameWithoutExtension
        val ext = dest.extension.let { if (it.isBlank()) "" else ".$it" }
        while (dest.exists()) {
            dest = File(inbox, "$stem-$i$ext")
            i++
        }
        return dest
    }

    private fun extensionFor(mime: String): String = when (mime.lowercase()) {
        "image/jpeg" -> ".jpg"
        "image/png" -> ".png"
        "image/gif" -> ".gif"
        "image/webp" -> ".webp"
        "application/pdf" -> ".pdf"
        else -> ""
    }

    private fun mimeFromName(name: String): String {
        val ext = name.substringAfterLast('.', "").lowercase()
        return when (ext) {
            "jpg", "jpeg" -> "image/jpeg"
            "png" -> "image/png"
            "gif" -> "image/gif"
            "webp" -> "image/webp"
            "pdf" -> "application/pdf"
            "txt", "md", "kt", "java", "py", "json", "xml", "csv", "html", "css", "js" -> "text/plain"
            else -> "application/octet-stream"
        }
    }
}
