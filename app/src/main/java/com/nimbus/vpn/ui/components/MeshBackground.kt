package com.nimbus.vpn.ui.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.theme.Canvas as CanvasColor
import com.nimbus.vpn.ui.theme.Ink
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun MeshBackground(
    status: ConnectionStatus,
    animate: Boolean,
    modifier: Modifier = Modifier,
) {
    val infinite = rememberInfiniteTransition(label = "bg")
    val drift by infinite.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(9000, easing = LinearEasing), RepeatMode.Reverse),
        label = "drift",
    )
    val pulse by infinite.animateFloat(
        initialValue = 0.55f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(2600, easing = LinearEasing), RepeatMode.Reverse),
        label = "pulse",
    )
    val liveDrift = if (animate) drift else 0.35f
    val livePulse = if (animate) pulse else 0.7f
    val connected = status == ConnectionStatus.CONNECTED
    val connecting = status == ConnectionStatus.CONNECTING

    Canvas(modifier = modifier.background(CanvasColor)) {
        drawRect(CanvasColor)
        val cx = size.width * (0.5f + 0.08f * (liveDrift - 0.5f))
        val cy = size.height * (0.22f + 0.04f * sin(liveDrift * 6.28f).toFloat())
        val glow = when {
            connected -> 0.28f * livePulse
            connecting -> 0.18f * livePulse
            else -> 0.10f * livePulse
        }
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(Ink.copy(alpha = glow), Color.Transparent),
                center = Offset(cx, cy),
                radius = size.minDimension * 0.72f,
            ),
        )
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(Ink.copy(alpha = glow * 0.45f), Color.Transparent),
                center = Offset(
                    size.width * (0.82f + 0.05f * cos(liveDrift * 6.28f).toFloat()),
                    size.height * 0.12f,
                ),
                radius = size.minDimension * 0.38f,
            ),
        )
        if (connected || connecting) {
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(Ink.copy(alpha = glow * 0.35f), Color.Transparent),
                    center = Offset(size.width * 0.5f, size.height * 0.42f),
                    radius = size.minDimension * (0.42f + 0.08f * livePulse),
                ),
            )
        }
    }
}
