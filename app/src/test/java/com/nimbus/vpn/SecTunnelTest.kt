package com.nimbus.vpn

import com.google.common.truth.Truth.assertThat
import com.nimbus.vpn.data.SecDigest
import com.nimbus.vpn.data.SecTunnelApi
import com.nimbus.vpn.data.SecTunnelProfile
import com.nimbus.vpn.tunnel.Packets
import com.nimbus.vpn.tunnel.SecConnect
import com.nimbus.vpn.tunnel.TunRelay
import com.nimbus.vpn.tunnel.UpstreamConn
import java.io.PipedInputStream
import java.io.PipedOutputStream
import java.util.Collections
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import org.junit.Test

class SecTunnelTest {
    @Test(timeout = 45_000)
    fun leaseAutoPicksARealRegion() {
        val exit = SecTunnelApi.lease("AUTO")
        assertThat(exit.ip).contains(".")
        assertThat(exit.port).isEqualTo(443)
        assertThat(exit.verifyName.lowercase()).doesNotContain("auto")
        assertThat(exit.username).hasLength(40)
    }

    @Test(timeout = 25_000)
    fun leaseEuReturnsExit() {
        val exit = SecTunnelApi.lease("EU")
        assertThat(exit.ip).contains(".")
        assertThat(exit.port).isEqualTo(443)
        assertThat(exit.username).hasLength(40)
        assertThat(exit.password).isNotEmpty()
        assertThat(exit.verifyName).isEqualTo("eu0.sec-tunnel.com")
    }

    @Test
    fun profileRoundTrip() {
        val profile = SecTunnelProfile.create("eu")
        val spec = SecTunnelProfile.read(profile.rawConfig)
        assertThat(profile.id).isEqualTo("sec:EU")
        assertThat(profile.name).isEqualTo("Европа")
        assertThat(spec!!.region).isEqualTo("EU")
        assertThat(spec.flag).isEqualTo("🇪🇺")
        assertThat(SecTunnelProfile.isSec(profile.rawConfig)).isTrue()
        val auto = SecTunnelProfile.create("AUTO")
        assertThat(auto.id).isEqualTo("sec:AUTO")
        assertThat(auto.name).isEqualTo("Авто")
        assertThat(SecTunnelProfile.read(auto.rawConfig)!!.flag).isEqualTo("🌐")
        assertThat(SecTunnelProfile.regions.first().id).isEqualTo("AUTO")
    }

    @Test
    fun emptyRegionIsNotAnError() {
        val empty = SecTunnelApi.parseDiscover(
            """{"return_code":{"801":"No Available Proxies for Region"}}""",
        )
        assertThat(empty).isEmpty()
        val codes = SecTunnelApi.parseGeoList(
            """{"return_code":{"0":"OK"},"data":{"geos":[{"country":"Europe","country_code":"EU"},{"country":"Asia","country_code":"AS"}]}}""",
        )
        assertThat(codes).containsExactly("EU", "AS").inOrder()
    }

    @Test
    fun wireGuardParserDoesNotTreatSecProfileAsConnectable() {
        val preview = com.nimbus.vpn.data.ConfigParser.parse(SecTunnelProfile.build("AS"))
        assertThat(preview.canConnect).isFalse()
    }

    @Test
    fun sha1AndDiscoverJson() {
        assertThat(SecTunnelApi.capitalHexSha1("abc"))
            .isEqualTo("A9993E364706816ABA3E25717850C26C9CD0D89D")
        assertThat(SecTunnelApi.requestedGeo("eu")).isEqualTo("\"EU\",,")
        val body = """
            {"return_code":{"0":"OK"},"data":{"ips":[{"ip":"203.0.113.10","host":"eu0.sec-tunnel.com","ports":[1080,443],"geo":{"country_code":"DE"}}]}}
        """.trimIndent()
        val endpoint = SecTunnelApi.parseDiscover(body).single()
        assertThat(endpoint.ip).isEqualTo("203.0.113.10")
        assertThat(endpoint.port).isEqualTo(443)
        assertThat(endpoint.verifyName("EU")).isEqualTo("eu0.sec-tunnel.com")
        val device = SecTunnelApi.parseDevice(
            """{"return_code":{"0":"OK"},"data":{"device_id":"ABC","device_password":"secret"}}""",
        )
        assertThat(device.id).isEqualTo("ABC")
        assertThat(device.password).isEqualTo("secret")
    }

    @Test
    fun digestMatchesRfc2617() {
        val header = """Digest realm="testrealm@host.com", qop="auth", nonce="dcd98b7102dd2f0e8b11d0f600bfb0c093", opaque="5ccc069c403ebaf9f0171e9517f40e41""""
        val authorization = SecDigest.authorization(
            method = "GET",
            uri = "/dir/index.html",
            username = "Mufasa",
            password = "Circle Of Life",
            challenge = header,
            nc = "00000001",
            cnonce = "0a4f113b",
        )
        assertThat(authorization).contains("response=\"6629fae49393a05397450978507c4ef1\"")
        assertThat(authorization).contains("qop=auth")
    }

    @Test
    fun digestUsesSha256WhenChallenged() {
        val header = """Digest realm="testrealm@host.com", qop="auth", algorithm="SHA-256", nonce="dcd98b7102dd2f0e8b11d0f600bfb0c093", opaque="5ccc069c403ebaf9f0171e9517f40e41""""
        val authorization = SecDigest.authorization(
            method = "GET",
            uri = "/dir/index.html",
            username = "Mufasa",
            password = "Circle Of Life",
            challenge = header,
            nc = "00000001",
            cnonce = "0a4f113b",
        )
        assertThat(authorization).contains("algorithm=SHA-256")
        assertThat(authorization).contains("response=\"5abdd07184ba512a22c53f41470e5eea7dcaa3a93a59b630c13dfe0a5dc6e38b\"")
    }

    @Test
    fun connectRequestAndStatusLine() {
        val bytes = SecConnect.request("203.0.113.10", 443, "USER", "secret")
        val text = bytes.toString(Charsets.ISO_8859_1)
        assertThat(text).startsWith("CONNECT 203.0.113.10:443 HTTP/1.1\r\n")
        assertThat(text).contains("Proxy-Authorization: Basic ")
        assertThat(text).doesNotContain("secret\r\n")
        val raw = "HTTP/1.1 200 OK\r\n\r\nxyz".toByteArray(Charsets.ISO_8859_1)
        assertThat(SecConnect.headerEnd(raw)).isEqualTo(raw.size - 3)
        val prefix = SecConnect.read(java.io.ByteArrayInputStream(raw))
        assertThat(prefix.toString(Charsets.ISO_8859_1)).isEqualTo("xyz")
    }

    @Test
    fun tcpSynAckRoundTripKeepsChecksum() {
        val src = ipv4(10, 77, 0, 2)
        val dst = ipv4(203, 0, 113, 10)
        val packet = Packets.buildIpv4Tcp(
            src = src,
            dst = dst,
            srcPort = 40000,
            dstPort = 443,
            seq = 1000,
            ack = 0,
            flags = Packets.TCP_SYN,
            ipId = 7,
            mss = 1200,
        )
        assertThat(Packets.ipv4ChecksumOk(packet)).isTrue()
        val ip = Packets.parseIpv4(packet, packet.size)!!
        val tcp = Packets.parseTcp(ip.payload)!!
        assertThat(tcp.flags and Packets.TCP_SYN).isEqualTo(Packets.TCP_SYN)
        assertThat(tcp.seq).isEqualTo(1000)
        assertThat(tcp.dstPort).isEqualTo(443)
    }

    @Test(timeout = 8_000)
    fun relayAnswersSynAndForwardsProxyBytes() {
        val fromProxy = PipedOutputStream()
        val proxyIn = PipedInputStream(fromProxy, 4096)
        val toProxy = PipedOutputStream()
        val sink = PipedInputStream(toProxy, 4096)
        val dialed = CountDownLatch(1)
        val seenHost = java.util.concurrent.atomic.AtomicReference("")
        val seenPort = java.util.concurrent.atomic.AtomicInteger()
        val emitted = Collections.synchronizedList(mutableListOf<ByteArray>())
        val relay = TunRelay(
            dial = { host, port ->
                seenHost.set(host)
                seenPort.set(port)
                dialed.countDown()
                object : UpstreamConn {
                    override val input = proxyIn
                    override val output = toProxy
                    override fun close() {}
                }
            },
            dns = { byteArrayOf() },
            emit = { packet -> emitted.add(packet.copyOf()) },
        )
        try {
            val syn = Packets.buildIpv4Tcp(
                src = ipv4(10, 77, 0, 2),
                dst = ipv4(9, 9, 9, 9),
                srcPort = 1111,
                dstPort = 443,
                seq = 1000,
                ack = 0,
                flags = Packets.TCP_SYN,
                ipId = 1,
            )
            relay.onPacket(syn, syn.size)
            val synAck = emitted.first()
            val tcp = Packets.parseTcp(Packets.parseIpv4(synAck, synAck.size)!!.payload)!!
            assertThat(tcp.flags and (Packets.TCP_SYN or Packets.TCP_ACK)).isEqualTo(Packets.TCP_SYN or Packets.TCP_ACK)
            assertThat(tcp.ack).isEqualTo(1001)
            assertThat(dialed.await(3, TimeUnit.SECONDS)).isTrue()
            assertThat(seenHost.get()).isEqualTo("9.9.9.9")
            assertThat(seenPort.get()).isEqualTo(443)
            assertThat(sink.available()).isAtLeast(0)
            fromProxy.write("hello".toByteArray())
            fromProxy.flush()
            val deadline = System.currentTimeMillis() + 3_000
            var payload: ByteArray? = null
            while (System.currentTimeMillis() < deadline && payload == null) {
                payload = emitted.drop(1).firstNotNullOfOrNull { packet ->
                    val parsed = Packets.parseIpv4(packet, packet.size)?.let { Packets.parseTcp(it.payload) }
                    parsed?.payload?.takeIf { it.isNotEmpty() }
                }
                if (payload == null) Thread.sleep(20)
            }
            assertThat(payload?.toString(Charsets.UTF_8)).isEqualTo("hello")
        } finally {
            relay.close()
            runCatching { fromProxy.close() }
            runCatching { toProxy.close() }
        }
    }

    private fun ipv4(vararg parts: Int): ByteArray = ByteArray(parts.size) { index -> parts[index].toByte() }
}
