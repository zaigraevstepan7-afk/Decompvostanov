package com.nimbus.vpn.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val Scheme = lightColorScheme(
    primary = Accent,
    onPrimary = Canvas,
    secondary = Mist,
    onSecondary = Canvas,
    background = Canvas,
    onBackground = Ink,
    surface = Paper,
    onSurface = Ink,
    surfaceVariant = Lift,
    onSurfaceVariant = InkMuted,
    error = Danger,
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
