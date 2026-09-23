package com.nimbus.vpn.tunnel

import com.nimbus.vpn.data.SecExit
import java.io.ByteArrayOutputStream
import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.InputStream
import java.io.OutputStream
import java.net.InetSocketAddress
import java.net.Socket
import java.security.SecureRandom
import java.util.Base64
import javax.net.ssl.HttpsURLConnection
import javax.net.ssl.SNIHostName
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSocket

object SecConnect {
    fun request(host: String, port: Int, username: String, password: String): ByteArray {
        val target = if (host.contains(':')) "[$host]:$port" else "$host:$port"
        val token = Base64.getEncoder().encodeToString("$username:$password".toByteArray(Charsets.UTF_8))
        return (
            "CONNECT $target HTTP/1.1\r\n" +
                "Host: $target\r\n" +
                "Proxy-Authorization: Basic $token\r\n" +
                "Proxy-Connection: keep-alive\r\n" +
                "\r\n"
            ).toByteArray(Charsets.ISO_8859_1)
    }

    fun headerEnd(data: ByteArray): Int {
        for (index in 0 until data.size - 3) {
            if (data[index] == 13.toByte() && data[index + 1] == 10.toByte() &&
                data[index + 2] == 13.toByte() && data[index + 3] == 10.toByte()
            ) {
                return index + 4
            }
        }
        return -1
    }

    fun read(input: InputStream): ByteArray {
        val acc = ByteArrayOutputStream()
        val buf = ByteArray(1024)
        while (acc.size() < 8192) {
            val count = input.read(buf)
            if (count < 0) error("Прокси закрыл CONNECT")
            if (count == 0) continue
            acc.write(buf, 0, count)
            val all = acc.toByteArray()
            val end = headerEnd(all)
            if (end >= 0) {
                val status = all.toString(Charsets.ISO_8859_1).substring(0, end - 4).lineSequence().first()
                val code = status.split(' ').getOrNull(1)?.toIntOrNull() ?: 0
                if (code != 200) error("Прокси: $status")
                return all.copyOfRange(end, all.size)
            }
        }
        error("Слишком длинный ответ прокси")
    }
}

object SecProxy {
    fun open(
        protect: (Socket) -> Boolean,
        exit: SecExit,
        host: String,
        port: Int,
        timeoutMs: Int = 12_000,
        idleTimeoutMs: Int = 0,
    ): UpstreamConn {
        var last: Throwable? = null
        // Portal's engine sends an empty SNI and checks the certificate against
        // eu0.sec-tunnel.com afterwards. Trying a name in ClientHello first stalls.
        for (useSni in listOf(false, true)) {
            try {
                return handshake(protect, exit, host, port, timeoutMs, idleTimeoutMs, useSni)
            } catch (error: Throwable) {
                last = error
            }
        }
        throw last ?: IllegalStateException("Не удалось открыть прокси")
    }

    fun queryDns(protect: (Socket) -> Boolean, exit: SecExit, query: ByteArray): ByteArray {
        var last: Throwable? = null
        for (resolver in listOf("1.1.1.1", "8.8.8.8")) {
            try {
                open(protect, exit, resolver, 53, timeoutMs = 8_000, idleTimeoutMs = 8_000).use { conn ->
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

    private fun handshake(
        protect: (Socket) -> Boolean,
        exit: SecExit,
        host: String,
        port: Int,
        timeoutMs: Int,
        idleTimeoutMs: Int,
        useSni: Boolean,
    ): UpstreamConn {
        val raw = Socket()
        raw.tcpNoDelay = true
        raw.keepAlive = true
        protect(raw)
        try {
            raw.connect(InetSocketAddress(exit.ip, exit.port), timeoutMs)
            raw.soTimeout = 0
            val context = SSLContext.getInstance("TLS")
            context.init(null, null, SecureRandom())
            val ssl = context.socketFactory.createSocket(
                raw,
                if (useSni) exit.verifyName else "",
                exit.port,
                true,
            ) as SSLSocket
            val params = ssl.sslParameters
            if (useSni) {
                params.endpointIdentificationAlgorithm = "HTTPS"
                params.serverNames = listOf(SNIHostName(exit.verifyName))
            } else {
                params.endpointIdentificationAlgorithm = null
                runCatching { params.serverNames = emptyList() }
                runCatching {
                    ssl.javaClass.methods.firstOrNull {
                        it.name == "setHostname" && it.parameterTypes.contentEquals(arrayOf(String::class.java))
                    }?.invoke(ssl, "")
                }
            }
            ssl.sslParameters = params
            handshake(ssl, raw, timeoutMs)
            if (!useSni) {
                val matches = HttpsURLConnection.getDefaultHostnameVerifier()
                    .verify(exit.verifyName, ssl.session)
                if (!matches) {
                    ssl.close()
                    error("Сертификат прокси не для ${exit.verifyName}")
                }
            }
            ssl.soTimeout = timeoutMs
            ssl.outputStream.write(SecConnect.request(host, port, exit.username, exit.password))
            ssl.outputStream.flush()
            val prefix = SecConnect.read(ssl.inputStream)
            ssl.soTimeout = idleTimeoutMs
            return SocketUpstream(ssl, prefix)
        } catch (error: Throwable) {
            runCatching { raw.close() }
            throw error
        }
    }

    private fun handshake(ssl: SSLSocket, raw: Socket, timeoutMs: Int) {
        val killer = Thread({
            try {
                Thread.sleep(timeoutMs.toLong())
                runCatching { raw.close() }
            } catch (_: InterruptedException) {
            }
        }, "sec-proxy-tls")
        killer.isDaemon = true
        killer.start()
        try {
            ssl.startHandshake()
        } finally {
            killer.interrupt()
        }
    }
}

private class SocketUpstream(
    private val socket: Socket,
    prefix: ByteArray,
) : UpstreamConn {
    override val input: InputStream = PrefixedInputStream(prefix, socket.getInputStream())
    override val output: OutputStream = socket.getOutputStream()

    override fun close() {
        runCatching { socket.close() }
    }
}

private class PrefixedInputStream(
    private val prefix: ByteArray,
    private val rest: InputStream,
) : InputStream() {
    private var position = 0

    override fun read(): Int {
        val one = ByteArray(1)
        val count = read(one, 0, 1)
        return if (count < 0) -1 else one[0].toInt() and 0xff
    }

    override fun read(buffer: ByteArray, offset: Int, length: Int): Int {
        if (length == 0) return 0
        if (position < prefix.size) {
            val count = minOf(length, prefix.size - position)
            prefix.copyInto(buffer, offset, position, position + count)
            position += count
            return count
        }
        return rest.read(buffer, offset, length)
    }

    override fun close() {
        rest.close()
    }
}
