package com.nimbus.vpn.ui.theme

import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.IntOffset

object Motion {
    val EaseOut = CubicBezierEasing(0.22f, 1f, 0.36f, 1f)
    val EaseInOut = CubicBezierEasing(0.44f, 0.05f, 0.16f, 1f)

    fun fade(ms: Int = 360) = tween<Float>(durationMillis = ms, easing = EaseOut)
    fun offset(ms: Int = 420) = tween<IntOffset>(durationMillis = ms, easing = EaseOut)
    fun color(ms: Int = 520) = tween<Color>(durationMillis = ms, easing = EaseInOut)
    fun float(ms: Int = 520) = tween<Float>(durationMillis = ms, easing = EaseInOut)

    val Press = spring<Float>(
        dampingRatio = 0.68f,
        stiffness = 380f,
    )
    val Soft = spring<Float>(
        dampingRatio = Spring.DampingRatioNoBouncy,
        stiffness = 220f,
    )
}
