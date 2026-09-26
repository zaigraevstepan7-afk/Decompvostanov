package com.nimbus.vpn.tunnel

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.UserManager
import android.util.Log
import com.nimbus.vpn.BozyaApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

class BootReceiver : BroadcastReceiver() {
    private companion object {
        const val TAG = "Bozya/Boot"
    }

    override fun onReceive(context: Context, intent: Intent?) {
        val action = intent?.action ?: return
        if (action != Intent.ACTION_BOOT_COMPLETED &&
            action != Intent.ACTION_LOCKED_BOOT_COMPLETED &&
            action != Intent.ACTION_MY_PACKAGE_REPLACED
        ) return
        val pending = goAsync()
        CoroutineScope(Dispatchers.Default).launch {
            try {
                val user = context.getSystemService(UserManager::class.java)
                if (user != null && !user.isUserUnlocked) return@launch
                val app = context.applicationContext as? BozyaApp ?: return@launch
                val auto = app.container.settings.settings.first().autoConnect
                val wanted = TunnelSession(app).read().wanted
                if (wanted) {
                    app.container.tunnel.restorePersistedSession()
                } else if (auto) {
                    app.container.tunnel.connectActive()
                }
            } catch (t: Throwable) {
                Log.w(TAG, "Boot connect skipped", t)
            } finally {
                pending.finish()
            }
        }
    }
}
