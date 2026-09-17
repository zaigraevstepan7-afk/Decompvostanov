package com.antigravity.mobile.root

import com.topjohnwu.superuser.Shell

enum class RootState { Checking, Granted, Denied }

object RootAccess {
    fun probe(): RootState {
        return try {
            val shell = Shell.getShell()
            if (shell.isRoot) RootState.Granted else RootState.Denied
        } catch (_: Exception) {
            RootState.Denied
        }
    }
}
