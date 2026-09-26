package com.nimbus.vpn.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PowerSettingsNew
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Disc
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.Mist
import com.nimbus.vpn.ui.theme.Motion
import com.nimbus.vpn.ui.theme.Ring

@Composable
fun PowerOrb(
    status: ConnectionStatus,
    animate: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val haptic = LocalHapticFeedback.current
    val interaction = remember { MutableInteractionSource() }
    val pressed by interaction.collectIsPressedAsState()
    val pressScale by animateFloatAsState(
        targetValue = if (pressed) 0.94f else 1f,
        animationSpec = Motion.Press,
        label = "press",
    )
    val discScale by animateFloatAsState(
        targetValue = when (status) {
            ConnectionStatus.CONNECTING -> 0.96f
            ConnectionStatus.CONNECTED -> 1.03f
            else -> 1f
        },
        animationSpec = Motion.Soft,
        label = "disc",
    )
    val connected = status == ConnectionStatus.CONNECTED
    val discColor by animateColorAsState(
        targetValue = if (connected) Color(0xFF2A2416) else Disc,
        animationSpec = Motion.color(640),
        label = "disc-color",
    )
    val iconTint by animateColorAsState(
        targetValue = if (connected) Accent else Ink,
        animationSpec = Motion.color(420),
        label = "icon",
    )

    Box(
        modifier
            .size(236.dp)
            .graphicsLayer {
                scaleX = pressScale
                scaleY = pressScale
            }
            .clickable(
                interactionSource = interaction,
                indication = null,
            ) {
                runCatching { haptic.performHapticFeedback(HapticFeedbackType.LongPress) }
                onClick()
            },
        contentAlignment = Alignment.Center,
    ) {
        Canvas(Modifier.matchParentSize()) {
            val center = Offset(size.width / 2f, size.height / 2f)
            val outer = size.minDimension / 2f
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(
                        (if (connected) Accent else Mist).copy(alpha = 0.16f),
                        Color.Transparent,
                    ),
                    center = center,
                    radius = outer,
                ),
                radius = outer,
                center = center,
            )
            drawCircle(
                color = Ring.copy(alpha = 0.9f),
                radius = outer * 0.78f,
                center = center,
                style = Stroke(width = 1.4.dp.toPx()),
            )
        }
        if (animate && status == ConnectionStatus.CONNECTING) {
            ConnectingSweep()
        }
        if (animate && connected) {
            ConnectedRipples()
        }
        if (animate && status == ConnectionStatus.DISCONNECTED) {
            IdleBreath()
        }
        Box(
            Modifier
                .size(148.dp)
                .graphicsLayer {
                    scaleX = discScale
                    scaleY = discScale
                }
                .background(discColor, CircleShape),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                Icons.Rounded.PowerSettingsNew,
                contentDescription = "Подключить",
                tint = iconTint,
                modifier = Modifier.size(54.dp),
            )
        }
    }
}

@Composable
private fun IdleBreath() {
    val infinite = rememberInfiniteTransition(label = "idle")
    val alpha by infinite.animateFloat(
        initialValue = 0.18f,
        targetValue = 0.45f,
        animationSpec = infiniteRepeatable(tween(2400, easing = Motion.EaseInOut), RepeatMode.Reverse),
        label = "idle-a",
    )
    Canvas(Modifier.size(236.dp)) {
        val center = Offset(size.width / 2f, size.height / 2f)
        drawCircle(
            color = Mist.copy(alpha = alpha),
            radius = size.minDimension / 2f * 0.9f,
            center = center,
            style = Stroke(width = 1.6.dp.toPx()),
        )
    }
}

@Composable
private fun ConnectingSweep() {
    val infinite = rememberInfiniteTransition(label = "connect-sweep")
    val spin by infinite.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(tween(1600, easing = LinearEasing), RepeatMode.Restart),
        label = "spin",
    )
    Canvas(Modifier.size(236.dp)) {
        val center = Offset(size.width / 2f, size.height / 2f)
        val outer = size.minDimension / 2f
        val topLeft = Offset(center.x - outer * 0.9f, center.y - outer * 0.9f)
        val arc = Size(outer * 1.8f, outer * 1.8f)
        drawArc(
            color = Accent.copy(alpha = 0.35f),
            startAngle = spin - 40f,
            sweepAngle = 150f,
            useCenter = false,
            topLeft = topLeft,
            size = arc,
            style = Stroke(width = 3.dp.toPx(), cap = StrokeCap.Round),
        )
        drawArc(
            color = Accent,
            startAngle = spin,
            sweepAngle = 70f,
            useCenter = false,
            topLeft = topLeft,
            size = arc,
            style = Stroke(width = 3.6.dp.toPx(), cap = StrokeCap.Round),
        )
    }
}

@Composable
private fun ConnectedRipples() {
    val infinite = rememberInfiniteTransition(label = "connected-ripple")
    val ripple by infinite.animateFloat(
        initialValue = 0.8f,
        targetValue = 1.12f,
        animationSpec = infiniteRepeatable(tween(2600, easing = Motion.EaseOut), RepeatMode.Restart),
        label = "ripple",
    )
    val alpha by infinite.animateFloat(
        initialValue = 0.55f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(tween(2600, easing = LinearEasing), RepeatMode.Restart),
        label = "rippleA",
    )
    val ripple2 by infinite.animateFloat(
        initialValue = 0.8f,
        targetValue = 1.12f,
        animationSpec = infiniteRepeatable(
            tween(2600, delayMillis = 1100, easing = Motion.EaseOut),
            RepeatMode.Restart,
        ),
        label = "ripple2",
    )
    val alpha2 by infinite.animateFloat(
        initialValue = 0.35f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            tween(2600, delayMillis = 1100, easing = LinearEasing),
            RepeatMode.Restart,
        ),
        label = "rippleA2",
    )
    Canvas(Modifier.size(236.dp)) {
        val center = Offset(size.width / 2f, size.height / 2f)
        val outer = size.minDimension / 2f
        drawCircle(
            color = Accent.copy(alpha = 0.9f),
            radius = outer * 0.78f,
            center = center,
            style = Stroke(width = 2.dp.toPx()),
        )
        drawCircle(
            color = Accent.copy(alpha = alpha),
            radius = outer * ripple,
            center = center,
            style = Stroke(width = 1.6.dp.toPx()),
        )
        drawCircle(
            color = Mist.copy(alpha = alpha2),
            radius = outer * ripple2,
            center = center,
            style = Stroke(width = 1.3.dp.toPx()),
        )
    }
}
