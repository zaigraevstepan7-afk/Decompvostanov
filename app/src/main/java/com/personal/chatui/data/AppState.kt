package com.personal.chatui.data

import android.app.Application
import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

enum class ThemeMode(val label: String) {
    System("Как в системе"),
    Light("Светлая"),
    Dark("Тёмная"),
}

enum class Accent(val label: String, val color: Color) {
    Blue("Синий", Color(0xFF3566EF)),
    Green("Зелёный", Color(0xFF34C759)),
    Purple("Фиолетовый", Color(0xFFAF52DE)),
    Pink("Розовый", Color(0xFFFF2D55)),
    Orange("Оранжевый", Color(0xFFFF9500)),
}

data class ChatMessage(
    val id: Long,
    val fromUser: Boolean,
    val text: String,
)

data class ChatThread(
    val id: Long,
    val title: String,
    val messages: List<ChatMessage>,
)

data class Connector(
    val name: String,
    val enabled: Boolean,
)

class AppViewModel(app: Application) : AndroidViewModel(app) {
    private val prefs = app.getSharedPreferences("chatui", Context.MODE_PRIVATE)
    var themeMode by mutableStateOf(ThemeMode.Light)
    var accent by mutableStateOf(Accent.Blue)
    var displayName by mutableStateOf("Степан")
    var aboutYou by mutableStateOf("")
    var responseStyle by mutableStateOf("")
    var showSuggestions by mutableStateOf(true)
    var memoryEnabled by mutableStateOf(true)
    var memoryNote by mutableStateOf("Имя: Степан")
    var strictFilter by mutableStateOf(true)
    var notifications by mutableStateOf(true)
    var scheduledNotifications by mutableStateOf(true)
    var haptics by mutableStateOf(true)
    var parentalControl by mutableStateOf(false)
    var adsPersonalization by mutableStateOf(false)
    var improveModel by mutableStateOf(false)
    var remoteEnabled by mutableStateOf(false)
    var ageConfirmed by mutableStateOf(true)
    var analytics by mutableStateOf(false)
    var voice by mutableStateOf("Juniper")
    var signedIn by mutableStateOf(true)
    var geminiKey by mutableStateOf(prefs.getString("gemini_key", "") ?: "")
    var deepThink by mutableStateOf(false)
    var pendingJpeg by mutableStateOf<ByteArray?>(null)
    var bugReport by mutableStateOf("")
    var bugSaved by mutableStateOf(false)
    var messagesSent by mutableIntStateOf(0)
    var chats by mutableStateOf(initialChats())
    var currentChatId by mutableStateOf<Long?>(null)
    var projects by mutableStateOf(listOf<String>())
    var tasks by mutableStateOf(listOf<String>())
    var connectors by mutableStateOf(
        listOf(
            Connector("Почта", false),
            Connector("Календарь", false),
            Connector("Файлы", false),
        ),
    )

    val email: String = "zaigraevstepan7@gmail.com"

    private var nextChatId = 100L
    private var nextMessageId = 1000L

    fun saveGeminiKey(value: String) {
        geminiKey = value.trim()
        prefs.edit().putString("gemini_key", geminiKey).apply()
    }

    fun send(raw: String) {
        val text = raw.trim()
        if (text.isEmpty()) return
        messagesSent++
        val userMessage = ChatMessage(nextMessageId++, true, text)
        val pendingId = nextMessageId++
        val pending = ChatMessage(pendingId, false, "…")
        val chatId = currentChatId
        val jpeg = pendingJpeg
        pendingJpeg = null
        if (chatId == null) {
            val newId = nextChatId++
            val title = text.lineSequence().first().take(42)
            chats = listOf(ChatThread(newId, title, listOf(userMessage, pending))) + chats
            currentChatId = newId
            ask(newId, pendingId, listOf(userMessage), jpeg)
        } else {
            val prior = chats.firstOrNull { it.id == chatId }?.messages.orEmpty()
            chats = chats.map { thread ->
                if (thread.id != chatId) thread else thread.copy(messages = thread.messages + userMessage + pending)
            }
            ask(chatId, pendingId, prior + userMessage, jpeg)
        }
    }

    private fun ask(chatId: Long, pendingId: Long, history: List<ChatMessage>, jpeg: ByteArray?) {
        val key = geminiKey
        val deep = deepThink
        viewModelScope.launch {
            val answer = withContext(Dispatchers.IO) {
                if (key.isBlank()) {
                    "Чтобы Gemini 3.8 Flash отвечал, открой «Подключить» и вставь свой ключ из Google AI Studio."
                } else {
                    runCatching { GeminiApi.complete(key, history, deep, jpeg) }
                        .getOrElse { "Модель не ответила: ${it.message ?: "нет сети"}" }
                }
            }
            chats = chats.map { thread ->
                if (thread.id != chatId) {
                    thread
                } else {
                    thread.copy(
                        messages = thread.messages.map { message ->
                            if (message.id == pendingId) message.copy(text = answer) else message
                        },
                    )
                }
            }
        }
    }

    fun newChat() {
        currentChatId = null
    }

    fun deleteChat(id: Long) {
        chats = chats.filterNot { it.id == id }
        if (currentChatId == id) currentChatId = null
    }

    fun clearChats() {
        chats = emptyList()
        currentChatId = null
    }

    fun addProject(name: String) {
        val trimmed = name.trim()
        if (trimmed.isNotEmpty()) projects = projects + trimmed
    }

    fun addTask(name: String) {
        val trimmed = name.trim()
        if (trimmed.isNotEmpty()) tasks = tasks + trimmed
    }

    fun toggleConnector(name: String) {
        connectors = connectors.map {
            if (it.name == name) it.copy(enabled = !it.enabled) else it
        }
    }

    fun exportText(): String {
        if (chats.isEmpty()) return "Чатов нет"
        return chats.joinToString("\n\n") { thread ->
            buildString {
                append(thread.title)
                thread.messages.forEach { message ->
                    append('\n')
                    append(if (message.fromUser) "Вы: " else "Ответ: ")
                    append(message.text)
                }
            }
        }
    }
}

private fun initialChats(): List<ChatThread> {
    var id = 1L
    fun user(text: String) = ChatMessage(id++, true, text)
    return listOf(
        ChatThread(1, "Чат гпт или гемини", listOf(user("Чем чат гпт отличается от гемини?"))),
        ChatThread(2, "Приветствие", listOf(user("Привет"))),
        ChatThread(3, "Приветствие ассистента", listOf(user("Представься коротко"))),
        ChatThread(4, "Режим VANTA", listOf(user("Режим VANTA"))),
        ChatThread(5, "Қалайсыз сұрағы", listOf(user("Сәлем"))),
        ChatThread(6, "Лабораторная работа №11", listOf(user("Лабораторная работа №11"))),
    )
}

val Voices = listOf("Juniper", "Ember", "Arbor", "Breeze", "Cove", "Maple", "Sol", "Spruce")
