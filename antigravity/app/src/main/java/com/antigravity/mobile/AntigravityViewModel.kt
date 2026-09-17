package com.antigravity.mobile

import android.app.Application
import android.net.Uri
import android.os.Environment
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.antigravity.core.agent.AgentListener
import com.antigravity.core.agent.AgentLoop
import com.antigravity.core.agent.AttachmentCodec
import com.antigravity.core.agent.ChatAttachment
import com.antigravity.core.agent.ChatMessage
import com.antigravity.core.agent.LoadedAttachment
import com.antigravity.core.api.CloudCodeClient
import com.antigravity.core.api.ContentTurn
import com.antigravity.core.api.GeminiModels
import com.antigravity.core.auth.AntigravityAuthClient
import com.antigravity.core.auth.AntigravityOAuth
import com.antigravity.core.auth.AntigravitySession
import com.antigravity.mobile.auth.SessionStore
import com.antigravity.mobile.chat.ChatStore
import com.antigravity.mobile.chat.ChatThread
import com.antigravity.mobile.chat.ChatTitle
import com.antigravity.mobile.chat.StoredChat
import com.antigravity.mobile.fs.AttachmentIo
import com.antigravity.mobile.fs.RootDeviceFs
import com.antigravity.mobile.root.RootAccess
import com.antigravity.mobile.root.RootState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.serialization.json.JsonObject
import java.io.File

data class PendingAttachment(
    val id: String,
    val name: String,
    val mime: String,
    val path: String,
    val devicePath: String = path,
    val size: Long,
    val isImage: Boolean,
) {
    fun toChat(): ChatAttachment = ChatAttachment(name = name, mime = mime, path = path, isImage = isImage)
}

data class UiState(
    val root: RootState = RootState.Checking,
    val session: AntigravitySession? = null,
    val loggingIn: Boolean = false,
    val busy: Boolean = false,
    val model: String = GeminiModels.DEFAULT,
    val workspace: String = defaultWorkspace(),
    val input: String = "",
    val error: String? = null,
    val messages: List<ChatMessage> = emptyList(),
    val pending: List<PendingAttachment> = emptyList(),
    val chatId: String = "",
    val chats: List<ChatThread> = emptyList(),
)

data class GoogleLoginRequest(val url: String, val state: String)

fun defaultWorkspace(): String {
    val ext = Environment.getExternalStorageDirectory()
    return File(ext, "Antigravity").absolutePath
}

class AntigravityViewModel(application: Application) : AndroidViewModel(application) {
    private val store = SessionStore(application)
    private val chatStore = ChatStore(application.filesDir)
    private val auth = AntigravityAuthClient()
    private val llm = CloudCodeClient()
    private val history = mutableListOf<ContentTurn>()
    private val initialChat: StoredChat = chatStore.currentId()?.let { chatStore.load(it) }
        ?: chatStore.list().firstOrNull()?.let { chatStore.load(it.id) }
        ?: chatStore.create()

    private val _state = MutableStateFlow(
        UiState(
            session = store.load(),
            model = store.loadModel() ?: GeminiModels.DEFAULT,
            workspace = store.loadWorkspace() ?: defaultWorkspace(),
            chatId = initialChat.id,
            chats = chatStore.list(),
            messages = ChatStore.toMessages(initialChat),
        ),
    )
    val state: StateFlow<UiState> = _state

    init {
        history.addAll(ChatStore.toHistory(initialChat))
    }

    fun refreshRoot() {
        viewModelScope.launch(Dispatchers.IO) {
            val root = RootAccess.probe()
            _state.update { it.copy(root = root) }
            if (root == RootState.Granted) {
                runCatching { File(_state.value.workspace).mkdirs() }
            }
        }
    }

    fun setModel(model: String) {
        val id = model.trim().ifBlank { GeminiModels.DEFAULT }
        store.saveModel(id)
        _state.update { it.copy(model = id, error = null) }
    }

    fun setWorkspace(path: String) {
        val trimmed = path.trim().ifBlank { defaultWorkspace() }
        store.saveWorkspace(trimmed)
        _state.update { it.copy(workspace = trimmed) }
    }

    fun logout() {
        store.clear()
        persistCurrent()
        _state.update { it.copy(session = null, pending = emptyList(), error = null) }
    }

    fun newChat() {
        if (_state.value.busy) return
        persistCurrent()
        val created = chatStore.create()
        history.clear()
        _state.update {
            it.copy(
                chatId = created.id,
                chats = chatStore.list(),
                messages = emptyList(),
                pending = emptyList(),
                error = null,
                busy = false,
            )
        }
    }

    fun openChat(id: String) {
        if (_state.value.busy) return
        if (id == _state.value.chatId) return
        persistCurrent()
        val loaded = chatStore.load(id) ?: return
        history.clear()
        history.addAll(ChatStore.toHistory(loaded))
        chatStore.setCurrent(loaded.id)
        _state.update {
            it.copy(
                chatId = loaded.id,
                chats = chatStore.list(),
                messages = ChatStore.toMessages(loaded),
                pending = emptyList(),
                error = null,
            )
        }
    }

    fun deleteChat(id: String) {
        if (_state.value.busy) return
        val current = _state.value.chatId
        if (current == id) persistCurrent()
        chatStore.delete(id)
        if (current != id) {
            _state.update { it.copy(chats = chatStore.list()) }
            return
        }
        val next = chatStore.list().firstOrNull()?.let { chatStore.load(it.id) } ?: chatStore.create()
        history.clear()
        history.addAll(ChatStore.toHistory(next))
        chatStore.setCurrent(next.id)
        _state.update {
            it.copy(
                chatId = next.id,
                chats = chatStore.list(),
                messages = ChatStore.toMessages(next),
                pending = emptyList(),
                error = null,
            )
        }
    }

    fun createGoogleLogin(): GoogleLoginRequest? {
        if (_state.value.root != RootState.Granted) {
            _state.update { it.copy(error = "Без root вход недоступен") }
            return null
        }
        val state = AntigravityOAuth.randomState()
        _state.update { it.copy(loggingIn = true, error = null) }
        return GoogleLoginRequest(url = AntigravityOAuth.buildAuthUrl(state), state = state)
    }

    fun cancelGoogleLogin(message: String?) {
        _state.update {
            it.copy(loggingIn = false, error = message)
        }
    }

    fun finishGoogleLogin(code: String) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val session = auth.exchangeCode(code)
                store.save(session)
                _state.update { it.copy(session = session, loggingIn = false, error = null) }
            } catch (error: Exception) {
                _state.update {
                    it.copy(
                        loggingIn = false,
                        error = error.message ?: "Ошибка обмена кода Google",
                    )
                }
            }
        }
    }

    fun addAttachments(uris: List<Uri>) {
        if (uris.isEmpty()) return
        viewModelScope.launch(Dispatchers.IO) {
            val app = getApplication<Application>()
            val inbox = File(app.filesDir, "inbox").also { it.mkdirs() }
            val imported = mutableListOf<PendingAttachment>()
            var lastError: String? = null
            uris.take(12).forEach { uri ->
                try {
                    imported += AttachmentIo.import(app, uri, inbox)
                } catch (error: Exception) {
                    lastError = error.message ?: "Не удалось прикрепить файл"
                }
            }
            val workspace = _state.value.workspace
            val withDevice = imported.map { item ->
                runCatching {
                    val fs = RootDeviceFs(app, File(workspace))
                    val rel = "inbox/${item.name}"
                    fs.writeBytes(rel, File(item.path).readBytes())
                    item.copy(devicePath = fs.resolve(rel))
                }.getOrDefault(item)
            }
            _state.update {
                it.copy(
                    pending = (it.pending + withDevice).distinctBy { item -> item.path }.take(12),
                    error = if (withDevice.isEmpty()) lastError else null,
                )
            }
        }
    }

    fun removeAttachment(id: String) {
        _state.update { it.copy(pending = it.pending.filterNot { item -> item.id == id }) }
    }

    fun send(text: String) {
        val trimmed = text.trim()
        val snapshot = _state.value
        val pending = snapshot.pending
        if (trimmed.isEmpty() && pending.isEmpty()) return
        if (snapshot.root != RootState.Granted) {
            _state.update { it.copy(error = "Нужен root") }
            return
        }
        val session = snapshot.session ?: run {
            _state.update { it.copy(error = "Сначала войдите через Google") }
            return
        }
        val display = trimmed.ifBlank { pending.joinToString(", ") { it.name } }
        _state.update {
            it.copy(
                busy = true,
                error = null,
                pending = emptyList(),
                messages = it.messages + ChatMessage("user", display, attachments = pending.map { item -> item.toChat() }),
            )
        }
        viewModelScope.launch(Dispatchers.IO) {
            persistCurrent()
            try {
                var live = auth.ensureFresh(session)
                store.save(live)
                _state.update { it.copy(session = live) }
                val fs = RootDeviceFs(getApplication(), File(snapshot.workspace))
                fs.workspace = snapshot.workspace
                val extraParts = AttachmentCodec.toGeminiParts(
                    pending.map { item ->
                        LoadedAttachment(
                            name = item.name,
                            mime = item.mime,
                            bytes = File(item.path).readBytes(),
                            savedPath = item.devicePath,
                        )
                    },
                )
                val loop = AgentLoop(llm, fs)
                val prompt = trimmed.ifBlank { "Смотри вложения. Ответь по картинкам и файлам." }
                val answer = loop.run(
                    session = live,
                    model = snapshot.model,
                    userText = prompt,
                    history = history,
                    extraParts = extraParts,
                    rooted = true,
                    listener = object : AgentListener {
                        override fun onThinking(text: String) {
                            if (text.isBlank()) return
                            _state.update { state ->
                                val last = state.messages.lastOrNull()
                                if (last?.role == "thinking") {
                                    state.copy(messages = state.messages.dropLast(1) + last.copy(text = last.text + "\n" + text))
                                } else {
                                    state.copy(
                                        messages = state.messages + ChatMessage(
                                            "thinking",
                                            text,
                                            startedAtMs = System.currentTimeMillis(),
                                        ),
                                    )
                                }
                            }
                        }

                        override fun onAssistantText(text: String) {
                            if (text.isBlank()) return
                            _state.update { state ->
                                state.copy(messages = stampThinking(state.messages) + ChatMessage("assistant", text))
                            }
                        }

                        override fun onToolStart(name: String, args: JsonObject) {
                            _state.update { state ->
                                state.copy(
                                    messages = state.messages + ChatMessage(
                                        role = "tool",
                                        text = "",
                                        tool = name,
                                        args = args.toString(),
                                        startedAtMs = System.currentTimeMillis(),
                                    ),
                                )
                            }
                        }

                        override fun onToolResult(name: String, result: String) {
                            _state.update { state ->
                                val messages = state.messages.toMutableList()
                                val index = messages.indexOfLast {
                                    it.role == "tool" && it.tool == name && it.text.isEmpty()
                                }
                                if (index >= 0) {
                                    val old = messages[index]
                                    val now = System.currentTimeMillis()
                                    messages[index] = old.copy(
                                        text = result.take(8_000),
                                        durationMs = old.startedAtMs?.let { now - it }?.coerceAtLeast(0),
                                    )
                                } else {
                                    messages += ChatMessage(
                                        role = "tool",
                                        text = result.take(8_000),
                                        tool = name,
                                    )
                                }
                                state.copy(messages = messages)
                            }
                        }
                    },
                )
                if (answer.isNotBlank() && _state.value.messages.none { it.role == "assistant" && it.text == answer }) {
                    _state.update {
                        it.copy(
                            messages = stampThinking(it.messages) + ChatMessage("assistant", answer),
                            busy = false,
                        )
                    }
                } else {
                    _state.update { it.copy(messages = stampThinking(it.messages), busy = false) }
                }
                persistCurrent()
            } catch (error: Exception) {
                val raw = error.message.orEmpty()
                val quota = raw.contains("429") || raw.contains("RESOURCE_EXHAUSTED")
                val missing = raw.contains("404") || raw.contains("NOT_FOUND")
                val message = when {
                    quota ->
                        "429 на модели ${snapshot.model}. Если на ПК лимит полный — переустановите APK: запросы должны идти на daily-cloudcode-pa, не на prod."
                    missing ->
                        "404 на ${snapshot.model}: Google не нашёл эту модель. Выберите другую из списка или переустановите APK."
                    else -> raw.ifBlank { "Сбой агента" }
                }
                _state.update { it.copy(busy = false, error = message, messages = stampThinking(it.messages)) }
                persistCurrent()
            }
        }
    }

    private fun persistCurrent() {
        val state = _state.value
        if (state.chatId.isBlank()) return
        val previous = chatStore.load(state.chatId)
        val userText = state.messages.firstOrNull { it.role == "user" }?.text.orEmpty()
        val title = if (previous != null && previous.title.isNotBlank() && previous.title != "Новый чат") {
            previous.title
        } else {
            ChatTitle.fromUserText(userText)
        }
        chatStore.save(
            StoredChat(
                id = state.chatId,
                title = title,
                preview = ChatTitle.preview(state.messages),
                createdAtMs = previous?.createdAtMs ?: System.currentTimeMillis(),
                updatedAtMs = System.currentTimeMillis(),
                messages = ChatStore.fromMessages(state.messages),
                history = ChatStore.fromHistory(history.toList()),
            ),
        )
        _state.update { it.copy(chats = chatStore.list()) }
    }

    private fun stampThinking(messages: List<ChatMessage>, now: Long = System.currentTimeMillis()): List<ChatMessage> =
        messages.map { message ->
            if (message.role == "thinking" && message.durationMs == null) {
                val started = message.startedAtMs ?: now
                message.copy(durationMs = (now - started).coerceAtLeast(0))
            } else {
                message
            }
        }

    companion object {
        fun factory(application: Application): ViewModelProvider.Factory =
            object : ViewModelProvider.Factory {
                @Suppress("UNCHECKED_CAST")
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    return AntigravityViewModel(application) as T
                }
            }
    }
}
