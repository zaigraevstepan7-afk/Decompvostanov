package com.antigravity.core

import com.antigravity.core.api.CloudCodeClient
import com.antigravity.core.text.MdBlock
import com.antigravity.core.text.MdSpan
import com.antigravity.core.text.Markdown
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MarkdownTest {
    @Test
    fun formatsHeadingsBoldListsAndInlineCode() {
        val raw = """
            ### 1. Программирование и код
            * **Писать, читать и редактировать код** на любых языках: Python, Kotlin
            * поиск файлов по маскам через `glob`
        """.trimIndent()
        val blocks = Markdown.parse(raw)
        assertTrue(blocks[0] is MdBlock.Heading)
        assertEquals(3, (blocks[0] as MdBlock.Heading).level)
        assertTrue(blocks[1] is MdBlock.Bullet)
        val firstBullet = (blocks[1] as MdBlock.Bullet).spans
        assertTrue(firstBullet.any { it is MdSpan.Bold && it.text.contains("Писать") })
        val second = (blocks[2] as MdBlock.Bullet).spans
        assertTrue(second.any { it is MdSpan.Code && it.text == "glob" })
    }

    @Test
    fun keepsFencedCodeBlocks() {
        val blocks = Markdown.parse("```kotlin\nfun main() {}\n```")
        val code = blocks.single() as MdBlock.Code
        assertEquals("kotlin", code.language)
        assertEquals("fun main() {}", code.code)
    }

    @Test
    fun parseReplySplitsThoughtsFromAnswer() {
        val raw = """
            {"response":{"candidates":[{"content":{"role":"model","parts":[
              {"text":"нужно распаковать zip","thought":true},
              {"text":"### Готово\n* файл `note.txt`"}
            ]},"finishReason":"STOP"}]}}
        """.trimIndent()
        val reply = CloudCodeClient().parseReply(raw)
        assertEquals("нужно распаковать zip", reply.thoughts)
        assertTrue(reply.text.contains("Готово"))
        assertTrue(reply.text.contains("note.txt"))
    }
}
