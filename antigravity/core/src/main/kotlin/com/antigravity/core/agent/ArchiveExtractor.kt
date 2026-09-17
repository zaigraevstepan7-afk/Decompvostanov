package com.antigravity.core.agent

import com.github.junrar.Junrar
import org.apache.commons.compress.archivers.sevenz.SevenZFile
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream
import org.apache.commons.compress.compressors.xz.XZCompressorInputStream
import java.io.File
import java.io.FileInputStream
import java.util.zip.ZipInputStream

object ArchiveExtractor {
    private const val MAX_FILES = 20_000
    private const val MAX_BYTES = 2L * 1024 * 1024 * 1024

    fun extract(archive: File, destination: File, writeBytes: (File, ByteArray) -> Unit): List<String> {
        destination.mkdirs()
        val name = archive.name.lowercase()
        val files = when {
            name.endsWith(".zip") || name.endsWith(".apk") || name.endsWith(".jar") ->
                extractZip(archive, destination, writeBytes)
            name.endsWith(".rar") -> extractRar(archive, destination, writeBytes)
            name.endsWith(".7z") -> extract7z(archive, destination, writeBytes)
            name.endsWith(".tar") -> extractTar(FileInputStream(archive), destination, writeBytes)
            name.endsWith(".tar.gz") || name.endsWith(".tgz") ->
                extractTar(GzipCompressorInputStream(FileInputStream(archive)), destination, writeBytes)
            name.endsWith(".tar.bz2") || name.endsWith(".tbz2") ->
                extractTar(BZip2CompressorInputStream(FileInputStream(archive)), destination, writeBytes)
            name.endsWith(".tar.xz") || name.endsWith(".txz") ->
                extractTar(XZCompressorInputStream(FileInputStream(archive)), destination, writeBytes)
            name.endsWith(".gz") && !name.endsWith(".tar.gz") -> {
                val out = File(destination, archive.name.removeSuffix(".gz"))
                writeBytes(out, GzipCompressorInputStream(FileInputStream(archive)).use { it.readBytes() })
                listOf(out.absolutePath)
            }
            else -> {
                // sniff zip magic
                val header = archive.inputStream().use { stream -> stream.readNBytes(4) }
                if (header.size >= 2 && header[0] == 0x50.toByte() && header[1] == 0x4B.toByte()) {
                    extractZip(archive, destination, writeBytes)
                } else {
                    error("Неизвестный архив: ${archive.name}. Поддержка: zip, rar, 7z, tar, tar.gz, tar.bz2, tar.xz")
                }
            }
        }
        return files
    }

    private fun extractZip(archive: File, destination: File, writeBytes: (File, ByteArray) -> Unit): List<String> {
        val out = mutableListOf<String>()
        var total = 0L
        ZipInputStream(FileInputStream(archive)).use { zip ->
            var entry = zip.nextEntry
            while (entry != null) {
                val target = safeTarget(destination, entry.name)
                if (entry.isDirectory) {
                    target.mkdirs()
                } else {
                    val bytes = zip.readBytes()
                    total += bytes.size
                    guard(out.size, total)
                    writeBytes(target, bytes)
                    out += target.absolutePath
                }
                zip.closeEntry()
                entry = zip.nextEntry
            }
        }
        return out
    }

    private fun extractRar(archive: File, destination: File, writeBytes: (File, ByteArray) -> Unit): List<String> {
        val extracted = Junrar.extract(archive, destination)
        return extracted.mapNotNull { it?.absolutePath }
            .also { if (it.size > MAX_FILES) error("Слишком много файлов в rar") }
            .also {
                // junrar already wrote files; rewrite via callback so root copy still works
                it.forEach { path ->
                    val file = File(path)
                    if (file.isFile) writeBytes(file, file.readBytes())
                }
            }
    }

    private fun extract7z(archive: File, destination: File, writeBytes: (File, ByteArray) -> Unit): List<String> {
        val out = mutableListOf<String>()
        var total = 0L
        @Suppress("DEPRECATION")
        SevenZFile(archive).use { seven ->
            var entry = seven.nextEntry
            while (entry != null) {
                val target = safeTarget(destination, entry.name)
                if (entry.isDirectory) {
                    target.mkdirs()
                } else {
                    val bytes = ByteArray(entry.size.toInt().coerceAtLeast(0))
                    var offset = 0
                    while (offset < bytes.size) {
                        val read = seven.read(bytes, offset, bytes.size - offset)
                        if (read < 0) break
                        offset += read
                    }
                    total += bytes.size
                    guard(out.size, total)
                    writeBytes(target, bytes)
                    out += target.absolutePath
                }
                entry = seven.nextEntry
            }
        }
        return out
    }

    private fun extractTar(
        compressed: java.io.InputStream,
        destination: File,
        writeBytes: (File, ByteArray) -> Unit,
    ): List<String> {
        val out = mutableListOf<String>()
        var total = 0L
        TarArchiveInputStream(compressed).use { tar ->
            var entry = tar.nextEntry
            while (entry != null) {
                val target = safeTarget(destination, entry.name)
                if (entry.isDirectory) {
                    target.mkdirs()
                } else {
                    val bytes = tar.readBytes()
                    total += bytes.size
                    guard(out.size, total)
                    writeBytes(target, bytes)
                    out += target.absolutePath
                }
                entry = tar.nextEntry
            }
        }
        return out
    }

    private fun guard(count: Int, total: Long) {
        if (count >= MAX_FILES) error("Архив слишком большой: больше $MAX_FILES файлов")
        if (total > MAX_BYTES) error("Архив слишком большой: больше 2 ГБ распакованных данных")
    }

    private fun safeTarget(root: File, name: String): File {
        val target = File(root, name).canonicalFile
        val rootCanon = root.canonicalFile
        if (!target.path.startsWith(rootCanon.path + File.separator) && target != rootCanon) {
            error("Zip-slip: $name")
        }
        target.parentFile?.mkdirs()
        return target
    }
}
