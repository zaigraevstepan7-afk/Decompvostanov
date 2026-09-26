package com.nimbus.vpn.tunnel

import android.content.Context

/**
 * Remembers that the user left the tunnel on, plus the server name to show
 * if Android restarts the process. No keys and no configs are stored here.
 */
class TunnelSession(context: Context) {
    private val prefs = context.applicationContext.getSharedPreferences(PREFS, Context.MODE_PRIVATE)

    fun read(): Snapshot {
        val wanted = prefs.getBoolean(WANTED, false)
        val profileId = prefs.getString(PROFILE_ID, "").orEmpty()
        val title = KeepAlivePolicy.usable(prefs.getString(TITLE, null)).orEmpty()
        val batteryAsked = prefs.getBoolean(BATTERY_ASKED, false)
        return Snapshot(
            wanted = wanted && profileId.isNotBlank(),
            profileId = profileId,
            title = title,
            batteryAsked = batteryAsked,
        )
    }

    fun mark(profileId: String, title: String) {
        val safeTitle = KeepAlivePolicy.usable(title) ?: KeepAlivePolicy.IDLE_TITLE
        prefs.edit()
            .putBoolean(WANTED, true)
            .putString(PROFILE_ID, profileId)
            .putString(TITLE, safeTitle)
            .commit()
    }

    fun clear() {
        prefs.edit()
            .putBoolean(WANTED, false)
            .remove(PROFILE_ID)
            .remove(TITLE)
            .commit()
    }

    fun markBatteryAsked() {
        prefs.edit().putBoolean(BATTERY_ASKED, true).commit()
    }

    data class Snapshot(
        val wanted: Boolean,
        val profileId: String,
        val title: String,
        val batteryAsked: Boolean,
    )

    private companion object {
        const val PREFS = "bozya_session"
        const val WANTED = "wanted"
        const val PROFILE_ID = "profile_id"
        const val TITLE = "title"
        const val BATTERY_ASKED = "battery_asked"
    }
}
