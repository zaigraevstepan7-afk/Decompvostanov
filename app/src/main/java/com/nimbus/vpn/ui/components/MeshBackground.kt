package com.nimbus.vpn.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.theme.Canvas as CanvasColor
import com.nimbus.vpn.ui.theme.Paper

@Composable
fun MeshBackground(
    status: ConnectionStatus,
    animate: Boolean,
    modifier: Modifier = Modifier,
) {
    Canvas(modifier = modifier.background(CanvasColor)) {
        drawRect(CanvasColor)
        val highlight = if (status == ConnectionStatus.CONNECTED) 0.55f else 0.35f
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(Paper.copy(alpha = highlight), Color.Transparent),
                center = Offset(size.width * 0.5f, size.height * 0.18f),
                radius = size.minDimension * 0.55f,
            ),
        )
        if (animate) {
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(Color.White.copy(alpha = 0.5f), Color.Transparent),
                    center = Offset(size.width * 0.82f, size.height * 0.08f),
                    radius = size.minDimension * 0.35f,
                ),
            )
        }
    }
}
