package com.nimbus.vpn.ui.home

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
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
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SheetValue
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberStandardBottomSheetState
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
import androidx.compose.ui.platform.LocalConfiguration
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
import com.nimbus.vpn.ui.components.PowerOrb
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

@OptIn(ExperimentalMaterial3Api::class)
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
    val screenHeight = LocalConfiguration.current.screenHeightDp.dp
    val peek = minOf(228.dp, screenHeight * 0.30f).coerceAtLeast(156.dp)
    val sheetState = rememberStandardBottomSheetState(
        initialValue = SheetValue.PartiallyExpanded,
        skipHiddenState = true,
    )
    val scaffoldState = rememberBottomSheetScaffoldState(bottomSheetState = sheetState)
    var now by remember { mutableLongStateOf(System.currentTimeMillis()) }
    var pendingDelete by remember { mutableStateOf<Pair<String, String>?>(null) }
    LaunchedEffect(state.status) {
        if (state.status != ConnectionStatus.CONNECTED) return@LaunchedEffect
        while (true) {
            now = System.currentTimeMillis()
            delay(1000)
        }
    }
    BottomSheetScaffold(
        scaffoldState = scaffoldState,
        containerColor = Canvas,
        contentColor = Ink,
        sheetContainerColor = Paper,
        sheetContentColor = Ink,
        sheetTonalElevation = 0.dp,
        sheetShadowElevation = 16.dp,
        sheetShape = RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp),
        sheetPeekHeight = peek,
        sheetDragHandle = { BottomSheetDefaults.DragHandle(color = Accent.copy(alpha = 0.7f)) },
        sheetContent = {
            ServerSheet(
                profiles = profiles,
                maxHeight = screenHeight * 0.72f,
                onCreateWarp = onCreateWarp,
                onImport = onImport,
                onSelect = onSelect,
                onDelete = { id ->
                    val name = profiles.profiles.firstOrNull { it.id == id }?.name ?: "сервер"
                    pendingDelete = id to name
                },
                ping = ping,
                onPing = onPing,
            )
        },
    ) { padding ->
        Box(Modifier.fillMaxSize()) {
            MeshBackground(state.status, animate, Modifier.fillMaxSize())
            Column(
                Modifier
                    .fillMaxSize()
                    .statusBarsPadding()
                    .padding(bottom = padding.calculateBottomPadding()),
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 4.dp, vertical = 2.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    IconButton(onClick = onSettings) {
                        Icon(Icons.Rounded.Settings, contentDescription = "Настройки", tint = Ink)
                    }
                    Spacer(Modifier.weight(1f))
                    AccessChip(access = access, onClick = onConfirmAccess)
                    Spacer(Modifier.weight(1f))
                    IconButton(onClick = onCreateWarp) {
                        Icon(Icons.Rounded.Add, contentDescription = "Создать WARP", tint = Ink)
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
                    Spacer(Modifier.height(14.dp))
                    AnimatedContent(
                        targetState = statusLabel(state.status),
                        transitionSpec = {
                            (fadeIn(Motion.fade(320)) + slideInVertically(Motion.offset(360)) { it / 6 }) togetherWith
                                (fadeOut(Motion.fade(180)) + slideOutVertically(Motion.offset(220)) { -it / 8 })
                        },
                        label = "status",
                    ) { label ->
                        Text(
                            label,
                            color = when (state.status) {
                                ConnectionStatus.CONNECTED -> Accent
                                ConnectionStatus.CONNECTING -> Ink
                                ConnectionStatus.ERROR -> Danger
                                ConnectionStatus.DISCONNECTED -> InkMuted
                            },
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                        )
                    }
                    AnimatedVisibility(
                        visible = state.status == ConnectionStatus.CONNECTED,
                        enter = fadeIn(Motion.fade(360)) + slideInVertically(Motion.offset(360)) { it / 4 },
                        exit = fadeOut(Motion.fade(180)),
                    ) {
                        Text(
                            "${formatDuration(state.connectedSince, now)}  ·  ↓ ${formatRate(state.rxRate)}  ·  ↑ ${formatRate(state.txRate)}",
                            color = InkMuted,
                            fontSize = 12.sp,
                            modifier = Modifier.padding(top = 6.dp),
                        )
                    }
                    AnimatedVisibility(
                        visible = !state.error.isNullOrBlank(),
                        enter = fadeIn(Motion.fade(280)),
                        exit = fadeOut(Motion.fade(160)),
                    ) {
                        Text(
                            state.error ?: "",
                            color = Danger,
                            fontSize = 13.sp,
                            modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp),
                        )
                    }
                }
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

@Composable
private fun AccessChip(access: AccessUiState, onClick: () -> Unit) {
    val working = access.status == AccessStatus.WORKING
    val ok = access.status == AccessStatus.OK
    val bg by animateColorAsState(
        targetValue = if (ok) Accent else Color.Transparent,
        animationSpec = Motion.color(280),
        label = "chip-bg",
    )
    val fg by animateColorAsState(
        targetValue = if (ok) Canvas else Ink,
        animationSpec = Motion.color(280),
        label = "chip-fg",
    )
    val shape = RoundedCornerShape(20.dp)
    AnimatedContent(
        targetState = when (access.status) {
            AccessStatus.IDLE -> "Доступ"
            AccessStatus.WORKING -> "Активирую"
            AccessStatus.OK -> "Активирован"
            AccessStatus.FAIL -> "Повторить"
        },
        transitionSpec = { fadeIn(Motion.fade(180)) togetherWith fadeOut(Motion.fade(120)) },
        label = "chip-label",
    ) { label ->
        Text(
            label,
            color = fg,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .clip(shape)
                .background(bg)
                .border(1.dp, Ink.copy(alpha = 0.85f), shape)
                .clickable(enabled = !working, onClick = onClick)
                .padding(horizontal = 14.dp, vertical = 7.dp),
        )
    }
}

@Composable
private fun ServerSheet(
    profiles: ProfileIndex,
    maxHeight: androidx.compose.ui.unit.Dp,
    onCreateWarp: () -> Unit,
    onImport: () -> Unit,
    onSelect: (String) -> Unit,
    onDelete: (String) -> Unit,
    ping: ServerPingState,
    onPing: () -> Unit,
) {
    Column(
        Modifier
            .fillMaxWidth()
            .heightIn(max = maxHeight)
            .navigationBarsPadding(),
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 18.dp, vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                "Список серверов",
                color = Ink,
                fontSize = 17.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .weight(1f)
                    .clickable(onClick = onCreateWarp),
            )
            Text("${profiles.profiles.size}", color = InkMuted, fontSize = 13.sp)
            val pinging = ping.runningIds.isNotEmpty()
            Text(
                if (pinging) "Пинг…" else "Пинг",
                color = if (profiles.profiles.isEmpty() || pinging) InkMuted else Ink,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .padding(start = 12.dp)
                    .clickable(enabled = profiles.profiles.isNotEmpty() && !pinging, onClick = onPing),
            )
        }
        HorizontalDivider(color = Line, modifier = Modifier.padding(top = 8.dp))
        if (profiles.profiles.isEmpty()) {
            Column(Modifier.fillMaxWidth().padding(22.dp)) {
                Text("Пока пусто", color = Ink, fontWeight = FontWeight.Medium)
                Text(
                    "Выбери страну и LTE — конфиг появится здесь, как в MeowNet.",
                    color = InkMuted,
                    fontSize = 13.sp,
                    modifier = Modifier.padding(top = 6.dp),
                )
                Button(
                    onClick = onCreateWarp,
                    colors = ButtonDefaults.buttonColors(containerColor = Ink, contentColor = Canvas),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .padding(top = 14.dp)
                        .fillMaxWidth()
                        .height(46.dp),
                ) {
                    Text("Создать WARP")
                }
                Text(
                    "Или вставить свой конфиг",
                    color = Ink,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 12.dp)
                        .clickable(onClick = onImport),
                )
            }
        } else {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState()),
            ) {
                profiles.profiles.forEach { profile ->
                    key(profile.id) {
                        ServerRow(
                            profile = profile,
                            active = profile.id == profiles.activeId,
                            pingMs = ping.millis[profile.id],
                            pingKnown = ping.millis.containsKey(profile.id),
                            pinging = profile.id in ping.runningIds,
                            onSelect = { onSelect(profile.id) },
                            onDelete = { onDelete(profile.id) },
                        )
                    }
                }
            }
        }
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
    onDelete: () -> Unit,
) {
    val endpoint = remember(profile.rawConfig) { ConfigParser.endpointOf(profile.rawConfig) }
    val subtitle = remember(profile.rawConfig) { subtitleForConfig(profile.rawConfig) }
    val pingLabel = when {
        pinging -> "…"
        pingMs != null -> "$pingMs мс"
        pingKnown -> "н/д"
        else -> ""
    }
    Row(
        Modifier
            .fillMaxWidth()
            .clickable(onClick = onSelect)
            .background(if (active) Lift else Color.Transparent)
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        FlagBadge(endpoint, Modifier.padding(end = 12.dp))
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
                subtitle,
                color = InkMuted,
                fontSize = 12.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
        if (pingLabel.isNotEmpty()) {
            Text(
                pingLabel,
                color = InkMuted,
                fontSize = 12.sp,
                maxLines = 1,
                modifier = Modifier.padding(end = 6.dp),
            )
        }
        if (active) {
            Text("●", color = Ink, fontSize = 12.sp, modifier = Modifier.padding(end = 4.dp))
        }
        DeleteServerButton(onClick = onDelete)
    }
}

private fun statusLabel(status: ConnectionStatus) = when (status) {
    ConnectionStatus.DISCONNECTED -> "Нажми, чтобы подключить"
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

private fun formatDuration(since: Long?, now: Long): String {
    if (since == null) return "—"
    val sec = TimeUnit.MILLISECONDS.toSeconds(now - since).coerceAtLeast(0)
    val h = sec / 3600
    val m = (sec % 3600) / 60
    val s = sec % 60
    return if (h > 0) String.format(Locale.US, "%d:%02d:%02d", h, m, s)
    else String.format(Locale.US, "%02d:%02d", m, s)
}
