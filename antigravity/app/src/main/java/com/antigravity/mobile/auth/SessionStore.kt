package com.antigravity.mobile.auth

import android.content.Context
import com.antigravity.core.auth.AntigravitySession
import com.antigravity.core.auth.decodeSession
import com.antigravity.core.auth.encodeSession
import java.io.File

class SessionStore(context: Context) {
    private val file = File(context.filesDir, "antigravity-session.json")
    private val modelFile = File(context.filesDir, "selected-model.txt")
    private val workspaceFile = File(context.filesDir, "workspace.txt")
    private val modeFile = File(context.filesDir, "agent-mode.txt")
    private val brainFile = File(context.filesDir, "brain-model.txt")
    private val searchFile = File(context.filesDir, "web-search.txt")
    private val agentFile = File(context.filesDir, "agent-enabled.txt")

    fun load(): AntigravitySession? {
        if (!file.exists()) return null
        return runCatching { decodeSession(file.readText()) }.getOrNull()
    }

    fun save(session: AntigravitySession) {
        file.writeText(encodeSession(session))
    }

    fun loadModel(): String? =
        runCatching { modelFile.readText().trim().takeIf { it.isNotBlank() } }.getOrNull()

    fun saveModel(id: String) {
        modelFile.writeText(id.trim())
    }

    fun loadWorkspace(): String? =
        runCatching { workspaceFile.readText().trim().takeIf { it.isNotBlank() } }.getOrNull()

    fun saveWorkspace(path: String) {
        workspaceFile.writeText(path.trim())
    }

    fun loadMode(): String? =
        runCatching { modeFile.readText().trim().takeIf { it == "plan" || it == "auto" } }.getOrNull()

    fun saveMode(mode: String) {
        modeFile.writeText(if (mode == "plan") "plan" else "auto")
    }

    fun loadBrain(): Boolean =
        runCatching { brainFile.readText().trim() == "1" }.getOrDefault(false)

    fun saveBrain(enabled: Boolean) {
        brainFile.writeText(if (enabled) "1" else "0")
    }

    fun loadSearch(): Boolean =
        runCatching { searchFile.readText().trim() == "1" }.getOrDefault(false)

    fun saveSearch(enabled: Boolean) {
        searchFile.writeText(if (enabled) "1" else "0")
    }

    fun loadAgent(): Boolean =
        runCatching { agentFile.readText().trim() != "0" }.getOrDefault(true)

    fun saveAgent(enabled: Boolean) {
        agentFile.writeText(if (enabled) "1" else "0")
    }

    fun clear() {
        file.delete()
    }
}
