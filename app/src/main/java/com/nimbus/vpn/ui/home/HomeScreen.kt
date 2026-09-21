package com.nimbus.vpn.ui.home

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.animateColorAsState
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
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Canvas
import com.nimbus.vpn.ui.theme.Danger
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.InkMuted
import com.nimbus.vpn.ui.theme.Lift
import com.nimbus.vpn.ui.theme.Line
import com.nimbus.vpn.ui.theme.Motion
import com.nimbus.vpn.ui.theme.Paper
import kotlinx.coroutines.delay
import java.util.Locale
import java.util.concurrent.TimeUnit

private val Card = RoundedCornerShape(28.dp)
private val Tile = RoundedCornerShape(18.dp)

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

    Box(Modifier.fillMaxSize()) {
        MeshBackground(state.status, animate, Modifier.fillMaxSize())
        Column(
            Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .navigationBarsPadding()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 20.dp, vertical = 8.dp),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Column(Modifier.weight(1f)) {
                    Text("Bozya", color = Ink, fontSize = 32.sp, fontWeight = FontWeight.SemiBold)
                    Text("личный туннель", color = InkMuted, fontSize = 13.sp)
                }
                IconButton(onClick = onSettings) {
                    Icon(Icons.Rounded.Settings, contentDescription = "Настройки", tint = Ink)
                }
            }
            Spacer(Modifier.height(18.dp))
            SessionCard(
                state = state,
                active = active,
                now = now,
                onToggle = onToggle,
                onCreate = onCreateWarp,
            )
            Spacer(Modifier.height(26.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    "Серверы",
                    color = Ink,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.weight(1f),
                )
                val pinging = ping.runningIds.isNotEmpty()
                Text(
                    if (pinging) "Считаю…" else "Пинг",
                    color = if (profiles.profiles.isEmpty() || pinging) InkMuted else Accent,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.clickable(
                        enabled = profiles.profiles.isNotEmpty() && !pinging,
                        onClick = onPing,
                    ),
                )
            }
            Spacer(Modifier.height(12.dp))
            if (profiles.profiles.isEmpty()) {
                EmptyServers(onCreateWarp, onImport)
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
                            onDelete = {
                                pendingDelete = profile.id to profile.name
                            },
                        )
                        Spacer(Modifier.height(8.dp))
                    }
                }
                Text(
                    "Свой конфиг",
                    color = InkMuted,
                    fontSize = 13.sp,
                    modifier = Modifier
                        .padding(top = 6.dp)
                        .clickable(onClick = onImport),
                )
            }
            Spacer(Modifier.height(22.dp))
            AccessBanner(access, onConfirmAccess)
            Spacer(Modifier.height(12.dp))
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

@Composable
private fun SessionCard(
    state: TunnelUiState,
    active: VpnProfile?,
    now: Long,
    onToggle: () -> Unit,
    onCreate: () -> Unit,
) {
    val endpoint = remember(active?.rawConfig) { active?.rawConfig?.let(ConfigParser::endpointOf) }
    val connected = state.status == ConnectionStatus.CONNECTED
    val border by animateColorAsState(
        targetValue = if (connected) Accent else Line,
        animationSpec = Motion.color(500),
        label = "hero-border",
    )
    Column(
        Modifier
            .fillMaxWidth()
            .clip(Card)
            .background(Paper)
            .border(1.dp, border, Card)
            .padding(20.dp),
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            FlagBadge(endpoint, badge = 52.dp)
            Spacer(Modifier.width(14.dp))
            Column(Modifier.weight(1f)) {
                AnimatedContent(
                    targetState = active?.name ?: "Нет сервера",
                    transitionSpec = { fadeIn(Motion.fade(280)) togetherWith fadeOut(Motion.fade(160)) },
                    label = "hero-name",
                ) { name ->
                    Text(
                        name,
                        color = Ink,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.SemiBold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                Text(
                    endpoint ?: "Выбери страну ниже",
                    color = InkMuted,
                    fontSize = 13.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        Spacer(Modifier.height(16.dp))
        AnimatedContent(
            targetState = statusLabel(state.status),
            transitionSpec = { fadeIn(Motion.fade(260)) togetherWith fadeOut(Motion.fade(140)) },
            label = "hero-status",
        ) { label ->
            Text(
                label,
                color = when (state.status) {
                    ConnectionStatus.CONNECTED -> Accent
                    ConnectionStatus.ERROR -> Danger
                    else -> InkMuted
                },
                fontWeight = FontWeight.Medium,
            )
        }
        if (connected) {
            Spacer(Modifier.height(14.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Stat("время", formatDuration(state.connectedSince, now), Modifier.weight(1f))
                Stat("вниз", formatRate(state.rxRate), Modifier.weight(1f))
                Stat("вверх", formatRate(state.txRate), Modifier.weight(1f))
            }
        }
        if (!state.error.isNullOrBlank()) {
            Text(
                state.error,
                color = Danger,
                fontSize = 13.sp,
                modifier = Modifier.padding(top = 10.dp),
            )
        }
        Spacer(Modifier.height(16.dp))
        if (active == null) {
            Button(
                onClick = onCreate,
                colors = ButtonDefaults.buttonColors(containerColor = Accent, contentColor = Canvas),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth().height(52.dp),
            ) { Text("Создать сервер", fontWeight = FontWeight.SemiBold) }
        } else {
            val busy = state.status == ConnectionStatus.CONNECTING
            Button(
                onClick = onToggle,
                enabled = !busy,
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (connected) Lift else Accent,
                    contentColor = if (connected) Ink else Canvas,
                    disabledContainerColor = Lift,
                    disabledContentColor = InkMuted,
                ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth().height(52.dp),
            ) {
                Text(
                    when (state.status) {
                        ConnectionStatus.CONNECTED -> "Отключить"
                        ConnectionStatus.CONNECTING -> "Подключение…"
                        ConnectionStatus.ERROR -> "Повторить"
                        ConnectionStatus.DISCONNECTED -> "Подключить"
                    },
                    fontWeight = FontWeight.SemiBold,
                )
            }
        }
    }
}

@Composable
private fun Stat(label: String, value: String, modifier: Modifier = Modifier) {
    Column(
        modifier
            .clip(Tile)
            .background(Lift)
            .padding(horizontal = 10.dp, vertical = 10.dp),
    ) {
        Text(label, color = InkMuted, fontSize = 11.sp)
        Text(value, color = Ink, fontSize = 14.sp, fontWeight = FontWeight.Medium, maxLines = 1)
    }
}

@Composable
private fun EmptyServers(onCreate: () -> Unit, onImport: () -> Unit) {
    Column(
        Modifier
            .fillMaxWidth()
            .clip(Tile)
            .background(Paper)
            .border(1.dp, Line, Tile)
            .padding(18.dp),
    ) {
        Text("Пока пусто", color = Ink, fontWeight = FontWeight.Medium)
        Text(
            "Страна и LTE собираются в приложении. Свой .conf тоже можно вставить.",
            color = InkMuted,
            fontSize = 13.sp,
            modifier = Modifier.padding(top = 6.dp, bottom = 14.dp),
        )
        Button(
            onClick = onCreate,
            colors = ButtonDefaults.buttonColors(containerColor = Accent, contentColor = Canvas),
            shape = RoundedCornerShape(14.dp),
            modifier = Modifier.fillMaxWidth(),
        ) { Text("Новый WARP") }
        Text(
            "Импорт файла",
            color = Ink,
            modifier = Modifier
                .padding(top = 12.dp)
                .clickable(onClick = onImport),
        )
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
    val border by animateColorAsState(
        targetValue = if (active) Accent else Color.Transparent,
        animationSpec = Motion.color(320),
        label = "row-border",
    )
    Row(
        Modifier
            .fillMaxWidth()
            .clip(Tile)
            .background(if (active) Lift else Paper)
            .border(1.dp, border, Tile)
            .clickable(onClick = onSelect)
            .padding(horizontal = 12.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        FlagBadge(endpoint, badge = 40.dp)
        Spacer(Modifier.width(12.dp))
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

@Composable
private fun AccessBanner(access: AccessUiState, onClick: () -> Unit) {
    val working = access.status == AccessStatus.WORKING
    val ok = access.status == AccessStatus.OK
    val label = when (access.status) {
        AccessStatus.IDLE -> "Подтвердить доступ к релею"
        AccessStatus.WORKING -> "Активирую…"
        AccessStatus.OK -> "Доступ активирован"
        AccessStatus.FAIL -> access.message ?: "Не вышло, нажми ещё раз"
    }
    Row(
        Modifier
            .fillMaxWidth()
            .clip(Tile)
            .background(if (ok) Accent.copy(alpha = 0.16f) else Paper)
            .border(1.dp, if (ok) Accent else Line, Tile)
            .clickable(enabled = !working, onClick = onClick)
            .padding(horizontal = 16.dp, vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(Modifier.weight(1f)) {
            Text("Релей", color = InkMuted, fontSize = 11.sp)
            Text(label, color = if (ok) Accent else Ink, fontWeight = FontWeight.Medium)
        }
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
