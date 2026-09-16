package com.nimbus.vpn.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val Scheme = darkColorScheme(
    primary = Ink,
    onPrimary = Canvas,
    secondary = InkMuted,
    onSecondary = Canvas,
    background = Canvas,
    onBackground = Ink,
    surface = Paper,
    onSurface = Ink,
    surfaceVariant = Lift,
    onSurfaceVariant = InkMuted,
    error = Ink,
    onError = Canvas,
    outline = Line,
)

@Composable
fun BozyaTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = Scheme,
        typography = BozyaTypography,
        content = content,
    )
}
