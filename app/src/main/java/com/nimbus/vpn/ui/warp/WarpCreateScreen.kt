package com.nimbus.vpn.ui.warp

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.data.WarpConfigBuilder
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.WarpUiState
import com.nimbus.vpn.ui.coach.DogDock
import com.nimbus.vpn.ui.coach.DogMood
import com.nimbus.vpn.ui.coach.coachGlow
import com.nimbus.vpn.ui.components.MeshBackground
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Canvas
import com.nimbus.vpn.ui.theme.Danger
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.InkMuted
import com.nimbus.vpn.ui.theme.Lift
import com.nimbus.vpn.ui.theme.Line
import com.nimbus.vpn.ui.theme.Paper

private val Tile = RoundedCornerShape(22.dp)

@Composable
fun WarpCreateScreen(
    warp: WarpUiState,
    onBack: () -> Unit,
    onCreate: (countryId: String, lte: Boolean) -> Unit,
    onImport: () -> Unit,
    onCreated: () -> Unit,
    onConsumed: () -> Unit,
    guide: Boolean = false,
    dogX: Float = -1f,
    dogY: Float = -1f,
    onMoveDog: (Float, Float) -> Unit = { _, _ -> },
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
            runCatching { onCreated() }
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
                    Icon(Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "Назад", tint = Ink)
                }
                Column {
                    Text("Новый сервер", color = Ink, fontSize = 26.sp, fontWeight = FontWeight.SemiBold)
                    Text("Страна выхода", color = InkMuted, fontSize = 13.sp)
                }
            }
            Column(
                Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 20.dp),
            ) {
                Spacer(Modifier.height(8.dp))
                WarpConfigBuilder.countries.chunked(2).forEach { row ->
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .padding(bottom = 10.dp),
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                    ) {
                        row.forEach { item ->
                            CountryTile(
                                flag = item.flag,
                                name = item.name,
                                detail = if (item.hasLte) "есть LTE" else "обычный",
                                selected = item.id == countryId,
                                enabled = !warp.generating,
                                onClick = { countryId = item.id },
                                modifier = Modifier.weight(1f),
                            )
                        }
                        if (row.size == 1) Spacer(Modifier.weight(1f))
                    }
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .clip(Tile)
                        .background(Paper)
                        .border(1.dp, Line, Tile)
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Column(Modifier.weight(1f)) {
                        Text("LTE", color = Ink, fontWeight = FontWeight.Medium)
                        Text(
                            if (lteAvailable) "Мобильный адрес ${country?.lteHost}" else "У ${country?.name} нет LTE",
                            color = InkMuted,
                            fontSize = 12.sp,
                        )
                    }
                    Switch(
                        checked = lte && lteAvailable,
                        onCheckedChange = { lte = it },
                        enabled = lteAvailable && !warp.generating,
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Canvas,
                            checkedTrackColor = Accent,
                            uncheckedThumbColor = Paper,
                            uncheckedTrackColor = Line,
                            uncheckedBorderColor = Line,
                        ),
                    )
                }
                if (!warp.error.isNullOrBlank()) {
                    Text(
                        warp.error!!,
                        color = Danger,
                        fontSize = 13.sp,
                        modifier = Modifier.padding(top = 12.dp),
                    )
                }
                Spacer(Modifier.height(16.dp))
            }
            Column(Modifier.padding(horizontal = 20.dp, vertical = 8.dp)) {
                Button(
                    onClick = { onCreate(countryId, lte && lteAvailable) },
                    enabled = !warp.generating,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Accent,
                        contentColor = Canvas,
                        disabledContainerColor = Line,
                        disabledContentColor = InkMuted,
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(54.dp)
                        .coachGlow(guide && !warp.generating),
                ) {
                    if (warp.generating) {
                        CircularProgressIndicator(
                            modifier = Modifier.height(20.dp),
                            color = Canvas,
                            strokeWidth = 2.dp,
                        )
                        Spacer(Modifier.padding(6.dp))
                        Text("Собираю…")
                    } else {
                        Text("Создать ${preview.name}", fontWeight = FontWeight.SemiBold)
                    }
                }
                Text(
                    "Или вставить свой .conf",
                    color = InkMuted,
                    fontSize = 13.sp,
                    modifier = Modifier
                        .padding(top = 12.dp, bottom = 6.dp)
                        .align(Alignment.CenterHorizontally)
                        .clickable(onClick = onImport),
                )
            }
        }
        if (guide) {
            DogDock(
                mood = DogMood.POINT,
                message = "Выбери страну и нажми светящуюся кнопку «Создать» внизу.",
                action = null,
                onAction = null,
                joyPulse = 0,
                anchorX = dogX,
                anchorY = dogY,
                onAnchor = onMoveDog,
                modifier = Modifier.fillMaxSize(),
            )
        }
    }
}

@Composable
private fun CountryTile(
    flag: String,
    name: String,
    detail: String,
    selected: Boolean,
    enabled: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier
            .height(108.dp)
            .clip(Tile)
            .background(if (selected) Lift else Paper)
            .border(if (selected) 1.5.dp else 1.dp, if (selected) Accent else Line, Tile)
            .clickable(enabled = enabled, onClick = onClick)
            .padding(14.dp),
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(flag, fontSize = 26.sp)
        Column {
            Text(name, color = Ink, fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Normal, fontSize = 15.sp)
            Text(detail, color = if (selected) Accent else InkMuted, fontSize = 12.sp, textAlign = TextAlign.Start)
        }
    }
}
