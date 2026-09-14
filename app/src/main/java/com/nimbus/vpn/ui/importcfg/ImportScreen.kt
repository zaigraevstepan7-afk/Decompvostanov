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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.data.ConfigParser
import com.nimbus.vpn.data.ParsedConfigPreview
import com.nimbus.vpn.ui.components.GlassCard
import com.nimbus.vpn.ui.components.MeshBackground
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.InkMuted
import com.nimbus.vpn.ui.theme.Line
import com.nimbus.vpn.ui.theme.Paper
import com.nimbus.vpn.ui.theme.Danger
import com.nimbus.vpn.ui.theme.Success
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

private val FieldShape = RoundedCornerShape(22.dp)
private val PlaceholderGray = Color(0xFF8A8A8A)

@Composable
fun ImportScreen(
    onBack: () -> Unit,
    onImportText: (name: String, raw: String) -> Result<*>,
    onImportUri: suspend (android.net.Uri, String) -> Result<*>,
) {
    var name by remember { mutableStateOf("") }
    var raw by remember { mutableStateOf("") }
    var message by remember { mutableStateOf<Pair<Boolean, String>?>(null) }
    var preview by remember { mutableStateOf<ParsedConfigPreview?>(null) }
    val scope = rememberCoroutineScope()
    LaunchedEffect(raw) {
        if (raw.isBlank()) {
            preview = null
            return@LaunchedEffect
        }
        delay(220)
        preview = withContext(Dispatchers.Default) { ConfigParser.parse(raw) }
    }
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
                    Icon(Icons.Rounded.ArrowBack, contentDescription = "Назад", tint = Ink)
                }
                Column {
                    Text("Импорт", color = Ink, fontSize = 22.sp)
                    Text("AmneziaWG · WireGuard .conf", color = InkMuted, fontSize = 13.sp)
                }
            }
            Spacer(Modifier.height(18.dp))
            Button(
                onClick = { picker.launch(arrayOf("text/*", "application/octet-stream", "*/*")) },
                colors = ButtonDefaults.buttonColors(containerColor = Ink, contentColor = com.nimbus.vpn.ui.theme.Canvas),
                shape = FieldShape,
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
                placeholder = { Text("Имя профиля", color = PlaceholderGray, fontSize = 16.sp) },
                singleLine = true,
                shape = FieldShape,
                textStyle = TextStyle(color = Ink, fontSize = 16.sp),
                modifier = Modifier.fillMaxWidth(),
                colors = fieldColors(),
            )
            Spacer(Modifier.height(10.dp))
            OutlinedTextField(
                value = raw,
                onValueChange = { raw = it },
                placeholder = { Text("Вставь конфиг", color = PlaceholderGray, fontSize = 16.sp) },
                shape = FieldShape,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp),
                textStyle = TextStyle(color = Ink, fontFamily = FontFamily.Monospace, fontSize = 14.sp),
                colors = fieldColors(),
            )
            preview?.let { parsed ->
                Spacer(Modifier.height(12.dp))
                GlassCard(Modifier.fillMaxWidth()) {
                    Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Text(
                            if (parsed.canConnect) "Конфиг валиден" else "Нужно исправить",
                            color = if (parsed.canConnect) Success else Danger,
                        )
                        Text("Endpoint: ${parsed.endpoint ?: "—"}", color = InkMuted, fontSize = 13.sp)
                        Text(
                            if (parsed.isAmnezia) "Обфускация AmneziaWG: да" else "Обычный WireGuard",
                            color = InkMuted,
                            fontSize = 13.sp,
                        )
                        parsed.issues.forEach { Text("• $it", color = Danger, fontSize = 12.sp) }
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
                    val result = try {
                        onImportText(name, raw)
                    } catch (t: Throwable) {
                        Result.failure<Any>(t)
                    }
                    message = result.fold(
                        onSuccess = { true to "Сохранено" },
                        onFailure = { false to (it.message ?: "Ошибка") },
                    )
                    if (result.isSuccess) onBack()
                },
                enabled = !raw.isBlank(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Ink,
                    contentColor = com.nimbus.vpn.ui.theme.Canvas,
                    disabledContainerColor = Line,
                    disabledContentColor = Ink,
                ),
                shape = FieldShape,
                modifier = Modifier.fillMaxWidth().height(52.dp),
            ) { Text("Сохранить профиль") }
        }
    }
}

@Composable
private fun fieldColors() = OutlinedTextFieldDefaults.colors(
    focusedTextColor = Ink,
    unfocusedTextColor = Ink,
    disabledTextColor = Ink,
    focusedContainerColor = Paper,
    unfocusedContainerColor = Paper,
    disabledContainerColor = Paper,
    focusedBorderColor = Ink,
    unfocusedBorderColor = Line,
    cursorColor = Ink,
    focusedPlaceholderColor = PlaceholderGray,
    unfocusedPlaceholderColor = PlaceholderGray,
)
