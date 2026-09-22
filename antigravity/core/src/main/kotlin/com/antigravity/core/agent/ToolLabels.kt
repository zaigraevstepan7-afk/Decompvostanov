package com.antigravity.core.agent

import com.antigravity.core.api.jsonString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.jsonObject

object ToolLabels {
    fun parseArgs(raw: String?): JsonObject {
        if (raw.isNullOrBlank()) return buildJsonObject { }
        return runCatching { Json.parseToJsonElement(raw).jsonObject }.getOrDefault(buildJsonObject { })
    }

    fun isCommand(name: String?): Boolean = name == "shell"

    fun command(name: String?, args: JsonObject): String? {
        if (!isCommand(name)) return null
        return jsonString(args["command"])?.trim()?.ifBlank { null }
    }

    fun headline(name: String?, args: JsonObject, result: String? = null): String {
        val tool = name.orEmpty()
        val path = fileName(jsonString(args["path"]))
        val from = fileName(jsonString(args["from"]))
        val to = fileName(jsonString(args["to"]))
        val counted = result?.let { countLines(it) }
        return when (tool) {
            "read_file" -> "Read ${path ?: "file"}"
            "write_file" -> "Wrote ${path ?: "file"}"
            "edit_file" -> "Edited ${path ?: "file"}"
            "list_dir", "glob" -> when {
                counted != null -> "Explored $counted ${plural(counted, "file", "files")}"
                else -> "Exploring ${path ?: fileName(jsonString(args["dir"])) ?: "files"}"
            }
            "grep" -> "Grep ${jsonString(args["pattern"]) ?: path ?: "files"}"
            "mkdir" -> "Created ${path ?: "folder"}"
            "delete_path" -> "Deleted ${path ?: "path"}"
            "move_path" -> "Moved ${from ?: "file"} → ${to ?: "…"}"
            "copy_path" -> "Copied ${from ?: "file"} → ${to ?: "…"}"
            "download" -> "Downloaded ${fileName(jsonString(args["dest"])) ?: "file"}"
            "extract_archive" -> "Extracted ${fileName(jsonString(args["archive"])) ?: "archive"}"
            "shell" -> command(tool, args) ?: "shell"
            "web_search" -> "Searched ${jsonString(args["query"]) ?: "web"}"
            "web_fetch" -> "Fetched ${shortUrl(jsonString(args["url"]))}"
            else -> tool.ifBlank { "tool" }
        }
    }

    fun fileName(path: String?): String? {
        val clean = path?.trim()?.trimEnd('/') ?: return null
        if (clean.isBlank() || clean == "." || clean == "./") return null
        return clean.substringAfterLast('/').ifBlank { clean }
    }

    fun countLines(result: String): Int =
        result.lineSequence().count { line ->
            val trimmed = line.trim()
            trimmed.isNotEmpty() &&
                trimmed != "(пусто)" &&
                trimmed != "(нет совпадений)" &&
                !trimmed.startsWith("ОШИБКА")
        }

    private fun plural(n: Int, one: String, many: String) = if (n == 1) one else many

    private fun shortUrl(url: String?): String {
        if (url.isNullOrBlank()) return "url"
        return url.removePrefix("https://").removePrefix("http://").substringBefore('/').ifBlank { url }
    }
}
