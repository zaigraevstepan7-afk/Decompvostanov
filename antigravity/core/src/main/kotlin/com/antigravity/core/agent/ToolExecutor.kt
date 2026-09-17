package com.antigravity.core.agent

import com.antigravity.core.api.jsonString
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.intOrNull
import kotlinx.serialization.json.jsonPrimitive

class ToolExecutor(private val fs: DeviceFs) {
    fun execute(name: String, args: JsonObject): String {
        return try {
            when (name) {
                "read_file" -> fs.readText(
                    str(args, "path"),
                    args["offset"]?.jsonPrimitive?.intOrNull,
                    args["limit"]?.jsonPrimitive?.intOrNull,
                )
                "write_file" -> {
                    fs.writeText(str(args, "path"), str(args, "content"))
                    "Записано: ${fs.resolve(str(args, "path"))}"
                }
                "edit_file" -> fs.editText(str(args, "path"), str(args, "old_text"), str(args, "new_text"))
                "list_dir" -> {
                    val path = jsonString(args["path"]) ?: fs.workspace
                    fs.list(path).joinToString("\n") {
                        val mark = if (it.directory) "dir" else "file"
                        "$mark\t${it.size}\t${it.path}"
                    }.ifBlank { "(пусто)" }
                }
                "glob" -> fs.glob(str(args, "pattern"), jsonString(args["dir"])).joinToString("\n").ifBlank { "(нет совпадений)" }
                "grep" -> fs.grep(str(args, "pattern"), str(args, "path"), jsonString(args["glob"]))
                    .joinToString("\n").ifBlank { "(нет совпадений)" }
                "mkdir" -> {
                    fs.mkdir(str(args, "path"))
                    "Создано: ${fs.resolve(str(args, "path"))}"
                }
                "delete_path" -> {
                    val path = fs.resolve(str(args, "path"))
                    fs.delete(path)
                    "Удалено: $path"
                }
                "move_path" -> {
                    fs.move(str(args, "from"), str(args, "to"))
                    "Перемещено → ${fs.resolve(str(args, "to"))}"
                }
                "copy_path" -> {
                    fs.copy(str(args, "from"), str(args, "to"))
                    "Скопировано → ${fs.resolve(str(args, "to"))}"
                }
                "download" -> fs.download(str(args, "url"), str(args, "dest"))
                "extract_archive" -> fs.extract(str(args, "archive"), jsonString(args["dest"])).render()
                "shell" -> fs.shell(
                    str(args, "command"),
                    jsonString(args["working_dir"]),
                    args["timeout_ms"]?.jsonPrimitive?.intOrNull?.toLong() ?: 120_000L,
                ).render()
                else -> "Неизвестный инструмент: $name"
            }
        } catch (error: Exception) {
            "ОШИБКА $name: ${error.message ?: error::class.java.simpleName}"
        }
    }

    private fun str(args: JsonObject, key: String): String =
        jsonString(args[key])?.takeIf { it.isNotBlank() }
            ?: throw DeviceException("Нет аргумента $key")
}
