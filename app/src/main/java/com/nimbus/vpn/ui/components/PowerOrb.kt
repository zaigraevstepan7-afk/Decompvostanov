package com.nimbus.vpn.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.theme.Canvas
import com.nimbus.vpn.ui.theme.Ink

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
        animationSpec = spring(dampingRatio = 0.72f, stiffness = 380f),
        label = "press",
    )
    val connectedScale by animateFloatAsState(
        targetValue = if (status == ConnectionStatus.CONNECTED) 1.04f else 1f,
        animationSpec = tween(480, easing = FastOutSlowInEasing),
        label = "connectedScale",
    )
    val iconTint by animateColorAsState(
        when (status) {
            ConnectionStatus.DISCONNECTED -> Color(0xFF2A2A2A)
            else -> Canvas
        },
        label = "icon",
    )
    val fill by animateColorAsState(
        when (status) {
            ConnectionStatus.CONNECTED -> Ink
            ConnectionStatus.CONNECTING -> Ink
            ConnectionStatus.ERROR -> Ink
            ConnectionStatus.DISCONNECTED -> Ink
        },
        label = "fill",
    )
    val infinite = rememberInfiniteTransition(label = "power")
    val spin by infinite.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(tween(1400, easing = LinearEasing), RepeatMode.Restart),
        label = "spin",
    )
    val pulse by infinite.animateFloat(
        initialValue = 0.88f,
        targetValue = 1.08f,
        animationSpec = infiniteRepeatable(tween(1600, easing = FastOutSlowInEasing), RepeatMode.Reverse),
        label = "pulse",
    )
    val liveSpin = if (animate && status == ConnectionStatus.CONNECTING) spin else 0f
    val livePulse = if (animate && status == ConnectionStatus.CONNECTED) pulse else 1f

    Box(
        modifier
            .size(300.dp)
            .scale(pressScale * connectedScale)
            .clickable(
                interactionSource = interaction,
                indication = null,
            ) {
                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                onClick()
            },
        contentAlignment = Alignment.Center,
    ) {
        Canvas(Modifier.matchParentSize()) {
            val center = Offset(size.width / 2f, size.height / 2f)
            val outer = size.minDimension / 2f
            if (status == ConnectionStatus.CONNECTED && animate) {
                drawCircle(
                    color = Ink.copy(alpha = 0.10f * livePulse),
                    radius = outer * 0.98f * livePulse,
                    center = center,
                )
                drawCircle(
                    color = Ink.copy(alpha = 0.18f),
                    radius = outer * 0.78f * livePulse,
                    center = center,
                    style = Stroke(width = 2.dp.toPx()),
                )
            } else {
                drawCircle(
                    color = Ink.copy(alpha = 0.12f),
                    radius = outer * 0.92f,
                    center = center,
                    style = Stroke(width = 1.4.dp.toPx()),
                )
            }
            if (status == ConnectionStatus.CONNECTING) {
                rotate(liveSpin, center) {
                    drawArc(
                        color = Ink,
                        startAngle = -90f,
                        sweepAngle = 96f,
                        useCenter = false,
                        topLeft = Offset(center.x - outer * 0.9f, center.y - outer * 0.9f),
                        size = Size(outer * 1.8f, outer * 1.8f),
                        style = Stroke(width = 3.5.dp.toPx(), cap = StrokeCap.Round),
                    )
                }
                rotate(liveSpin * -0.6f, center) {
                    drawArc(
                        color = Ink.copy(alpha = 0.35f),
                        startAngle = 40f,
                        sweepAngle = 70f,
                        useCenter = false,
                        topLeft = Offset(center.x - outer * 0.78f, center.y - outer * 0.78f),
                        size = Size(outer * 1.56f, outer * 1.56f),
                        style = Stroke(width = 2.dp.toPx(), cap = StrokeCap.Round),
                    )
                }
            }
        }
        Box(
            Modifier
                .size(208.dp)
                .shadow(
                    if (status == ConnectionStatus.CONNECTED) 28.dp else 18.dp,
                    CircleShape,
                    ambientColor = Color(0x66FFFFFF),
                    spotColor = Color(0x44FFFFFF),
                )
                .background(fill, CircleShape),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                Icons.Rounded.PowerSettingsNew,
                contentDescription = "Подключить",
                tint = iconTint,
                modifier = Modifier.size(78.dp),
            )
        }
    }
}
