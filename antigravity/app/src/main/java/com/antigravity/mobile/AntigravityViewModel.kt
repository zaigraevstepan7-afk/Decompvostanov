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
import com.deepseek.chat.ui.model.DeepSeekModel
import com.antigravity.mobile.chat.ChatStore
import com.antigravity.mobile.chat.ChatThread
import com.antigravity.mobile.chat.ChatTitle
import com.antigravity.mobile.chat.StoredChat
import com.antigravity.mobile.fs.AttachmentIo
import com.antigravity.mobile.fs.RootDeviceFs
import com.antigravity.mobile.root.RootAccess
import com.antigravity.mobile.root.RootState
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.serialization.json.JsonObject
import java.io.File
import java.util.concurrent.atomic.AtomicBoolean

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
    val mode: String = "auto",
    val brain: Boolean = false,
    val search: Boolean = false,
    val agent: Boolean = true,
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
    private val initialBrain = store.loadBrain()
    private val initialAgent = store.loadAgent()

    private val _state = MutableStateFlow(
        UiState(
            session = store.load(),
            model = if (initialBrain) DeepSeekModel.DEEPSEEK_R1.wireId else DeepSeekModel.DEEPSEEK_V3.wireId,
            workspace = store.loadWorkspace() ?: defaultWorkspace(),
            chatId = initialChat.id,
            chats = chatStore.list(),
            messages = ChatStore.toMessages(initialChat),
            mode = store.loadMode() ?: "auto",
            brain = initialBrain,
            search = store.loadSearch(),
            agent = initialAgent,
        ),
    )
    val state: StateFlow<UiState> = _state
    private val cancelled = AtomicBoolean(false)
    private var agentJob: Job? = null

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

    fun setMode(mode: String) {
        val id = if (mode == "plan") "plan" else "auto"
        store.saveMode(id)
        _state.update { it.copy(mode = id) }
    }

    fun setBrain(enabled: Boolean) {
        if (_state.value.busy) return
        val model = if (enabled) DeepSeekModel.DEEPSEEK_R1.wireId else DeepSeekModel.DEEPSEEK_V3.wireId
        store.saveBrain(enabled)
        store.saveModel(model)
        _state.update { it.copy(brain = enabled, model = model) }
    }

    fun setSearch(enabled: Boolean) {
        if (_state.value.busy) return
        store.saveSearch(enabled)
        _state.update { it.copy(search = enabled) }
    }

    fun setAgent(enabled: Boolean) {
        if (_state.value.busy) return
        store.saveAgent(enabled)
        _state.update { it.copy(agent = enabled) }
    }

    fun stop() {
        cancelled.set(true)
        agentJob?.cancel()
        _state.update { it.copy(busy = false, error = null, messages = stampThinking(it.messages)) }
        persistCurrent()
        AgentService.stop(getApplication())
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
        val extraParts = AttachmentCodec.toGeminiParts(
            pending.map { item ->
                LoadedAttachment(
                    name = item.name,
                    mime = item.mime,
                    bytes = runCatching { File(item.path).readBytes() }.getOrDefault(ByteArray(0)),
                    savedPath = item.devicePath,
                )
            },
        )
        startAgent(
            session = session,
            model = snapshot.model,
            workspace = snapshot.workspace,
            chatId = snapshot.chatId,
            userText = trimmed.ifBlank { "Смотри вложения. Ответь по картинкам и файлам." },
            extraParts = extraParts,
            planOnly = false,
            agent = snapshot.agent,
            webSearch = snapshot.search,
            modelOverride = if (snapshot.brain) DeepSeekModel.DEEPSEEK_R1.wireId else DeepSeekModel.DEEPSEEK_V3.wireId,
        )
    }

    fun regenerate() {
        if (_state.value.busy) return
        val text = _state.value.messages.lastOrNull { it.role == "user" }?.text?.trim().orEmpty()
        if (text.isEmpty()) return
        send(text)
    }

    fun confirmPlan() {
        val snapshot = _state.value
        if (snapshot.busy) return
        val plan = snapshot.messages.lastOrNull { it.role == "plan" }?.text?.trim().orEmpty()
        if (plan.isBlank()) return
        val session = snapshot.session ?: return
        _state.update { it.copy(busy = true, error = null) }
        startAgent(
            session = session,
            model = snapshot.model,
            workspace = snapshot.workspace,
            chatId = snapshot.chatId,
            userText = "План подтверждён. Реализуй его по шагам, не переспрашивай:\n\n$plan",
            extraParts = emptyList(),
            planOnly = false,
            agent = true,
            webSearch = snapshot.search,
            modelOverride = snapshot.model,
        )
    }

    private fun startAgent(
        session: AntigravitySession,
        model: String,
        workspace: String,
        chatId: String,
        userText: String,
        extraParts: List<kotlinx.serialization.json.JsonObject>,
        planOnly: Boolean,
        agent: Boolean = true,
        webSearch: Boolean = false,
        modelOverride: String? = null,
    ) {
        cancelled.set(false)
        agentJob?.cancel()
        val app = getApplication<AntigravityApp>()
        agentJob = app.agentScope.launch {
            persistCurrent()
            AgentService.start(app)
            val still = { !cancelled.get() && _state.value.chatId == chatId }
            try {
                var live = auth.ensureFresh(session)
                store.save(live)
                if (still()) _state.update { it.copy(session = live) }
                val fs = RootDeviceFs(getApplication(), File(workspace))
                fs.workspace = workspace
                val loop = AgentLoop(llm, fs)
                val answer = loop.run(
                    session = live,
                    model = modelOverride ?: model,
                    userText = userText,
                    history = history,
                    extraParts = extraParts,
                    rooted = true,
                    planOnly = planOnly,
                    agent = agent,
                    webSearch = webSearch,
                    shouldCancel = { cancelled.get() },
                    listener = object : AgentListener {
                        override fun onThinking(text: String) {
                            if (text.isBlank() || !still()) return
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
                            if (text.isBlank() || !still()) return
                            _state.update { state ->
                                state.copy(messages = stampThinking(state.messages) + ChatMessage("assistant", text))
                            }
                            persistCurrent()
                        }

                        override fun onToolStart(name: String, args: JsonObject) {
                            if (!still()) return
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
                            if (!still()) return
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
                            persistCurrent()
                        }
                    },
                )
                if (cancelled.get() || _state.value.chatId != chatId) {
                    if (_state.value.chatId == chatId) {
                        _state.update { it.copy(busy = false, messages = stampThinking(it.messages)) }
                    }
                    persistCurrent()
                    return@launch
                }
                if (planOnly) {
                    _state.update {
                        it.copy(
                            messages = stampThinking(it.messages) + ChatMessage("plan", answer.ifBlank { "План пустой" }),
                            busy = false,
                        )
                    }
                } else if (answer.isNotBlank() && _state.value.messages.none { it.role == "assistant" && it.text == answer }) {
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
            } catch (error: CancellationException) {
                _state.update { it.copy(busy = false, messages = stampThinking(it.messages)) }
                persistCurrent()
            } catch (error: Exception) {
                if (cancelled.get()) {
                    _state.update { it.copy(busy = false, messages = stampThinking(it.messages)) }
                    persistCurrent()
                    return@launch
                }
                val raw = error.message.orEmpty()
                val quota = raw.contains("429") || raw.contains("RESOURCE_EXHAUSTED")
                val missing = raw.contains("404") || raw.contains("NOT_FOUND")
                val message = when {
                    quota ->
                        "429 на модели $model. Если на ПК лимит полный — переустановите APK: запросы должны идти на daily-cloudcode-pa, не на prod."
                    missing ->
                        "404 на $model: Google не нашёл эту модель. Выберите другую из списка или переустановите APK."
                    else -> raw.ifBlank { "Сбой агента" }
                }
                _state.update { it.copy(busy = false, error = message, messages = stampThinking(it.messages)) }
                persistCurrent()
            } finally {
                AgentService.stop(app)
            }
        }
    }

    @Synchronized
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
                    val app = application as AntigravityApp
                    val existing = app.agent
                    if (existing != null) return existing as T
                    return AntigravityViewModel(app).also { app.agent = it } as T
                }
            }
    }
}
