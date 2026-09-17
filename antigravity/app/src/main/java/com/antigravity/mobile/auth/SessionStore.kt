package com.antigravity.mobile.auth

import android.content.Context
import com.antigravity.core.auth.AntigravitySession
import com.antigravity.core.auth.decodeSession
import com.antigravity.core.auth.encodeSession
import java.io.File

class SessionStore(context: Context) {
    private val file = File(context.filesDir, "antigravity-session.json")

    fun load(): AntigravitySession? {
        if (!file.exists()) return null
        return runCatching { decodeSession(file.readText()) }.getOrNull()
    }

    fun save(session: AntigravitySession) {
        file.writeText(encodeSession(session))
    }

    fun clear() {
        file.delete()
    }
}
