package com.nimbus.vpn.tunnel

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.nimbus.vpn.BozyaApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        val action = intent?.action ?: return
        if (action != Intent.ACTION_BOOT_COMPLETED &&
            action != Intent.ACTION_LOCKED_BOOT_COMPLETED &&
            action != Intent.ACTION_MY_PACKAGE_REPLACED
        ) return
        val pending = goAsync()
        CoroutineScope(Dispatchers.Default).launch {
            try {
                val app = context.applicationContext as BozyaApp
                val auto = app.container.settings.settings.first().autoConnect
                if (auto) {
                    app.container.tunnel.connectActive()
                }
            } finally {
                pending.finish()
            }
        }
    }
}
