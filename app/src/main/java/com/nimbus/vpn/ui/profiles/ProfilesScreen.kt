package com.nimbus.vpn.ui.profiles

import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.data.ConfigParser
import com.nimbus.vpn.data.ProfileIndex
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.components.ConfirmDeleteDialog
import com.nimbus.vpn.ui.components.DeleteServerButton
import com.nimbus.vpn.ui.components.GlassCard
import com.nimbus.vpn.ui.components.MeshBackground
import com.nimbus.vpn.ui.theme.Cyan
import com.nimbus.vpn.ui.theme.TextMuted
import com.nimbus.vpn.ui.theme.TextPrimary

@Composable
fun ProfilesScreen(
    index: ProfileIndex,
    onBack: () -> Unit,
    onSelect: (String) -> Unit,
    onDelete: (String) -> Unit,
    onImport: () -> Unit,
) {
    var pendingDelete by remember { mutableStateOf<Pair<String, String>?>(null) }
    Box(Modifier.fillMaxSize()) {
        MeshBackground(ConnectionStatus.DISCONNECTED, animate = true, modifier = Modifier.fillMaxSize())
        Column(
            Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .padding(20.dp),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = onBack) {
                    Icon(Icons.Rounded.ArrowBack, contentDescription = "Назад", tint = TextPrimary)
                }
                Column(Modifier.weight(1f)) {
                    Text("Профили", color = TextPrimary, fontSize = 22.sp)
                    Text("${index.profiles.size} конфигов", color = TextMuted, fontSize = 13.sp)
                }
                Text("Импорт", color = Cyan, modifier = Modifier.clickable(onClick = onImport).padding(8.dp))
            }
            Spacer(Modifier.height(12.dp))
            if (index.profiles.isEmpty()) {
                GlassCard(Modifier.fillMaxWidth()) {
                    Text(
                        "Пока пусто. Импортируй .conf — Bozya VPN подхватит Address, DNS, MTU и Amnezia-поля Jc/I1.",
                        color = TextMuted,
                        modifier = Modifier.padding(18.dp),
                    )
                }
            } else {
                LazyColumn(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    items(index.profiles, key = { it.id }) { profile ->
                        val endpoint = ConfigParser.endpointOf(profile.rawConfig)
                        val amnezia = ConfigParser.isAmneziaHint(profile.rawConfig)
                        val active = profile.id == index.activeId
                        GlassCard(
                            Modifier
                                .fillMaxWidth()
                                .clickable { onSelect(profile.id) },
                        ) {
                            Row(
                                Modifier.padding(16.dp),
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                Column(Modifier.weight(1f)) {
                                    Text(
                                        profile.name,
                                        color = if (active) Cyan else TextPrimary,
                                        fontSize = 16.sp,
                                    )
                                    Text(endpoint ?: "без endpoint", color = TextMuted, fontSize = 13.sp)
                                    Text(
                                        if (amnezia) "AmneziaWG" else "WireGuard",
                                        color = TextMuted,
                                        fontSize = 12.sp,
                                    )
                                }
                                DeleteServerButton(
                                    onClick = { pendingDelete = profile.id to profile.name },
                                )
                            }
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
}
