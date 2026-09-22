package com.deepseek.chat.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Извлеченные фирменные цвета DeepSeek
val DeepSeekPrimary = Color(0xFF426EFE)
val DeepSeekPrimaryHover = Color(0xFF325DEB)
val DeepSeekSecondary = Color(0xFF2854E5)

// Светлая тема
val LightBackground = Color(0xFFFFFFFF)
val LightSurface = Color(0xFFF7F8FA)
val LightSurfaceVariant = Color(0xFFEFF1F4)
val LightBorder = Color(0xFFE5E7EB)
val LightTextPrimary = Color(0xFF1F2328)
val LightTextSecondary = Color(0xFF656D76)
val LightUserBubble = Color(0xFFEFF3FD)
val LightThinkingBg = Color(0xFFF8FAFC)
val LightThinkingBorder = Color(0xFFE2E8F0)

// Темная тема
val DarkBackground = Color(0xFF121316)
val DarkSurface = Color(0xFF1E2025)
val DarkSurfaceVariant = Color(0xFF272A30)
val DarkBorder = Color(0xFF32363F)
val DarkTextPrimary = Color(0xFFE6EDF3)
val DarkTextSecondary = Color(0xFF8D96A0)
val DarkUserBubble = Color(0xFF1D2845)
val DarkThinkingBg = Color(0xFF16191E)
val DarkThinkingBorder = Color(0xFF2C313A)

val DeepSeekLightColors = lightColorScheme(
    primary = DeepSeekPrimary,
    background = LightBackground,
    surface = LightSurface,
    surfaceVariant = LightSurfaceVariant,
    onPrimary = Color.White,
    onBackground = LightTextPrimary,
    onSurface = LightTextPrimary,
    outline = LightBorder
)

val DeepSeekDarkColors = darkColorScheme(
    primary = DeepSeekPrimary,
    background = DarkBackground,
    surface = DarkSurface,
    surfaceVariant = DarkSurfaceVariant,
    onPrimary = Color.White,
    onBackground = DarkTextPrimary,
    onSurface = DarkTextPrimary,
    outline = DarkBorder
)

@Composable
fun DeepSeekTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DeepSeekDarkColors else DeepSeekLightColors
    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
