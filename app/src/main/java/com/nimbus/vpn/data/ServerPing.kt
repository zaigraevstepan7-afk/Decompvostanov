package com.nimbus.vpn.data

import java.net.ConnectException
import java.net.InetSocketAddress
import java.net.Socket
import java.util.concurrent.TimeUnit

/**
 * Latency to a relay. ICMP first, then a short TCP connect: "connection refused"
 * still means the host answered, so it counts as a round trip.
 */
object ServerPing {
    fun hostOf(endpoint: String?): String? {
        val raw = endpoint?.trim()?.substringBefore(' ')?.trim().orEmpty()
        if (raw.isEmpty()) return null
        if (raw.startsWith("[")) {
            return raw.substringAfter("[").substringBefore("]").ifBlank { null }
        }
        val colon = raw.lastIndexOf(':')
        if (colon > 0 && raw.substring(colon + 1).all { it.isDigit() }) {
            return raw.substring(0, colon).ifBlank { null }
        }
        return raw
    }

    fun parseRttMs(output: String): Int? {
        val match = RTT.find(output) ?: return null
        val number = match.groupValues[1].replace(',', '.')
        return number.toDoubleOrNull()?.toInt()
    }

    fun ping(host: String, timeoutMs: Int = 2_000): Int? {
        if (host.isBlank()) return null
        return runCatching { icmp(host, timeoutMs) }.getOrNull()
            ?: runCatching { tcpRtt(host, 443, timeoutMs) }.getOrNull()
            ?: runCatching { tcpRtt(host, 80, timeoutMs) }.getOrNull()
    }

    /** Probe the port from the subscription first. A refused connect still counts. */
    fun pingEndpoint(host: String, port: Int, timeoutMs: Int = 2_000): Int? {
        if (host.isBlank() || port !in 1..65535) return null
        return runCatching { tcpRtt(host, port, timeoutMs) }.getOrNull()
            ?: runCatching { icmp(host, timeoutMs) }.getOrNull()
    }

    fun portOf(endpoint: String?): Int? {
        val raw = endpoint?.trim().orEmpty()
        if (raw.isEmpty()) return null
        val tail = if (raw.startsWith("[")) raw.substringAfter("]:", "") else raw.substringAfterLast(':', "")
        return tail.toIntOrNull()?.takeIf { it in 1..65535 }
    }

    private fun icmp(host: String, timeoutMs: Int): Int? {
        val seconds = (timeoutMs / 1000).coerceAtLeast(1).toString()
        val process = ProcessBuilder("ping", "-c", "1", "-w", seconds, host)
            .redirectErrorStream(true)
            .start()
        val finished = process.waitFor(timeoutMs + 500L, TimeUnit.MILLISECONDS)
        if (!finished) {
            process.destroyForcibly()
            return null
        }
        val output = process.inputStream.bufferedReader().use { it.readText() }
        if (process.exitValue() != 0) return null
        return parseRttMs(output)
    }

    private fun tcpRtt(host: String, port: Int, timeoutMs: Int): Int? {
        val started = System.nanoTime()
        try {
            Socket().use { socket ->
                socket.connect(InetSocketAddress(host, port), timeoutMs)
            }
            return elapsedMs(started)
        } catch (refused: ConnectException) {
            val message = refused.message.orEmpty()
            if (!message.contains("refused", ignoreCase = true)) return null
            return elapsedMs(started)
        }
    }

    private fun elapsedMs(startedNs: Long): Int {
        val ms = (System.nanoTime() - startedNs) / 1_000_000L
        return ms.coerceIn(0L, Int.MAX_VALUE.toLong()).toInt()
    }

    private val RTT = Regex("""(?:time|время)\s*[=<]\s*([\d.,]+)""", RegexOption.IGNORE_CASE)
}
