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

    fun clear() {
        file.delete()
    }
}
