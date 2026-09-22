package com.deepseek.chat.ui.model

import java.util.UUID

/**
 * Модели данных главного экрана чата DeepSeek.
 */
enum class DeepSeekModel(val displayName: String, val description: String, val wireId: String) {
    DEEPSEEK_V3("Gemini 3.1 Pro", "Кнопка мозга выключена", "gemini-pro-agent"),
    DEEPSEEK_R1("Gemini 3.7 Flash", "Кнопка мозга включена", "gemini-3.7-flash-high"),
}

enum class MessageSender {
    USER,
    ASSISTANT
}

data class ThinkingProcess(
    val reasoningText: String,
    val durationSeconds: Int = 0,
    val isExpanded: Boolean = true,
    val isFinished: Boolean = true
)

data class ChatMessage(
    val id: String = UUID.randomUUID().toString(),
    val sender: MessageSender,
    val content: String,
    val timestamp: Long = System.currentTimeMillis(),
    val thinkingProcess: ThinkingProcess? = null,
    val isStreaming: Boolean = false,
    val isSearchEnabled: Boolean = false,
    val imagePaths: List<String> = emptyList(),
    val fileNames: List<String> = emptyList(),
)

data class ChatUiState(
    val currentModel: DeepSeekModel = DeepSeekModel.DEEPSEEK_V3,
    val isDeepThinkActive: Boolean = false,
    val isWebSearchActive: Boolean = false,
    val inputText: String = "",
    val isGenerating: Boolean = false,
    val messages: List<ChatMessage> = emptyList()
)
