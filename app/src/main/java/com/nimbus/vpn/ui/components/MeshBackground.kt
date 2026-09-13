package com.nimbus.vpn.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.nimbus.vpn.R
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.theme.Canvas

@Composable
fun MeshBackground(
    status: ConnectionStatus,
    animate: Boolean,
    modifier: Modifier = Modifier,
) {
    val mapAlpha = when {
        !animate -> 0.16f
        status == ConnectionStatus.CONNECTED -> 0.28f
        status == ConnectionStatus.CONNECTING -> 0.22f
        else -> 0.18f
    }
    Box(modifier.background(Canvas)) {
        Image(
            painter = painterResource(R.drawable.world_map),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .offset(y = (-36).dp)
                .alpha(mapAlpha),
        )
        Box(Modifier.fillMaxSize())
    }
}
