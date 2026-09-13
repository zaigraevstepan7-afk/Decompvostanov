package com.nimbus.vpn.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val Scheme = darkColorScheme(
    primary = Cyan,
    onPrimary = Night,
    secondary = Violet,
    onSecondary = TextPrimary,
    background = Night,
    onBackground = TextPrimary,
    surface = NightElevated,
    onSurface = TextPrimary,
    surfaceVariant = SurfaceCard,
    onSurfaceVariant = TextMuted,
    error = Danger,
    onError = Color.White,
    outline = Color(0x22FFFFFF),
)

@Composable
fun NimbusTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = Scheme,
        typography = NimbusTypography,
        content = content,
    )
}
