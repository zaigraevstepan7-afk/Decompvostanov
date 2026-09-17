package com.antigravity.core.agent

import com.antigravity.core.api.ContentTurn
import com.antigravity.core.api.LlmClient
import com.antigravity.core.api.functionResponseTurn
import com.antigravity.core.api.modelPartsTurn
import com.antigravity.core.api.textTurn
import com.antigravity.core.api.userTurn
import com.antigravity.core.auth.AntigravitySession
import kotlinx.serialization.json.JsonObject

data class ChatAttachment(
    val name: String,
    val mime: String,
    val path: String? = null,
    val isImage: Boolean = false,
)

data class ChatMessage(
    val role: String,
    val text: String,
    val tool: String? = null,
    val startedAtMs: Long? = null,
    val durationMs: Long? = null,
    val attachments: List<ChatAttachment> = emptyList(),
)

interface AgentListener {
    fun onThinking(text: String) {}
    fun onAssistantText(text: String) {}
    fun onToolStart(name: String, args: JsonObject) {}
    fun onToolResult(name: String, result: String) {}
}

class AgentLoop(
    private val llm: LlmClient,
    private val fs: DeviceFs,
    private val tools: ToolExecutor = ToolExecutor(fs),
    private val maxTurns: Int = 40,
) {
    fun run(
        session: AntigravitySession,
        model: String,
        userText: String,
        history: MutableList<ContentTurn>,
        listener: AgentListener = object : AgentListener {},
        rooted: Boolean = true,
        extraParts: List<JsonObject> = emptyList(),
    ): String {
        history.add(userTurn(userText, extraParts))
        val system = SystemPrompt.build(fs.workspace, session.email, rooted)
        val collected = StringBuilder()
        repeat(maxTurns) {
            val reply = llm.generate(session, model, system, history.toList(), ToolCatalog.declarations)
            if (reply.thoughts.isNotBlank()) {
                listener.onThinking(reply.thoughts)
            }
            if (reply.functionCalls.isEmpty()) {
                if (reply.text.isNotBlank()) {
                    listener.onAssistantText(reply.text)
                    collected.append(reply.text)
                }
                if (reply.parts.isNotEmpty()) {
                    history.add(modelPartsTurn(reply.parts))
                } else if (reply.text.isNotBlank()) {
                    history.add(textTurn("model", reply.text))
                }
                return collected.toString().ifBlank { reply.text }
            }
            history.add(modelPartsTurn(reply.parts))
            if (reply.text.isNotBlank()) {
                listener.onAssistantText(reply.text)
                collected.append(reply.text).append('\n')
            }
            reply.functionCalls.forEach { call ->
                listener.onToolStart(call.name, call.args)
                val result = tools.execute(call.name, call.args)
                listener.onToolResult(call.name, result)
                history.add(functionResponseTurn(call.name, call.id, result))
            }
        }
        return collected.toString().ifBlank { "Достигнут лимит шагов агента" }
    }
}
