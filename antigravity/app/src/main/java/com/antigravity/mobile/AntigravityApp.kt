package com.antigravity.mobile

import android.app.Application
import com.topjohnwu.superuser.Shell

class AntigravityApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Shell.setDefaultBuilder(
            Shell.Builder.create()
                .setFlags(Shell.FLAG_MOUNT_MASTER)
                .setTimeout(20),
        )
    }
}
