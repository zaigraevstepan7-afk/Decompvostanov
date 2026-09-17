package com.antigravity.core.text

sealed class MdSpan {
    data class Text(val text: String) : MdSpan()
    data class Bold(val text: String) : MdSpan()
    data class Italic(val text: String) : MdSpan()
    data class Code(val text: String) : MdSpan()
}

sealed class MdBlock {
    data class Heading(val level: Int, val spans: List<MdSpan>) : MdBlock()
    data class Paragraph(val spans: List<MdSpan>) : MdBlock()
    data class Bullet(val spans: List<MdSpan>, val ordered: Boolean = false, val index: Int = 0) : MdBlock()
    data class Code(val language: String?, val code: String) : MdBlock()
}

object Markdown {
    fun parse(raw: String): List<MdBlock> {
        val lines = raw.replace("\r\n", "\n").split('\n')
        val blocks = mutableListOf<MdBlock>()
        var i = 0
        var orderIndex = 0
        while (i < lines.size) {
            val line = lines[i]
            when {
                line.startsWith("```") -> {
                    val lang = line.removePrefix("```").trim().ifBlank { null }
                    val body = StringBuilder()
                    i++
                    while (i < lines.size && !lines[i].startsWith("```")) {
                        if (body.isNotEmpty()) body.append('\n')
                        body.append(lines[i])
                        i++
                    }
                    blocks += MdBlock.Code(lang, body.toString())
                    orderIndex = 0
                }
                headingLevel(line) != null -> {
                    val level = headingLevel(line)!!
                    blocks += MdBlock.Heading(level, parseSpans(line.drop(level).trim()))
                    orderIndex = 0
                }
                isBullet(line) -> {
                    val ordered = line.trimStart().first().isDigit()
                    if (ordered) orderIndex += 1 else orderIndex = 0
                    blocks += MdBlock.Bullet(
                        spans = parseSpans(stripBullet(line)),
                        ordered = ordered,
                        index = if (ordered) orderIndex else 0,
                    )
                }
                line.isBlank() -> orderIndex = 0
                else -> {
                    val buf = StringBuilder(line.trimEnd())
                    while (i + 1 < lines.size) {
                        val next = lines[i + 1]
                        if (next.isBlank() || headingLevel(next) != null || isBullet(next) || next.startsWith("```")) break
                        buf.append(' ').append(next.trim())
                        i++
                    }
                    blocks += MdBlock.Paragraph(parseSpans(buf.toString()))
                    orderIndex = 0
                }
            }
            i++
        }
        return blocks
    }

    fun parseSpans(text: String): List<MdSpan> {
        if (text.isEmpty()) return emptyList()
        val spans = mutableListOf<MdSpan>()
        val regex = Regex("`([^`]+)`|\\*\\*([^*]+)\\*\\*|\\*([^*]+)\\*")
        var cursor = 0
        regex.findAll(text).forEach { match ->
            if (match.range.first > cursor) {
                spans += MdSpan.Text(text.substring(cursor, match.range.first))
            }
            when {
                match.groupValues[1].isNotEmpty() -> spans += MdSpan.Code(match.groupValues[1])
                match.groupValues[2].isNotEmpty() -> spans += MdSpan.Bold(match.groupValues[2])
                else -> spans += MdSpan.Italic(match.groupValues[3])
            }
            cursor = match.range.last + 1
        }
        if (cursor < text.length) spans += MdSpan.Text(text.substring(cursor))
        return spans.ifEmpty { listOf(MdSpan.Text(text)) }
    }

    private fun headingLevel(line: String): Int? {
        val match = Regex("^(#{1,6})\\s+\\S").find(line) ?: return null
        return match.groupValues[1].length
    }

    private fun isBullet(line: String): Boolean =
        Regex("^\\s*([-*]|\\d+\\.)\\s+\\S").containsMatchIn(line)

    private fun stripBullet(line: String): String =
        line.replace(Regex("^\\s*([-*]|\\d+\\.)\\s+"), "")
}
