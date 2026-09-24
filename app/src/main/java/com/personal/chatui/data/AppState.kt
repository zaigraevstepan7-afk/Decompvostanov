package com.personal.chatui.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

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

class AppViewModel : ViewModel() {
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

    fun send(raw: String) {
        val text = raw.trim()
        if (text.isEmpty()) return
        messagesSent++
        val userMessage = ChatMessage(nextMessageId++, true, text)
        val notice = ChatMessage(
            nextMessageId++,
            false,
            "Сообщение осталось на устройстве. Модель сюда не подключена.",
        )
        val id = currentChatId
        if (id == null) {
            val newId = nextChatId++
            val title = text.lineSequence().first().take(42)
            chats = listOf(ChatThread(newId, title, listOf(userMessage, notice))) + chats
            currentChatId = newId
        } else {
            chats = chats.map { thread ->
                if (thread.id != id) {
                    thread
                } else {
                    val alreadyTold = thread.messages.any { !it.fromUser }
                    val extra = if (alreadyTold) listOf(userMessage) else listOf(userMessage, notice)
                    thread.copy(messages = thread.messages + extra)
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
