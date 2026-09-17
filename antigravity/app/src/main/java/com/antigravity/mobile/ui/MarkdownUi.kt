package com.antigravity.mobile.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.antigravity.core.text.MdBlock
import com.antigravity.core.text.MdSpan
import com.antigravity.core.text.Markdown

@Composable
fun MarkdownBody(raw: String, modifier: Modifier = Modifier) {
    val blocks = remember(raw) { Markdown.parse(raw) }
    SelectionContainer {
        Column(modifier = modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            blocks.forEach { block -> MdBlockView(block) }
        }
    }
}

@Composable
private fun MdBlockView(block: MdBlock) {
    when (block) {
        is MdBlock.Heading -> Text(
            text = annotated(block.spans),
            color = AgColors.Accent,
            fontWeight = FontWeight.SemiBold,
            fontSize = when (block.level) {
                1 -> 22.sp
                2 -> 18.sp
                else -> 15.sp
            },
            lineHeight = 22.sp,
            letterSpacing = (-0.2).sp,
        )
        is MdBlock.Paragraph -> Text(
            text = annotated(block.spans),
            color = AgColors.Text,
            fontSize = 15.sp,
            lineHeight = 22.sp,
        )
        is MdBlock.Bullet -> Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                if (block.ordered) "${block.index}." else "•",
                color = AgColors.Accent,
                fontSize = 15.sp,
                modifier = Modifier.width(22.dp),
            )
            Text(
                text = annotated(block.spans),
                color = AgColors.Text,
                fontSize = 15.sp,
                lineHeight = 22.sp,
                modifier = Modifier.weight(1f),
            )
        }
        is MdBlock.Code -> Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(AgColors.CodeBg, RoundedCornerShape(AgRadius.Code))
                .border(1.dp, AgColors.Border, RoundedCornerShape(AgRadius.Code))
                .padding(start = 2.dp)
                .background(AgColors.CodeBg, RoundedCornerShape(AgRadius.Code)),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp)
                    .padding(horizontal = 10.dp, vertical = 10.dp),
            ) {
                Column {
                    block.language?.let {
                        Text(it, color = AgColors.AccentDim, fontSize = 10.sp, fontFamily = FontFamily.Monospace)
                        Spacer(Modifier.height(6.dp))
                    }
                    Text(
                        block.code,
                        color = AgColors.Accent,
                        fontSize = 12.5.sp,
                        lineHeight = 18.sp,
                        fontFamily = FontFamily.Monospace,
                    )
                }
            }
        }
    }
}

private fun annotated(spans: List<MdSpan>) = buildAnnotatedString {
    spans.forEach { span ->
        when (span) {
            is MdSpan.Text -> append(span.text)
            is MdSpan.Bold -> withStyle(SpanStyle(fontWeight = FontWeight.SemiBold, color = AgColors.Text)) {
                append(span.text)
            }
            is MdSpan.Italic -> withStyle(SpanStyle(fontStyle = FontStyle.Italic, color = AgColors.Thought)) {
                append(span.text)
            }
            is MdSpan.Code -> withStyle(
                SpanStyle(
                    fontFamily = FontFamily.Monospace,
                    fontSize = 12.5.sp,
                    background = AgColors.CodeBg,
                    color = AgColors.Accent,
                ),
            ) { append(" ${span.text} ") }
        }
    }
}
