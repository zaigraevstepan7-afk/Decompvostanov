package com.nimbus.vpn.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PowerSettingsNew
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.theme.Cyan
import com.nimbus.vpn.ui.theme.Danger
import com.nimbus.vpn.ui.theme.Night
import com.nimbus.vpn.ui.theme.Success
import com.nimbus.vpn.ui.theme.Violet

@Composable
fun PowerOrb(
    status: ConnectionStatus,
    animate: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val haptic = LocalHapticFeedback.current
    val accent by animateColorAsState(
        when (status) {
            ConnectionStatus.CONNECTED -> Success
            ConnectionStatus.CONNECTING -> Violet
            ConnectionStatus.ERROR -> Danger
            ConnectionStatus.DISCONNECTED -> Cyan
        },
        label = "accent",
    )
    val pulseTransition = rememberInfiniteTransition(label = "pulse")
    val pulse by pulseTransition.animateFloat(
        initialValue = 0.92f,
        targetValue = 1.08f,
        animationSpec = infiniteRepeatable(
            tween(if (status == ConnectionStatus.CONNECTING) 700 else 2200, easing = FastOutSlowInEasing),
            RepeatMode.Reverse,
        ),
        label = "pulseVal",
    )
    val spin by pulseTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(tween(1400, easing = LinearEasing)),
        label = "spin",
    )
    val scale by animateFloatAsState(
        targetValue = if (status == ConnectionStatus.CONNECTED) 1.04f else 1f,
        label = "scale",
    )
    val livePulse = if (animate) pulse else 1f
    val liveSpin = if (animate) spin else 0f

    Box(
        modifier
            .size(220.dp)
            .scale(scale)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
            ) {
                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                onClick()
            },
        contentAlignment = Alignment.Center,
    ) {
        Canvas(Modifier.matchParentSize()) {
            val radius = size.minDimension / 2f
            val center = Offset(size.width / 2f, size.height / 2f)
            drawCircle(
                brush = Brush.radialGradient(
                    listOf(accent.copy(alpha = 0.28f * livePulse), accent.copy(alpha = 0f)),
                    center = center,
                    radius = radius,
                ),
            )
            drawCircle(
                color = Night.copy(alpha = 0.92f),
                radius = radius * 0.42f,
                center = center,
            )
            drawCircle(
                brush = Brush.linearGradient(listOf(accent, Violet)),
                radius = radius * 0.42f,
                center = center,
                style = Stroke(width = 5.dp.toPx()),
            )
            if (status == ConnectionStatus.CONNECTING || status == ConnectionStatus.CONNECTED) {
                rotate(liveSpin, center) {
                    drawArc(
                        color = accent,
                        startAngle = -20f,
                        sweepAngle = 110f,
                        useCenter = false,
                        topLeft = Offset(center.x - radius * 0.55f, center.y - radius * 0.55f),
                        size = Size(radius * 1.1f, radius * 1.1f),
                        style = Stroke(width = 4.dp.toPx(), cap = StrokeCap.Round),
                    )
                }
            }
            if (status != ConnectionStatus.DISCONNECTED) {
                drawCircle(
                    color = accent.copy(alpha = 0.12f),
                    radius = radius * 0.62f * livePulse,
                    center = center,
                    style = Stroke(width = 2.dp.toPx()),
                )
            }
        }
        Icon(
            Icons.Rounded.PowerSettingsNew,
            contentDescription = "Подключить",
            tint = accent,
            modifier = Modifier.size(54.dp),
        )
    }
}
