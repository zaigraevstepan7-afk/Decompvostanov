package com.nimbus.vpn.ui.importcfg

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.data.ConfigParser
import com.nimbus.vpn.data.ProfileBundle
import com.nimbus.vpn.data.ParsedConfigPreview
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.components.MeshBackground
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Canvas
import com.nimbus.vpn.ui.theme.Danger
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.InkMuted
import com.nimbus.vpn.ui.theme.Lift
import com.nimbus.vpn.ui.theme.Line
import com.nimbus.vpn.ui.theme.Paper
import com.nimbus.vpn.ui.theme.Success
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

private val Card = RoundedCornerShape(28.dp)
private val Field = RoundedCornerShape(18.dp)
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
    var bundleCount by remember { mutableStateOf<Int?>(null) }
    val scope = rememberCoroutineScope()
    LaunchedEffect(raw) {
        if (raw.isBlank()) {
            preview = null
            bundleCount = null
            return@LaunchedEffect
        }
        delay(220)
        val bundle = withContext(Dispatchers.Default) { ProfileBundle.parse(raw) }
        if (bundle != null) {
            bundleCount = bundle.profiles.size
            preview = null
        } else {
            bundleCount = null
            preview = withContext(Dispatchers.Default) { ConfigParser.parse(raw) }
        }
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
                .navigationBarsPadding()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 20.dp, vertical = 8.dp),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = onBack) {
                    Icon(Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "Назад", tint = Ink)
                }
                Column {
                    Text("Свой конфиг", color = Ink, fontSize = 26.sp, fontWeight = FontWeight.SemiBold)
                    Text("AmneziaWG, WireGuard или список серверов", color = InkMuted, fontSize = 13.sp)
                }
            }
            Spacer(Modifier.height(18.dp))
            Button(
                onClick = { picker.launch(arrayOf("text/*", "application/octet-stream", "*/*")) },
                colors = ButtonDefaults.buttonColors(containerColor = Lift, contentColor = Ink),
                shape = Field,
                modifier = Modifier.fillMaxWidth().height(52.dp),
            ) {
                Icon(Icons.Rounded.FolderOpen, contentDescription = null)
                Spacer(Modifier.padding(6.dp))
                Text("Выбрать файл .conf", fontWeight = FontWeight.Medium)
            }
            Spacer(Modifier.height(14.dp))
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                placeholder = { Text("Имя профиля", color = PlaceholderGray, fontSize = 16.sp) },
                singleLine = true,
                shape = Field,
                textStyle = TextStyle(color = Ink, fontSize = 16.sp),
                modifier = Modifier.fillMaxWidth(),
                colors = fieldColors(),
            )
            Spacer(Modifier.height(10.dp))
            OutlinedTextField(
                value = raw,
                onValueChange = { raw = it },
                placeholder = { Text("Вставь конфиг", color = PlaceholderGray, fontSize = 16.sp) },
                shape = Field,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp),
                textStyle = TextStyle(color = Ink, fontFamily = FontFamily.Monospace, fontSize = 14.sp),
                colors = fieldColors(),
            )
            bundleCount?.let { count ->
                Spacer(Modifier.height(12.dp))
                Text(
                    "Серверов в файле: $count",
                    color = Success,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(Card)
                        .background(Paper)
                        .border(1.dp, Accent, Card)
                        .padding(16.dp),
                )
            }
            preview?.let { parsed ->
                Spacer(Modifier.height(12.dp))
                Column(
                    Modifier
                        .fillMaxWidth()
                        .clip(Card)
                        .background(Paper)
                        .border(1.dp, if (parsed.canConnect) Accent else Danger, Card)
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(6.dp),
                ) {
                    Text(
                        if (parsed.canConnect) "Конфиг валиден" else "Нужно исправить",
                        color = if (parsed.canConnect) Success else Danger,
                        fontWeight = FontWeight.Medium,
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
            message?.let { (ok, text) ->
                Spacer(Modifier.height(8.dp))
                Text(text, color = if (ok) Success else Danger, fontSize = 13.sp)
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
                enabled = raw.isNotBlank(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Accent,
                    contentColor = Canvas,
                    disabledContainerColor = Line,
                    disabledContentColor = InkMuted,
                ),
                shape = Field,
                modifier = Modifier.fillMaxWidth().height(52.dp),
            ) { Text("Сохранить профиль", fontWeight = FontWeight.SemiBold) }
            Spacer(Modifier.height(12.dp))
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
    focusedBorderColor = Accent,
    unfocusedBorderColor = Line,
    cursorColor = Accent,
    focusedPlaceholderColor = PlaceholderGray,
    unfocusedPlaceholderColor = PlaceholderGray,
)
