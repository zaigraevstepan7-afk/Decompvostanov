package com.nimbus.vpn.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val Scheme = lightColorScheme(
    primary = Ink,
    onPrimary = Paper,
    secondary = InkMuted,
    onSecondary = Paper,
    background = Canvas,
    onBackground = Ink,
    surface = Paper,
    onSurface = Ink,
    surfaceVariant = Paper,
    onSurfaceVariant = InkMuted,
    error = Ink,
    onError = Paper,
    outline = Line,
)

@Composable
fun NimbusTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = Scheme,
        typography = NimbusTypography,
        content = content,
    )
}
