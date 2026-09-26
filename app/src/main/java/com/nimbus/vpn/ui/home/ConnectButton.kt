package com.nimbus.vpn.ui.home

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
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
import com.nimbus.vpn.ui.components.rememberPress
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Canvas
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
    val press = rememberPress(0.9f)
    val discColor = when {
        connected -> Success
        failed -> Danger
        else -> Accent
    }
    val color by animateColorAsState(
        targetValue = discColor,
        animationSpec = Motion.color(720),
        label = "disc",
    )
    val connectMix by animateFloatAsState(
        targetValue = if (connecting) 1f else 0f,
        animationSpec = Motion.float(520),
        label = "connect-mix",
    )
    val liveMix by animateFloatAsState(
        targetValue = if (connected) 1f else 0f,
        animationSpec = Motion.float(680),
        label = "live-mix",
    )
    val idleMix by animateFloatAsState(
        targetValue = if (!connecting && !connected) 1f else 0f,
        animationSpec = Motion.float(520),
        label = "idle-mix",
    )
    val bloom = remember { Animatable(1f) }
    LaunchedEffect(connected) {
        if (connected) {
            bloom.snapTo(0.88f)
            bloom.animateTo(1f, spring(dampingRatio = 0.48f, stiffness = 240f))
        } else {
            bloom.animateTo(1f, Motion.Soft)
        }
    }
    val infinite = rememberInfiniteTransition(label = "connect-motion")
    val spin by infinite.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(tween(1280, easing = LinearEasing), RepeatMode.Restart),
        label = "spin",
    )
    val breath by infinite.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(1800, easing = Motion.EaseInOut), RepeatMode.Reverse),
        label = "breath",
    )
    val ripple by infinite.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(2100, easing = Motion.EaseOut), RepeatMode.Restart),
        label = "ripple",
    )
    val motion = if (animate) 1f else 0f
    val glyph = when {
        !hasProfile -> ConnectGlyph.Add
        connected -> ConnectGlyph.On
        else -> ConnectGlyph.Off
    }
    Box(
        modifier
            .size(168.dp)
            .graphicsLayer {
                val s = press.scale * bloom.value
                scaleX = s
                scaleY = s
            },
        contentAlignment = Alignment.Center,
    ) {
        Canvas(Modifier.matchParentSize()) {
            val center = Offset(size.width / 2f, size.height / 2f)
            val disc = size.minDimension * 0.29f
            drawCircle(
                color = color.copy(alpha = (0.10f + 0.08f * breath * motion) * (0.45f + liveMix)),
                radius = disc * (1.7f + 0.18f * breath * idleMix),
                center = center,
            )
            drawCircle(
                color = color.copy(alpha = 0.30f * idleMix),
                radius = disc * (1.28f + 0.08f * breath * motion),
                center = center,
                style = Stroke(width = 1.5.dp.toPx()),
            )
            val arc = disc * 2.42f
            val arcTop = Offset(center.x - arc / 2f, center.y - arc / 2f)
            val arcSize = Size(arc, arc)
            drawArc(
                color = color.copy(alpha = 0.18f * connectMix),
                startAngle = 0f,
                sweepAngle = 360f,
                useCenter = false,
                topLeft = arcTop,
                size = arcSize,
                style = Stroke(width = 2.dp.toPx(), cap = StrokeCap.Round),
            )
            drawArc(
                color = color.copy(alpha = connectMix),
                startAngle = if (motion > 0f) spin else -20f,
                sweepAngle = 70f + 18f * connectMix,
                useCenter = false,
                topLeft = arcTop,
                size = arcSize,
                style = Stroke(width = 3.4.dp.toPx(), cap = StrokeCap.Round),
            )
            fun rippleRing(phase: Float) {
                val p = ((phase % 1f) + 1f) % 1f
                drawCircle(
                    color = Success.copy(alpha = (1f - p) * 0.42f * liveMix * motion),
                    radius = disc * (1.2f + 0.85f * p),
                    center = center,
                    style = Stroke(width = 1.7.dp.toPx()),
                )
            }
            rippleRing(ripple)
            rippleRing(ripple + 0.5f)
            drawCircle(
                color = Color.White.copy(alpha = 0.55f * liveMix),
                radius = disc * 1.16f,
                center = center,
                style = Stroke(width = 1.8.dp.toPx()),
            )
        }
        Box(
            Modifier
                .size(100.dp)
                .shadow(16.dp, CircleShape, clip = false, ambientColor = color.copy(alpha = 0.28f), spotColor = color.copy(alpha = 0.22f))
                .clip(CircleShape)
                .background(color)
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
                    (fadeIn(tween(460, easing = Motion.EaseInOut)) +
                        scaleIn(tween(520, easing = Motion.EaseOut), initialScale = 0.68f))
                        .togetherWith(
                            fadeOut(tween(260, easing = Motion.EaseInOut)) +
                                scaleOut(tween(260), targetScale = 0.84f),
                        )
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
                    tint = Canvas,
                    modifier = Modifier.size(44.dp),
                )
            }
        }
    }
}
