package com.personal.chatui.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.personal.chatui.data.Accent

data class Palette(
    val bg: Color,
    val card: Color,
    val input: Color,
    val text: Color,
    val secondary: Color,
    val subtitle: Color,
    val hairline: Color,
    val accent: Color,
    val bubble: Color,
    val avatar: Color,
    val logout: Color,
)

fun darkPalette(accent: Accent) = Palette(
    bg = Color(0xFF000000),
    card = Color(0xFF414141),
    input = Color(0xFF303030),
    text = Color(0xFFFFFFFF),
    secondary = Color(0xFFB1B1B1),
    subtitle = Color(0xFF8D8D8D),
    hairline = Color(0xFF5A5A5A),
    accent = accent.color,
    bubble = Color(0xFF303030),
    avatar = Color(0xFFA94136),
    logout = Color(0xFFF16B68),
)

fun lightPalette(accent: Accent) = Palette(
    bg = Color(0xFFFFFFFF),
    card = Color(0xFFF2F2F7),
    input = Color(0xFFE9E9EB),
    text = Color(0xFF000000),
    secondary = Color(0xFF6E6E73),
    subtitle = Color(0xFF8E8E93),
    hairline = Color(0xFFD1D1D6),
    accent = accent.color,
    bubble = Color(0xFFE9E9EB),
    avatar = Color(0xFFA94136),
    logout = Color(0xFFE5484D),
)

val LocalPalette = staticCompositionLocalOf { darkPalette(Accent.Blue) }
