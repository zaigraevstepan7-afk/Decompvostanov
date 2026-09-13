package com.nimbus.vpn.ui.home

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.ChevronRight
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.data.ConfigParser
import com.nimbus.vpn.data.ProfileIndex
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.tunnel.TunnelUiState
import com.nimbus.vpn.ui.components.MeshBackground
import com.nimbus.vpn.ui.components.PowerOrb
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.InkMuted
import com.nimbus.vpn.ui.theme.Line
import com.nimbus.vpn.ui.theme.Paper
import java.util.Locale
import java.util.concurrent.TimeUnit

@Composable
fun HomeScreen(
    state: TunnelUiState,
    profiles: ProfileIndex,
    animate: Boolean,
    onToggle: () -> Unit,
    onImport: () -> Unit,
    onSelect: (String) -> Unit,
    onDelete: (String) -> Unit,
    onSettings: () -> Unit,
) {
    Box(Modifier.fillMaxSize()) {
        MeshBackground(state.status, animate, Modifier.fillMaxSize())
        Column(
            Modifier
                .fillMaxSize()
                .statusBarsPadding(),
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 6.dp, vertical = 2.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                IconButton(onClick = onSettings) {
                    Icon(Icons.Rounded.Settings, contentDescription = "Настройки", tint = Ink)
                }
                Spacer(Modifier.weight(1f))
                IconButton(onClick = onImport) {
                    Icon(Icons.Rounded.Add, contentDescription = "Импорт", tint = Ink)
                }
            }
            Column(
                Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                PowerOrb(status = state.status, animate = animate, onClick = onToggle)
                AnimatedVisibility(visible = state.status != ConnectionStatus.DISCONNECTED || !state.error.isNullOrBlank()) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            statusLabel(state.status),
                            color = Ink,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium,
                        )
                        if (state.status == ConnectionStatus.CONNECTED) {
                            Text(
                                "${formatDuration(state.connectedSince)}  ·  ↓ ${formatRate(state.rxRate)}  ·  ↑ ${formatRate(state.txRate)}",
                                color = InkMuted,
                                fontSize = 12.sp,
                                modifier = Modifier.padding(top = 4.dp),
                            )
                        }
                        if (!state.error.isNullOrBlank()) {
                            Text(
                                state.error!!,
                                color = Ink,
                                fontSize = 13.sp,
                                modifier = Modifier.padding(horizontal = 24.dp, vertical = 6.dp),
                            )
                        }
                    }
                }
            }
            ServerSheet(
                state = state,
                profiles = profiles,
                onImport = onImport,
                onSelect = onSelect,
                onDelete = onDelete,
            )
        }
    }
}

@Composable
private fun ServerSheet(
    state: TunnelUiState,
    profiles: ProfileIndex,
    onImport: () -> Unit,
    onSelect: (String) -> Unit,
    onDelete: (String) -> Unit,
) {
    Column(
        Modifier
            .fillMaxWidth()
            .shadow(12.dp, RoundedCornerShape(topStart = 22.dp, topEnd = 22.dp), ambientColor = Color(0x14000000))
            .clip(RoundedCornerShape(topStart = 22.dp, topEnd = 22.dp))
            .background(Paper)
            .navigationBarsPadding()
            .height(340.dp),
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .clickable(onClick = onImport)
                .padding(horizontal = 18.dp, vertical = 14.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(Icons.Rounded.ChevronRight, contentDescription = null, tint = Ink, modifier = Modifier.size(22.dp))
            Text(
                "Список серверов",
                color = Ink,
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(start = 4.dp).weight(1f),
            )
            Text("${profiles.profiles.size}", color = InkMuted, fontSize = 13.sp)
        }
        HorizontalDivider(color = Line)
        if (profiles.profiles.isEmpty()) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .clickable(onClick = onImport)
                    .padding(22.dp),
            ) {
                Text("Пока пусто", color = Ink, fontWeight = FontWeight.Medium)
                Text(
                    "Нажми +, чтобы импортировать .conf — список будет здесь, как в Happ.",
                    color = InkMuted,
                    fontSize = 13.sp,
                    modifier = Modifier.padding(top = 6.dp),
                )
            }
        } else {
            Text(
                "Конфиги",
                color = Ink,
                fontWeight = FontWeight.Medium,
                fontSize = 15.sp,
                modifier = Modifier.padding(start = 20.dp, top = 12.dp, bottom = 4.dp),
            )
            LazyColumn(Modifier.fillMaxSize()) {
                items(profiles.profiles, key = { it.id }) { profile ->
                    val preview = remember(profile.rawConfig) { ConfigParser.parse(profile.rawConfig) }
                    val active = profile.id == profiles.activeId
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .clickable { onSelect(profile.id) }
                            .background(if (active) Color(0xFFF6F6F7) else Color.Transparent)
                            .padding(horizontal = 18.dp, vertical = 12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(flagForEndpoint(preview.endpoint), fontSize = 22.sp, modifier = Modifier.padding(end = 12.dp))
                        Column(Modifier.weight(1f)) {
                            Text(
                                profile.name,
                                color = Ink,
                                fontSize = 16.sp,
                                fontWeight = if (active) FontWeight.SemiBold else FontWeight.Normal,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                            Text(
                                subtitleForConfig(profile.rawConfig),
                                color = InkMuted,
                                fontSize = 12.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        if (active && state.status == ConnectionStatus.CONNECTED) {
                            Text("•", color = Ink, fontSize = 22.sp, modifier = Modifier.padding(end = 6.dp))
                        }
                        IconButton(onClick = { onDelete(profile.id) }, modifier = Modifier.size(36.dp)) {
                            Icon(Icons.Rounded.Delete, contentDescription = "Удалить", tint = InkMuted)
                        }
                    }
                    HorizontalDivider(color = Line, modifier = Modifier.padding(start = 52.dp))
                }
            }
        }
    }
}

private fun statusLabel(status: ConnectionStatus) = when (status) {
    ConnectionStatus.DISCONNECTED -> "Отключён"
    ConnectionStatus.CONNECTING -> "Подключение…"
    ConnectionStatus.CONNECTED -> "Подключён"
    ConnectionStatus.ERROR -> "Ошибка"
}

private fun formatRate(bytesPerSec: Long): String = formatBytes(bytesPerSec) + "/с"

private fun formatBytes(bytes: Long): String {
    if (bytes < 1024) return "$bytes B"
    val kb = bytes / 1024.0
    if (kb < 1024) return String.format(Locale.US, "%.1f KB", kb)
    val mb = kb / 1024.0
    if (mb < 1024) return String.format(Locale.US, "%.1f MB", mb)
    return String.format(Locale.US, "%.2f GB", mb / 1024.0)
}

private fun formatDuration(since: Long?): String {
    if (since == null) return "—"
    val sec = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - since).coerceAtLeast(0)
    val h = sec / 3600
    val m = (sec % 3600) / 60
    val s = sec % 60
    return if (h > 0) String.format(Locale.US, "%d:%02d:%02d", h, m, s)
    else String.format(Locale.US, "%02d:%02d", m, s)
}
