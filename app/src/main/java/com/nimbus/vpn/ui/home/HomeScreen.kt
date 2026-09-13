package com.nimbus.vpn.ui.home

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
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
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
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
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.tunnel.TunnelUiState
import com.nimbus.vpn.ui.AccessStatus
import com.nimbus.vpn.ui.AccessUiState
import com.nimbus.vpn.ui.components.MeshBackground
import com.nimbus.vpn.ui.components.PowerOrb
import com.nimbus.vpn.ui.theme.Canvas
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.InkMuted
import com.nimbus.vpn.ui.theme.Lift
import com.nimbus.vpn.ui.theme.Line
import com.nimbus.vpn.ui.theme.Paper
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
) {
    val sheetState = rememberBottomSheetScaffoldState()
    BottomSheetScaffold(
        scaffoldState = sheetState,
        containerColor = Canvas,
        contentColor = Ink,
        sheetContainerColor = Paper,
        sheetContentColor = Ink,
        sheetTonalElevation = 0.dp,
        sheetShadowElevation = 16.dp,
        sheetShape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
        sheetPeekHeight = 236.dp,
        sheetDragHandle = { BottomSheetDefaults.DragHandle(color = Color(0xFF5A5A5E)) },
        sheetContent = {
            ServerSheet(
                state = state,
                profiles = profiles,
                onCreateWarp = onCreateWarp,
                onImport = onImport,
                onSelect = onSelect,
                onDelete = onDelete,
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
                            (fadeIn(tween(240)) + slideInVertically(tween(240)) { it / 3 }) togetherWith
                                (fadeOut(tween(160)) + slideOutVertically(tween(160)) { -it / 4 })
                        },
                        label = "status",
                    ) { label ->
                        Text(
                            label,
                            color = if (state.status == ConnectionStatus.DISCONNECTED) InkMuted else Ink,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium,
                        )
                    }
                    AnimatedVisibility(
                        visible = state.status == ConnectionStatus.CONNECTED,
                        enter = fadeIn(tween(280)) + slideInVertically(tween(280)) { it / 2 },
                        exit = fadeOut(tween(160)),
                    ) {
                        Text(
                            "${formatDuration(state.connectedSince)}  ·  ↓ ${formatRate(state.rxRate)}  ·  ↑ ${formatRate(state.txRate)}",
                            color = InkMuted,
                            fontSize = 12.sp,
                            modifier = Modifier.padding(top = 6.dp),
                        )
                    }
                    AnimatedVisibility(visible = !state.error.isNullOrBlank()) {
                        Text(
                            state.error ?: "",
                            color = Ink,
                            fontSize = 13.sp,
                            modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp),
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun AccessChip(access: AccessUiState, onClick: () -> Unit) {
    val working = access.status == AccessStatus.WORKING
    val ok = access.status == AccessStatus.OK
    val label = when (access.status) {
        AccessStatus.IDLE -> "Доступ"
        AccessStatus.WORKING -> "Активирую"
        AccessStatus.OK -> "Активирован"
        AccessStatus.FAIL -> "Повторить"
    }
    val shape = RoundedCornerShape(20.dp)
    Text(
        label,
        color = if (ok) Canvas else Ink,
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium,
        modifier = Modifier
            .clip(shape)
            .background(if (ok) Ink else Color.Transparent)
            .border(1.dp, Ink.copy(alpha = 0.85f), shape)
            .clickable(enabled = !working, onClick = onClick)
            .padding(horizontal = 14.dp, vertical = 7.dp),
    )
}

@Composable
private fun ServerSheet(
    state: TunnelUiState,
    profiles: ProfileIndex,
    onCreateWarp: () -> Unit,
    onImport: () -> Unit,
    onSelect: (String) -> Unit,
    onDelete: (String) -> Unit,
) {
    Column(
        Modifier
            .fillMaxWidth()
            .navigationBarsPadding()
            .height(420.dp),
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .clickable(onClick = onCreateWarp)
                .padding(horizontal = 18.dp, vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                "Список серверов",
                color = Ink,
                fontSize = 17.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.weight(1f),
            )
            Text("${profiles.profiles.size}", color = InkMuted, fontSize = 13.sp)
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
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(bottom = 12.dp),
            ) {
                items(profiles.profiles, key = { it.id }) { profile ->
                    val preview = remember(profile.rawConfig) { ConfigParser.parse(profile.rawConfig) }
                    val active = profile.id == profiles.activeId
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .clickable { onSelect(profile.id) }
                            .background(if (active) Lift else Color.Transparent)
                            .padding(horizontal = 16.dp, vertical = 12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        FlagBadge(preview.endpoint, Modifier.padding(end = 12.dp))
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
                        if (active) {
                            Text("●", color = Ink, fontSize = 12.sp, modifier = Modifier.padding(end = 4.dp))
                        }
                        IconButton(onClick = { onDelete(profile.id) }, modifier = Modifier.size(36.dp)) {
                            Icon(Icons.Rounded.Delete, contentDescription = "Удалить", tint = InkMuted)
                        }
                    }
                }
            }
        }
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

private fun formatDuration(since: Long?): String {
    if (since == null) return "—"
    val sec = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - since).coerceAtLeast(0)
    val h = sec / 3600
    val m = (sec % 3600) / 60
    val s = sec % 60
    return if (h > 0) String.format(Locale.US, "%d:%02d:%02d", h, m, s)
    else String.format(Locale.US, "%02d:%02d", m, s)
}
