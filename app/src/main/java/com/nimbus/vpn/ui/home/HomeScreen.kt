package com.nimbus.vpn.ui.home

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.data.ConfigParser
import com.nimbus.vpn.data.ProfileIndex
import com.nimbus.vpn.data.VpnProfile
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.tunnel.TunnelUiState
import com.nimbus.vpn.ui.AccessStatus
import com.nimbus.vpn.ui.AccessUiState
import com.nimbus.vpn.ui.ServerPingState
import com.nimbus.vpn.ui.components.ConfirmDeleteDialog
import com.nimbus.vpn.ui.components.DeleteServerButton
import com.nimbus.vpn.ui.components.MeshBackground
import com.nimbus.vpn.ui.components.PowerOrb
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Danger
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.InkMuted
import com.nimbus.vpn.ui.theme.Motion
import com.nimbus.vpn.ui.theme.Success
import kotlinx.coroutines.delay
import java.util.Locale
import java.util.concurrent.TimeUnit

private val RowShape = RoundedCornerShape(16.dp)
private val Glass = Color(0x66101418)

@Composable
fun HomeScreen(
    state: TunnelUiState,
    profiles: ProfileIndex,
    access: AccessUiState,
    animate: Boolean,
    onToggle: () -> Unit,
    onCreateWarp: () -> Unit,
    onImport: () -> Unit,
    onSelect: (String) -> Unit,
    onDelete: (String) -> Unit,
    onSettings: () -> Unit,
    onConfirmAccess: () -> Unit,
    ping: ServerPingState,
    onPing: () -> Unit,
) {
    var now by remember { mutableLongStateOf(System.currentTimeMillis()) }
    var pendingDelete by remember { mutableStateOf<Pair<String, String>?>(null) }
    LaunchedEffect(state.status) {
        if (state.status != ConnectionStatus.CONNECTED) return@LaunchedEffect
        while (true) {
            now = System.currentTimeMillis()
            delay(1000)
        }
    }
    val active = profiles.profiles.firstOrNull { it.id == profiles.activeId } ?: state.profile
    val endpoint = remember(active?.rawConfig) { active?.rawConfig?.let(ConfigParser::endpointOf) }
    val busy = state.status == ConnectionStatus.CONNECTING

    Box(Modifier.fillMaxSize()) {
        MeshBackground(state.status, animate, Modifier.fillMaxSize())
        Column(
            Modifier
                .fillMaxSize()
                .navigationBarsPadding(),
        ) {
            Row(
                Modifier
                    .statusBarsPadding()
                    .padding(start = 16.dp, end = 6.dp, top = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                AccessChip(access, onConfirmAccess)
                Spacer(Modifier.weight(1f))
                IconButton(onClick = onSettings) {
                    Icon(Icons.Rounded.Settings, contentDescription = "Настройки", tint = Ink)
                }
            }
            Column(
                Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Spacer(Modifier.height(8.dp))
                AnimatedContent(
                    targetState = statusLabel(state.status),
                    transitionSpec = { fadeIn(Motion.fade(240)) togetherWith fadeOut(Motion.fade(140)) },
                    label = "status",
                ) { label ->
                    Text(
                        label,
                        color = when (state.status) {
                            ConnectionStatus.CONNECTED -> Accent
                            ConnectionStatus.ERROR -> Danger
                            else -> InkMuted
                        },
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium,
                    )
                }
                Text(
                    active?.name ?: "Нет сервера",
                    color = Ink,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 4.dp),
                )
                Text(
                    endpoint ?: "Нажми кнопку, чтобы выбрать страну",
                    color = InkMuted,
                    fontSize = 13.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                Spacer(Modifier.height(6.dp))
                PowerOrb(
                    status = state.status,
                    animate = animate,
                    onClick = {
                        when {
                            busy -> Unit
                            active == null -> onCreateWarp()
                            else -> onToggle()
                        }
                    },
                )
                if (state.status == ConnectionStatus.CONNECTED) {
                    Text(
                        "${formatDuration(state.connectedSince, now)}   ↓ ${formatRate(state.rxRate)}   ↑ ${formatRate(state.txRate)}",
                        color = InkMuted,
                        fontSize = 13.sp,
                    )
                }
                if (!state.error.isNullOrBlank()) {
                    Text(
                        state.error,
                        color = Danger,
                        fontSize = 13.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 6.dp),
                    )
                }
                if (access.status == AccessStatus.FAIL && !access.message.isNullOrBlank()) {
                    Text(
                        access.message,
                        color = Danger,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 4.dp),
                    )
                }
                Spacer(Modifier.height(18.dp))
                Row(
                    Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text("Серверы", color = Ink, fontWeight = FontWeight.SemiBold, modifier = Modifier.weight(1f))
                    val pinging = ping.runningIds.isNotEmpty()
                    Text(
                        if (pinging) "Считаю…" else "Пинг",
                        color = if (profiles.profiles.isEmpty() || pinging) InkMuted else Ink,
                        fontSize = 13.sp,
                        modifier = Modifier.clickable(
                            enabled = profiles.profiles.isNotEmpty() && !pinging,
                            onClick = onPing,
                        ),
                    )
                }
                Spacer(Modifier.height(8.dp))
                if (profiles.profiles.isEmpty()) {
                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        Text("Новый", color = Ink, modifier = Modifier.clickable(onClick = onCreateWarp).padding(vertical = 8.dp))
                        Text("Импорт", color = InkMuted, modifier = Modifier.clickable(onClick = onImport).padding(vertical = 8.dp))
                    }
                } else {
                    profiles.profiles.forEach { profile ->
                        key(profile.id) {
                            ServerCard(
                                profile = profile,
                                active = profile.id == profiles.activeId,
                                pingMs = ping.millis[profile.id],
                                pingKnown = ping.millis.containsKey(profile.id),
                                pinging = profile.id in ping.runningIds,
                                onSelect = { onSelect(profile.id) },
                                onDelete = { pendingDelete = profile.id to profile.name },
                            )
                            Spacer(Modifier.height(8.dp))
                        }
                    }
                    Text(
                        "Свой конфиг",
                        color = InkMuted,
                        fontSize = 13.sp,
                        modifier = Modifier
                            .padding(top = 4.dp, bottom = 12.dp)
                            .clickable(onClick = onImport),
                    )
                }
            }
        }
        pendingDelete?.let { (id, name) ->
            ConfirmDeleteDialog(
                serverName = name,
                onConfirm = {
                    onDelete(id)
                    pendingDelete = null
                },
                onDismiss = { pendingDelete = null },
            )
        }
    }
}

@Composable
private fun AccessChip(access: AccessUiState, onClick: () -> Unit) {
    val working = access.status == AccessStatus.WORKING
    val dot = when (access.status) {
        AccessStatus.OK -> Success
        AccessStatus.FAIL -> Danger
        AccessStatus.WORKING -> Accent
        AccessStatus.IDLE -> InkMuted
    }
    Row(
        Modifier
            .height(32.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Glass)
            .border(1.dp, Color.White.copy(alpha = 0.16f), RoundedCornerShape(16.dp))
            .clickable(enabled = !working, onClick = onClick)
            .padding(horizontal = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(Modifier.size(6.dp).clip(CircleShape).background(dot))
        Spacer(Modifier.width(8.dp))
        Text("Доступ", color = Ink, fontSize = 13.sp, fontWeight = FontWeight.Medium)
    }
}

@Composable
private fun ServerCard(
    profile: VpnProfile,
    active: Boolean,
    pingMs: Int?,
    pingKnown: Boolean,
    pinging: Boolean,
    onSelect: () -> Unit,
    onDelete: () -> Unit,
) {
    val endpoint = remember(profile.rawConfig) { ConfigParser.endpointOf(profile.rawConfig) }
    Row(
        Modifier
            .fillMaxWidth()
            .clip(RowShape)
            .background(if (active) Color(0x80302618) else Glass)
            .border(1.dp, if (active) Accent.copy(alpha = 0.7f) else Color.White.copy(alpha = 0.08f), RowShape)
            .clickable(onClick = onSelect)
            .padding(horizontal = 12.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        FlagBadge(endpoint, badge = 36.dp)
        Spacer(Modifier.width(12.dp))
        Column(Modifier.weight(1f)) {
            Text(
                profile.name,
                color = Ink,
                fontSize = 15.sp,
                fontWeight = if (active) FontWeight.SemiBold else FontWeight.Normal,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            Text(
                endpoint ?: "без адреса",
                color = InkMuted,
                fontSize = 12.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
        val pingLabel = when {
            pinging -> "…"
            pingMs != null -> "$pingMs мс"
            pingKnown -> "н/д"
            else -> ""
        }
        if (pingLabel.isNotEmpty()) {
            Text(pingLabel, color = InkMuted, fontSize = 12.sp, modifier = Modifier.padding(end = 4.dp))
        }
        DeleteServerButton(onClick = onDelete)
    }
}

private fun statusLabel(status: ConnectionStatus) = when (status) {
    ConnectionStatus.DISCONNECTED -> "Не подключён"
    ConnectionStatus.CONNECTING -> "Подключение"
    ConnectionStatus.CONNECTED -> "В сети"
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

private fun formatDuration(since: Long?, now: Long): String {
    if (since == null) return "—"
    val sec = TimeUnit.MILLISECONDS.toSeconds(now - since).coerceAtLeast(0)
    val h = sec / 3600
    val m = (sec % 3600) / 60
    val s = sec % 60
    return if (h > 0) String.format(Locale.US, "%d:%02d:%02d", h, m, s)
    else String.format(Locale.US, "%02d:%02d", m, s)
}
