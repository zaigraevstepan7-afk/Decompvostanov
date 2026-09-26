package com.nimbus.vpn.tunnel

import kotlinx.coroutines.CompletableDeferred

object DnsRuntime {
    @Volatile
    var active: Boolean = false
        private set

    private val lock = Any()
    private var ticket = 0
    private var pendingId = 0
    private var pending: CompletableDeferred<String>? = null

    fun arm(): Pair<Int, CompletableDeferred<String>> {
        val next = CompletableDeferred<String>()
        val id = synchronized(lock) {
            ticket += 1
            pendingId = ticket
            pending = next
            active = false
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
            pending?.complete(message.ifBlank { "Не удалось включить DNS" })
            pending = null
        }
    }

    fun markDown() {
        active = false
    }
}
