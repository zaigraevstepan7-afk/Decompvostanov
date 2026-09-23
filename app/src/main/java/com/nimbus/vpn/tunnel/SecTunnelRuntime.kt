package com.nimbus.vpn.tunnel

import android.content.Context
import android.content.Intent
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

    private val generation = AtomicInteger()
    private val lock = Any()
    private var pending: CompletableDeferred<Result<Unit>>? = null

    fun arm(): Int {
        val token = generation.incrementAndGet()
        abort = false
        rx.set(0)
        tx.set(0)
        synchronized(lock) {
            pending?.let { current ->
                if (!current.isCompleted) {
                    current.complete(Result.failure(CancellationException("Остановлено")))
                }
            }
            pending = CompletableDeferred()
        }
        return token
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
