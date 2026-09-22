package com.deepseek.chat.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ContentCopy
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepseek.chat.ui.theme.DarkBorder
import com.deepseek.chat.ui.theme.DarkTextPrimary
import com.deepseek.chat.ui.theme.DarkTextSecondary
import com.deepseek.chat.ui.theme.LightBorder
import com.deepseek.chat.ui.theme.LightTextPrimary
import com.deepseek.chat.ui.theme.LightTextSecondary

/**
 * Парсер и компонент отображения Markdown для ответов DeepSeek (DSFM - DeepSeek Flavored Markdown).
 * Поддерживает:
 * - Блоки кода ```lang ... ``` с кнопкой копирования и именем языка
 * - Заголовки (#, ##, ###)
 * - Жирный текст (**жирный**)
 * - Встроенный моноширинный код (`код`)
 * - Маркированные списки
 */
@Composable
fun DeepSeekMarkdownText(
    markdown: String,
    modifier: Modifier = Modifier
) {
    val isDark = isSystemInDarkTheme()
    val clipboardManager = LocalClipboardManager.current

    // Разбиваем ответ на обычный текст и блоки кода (fenced code blocks)
    val segments = parseMarkdownSegments(markdown)

    Column(modifier = modifier.fillMaxWidth()) {
        segments.forEach { segment ->
            when (segment) {
                is MarkdownSegment.CodeBlock -> {
                    CodeBlockView(
                        language = segment.language,
                        code = segment.code,
                        onCopy = { clipboardManager.setText(AnnotatedString(segment.code)) }
                    )
                }
                is MarkdownSegment.Text -> {
                    FormattedTextView(text = segment.content)
                }
            }
        }
    }
}

@Composable
private fun CodeBlockView(
    language: String,
    code: String,
    onCopy: () -> Unit
) {
    val isDark = isSystemInDarkTheme()
    val codeBg = if (isDark) Color(0xFF16181D) else Color(0xFFF6F8FA)
    val headerBg = if (isDark) Color(0xFF1E2128) else Color(0xFFEAEFF5)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clip(RoundedCornerShape(10.dp))
            .border(
                width = 1.dp,
                color = if (isDark) DarkBorder else LightBorder,
                shape = RoundedCornerShape(10.dp)
            )
            .background(codeBg)
    ) {
        // Шапка блока кода (Язык + Кнопка Копировать)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(headerBg)
                .padding(horizontal = 12.dp, vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = language.ifBlank { "code" },
                fontSize = 12.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Medium,
                color = if (isDark) DarkTextSecondary else LightTextSecondary
            )
            IconButton(
                onClick = onCopy,
                modifier = Modifier.size(24.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.ContentCopy,
                    contentDescription = "Copy code",
                    tint = if (isDark) DarkTextSecondary else LightTextSecondary,
                    modifier = Modifier.size(15.dp)
                )
            }
        }

        // Текст кода с горизонтальным скроллом
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(12.dp)
        ) {
            Text(
                text = code,
                fontFamily = FontFamily.Monospace,
                fontSize = 13.sp,
                lineHeight = 19.sp,
                color = if (isDark) Color(0xFFE6EDF3) else Color(0xFF24292F)
            )
        }
    }
}

@Composable
private fun FormattedTextView(text: String) {
    val isDark = isSystemInDarkTheme()
    val lines = text.split("\n")

    Column(modifier = Modifier.fillMaxWidth()) {
        lines.forEach { line ->
            when {
                line.startsWith("### ") -> {
                    Text(
                        text = line.removePrefix("### "),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (isDark) DarkTextPrimary else LightTextPrimary,
                        modifier = Modifier.padding(top = 10.dp, bottom = 4.dp)
                    )
                }
                line.startsWith("## ") -> {
                    Text(
                        text = line.removePrefix("## "),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (isDark) DarkTextPrimary else LightTextPrimary,
                        modifier = Modifier.padding(top = 12.dp, bottom = 4.dp)
                    )
                }
                line.startsWith("# ") -> {
                    Text(
                        text = line.removePrefix("# "),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (isDark) DarkTextPrimary else LightTextPrimary,
                        modifier = Modifier.padding(top = 14.dp, bottom = 6.dp)
                    )
                }
                line.startsWith("- ") || line.startsWith("* ") -> {
                    Row(modifier = Modifier.padding(vertical = 2.dp, horizontal = 4.dp)) {
                        Text(
                            text = "• ",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (isDark) DarkTextSecondary else LightTextSecondary
                        )
                        Text(
                            text = parseInlineStyles(line.substring(2), isDark),
                            fontSize = 15.sp,
                            lineHeight = 22.sp
                        )
                    }
                }
                else -> {
                    if (line.isNotBlank()) {
                        Text(
                            text = parseInlineStyles(line, isDark),
                            fontSize = 15.sp,
                            lineHeight = 23.sp,
                            modifier = Modifier.padding(vertical = 2.dp)
                        )
                    } else {
                        Spacer(modifier = Modifier.height(6.dp))
                    }
                }
            }
        }
    }
}

/**
 * Разбор встроенных стилей: **жирный**, `инлайн код`.
 */
private fun parseInlineStyles(text: String, isDark: Boolean): AnnotatedString {
    return buildAnnotatedString {
        var cursor = 0
        val regex = Regex("(\\*\\*.*?\\*\\*|`.*?`)")
        val matches = regex.findAll(text)

        matches.forEach { match ->
            val range = match.range
            if (range.first > cursor) {
                append(text.substring(cursor, range.first))
            }

            val value = match.value
            when {
                value.startsWith("**") && value.endsWith("**") -> {
                    val boldContent = value.removeSurrounding("**")
                    pushStyle(SpanStyle(fontWeight = FontWeight.Bold, color = if (isDark) DarkTextPrimary else LightTextPrimary))
                    append(boldContent)
                    pop()
                }
                value.startsWith("`") && value.endsWith("`") -> {
                    val codeContent = value.removeSurrounding("`")
                    pushStyle(
                        SpanStyle(
                            fontFamily = FontFamily.Monospace,
                            background = if (isDark) Color(0xFF23272F) else Color(0xFFEFF1F4),
                            color = if (isDark) Color(0xFF58A6FF) else Color(0xFF0969DA)
                        )
                    )
                    append(" $codeContent ")
                    pop()
                }
                else -> append(value)
            }
            cursor = range.last + 1
        }

        if (cursor < text.length) {
            append(text.substring(cursor))
        }
    }
}

private sealed class MarkdownSegment {
    data class Text(val content: String) : MarkdownSegment()
    data class CodeBlock(val language: String, val code: String) : MarkdownSegment()
}

private fun parseMarkdownSegments(raw: String): List<MarkdownSegment> {
    val segments = mutableListOf<MarkdownSegment>()
    val lines = raw.split("\n")
    var inCodeBlock = false
    var codeLang = ""
    val codeBuilder = StringBuilder()
    val textBuilder = StringBuilder()

    for (line in lines) {
        if (line.trimStart().startsWith("```")) {
            if (inCodeBlock) {
                segments.add(MarkdownSegment.CodeBlock(codeLang, codeBuilder.toString().trimEnd()))
                codeBuilder.clear()
                codeLang = ""
                inCodeBlock = false
            } else {
                if (textBuilder.isNotEmpty()) {
                    segments.add(MarkdownSegment.Text(textBuilder.toString()))
                    textBuilder.clear()
                }
                codeLang = line.trimStart().removePrefix("```").trim()
                inCodeBlock = true
            }
        } else {
            if (inCodeBlock) {
                codeBuilder.append(line).append("\n")
            } else {
                textBuilder.append(line).append("\n")
            }
        }
    }

    if (inCodeBlock) {
        segments.add(MarkdownSegment.CodeBlock(codeLang, codeBuilder.toString().trimEnd()))
    } else if (textBuilder.isNotEmpty()) {
        segments.add(MarkdownSegment.Text(textBuilder.toString()))
    }

    return segments
}
