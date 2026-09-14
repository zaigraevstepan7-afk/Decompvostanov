package com.nimbus.vpn.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.nimbus.vpn.R
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.theme.Canvas
import com.nimbus.vpn.ui.theme.Motion

@Composable
fun MeshBackground(
    status: ConnectionStatus,
    animate: Boolean,
    modifier: Modifier = Modifier,
) {
    val target = when {
        !animate -> 0.14f
        status == ConnectionStatus.CONNECTED -> 0.30f
        status == ConnectionStatus.CONNECTING -> 0.23f
        else -> 0.17f
    }
    val mapAlpha by animateFloatAsState(
        targetValue = target,
        animationSpec = Motion.float(700),
        label = "map-alpha",
    )
    Box(modifier.background(Canvas)) {
        Image(
            painter = painterResource(R.drawable.world_map),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .offset(y = (-36).dp)
                .graphicsLayer { alpha = mapAlpha },
        )
        Box(Modifier.fillMaxSize())
    }
}
