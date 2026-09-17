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

    fun clear() {
        file.delete()
    }
}
