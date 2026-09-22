package com.nimbus.vpn.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Canvas as CanvasColor
import com.nimbus.vpn.ui.theme.Danger
import com.nimbus.vpn.ui.theme.Motion
import com.nimbus.vpn.ui.theme.Success

@Composable
fun MeshBackground(
    status: ConnectionStatus,
    animate: Boolean,
    modifier: Modifier = Modifier,
) {
    val wash by animateColorAsState(
        targetValue = when (status) {
            ConnectionStatus.CONNECTED -> Success.copy(alpha = 0.16f)
            ConnectionStatus.CONNECTING -> Accent.copy(alpha = 0.12f)
            ConnectionStatus.ERROR -> Danger.copy(alpha = 0.12f)
            ConnectionStatus.DISCONNECTED -> Color.Transparent
        },
        animationSpec = Motion.color(if (animate) 900 else 1),
        label = "wash",
    )
    Canvas(modifier.fillMaxSize()) {
        drawRect(CanvasColor)
        val center = Offset(size.width / 2f, size.height * 0.92f)
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(wash, Color.Transparent),
                center = center,
                radius = size.minDimension * 0.85f,
            ),
            radius = size.minDimension * 0.85f,
            center = center,
        )
    }
}
