package com.nimbus.vpn.ui.importcfg

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.FolderOpen
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.data.ConfigParser
import com.nimbus.vpn.ui.components.GlassCard
import com.nimbus.vpn.ui.components.MeshBackground
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.theme.Cyan
import com.nimbus.vpn.ui.theme.Danger
import com.nimbus.vpn.ui.theme.NightElevated
import com.nimbus.vpn.ui.theme.Success
import com.nimbus.vpn.ui.theme.TextMuted
import com.nimbus.vpn.ui.theme.TextPrimary
import kotlinx.coroutines.launch

@Composable
fun ImportScreen(
    onBack: () -> Unit,
    onImportText: (name: String, raw: String) -> Result<*>,
    onImportUri: suspend (android.net.Uri, String) -> Result<*>,
) {
    var name by remember { mutableStateOf("") }
    var raw by remember { mutableStateOf("") }
    var message by remember { mutableStateOf<Pair<Boolean, String>?>(null) }
    val preview = remember(raw) { if (raw.isBlank()) null else ConfigParser.parse(raw) }
    val scope = rememberCoroutineScope()
    val picker = rememberLauncherForActivityResult(ActivityResultContracts.OpenDocument()) { uri ->
        if (uri != null) {
            scope.launch {
                val result = onImportUri(uri, uri.lastPathSegment ?: "imported")
                message = result.fold(
                    onSuccess = { true to "Конфиг сохранён" },
                    onFailure = { false to (it.message ?: "Ошибка импорта") },
                )
                if (result.isSuccess) onBack()
            }
        }
    }

    Box(Modifier.fillMaxSize()) {
        MeshBackground(ConnectionStatus.DISCONNECTED, animate = true, modifier = Modifier.fillMaxSize())
        Column(
            Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .verticalScroll(rememberScrollState())
                .padding(20.dp),
        ) {
            Row {
                IconButton(onClick = onBack) {
                    Icon(Icons.Rounded.ArrowBack, contentDescription = "Назад", tint = TextPrimary)
                }
                Column {
                    Text("Импорт", color = TextPrimary, fontSize = 22.sp)
                    Text("AmneziaWG · WireGuard .conf", color = TextMuted, fontSize = 13.sp)
                }
            }
            Spacer(Modifier.height(18.dp))
            Button(
                onClick = { picker.launch(arrayOf("text/*", "application/octet-stream", "*/*")) },
                colors = ButtonDefaults.buttonColors(containerColor = Cyan, contentColor = Color(0xFF04120F)),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth().height(52.dp),
            ) {
                Icon(Icons.Rounded.FolderOpen, contentDescription = null)
                Spacer(Modifier.padding(6.dp))
                Text("Выбрать файл .conf")
            }
            Spacer(Modifier.height(16.dp))
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                label = { Text("Имя профиля") },
                placeholder = { Text(preview?.endpoint?.substringBefore(":") ?: "Например, Germany") },
                modifier = Modifier.fillMaxWidth(),
                colors = fieldColors(),
            )
            Spacer(Modifier.height(10.dp))
            OutlinedTextField(
                value = raw,
                onValueChange = { raw = it },
                label = { Text("Вставь конфиг") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp),
                textStyle = androidx.compose.ui.text.TextStyle(fontFamily = FontFamily.Monospace, fontSize = 12.sp),
                colors = fieldColors(),
            )
            if (preview != null) {
                Spacer(Modifier.height(12.dp))
                GlassCard(Modifier.fillMaxWidth()) {
                    Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Text(
                            if (preview.canConnect) "Конфиг валиден" else "Нужно исправить",
                            color = if (preview.canConnect) Success else Danger,
                        )
                        Text("Endpoint: ${preview.endpoint ?: "—"}", color = TextMuted, fontSize = 13.sp)
                        Text(
                            if (preview.isAmnezia) "Обфускация AmneziaWG: да" else "Обычный WireGuard",
                            color = TextMuted,
                            fontSize = 13.sp,
                        )
                        preview.issues.forEach { Text("• $it", color = Danger, fontSize = 12.sp) }
                    }
                }
            }
            message?.let { (ok, text) ->
                Spacer(Modifier.height(8.dp))
                Text(text, color = if (ok) Success else Danger)
            }
            Spacer(Modifier.height(16.dp))
            Button(
                onClick = {
                    val result = onImportText(name, raw)
                    message = result.fold(
                        onSuccess = { true to "Сохранено" },
                        onFailure = { false to (it.message ?: "Ошибка") },
                    )
                    if (result.isSuccess) onBack()
                },
                enabled = !raw.isBlank(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8B7CFF), contentColor = TextPrimary),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth().height(52.dp),
            ) { Text("Сохранить профиль") }
        }
    }
}

@Composable
private fun fieldColors() = OutlinedTextFieldDefaults.colors(
    focusedTextColor = TextPrimary,
    unfocusedTextColor = TextPrimary,
    focusedContainerColor = NightElevated,
    unfocusedContainerColor = NightElevated,
    focusedBorderColor = Cyan,
    unfocusedBorderColor = Color.White.copy(alpha = 0.12f),
    cursorColor = Cyan,
    focusedLabelColor = Cyan,
    unfocusedLabelColor = TextMuted,
)
