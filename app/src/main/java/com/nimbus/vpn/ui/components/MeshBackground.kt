package com.nimbus.vpn.ui.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.theme.Cyan
import com.nimbus.vpn.ui.theme.Magenta
import com.nimbus.vpn.ui.theme.Night
import com.nimbus.vpn.ui.theme.Violet
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun MeshBackground(
    status: ConnectionStatus,
    animate: Boolean,
    modifier: Modifier = Modifier,
) {
    val transition = rememberInfiniteTransition(label = "mesh")
    val t by transition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(if (status == ConnectionStatus.CONNECTED) 14000 else 22000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart,
        ),
        label = "phase",
    )
    val phase = if (animate) t else 0.12f
    val intensity = when (status) {
        ConnectionStatus.CONNECTED -> 0.55f
        ConnectionStatus.CONNECTING -> 0.4f
        ConnectionStatus.ERROR -> 0.25f
        ConnectionStatus.DISCONNECTED -> 0.22f
    }

    Canvas(modifier = modifier) {
        drawRect(Night)
        val w = size.width
        val h = size.height
        fun orb(cx: Float, cy: Float, r: Float, color: Color, a: Float) {
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(color.copy(alpha = a), Color.Transparent),
                    center = Offset(cx, cy),
                    radius = r,
                ),
                radius = r,
                center = Offset(cx, cy),
            )
        }
        val a1 = phase * Math.PI.toFloat() * 2f
        orb(w * 0.15f + 40f * cos(a1), h * 0.18f + 30f * sin(a1), w * 0.7f, Violet, intensity)
        orb(w * 0.88f + 36f * sin(a1), h * 0.22f, w * 0.55f, Cyan, intensity * 0.85f)
        orb(w * 0.5f, h * 0.95f + 20f * cos(a1 * 0.6f), w * 0.8f, Magenta, intensity * 0.45f)
        if (status == ConnectionStatus.CONNECTED) {
            orb(w * 0.5f, h * 0.42f, w * 0.45f, Cyan, 0.18f)
        }
    }
}
