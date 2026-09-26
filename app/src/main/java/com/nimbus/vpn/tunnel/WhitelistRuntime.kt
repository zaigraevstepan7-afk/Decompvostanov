package com.nimbus.vpn.tunnel

import kotlinx.coroutines.CompletableDeferred

/** Handshake between the home screen and the white-list VPN service. */
object WhitelistRuntime {
    @Volatile
    var active: Boolean = false
        private set

    private val lock = Any()
    private var ticket = 0
    private var pendingId = 0
    private var pending: CompletableDeferred<String>? = null
    private var stopped: CompletableDeferred<Unit>? = null

    fun arm(): Pair<Int, CompletableDeferred<String>> {
        val next = CompletableDeferred<String>()
        val id = synchronized(lock) {
            ticket += 1
            pendingId = ticket
            pending = next
            ticket
        }
        return id to next
    }

    fun succeed(id: Int) {
        synchronized(lock) {
            if (pendingId != id) return
            active = true
            pending?.complete("")
            pending = null
        }
    }

    fun fail(id: Int, message: String) {
        synchronized(lock) {
            if (pendingId != id) return
            active = false
            pending?.complete(message.ifBlank { "Не удалось подключиться" })
            pending = null
        }
    }

    fun markDown() {
        active = false
        val done = synchronized(lock) {
            val current = stopped
            stopped = null
            current
        }
        done?.complete(Unit)
    }

    fun expectDown(): CompletableDeferred<Unit> {
        val next = CompletableDeferred<Unit>()
        synchronized(lock) { stopped = next }
        return next
    }
}
