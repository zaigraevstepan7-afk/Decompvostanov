package com.antigravity.mobile

import android.app.Application
import android.os.Environment
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.antigravity.core.agent.AgentListener
import com.antigravity.core.agent.AgentLoop
import com.antigravity.core.agent.ChatMessage
import com.antigravity.core.api.CloudCodeClient
import com.antigravity.core.api.ContentTurn
import com.antigravity.core.api.GeminiModels
import com.antigravity.core.auth.AntigravityAuthClient
import com.antigravity.core.auth.AntigravityOAuth
import com.antigravity.core.auth.AntigravitySession
import com.antigravity.mobile.auth.SessionStore
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
)

data class GoogleLoginRequest(val url: String, val state: String)

fun defaultWorkspace(): String {
    val ext = Environment.getExternalStorageDirectory()
    return File(ext, "Antigravity").absolutePath
}

class AntigravityViewModel(application: Application) : AndroidViewModel(application) {
    private val store = SessionStore(application)
    private val auth = AntigravityAuthClient()
    private val llm = CloudCodeClient()
    private val history = mutableListOf<ContentTurn>()

    private val _state = MutableStateFlow(
        UiState(
            session = store.load(),
            model = store.loadModel() ?: GeminiModels.DEFAULT,
        ),
    )
    val state: StateFlow<UiState> = _state

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

    fun setWorkspace(path: String) = _state.update { it.copy(workspace = path) }

    fun logout() {
        store.clear()
        history.clear()
        _state.update { it.copy(session = null, messages = emptyList(), error = null) }
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

    fun send(text: String) {
        val trimmed = text.trim()
        if (trimmed.isEmpty()) return
        val snapshot = _state.value
        if (snapshot.root != RootState.Granted) {
            _state.update { it.copy(error = "Нужен root") }
            return
        }
        val session = snapshot.session ?: run {
            _state.update { it.copy(error = "Сначала войдите через Google") }
            return
        }
        _state.update {
            it.copy(
                busy = true,
                error = null,
                messages = it.messages + ChatMessage("user", trimmed),
            )
        }
        viewModelScope.launch(Dispatchers.IO) {
            try {
                var live = auth.ensureFresh(session)
                store.save(live)
                _state.update { it.copy(session = live) }
                val fs = RootDeviceFs(getApplication(), File(snapshot.workspace))
                fs.workspace = snapshot.workspace
                val loop = AgentLoop(llm, fs)
                val answer = loop.run(
                    session = live,
                    model = snapshot.model,
                    userText = trimmed,
                    history = history,
                    rooted = true,
                    listener = object : AgentListener {
                        override fun onAssistantText(text: String) {
                            if (text.isBlank()) return
                            _state.update { state ->
                                state.copy(messages = state.messages + ChatMessage("assistant", text))
                            }
                        }

                        override fun onToolStart(name: String, args: JsonObject) {
                            _state.update { state ->
                                state.copy(
                                    messages = state.messages + ChatMessage(
                                        "tool",
                                        args.toString(),
                                        tool = name,
                                    ),
                                )
                            }
                        }

                        override fun onToolResult(name: String, result: String) {
                            _state.update { state ->
                                state.copy(
                                    messages = state.messages + ChatMessage(
                                        "tool-result",
                                        result.take(4000),
                                        tool = name,
                                    ),
                                )
                            }
                        }
                    },
                )
                if (answer.isNotBlank() && _state.value.messages.none { it.role == "assistant" && it.text == answer }) {
                    _state.update { it.copy(messages = it.messages + ChatMessage("assistant", answer), busy = false) }
                } else {
                    _state.update { it.copy(busy = false) }
                }
            } catch (error: Exception) {
                val raw = error.message.orEmpty()
                val quota = raw.contains("429") || raw.contains("RESOURCE_EXHAUSTED")
                val message = if (quota) {
                    "Квота модели ${snapshot.model} исчерпана (429). Сверху выберите новую: Gemini 3.8 / 3.7 / 3.6 Flash или 3.1 Pro."
                } else {
                    raw.ifBlank { "Сбой агента" }
                }
                _state.update { it.copy(busy = false, error = message) }
            }
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
