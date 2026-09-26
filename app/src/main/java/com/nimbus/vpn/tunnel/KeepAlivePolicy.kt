package com.nimbus.vpn.tunnel

/**
 * Decides whether the keep-alive foreground service stays up.
 * A restart with no extras must restore the last server name. It must never
 * publish the old "Ready" notification or drop the service while the user
 * still wants the tunnel.
 */
object KeepAlivePolicy {
    const val FORBIDDEN_TITLE = "Ready"
    const val IDLE_TITLE = "Bozya VPN"

    data class Command(
        val stopRequested: Boolean,
        val title: String?,
        val savedTitle: String?,
        val sessionWanted: Boolean,
        val restarted: Boolean,
    )

    data class Plan(
        val showForeground: Boolean,
        val title: String,
        val sticky: Boolean,
        val stop: Boolean,
        val restoreTunnel: Boolean,
    )

    fun plan(command: Command): Plan {
        if (command.stopRequested) {
            return Plan(
                showForeground = false,
                title = "",
                sticky = false,
                stop = true,
                restoreTunnel = false,
            )
        }
        val incoming = usable(command.title)
        if (incoming != null) {
            return Plan(
                showForeground = true,
                title = incoming,
                sticky = true,
                stop = false,
                restoreTunnel = false,
            )
        }
        val saved = usable(command.savedTitle)
        if (command.sessionWanted && saved != null) {
            return Plan(
                showForeground = true,
                title = saved,
                sticky = true,
                stop = false,
                restoreTunnel = true,
            )
        }
        return Plan(
            showForeground = command.restarted,
            title = if (command.restarted) IDLE_TITLE else "",
            sticky = false,
            stop = true,
            restoreTunnel = false,
        )
    }

    fun usable(title: String?): String? {
        val trimmed = title?.trim().orEmpty()
        if (trimmed.isEmpty()) return null
        if (trimmed.equals(FORBIDDEN_TITLE, ignoreCase = true)) return null
        return trimmed
    }
}

/** Whether a failed or dropped tunnel should keep the process in the foreground. */
object SessionPolicy {
    fun keepForeground(userStopped: Boolean, userInitiated: Boolean, autoConnect: Boolean): Boolean {
        if (userStopped) return false
        if (!userInitiated) return true
        return autoConnect
    }
}
