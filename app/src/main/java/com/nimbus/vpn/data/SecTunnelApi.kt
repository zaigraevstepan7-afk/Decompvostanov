package com.nimbus.vpn.data

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.intOrNull
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.OutputStream
import java.net.Inet4Address
import java.net.InetAddress
import java.net.InetSocketAddress
import java.net.Socket
import java.net.URL
import java.net.URLEncoder
import java.security.cert.X509Certificate
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLEngine
import javax.net.ssl.SSLSocket
import javax.net.ssl.TrustManager
import javax.net.ssl.X509ExtendedTrustManager
import java.security.MessageDigest
import java.security.SecureRandom

data class SecStatus(val code: Long, val message: String)

data class SecDevice(val id: String, val password: String)

data class SecEndpoint(
    val ip: String,
    val host: String?,
    val ports: List<Int>,
    val country: String?,
) {
    val port: Int
        get() = when {
            443 in ports -> 443
            ports.isNotEmpty() -> ports.first()
            else -> 443
        }

    fun verifyName(region: String): String {
        val named = host?.trim().orEmpty()
        if (named.isNotEmpty()) return named
        val code = (country ?: region).trim().lowercase()
        return "${code}0.sec-tunnel.com"
    }
}

data class SecExit(
    val ip: String,
    val port: Int,
    val verifyName: String,
    val username: String,
    val password: String,
) {
    override fun toString(): String = "$ip:$port"
}

/**
 * SurfEasy / sec-tunnel registration. The digest login is the application
 * credential shipped in every Opera client, not a user password.
 */
object SecTunnelApi {
    const val REGISTER = "https://api2.sec-tunnel.com/v4/register_subscriber"
    const val REGISTER_DEVICE = "https://api2.sec-tunnel.com/v4/register_device"
    const val GEO_LIST = "https://api2.sec-tunnel.com/v4/geo_list"
    const val DISCOVER = "https://api2.sec-tunnel.com/v4/discover"
    private const val EMPTY_REGION = 801L

    private val json = Json { ignoreUnknownKeys = true }

    fun capitalHexSha1(input: String): String {
        val digest = MessageDigest.getInstance("SHA-1").digest(input.toByteArray(Charsets.UTF_8))
        return digest.joinToString("") { "%02X".format(it) }
    }

    fun requestedGeo(region: String): String = "\"${region.trim().uppercase()}\",,"

    fun parseStatus(body: String): SecStatus {
        val root = json.parseToJsonElement(body).jsonObject
        val codeObject = root["return_code"]?.jsonObject ?: error("Нет return_code")
        val entry = codeObject.entries.singleOrNull() ?: error("Непонятный статус sec-tunnel")
        val code = entry.key.toLongOrNull() ?: error("Плохой код sec-tunnel")
        val message = when (val value = entry.value) {
            is JsonPrimitive -> value.contentOrNull ?: value.toString()
            else -> value.toString()
        }
        return SecStatus(code, message)
    }

    fun parseDevice(body: String): SecDevice {
        val status = parseStatus(body)
        if (status.code != 0L) error("sec-tunnel ${status.code}: ${status.message}")
        val data = json.parseToJsonElement(body).jsonObject["data"]?.jsonObject
            ?: error("Нет данных устройства")
        val id = data.string("device_id") ?: error("Нет device_id")
        val password = data.string("device_password") ?: error("Нет пароля устройства")
        return SecDevice(id, password)
    }

    fun parseGeoList(body: String): List<String> {
        val status = parseStatus(body)
        if (status.code != 0L) error("sec-tunnel ${status.code}: ${status.message}")
        val geos = json.parseToJsonElement(body).jsonObject["data"]?.jsonObject
            ?.get("geos") as? JsonArray ?: return emptyList()
        return geos.mapNotNull { element ->
            val item = element as? JsonObject ?: return@mapNotNull null
            item.string("country_code")?.trim()?.uppercase()
        }
    }

    fun parseDiscover(body: String): List<SecEndpoint> {
        val status = parseStatus(body)
        if (status.code == EMPTY_REGION) return emptyList()
        if (status.code != 0L) error("sec-tunnel ${status.code}: ${status.message}")
        val ips = json.parseToJsonElement(body).jsonObject["data"]?.jsonObject
            ?.get("ips") as? JsonArray ?: return emptyList()
        return ips.mapNotNull { element ->
            val item = element as? JsonObject ?: return@mapNotNull null
            val ip = item.string("ip") ?: return@mapNotNull null
            val ports = (item["ports"] as? JsonArray)?.mapNotNull { port ->
                val primitive = port as? JsonPrimitive ?: return@mapNotNull null
                primitive.intOrNull ?: primitive.contentOrNull?.toIntOrNull()
            }.orEmpty()
            val country = (item["geo"] as? JsonObject)?.string("country_code")
            SecEndpoint(ip = ip, host = item.string("host"), ports = ports, country = country)
        }
    }

    fun lease(region: String, http: SecHttp = SecHttp()): SecExit {
        val known = SecTunnelProfile.region(region) ?: error("Неизвестный регион: $region")
        try {
            return if (known.id == "AUTO") leaseAuto(http) else leaseOn(known, http)
        } finally {
            http.close()
        }
    }

    private fun leaseOn(known: SecRegion, http: SecHttp): SecExit {
        val device = register(http)
        val chosen = discoverReady(http, device, known.id).randomOrNull()
            ?: error("Для ${known.name} сейчас нет выхода")
        return exitOf(device, chosen, known.id)
    }

    private fun leaseAuto(http: SecHttp): SecExit {
        val device = register(http)
        val exits = geoCodes(http, device).flatMap { code ->
            discoverReady(http, device, code).map { endpoint -> exitOf(device, endpoint, code) }
        }
        if (exits.isEmpty()) error("Сейчас нет свободных выходов")
        return fastest(exits)
    }

    private fun register(http: SecHttp): SecDevice {
        val email = "${randomHex(32)}@se0316.best.vpn"
        http.post(
            REGISTER,
            mapOf("email" to email, "password" to capitalHexSha1(email)),
        ).also { body ->
            val status = parseStatus(body)
            if (status.code != 0L) error("sec-tunnel ${status.code}: ${status.message}")
        }
        return parseDevice(
            http.post(
                REGISTER_DEVICE,
                mapOf(
                    "client_type" to "se0316",
                    "device_hash" to randomHex(20),
                    "device_name" to "Opera-Browser-Client",
                ),
            ),
        )
    }

    private fun discoverReady(http: SecHttp, device: SecDevice, region: String): List<SecEndpoint> {
        repeat(3) {
            val found = parseDiscover(
                http.post(
                    DISCOVER,
                    mapOf(
                        "serial_no" to capitalHexSha1(device.id),
                        "requested_geo" to requestedGeo(region),
                    ),
                ),
            )
            if (found.isNotEmpty()) return found
        }
        return emptyList()
    }

    private fun geoCodes(http: SecHttp, device: SecDevice): List<String> {
        val pinned = SecTunnelProfile.regions.map { it.id }.filter { it != "AUTO" }
        val listed = runCatching {
            parseGeoList(http.post(GEO_LIST, mapOf("device_id" to capitalHexSha1(device.id))))
        }.getOrDefault(emptyList())
        val known = listed.map { it.uppercase() }.filter { it in pinned }.distinct()
        return known.ifEmpty { pinned }
    }

    private fun exitOf(device: SecDevice, chosen: SecEndpoint, region: String): SecExit =
        SecExit(
            ip = chosen.ip,
            port = chosen.port,
            verifyName = chosen.verifyName(region),
            username = capitalHexSha1(device.id),
            password = device.password,
        )

    private fun fastest(exits: List<SecExit>): SecExit {
        if (exits.size == 1) return exits.first()
        val pool = Executors.newFixedThreadPool(minOf(4, exits.size))
        try {
            val ranked = exits.map { exit ->
                pool.submit<Pair<SecExit, Long>?> {
                    val start = System.nanoTime()
                    val ok = runCatching {
                        Socket().use { socket ->
                            socket.connect(InetSocketAddress(exit.ip, exit.port), 1_200)
                        }
                    }.isSuccess
                    if (!ok) null else exit to (System.nanoTime() - start) / 1_000_000
                }
            }.mapNotNull { future -> runCatching { future.get(2, TimeUnit.SECONDS) }.getOrNull() }
            return ranked.minByOrNull { it.second }?.first ?: exits.random()
        } finally {
            pool.shutdownNow()
        }
    }

    private fun JsonObject.string(key: String): String? {
        val value = this[key] as? JsonPrimitive ?: return null
        return value.contentOrNull?.takeIf { it.isNotBlank() }
    }

    private fun randomHex(bytes: Int): String {
        val buffer = ByteArray(bytes)
        SecureRandom().nextBytes(buffer)
        return buffer.joinToString("") { "%02X".format(it) }
    }
}

object SecDigest {
    fun authorization(
        method: String,
        uri: String,
        username: String,
        password: String,
        challenge: String,
        nc: String,
        cnonce: String,
    ): String {
        val realm = param(challenge, "realm") ?: error("Нет realm")
        val nonce = param(challenge, "nonce") ?: error("Нет nonce")
        val opaque = param(challenge, "opaque")
        val algorithm = param(challenge, "algorithm")?.uppercase()?.ifBlank { null } ?: "MD5"
        val qop = param(challenge, "qop")
            ?.split(',')
            ?.map { it.trim() }
            ?.firstOrNull { it.equals("auth", ignoreCase = true) }
        val ha1 = hash(algorithm, "$username:$realm:$password")
        val ha2 = hash(algorithm, "$method:$uri")
        val response = if (qop != null) {
            hash(algorithm, "$ha1:$nonce:$nc:$cnonce:$qop:$ha2")
        } else {
            hash(algorithm, "$ha1:$nonce:$ha2")
        }
        val parts = mutableListOf(
            "Digest username=\"$username\"",
            "realm=\"$realm\"",
            "nonce=\"$nonce\"",
            "uri=\"$uri\"",
        )
        if (!algorithm.equals("MD5", ignoreCase = true)) {
            parts += "algorithm=$algorithm"
        }
        if (qop != null) {
            parts += "qop=$qop"
            parts += "nc=$nc"
            parts += "cnonce=\"$cnonce\""
        }
        parts += "response=\"$response\""
        if (!opaque.isNullOrEmpty()) parts += "opaque=\"$opaque\""
        return parts.joinToString(", ")
    }

    fun hash(algorithm: String, text: String): String {
        val name = when (algorithm.uppercase()) {
            "SHA-256", "SHA-256-SESS" -> "SHA-256"
            else -> "MD5"
        }
        val digest = MessageDigest.getInstance(name).digest(text.toByteArray(Charsets.ISO_8859_1))
        return digest.joinToString("") { "%02x".format(it) }
    }

    fun param(header: String, name: String): String? {
        val match = Regex("""(?i)\b${Regex.escape(name)}\s*=\s*("([^"]*)"|([^,\s]+))""").find(header)
            ?: return null
        return if (match.groupValues[1].startsWith("\"")) match.groupValues[2] else match.groupValues[3]
    }

    fun md5(text: String): String = hash("MD5", text)
}

/**
 * Digest auth on api2.sec-tunnel.com is valid only for the TLS connection that
 * received the challenge. One socket carries register, device and discover.
 *
 * The SurfEasy client (opera-proxy, the engine inside Portal Connect) dials this
 * host with an empty SNI and does not check the certificate name. A strict SNI
 * handshake stalls on some mobile networks until our timeout fires.
 */
class SecHttp : AutoCloseable {
    private val cookies = linkedMapOf<String, String>()
    private var challenge: String? = null
    private var nonce: String? = null
    private var nc = 0
    private var socket: SSLSocket? = null
    private var input: InputStream? = null
    private var output: OutputStream? = null

    fun post(url: String, form: Map<String, String>): String {
        val body = form.entries.joinToString("&") { (key, value) ->
            URLEncoder.encode(key, Charsets.UTF_8.name()) + "=" + URLEncoder.encode(value, Charsets.UTF_8.name())
        }
        val uri = URL(url).path.ifBlank { "/" }
        connect()
        val cached = challenge
        if (cached != null) {
            val authed = exchange(uri, body, authorization(uri, cached))
            if (authed.code != 401) return requireOk(authed)
            remember(authed.wwwAuthenticate)
        }
        val probe = exchange(uri, body, null)
        if (probe.code == 401) {
            val next = probe.wwwAuthenticate ?: error("sec-tunnel не прислал Digest")
            remember(next)
            return requireOk(exchange(uri, body, authorization(uri, next)))
        }
        return requireOk(probe)
    }

    override fun close() {
        runCatching { socket?.close() }
        socket = null
        input = null
        output = null
    }

    private fun connect() {
        val current = socket
        if (current != null && current.isConnected && !current.isClosed) return
        close()
        challenge = null
        nonce = null
        nc = 0
        var last: Throwable? = null
        for (address in resolveHosts()) {
            try {
                open(address)
                return
            } catch (error: Throwable) {
                close()
                last = error
            }
        }
        throw last ?: IllegalStateException("Нет соединения с $HOST")
    }

    private fun open(address: InetAddress) {
        val tcp = Socket()
        try {
            tcp.tcpNoDelay = true
            tcp.connect(InetSocketAddress(address, 443), 10_000)
            tcp.soTimeout = 0
            val context = SSLContext.getInstance("TLS")
            context.init(null, arrayOf<TrustManager>(API_TRUST), SecureRandom())
            val opened = context.socketFactory.createSocket(tcp, address.hostAddress, 443, true) as SSLSocket
            val params = opened.sslParameters
            params.endpointIdentificationAlgorithm = null
            runCatching { params.serverNames = emptyList() }
            opened.sslParameters = params
            opened.javaClass.methods.firstOrNull {
                it.name == "setHostname" && it.parameterTypes.contentEquals(arrayOf(String::class.java))
            }?.let { runCatching { it.invoke(opened, "") } }
            handshake(opened, tcp)
            opened.soTimeout = 20_000
            socket = opened
            input = opened.inputStream
            output = opened.outputStream
        } catch (error: Throwable) {
            if (socket == null) runCatching { tcp.close() }
            throw error
        }
    }

    private fun handshake(opened: SSLSocket, tcp: Socket) {
        val killer = Thread({
            try {
                Thread.sleep(20_000)
                runCatching { tcp.close() }
            } catch (_: InterruptedException) {
            }
        }, "sec-tls")
        killer.isDaemon = true
        killer.start()
        try {
            opened.startHandshake()
        } finally {
            killer.interrupt()
        }
    }

    private fun resolveHosts(): List<InetAddress> {
        val pool = Executors.newSingleThreadExecutor()
        return try {
            pool.submit<List<InetAddress>> {
                val found = InetAddress.getAllByName(HOST).toList()
                val v4 = found.filterIsInstance<Inet4Address>()
                v4.ifEmpty { found }
            }.get(8, TimeUnit.SECONDS)
        } catch (timeout: java.util.concurrent.TimeoutException) {
            throw IllegalStateException("Не удалось найти $HOST")
        } finally {
            pool.shutdownNow()
        }
    }

    private fun remember(header: String?) {
        if (header.isNullOrBlank()) return
        val nextNonce = SecDigest.param(header, "nonce")
        if (nextNonce != nonce) nc = 0
        nonce = nextNonce
        challenge = header
    }

    private fun authorization(uri: String, header: String): String {
        nc += 1
        val cnonce = ByteArray(4).also { SecureRandom().nextBytes(it) }
            .joinToString("") { "%02x".format(it) }
        return SecDigest.authorization(
            method = "POST",
            uri = uri,
            username = SecApiAuth.LOGIN,
            password = SecApiAuth.PASSWORD,
            challenge = header,
            nc = "%08x".format(nc),
            cnonce = cnonce,
        )
    }

    private fun requireOk(result: HttpResult): String {
        if (result.code !in 200..299) error("sec-tunnel HTTP ${result.code}")
        return result.body
    }

    private fun exchange(path: String, body: String, authorization: String?): HttpResult {
        val payload = body.toByteArray(Charsets.UTF_8)
        val request = buildString {
            append("POST $path HTTP/1.1\r\n")
            append("Host: $HOST\r\n")
            append("Content-Type: application/x-www-form-urlencoded\r\n")
            append("Content-Length: ${payload.size}\r\n")
            append("Accept: application/json\r\n")
            append("Connection: keep-alive\r\n")
            append("SE-Client-Version: ${SecApiAuth.CLIENT_VERSION}\r\n")
            append("SE-Operating-System: Windows\r\n")
            append("User-Agent: ${SecApiAuth.USER_AGENT}\r\n")
            if (authorization != null) append("Authorization: $authorization\r\n")
            cookieHeader()?.let { append("Cookie: $it\r\n") }
            append("\r\n")
        }.toByteArray(Charsets.ISO_8859_1)
        val out = output ?: error("Нет соединения с sec-tunnel")
        out.write(request)
        out.write(payload)
        out.flush()
        return readResponse()
    }

    private fun readResponse(): HttpResult {
        val source = input ?: error("Нет соединения с sec-tunnel")
        val headerBytes = ByteArrayOutputStream()
        val chunk = ByteArray(2048)
        var end = -1
        while (headerBytes.size() < 16_384) {
            val count = source.read(chunk)
            if (count < 0) error("sec-tunnel закрыл соединение")
            if (count == 0) continue
            headerBytes.write(chunk, 0, count)
            end = headerEnd(headerBytes.toByteArray())
            if (end >= 0) break
        }
        if (end < 0) error("Слишком длинный ответ sec-tunnel")
        val raw = headerBytes.toByteArray()
        val headerText = raw.toString(Charsets.ISO_8859_1).substring(0, end - 4)
        val lines = headerText.split("\r\n")
        val status = lines.firstOrNull().orEmpty()
        val code = status.split(' ').getOrNull(1)?.toIntOrNull() ?: 0
        val headers = linkedMapOf<String, MutableList<String>>()
        lines.drop(1).forEach { line ->
            val colon = line.indexOf(':')
            if (colon <= 0) return@forEach
            val key = line.substring(0, colon).trim().lowercase()
            headers.getOrPut(key) { mutableListOf() } += line.substring(colon + 1).trim()
        }
        headers["set-cookie"].orEmpty().forEach { rawCookie ->
            val pair = rawCookie.substringBefore(';').trim()
            val eq = pair.indexOf('=')
            if (eq > 0) cookies[pair.substring(0, eq)] = pair.substring(eq + 1)
        }
        val pipe = BytePipe(raw.copyOfRange(end, raw.size), source)
        val body = when {
            headers["transfer-encoding"]?.any { it.contains("chunked", true) } == true -> readChunked(pipe)
            else -> {
                val length = headers["content-length"]?.firstOrNull()?.toIntOrNull() ?: 0
                if (length <= 0) ByteArray(0) else pipe.readFully(length)
            }
        }
        return HttpResult(code, body.toString(Charsets.UTF_8), headers["www-authenticate"]?.firstOrNull())
    }

    private fun cookieHeader(): String? {
        if (cookies.isEmpty()) return null
        return cookies.entries.joinToString("; ") { (name, value) -> "$name=$value" }
    }

    private fun headerEnd(data: ByteArray): Int {
        for (index in 0 until data.size - 3) {
            if (data[index] == 13.toByte() && data[index + 1] == 10.toByte() &&
                data[index + 2] == 13.toByte() && data[index + 3] == 10.toByte()
            ) {
                return index + 4
            }
        }
        return -1
    }

    private fun readChunked(pipe: BytePipe): ByteArray {
        val out = ByteArrayOutputStream()
        while (true) {
            val line = pipe.readLine()
            val size = line.substringBefore(';').trim().toIntOrNull(16) ?: error("Плохой ответ sec-tunnel")
            if (size == 0) {
                while (pipe.readLine().isNotEmpty()) Unit
                break
            }
            out.write(pipe.readFully(size))
            pipe.readLine()
        }
        return out.toByteArray()
    }

    private class BytePipe(
        initial: ByteArray,
        private val rest: InputStream,
    ) {
        private var extra = initial
        private var position = 0

        fun readLine(): String {
            val line = ByteArrayOutputStream()
            while (true) {
                val value = readByte()
                if (value < 0) break
                if (value == '\n'.code) break
                if (value != '\r'.code) line.write(value)
            }
            return line.toString(Charsets.ISO_8859_1)
        }

        fun readFully(count: Int): ByteArray {
            val out = ByteArray(count)
            var got = 0
            while (got < count) {
                val read = read(out, got, count - got)
                if (read < 0) error("sec-tunnel оборвал ответ")
                got += read
            }
            return out
        }

        private fun readByte(): Int {
            val one = ByteArray(1)
            val count = read(one, 0, 1)
            return if (count < 0) -1 else one[0].toInt() and 0xff
        }

        private fun read(buffer: ByteArray, offset: Int, length: Int): Int {
            if (position < extra.size) {
                val count = minOf(length, extra.size - position)
                extra.copyInto(buffer, offset, position, position + count)
                position += count
                return count
            }
            return rest.read(buffer, offset, length)
        }
    }

    private data class HttpResult(val code: Int, val body: String, val wwwAuthenticate: String?)

    companion object {
        private const val HOST = "api2.sec-tunnel.com"

        private val API_TRUST = object : X509ExtendedTrustManager() {
            override fun checkClientTrusted(chain: Array<out X509Certificate>?, authType: String?, socket: Socket?) = Unit
            override fun checkClientTrusted(chain: Array<out X509Certificate>?, authType: String?, engine: SSLEngine?) = Unit
            override fun checkClientTrusted(chain: Array<out X509Certificate>?, authType: String?) = Unit
            override fun checkServerTrusted(chain: Array<out X509Certificate>?, authType: String?, socket: Socket?) = Unit
            override fun checkServerTrusted(chain: Array<out X509Certificate>?, authType: String?, engine: SSLEngine?) = Unit
            override fun checkServerTrusted(chain: Array<out X509Certificate>?, authType: String?) = Unit
            override fun getAcceptedIssuers(): Array<X509Certificate> = emptyArray()
        }
    }
}

internal object SecApiAuth {
    const val LOGIN = "se0316"
    const val PASSWORD = "SILrMEPBmJuhomxWkfm3JalqHX2Eheg1YhlEZiMh8II"
    const val CLIENT_VERSION = "Stable 114.0.5282.21"
    const val USER_AGENT =
        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36 OPR/114.0.0.0"
}
