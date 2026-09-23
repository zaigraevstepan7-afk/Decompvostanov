package com.nimbus.vpn.ui.settings

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.drawable.toBitmap
import com.nimbus.vpn.data.BankBypass
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.components.MeshBackground
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Canvas
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.InkMuted
import com.nimbus.vpn.ui.theme.Line
import com.nimbus.vpn.ui.theme.Paper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

private val Card = RoundedCornerShape(28.dp)
private val Field = RoundedCornerShape(18.dp)
private val IconShape = RoundedCornerShape(12.dp)

data class BypassApp(
    val packageName: String,
    val label: String,
    val icon: ImageBitmap?,
)

fun queryLaunchableApps(context: Context): List<BypassApp> {
    val pm = context.packageManager
    val launcher = Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_LAUNCHER)
    val resolved = if (Build.VERSION.SDK_INT >= 33) {
        pm.queryIntentActivities(launcher, PackageManager.ResolveInfoFlags.of(0L))
    } else {
        @Suppress("DEPRECATION")
        pm.queryIntentActivities(launcher, 0)
    }
    val seen = LinkedHashMap<String, BypassApp>()
    val iconPx = (context.resources.displayMetrics.density * 40f).toInt().coerceIn(40, 128)
    for (info in resolved) {
        val pkg = info.activityInfo?.packageName ?: continue
        if (pkg == context.packageName || seen.containsKey(pkg)) continue
        val label = info.loadLabel(pm)?.toString()?.ifBlank { pkg } ?: pkg
        val icon = runCatching {
            info.loadIcon(pm)?.toBitmap(iconPx, iconPx)?.asImageBitmap()
        }.getOrNull()
        seen[pkg] = BypassApp(pkg, label, icon)
    }
    return seen.values.sortedWith(compareBy(String.CASE_INSENSITIVE_ORDER) { it.label })
}

fun bypassSummary(count: Int): String = when (count) {
    0 -> "Все через туннель"
    else -> "$count ${appsWord(count)} мимо туннеля"
}

private fun appsWord(count: Int): String {
    val mod100 = count % 100
    val mod10 = count % 10
    return when {
        mod100 in 11..14 -> "приложений"
        mod10 == 1 -> "приложение"
        mod10 in 2..4 -> "приложения"
        else -> "приложений"
    }
}

@Composable
fun BypassAppsScreen(
    selected: Set<String>,
    tunnelUp: Boolean,
    onBack: () -> Unit,
    onChange: (Set<String>) -> Unit,
    onReconnect: () -> Unit,
) {
    val context = LocalContext.current
    val started = remember { selected }
    var chosen by remember { mutableStateOf(selected) }
    var query by remember { mutableStateOf("") }
    var apps by remember { mutableStateOf<List<BypassApp>?>(null) }
    var bankNote by remember { mutableStateOf<String?>(null) }
    LaunchedEffect(Unit) {
        apps = withContext(Dispatchers.IO) { queryLaunchableApps(context) }
    }
    fun leave() {
        if (chosen != started && tunnelUp) onReconnect()
        onBack()
    }
    BackHandler { leave() }
    val shown = apps.orEmpty().filter { app ->
        val needle = query.trim()
        needle.isEmpty() ||
            app.label.contains(needle, ignoreCase = true) ||
            app.packageName.contains(needle, ignoreCase = true)
    }
    Box(Modifier.fillMaxSize()) {
        MeshBackground(ConnectionStatus.DISCONNECTED, animate = true, modifier = Modifier.fillMaxSize())
        Column(
            Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .navigationBarsPadding()
                .padding(horizontal = 20.dp, vertical = 8.dp),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = ::leave) {
                    Icon(Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "Назад", tint = Ink)
                }
                Column(Modifier.weight(1f)) {
                    Text("Выбор приложений", color = Ink, fontSize = 26.sp, fontWeight = FontWeight.SemiBold)
                    Text(bypassSummary(chosen.size), color = InkMuted, fontSize = 13.sp)
                }
            }
            Spacer(Modifier.height(12.dp))
            Text(
                "Отметь банк, карты и всё, что должно идти мимо туннеля. Остальное пойдёт через VPN.",
                color = InkMuted,
                fontSize = 13.sp,
            )
            Spacer(Modifier.height(8.dp))
            Text(
                if (tunnelUp) {
                    "Туннель уже включён: он переподключится, когда выйдешь назад."
                } else {
                    "Список применится при следующем включении."
                },
                color = InkMuted,
                fontSize = 13.sp,
            )
            Spacer(Modifier.height(14.dp))
            Button(
                onClick = {
                    val installed = apps.orEmpty().map { it.packageName }.toSet()
                    val match = BankBypass.matching(installed)
                    if (match.isEmpty()) {
                        bankNote = "Банковских приложений не нашлось"
                    } else {
                        val next = chosen + match.toSet()
                        chosen = next
                        onChange(next)
                        bankNote = "Добавлено ${match.size}"
                    }
                },
                enabled = apps != null,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Accent,
                    contentColor = Canvas,
                    disabledContainerColor = Line,
                    disabledContentColor = InkMuted,
                ),
                shape = Field,
                modifier = Modifier.fillMaxWidth().height(48.dp),
            ) {
                Text("Банк и карты мимо", fontWeight = FontWeight.SemiBold)
            }
            bankNote?.let { note ->
                Text(
                    note,
                    color = InkMuted,
                    fontSize = 13.sp,
                    modifier = Modifier.padding(top = 6.dp, start = 4.dp),
                )
            }
            Spacer(Modifier.height(12.dp))
            OutlinedTextField(
                value = query,
                onValueChange = { query = it },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                placeholder = { Text("Поиск") },
                shape = Field,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = Ink,
                    unfocusedTextColor = Ink,
                    focusedContainerColor = Paper,
                    unfocusedContainerColor = Paper,
                    focusedBorderColor = Accent,
                    unfocusedBorderColor = Line,
                    cursorColor = Accent,
                    focusedPlaceholderColor = InkMuted,
                    unfocusedPlaceholderColor = InkMuted,
                ),
            )
            Spacer(Modifier.height(12.dp))
            when {
                apps == null -> {
                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        CircularProgressIndicator(color = Accent)
                    }
                }
                shown.isEmpty() -> {
                    Text(
                        if (apps.orEmpty().isEmpty()) "Нет приложений с иконкой на экране" else "Ничего не нашлось",
                        color = InkMuted,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = 12.dp, start = 4.dp),
                    )
                }
                else -> {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .clip(Card)
                            .background(Paper)
                            .border(1.dp, Line, Card),
                        verticalArrangement = Arrangement.Top,
                    ) {
                        items(shown, key = { it.packageName }) { app ->
                            val checked = app.packageName in chosen
                            Row(
                                Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        val next = if (checked) chosen - app.packageName else chosen + app.packageName
                                        chosen = next
                                        onChange(next)
                                    }
                                    .padding(horizontal = 14.dp, vertical = 10.dp),
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                if (app.icon != null) {
                                    Image(
                                        bitmap = app.icon,
                                        contentDescription = null,
                                        modifier = Modifier.size(40.dp).clip(IconShape),
                                    )
                                } else {
                                    Spacer(Modifier.size(40.dp))
                                }
                                Column(Modifier.weight(1f).padding(horizontal = 12.dp)) {
                                    Text(app.label, color = Ink, fontWeight = FontWeight.Medium, fontSize = 15.sp)
                                    Text(app.packageName, color = InkMuted, fontSize = 12.sp)
                                }
                                Checkbox(
                                    checked = checked,
                                    onCheckedChange = null,
                                    colors = CheckboxDefaults.colors(
                                        checkedColor = Accent,
                                        uncheckedColor = InkMuted,
                                        checkmarkColor = Canvas,
                                    ),
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
