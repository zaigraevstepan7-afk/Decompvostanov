package com.nimbus.vpn.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.theme.Canvas

@Composable
fun MeshBackground(
    status: ConnectionStatus,
    animate: Boolean,
    modifier: Modifier = Modifier,
) {
    Box(modifier.background(Canvas))
}
