package com.nimbus.vpn.ui.settings

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.data.AppSettings
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.tunnel.RootPowerManager
import com.nimbus.vpn.ui.components.GlassCard
import com.nimbus.vpn.ui.components.MeshBackground
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.InkMuted
import com.nimbus.vpn.ui.theme.Line
import com.nimbus.vpn.ui.theme.Paper
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.foundation.shape.RoundedCornerShape

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
) {
    Box(Modifier.fillMaxSize()) {
        MeshBackground(ConnectionStatus.DISCONNECTED, animate = true, modifier = Modifier.fillMaxSize())
        Column(
            Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .verticalScroll(rememberScrollState())
                .padding(20.dp),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = onBack) {
                    Icon(Icons.Rounded.ArrowBack, contentDescription = "Назад", tint = Ink)
                }
                Text("Настройки", color = Ink, fontSize = 22.sp)
            }
            Spacer(Modifier.height(16.dp))
            GlassCard(Modifier.fillMaxWidth()) {
                Column(Modifier.padding(18.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text("Фон и батарея", color = Ink, fontSize = 13.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Medium)
                    Text(root.message, color = InkMuted, fontSize = 13.sp)
                    Text(
                        "Туннель живёт в VpnService. Анимации гаснут, когда экран не смотрит на приложение. " +
                            "С root Bozya VPN добавляет себя в whitelist Doze — без глобального «производительного режима», который жрёт батарею.",
                        color = InkMuted,
                        fontSize = 13.sp,
                    )
                }
            }
            Spacer(Modifier.height(12.dp))
            ToggleRow("Автоподключение", "После перезагрузки и обрыва", settings.autoConnect, onAutoConnect)
            Spacer(Modifier.height(10.dp))
            ToggleRow("Kill switch", "Always-on lockdown через root, если доступен", settings.killSwitch, onKillSwitch)
            Spacer(Modifier.height(10.dp))
            ToggleRow("Root-защита батареи", "Whitelist, appops, без разгона CPU", settings.rootBatteryGuard, onRootBattery)
            Spacer(Modifier.height(16.dp))
            GlassCard(Modifier.fillMaxWidth()) {
                Column(Modifier.padding(18.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text("WARP", color = Ink, fontSize = 13.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Medium)
                    Text(
                        "Выбери страну и LTE в приложении. Bozya VPN запросит ключи Cloudflare и соберёт AmneziaWG-конфиг — без сайта и копирования.",
                        color = InkMuted,
                        fontSize = 13.sp,
                    )
                    Button(
                        onClick = onCreateWarp,
                        colors = ButtonDefaults.buttonColors(containerColor = Ink, contentColor = com.nimbus.vpn.ui.theme.Canvas),
                        shape = RoundedCornerShape(18.dp),
                        modifier = Modifier.fillMaxWidth().height(46.dp),
                    ) {
                        Text("Создать WARP")
                    }
                }
            }
            Spacer(Modifier.height(16.dp))
            GlassCard(Modifier.fillMaxWidth()) {
                Column(
                    Modifier
                        .fillMaxWidth()
                        .padding(18.dp)
                        .padding(bottom = 4.dp),
                ) {
                    Text("Игнор оптимизации батареи", color = Ink)
                    Text(
                        "Системный диалог Android. Нажми, если OEM всё равно режет фон.",
                        color = InkMuted,
                        fontSize = 13.sp,
                        modifier = Modifier.padding(top = 6.dp, bottom = 8.dp),
                    )
                    androidx.compose.material3.TextButton(onClick = onBatteryExemption) {
                        Text("Запросить исключение", color = Ink)
                    }
                }
            }
        }
    }
}

@Composable
private fun ToggleRow(title: String, subtitle: String, checked: Boolean, onChange: (Boolean) -> Unit) {
    GlassCard(Modifier.fillMaxWidth()) {
        Row(
            Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(Modifier.weight(1f)) {
                Text(title, color = Ink)
                Text(subtitle, color = InkMuted, fontSize = 13.sp)
            }
            Switch(
                checked = checked,
                onCheckedChange = onChange,
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Paper,
                    checkedTrackColor = Ink,
                    uncheckedThumbColor = Paper,
                    uncheckedTrackColor = Line,
                    uncheckedBorderColor = Line,
                ),
            )
        }
    }
}
