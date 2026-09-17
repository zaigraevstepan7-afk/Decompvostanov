package com.antigravity.core.agent

data class FileInfo(
    val name: String,
    val path: String,
    val directory: Boolean,
    val size: Long,
)

data class ShellResult(
    val exitCode: Int,
    val stdout: String,
    val stderr: String,
) {
    val ok: Boolean get() = exitCode == 0
    fun render(): String {
        val out = stdout.trim()
        val err = stderr.trim()
        return buildString {
            append("exit=$exitCode")
            if (out.isNotEmpty()) append("\nstdout:\n").append(out)
            if (err.isNotEmpty()) append("\nstderr:\n").append(err)
        }
    }
}

data class ExtractResult(
    val archive: String,
    val destination: String,
    val files: List<String>,
) {
    fun render(): String {
        val preview = files.take(40).joinToString("\n")
        val more = if (files.size > 40) "\n… ещё ${files.size - 40} файлов" else ""
        return "Распаковано ${files.size} файлов в $destination\n$preview$more"
    }
}

interface DeviceFs {
    var workspace: String
    fun resolve(path: String): String
    fun exists(path: String): Boolean
    fun isDirectory(path: String): Boolean
    fun readText(path: String, offset: Int? = null, limit: Int? = null): String
    fun writeText(path: String, content: String)
    fun writeBytes(path: String, bytes: ByteArray)
    fun readBytes(path: String): ByteArray
    fun editText(path: String, oldText: String, newText: String): String
    fun list(path: String): List<FileInfo>
    fun mkdir(path: String)
    fun delete(path: String)
    fun move(from: String, to: String)
    fun copy(from: String, to: String)
    fun glob(pattern: String, dir: String?): List<String>
    fun grep(pattern: String, path: String, glob: String?): List<String>
    fun download(url: String, dest: String): String
    fun extract(archive: String, dest: String?): ExtractResult
    fun shell(command: String, workingDir: String?, timeoutMs: Long): ShellResult
}

class DeviceException(message: String) : RuntimeException(message)
