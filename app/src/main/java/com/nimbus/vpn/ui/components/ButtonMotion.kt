package com.nimbus.vpn.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import com.nimbus.vpn.ui.theme.Motion

class PressMotion(
    val interaction: MutableInteractionSource,
    val scale: Float,
)

@Composable
fun rememberPress(to: Float = 0.9f): PressMotion {
    val interaction = remember { MutableInteractionSource() }
    val pressed by interaction.collectIsPressedAsState()
    val scale by animateFloatAsState(
        targetValue = if (pressed) to else 1f,
        animationSpec = Motion.Press,
        label = "press",
    )
    return PressMotion(interaction, scale)
}

fun Modifier.pressScale(scale: Float): Modifier = graphicsLayer {
    scaleX = scale
    scaleY = scale
}
