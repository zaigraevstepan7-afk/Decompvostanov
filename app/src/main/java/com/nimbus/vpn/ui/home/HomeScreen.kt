package com.nimbus.vpn.ui.home

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.ShieldMoon
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.data.ConfigParser
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.tunnel.RootPowerManager
import com.nimbus.vpn.tunnel.TunnelUiState
import com.nimbus.vpn.ui.components.GlassCard
import com.nimbus.vpn.ui.components.MeshBackground
import com.nimbus.vpn.ui.components.PowerOrb
import com.nimbus.vpn.ui.theme.Cyan
import com.nimbus.vpn.ui.theme.Danger
import com.nimbus.vpn.ui.theme.TextMuted
import com.nimbus.vpn.ui.theme.TextPrimary
import com.nimbus.vpn.ui.theme.Violet
import java.util.Locale
import java.util.concurrent.TimeUnit

@Composable
fun HomeScreen(
    state: TunnelUiState,
    root: RootPowerManager.Status,
    animate: Boolean,
    onToggle: () -> Unit,
    onImport: () -> Unit,
    onProfiles: () -> Unit,
    onSettings: () -> Unit,
) {
    val preview = remember(state.profile?.rawConfig) {
        state.profile?.let { ConfigParser.parse(it.rawConfig) }
    }
    Box(Modifier.fillMaxSize()) {
        MeshBackground(state.status, animate, Modifier.fillMaxSize())
        Column(
            Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 22.dp, vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Column(Modifier.weight(1f)) {
                    Text("NIMBUS", color = Cyan, letterSpacing = 4.sp, fontSize = 13.sp, fontWeight = FontWeight.Medium)
                    Text("AmneziaWG", color = TextMuted, fontSize = 13.sp)
                }
                IconButton(onClick = onProfiles) {
                    Icon(Icons.Rounded.ShieldMoon, contentDescription = "Профили", tint = TextPrimary)
                }
                IconButton(onClick = onSettings) {
                    Icon(Icons.Rounded.Settings, contentDescription = "Настройки", tint = TextPrimary)
                }
            }
            Spacer(Modifier.height(12.dp))
            PowerOrb(status = state.status, animate = animate, onClick = onToggle)
            AnimatedContent(
                targetState = statusLabel(state.status),
                transitionSpec = { fadeIn() togetherWith fadeOut() },
                label = "status",
            ) { label ->
                Text(label, color = TextPrimary, fontSize = 28.sp, fontWeight = FontWeight.SemiBold)
            }
            Text(
                state.profile?.name ?: "Нет конфига",
                color = TextMuted,
                modifier = Modifier.padding(top = 6.dp),
            )
            Spacer(Modifier.height(22.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                StatChip(Modifier.weight(1f), "↓", formatRate(state.rxRate), formatBytes(state.rxTotal))
                StatChip(Modifier.weight(1f), "↑", formatRate(state.txRate), formatBytes(state.txTotal))
            }
            Spacer(Modifier.height(12.dp))
            GlassCard(Modifier.fillMaxWidth()) {
                Column(Modifier.padding(18.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    InfoRow("Сервер", preview?.endpoint ?: "—")
                    InfoRow("Адрес", preview?.interfaceAddress ?: "—")
                    InfoRow("Протокол", if (preview?.isAmnezia == true) "AmneziaWG" else "WireGuard")
                    InfoRow("Сессия", formatDuration(state.connectedSince))
                    InfoRow("Root", if (root.rooted) "да · фон без удушения" else "нет · VpnService")
                    if (!state.error.isNullOrBlank()) {
                        Text(state.error!!, color = Danger, fontSize = 13.sp)
                    }
                }
            }
            Spacer(Modifier.height(16.dp))
            GlassCard(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 28.dp),
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Column(Modifier.weight(1f)) {
                        Text("Импорт .conf", color = TextPrimary, fontWeight = FontWeight.Medium)
                        Text("Файл или вставка AmneziaWG", color = TextMuted, fontSize = 13.sp)
                    }
                    IconButton(onClick = onImport) {
                        Icon(Icons.Rounded.Add, contentDescription = "Импорт", tint = Cyan)
                    }
                }
            }
        }
    }
}

@Composable
private fun StatChip(modifier: Modifier, label: String, rate: String, total: String) {
    GlassCard(modifier) {
        Column(Modifier.padding(16.dp)) {
            Text(label, color = Violet, fontSize = 12.sp)
            Text(rate, color = TextPrimary, fontSize = 18.sp, fontWeight = FontWeight.Medium)
            Text(total, color = TextMuted, fontSize = 12.sp)
        }
    }
}

@Composable
private fun InfoRow(label: String, value: String) {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Text(label, color = TextMuted, fontSize = 13.sp)
        Text(value, color = TextPrimary, fontSize = 13.sp, fontWeight = FontWeight.Medium)
    }
}

private fun statusLabel(status: ConnectionStatus) = when (status) {
    ConnectionStatus.DISCONNECTED -> "Отключён"
    ConnectionStatus.CONNECTING -> "Подключение"
    ConnectionStatus.CONNECTED -> "В сети"
    ConnectionStatus.ERROR -> "Ошибка"
}

private fun formatRate(bytesPerSec: Long): String = "${formatBytes(bytesPerSec)}/с"

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
