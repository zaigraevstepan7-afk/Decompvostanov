package com.antigravity.core.agent

import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.File
import java.nio.charset.Charset
import java.nio.file.FileSystems
import java.nio.file.Files
import java.nio.file.Path
import java.util.concurrent.TimeUnit
import kotlin.io.path.extension
import kotlin.io.path.isDirectory
import kotlin.io.path.isRegularFile
import kotlin.io.path.name
import kotlin.io.path.pathString
import kotlin.io.path.readBytes
import kotlin.io.path.relativeTo
import kotlin.streams.asSequence

/**
 * Local filesystem used by unit tests and as the on-device Java fallback.
 * On the phone [com.antigravity.mobile.fs.RootDeviceFs] wraps this with su.
 */
open class LocalDeviceFs(
    initialWorkspace: File,
    private val http: OkHttpClient = OkHttpClient.Builder()
        .followRedirects(true)
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(120, TimeUnit.SECONDS)
        .build(),
) : DeviceFs {
    private var workspaceDir: File = initialWorkspace.absoluteFile.also { it.mkdirs() }

    override var workspace: String
        get() = workspaceDir.absolutePath
        set(value) {
            workspaceDir = File(value).absoluteFile.also { it.mkdirs() }
        }

    override fun resolve(path: String): String {
        val raw = path.trim()
        if (raw.isEmpty() || raw == "." || raw == "./") return workspaceDir.absolutePath
        val file = if (raw.startsWith("/")) File(raw) else File(workspaceDir, raw)
        return file.absoluteFile.path
    }

    override fun exists(path: String): Boolean = File(resolve(path)).exists()

    override fun isDirectory(path: String): Boolean = File(resolve(path)).isDirectory

    override fun readBytes(path: String): ByteArray {
        val file = File(resolve(path))
        if (!file.exists()) throw DeviceException("Нет файла: ${file.path}")
        if (file.isDirectory) throw DeviceException("Это каталог, не файл: ${file.path}")
        if (file.length() > 8L * 1024 * 1024) {
            throw DeviceException("Файл больше 8 МБ, читайте частями или через shell: ${file.path}")
        }
        return file.readBytes()
    }

    override fun readText(path: String, offset: Int?, limit: Int?): String {
        val file = File(resolve(path))
        val text = readBytes(path).toString(Charset.forName("UTF-8"))
        val lines = text.split('\n')
        val from = (offset ?: 1).coerceAtLeast(1)
        val slice = if (limit == null) {
            lines.drop(from - 1)
        } else {
            lines.drop(from - 1).take(limit)
        }
        return slice.mapIndexed { index, line ->
            "${from + index}| $line"
        }.joinToString("\n").ifEmpty { "(пустой файл ${file.path})" }
    }

    override fun writeBytes(path: String, bytes: ByteArray) {
        val file = File(resolve(path))
        file.parentFile?.mkdirs()
        file.writeBytes(bytes)
    }

    override fun writeText(path: String, content: String) {
        writeBytes(path, content.toByteArray(Charsets.UTF_8))
    }

    override fun editText(path: String, oldText: String, newText: String): String {
        val file = File(resolve(path))
        val original = file.readText(Charsets.UTF_8)
        val count = original.split(oldText).size - 1
        if (count == 0) throw DeviceException("Фрагмент не найден в ${file.path}")
        if (count > 1) throw DeviceException("Фрагмент встречается $count раз — уточните old_text")
        file.writeText(original.replaceFirst(oldText, newText), Charsets.UTF_8)
        return "Заменено 1 вхождение в ${file.path}"
    }

    override fun list(path: String): List<FileInfo> {
        val dir = File(resolve(path))
        if (!dir.exists()) throw DeviceException("Нет пути: ${dir.path}")
        if (!dir.isDirectory) {
            return listOf(FileInfo(dir.name, dir.absolutePath, false, dir.length()))
        }
        return dir.listFiles()?.sortedBy { it.name.lowercase() }?.map {
            FileInfo(it.name, it.absolutePath, it.isDirectory, if (it.isFile) it.length() else 0)
        } ?: emptyList()
    }

    override fun mkdir(path: String) {
        val dir = File(resolve(path))
        if (!dir.mkdirs() && !dir.isDirectory) throw DeviceException("Не удалось создать ${dir.path}")
    }

    override fun delete(path: String) {
        val file = File(resolve(path))
        if (!file.exists()) throw DeviceException("Нет пути: ${file.path}")
        if (file.isDirectory) file.deleteRecursively() else file.delete()
    }

    override fun move(from: String, to: String) {
        val src = File(resolve(from))
        val dst = File(resolve(to))
        dst.parentFile?.mkdirs()
        if (!src.renameTo(dst)) {
            src.copyRecursively(dst, overwrite = true)
            src.deleteRecursively()
        }
    }

    override fun copy(from: String, to: String) {
        val src = File(resolve(from))
        val dst = File(resolve(to))
        if (src.isDirectory) src.copyRecursively(dst, overwrite = true)
        else {
            dst.parentFile?.mkdirs()
            src.copyTo(dst, overwrite = true)
        }
    }

    override fun glob(pattern: String, dir: String?): List<String> {
        val root = File(resolve(dir ?: workspace)).toPath()
        if (!Files.exists(root)) return emptyList()
        val matcher = FileSystems.getDefault().getPathMatcher("glob:$pattern")
        return Files.walk(root).use { stream ->
            stream.asSequence()
                .filter { it.isRegularFile() }
                .map { it.relativeTo(root) }
                .filter { matcher.matches(it) || matcher.matches(it.fileName) }
                .map { root.resolve(it).toAbsolutePath().pathString }
                .take(500)
                .toList()
        }
    }

    override fun grep(pattern: String, path: String, glob: String?): List<String> {
        val regex = Regex(pattern)
        val root = File(resolve(path)).toPath()
        val matcher = glob?.let { FileSystems.getDefault().getPathMatcher("glob:$it") }
        val hits = mutableListOf<String>()
        fun consider(file: Path) {
            if (!file.isRegularFile()) return
            if (matcher != null && !matcher.matches(file.fileName) && !matcher.matches(root.relativize(file))) return
            val ext = file.extension.lowercase()
            if (ext in setOf("png", "jpg", "jpeg", "gif", "webp", "mp4", "apk", "so", "dex", "zip", "7z", "rar")) return
            val text = runCatching { Files.readString(file) }.getOrNull() ?: return
            text.lineSequence().forEachIndexed { index, line ->
                if (regex.containsMatchIn(line)) {
                    hits += "${file.toAbsolutePath()}:${index + 1}: $line"
                }
            }
        }
        if (Files.isRegularFile(root)) consider(root)
        else Files.walk(root).use { stream ->
            stream.asSequence().forEach { pathItem ->
                if (hits.size >= 200) return@forEach
                consider(pathItem)
            }
        }
        return hits
    }

    override fun download(url: String, dest: String): String {
        val target = File(resolve(dest))
        target.parentFile?.mkdirs()
        val request = Request.Builder().url(url).header("User-Agent", "Antigravity/1.0").build()
        http.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw DeviceException("download HTTP ${response.code} $url")
            val bytes = response.body?.bytes() ?: ByteArray(0)
            writeBytes(target.absolutePath, bytes)
            return "Скачано ${bytes.size} байт → ${target.absolutePath}"
        }
    }

    override fun extract(archive: String, dest: String?): ExtractResult {
        val src = File(resolve(archive))
        if (!src.exists() || !src.isFile) throw DeviceException("Архив не найден: ${src.path}")
        val destination = File(
            dest?.let { resolve(it) } ?: File(src.parentFile, src.nameWithoutExtension).absolutePath,
        )
        destination.mkdirs()
        val files = ArchiveExtractor.extract(src, destination) { file, bytes ->
            file.parentFile?.mkdirs()
            file.writeBytes(bytes)
        }
        return ExtractResult(src.absolutePath, destination.absolutePath, files)
    }

    override fun shell(command: String, workingDir: String?, timeoutMs: Long): ShellResult {
        val cwd = File(resolve(workingDir ?: workspace))
        cwd.mkdirs()
        val process = ProcessBuilder("bash", "-lc", command)
            .directory(cwd)
            .redirectErrorStream(false)
            .start()
        val finished = process.waitFor(timeoutMs, TimeUnit.MILLISECONDS)
        if (!finished) {
            process.destroyForcibly()
            return ShellResult(124, "", "timeout ${timeoutMs}ms")
        }
        val stdout = process.inputStream.bufferedReader().readText()
        val stderr = process.errorStream.bufferedReader().readText()
        return ShellResult(process.exitValue(), stdout, stderr)
    }
}
