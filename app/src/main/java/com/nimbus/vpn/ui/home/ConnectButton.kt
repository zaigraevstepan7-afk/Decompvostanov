package com.nimbus.vpn.ui.home

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.PowerSettingsNew
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.components.rememberPress
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Danger
import com.nimbus.vpn.ui.theme.Motion
import com.nimbus.vpn.ui.theme.Success

private enum class ConnectGlyph { Add, Off, On }

@Composable
fun ConnectButton(
    status: ConnectionStatus,
    hasProfile: Boolean,
    animate: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val connecting = status == ConnectionStatus.CONNECTING
    val connected = status == ConnectionStatus.CONNECTED
    val failed = status == ConnectionStatus.ERROR
    val haptic = LocalHapticFeedback.current
    val press = rememberPress(0.94f)
    val discColor = when {
        connected -> Success
        failed -> Danger
        else -> Accent
    }
    val color by animateColorAsState(
        targetValue = discColor,
        animationSpec = Motion.color(640),
        label = "disc",
    )
    val infinite = rememberInfiniteTransition(label = "connect-glow")
    val breath by infinite.animateFloat(
        initialValue = 0.72f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            tween(2000, easing = Motion.EaseInOut),
            RepeatMode.Reverse,
        ),
        label = "breath",
    )
    val glow = if (animate) breath else 1f
    val glyph = when {
        !hasProfile -> ConnectGlyph.Add
        connected -> ConnectGlyph.On
        else -> ConnectGlyph.Off
    }
    Box(
        modifier
            .size(248.dp)
            .graphicsLayer {
                scaleX = press.scale
                scaleY = press.scale
            },
        contentAlignment = Alignment.Center,
    ) {
        Canvas(Modifier.matchParentSize()) {
            val center = Offset(size.width / 2f, size.height / 2f)
            val radius = size.minDimension / 2f
            drawCircle(
                brush = Brush.radialGradient(
                    0f to color.copy(alpha = 0.92f * glow),
                    0.10f to color.copy(alpha = 0.72f * glow),
                    0.24f to color.copy(alpha = 0.40f * glow),
                    0.46f to color.copy(alpha = 0.16f * glow),
                    0.72f to color.copy(alpha = 0.05f * glow),
                    1f to Color.Transparent,
                    center = center,
                    radius = radius,
                ),
                radius = radius,
                center = center,
            )
        }
        Box(
            Modifier
                .size(64.dp)
                .clip(CircleShape)
                .clickable(
                    interactionSource = press.interaction,
                    indication = null,
                    enabled = !connecting,
                    onClick = {
                        runCatching { haptic.performHapticFeedback(HapticFeedbackType.LongPress) }
                        onClick()
                    },
                ),
            contentAlignment = Alignment.Center,
        ) {
            AnimatedContent(
                targetState = glyph,
                transitionSpec = {
                    fadeIn(tween(420, easing = Motion.EaseInOut))
                        .togetherWith(fadeOut(tween(420, easing = Motion.EaseInOut)))
                },
                label = "connect-glyph",
            ) { next ->
                Icon(
                    imageVector = when (next) {
                        ConnectGlyph.Add -> Icons.Rounded.Add
                        ConnectGlyph.On -> Icons.Rounded.Check
                        ConnectGlyph.Off -> Icons.Rounded.PowerSettingsNew
                    },
                    contentDescription = when (next) {
                        ConnectGlyph.Add -> "Создать сервер"
                        ConnectGlyph.On -> "Отключить"
                        ConnectGlyph.Off -> "Подключить"
                    },
                    tint = Color.White,
                    modifier = Modifier.size(30.dp),
                )
            }
        }
    }
}
