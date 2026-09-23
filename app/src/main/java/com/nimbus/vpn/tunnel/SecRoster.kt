package com.nimbus.vpn.tunnel

import com.nimbus.vpn.data.SecExit
import com.nimbus.vpn.data.SecTunnelApi
import java.io.DataInputStream
import java.io.DataOutputStream
import java.net.Socket
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicReference

/**
 * Several sec-tunnel exits for one session. A dead address is skipped for a
 * short while, and the next connection uses one that still answers.
 */
class SecRoster(
    initial: List<SecExit>,
    private val region: String,
) {
    private val lock = Any()
    private val exits = ArrayList(initial.distinctBy { it.ip })
    private val cooledUntil = HashMap<String, Long>()
    private var failures = 0
    private var refreshing = false

    fun peek(): SecExit = synchronized(lock) { pickLocked(System.currentTimeMillis()) }

    fun noteFailure(exit: SecExit) {
        cool(exit, count = true)
    }

    fun open(
        protect: (Socket) -> Boolean,
        host: String,
        port: Int,
        timeoutMs: Int = 6_000,
        idleTimeoutMs: Int = 0,
    ): UpstreamConn {
        val primary = peek()
        try {
            return SecProxy.open(protect, primary, host, port, timeoutMs, idleTimeoutMs).also { win(primary) }
        } catch (error: Throwable) {
            cool(primary, count = true)
            val rest = others(primary)
            return race(protect, rest, host, port, timeoutMs, idleTimeoutMs) ?: throw error
        }
    }

    fun queryDns(protect: (Socket) -> Boolean, query: ByteArray): ByteArray {
        var last: Throwable? = null
        for (resolver in listOf("1.1.1.1", "8.8.8.8")) {
            try {
                open(protect, resolver, 53, timeoutMs = 5_000, idleTimeoutMs = 5_000).use { conn ->
                    DataOutputStream(conn.output).use { output ->
                        output.writeShort(query.size)
                        output.write(query)
                        output.flush()
                        val input = DataInputStream(conn.input)
                        val length = input.readUnsignedShort()
                        if (length <= 0 || length > 4096) error("Плохой DNS")
                        val body = ByteArray(length)
                        input.readFully(body)
                        return body
                    }
                }
            } catch (error: Throwable) {
                last = error
            }
        }
        throw last ?: IllegalStateException("DNS через sec-tunnel не ответил")
    }

    private fun pickLocked(now: Long): SecExit {
        check(exits.isNotEmpty())
        return exits.firstOrNull { (cooledUntil[it.ip] ?: 0L) <= now } ?: exits.first()
    }

    private fun others(skip: SecExit): List<SecExit> = synchronized(lock) {
        val now = System.currentTimeMillis()
        val fresh = exits.filter { it.ip != skip.ip && (cooledUntil[it.ip] ?: 0L) <= now }
        fresh.ifEmpty { exits.filter { it.ip != skip.ip } }.take(3)
    }

    private fun win(exit: SecExit) = synchronized(lock) {
        failures = 0
        cooledUntil.remove(exit.ip)
        val index = exits.indexOfFirst { it.ip == exit.ip }
        if (index > 0) {
            val item = exits.removeAt(index)
            exits.add(0, item)
        }
    }

    private fun cool(exit: SecExit, count: Boolean) = synchronized(lock) {
        cooledUntil[exit.ip] = System.currentTimeMillis() + COOL_MS
        if (!count) return
        failures++
        if (failures >= 2) refresh()
    }

    private fun refresh() {
        if (refreshing || region.isBlank()) return
        refreshing = true
        Thread({
            val fresh = loadFresh()
            synchronized(lock) {
                if (fresh.isNotEmpty()) {
                    exits.clear()
                    exits.addAll(fresh.distinctBy { it.ip })
                    cooledUntil.clear()
                    failures = 0
                }
                refreshing = false
            }
        }, "sec-refresh").apply { isDaemon = true }.start()
    }

    private fun loadFresh(): List<SecExit> {
        val store = SecTunnelRuntime.accounts
        val saved = store?.load()
        if (saved != null) {
            val reused = runCatching { SecTunnelApi.reuse(region, saved) }
            if (reused.isSuccess && reused.getOrThrow().isNotEmpty()) return reused.getOrThrow()
            val message = reused.exceptionOrNull()?.message.orEmpty()
            if (message.startsWith("Для ") || message.startsWith("Сейчас нет")) return emptyList()
            store.clear()
        }
        val lease = runCatching { SecTunnelApi.registerLease(region) }.getOrNull() ?: return emptyList()
        store?.save(lease.account)
        SecTunnelRuntime.account = lease.account
        return lease.exits
    }

    private fun race(
        protect: (Socket) -> Boolean,
        candidates: List<SecExit>,
        host: String,
        port: Int,
        timeoutMs: Int,
        idleTimeoutMs: Int,
    ): UpstreamConn? {
        if (candidates.isEmpty()) return null
        val pool = Executors.newFixedThreadPool(candidates.size)
        val winner = AtomicReference<UpstreamConn?>()
        val done = CountDownLatch(candidates.size)
        try {
            candidates.forEach { exit ->
                pool.submit {
                    try {
                        val conn = SecProxy.open(
                            protect,
                            exit,
                            host,
                            port,
                            timeoutMs = minOf(timeoutMs, 5_000),
                            idleTimeoutMs = idleTimeoutMs,
                        )
                        if (!winner.compareAndSet(null, conn)) {
                            conn.close()
                        } else {
                            win(exit)
                        }
                    } catch (_: Throwable) {
                        cool(exit, count = false)
                    } finally {
                        done.countDown()
                    }
                }
            }
            done.await(7, TimeUnit.SECONDS)
            return winner.get()
        } finally {
            pool.shutdownNow()
        }
    }

    companion object {
        private const val COOL_MS = 20_000L
    }
}
