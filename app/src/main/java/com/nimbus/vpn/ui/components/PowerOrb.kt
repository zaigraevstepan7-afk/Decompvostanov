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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.theme.Disc
import com.nimbus.vpn.ui.theme.Ink
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
            ConnectionStatus.CONNECTED -> 1.02f
            else -> 1f
        },
        animationSpec = Motion.Soft,
        label = "disc",
    )
    val fill by animateColorAsState(
        targetValue = if (status == ConnectionStatus.CONNECTED) Color(0xFF242428) else Disc,
        animationSpec = Motion.color(480),
        label = "fill",
    )
    val iconTint by animateColorAsState(
        targetValue = when (status) {
            ConnectionStatus.DISCONNECTED -> Color(0xFFD0D0D4)
            else -> Ink
        },
        animationSpec = Motion.color(360),
        label = "icon",
    )

    Box(
        modifier
            .size(220.dp)
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
                color = Ring.copy(alpha = 0.55f),
                radius = outer * 0.92f,
                center = center,
                style = Stroke(width = 1.dp.toPx()),
            )
            drawCircle(
                color = Ring.copy(alpha = 0.9f),
                radius = outer * 0.78f,
                center = center,
                style = Stroke(width = 1.2.dp.toPx()),
            )
        }
        if (animate && status == ConnectionStatus.CONNECTING) {
            ConnectingSweep()
        }
        if (animate && status == ConnectionStatus.CONNECTED) {
            ConnectedRipples()
        }
        Box(
            Modifier
                .size(148.dp)
                .graphicsLayer {
                    scaleX = discScale
                    scaleY = discScale
                }
                .background(fill, CircleShape),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                Icons.Rounded.PowerSettingsNew,
                contentDescription = "Подключить",
                tint = iconTint,
                modifier = Modifier.size(56.dp),
            )
        }
    }
}

@Composable
private fun ConnectingSweep() {
    val infinite = rememberInfiniteTransition(label = "connect-sweep")
    val spin by infinite.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            tween(1400, easing = LinearEasing),
            RepeatMode.Restart,
        ),
        label = "spin",
    )
    val breath by infinite.animateFloat(
        initialValue = 0.12f,
        targetValue = 0.28f,
        animationSpec = infiniteRepeatable(
            tween(900, easing = Motion.EaseInOut),
            RepeatMode.Reverse,
        ),
        label = "breath",
    )
    Canvas(Modifier.size(220.dp)) {
        val center = Offset(size.width / 2f, size.height / 2f)
        val outer = size.minDimension / 2f
        val diameter = outer * 1.84f
        val topLeft = Offset(center.x - outer * 0.92f, center.y - outer * 0.92f)
        val arcSize = Size(diameter, diameter)
        drawArc(
            color = Ink.copy(alpha = breath),
            startAngle = spin - 70f,
            sweepAngle = 110f,
            useCenter = false,
            topLeft = topLeft,
            size = arcSize,
            style = Stroke(width = 3.dp.toPx(), cap = StrokeCap.Round),
        )
        drawArc(
            color = Ink,
            startAngle = spin,
            sweepAngle = 72f,
            useCenter = false,
            topLeft = topLeft,
            size = arcSize,
            style = Stroke(width = 3.4.dp.toPx(), cap = StrokeCap.Round),
        )
    }
}

@Composable
private fun ConnectedRipples() {
    val infinite = rememberInfiniteTransition(label = "connected-ripple")
    val ripple by infinite.animateFloat(
        initialValue = 0.78f,
        targetValue = 1.14f,
        animationSpec = infiniteRepeatable(
            tween(2200, easing = Motion.EaseOut),
            RepeatMode.Restart,
        ),
        label = "ripple",
    )
    val alpha by infinite.animateFloat(
        initialValue = 0.34f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            tween(2200, easing = LinearEasing),
            RepeatMode.Restart,
        ),
        label = "rippleA",
    )
    val ripple2 by infinite.animateFloat(
        initialValue = 0.78f,
        targetValue = 1.14f,
        animationSpec = infiniteRepeatable(
            tween(2200, delayMillis = 900, easing = Motion.EaseOut),
            RepeatMode.Restart,
        ),
        label = "ripple2",
    )
    val alpha2 by infinite.animateFloat(
        initialValue = 0.22f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            tween(2200, delayMillis = 900, easing = LinearEasing),
            RepeatMode.Restart,
        ),
        label = "rippleA2",
    )
    Canvas(Modifier.size(220.dp)) {
        val center = Offset(size.width / 2f, size.height / 2f)
        val outer = size.minDimension / 2f
        drawCircle(
            color = Ink.copy(alpha = 0.95f),
            radius = outer * 0.78f,
            center = center,
            style = Stroke(width = 2.2.dp.toPx()),
        )
        drawCircle(
            color = Ink.copy(alpha = alpha),
            radius = outer * ripple,
            center = center,
            style = Stroke(width = 1.8.dp.toPx()),
        )
        drawCircle(
            color = Ink.copy(alpha = alpha2),
            radius = outer * ripple2,
            center = center,
            style = Stroke(width = 1.4.dp.toPx()),
        )
    }
}
