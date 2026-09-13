package com.nimbus.vpn.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.InkMuted
import com.nimbus.vpn.ui.theme.Paper
import com.nimbus.vpn.ui.theme.Ring

@Composable
fun PowerOrb(
    status: ConnectionStatus,
    animate: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val haptic = LocalHapticFeedback.current
    val iconTint by animateColorAsState(
        when (status) {
            ConnectionStatus.CONNECTED -> Ink
            ConnectionStatus.CONNECTING -> Ink
            ConnectionStatus.ERROR -> Ink
            ConnectionStatus.DISCONNECTED -> InkMuted
        },
        label = "icon",
    )
    val ringColor by animateColorAsState(
        when (status) {
            ConnectionStatus.CONNECTED -> Ink
            ConnectionStatus.CONNECTING -> InkMuted
            ConnectionStatus.ERROR -> Ink
            ConnectionStatus.DISCONNECTED -> Ring
        },
        label = "ring",
    )
    val spin by rememberInfiniteTransition(label = "spin").animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(tween(1600, easing = LinearEasing), RepeatMode.Restart),
        label = "spinVal",
    )
    val liveSpin = if (animate && status == ConnectionStatus.CONNECTING) spin else 0f

    Box(
        modifier
            .size(228.dp)
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
            val center = Offset(size.width / 2f, size.height / 2f)
            val outer = size.minDimension / 2f
            drawCircle(
                color = Ring.copy(alpha = 0.55f),
                radius = outer * 0.92f,
                center = center,
                style = Stroke(width = 1.5.dp.toPx()),
            )
            if (status == ConnectionStatus.CONNECTING) {
                rotate(liveSpin, center) {
                    drawArc(
                        color = Ink,
                        startAngle = -90f,
                        sweepAngle = 78f,
                        useCenter = false,
                        topLeft = Offset(center.x - outer * 0.92f, center.y - outer * 0.92f),
                        size = Size(outer * 1.84f, outer * 1.84f),
                        style = Stroke(width = 2.dp.toPx(), cap = StrokeCap.Round),
                    )
                }
            }
            if (status == ConnectionStatus.CONNECTED) {
                drawCircle(
                    color = Ink.copy(alpha = 0.18f),
                    radius = outer * 0.92f,
                    center = center,
                    style = Stroke(width = 2.dp.toPx()),
                )
            }
        }
        Box(
            Modifier
                .size(148.dp)
                .shadow(18.dp, CircleShape, ambientColor = Color(0x33000000), spotColor = Color(0x28000000))
                .background(Paper, CircleShape),
            contentAlignment = Alignment.Center,
        ) {
            Canvas(Modifier.matchParentSize()) {
                drawCircle(
                    color = ringColor,
                    radius = size.minDimension / 2f - 1.5.dp.toPx(),
                    style = Stroke(width = if (status == ConnectionStatus.CONNECTED) 2.5.dp.toPx() else 1.2.dp.toPx()),
                )
            }
            Icon(
                Icons.Rounded.PowerSettingsNew,
                contentDescription = "Подключить",
                tint = iconTint,
                modifier = Modifier.size(52.dp),
            )
        }
    }
}
