package com.antigravity.mobile.fs

import android.content.Context
import com.antigravity.core.agent.DeviceException
import com.antigravity.core.agent.ExtractResult
import com.antigravity.core.agent.FileInfo
import com.antigravity.core.agent.LocalDeviceFs
import com.antigravity.core.agent.ShellResult
import com.topjohnwu.superuser.Shell
import java.io.File
import java.util.UUID
import java.util.concurrent.TimeUnit

/**
 * On-device filesystem. Privileged paths go through su so the agent
 * actually unpacks zips and edits files on the phone, not on a PC.
 */
class RootDeviceFs(
    private val context: Context,
    workspace: File,
) : LocalDeviceFs(workspace) {

    override fun readBytes(path: String): ByteArray {
        val file = File(resolve(path))
        if (file.canRead() && file.isFile) return super.readBytes(path)
        val tmp = cacheFile("read")
        val copied = su("cp ${q(file.absolutePath)} ${q(tmp.absolutePath)} && chmod 666 ${q(tmp.absolutePath)}")
        if (!copied.ok || !tmp.exists()) {
            throw DeviceException("Не прочитать $path\n${copied.render()}")
        }
        return tmp.readBytes().also { tmp.delete() }
    }

    override fun writeBytes(path: String, bytes: ByteArray) {
        val file = File(resolve(path))
        val tmp = cacheFile("write")
        tmp.writeBytes(bytes)
        val destDir = file.parentFile?.absolutePath ?: "/"
        val result = su("mkdir -p ${q(destDir)} && cp ${q(tmp.absolutePath)} ${q(file.absolutePath)} && chmod 644 ${q(file.absolutePath)}")
        tmp.delete()
        if (!result.ok) throw DeviceException("Не записать $path\n${result.render()}")
    }

    override fun exists(path: String): Boolean {
        val file = File(resolve(path))
        if (file.exists()) return true
        return su("[ -e ${q(file.absolutePath)} ]").ok
    }

    override fun isDirectory(path: String): Boolean {
        val file = File(resolve(path))
        if (file.exists()) return file.isDirectory
        return su("[ -d ${q(file.absolutePath)} ]").ok
    }

    override fun list(path: String): List<FileInfo> {
        return try {
            super.list(path)
        } catch (_: Exception) {
            val dir = File(resolve(path))
            val result = su("ls -1ap ${q(dir.absolutePath)}")
            if (!result.ok) throw DeviceException(result.render())
            result.stdout.lines().filter { it.isNotBlank() && it != "./" && it != "../" }.map { name ->
                val directory = name.endsWith("/")
                val clean = name.trimEnd('/')
                FileInfo(clean, File(dir, clean).absolutePath, directory, 0)
            }
        }
    }

    override fun mkdir(path: String) {
        val dir = File(resolve(path))
        if (dir.mkdirs() || dir.isDirectory) return
        val result = su("mkdir -p ${q(dir.absolutePath)}")
        if (!result.ok) throw DeviceException(result.render())
    }

    override fun delete(path: String) {
        val file = File(resolve(path))
        if (file.exists() && file.deleteRecursively()) return
        val result = su("rm -rf ${q(file.absolutePath)}")
        if (!result.ok) throw DeviceException(result.render())
    }

    override fun extract(archive: String, dest: String?): ExtractResult {
        val src = File(resolve(archive))
        val readable = if (src.canRead()) src else {
            val tmp = cacheFile("archive-${src.name}")
            val copy = su("cp ${q(src.absolutePath)} ${q(tmp.absolutePath)} && chmod 666 ${q(tmp.absolutePath)}")
            if (!copy.ok) throw DeviceException("Не скопировать архив\n${copy.render()}")
            tmp
        }
        val destination = File(
            dest?.let { resolve(it) } ?: File(src.parentFile, src.nameWithoutExtension).absolutePath,
        )
        val staging = File(context.cacheDir, "extract-${UUID.randomUUID()}")
        staging.mkdirs()
        val extracted = super.extract(readable.absolutePath, staging.absolutePath)
        su("mkdir -p ${q(destination.absolutePath)} && cp -a ${q(staging.absolutePath)}/. ${q(destination.absolutePath)}/")
        staging.deleteRecursively()
        if (readable != src) readable.delete()
        val prefix = extracted.destination.trimEnd('/')
        val destAbs = destination.absolutePath.trimEnd('/')
        val finalFiles = extracted.files.map { path -> destAbs + path.removePrefix(prefix) }
        return ExtractResult(src.absolutePath, destAbs, finalFiles)
    }

    override fun shell(command: String, workingDir: String?, timeoutMs: Long): ShellResult {
        val cwd = File(resolve(workingDir ?: workspace)).absolutePath
        su("mkdir -p ${q(cwd)}")
        val full = "cd ${q(cwd)} && $command"
        val result = Shell.cmd(full).exec()
        if (timeoutMs < 1_000) {
            TimeUnit.MILLISECONDS.sleep(1)
        }
        return ShellResult(result.code, result.out.joinToString("\n"), result.err.joinToString("\n"))
    }

    private fun cacheFile(prefix: String): File = File(context.cacheDir, "$prefix-${UUID.randomUUID()}")

    private fun su(command: String): ShellResult {
        val result = Shell.cmd(command).exec()
        return ShellResult(result.code, result.out.joinToString("\n"), result.err.joinToString("\n"))
    }

    private fun q(path: String): String = "'" + path.replace("'", "'\\''") + "'"
}
