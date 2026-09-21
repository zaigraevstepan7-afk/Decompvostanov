package com.nimbus.vpn.ui.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Canvas
import com.nimbus.vpn.ui.theme.Mist
import com.nimbus.vpn.ui.theme.Motion
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun MeshBackground(
    status: ConnectionStatus,
    animate: Boolean,
    modifier: Modifier = Modifier,
) {
    val glow by animateFloatAsState(
        targetValue = when (status) {
            ConnectionStatus.CONNECTED -> 1f
            ConnectionStatus.CONNECTING -> 0.72f
            ConnectionStatus.ERROR -> 0.35f
            ConnectionStatus.DISCONNECTED -> 0.45f
        },
        animationSpec = Motion.float(900),
        label = "glow",
    )
    Box(modifier) {
        if (animate) {
            DriftingAurora(glow = glow, status = status)
        } else {
            AuroraLayer(phase = 0.2f, glow = glow * 0.55f, status = status)
        }
    }
}

@Composable
private fun DriftingAurora(glow: Float, status: ConnectionStatus) {
    val drift = rememberInfiniteTransition(label = "aurora")
    val phase by drift.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            tween(durationMillis = 18_000, easing = LinearEasing),
            RepeatMode.Restart,
        ),
        label = "phase",
    )
    AuroraLayer(phase = phase, glow = glow, status = status)
}

@Composable
private fun AuroraLayer(phase: Float, glow: Float, status: ConnectionStatus) {
    val warm = if (status == ConnectionStatus.ERROR) Color(0xFFFF8D7A) else Accent
    Canvas(Modifier.fillMaxSize()) {
        drawRect(Canvas)
        val angle = phase * (PI * 2).toFloat()
        val w = size.width
        val h = size.height
        blob(
            center = Offset(
                w * (0.22f + 0.08f * sin(angle)),
                h * (0.22f + 0.04f * cos(angle)),
            ),
            radius = w * 0.72f,
            color = Mist.copy(alpha = 0.22f * glow),
        )
        blob(
            center = Offset(
                w * (0.82f + 0.06f * cos(angle * 0.8f)),
                h * (0.62f + 0.05f * sin(angle * 0.8f)),
            ),
            radius = w * 0.78f,
            color = warm.copy(alpha = 0.16f * glow),
        )
        blob(
            center = Offset(w * 0.5f, h * (0.42f + 0.03f * sin(angle * 1.3f))),
            radius = w * 0.42f,
            color = Color.White.copy(alpha = 0.04f * glow),
        )
    }
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.blob(
    center: Offset,
    radius: Float,
    color: Color,
) {
    drawCircle(
        brush = Brush.radialGradient(
            colors = listOf(color, Color.Transparent),
            center = center,
            radius = radius,
        ),
        radius = radius,
        center = center,
    )
}
