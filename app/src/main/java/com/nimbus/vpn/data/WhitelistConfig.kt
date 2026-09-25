package com.nimbus.vpn.data

import java.net.URLDecoder
import java.nio.charset.StandardCharsets
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

/**
 * Turns one downloaded share link into an Xray config. The link stays on the
 * device; this only builds the JSON the tunnel needs at connect time.
 */
object WhitelistConfig {
    fun toCoreJson(link: String): String = core(parse(link)).toString()

    internal fun parse(link: String): Node {
        val hash = link.lastIndexOf('#')
        val bare = if (hash >= 0) link.substring(0, hash) else link
        val scheme = bare.substringBefore("://").lowercase()
        if (scheme != "vless") error("Этот сервер пока нельзя включить")
        val rest = bare.substringAfter("://", "")
        val at = rest.lastIndexOf('@')
        if (at <= 0) error("В ссылке нет адреса")
        val id = rest.substring(0, at)
        val hostportAndQuery = rest.substring(at + 1)
        val hostport = hostportAndQuery.substringBefore('?')
        val query = hostportAndQuery.substringAfter('?', "")
        val host: String
        val port: Int
        if (hostport.startsWith("[")) {
            val end = hostport.indexOf(']')
            if (end < 0) error("В ссылке нет адреса")
            host = hostport.substring(1, end)
            port = hostport.substring(end + 1).removePrefix(":").toIntOrNull() ?: error("В ссылке нет порта")
        } else {
            val colon = hostport.lastIndexOf(':')
            if (colon <= 0) error("В ссылке нет порта")
            host = hostport.substring(0, colon)
            port = hostport.substring(colon + 1).toIntOrNull() ?: error("В ссылке нет порта")
        }
        if (host.isBlank() || id.isBlank() || port !in 1..65535) error("В ссылке нет адреса")
        val params = queryParams(query)
        val network = when (val type = params["type"].orEmpty().lowercase()) {
            "", "tcp", "raw" -> "raw"
            "http", "h2" -> "xhttp"
            else -> type
        }
        val security = params["security"].orEmpty().lowercase()
        val fingerprint = params["fp"].orEmpty().ifBlank {
            if (security == "reality" || security == "tls") "chrome" else ""
        }
        return Node(
            id = id,
            host = host,
            port = port,
            network = network,
            security = security,
            sni = params["sni"].orEmpty(),
            fingerprint = fingerprint,
            publicKey = params["pbk"].orEmpty(),
            shortId = params["sid"].orEmpty(),
            spiderX = params["spx"].orEmpty(),
            flow = params["flow"].orEmpty(),
            path = params["path"].orEmpty().ifBlank { "/" },
            hostHeader = params["host"].orEmpty(),
            serviceName = params["serviceName"].orEmpty(),
            authority = params["authority"].orEmpty(),
            mode = params["mode"].orEmpty(),
            encryption = params["encryption"].orEmpty().ifBlank { "none" },
            alpn = params["alpn"].orEmpty(),
            extra = params["extra"].orEmpty(),
        )
    }

    private fun core(node: Node): JsonObject {
        val user = buildJsonObject {
            put("id", node.id)
            put("encryption", node.encryption)
            if (node.flow.isNotBlank() && node.network == "raw") put("flow", node.flow)
        }
        val stream = buildJsonObject {
            put("network", node.network)
            when (node.network) {
                "ws" -> put("wsSettings", buildJsonObject {
                    put("path", node.path)
                    put("host", node.hostHeader)
                })
                "xhttp" -> put("xhttpSettings", buildJsonObject {
                    put("path", node.path)
                    put("host", node.hostHeader)
                    if (node.mode.isNotBlank()) put("mode", node.mode)
                    val extra = runCatching { Json.parseToJsonElement(node.extra) }.getOrNull()
                    if (extra != null) put("extra", extra)
                })
                "grpc" -> put("grpcSettings", buildJsonObject {
                    put("serviceName", node.serviceName)
                    put("authority", node.authority.ifBlank { node.hostHeader })
                    put("multiMode", node.mode == "multi")
                })
            }
            if (node.security == "reality" || node.security == "tls") {
                put("security", node.security)
                val tls = buildJsonObject {
                    val name = node.sni.ifBlank { node.hostHeader }.ifBlank { node.host }
                    if (name.isNotBlank()) put("serverName", name)
                    if (node.fingerprint.isNotBlank()) put("fingerprint", node.fingerprint)
                    if (node.publicKey.isNotBlank()) put("publicKey", node.publicKey)
                    if (node.shortId.isNotBlank()) put("shortId", node.shortId)
                    if (node.spiderX.isNotBlank()) put("spiderX", node.spiderX)
                    if (node.security == "tls" && node.alpn.isNotBlank()) {
                        put("alpn", buildJsonArray {
                            node.alpn.split(',').map { it.trim() }.filter { it.isNotEmpty() }.forEach {
                                add(JsonPrimitive(it))
                            }
                        })
                    }
                }
                if (node.security == "reality") put("realitySettings", tls) else put("tlsSettings", tls)
            }
        }
        return buildJsonObject {
            put("log", buildJsonObject { put("loglevel", "warning") })
            put("inbounds", buildJsonArray {
                add(buildJsonObject {
                    put("tag", "tun")
                    put("protocol", "tun")
                    put("settings", buildJsonObject {
                        put("name", "xray0")
                        put("mtu", 1500)
                    })
                    put("sniffing", buildJsonObject {
                        put("enabled", true)
                        put("destOverride", buildJsonArray {
                            add(kotlinx.serialization.json.JsonPrimitive("http"))
                            add(kotlinx.serialization.json.JsonPrimitive("tls"))
                        })
                    })
                })
            })
            put("outbounds", buildJsonArray {
                add(buildJsonObject {
                    put("tag", "proxy")
                    put("protocol", "vless")
                    put("settings", buildJsonObject {
                        put("vnext", buildJsonArray {
                            add(buildJsonObject {
                                put("address", node.host)
                                put("port", node.port)
                                put("users", buildJsonArray { add(user) })
                            })
                        })
                    })
                    put("streamSettings", stream)
                })
                add(buildJsonObject {
                    put("tag", "dns-out")
                    put("protocol", "dns")
                })
                add(buildJsonObject {
                    put("tag", "direct")
                    put("protocol", "freedom")
                })
            })
            put("dns", buildJsonObject {
                put("tag", "dns")
                put("queryStrategy", "UseIPv4")
                put("servers", buildJsonArray {
                    add(JsonPrimitive("https://1.1.1.1/dns-query"))
                    add(JsonPrimitive("https://8.8.8.8/dns-query"))
                })
            })
            put("routing", buildJsonObject {
                put("domainStrategy", "AsIs")
                put("rules", buildJsonArray {
                    add(buildJsonObject {
                        put("type", "field")
                        put("inboundTag", buildJsonArray { add(JsonPrimitive("tun")) })
                        put("port", "53")
                        put("outboundTag", "dns-out")
                    })
                    add(buildJsonObject {
                        put("type", "field")
                        put("inboundTag", buildJsonArray { add(JsonPrimitive("dns")) })
                        put("outboundTag", "proxy")
                    })
                    add(buildJsonObject {
                        put("type", "field")
                        put("network", "tcp,udp")
                        put("outboundTag", "proxy")
                    })
                })
            })
        }
    }

    private fun queryParams(query: String): Map<String, String> {
        if (query.isBlank()) return emptyMap()
        val out = LinkedHashMap<String, String>()
        query.split('&').forEach { part ->
            if (part.isBlank()) return@forEach
            val key = URLDecoder.decode(part.substringBefore('='), StandardCharsets.UTF_8)
            val value = URLDecoder.decode(part.substringAfter('=', ""), StandardCharsets.UTF_8)
            if (key.isNotBlank()) out[key] = value
        }
        return out
    }

    internal data class Node(
        val id: String,
        val host: String,
        val port: Int,
        val network: String,
        val security: String,
        val sni: String,
        val fingerprint: String,
        val publicKey: String,
        val shortId: String,
        val spiderX: String,
        val flow: String,
        val path: String,
        val hostHeader: String,
        val serviceName: String,
        val authority: String,
        val mode: String,
        val encryption: String,
        val alpn: String,
        val extra: String,
    )
}
