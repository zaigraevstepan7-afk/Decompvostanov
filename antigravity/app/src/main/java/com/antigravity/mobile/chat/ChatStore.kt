package com.antigravity.mobile.chat

import com.antigravity.core.agent.ChatAttachment
import com.antigravity.core.agent.ChatMessage
import com.antigravity.core.api.ContentTurn
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import java.io.File
import java.util.UUID

data class ChatThread(
    val id: String,
    val title: String,
    val preview: String,
    val updatedAtMs: Long,
)

@Serializable
data class StoredAttachment(
    val name: String,
    val mime: String,
    val path: String? = null,
    val isImage: Boolean = false,
)

@Serializable
data class StoredMessage(
    val id: String,
    val role: String,
    val text: String,
    val tool: String? = null,
    val startedAtMs: Long? = null,
    val durationMs: Long? = null,
    val args: String? = null,
    val attachments: List<StoredAttachment> = emptyList(),
)

@Serializable
data class StoredTurn(
    val role: String,
    val parts: List<JsonObject>,
)

@Serializable
data class StoredChat(
    val id: String,
    val title: String,
    val preview: String = "",
    val createdAtMs: Long,
    val updatedAtMs: Long,
    val messages: List<StoredMessage> = emptyList(),
    val history: List<StoredTurn> = emptyList(),
)

object ChatTitle {
    fun fromUserText(text: String): String {
        val clean = text.trim().replace(Regex("\\s+"), " ")
        if (clean.isBlank()) return "Новый чат"
        return clean.take(42)
    }

    fun preview(messages: List<ChatMessage>): String {
        val last = messages.lastOrNull { it.role == "user" || it.role == "assistant" } ?: return ""
        return last.text.trim().replace(Regex("\\s+"), " ").take(80)
    }
}

class ChatStore(private val root: File) {
    private val json = Json {
        ignoreUnknownKeys = true
        encodeDefaults = true
    }
    private val dir = File(root, "chats").also { it.mkdirs() }
    private val currentFile = File(root, "current-chat.txt")

    fun currentId(): String? =
        runCatching { currentFile.readText().trim().takeIf { it.isNotBlank() } }.getOrNull()

    fun setCurrent(id: String) {
        currentFile.writeText(id)
    }

    fun list(): List<ChatThread> =
        dir.listFiles()
            ?.filter { it.isFile && it.extension == "json" }
            ?.mapNotNull { file -> runCatching { json.decodeFromString<StoredChat>(file.readText()) }.getOrNull() }
            ?.sortedByDescending { it.updatedAtMs }
            ?.map {
                ChatThread(id = it.id, title = it.title.ifBlank { "Новый чат" }, preview = it.preview, updatedAtMs = it.updatedAtMs)
            }
            ?: emptyList()

    fun load(id: String): StoredChat? {
        val file = File(dir, "$id.json")
        if (!file.exists()) return null
        return runCatching { json.decodeFromString<StoredChat>(file.readText()) }.getOrNull()
    }

    fun save(chat: StoredChat) {
        dir.mkdirs()
        File(dir, "${chat.id}.json").writeText(json.encodeToString(chat))
        setCurrent(chat.id)
    }

    fun delete(id: String) {
        File(dir, "$id.json").delete()
        if (currentId() == id) currentFile.delete()
    }

    fun create(now: Long = System.currentTimeMillis()): StoredChat {
        val chat = StoredChat(
            id = UUID.randomUUID().toString(),
            title = "Новый чат",
            createdAtMs = now,
            updatedAtMs = now,
        )
        save(chat)
        return chat
    }

    companion object {
        fun toMessages(chat: StoredChat): List<ChatMessage> =
            chat.messages.map { item ->
                ChatMessage(
                    id = item.id.ifBlank { UUID.randomUUID().toString() },
                    role = item.role,
                    text = item.text,
                    tool = item.tool,
                    startedAtMs = item.startedAtMs,
                    durationMs = item.durationMs,
                    args = item.args,
                    attachments = item.attachments.map {
                        ChatAttachment(name = it.name, mime = it.mime, path = it.path, isImage = it.isImage)
                    },
                )
            }

        fun fromMessages(messages: List<ChatMessage>): List<StoredMessage> =
            messages.map { item ->
                StoredMessage(
                    id = item.id,
                    role = item.role,
                    text = item.text,
                    tool = item.tool,
                    startedAtMs = item.startedAtMs,
                    durationMs = item.durationMs,
                    args = item.args,
                    attachments = item.attachments.map {
                        StoredAttachment(name = it.name, mime = it.mime, path = it.path, isImage = it.isImage)
                    },
                )
            }

        fun toHistory(chat: StoredChat): List<ContentTurn> =
            chat.history.map { ContentTurn(it.role, it.parts) }

        fun fromHistory(history: List<ContentTurn>): List<StoredTurn> =
            history.map { StoredTurn(it.role, it.parts) }
    }
}
