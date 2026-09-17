package com.antigravity.mobile

import android.app.Application
import com.topjohnwu.superuser.Shell
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

class AntigravityApp : Application() {
    val agentScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    @Volatile var agent: AntigravityViewModel? = null

    override fun onCreate() {
        super.onCreate()
        Shell.setDefaultBuilder(
            Shell.Builder.create()
                .setFlags(Shell.FLAG_MOUNT_MASTER)
                .setTimeout(20),
        )
    }
}
