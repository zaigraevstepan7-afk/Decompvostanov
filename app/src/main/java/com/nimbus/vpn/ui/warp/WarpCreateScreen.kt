package com.nimbus.vpn.ui.warp

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.data.WarpConfigBuilder
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.WarpUiState
import com.nimbus.vpn.ui.components.MeshBackground
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.InkMuted
import com.nimbus.vpn.ui.theme.Line
import com.nimbus.vpn.ui.theme.Paper

private val CardShape = RoundedCornerShape(18.dp)

@Composable
fun WarpCreateScreen(
    warp: WarpUiState,
    onBack: () -> Unit,
    onCreate: (countryId: String, lte: Boolean) -> Unit,
    onImport: () -> Unit,
    onCreated: () -> Unit,
    onConsumed: () -> Unit,
) {
    var countryId by remember { mutableStateOf("de") }
    var lte by remember { mutableStateOf(false) }
    val country = WarpConfigBuilder.country(countryId)
    val lteAvailable = country?.hasLte == true
    val preview = remember(countryId, lte) { WarpConfigBuilder.resolve(countryId, lte && lteAvailable) }

    LaunchedEffect(lteAvailable) {
        if (!lteAvailable) lte = false
    }
    LaunchedEffect(warp.created) {
        if (warp.created) {
            onConsumed()
            onCreated()
        }
    }

    Box(Modifier.fillMaxSize()) {
        MeshBackground(ConnectionStatus.DISCONNECTED, animate = true, modifier = Modifier.fillMaxSize())
        Column(
            Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .navigationBarsPadding(),
        ) {
            Row(
                Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                IconButton(onClick = onBack) {
                    Icon(Icons.Rounded.ArrowBack, contentDescription = "Назад", tint = Ink)
                }
                Column {
                    Text("Создать WARP", color = Ink, fontSize = 22.sp)
                    Text("Страна и LTE — как на generator-config-warp", color = InkMuted, fontSize = 13.sp)
                }
            }
            Column(
                Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 20.dp),
            ) {
                Spacer(Modifier.height(10.dp))
                WarpConfigBuilder.countries.forEach { item ->
                    val selected = item.id == countryId
                    Row(
                        Modifier
                            .padding(bottom = 8.dp)
                            .fillMaxWidth()
                            .clip(CardShape)
                            .border(if (selected) 2.dp else 1.dp, if (selected) Ink else Line, CardShape)
                            .background(if (selected) Color(0xFFF6F6F7) else Paper)
                            .clickable(enabled = !warp.generating) { countryId = item.id }
                            .padding(horizontal = 16.dp, vertical = 14.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(item.flag, fontSize = 22.sp, modifier = Modifier.padding(end = 12.dp))
                        Column(Modifier.weight(1f)) {
                            Text(
                                item.name,
                                color = Ink,
                                fontSize = 16.sp,
                                fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Normal,
                            )
                            Text(
                                if (item.hasLte) "Обычный и LTE" else item.host,
                                color = InkMuted,
                                fontSize = 12.sp,
                            )
                        }
                        if (selected) Text("•", color = Ink, fontSize = 22.sp)
                    }
                }
                Spacer(Modifier.height(8.dp))
                Row(
                    Modifier
                        .fillMaxWidth()
                        .clip(CardShape)
                        .background(Paper)
                        .border(1.dp, Line, CardShape)
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Column(Modifier.weight(1f)) {
                        Text("LTE", color = Ink, fontWeight = FontWeight.Medium)
                        Text(
                            if (lteAvailable) {
                                "Endpoint ${country?.lteHost}"
                            } else {
                                "Для ${country?.name ?: "этой страны"} LTE нет"
                            },
                            color = InkMuted,
                            fontSize = 13.sp,
                        )
                    }
                    Switch(
                        checked = lte && lteAvailable,
                        onCheckedChange = { lte = it },
                        enabled = lteAvailable && !warp.generating,
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Paper,
                            checkedTrackColor = Ink,
                            uncheckedThumbColor = Paper,
                            uncheckedTrackColor = Line,
                            uncheckedBorderColor = Line,
                            disabledCheckedTrackColor = Line,
                            disabledUncheckedTrackColor = Line,
                        ),
                    )
                }
                Text(
                    "Будет создан «${preview.name}» → ${preview.host}. Ключи Cloudflare запрашиваются в приложении, ничего копировать не нужно.",
                    color = InkMuted,
                    fontSize = 13.sp,
                    modifier = Modifier.padding(top = 14.dp),
                )
                if (!warp.error.isNullOrBlank()) {
                    Text(warp.error!!, color = Ink, fontSize = 13.sp, modifier = Modifier.padding(top = 10.dp))
                }
                Spacer(Modifier.height(16.dp))
            }
            Column(Modifier.padding(horizontal = 20.dp, vertical = 12.dp)) {
                Button(
                    onClick = { onCreate(countryId, lte && lteAvailable) },
                    enabled = !warp.generating,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Ink,
                        contentColor = Paper,
                        disabledContainerColor = Line,
                        disabledContentColor = Ink,
                    ),
                    shape = CardShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp),
                ) {
                    if (warp.generating) {
                        CircularProgressIndicator(
                            modifier = Modifier.size(20.dp),
                            color = Paper,
                            strokeWidth = 2.dp,
                        )
                        Spacer(Modifier.size(10.dp))
                        Text("Создаю…")
                    } else {
                        Text("Создать ${preview.name}")
                    }
                }
                Text(
                    "Или вставить свой .conf",
                    color = Ink,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 14.dp, bottom = 4.dp)
                        .align(Alignment.CenterHorizontally)
                        .clickable(onClick = onImport),
                )
            }
        }
    }
}
