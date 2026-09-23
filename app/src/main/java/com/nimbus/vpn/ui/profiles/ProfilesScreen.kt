package com.nimbus.vpn.ui.profiles

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.data.ConfigParser
import com.nimbus.vpn.data.SecTunnelProfile
import com.nimbus.vpn.data.ProfileIndex
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.components.ConfirmDeleteDialog
import com.nimbus.vpn.ui.components.DeleteServerButton
import com.nimbus.vpn.ui.components.MeshBackground
import com.nimbus.vpn.ui.home.FlagBadge
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.InkMuted
import com.nimbus.vpn.ui.theme.Line
import com.nimbus.vpn.ui.theme.Paper

private val Card = RoundedCornerShape(22.dp)

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
                .padding(horizontal = 20.dp, vertical = 8.dp),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = onBack) {
                    Icon(Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "Назад", tint = Ink)
                }
                Column(Modifier.weight(1f)) {
                    Text("Профили", color = Ink, fontSize = 26.sp, fontWeight = FontWeight.SemiBold)
                    Text("${index.profiles.size} конфигов", color = InkMuted, fontSize = 13.sp)
                }
                Text(
                    "Импорт",
                    color = Accent,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.clickable(onClick = onImport).padding(8.dp),
                )
            }
            Spacer(Modifier.height(12.dp))
            if (index.profiles.isEmpty()) {
                Text(
                    "Пока пусто. Импортируй .conf — Bozya VPN подхватит Address, DNS, MTU и поля Amnezia Jc/I1.",
                    color = InkMuted,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(Card)
                        .background(Paper)
                        .border(1.dp, Line, Card)
                        .padding(18.dp),
                )
            } else {
                LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    items(index.profiles, key = { it.id }) { profile ->
                        val endpoint = ConfigParser.endpointOf(profile.rawConfig)
                        val sec = SecTunnelProfile.read(profile.rawConfig)
                        val amnezia = ConfigParser.isAmneziaHint(profile.rawConfig)
                        val active = profile.id == index.activeId
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .clip(Card)
                                .background(Paper)
                                .border(1.dp, if (active) Accent else Line, Card)
                                .clickable { onSelect(profile.id) }
                                .padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            FlagBadge(endpoint, emoji = sec?.flag, badge = 40.dp)
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
                                    if (sec != null) "${sec.place} · sec-tunnel" else endpoint ?: "без endpoint",
                                    color = InkMuted,
                                    fontSize = 13.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )
                                Text(
                                    when {
                                        sec != null -> sec.name
                                        amnezia -> "AmneziaWG"
                                        else -> "WireGuard"
                                    },
                                    color = if (active) Accent else InkMuted,
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
