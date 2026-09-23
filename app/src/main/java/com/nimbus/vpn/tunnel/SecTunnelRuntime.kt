package com.nimbus.vpn.tunnel

import android.content.Context
import android.content.Intent
import com.nimbus.vpn.data.SecAccount
import com.nimbus.vpn.data.SecAccountStore
import com.nimbus.vpn.data.SecExit
import java.util.concurrent.CancellationException
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicLong
import kotlinx.coroutines.CompletableDeferred

/**
 * Bridge between [TunnelController] and [SecTunnelService]. One process, one tunnel.
 */
object SecTunnelRuntime {
    val rx = AtomicLong()
    val tx = AtomicLong()

    @Volatile var active: Boolean = false
    @Volatile var abort: Boolean = false
    @Volatile var onUnexpectedDown: (() -> Unit)? = null
    @Volatile var accounts: SecAccountStore? = null
    @Volatile var account: SecAccount? = null

    private val generation = AtomicInteger()
    private val lock = Any()
    private var pending: CompletableDeferred<Result<Unit>>? = null
    private var staged: Pair<Int, List<SecExit>>? = null

    fun arm(): Int {
        val token = generation.incrementAndGet()
        abort = false
        rx.set(0)
        tx.set(0)
        synchronized(lock) {
            staged = null
            pending?.let { current ->
                if (!current.isCompleted) {
                    current.complete(Result.failure(CancellationException("Остановлено")))
                }
            }
            pending = CompletableDeferred()
        }
        return token
    }

    fun stage(token: Int, exits: List<SecExit>) {
        synchronized(lock) {
            if (generation.get() == token) staged = token to exits
        }
    }

    fun takeExits(token: Int): List<SecExit>? = synchronized(lock) {
        staged?.takeIf { it.first == token }?.second
    }

    fun isCurrent(token: Int): Boolean = generation.get() == token && !abort

    fun awaitHandle(): CompletableDeferred<Result<Unit>>? = synchronized(lock) { pending }

    fun succeed(token: Int) {
        if (!isCurrent(token)) return
        active = true
        synchronized(lock) {
            pending?.let { current ->
                if (!current.isCompleted) current.complete(Result.success(Unit))
            }
        }
    }

    fun fail(token: Int, error: Throwable) {
        if (!isCurrent(token)) return
        active = false
        synchronized(lock) {
            pending?.let { current ->
                if (!current.isCompleted) current.complete(Result.failure(error))
            }
        }
    }

    fun requestStop(context: Context) {
        abort = true
        generation.incrementAndGet()
        active = false
        synchronized(lock) {
            staged = null
            pending?.let { current ->
                if (!current.isCompleted) {
                    current.complete(Result.failure(CancellationException("Остановлено")))
                }
            }
        }
        runCatching {
            context.startService(
                Intent(context, SecTunnelService::class.java).setAction(SecTunnelService.ACTION_STOP),
            )
        }
    }

    fun markStopped() {
        active = false
    }

    fun notifyDown() {
        onUnexpectedDown?.invoke()
    }

    fun addRx(bytes: Int) {
        if (bytes > 0) rx.addAndGet(bytes.toLong())
    }

    fun addTx(bytes: Int) {
        if (bytes > 0) tx.addAndGet(bytes.toLong())
    }
}
