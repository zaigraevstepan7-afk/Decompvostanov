package com.antigravity.core

import com.antigravity.core.agent.AgentListener
import com.antigravity.core.agent.AgentLoop
import com.antigravity.core.agent.LocalDeviceFs
import com.antigravity.core.agent.ToolExecutor
import com.antigravity.core.api.CloudCodeClient
import com.antigravity.core.api.GeminiModels
import com.antigravity.core.api.ContentTurn
import com.antigravity.core.api.FunctionCall
import com.antigravity.core.api.LlmClient
import com.antigravity.core.api.ModelReply
import com.antigravity.core.auth.AntigravityOAuth
import com.antigravity.core.auth.AntigravitySession
import com.antigravity.core.auth.decodeSession
import com.antigravity.core.auth.encodeSession
import com.antigravity.core.api.textTurn
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.put
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.io.File
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream
import kotlin.test.assertContains

class AntigravityCoreTest {

    @TempDir
    lateinit var tmp: File

    @Test
    fun oauthUrlUsesAntigravityGoogleClientAndLoopback() {
        val state = "abc123"
        val url = AntigravityOAuth.buildAuthUrl(state)
        assertTrue(url.startsWith("https://accounts.google.com/o/oauth2/v2/auth?"))
        assertContains(url, "client_id=${AntigravityOAuth.CLIENT_ID}")
        assertContains(url, "redirect_uri=http%3A%2F%2F127.0.0.1%3A51121%2Foauth-callback")
        assertContains(url, "access_type=offline")
        assertContains(url, "prompt=consent")
        assertContains(url, "cloud-platform")
        assertContains(url, "state=abc123")
        assertFalse(url.contains("generativelanguage.googleapis.com"))
    }

    @Test
    fun sessionRoundTrip() {
        val session = AntigravitySession(
            accessToken = "at",
            refreshToken = "rt",
            expiresAtEpochMs = 42L,
            email = "user@gmail.com",
            projectId = "proj-1",
        )
        val restored = decodeSession(encodeSession(session))
        assertEquals("antigravity", restored.type)
        assertEquals("user@gmail.com", restored.email)
        assertEquals("proj-1", restored.projectId)
        assertTrue(session.isExpired(nowMs = 100_000))
        assertFalse(session.isExpired(nowMs = 1L, skewMs = 0))
    }

    @Test
    fun extractZipOnLocalFilesystem() {
        val zip = File(tmp, "project.zip")
        ZipOutputStream(zip.outputStream()).use { out ->
            out.putNextEntry(ZipEntry("src/Main.kt"))
            out.write("fun main() = println(\"hi\")".toByteArray())
            out.closeEntry()
            out.putNextEntry(ZipEntry("readme.txt"))
            out.write("hello phone".toByteArray())
            out.closeEntry()
        }
        val fs = LocalDeviceFs(tmp)
        val result = fs.extract(zip.absolutePath, File(tmp, "out").absolutePath)
        assertEquals(2, result.files.size)
        assertEquals("hello phone", File(tmp, "out/readme.txt").readText())
        assertTrue(File(tmp, "out/src/Main.kt").exists())
    }

    @Test
    fun editAndReadWorkspaceFiles() {
        val fs = LocalDeviceFs(tmp)
        fs.writeText("app.txt", "alpha")
        fs.editText("app.txt", "alpha", "beta")
        val text = File(tmp, "app.txt").readText()
        assertEquals("beta", text)
        val listed = fs.list(".").map { it.name }
        assertTrue("app.txt" in listed)
    }

    @Test
    fun toolExecutorExtractsThenEdits() {
        val zip = File(tmp, "pkg.zip")
        ZipOutputStream(zip.outputStream()).use { out ->
            out.putNextEntry(ZipEntry("secret.txt"))
            out.write("OLD".toByteArray())
            out.closeEntry()
        }
        val fs = LocalDeviceFs(tmp)
        val tools = ToolExecutor(fs)
        val unpacked = tools.execute(
            "extract_archive",
            buildJsonObject {
                put("archive", zip.absolutePath)
                put("dest", File(tmp, "unpacked").absolutePath)
            },
        )
        assertTrue(unpacked.contains("Распаковано"))
        val edited = tools.execute(
            "edit_file",
            buildJsonObject {
                put("path", File(tmp, "unpacked/secret.txt").absolutePath)
                put("old_text", "OLD")
                put("new_text", "NEW")
            },
        )
        assertTrue(edited.contains("Заменено"))
        assertEquals("NEW", File(tmp, "unpacked/secret.txt").readText())
    }

    @Test
    fun agentUnzipsOnDeviceThenAnswers() {
        val zip = File(tmp, "task.zip")
        ZipOutputStream(zip.outputStream()).use { out ->
            out.putNextEntry(ZipEntry("note.txt"))
            out.write("from-zip".toByteArray())
            out.closeEntry()
        }
        val fs = LocalDeviceFs(tmp)
        val session = AntigravitySession(
            accessToken = "a",
            refreshToken = "r",
            expiresAtEpochMs = Long.MAX_VALUE,
            email = "me@gmail.com",
            projectId = "p",
        )
        val script = ArrayDeque(
            listOf(
                ModelReply(
                    parts = emptyList(),
                    finishReason = "TOOL",
                    text = "",
                    functionCalls = listOf(
                        FunctionCall(
                            "extract_archive",
                            buildJsonObject {
                                put("archive", zip.absolutePath)
                                put("dest", File(tmp, "done").absolutePath)
                            },
                            id = "call1",
                        ),
                    ),
                ),
                ModelReply(
                    parts = emptyList(),
                    finishReason = "STOP",
                    text = "Архив распакован на телефоне в done/note.txt",
                    functionCalls = emptyList(),
                ),
            ),
        )
        val llm = object : LlmClient {
            override fun generate(
                session: AntigravitySession,
                model: String,
                systemInstruction: String,
                contents: List<ContentTurn>,
                tools: JsonArray,
            ): ModelReply {
                assertTrue(systemInstruction.contains("СТРОГО НА ANDROID"))
                assertTrue(tools.toString().contains("extract_archive"))
                return script.removeFirst()
            }
        }
        val toolsUsed = mutableListOf<String>()
        val answer = AgentLoop(llm, fs).run(
            session,
            "gemini-3-flash",
            "Разархивируй task.zip",
            mutableListOf(),
            object : AgentListener {
                override fun onToolStart(name: String, args: JsonObject) {
                    toolsUsed += name
                }
            },
        )
        assertEquals(listOf("extract_archive"), toolsUsed)
        assertTrue(File(tmp, "done/note.txt").readText() == "from-zip")
        assertTrue(answer.contains("распакован"))
    }

    @Test
    fun parseFunctionCallFromAntigravityEnvelope() {
        val raw = """
            {"response":{"candidates":[{"content":{"role":"model","parts":[
              {"functionCall":{"name":"extract_archive","args":{"archive":"/sdcard/a.zip"},"id":"1"}}
            ]},"finishReason":"OTHER"}]}}
        """.trimIndent()
        val reply = CloudCodeClient().parseReply(raw)
        assertEquals("extract_archive", reply.functionCalls.single().name)
        assertEquals("/sdcard/a.zip", reply.functionCalls.single().args["archive"]?.toString()?.trim('"'))
    }

    @Test
    fun defaultModelIsCurrentFlashNotLegacyGemini3() {
        assertEquals("gemini-3.8-flash-high", GeminiModels.DEFAULT)
        assertTrue(GeminiModels.ids().contains("gemini-3.7-flash-high"))
        assertTrue(GeminiModels.ids().contains("gemini-pro-agent"))
        assertTrue(GeminiModels.ALL.first().id != "gemini-3-flash")
        val flash37 = GeminiModels.resolve("gemini-3.7-flash-high")
        assertEquals(listOf("gemini-3.7-flash-high", "gemini-3.7-flash-tiered"), flash37.wireIds)
        assertEquals("high", flash37.thinkingLevel)
        val customTiered = GeminiModels.resolve("gemini-3.7-flash-tiered")
        assertEquals(listOf("gemini-3.7-flash-tiered"), customTiered.wireIds)
    }

    @Test
    fun consumerGenerateUsesDailyEndpointNotProd() {
        assertEquals("https://daily-cloudcode-pa.googleapis.com", AntigravityOAuth.GENERATE_ENDPOINT)
        assertEquals(AntigravityOAuth.DAILY_API_ENDPOINT, AntigravityOAuth.GENERATE_ENDPOINT)
        assertTrue(AntigravityOAuth.API_ENDPOINT.contains("cloudcode-pa.googleapis.com"))
        assertTrue(AntigravityOAuth.USER_AGENT.startsWith("antigravity/hub/"))
        assertTrue(AntigravityOAuth.USER_AGENT.contains("darwin"))
        assertFalse(AntigravityOAuth.USER_AGENT.contains("/cli/"))
        assertFalse(AntigravityOAuth.GENERATE_ENDPOINT.contains("://cloudcode-pa."))
        val version = AntigravityOAuth.CLIENT_VERSION.split(".").map { it.toInt() }
        assertTrue(version[0] > 2 || (version[0] == 2 && version[1] >= 9))
    }

    @Test
    fun envelopeUsesThinkingLevelForFlashHigh() {
        val envelope = CloudCodeClient().buildEnvelope(
            projectId = "proj",
            wireId = "gemini-3.7-flash-tiered",
            thinkingLevel = "high",
            systemInstruction = "sys",
            contents = listOf(textTurn("user", "hi")),
            tools = JsonArray(emptyList()),
        )
        val thinking = envelope["request"]!!.jsonObject["generationConfig"]!!.jsonObject["thinkingConfig"]!!.jsonObject
        assertEquals("gemini-3.7-flash-tiered", envelope["model"]!!.jsonPrimitive.content)
        assertEquals("high", thinking["thinkingLevel"]!!.jsonPrimitive.content)
        assertEquals("true", thinking["includeThoughts"]!!.toString())
    }

    @Test
    fun generateRetriesTieredWireIdOn404() {
        val server = MockWebServer()
        server.enqueue(
            MockResponse().setResponseCode(404).setBody(
                """{"error":{"code":404,"message":"Requested entity was not found.","status":"NOT_FOUND"}}""",
            ),
        )
        server.enqueue(
            MockResponse().setResponseCode(200).setBody(
                """{"response":{"candidates":[{"content":{"role":"model","parts":[{"text":"ok"}]},"finishReason":"STOP"}]}}""",
            ),
        )
        server.start()
        try {
            val client = CloudCodeClient(baseUrl = server.url("/").toString().trimEnd('/'))
            val session = AntigravitySession(
                accessToken = "tok",
                refreshToken = "rt",
                expiresAtEpochMs = Long.MAX_VALUE,
                email = "me@gmail.com",
                projectId = "proj",
            )
            val reply = client.generate(
                session,
                "gemini-3.7-flash-high",
                "sys",
                listOf(textTurn("user", "hi")),
                JsonArray(emptyList()),
            )
            assertEquals("ok", reply.text)
            val first = Json.parseToJsonElement(server.takeRequest().body.readUtf8()).jsonObject
            val secondRequest = server.takeRequest()
            val second = Json.parseToJsonElement(secondRequest.body.readUtf8()).jsonObject
            assertEquals("gemini-3.7-flash-high", first["model"]!!.jsonPrimitive.content)
            assertEquals("gemini-3.7-flash-tiered", second["model"]!!.jsonPrimitive.content)
            assertEquals(AntigravityOAuth.USER_AGENT, secondRequest.getHeader("User-Agent"))
            assertEquals(
                "high",
                second["request"]!!.jsonObject["generationConfig"]!!.jsonObject["thinkingConfig"]!!.jsonObject["thinkingLevel"]!!.jsonPrimitive.content,
            )
        } finally {
            server.shutdown()
        }
    }
}
