package com.nimbus.vpn.ui.home

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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Description
import androidx.compose.material.icons.rounded.NearMe
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.Timer
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.data.AppSettings
import com.nimbus.vpn.data.ConfigParser
import com.nimbus.vpn.data.ProfileIndex
import com.nimbus.vpn.data.VpnProfile
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.tunnel.TunnelUiState
import com.nimbus.vpn.ui.AccessStatus
import com.nimbus.vpn.ui.AccessUiState
import com.nimbus.vpn.ui.ServerPingState
import com.nimbus.vpn.ui.coach.CoachStep
import com.nimbus.vpn.ui.coach.CrabDock
import com.nimbus.vpn.ui.coach.CrabMood
import com.nimbus.vpn.ui.coach.coachGlow
import com.nimbus.vpn.ui.components.ConfirmDeleteDialog
import com.nimbus.vpn.ui.components.DeleteServerButton
import com.nimbus.vpn.ui.components.MeshBackground
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Canvas
import com.nimbus.vpn.ui.theme.Danger
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.InkMuted
import com.nimbus.vpn.ui.theme.Line
import com.nimbus.vpn.ui.theme.Paper
import com.nimbus.vpn.ui.theme.Success
import kotlinx.coroutines.delay
import java.util.Locale
import java.util.concurrent.TimeUnit

private val CardShape = RoundedCornerShape(18.dp)

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
    settings: AppSettings,
    joyPulse: Int,
    onCoachYes: () -> Unit,
    onCoachAdd: () -> Unit,
    onCoachReady: () -> Unit,
    onCoachCelebrateNext: () -> Unit,
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
    val busy = state.status == ConnectionStatus.CONNECTING
    val connected = state.status == ConnectionStatus.CONNECTED
    val step = CoachStep.from(settings.coachStep)
    var cheer by remember { mutableStateOf<String?>(null) }
    LaunchedEffect(profiles.profiles.size, step) {
        if (profiles.profiles.isNotEmpty() && (step == CoachStep.CREATE || step == CoachStep.PICK)) {
            onCoachReady()
        }
    }
    LaunchedEffect(joyPulse) {
        if (joyPulse == 0 || step != CoachStep.DONE) return@LaunchedEffect
        cheer = "Ура, мы в сети! Серия ${settings.streak.coerceAtLeast(1)}."
        delay(4200)
        cheer = null
    }
    val coachMessage = when (step) {
        CoachStep.OFFER -> "Привет! Я крабик Bozya. Показать, как тут всё устроено?"
        CoachStep.CREATE, CoachStep.PICK -> "Нажми светящуюся кнопку «+» и создай сервер сам. Я подожду."
        CoachStep.CONNECT -> "Теперь нажми круглую кнопку внизу. Она включит туннель."
        CoachStep.CELEBRATE -> "Получилось! Серия ${settings.streak.coerceAtLeast(1)} дн. Дальше заглянем в настройки."
        CoachStep.SETTINGS -> "Открой шестерёнку справа. Там расскажу про каждый переключатель."
        else -> cheer
    }
    val coachAction = when (step) {
        CoachStep.OFFER -> "Да"
        CoachStep.CELEBRATE -> "Дальше"
        else -> null
    }
    val coachClick: (() -> Unit)? = when (step) {
        CoachStep.OFFER -> onCoachYes
        CoachStep.CELEBRATE -> onCoachCelebrateNext
        else -> null
    }
    val mood = when (step) {
        CoachStep.OFFER -> CrabMood.WAVE
        CoachStep.CELEBRATE -> CrabMood.JOY
        CoachStep.DONE -> if (cheer != null) CrabMood.JOY else CrabMood.CALM
        else -> CrabMood.POINT
    }

    Box(Modifier.fillMaxSize()) {
        MeshBackground(state.status, animate, Modifier.fillMaxSize())
        Column(Modifier.fillMaxSize()) {
            Row(
                Modifier
                    .statusBarsPadding()
                    .padding(start = 16.dp, end = 4.dp, top = 6.dp, bottom = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                AccessChip(access, onConfirmAccess)
                Text(
                    "Bozya",
                    color = Ink,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(start = 12.dp).weight(1f),
                    maxLines = 1,
                )
                if (settings.streak > 0) {
                    Text(
                        "${settings.streak} дн.",
                        color = Accent,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .clip(RoundedCornerShape(12.dp))
                            .background(Paper)
                            .border(1.dp, Line, RoundedCornerShape(12.dp))
                            .padding(horizontal = 8.dp, vertical = 4.dp),
                    )
                }
                IconButton(
                    onClick = {
                        onCoachAdd()
                        onCreateWarp()
                    },
                    modifier = Modifier.coachGlow(step == CoachStep.CREATE || step == CoachStep.PICK),
                ) {
                    Icon(Icons.Rounded.Add, contentDescription = "Новый сервер", tint = Ink)
                }
                IconButton(onClick = onImport) {
                    Icon(Icons.Rounded.Description, contentDescription = "Импорт", tint = Ink)
                }
                IconButton(
                    onClick = onSettings,
                    modifier = Modifier.coachGlow(step == CoachStep.SETTINGS),
                ) {
                    Icon(Icons.Rounded.Settings, contentDescription = "Настройки", tint = Ink)
                }
            }
            val statusLine = when {
                connected -> "В сети · ${formatDuration(state.connectedSince, now)} · ↓ ${formatRate(state.rxRate)} · ↑ ${formatRate(state.txRate)}"
                state.status == ConnectionStatus.CONNECTING -> "Подключение…"
                state.status == ConnectionStatus.ERROR -> state.error ?: "Ошибка"
                access.status == AccessStatus.FAIL -> access.message
                else -> null
            }
            if (!statusLine.isNullOrBlank()) {
                Text(
                    statusLine,
                    color = if (state.status == ConnectionStatus.ERROR || access.status == AccessStatus.FAIL) Danger else InkMuted,
                    fontSize = 12.sp,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 2.dp),
                )
            }
            if (profiles.profiles.isEmpty()) {
                Box(Modifier.fillMaxSize().padding(bottom = 96.dp), contentAlignment = Alignment.Center) {
                    Text("Нет серверов", color = InkMuted, fontSize = 15.sp)
                }
            } else {
                LazyColumn(
                    Modifier.fillMaxSize(),
                    contentPadding = androidx.compose.foundation.layout.PaddingValues(
                        start = 16.dp,
                        end = 16.dp,
                        top = 8.dp,
                        bottom = if (coachMessage != null) 230.dp else 120.dp,
                    ),
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                ) {
                    items(profiles.profiles, key = { it.id }) { profile ->
                        ServerRow(
                            profile = profile,
                            active = profile.id == profiles.activeId,
                            pingMs = ping.millis[profile.id],
                            pingKnown = ping.millis.containsKey(profile.id),
                            pinging = profile.id in ping.runningIds,
                            onSelect = { onSelect(profile.id) },
                            onPing = onPing,
                            onDelete = { pendingDelete = profile.id to profile.name },
                        )
                    }
                }
            }
        }
        ConnectFab(
            enabled = !busy,
            connected = connected,
            hasProfile = active != null,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .navigationBarsPadding()
                .padding(bottom = 18.dp)
                .coachGlow(step == CoachStep.CONNECT),
            onClick = {
                when {
                    busy -> Unit
                    active == null -> onCreateWarp()
                    else -> onToggle()
                }
            },
        )
        CrabDock(
            mood = mood,
            message = coachMessage,
            action = coachAction,
            onAction = coachClick,
            joyPulse = joyPulse,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .navigationBarsPadding()
                .padding(start = 12.dp, bottom = 8.dp, end = 72.dp),
        )
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
            .background(Paper)
            .border(1.dp, Line, RoundedCornerShape(16.dp))
            .clickable(enabled = !working, onClick = onClick)
            .padding(horizontal = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(Modifier.size(6.dp).clip(CircleShape).background(dot))
        Spacer(Modifier.width(6.dp))
        Text("Доступ", color = Ink, fontSize = 13.sp)
    }
}

@Composable
private fun ServerRow(
    profile: VpnProfile,
    active: Boolean,
    pingMs: Int?,
    pingKnown: Boolean,
    pinging: Boolean,
    onSelect: () -> Unit,
    onPing: () -> Unit,
    onDelete: () -> Unit,
) {
    val endpoint = remember(profile.rawConfig) { ConfigParser.endpointOf(profile.rawConfig) }
    val proto = if (ConfigParser.isAmneziaHint(profile.rawConfig)) "AmneziaWG" else "WireGuard"
    val pingLabel = when {
        pinging -> "…"
        pingMs != null -> "$pingMs мс"
        pingKnown -> "н/д"
        else -> ""
    }
    Row(
        Modifier
            .fillMaxWidth()
            .clip(CardShape)
            .background(Paper)
            .border(1.dp, if (active) Accent.copy(alpha = 0.55f) else Line, CardShape)
            .clickable(onClick = onSelect)
            .padding(start = 12.dp, end = 4.dp, top = 10.dp, bottom = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        FlagBadge(endpoint, badge = 36.dp)
        Spacer(Modifier.width(12.dp))
        Column(Modifier.weight(1f)) {
            Text(
                profile.name,
                color = Ink,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            Text(
                endpoint ?: proto,
                color = InkMuted,
                fontSize = 13.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
        Column(horizontalAlignment = Alignment.End) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = onPing, modifier = Modifier.size(36.dp), enabled = !pinging) {
                    Icon(Icons.Rounded.Timer, contentDescription = "Пинг", tint = Ink, modifier = Modifier.size(18.dp))
                }
                DeleteServerButton(onClick = onDelete, modifier = Modifier.size(36.dp))
            }
            if (pingLabel.isNotEmpty()) {
                Text(
                    pingLabel,
                    color = if (pingMs != null) Success else InkMuted,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(end = 10.dp),
                )
            }
        }
    }
}

@Composable
private fun ConnectFab(
    enabled: Boolean,
    connected: Boolean,
    hasProfile: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier
            .size(58.dp)
            .clip(CircleShape)
            .background(if (enabled) Accent else Accent.copy(alpha = 0.45f))
            .clickable(enabled = enabled, onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        if (!enabled) {
            CircularProgressIndicator(color = Canvas, strokeWidth = 2.dp, modifier = Modifier.size(22.dp))
        } else {
            Icon(
                imageVector = when {
                    !hasProfile -> Icons.Rounded.Add
                    connected -> Icons.Rounded.Close
                    else -> Icons.Rounded.NearMe
                },
                contentDescription = when {
                    !hasProfile -> "Создать сервер"
                    connected -> "Отключить"
                    else -> "Подключить"
                },
                tint = Canvas,
                modifier = Modifier.size(26.dp),
            )
        }
    }
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
