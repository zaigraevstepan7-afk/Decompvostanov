package com.nimbus.vpn.ui.home

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Description
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.Timer
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
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
import com.nimbus.vpn.data.SecTunnelProfile
import com.nimbus.vpn.data.ProfileIndex
import com.nimbus.vpn.data.VpnProfile
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.tunnel.TunnelUiState
import com.nimbus.vpn.ui.AccessStatus
import com.nimbus.vpn.ui.AccessUiState
import com.nimbus.vpn.ui.ServerPingState
import com.nimbus.vpn.ui.coach.CoachStep
import com.nimbus.vpn.ui.coach.DogDock
import com.nimbus.vpn.ui.coach.DogMood
import com.nimbus.vpn.ui.coach.coachGlow
import com.nimbus.vpn.ui.components.ConfirmDeleteDialog
import com.nimbus.vpn.ui.components.DeleteServerButton
import com.nimbus.vpn.ui.components.MeshBackground
import com.nimbus.vpn.ui.components.pressScale
import com.nimbus.vpn.ui.components.rememberPress
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Canvas
import com.nimbus.vpn.ui.theme.Danger
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.InkMuted
import com.nimbus.vpn.ui.theme.Lift
import com.nimbus.vpn.ui.theme.Line
import com.nimbus.vpn.ui.theme.Motion
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
    onCoachAbout: () -> Unit,
    onCoachAdd: () -> Unit,
    onCoachReady: () -> Unit,
    onCoachCelebrateNext: () -> Unit,
    onMoveDog: (Float, Float) -> Unit,
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
    val step = CoachStep.from(settings.coachStep)
    LaunchedEffect(profiles.profiles.size, step) {
        if (profiles.profiles.isNotEmpty() && (step == CoachStep.CREATE || step == CoachStep.PICK)) {
            onCoachReady()
        }
    }
    val teachAccess = !settings.heardAccess && (step == CoachStep.ACCESS || step == CoachStep.CONNECT)
    val coachMessage = when {
        step == CoachStep.OFFER -> "Привет! Показать, как тут всё устроено?"
        step == CoachStep.ABOUT -> "Cloudflare WARP — это сервис шифрования сетевого трафика от компании Cloudflare, работающий по принципу VPN на базе оптимизированного протокола WireGuard (реализация BoringTun)."
        step == CoachStep.CREATE || step == CoachStep.PICK -> "Нажми светящуюся кнопку «+» и создай сервер сам. Я подожду."
        teachAccess -> "Перед включением нажми светящуюся «Доступ». Сменился IP — снова эта одна кнопка, и всё работает. Перестало работать: отключи VPN и нажми «Доступ» ещё раз."
        step == CoachStep.CONNECT -> "Теперь нажми круглую кнопку внизу. Она включит туннель."
        step == CoachStep.CELEBRATE || step == CoachStep.SETTINGS -> "Открой шестерёнку справа. Там расскажу про каждый переключатель."
        else -> null
    }
    val coachAction = when (step) {
        CoachStep.OFFER -> "Да"
        CoachStep.ABOUT -> "Дальше"
        else -> null
    }
    val coachClick: (() -> Unit)? = when (step) {
        CoachStep.OFFER -> onCoachYes
        CoachStep.ABOUT -> onCoachAbout
        else -> null
    }
    val mood = when {
        step == CoachStep.OFFER -> DogMood.WAVE
        step == CoachStep.ABOUT -> DogMood.POINT
        teachAccess || step == CoachStep.CELEBRATE || step == CoachStep.SETTINGS -> DogMood.POINT
        step == CoachStep.DONE -> DogMood.CALM
        else -> DogMood.POINT
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
                AccessChip(
                    access = access,
                    onClick = onConfirmAccess,
                    glow = teachAccess,
                )
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
                PressIconButton(
                    onClick = {
                        onCoachAdd()
                        onCreateWarp()
                    },
                    modifier = Modifier.coachGlow(step == CoachStep.CREATE || step == CoachStep.PICK),
                ) {
                    Icon(Icons.Rounded.Add, contentDescription = "Новый сервер", tint = Ink)
                }
                PressIconButton(onClick = onImport) {
                    Icon(Icons.Rounded.Description, contentDescription = "Импорт", tint = Ink)
                }
                PressIconButton(
                    onClick = onSettings,
                    modifier = Modifier.coachGlow(step == CoachStep.SETTINGS || step == CoachStep.CELEBRATE),
                ) {
                    Icon(Icons.Rounded.Settings, contentDescription = "Настройки", tint = Ink)
                }
            }
            val statusVisible = state.status != ConnectionStatus.DISCONNECTED || access.status == AccessStatus.FAIL
            AnimatedVisibility(
                visible = statusVisible,
                enter = fadeIn(Motion.fade(320)) + expandVertically(tween(360, easing = Motion.EaseOut)) + slideInVertically(Motion.offset(360)) { -it / 2 },
                exit = fadeOut(Motion.fade(220)) + shrinkVertically(tween(280, easing = Motion.EaseOut)) + slideOutVertically(Motion.offset(280)) { -it / 2 },
            ) {
                AnimatedContent(
                    targetState = state.status,
                    transitionSpec = {
                        (fadeIn(Motion.fade(340)) + slideInVertically(Motion.offset(380)) { it / 2 })
                            .togetherWith(fadeOut(Motion.fade(200)) + slideOutVertically(Motion.offset(260)) { -it / 2 })
                    },
                    label = "status-line",
                ) { mode ->
                    val line = when (mode) {
                        ConnectionStatus.CONNECTED -> "В сети · ${formatDuration(state.connectedSince, now)} · ↓ ${formatRate(state.rxRate)} · ↑ ${formatRate(state.txRate)}"
                        ConnectionStatus.CONNECTING -> "Подключение…"
                        ConnectionStatus.ERROR -> state.error ?: "Ошибка"
                        ConnectionStatus.DISCONNECTED -> access.message ?: ""
                    }
                    val tone by animateColorAsState(
                        targetValue = if (mode == ConnectionStatus.ERROR || access.status == AccessStatus.FAIL) Danger else InkMuted,
                        animationSpec = Motion.color(420),
                        label = "status-tone",
                    )
                    Text(
                        line,
                        color = tone,
                        fontSize = 12.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(horizontal = 20.dp, vertical = 2.dp),
                    )
                }
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
                        bottom = if (coachMessage != null) 250.dp else 148.dp,
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
        ConnectButton(
            status = state.status,
            hasProfile = active != null,
            animate = animate,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .navigationBarsPadding()
                .padding(bottom = 18.dp)
                .coachGlow(step == CoachStep.CONNECT && !teachAccess),
            onClick = {
                when {
                    busy -> Unit
                    active == null -> onCreateWarp()
                    else -> onToggle()
                }
            },
        )
        DogDock(
            mood = mood,
            message = coachMessage,
            action = coachAction,
            onAction = coachClick,
            joyPulse = joyPulse,
            anchorX = settings.dogX,
            anchorY = settings.dogY,
            onAnchor = onMoveDog,
            modifier = Modifier.fillMaxSize(),
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
private fun AccessChip(access: AccessUiState, onClick: () -> Unit, glow: Boolean) {
    val press = rememberPress(0.92f)
    val working = access.status == AccessStatus.WORKING
    val dot by animateColorAsState(
        targetValue = when (access.status) {
            AccessStatus.OK -> Success
            AccessStatus.FAIL -> Danger
            AccessStatus.WORKING -> Accent
            AccessStatus.IDLE -> InkMuted
        },
        animationSpec = Motion.color(420),
        label = "access-dot",
    )
    Row(
        Modifier
            .pressScale(press.scale)
            .coachGlow(glow)
            .height(32.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Paper)
            .border(1.dp, Line, RoundedCornerShape(16.dp))
            .clickable(
                interactionSource = press.interaction,
                indication = ripple(),
                enabled = !working,
                onClick = onClick,
            )
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
    val sec = remember(profile.rawConfig) { SecTunnelProfile.read(profile.rawConfig) }
    val press = rememberPress(0.975f)
    val fill by animateColorAsState(if (active) Lift else Paper, Motion.color(460), label = "row-fill")
    val stroke by animateColorAsState(
        if (active) Accent.copy(alpha = 0.7f) else Line,
        Motion.color(460),
        label = "row-stroke",
    )
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
            .pressScale(press.scale)
            .clip(CardShape)
            .background(fill)
            .border(1.dp, stroke, CardShape)
            .clickable(
                interactionSource = press.interaction,
                indication = ripple(),
                onClick = onSelect,
            )
            .padding(start = 12.dp, end = 4.dp, top = 10.dp, bottom = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        FlagBadge(endpoint, emoji = sec?.flag, badge = 36.dp)
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
                if (sec != null) "${sec.place} · sec-tunnel" else endpoint ?: proto,
                color = InkMuted,
                fontSize = 13.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
        Column(horizontalAlignment = Alignment.End) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                PressIconButton(onClick = onPing, modifier = Modifier.size(36.dp), enabled = !pinging) {
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
private fun PressIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    content: @Composable () -> Unit,
) {
    val press = rememberPress(0.84f)
    IconButton(
        onClick = onClick,
        enabled = enabled,
        interactionSource = press.interaction,
        modifier = modifier.pressScale(press.scale),
        content = content,
    )
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
