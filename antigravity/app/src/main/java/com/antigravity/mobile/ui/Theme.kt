package com.antigravity.mobile.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

object AgColors {
    val Bg = Color(0xFF050805)
    val Surface = Color(0xFF0C140F)
    val SurfaceRaised = Color(0xFF121C16)
    val Border = Color(0xFF1C3326)
    val Accent = Color(0xFF3DFF9A)
    val AccentDim = Color(0xFF178A4E)
    val AccentSoft = Color(0x223DFF9A)
    val Text = Color(0xFFE7F6EC)
    val Muted = Color(0xFF7A9A86)
    val Thought = Color(0xFF8FB89C)
    val Danger = Color(0xFFFF6B6B)
    val OnAccent = Color(0xFF03140A)
    val CodeBg = Color(0xFF0A160F)
}

object AgRadius {
    val Outer = 22.dp
    val Inner = 16.dp
    val Chip = 12.dp
    val Code = 10.dp
}

@Composable
fun AntigravityTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkColorScheme(
            background = AgColors.Bg,
            surface = AgColors.Surface,
            primary = AgColors.Accent,
            onBackground = AgColors.Text,
            onSurface = AgColors.Text,
            onPrimary = AgColors.OnAccent,
            error = AgColors.Danger,
        ),
        content = content,
    )
}
