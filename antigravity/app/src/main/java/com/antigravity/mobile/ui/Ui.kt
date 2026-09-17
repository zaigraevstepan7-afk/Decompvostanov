package com.antigravity.mobile.ui

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
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.antigravity.core.agent.ChatMessage
import com.antigravity.core.api.GeminiModels
import com.antigravity.mobile.UiState
import com.antigravity.mobile.root.RootState

private val Bg = Color(0xFF0B0F14)
private val Surface = Color(0xFF141A22)
private val Accent = Color(0xFF7CFFB2)
private val TextMain = Color(0xFFE8EEF5)
private val TextDim = Color(0xFF9AA6B2)
private val Danger = Color(0xFFFF6B6B)

@Composable
fun AntigravityTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkColorScheme(
            background = Bg,
            surface = Surface,
            primary = Accent,
            onBackground = TextMain,
            onSurface = TextMain,
            onPrimary = Color(0xFF04140C),
        ),
        content = content,
    )
}

@Composable
fun AntigravityAppUi(
    state: UiState,
    onLogin: () -> Unit,
    onLogout: () -> Unit,
    onSend: (String) -> Unit,
    onModel: (String) -> Unit,
    onWorkspace: (String) -> Unit,
    onRetryRoot: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Bg)
            .statusBarsPadding()
            .navigationBarsPadding(),
    ) {
        when {
            state.root != RootState.Granted -> RootGate(state.root, onRetryRoot)
            state.session == null -> LoginScreen(state, onLogin)
            else -> ChatScreen(state, onSend, onModel, onWorkspace, onLogout)
        }
    }
}

@Composable
private fun RootGate(root: RootState, onRetry: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        Text("ANTIGRAVITY", color = Accent, fontSize = 14.sp, fontWeight = FontWeight.Bold, letterSpacing = 2.sp)
        Spacer(Modifier.height(12.dp))
        Text("Нужен root", color = TextMain, fontSize = 32.sp, fontWeight = FontWeight.SemiBold)
        Spacer(Modifier.height(12.dp))
        Text(
            "Приложение работает только на рутованном телефоне. Без root агент не стартует, вход Google закрыт, файлы не трогаем.",
            color = TextDim,
            fontSize = 16.sp,
        )
        Spacer(Modifier.height(24.dp))
        if (root == RootState.Checking) {
            CircularProgressIndicator(color = Accent)
            Spacer(Modifier.height(12.dp))
            Text("Проверяю Magisk / su…", color = TextDim)
        } else {
            Text("Root не выдан этому приложению.", color = Danger)
            Spacer(Modifier.height(16.dp))
            Button(onClick = onRetry, colors = ButtonDefaults.buttonColors(containerColor = Accent, contentColor = Color(0xFF04140C))) {
                Text("Проверить снова")
            }
        }
    }
}

@Composable
private fun LoginScreen(state: UiState, onLogin: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        Text("ANTIGRAVITY", color = Accent, fontSize = 14.sp, fontWeight = FontWeight.Bold, letterSpacing = 2.sp)
        Spacer(Modifier.height(12.dp))
        Text("Вход Google", color = TextMain, fontSize = 32.sp, fontWeight = FontWeight.SemiBold)
        Spacer(Modifier.height(12.dp))
        Text(
            "Это не Gemini API key. Откроется страница Google. Предупреждение «Make sure that you downloaded this app from Google» — нормально: нажмите Sign in. После входа приложение само перехватит возврат, без broken pipe.",
            color = TextDim,
            fontSize = 16.sp,
        )
        Spacer(Modifier.height(24.dp))
        Button(
            onClick = onLogin,
            enabled = !state.loggingIn,
            colors = ButtonDefaults.buttonColors(containerColor = Accent, contentColor = Color(0xFF04140C)),
        ) {
            Text(if (state.loggingIn) "Жду браузер…" else "Войти через Google")
        }
        state.error?.let {
            Spacer(Modifier.height(16.dp))
            Text(it, color = Danger)
        }
        if (state.loggingIn) {
            Spacer(Modifier.height(16.dp))
            CircularProgressIndicator(color = Accent)
        }
    }
}

@Composable
private fun ChatScreen(
    state: UiState,
    onSend: (String) -> Unit,
    onModel: (String) -> Unit,
    onWorkspace: (String) -> Unit,
    onLogout: () -> Unit,
) {
    var draft by remember { mutableStateOf("") }
    var workspace by remember(state.workspace) { mutableStateOf(state.workspace) }
    var menu by remember { mutableStateOf(false) }
    val listState = rememberLazyListState()
    LaunchedEffect(state.messages.size) {
        if (state.messages.isNotEmpty()) listState.animateScrollToItem(state.messages.lastIndex)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .imePadding(),
    ) {
        Column(Modifier.padding(horizontal = 16.dp, vertical = 10.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Antigravity", color = Accent, fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Spacer(Modifier.weight(1f))
                TextButton(onClick = onLogout) { Text("Выйти", color = TextDim) }
            }
            Text(state.session?.email ?: "", color = TextDim, fontSize = 12.sp)
            Row(verticalAlignment = Alignment.CenterVertically) {
                TextButton(onClick = { menu = true }) {
                    Text(state.model, color = Accent, fontFamily = FontFamily.Monospace, fontSize = 13.sp)
                }
                DropdownMenu(expanded = menu, onDismissRequest = { menu = false }) {
                    GeminiModels.ALL.forEach { model ->
                        DropdownMenuItem(
                            text = { Text("${model.title}\n${model.description}") },
                            onClick = {
                                onModel(model.id)
                                menu = false
                            },
                        )
                    }
                }
            }
            BasicTextField(
                value = workspace,
                onValueChange = {
                    workspace = it
                    onWorkspace(it)
                },
                textStyle = TextStyle(color = TextDim, fontSize = 12.sp, fontFamily = FontFamily.Monospace),
                cursorBrush = SolidColor(Accent),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Surface, RoundedCornerShape(8.dp))
                    .padding(8.dp),
            )
        }
        LazyColumn(
            state = listState,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(horizontal = 12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            if (state.messages.isEmpty()) {
                item {
                    Text(
                        "Как Claude Code, но на телефоне.\nПример: «в Download лежит zip — распакуй и поправь код». Всё делается локально.",
                        color = TextDim,
                        modifier = Modifier.padding(12.dp),
                    )
                }
            }
            items(state.messages) { message -> Bubble(message) }
            if (state.busy) {
                item { Text("агент работает на устройстве…", color = Accent, fontSize = 13.sp) }
            }
        }
        state.error?.let {
            Text(it, color = Danger, modifier = Modifier.padding(horizontal = 16.dp), fontSize = 13.sp)
        }
        Row(
            modifier = Modifier
                .padding(12.dp)
                .background(Surface, RoundedCornerShape(16.dp))
                .border(1.dp, Color(0xFF243042), RoundedCornerShape(16.dp))
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            BasicTextField(
                value = draft,
                onValueChange = { draft = it },
                textStyle = TextStyle(color = TextMain, fontSize = 16.sp),
                cursorBrush = SolidColor(Accent),
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp),
                decorationBox = { inner ->
                    if (draft.isEmpty()) Text("Задача для телефона…", color = TextDim)
                    inner()
                },
            )
            Spacer(Modifier.width(8.dp))
            Button(
                onClick = {
                    val text = draft
                    draft = ""
                    onSend(text)
                },
                enabled = !state.busy && draft.isNotBlank(),
                colors = ButtonDefaults.buttonColors(containerColor = Accent, contentColor = Color(0xFF04140C)),
            ) { Text("▶") }
        }
    }
}

@Composable
private fun Bubble(message: ChatMessage) {
    val (label, color) = when (message.role) {
        "user" -> "вы" to TextMain
        "assistant" -> "antigravity" to Accent
        "tool" -> "tool ${message.tool}" to Color(0xFF8AB4F8)
        else -> "result ${message.tool}" to TextDim
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Surface, RoundedCornerShape(12.dp))
            .padding(12.dp),
    ) {
        Text(label, color = color, fontSize = 11.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
        Spacer(Modifier.height(4.dp))
        Text(message.text, color = TextMain, fontSize = 14.sp, fontFamily = if (message.role.startsWith("tool")) FontFamily.Monospace else FontFamily.Default)
    }
}
