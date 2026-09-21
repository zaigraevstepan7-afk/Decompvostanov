package com.nimbus.vpn.ui.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
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
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.CrashLog
import com.nimbus.vpn.data.AppSettings
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.tunnel.RootPowerManager
import com.nimbus.vpn.ui.coach.CoachStep
import com.nimbus.vpn.ui.coach.CrabDock
import com.nimbus.vpn.ui.coach.CrabMood
import com.nimbus.vpn.ui.coach.coachGlow
import com.nimbus.vpn.ui.components.MeshBackground
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Canvas
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.InkMuted
import com.nimbus.vpn.ui.theme.Lift
import com.nimbus.vpn.ui.theme.Line
import com.nimbus.vpn.ui.theme.Paper

private val Card = RoundedCornerShape(28.dp)
private val Pill = RoundedCornerShape(16.dp)

@Composable
fun SettingsScreen(
    settings: AppSettings,
    root: RootPowerManager.Status,
    onBack: () -> Unit,
    onAutoConnect: (Boolean) -> Unit,
    onKillSwitch: (Boolean) -> Unit,
    onRootBattery: (Boolean) -> Unit,
    onBatteryExemption: () -> Unit,
    onCreateWarp: () -> Unit,
    onAccessLink: (Int) -> Unit,
    onCoachNext: () -> Unit,
    onCoachOpened: () -> Unit,
) {
    val context = LocalContext.current
    val crash = remember { CrashLog.summary(context) }
    val step = CoachStep.from(settings.coachStep)
    LaunchedEffect(step) {
        if (step == CoachStep.SETTINGS) onCoachOpened()
    }
    val tourLine = when (step) {
        CoachStep.TOUR_AUTO -> "Автоподключение само поднимает туннель после перезагрузки и если связь оборвалась."
        CoachStep.TOUR_KILL -> "Kill switch не пускает трафик мимо VPN. Без root переключатель только запоминается."
        CoachStep.TOUR_LINK -> "Кнопка «Доступ» на главной открывает ссылку, которую выберешь здесь. Их две."
        CoachStep.TOUR_BATTERY -> "Исключение из батареи не даёт Android усыпить туннель. С root Bozya делает это сама."
        else -> null
    }
    val killSubtitle = if (root.rooted) {
        "Блокирует трафик, пока VPN выключен"
    } else {
        "Нужен root. Без него переключатель только запоминается"
    }
    Box(Modifier.fillMaxSize()) {
        MeshBackground(ConnectionStatus.DISCONNECTED, animate = true, modifier = Modifier.fillMaxSize())
        Column(
            Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .navigationBarsPadding()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 20.dp, vertical = 8.dp),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = onBack) {
                    Icon(Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "Назад", tint = Ink)
                }
                Column {
                    Text("Настройки", color = Ink, fontSize = 26.sp, fontWeight = FontWeight.SemiBold)
                    Text("туннель и доступ", color = InkMuted, fontSize = 13.sp)
                }
            }
            Spacer(Modifier.height(18.dp))
            SectionLabel("Поведение")
            Column(
                Modifier
                    .fillMaxWidth()
                    .coachGlow(step == CoachStep.TOUR_AUTO || step == CoachStep.TOUR_KILL)
                    .clip(Card)
                    .background(Paper)
                    .border(1.dp, Line, Card),
            ) {
                ToggleRow("Автоподключение", "После перезагрузки и обрыва", settings.autoConnect, onAutoConnect)
                HorizontalDivider(color = Line, thickness = 1.dp)
                ToggleRow("Kill switch", killSubtitle, settings.killSwitch, onKillSwitch)
                HorizontalDivider(color = Line, thickness = 1.dp)
                ToggleRow(
                    "Root-защита батареи",
                    "Whitelist, appops, без разгона CPU",
                    settings.rootBatteryGuard,
                    onRootBattery,
                )
            }
            Spacer(Modifier.height(22.dp))
            SectionLabel("Подтверждение доступа")
            Column(
                Modifier
                    .fillMaxWidth()
                    .coachGlow(step == CoachStep.TOUR_LINK)
                    .clip(Card)
                    .background(Paper)
                    .border(1.dp, Line, Card)
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                Text(
                    "Кнопка «Доступ» на главной открывает выбранную ссылку.",
                    color = InkMuted,
                    fontSize = 13.sp,
                )
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                ) {
                    AccessLinkChoice(
                        label = "Ссылка 1",
                        selected = settings.accessLink != 2,
                        onClick = { onAccessLink(1) },
                    )
                    AccessLinkChoice(
                        label = "Ссылка 2",
                        selected = settings.accessLink == 2,
                        onClick = { onAccessLink(2) },
                    )
                }
            }
            Spacer(Modifier.height(22.dp))
            SectionLabel("Батарея")
            Column(
                Modifier
                    .fillMaxWidth()
                    .coachGlow(step == CoachStep.TOUR_BATTERY)
                    .clip(Card)
                    .background(Paper)
                    .border(1.dp, Line, Card)
                    .padding(16.dp),
            ) {
                Text(root.message, color = Ink, fontSize = 14.sp)
                Text(
                    "Туннель живёт в VpnService. Анимации гаснут, когда экран не смотрит на приложение. " +
                        "С root Bozya VPN добавляет себя в whitelist Doze — без глобального «производительного режима».",
                    color = InkMuted,
                    fontSize = 13.sp,
                    modifier = Modifier.padding(top = 8.dp),
                )
                TextButton(onClick = onBatteryExemption, modifier = Modifier.padding(top = 4.dp)) {
                    Text("Запросить исключение", color = Accent, fontWeight = FontWeight.Medium)
                }
            }
            Spacer(Modifier.height(22.dp))
            Button(
                onClick = onCreateWarp,
                colors = ButtonDefaults.buttonColors(containerColor = Accent, contentColor = Canvas),
                shape = Pill,
                modifier = Modifier.fillMaxWidth().height(52.dp),
            ) {
                Text("Создать WARP", fontWeight = FontWeight.SemiBold)
            }
            if (crash != null) {
                Spacer(Modifier.height(22.dp))
                SectionLabel("Последний сбой")
                Text(crash, color = InkMuted, fontSize = 12.sp)
            }
            Spacer(Modifier.height(if (tourLine != null) 210.dp else 16.dp))
        }
        if (tourLine != null) {
            CrabDock(
                mood = CrabMood.POINT,
                message = tourLine,
                action = if (step == CoachStep.TOUR_BATTERY) "Понятно" else "Дальше",
                onAction = onCoachNext,
                joyPulse = 0,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .navigationBarsPadding()
                    .padding(start = 16.dp, end = 16.dp, bottom = 12.dp),
            )
        }
    }
}

@Composable
private fun SectionLabel(text: String) {
    Text(
        text,
        color = Ink,
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold,
        modifier = Modifier.padding(bottom = 10.dp, start = 4.dp),
    )
}

@Composable
private fun ToggleRow(title: String, subtitle: String, checked: Boolean, onChange: (Boolean) -> Unit) {
    Row(
        Modifier.padding(horizontal = 16.dp, vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(Modifier.weight(1f).padding(end = 12.dp)) {
            Text(title, color = Ink, fontWeight = FontWeight.Medium)
            Text(subtitle, color = InkMuted, fontSize = 13.sp)
        }
        Switch(
            checked = checked,
            onCheckedChange = onChange,
            colors = SwitchDefaults.colors(
                checkedThumbColor = Canvas,
                checkedTrackColor = Accent,
                uncheckedThumbColor = Paper,
                uncheckedTrackColor = Line,
                uncheckedBorderColor = Line,
            ),
        )
    }
}

@Composable
private fun RowScope.AccessLinkChoice(
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .weight(1f)
            .height(48.dp)
            .clip(Pill)
            .background(if (selected) Lift else Canvas)
            .border(if (selected) 1.5.dp else 1.dp, if (selected) Accent else Line, Pill)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            label,
            color = if (selected) Accent else Ink,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
        )
    }
}
