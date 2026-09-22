package com.antigravity.core.agent

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.add
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.put

object ToolCatalog {
    val googleSearch: JsonObject = buildJsonObject {
        put("googleSearch", buildJsonObject { })
    }

    val urlContext: JsonObject = buildJsonObject {
        put("urlContext", buildJsonObject { })
    }

    val functionTool: JsonObject = buildJsonObject {
        put(
            "functionDeclarations",
            buildJsonArray {
                        add(fn("read_file", "Прочитать текстовый файл на телефоне. Путь абсолютный или относительно workspace.", props {
                            req("path", "string", "Путь к файлу")
                            opt("offset", "integer", "Первая строка (с 1)")
                            opt("limit", "integer", "Сколько строк вернуть")
                        }, listOf("path")))
                        add(fn("write_file", "Создать или полностью перезаписать файл на телефоне.", props {
                            req("path", "string", "Путь")
                            req("content", "string", "Содержимое")
                        }, listOf("path", "content")))
                        add(fn("edit_file", "Точечная замена уникального фрагмента в файле на телефоне.", props {
                            req("path", "string", "Путь")
                            req("old_text", "string", "Точный фрагмент")
                            req("new_text", "string", "На что заменить")
                        }, listOf("path", "old_text", "new_text")))
                        add(fn("list_dir", "Список файлов и папок на телефоне.", props {
                            opt("path", "string", "Каталог, по умолчанию workspace")
                        }, emptyList()))
                        add(fn("glob", "Найти файлы по glob-маске на телефоне.", props {
                            req("pattern", "string", "Например **/*.kt или *.zip")
                            opt("dir", "string", "Где искать")
                        }, listOf("pattern")))
                        add(fn("grep", "Поиск по содержимому файлов (regex) на телефоне.", props {
                            req("pattern", "string", "Regex")
                            req("path", "string", "Файл или каталог")
                            opt("glob", "string", "Фильтр имён, например *.java")
                        }, listOf("pattern", "path")))
                        add(fn("mkdir", "Создать каталог на телефоне.", props {
                            req("path", "string", "Путь")
                        }, listOf("path")))
                        add(fn("delete_path", "Удалить файл или папку на телефоне.", props {
                            req("path", "string", "Путь")
                        }, listOf("path")))
                        add(fn("move_path", "Переместить/переименовать файл или папку на телефоне.", props {
                            req("from", "string", "Откуда")
                            req("to", "string", "Куда")
                        }, listOf("from", "to")))
                        add(fn("copy_path", "Скопировать файл или папку на телефоне.", props {
                            req("from", "string", "Откуда")
                            req("to", "string", "Куда")
                        }, listOf("from", "to")))
                        add(fn("download", "Скачать файл из интернета НА ТЕЛЕФОН (не на компьютер).", props {
                            req("url", "string", "HTTP(S) URL")
                            req("dest", "string", "Куда сохранить на устройстве")
                        }, listOf("url", "dest")))
                        add(
                            fn(
                                "extract_archive",
                                "Распаковать zip/rar/7z/tar/tar.gz/tar.bz2/tar.xz СТРОГО на телефоне, рядом с архивом или в dest.",
                                props {
                                    req("archive", "string", "Путь к архиву на телефоне")
                                    opt("dest", "string", "Куда распаковать. Если нет — папка с именем архива без расширения")
                                },
                                listOf("archive"),
                            ),
                        )
                        add(
                            fn(
                                "shell",
                                "Выполнить команду на телефоне (root shell). Распаковка, сборка, git, chmod, всё локально.",
                                props {
                                    req("command", "string", "Команда")
                                    opt("working_dir", "string", "Рабочий каталог")
                                    opt("timeout_ms", "integer", "Таймаут, по умолчанию 120000")
                                },
                                listOf("command"),
                            ),
                        )
                        add(
                            fn(
                                "web_search",
                                "Искать в интернете (свежие факты, документация, ошибки). Вернёт заголовки, URL и сниппеты.",
                                props {
                                    req("query", "string", "Поисковый запрос")
                                    opt("limit", "integer", "Сколько результатов, по умолчанию 8")
                                },
                                listOf("query"),
                            ),
                        )
                        add(
                            fn(
                                "web_fetch",
                                "Открыть HTTP(S) страницу и вернуть текст. Для бинарников используй download на телефон.",
                                props {
                                    req("url", "string", "Полный URL")
                                },
                                listOf("url"),
                            ),
                        )
                    },
                )
    }

    val declarations: JsonArray = buildJsonArray {
        add(googleSearch)
        add(urlContext)
        add(functionTool)
    }

    val withoutGrounding: JsonArray = buildJsonArray {
        add(functionTool)
    }

    private val webNames = setOf("web_search", "web_fetch")

    fun forMode(agent: Boolean, webSearch: Boolean): JsonArray {
        val selected = functionTool["functionDeclarations"]!!
            .jsonArray
            .filter { element ->
                val name = element.jsonObject["name"]!!.jsonPrimitive.content
                when {
                    name in webNames -> webSearch
                    else -> agent
                }
            }
        if (selected.isEmpty() && !webSearch) return JsonArray(emptyList())
        return buildJsonArray {
            if (webSearch) {
                add(googleSearch)
                add(urlContext)
            }
            if (selected.isNotEmpty()) {
                add(buildJsonObject { put("functionDeclarations", JsonArray(selected)) })
            }
        }
    }

    fun toolAllowed(name: String, agent: Boolean, webSearch: Boolean): Boolean = when (name) {
        "web_search", "web_fetch" -> webSearch
        else -> agent
    }

    private fun fn(name: String, description: String, parameters: JsonObject, required: List<String>) =
        buildJsonObject {
            put("name", name)
            put("description", description)
            put(
                "parameters",
                buildJsonObject {
                    put("type", "object")
                    put("properties", parameters)
                    put("required", buildJsonArray { required.forEach { add(it) } })
                },
            )
        }

    private fun props(block: MutableMap<String, JsonObject>.() -> Unit): JsonObject {
        val map = mutableMapOf<String, JsonObject>()
        map.block()
        return JsonObject(map)
    }

    private fun MutableMap<String, JsonObject>.req(name: String, type: String, description: String) {
        put(name, field(type, description))
    }

    private fun MutableMap<String, JsonObject>.opt(name: String, type: String, description: String) {
        put(name, field(type, description))
    }

    private fun field(type: String, description: String) = buildJsonObject {
        put("type", type)
        put("description", description)
    }
}
