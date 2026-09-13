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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.theme.Disc
import com.nimbus.vpn.ui.theme.Ink
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
        targetValue = if (pressed) 0.96f else 1f,
        animationSpec = spring(dampingRatio = 0.78f, stiffness = 500f),
        label = "press",
    )
    val fill by animateColorAsState(
        targetValue = if (status == ConnectionStatus.CONNECTED) Color(0xFF1F1F22) else Disc,
        animationSpec = tween(320),
        label = "fill",
    )
    val iconTint by animateColorAsState(
        targetValue = when (status) {
            ConnectionStatus.DISCONNECTED -> Color(0xFFD8D8DC)
            ConnectionStatus.CONNECTING -> Ink
            ConnectionStatus.CONNECTED -> Ink
            ConnectionStatus.ERROR -> Ink
        },
        label = "icon",
    )
    val infinite = rememberInfiniteTransition(label = "happ-power")
    val spin by infinite.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(tween(1100, easing = LinearEasing), RepeatMode.Restart),
        label = "spin",
    )
    val ripple by infinite.animateFloat(
        initialValue = 0.82f,
        targetValue = 1.12f,
        animationSpec = infiniteRepeatable(tween(1700, easing = FastOutSlowInEasing), RepeatMode.Restart),
        label = "ripple",
    )
    val rippleAlpha by infinite.animateFloat(
        initialValue = 0.28f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(tween(1700, easing = LinearEasing), RepeatMode.Restart),
        label = "rippleA",
    )
    val liveSpin = if (animate && status == ConnectionStatus.CONNECTING) spin else 0f
    val showRipple = animate && status == ConnectionStatus.CONNECTED

    Box(
        modifier
            .size(220.dp)
            .scale(pressScale)
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
            drawCircle(
                color = Ring.copy(alpha = 0.9f),
                radius = outer * 0.78f,
                center = center,
                style = Stroke(width = 1.2.dp.toPx()),
            )
            drawCircle(
                color = Ring.copy(alpha = 0.45f),
                radius = outer * 0.92f,
                center = center,
                style = Stroke(width = 1.dp.toPx()),
            )
            if (showRipple) {
                drawCircle(
                    color = Ink.copy(alpha = rippleAlpha),
                    radius = outer * ripple,
                    center = center,
                    style = Stroke(width = 2.dp.toPx()),
                )
            }
            if (status == ConnectionStatus.CONNECTED) {
                drawCircle(
                    color = Ink.copy(alpha = 0.95f),
                    radius = outer * 0.78f,
                    center = center,
                    style = Stroke(width = 2.4.dp.toPx()),
                )
            }
            if (status == ConnectionStatus.CONNECTING) {
                rotate(liveSpin, center) {
                    val diameter = outer * 1.84f
                    drawArc(
                        brush = Brush.sweepGradient(
                            colorStops = arrayOf(
                                0.00f to Color.Transparent,
                                0.55f to Color.Transparent,
                                0.78f to Ink.copy(alpha = 0.15f),
                                1.00f to Ink,
                            ),
                            center = center,
                        ),
                        startAngle = 0f,
                        sweepAngle = 360f,
                        useCenter = false,
                        topLeft = Offset(center.x - outer * 0.92f, center.y - outer * 0.92f),
                        size = Size(diameter, diameter),
                        style = Stroke(width = 3.2.dp.toPx(), cap = StrokeCap.Round),
                    )
                }
            }
        }
        Box(
            Modifier
                .size(148.dp)
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
