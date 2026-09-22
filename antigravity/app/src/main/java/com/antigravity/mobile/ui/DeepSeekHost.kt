package com.antigravity.mobile.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.antigravity.core.agent.ChatMessage
import com.antigravity.core.agent.ToolLabels
import com.antigravity.mobile.UiState
import com.antigravity.mobile.chat.ChatThread
import com.antigravity.mobile.root.RootState
import com.deepseek.chat.ui.model.DeepSeekModel
import com.deepseek.chat.ui.model.MessageSender
import com.deepseek.chat.ui.model.ThinkingProcess
import com.deepseek.chat.ui.screen.DeepSeekChatScreen
import com.deepseek.chat.ui.theme.DarkBackground
import com.deepseek.chat.ui.theme.DarkBorder
import com.deepseek.chat.ui.theme.DarkSurface
import com.deepseek.chat.ui.theme.DarkTextPrimary
import com.deepseek.chat.ui.theme.DarkTextSecondary
import com.deepseek.chat.ui.theme.DeepSeekPrimary
import com.deepseek.chat.ui.theme.DeepSeekTheme
import com.deepseek.chat.ui.theme.LightBackground
import com.deepseek.chat.ui.theme.LightBorder
import com.deepseek.chat.ui.theme.LightSurface
import com.deepseek.chat.ui.theme.LightTextPrimary
import com.deepseek.chat.ui.theme.LightTextSecondary
import kotlinx.coroutines.launch
import com.deepseek.chat.ui.model.ChatMessage as DsMessage

@Composable
fun DeepSeekApp(
    state: UiState,
    onLogin: () -> Unit,
    onLogout: () -> Unit,
    onSend: (String) -> Unit,
    onWorkspace: (String) -> Unit,
    onRetryRoot: () -> Unit,
    onAttach: () -> Unit,
    onNewChat: () -> Unit,
    onOpenChat: (String) -> Unit,
    onDeleteChat: (String) -> Unit,
    onStop: () -> Unit,
    onBrain: (Boolean) -> Unit,
    onSearch: (Boolean) -> Unit,
    onAgent: (Boolean) -> Unit,
    onRegenerate: () -> Unit,
    onRemovePending: (String) -> Unit,
) {
    DeepSeekTheme {
        when {
            state.root != RootState.Granted -> GateScreen(
                title = "Нужен root",
                body = "Без Magisk / su агент не стартует.",
                action = if (state.root == RootState.Checking) null else "Проверить снова",
                onAction = onRetryRoot,
            )
            state.session == null -> GateScreen(
                title = "Вход Google",
                body = "На экране «Make sure that you downloaded this app from Google» нажмите Sign in.",
                action = if (state.loggingIn) "Жду браузер…" else "Войти через Google",
                onAction = onLogin,
                enabled = !state.loggingIn,
                error = state.error,
            )
            else -> ChatShell(
                state = state,
                onLogout = onLogout,
                onSend = onSend,
                onWorkspace = onWorkspace,
                onAttach = onAttach,
                onNewChat = onNewChat,
                onOpenChat = onOpenChat,
                onDeleteChat = onDeleteChat,
                onStop = onStop,
                onBrain = onBrain,
                onSearch = onSearch,
                onAgent = onAgent,
                onRegenerate = onRegenerate,
                onRemovePending = onRemovePending,
            )
        }
    }
}

@Composable
private fun ChatShell(
    state: UiState,
    onLogout: () -> Unit,
    onSend: (String) -> Unit,
    onWorkspace: (String) -> Unit,
    onAttach: () -> Unit,
    onNewChat: () -> Unit,
    onOpenChat: (String) -> Unit,
    onDeleteChat: (String) -> Unit,
    onStop: () -> Unit,
    onBrain: (Boolean) -> Unit,
    onSearch: (Boolean) -> Unit,
    onAgent: (Boolean) -> Unit,
    onRegenerate: () -> Unit,
    onRemovePending: (String) -> Unit,
) {
    var draft by remember { mutableStateOf("") }
    var settings by remember { mutableStateOf(false) }
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val isDark = isSystemInDarkTheme()
    val model = if (state.brain) DeepSeekModel.DEEPSEEK_R1 else DeepSeekModel.DEEPSEEK_V3

    if (settings) {
        SettingsPane(
            state = state,
            onBack = { settings = false },
            onWorkspace = onWorkspace,
            onLogout = {
                settings = false
                onLogout()
            },
            onAgent = onAgent,
        )
        return
    }

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                drawerContainerColor = if (isDark) DarkSurface else LightBackground,
                modifier = Modifier.width(300.dp),
            ) {
                ChatDrawer(
                    state = state,
                    onNew = {
                        onNewChat()
                        draft = ""
                        scope.launch { drawerState.close() }
                    },
                    onOpen = { id ->
                        onOpenChat(id)
                        draft = ""
                        scope.launch { drawerState.close() }
                    },
                    onDelete = onDeleteChat,
                    onSettings = {
                        settings = true
                        scope.launch { drawerState.close() }
                    },
                )
            }
        },
    ) {
        DeepSeekChatScreen(
            messages = toDeepSeek(state.messages, state.busy),
            inputText = draft,
            onInputChanged = { draft = it },
            currentModel = model,
            isDeepThinkActive = state.brain,
            isWebSearchActive = state.search,
            isGenerating = state.busy,
            hasPending = state.pending.isNotEmpty(),
            error = state.error,
            pending = state.pending.map { it.id to it.name },
            onRemovePending = onRemovePending,
            onModelSelected = { selected -> onBrain(selected == DeepSeekModel.DEEPSEEK_R1) },
            onDeepThinkToggle = { onBrain(!state.brain) },
            onWebSearchToggle = { onSearch(!state.search) },
            onSend = {
                val text = draft
                draft = ""
                onSend(text)
            },
            onStop = onStop,
            onAttachClick = onAttach,
            onNewChatClick = {
                onNewChat()
                draft = ""
            },
            onOpenDrawer = { scope.launch { drawerState.open() } },
            onRegenerate = onRegenerate,
        )
    }
}

@Composable
private fun ChatDrawer(
    state: UiState,
    onNew: () -> Unit,
    onOpen: (String) -> Unit,
    onDelete: (String) -> Unit,
    onSettings: () -> Unit,
) {
    val isDark = isSystemInDarkTheme()
    Column(Modifier.fillMaxHeight().padding(12.dp)) {
        Text(
            "Чаты",
            color = if (isDark) DarkTextPrimary else LightTextPrimary,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
        )
        Spacer(Modifier.height(12.dp))
        BoxNew(onNew, enabled = !state.busy)
        Spacer(Modifier.height(12.dp))
        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(bottom = 12.dp),
        ) {
            items(state.chats, key = { it.id }) { chat ->
                DrawerChatRow(
                    chat = chat,
                    active = chat.id == state.chatId,
                    enabled = !state.busy || chat.id == state.chatId,
                    onOpen = { onOpen(chat.id) },
                    onDelete = { onDelete(chat.id) },
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .clickable(onClick = onSettings)
                .padding(vertical = 12.dp, horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(Icons.Outlined.Settings, contentDescription = null, tint = DeepSeekPrimary)
            Spacer(Modifier.width(8.dp))
            Text("Настройки", color = if (isDark) DarkTextPrimary else LightTextPrimary, fontWeight = FontWeight.SemiBold)
        }
    }
}

@Composable
private fun BoxNew(onClick: () -> Unit, enabled: Boolean) {
    Text(
        "Новый чат",
        color = DeepSeekPrimary,
        fontWeight = FontWeight.SemiBold,
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(DeepSeekPrimary.copy(alpha = 0.12f))
            .clickable(enabled = enabled, onClick = onClick)
            .padding(vertical = 12.dp),
        textAlign = androidx.compose.ui.text.style.TextAlign.Center,
    )
}

@Composable
private fun DrawerChatRow(
    chat: ChatThread,
    active: Boolean,
    enabled: Boolean,
    onOpen: () -> Unit,
    onDelete: () -> Unit,
) {
    val isDark = isSystemInDarkTheme()
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(if (active) DeepSeekPrimary.copy(alpha = 0.12f) else if (isDark) DarkBackground else LightSurface)
            .border(1.dp, if (active) DeepSeekPrimary else if (isDark) DarkBorder else LightBorder, RoundedCornerShape(12.dp))
            .clickable(enabled = enabled, onClick = onOpen)
            .padding(start = 12.dp, top = 10.dp, bottom = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(Modifier.weight(1f)) {
            Text(chat.title.ifBlank { "Новый чат" }, color = if (isDark) DarkTextPrimary else LightTextPrimary, maxLines = 1, overflow = TextOverflow.Ellipsis, fontWeight = FontWeight.SemiBold)
            if (chat.preview.isNotBlank()) {
                Text(chat.preview, color = if (isDark) DarkTextSecondary else LightTextSecondary, maxLines = 1, overflow = TextOverflow.Ellipsis, fontSize = 12.sp)
            }
        }
        IconButton(onClick = onDelete, enabled = enabled) {
            Icon(Icons.Outlined.Delete, contentDescription = "Удалить", tint = if (isDark) DarkTextSecondary else LightTextSecondary)
        }
    }
}

@Composable
private fun SettingsPane(
    state: UiState,
    onBack: () -> Unit,
    onWorkspace: (String) -> Unit,
    onLogout: () -> Unit,
    onAgent: (Boolean) -> Unit,
) {
    val isDark = isSystemInDarkTheme()
    var workspace by remember(state.workspace) { mutableStateOf(state.workspace) }
    Column(
        Modifier
            .fillMaxSize()
            .background(if (isDark) DarkBackground else LightBackground)
            .padding(horizontal = 20.dp, vertical = 12.dp),
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            IconButton(onClick = onBack) {
                Icon(Icons.AutoMirrored.Outlined.ArrowBack, contentDescription = "Назад", tint = if (isDark) DarkTextPrimary else LightTextPrimary)
            }
            Text("Настройки", color = if (isDark) DarkTextPrimary else LightTextPrimary, fontSize = 22.sp, fontWeight = FontWeight.SemiBold)
        }
        Spacer(Modifier.height(24.dp))
        Text("Аккаунт", color = if (isDark) DarkTextSecondary else LightTextSecondary, fontSize = 12.sp)
        Text(state.session?.email ?: "", color = if (isDark) DarkTextPrimary else LightTextPrimary, fontSize = 16.sp)
        Spacer(Modifier.height(22.dp))
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Column(Modifier.weight(1f)) {
                Text("Агент", color = if (isDark) DarkTextPrimary else LightTextPrimary, fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                Text(
                    if (state.agent) "Включён: правит файлы на телефоне" else "Выключен: обычный чат",
                    color = if (isDark) DarkTextSecondary else LightTextSecondary,
                    fontSize = 13.sp,
                )
            }
            Switch(
                checked = state.agent,
                onCheckedChange = onAgent,
                enabled = !state.busy,
                colors = SwitchDefaults.colors(
                    checkedTrackColor = DeepSeekPrimary,
                    checkedThumbColor = androidx.compose.ui.graphics.Color.White,
                ),
            )
        }
        Spacer(Modifier.height(22.dp))
        Text("Рабочая папка", color = if (isDark) DarkTextSecondary else LightTextSecondary, fontSize = 12.sp)
        Spacer(Modifier.height(8.dp))
        BasicTextField(
            value = workspace,
            onValueChange = {
                workspace = it
                if (it.isNotBlank()) onWorkspace(it)
            },
            textStyle = TextStyle(color = if (isDark) DarkTextPrimary else LightTextPrimary, fontSize = 13.sp, fontFamily = FontFamily.Monospace),
            cursorBrush = SolidColor(DeepSeekPrimary),
            modifier = Modifier
                .fillMaxWidth()
                .background(if (isDark) DarkSurface else LightSurface, RoundedCornerShape(12.dp))
                .border(1.dp, if (isDark) DarkBorder else LightBorder, RoundedCornerShape(12.dp))
                .padding(horizontal = 10.dp, vertical = 10.dp),
        )
        Spacer(Modifier.weight(1f))
        Button(
            onClick = onLogout,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = androidx.compose.ui.graphics.Color(0xFFEF4444), contentColor = androidx.compose.ui.graphics.Color.White),
            shape = RoundedCornerShape(16.dp),
        ) { Text("Выйти", fontWeight = FontWeight.SemiBold) }
        Spacer(Modifier.height(12.dp))
    }
}

@Composable
private fun GateScreen(
    title: String,
    body: String,
    action: String?,
    onAction: () -> Unit,
    enabled: Boolean = true,
    error: String? = null,
) {
    val isDark = isSystemInDarkTheme()
    Column(
        Modifier
            .fillMaxSize()
            .background(if (isDark) DarkBackground else LightBackground)
            .padding(28.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        Text(title, color = if (isDark) DarkTextPrimary else LightTextPrimary, fontSize = 32.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(10.dp))
        Text(body, color = if (isDark) DarkTextSecondary else LightTextSecondary, fontSize = 16.sp, lineHeight = 22.sp)
        if (action != null) {
            Spacer(Modifier.height(24.dp))
            Button(
                onClick = onAction,
                enabled = enabled,
                colors = ButtonDefaults.buttonColors(containerColor = DeepSeekPrimary, contentColor = androidx.compose.ui.graphics.Color.White),
                shape = RoundedCornerShape(16.dp),
            ) { Text(action, fontWeight = FontWeight.SemiBold) }
        }
        error?.let {
            Spacer(Modifier.height(16.dp))
            Text(it, color = androidx.compose.ui.graphics.Color(0xFFEF4444), fontSize = 13.sp)
        }
    }
}

private fun toDeepSeek(messages: List<ChatMessage>, busy: Boolean): List<DsMessage> {
    val out = mutableListOf<DsMessage>()
    var index = 0
    while (index < messages.size) {
        val item = messages[index]
        if (item.role == "user") {
            out += DsMessage(
                id = item.id,
                sender = MessageSender.USER,
                content = item.text,
                imagePaths = item.attachments.filter { it.isImage }.mapNotNull { it.path },
                fileNames = item.attachments.filter { !it.isImage }.map { it.name },
            )
            index += 1
            continue
        }
        val start = index
        val thinking = StringBuilder()
        val answer = StringBuilder()
        var durationMs = 0L
        var liveThinking = false
        while (index < messages.size && messages[index].role != "user") {
            val part = messages[index]
            when (part.role) {
                "thinking" -> {
                    if (thinking.isNotEmpty()) thinking.append("\n\n")
                    thinking.append(part.text)
                    val elapsed = part.durationMs
                    if (elapsed == null) liveThinking = true else durationMs = elapsed
                }
                "tool", "tool-result" -> {
                    val args = ToolLabels.parseArgs(part.args)
                    val line = ToolLabels.command(part.tool, args) ?: ToolLabels.headline(part.tool, args, part.text.takeIf { it.isNotBlank() })
                    if (thinking.isNotEmpty()) thinking.append('\n')
                    thinking.append(line)
                }
                "assistant", "plan" -> {
                    if (answer.isNotEmpty()) answer.append("\n\n")
                    answer.append(part.text)
                }
            }
            index += 1
        }
        val streaming = busy && index >= messages.size
        val seconds = (durationMs / 1000L).toInt()
        out += DsMessage(
            id = messages[start].id,
            sender = MessageSender.ASSISTANT,
            content = answer.toString(),
            isStreaming = streaming,
            thinkingProcess = if (thinking.isNotBlank()) {
                ThinkingProcess(
                    reasoningText = thinking.toString(),
                    durationSeconds = if (streaming && liveThinking) 0 else seconds.coerceAtLeast(1),
                    isExpanded = streaming,
                    isFinished = !streaming,
                )
            } else {
                null
            },
        )
    }
    if (busy && (out.isEmpty() || out.last().sender == MessageSender.USER)) {
        out += DsMessage(
            sender = MessageSender.ASSISTANT,
            content = "",
            isStreaming = true,
            thinkingProcess = ThinkingProcess(
                reasoningText = "Анализирую запрос…",
                durationSeconds = 0,
                isExpanded = true,
                isFinished = false,
            ),
        )
    }
    return out
}
