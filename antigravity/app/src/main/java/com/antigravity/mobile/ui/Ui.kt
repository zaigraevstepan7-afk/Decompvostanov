package com.antigravity.mobile.ui

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.automirrored.outlined.Send
import androidx.compose.material.icons.automirrored.outlined.InsertDriveFile
import androidx.compose.material.icons.outlined.AttachFile
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material.icons.outlined.ExpandMore
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import android.graphics.BitmapFactory
import com.antigravity.core.agent.ChatMessage
import com.antigravity.core.agent.ToolLabels
import com.antigravity.core.api.GeminiModels
import com.antigravity.mobile.PendingAttachment
import com.antigravity.mobile.UiState
import com.antigravity.mobile.root.RootState
import kotlinx.coroutines.delay
import kotlin.math.roundToInt

private val EnterEase = CubicBezierEasing(0.22f, 1f, 0.36f, 1f)
private val ShineEase = CubicBezierEasing(0.25f, 0.1f, 0.25f, 1f)

@Composable
fun AntigravityAppUi(
    state: UiState,
    onLogin: () -> Unit,
    onLogout: () -> Unit,
    onSend: (String) -> Unit,
    onModel: (String) -> Unit,
    onWorkspace: (String) -> Unit,
    onRetryRoot: () -> Unit,
    onAttach: () -> Unit = {},
    onRemoveAttachment: (String) -> Unit = {},
) {
    val screen = when {
        state.root != RootState.Granted -> "root"
        state.session == null -> "login"
        else -> "chat"
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(AgColors.Bg)
            .statusBarsPadding()
            .navigationBarsPadding(),
    ) {
        AnimatedContent(
            targetState = screen,
            transitionSpec = {
                (fadeIn(tween(320, easing = EnterEase)) + slideInVertically(tween(360, easing = EnterEase)) { 28 }) togetherWith
                    (fadeOut(tween(180)) + slideOutVertically(tween(180)) { -12 })
            },
            label = "screen",
        ) { current ->
            when (current) {
                "root" -> RootGate(state.root, onRetryRoot)
                "login" -> LoginScreen(state, onLogin)
                else -> ChatScreen(state, onSend, onModel, onWorkspace, onLogout, onAttach, onRemoveAttachment)
            }
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
        Appear {
            Text("Нужен root", color = AgColors.Text, fontSize = 34.sp, fontWeight = FontWeight.SemiBold, letterSpacing = (-0.6).sp)
        }
        Spacer(Modifier.height(10.dp))
        Appear(80) {
            Text(
                "Без Magisk / su агент не стартует. Файлы на телефоне не трогаем, Google закрыт.",
                color = AgColors.Muted,
                fontSize = 16.sp,
                lineHeight = 22.sp,
            )
        }
        Spacer(Modifier.height(28.dp))
        Appear(160) {
            if (root == RootState.Checking) {
                ShimmerLabel("Проверяю Magisk…")
            } else {
                Column {
                    Text("Root не выдан этому приложению.", color = AgColors.Danger, fontSize = 14.sp)
                    Spacer(Modifier.height(16.dp))
                    AccentButton("Проверить снова", onRetry)
                }
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
        Appear {
            Text("Вход Google", color = AgColors.Text, fontSize = 34.sp, fontWeight = FontWeight.SemiBold, letterSpacing = (-0.6).sp)
        }
        Spacer(Modifier.height(10.dp))
        Appear(80) {
            Text(
                "Это не Gemini API key. На экране «Make sure that you downloaded this app from Google» нажмите Sign in — возврат перехватится сам.",
                color = AgColors.Muted,
                fontSize = 16.sp,
                lineHeight = 22.sp,
            )
        }
        Spacer(Modifier.height(28.dp))
        Appear(160) {
            AccentButton(
                if (state.loggingIn) "Жду браузер…" else "Войти через Google",
                onLogin,
                enabled = !state.loggingIn,
            )
        }
        state.error?.let {
            Spacer(Modifier.height(16.dp))
            Appear { Text(it, color = AgColors.Danger, fontSize = 13.sp, lineHeight = 18.sp) }
        }
        if (state.loggingIn) {
            Spacer(Modifier.height(18.dp))
            ShimmerLabel("Thinking")
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
    onAttach: () -> Unit,
    onRemoveAttachment: (String) -> Unit,
) {
    var draft by remember { mutableStateOf("") }
    var settings by remember { mutableStateOf(false) }
    AnimatedContent(
        targetState = settings,
        modifier = Modifier.fillMaxSize(),
        transitionSpec = {
            if (targetState) {
                (slideInHorizontally(tween(360, easing = EnterEase)) { it } + fadeIn(tween(280))) togetherWith
                    (slideOutHorizontally(tween(280, easing = EnterEase)) { -it / 5 } + fadeOut(tween(180)))
            } else {
                (slideInHorizontally(tween(360, easing = EnterEase)) { -it / 5 } + fadeIn(tween(280))) togetherWith
                    (slideOutHorizontally(tween(280, easing = EnterEase)) { it } + fadeOut(tween(180)))
            }
        },
        label = "settings",
    ) { open ->
        if (open) {
            SettingsScreen(
                state = state,
                onBack = { settings = false },
                onWorkspace = onWorkspace,
                onLogout = {
                    settings = false
                    onLogout()
                },
            )
        } else {
            ChatPane(
                state = state,
                draft = draft,
                onDraft = { draft = it },
                onSend = onSend,
                onModel = onModel,
                onSettings = { settings = true },
                onAttach = onAttach,
                onRemoveAttachment = onRemoveAttachment,
            )
        }
    }
}

@Composable
private fun ChatPane(
    state: UiState,
    draft: String,
    onDraft: (String) -> Unit,
    onSend: (String) -> Unit,
    onModel: (String) -> Unit,
    onSettings: () -> Unit,
    onAttach: () -> Unit,
    onRemoveAttachment: (String) -> Unit,
) {
    val listState = rememberLazyListState()
    LaunchedEffect(state.messages.size, state.busy) {
        val last = state.messages.lastIndex + if (state.busy) 1 else 0
        if (last >= 0) listState.animateScrollToItem(last.coerceAtLeast(0))
    }
    Column(Modifier.fillMaxSize().imePadding()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Spacer(Modifier.weight(1f))
            IconPress(onClick = onSettings) {
                Icon(Icons.Outlined.Settings, contentDescription = "Настройки", tint = AgColors.Muted, modifier = Modifier.size(22.dp))
            }
        }
        LazyColumn(
            state = listState,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(horizontal = 12.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp),
            contentPadding = PaddingValues(bottom = 8.dp),
        ) {
            if (state.messages.isEmpty() && !state.busy) {
                item { EmptyState() }
            }
            itemsIndexed(state.messages, key = { _, message -> message.id }) { index, message ->
                val tight = message.role == "tool" && state.messages.getOrNull(index - 1)?.role == "tool"
                Appear(fromUser = message.role == "user") {
                    Box(Modifier.padding(top = if (tight) 0.dp else 4.dp)) {
                        when (message.role) {
                            "user" -> UserBubble(message)
                            "thinking" -> ThinkingBlock(message, live = state.busy && message.durationMs == null)
                            "tool", "tool-result" -> ToolLine(
                                message = message,
                                live = message.role == "tool" && state.busy && message.text.isEmpty(),
                            )
                            else -> AssistantBubble(message.text)
                        }
                    }
                }
            }
            if (state.busy && state.messages.none { it.role == "thinking" && it.durationMs == null }) {
                item { ShimmerLabel("Thinking") }
            }
        }
        state.error?.let {
            Appear {
                Text(it, color = AgColors.Danger, modifier = Modifier.padding(horizontal = 16.dp), fontSize = 13.sp, lineHeight = 18.sp)
            }
        }
        Composer(
            draft = draft,
            busy = state.busy,
            model = state.model,
            pending = state.pending,
            onDraft = onDraft,
            onModel = onModel,
            onAttach = onAttach,
            onRemove = onRemoveAttachment,
            onSend = {
                val text = draft
                onDraft("")
                onSend(text)
            },
        )
    }
}

@Composable
private fun SettingsScreen(
    state: UiState,
    onBack: () -> Unit,
    onWorkspace: (String) -> Unit,
    onLogout: () -> Unit,
) {
    var workspace by remember(state.workspace) { mutableStateOf(state.workspace) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp, vertical = 12.dp),
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            IconPress(onClick = onBack) {
                Icon(Icons.AutoMirrored.Outlined.ArrowBack, contentDescription = "Назад", tint = AgColors.Text)
            }
            Spacer(Modifier.width(4.dp))
            Text("Настройки", color = AgColors.Text, fontSize = 22.sp, fontWeight = FontWeight.SemiBold, letterSpacing = (-0.4).sp)
        }
        Spacer(Modifier.height(28.dp))
        Appear(40) {
            Column {
                Text("Аккаунт", color = AgColors.Muted, fontSize = 12.sp, fontWeight = FontWeight.Medium, letterSpacing = 1.sp)
                Spacer(Modifier.height(6.dp))
                Text(state.session?.email ?: "", color = AgColors.Text, fontSize = 16.sp)
            }
        }
        Spacer(Modifier.height(22.dp))
        Appear(120) {
            Column {
                Text("Рабочая папка", color = AgColors.Muted, fontSize = 12.sp, fontWeight = FontWeight.Medium, letterSpacing = 1.sp)
                Spacer(Modifier.height(8.dp))
                Field(
                    value = workspace,
                    onValueChange = {
                        workspace = it
                        if (it.isNotBlank()) onWorkspace(it)
                    },
                    placeholder = "/storage/emulated/0/Antigravity",
                )
                Text(
                    "Агент читает и пишет файлы относительно этой директории.",
                    color = AgColors.Muted,
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    modifier = Modifier.padding(top = 8.dp),
                )
            }
        }
        Spacer(Modifier.weight(1f))
        Appear(200) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(AgRadius.Inner))
                    .border(1.dp, AgColors.Border, RoundedCornerShape(AgRadius.Inner))
                    .clickable(onClick = onLogout)
                    .padding(vertical = 14.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text("Выйти", color = AgColors.Danger, fontWeight = FontWeight.SemiBold)
            }
        }
        Spacer(Modifier.height(12.dp))
    }
}

@Composable
private fun EmptyState() {
    Column(Modifier.padding(horizontal = 8.dp, vertical = 12.dp)) {
        Appear {
            Text("Агент на телефоне", color = AgColors.Text, fontSize = 22.sp, fontWeight = FontWeight.SemiBold, letterSpacing = (-0.4).sp)
        }
        Spacer(Modifier.height(8.dp))
        Appear(80) {
            Text(
                "Правки, zip, картинки, поиск в сети — строго на устройстве.",
                color = AgColors.Muted,
                fontSize = 14.sp,
                lineHeight = 20.sp,
            )
        }
        Spacer(Modifier.height(16.dp))
        listOf(
            "Что на этом скриншоте?",
            "Найди в интернете и скажи кратко",
            "Распакуй zip в Download",
        ).forEachIndexed { index, hint ->
            Appear(140 + index * 90) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                        .background(AgColors.Surface, RoundedCornerShape(AgRadius.Chip))
                        .border(1.dp, AgColors.Border, RoundedCornerShape(AgRadius.Chip))
                        .padding(horizontal = 12.dp, vertical = 10.dp),
                ) {
                    Text(hint, color = AgColors.Thought, fontSize = 13.sp)
                }
            }
        }
    }
}

@Composable
private fun UserBubble(message: ChatMessage) {
    val images = message.attachments.filter { it.isImage && !it.path.isNullOrBlank() }
    val files = message.attachments.filter { !it.isImage }
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
        Column(horizontalAlignment = Alignment.End, modifier = Modifier.fillMaxWidth(0.86f)) {
            if (images.isNotEmpty()) {
                Row(
                    modifier = Modifier.horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                ) {
                    images.forEach { item ->
                        AttachmentThumb(path = item.path!!, isImage = true, modifier = Modifier.size(148.dp, 110.dp))
                    }
                }
                Spacer(Modifier.height(6.dp))
            }
            if (files.isNotEmpty()) {
                files.forEach { item ->
                    FileChip(item.name)
                    Spacer(Modifier.height(6.dp))
                }
            }
            if (message.text.isNotBlank()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(AgColors.Accent, RoundedCornerShape(18.dp, 18.dp, 4.dp, 18.dp))
                        .padding(horizontal = 14.dp, vertical = 10.dp),
                ) {
                    Text(message.text, color = AgColors.OnAccent, fontSize = 15.sp, lineHeight = 21.sp)
                }
            }
        }
    }
}

@Composable
private fun AssistantBubble(text: String) {
    MarkdownBody(text, modifier = Modifier.fillMaxWidth().padding(end = 12.dp))
}

@Composable
private fun ThinkingBlock(message: ChatMessage, live: Boolean) {
    var open by remember(message.durationMs) { mutableStateOf(live) }
    val seconds = ((message.durationMs ?: 0L) / 1000.0).roundToInt().coerceAtLeast(1)
    val rotation by animateFloatAsState(
        targetValue = if (open) 180f else 0f,
        animationSpec = tween(280, easing = EnterEase),
        label = "chevron",
    )
    Column(Modifier.fillMaxWidth().padding(end = 20.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .clickable(enabled = !live) { open = !open }
                .padding(vertical = 2.dp),
        ) {
            if (live) {
                ShimmerLabel("Thinking")
            } else {
                Text("Thought", color = AgColors.Thought, fontSize = 13.sp, fontWeight = FontWeight.Medium)
                Text(" for ${seconds}s", color = AgColors.Muted, fontSize = 13.sp)
                Icon(
                    Icons.Outlined.ExpandMore,
                    contentDescription = null,
                    tint = AgColors.Muted,
                    modifier = Modifier
                        .size(16.dp)
                        .graphicsLayer { rotationZ = rotation },
                )
            }
        }
        AnimatedVisibility(
            visible = live || open,
            enter = fadeIn(tween(220, easing = EnterEase)) + slideInVertically(tween(280, easing = EnterEase)) { 10 },
            exit = fadeOut(tween(160)) + slideOutVertically(tween(180)) { 8 },
        ) {
            Column(Modifier.padding(top = 6.dp)) {
                message.text.split('\n').filter { it.isNotBlank() }.takeLast(6).forEach { line ->
                    Text(
                        line,
                        color = AgColors.Muted,
                        fontSize = 13.sp,
                        lineHeight = 18.sp,
                        modifier = Modifier.padding(bottom = 4.dp),
                    )
                }
            }
        }
    }
}

@Composable
private fun ToolLine(message: ChatMessage, live: Boolean) {
    val args = remember(message.args, message.text) { ToolLabels.parseArgs(message.args) }
    val command = ToolLabels.command(message.tool, args)
    val title = remember(message.tool, message.args, message.text) {
        ToolLabels.headline(message.tool, args, message.text.takeIf { it.isNotBlank() })
    }
    var open by remember(message.id) { mutableStateOf(false) }
    val rotation by animateFloatAsState(
        targetValue = if (open) 180f else 0f,
        animationSpec = tween(240, easing = EnterEase),
        label = "tool-chevron",
    )
    val output = message.text
    Column(Modifier.fillMaxWidth().padding(end = 12.dp)) {
        if (command != null) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .background(AgColors.Surface)
                    .border(1.dp, AgColors.Border, RoundedCornerShape(10.dp))
                    .clickable(enabled = !live && output.isNotBlank()) { open = !open }
                    .padding(horizontal = 10.dp, vertical = 8.dp),
            ) {
                if (live) {
                    StatusDot(active = true)
                    Spacer(Modifier.width(8.dp))
                }
                Text(
                    command,
                    color = AgColors.Accent,
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Monospace,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.weight(1f),
                )
                if (!live && output.isNotBlank()) {
                    Icon(
                        Icons.Outlined.ExpandMore,
                        contentDescription = null,
                        tint = AgColors.Muted,
                        modifier = Modifier
                            .size(16.dp)
                            .graphicsLayer { rotationZ = rotation },
                    )
                }
            }
        } else {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))
                    .clickable(enabled = !live && output.isNotBlank()) { open = !open }
                    .padding(vertical = 3.dp),
            ) {
                if (live) {
                    StatusDot(active = true)
                    Spacer(Modifier.width(8.dp))
                    ShimmerLabel(title)
                } else {
                    Text(
                        title,
                        color = AgColors.Muted,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f, fill = false),
                    )
                    if (output.isNotBlank()) {
                        Icon(
                            Icons.Outlined.ExpandMore,
                            contentDescription = null,
                            tint = AgColors.Muted,
                            modifier = Modifier
                                .size(16.dp)
                                .graphicsLayer { rotationZ = rotation },
                        )
                    }
                }
            }
        }
        AnimatedVisibility(
            visible = open && output.isNotBlank(),
            enter = fadeIn(tween(200, easing = EnterEase)) + slideInVertically(tween(240, easing = EnterEase)) { 8 },
            exit = fadeOut(tween(140)) + slideOutVertically(tween(160)) { 6 },
        ) {
            val lines = remember(output) { output.lineSequence().take(40).joinToString("\n") }
            Text(
                lines,
                color = AgColors.Thought,
                fontSize = 12.sp,
                fontFamily = FontFamily.Monospace,
                lineHeight = 17.sp,
                modifier = Modifier
                    .padding(top = 6.dp, start = if (command != null) 10.dp else 0.dp, bottom = 4.dp)
                    .fillMaxWidth(),
            )
        }
    }
}

@Composable
private fun Composer(
    draft: String,
    busy: Boolean,
    model: String,
    pending: List<PendingAttachment>,
    onDraft: (String) -> Unit,
    onModel: (String) -> Unit,
    onAttach: () -> Unit,
    onRemove: (String) -> Unit,
    onSend: () -> Unit,
) {
    val interaction = remember { MutableInteractionSource() }
    val pressed by interaction.collectIsPressedAsState()
    var menu by remember { mutableStateOf(false) }
    val canSend = !busy && (draft.isNotBlank() || pending.isNotEmpty())
    Appear(fromBottom = true) {
        Column(Modifier.padding(horizontal = 12.dp, vertical = 8.dp)) {
            if (pending.isNotEmpty()) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState())
                        .padding(bottom = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    pending.forEach { item ->
                        PendingChip(item, enabled = !busy, onRemove = { onRemove(item.id) })
                    }
                }
            }
            Row(
                modifier = Modifier
                    .background(AgColors.Surface, RoundedCornerShape(AgRadius.Outer))
                    .border(1.dp, AgColors.Border, RoundedCornerShape(AgRadius.Outer))
                    .padding(6.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box {
                    Box(
                        modifier = Modifier
                            .widthIn(max = 118.dp)
                            .height(44.dp)
                            .clip(RoundedCornerShape(AgRadius.Inner))
                            .background(AgColors.AccentSoft)
                            .clickable { menu = true }
                            .padding(horizontal = 10.dp),
                        contentAlignment = Alignment.CenterStart,
                    ) {
                        Text(
                            GeminiModels.shortTitle(model),
                            color = AgColors.Accent,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                            maxLines = 1,
                        )
                    }
                    DropdownMenu(
                        expanded = menu,
                        onDismissRequest = { menu = false },
                        modifier = Modifier
                            .heightIn(max = 420.dp)
                            .background(AgColors.SurfaceRaised),
                    ) {
                        GeminiModels.ALL.forEach { item ->
                            DropdownMenuItem(
                                text = {
                                    Column {
                                        Text(item.title, fontWeight = FontWeight.SemiBold, color = AgColors.Text)
                                        Text(item.id, fontSize = 11.sp, color = AgColors.Muted, fontFamily = FontFamily.Monospace)
                                    }
                                },
                                onClick = {
                                    onModel(item.id)
                                    menu = false
                                },
                            )
                        }
                    }
                }
                IconPress(onClick = onAttach, enabled = !busy, size = 40.dp) {
                    Icon(Icons.Outlined.AttachFile, contentDescription = "Вложить", tint = AgColors.Muted, modifier = Modifier.size(20.dp))
                }
                BasicTextField(
                    value = draft,
                    onValueChange = onDraft,
                    textStyle = TextStyle(color = AgColors.Text, fontSize = 16.sp, lineHeight = 22.sp),
                    cursorBrush = SolidColor(AgColors.Accent),
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 4.dp, vertical = 8.dp),
                    decorationBox = { inner ->
                        if (draft.isEmpty()) Text("Задача для телефона…", color = AgColors.Muted, fontSize = 16.sp)
                        inner()
                    },
                )
                Box(
                    modifier = Modifier
                        .size(44.dp)
                        .scale(if (pressed) 0.96f else 1f)
                        .clip(CircleShape)
                        .background(if (canSend) AgColors.Accent else AgColors.SurfaceRaised)
                        .clickable(
                            enabled = canSend,
                            interactionSource = interaction,
                            indication = null,
                            onClick = onSend,
                        ),
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(
                        Icons.AutoMirrored.Outlined.Send,
                        contentDescription = "Отправить",
                        tint = if (canSend) AgColors.OnAccent else AgColors.Muted,
                        modifier = Modifier.size(18.dp).padding(start = 1.dp),
                    )
                }
            }
        }
    }
}

@Composable
private fun PendingChip(item: PendingAttachment, enabled: Boolean, onRemove: () -> Unit) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(14.dp))
            .background(AgColors.SurfaceRaised)
            .border(1.dp, AgColors.Border, RoundedCornerShape(14.dp))
            .padding(4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        AttachmentThumb(path = item.path, isImage = item.isImage, modifier = Modifier.size(36.dp))
        Spacer(Modifier.width(8.dp))
        Column(Modifier.widthIn(max = 120.dp)) {
            Text(item.name, color = AgColors.Text, fontSize = 12.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
            Text(
                if (item.isImage) "картинка" else "файл",
                color = AgColors.Muted,
                fontSize = 10.sp,
            )
        }
        IconPress(onClick = onRemove, enabled = enabled, size = 28.dp) {
            Icon(Icons.Outlined.Close, contentDescription = "Убрать", tint = AgColors.Muted, modifier = Modifier.size(16.dp))
        }
    }
}

@Composable
private fun FileChip(name: String) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .background(AgColors.SurfaceRaised)
            .border(1.dp, AgColors.Border, RoundedCornerShape(12.dp))
            .padding(horizontal = 10.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(Icons.AutoMirrored.Outlined.InsertDriveFile, contentDescription = null, tint = AgColors.Accent, modifier = Modifier.size(16.dp))
        Spacer(Modifier.width(6.dp))
        Text(name, color = AgColors.Text, fontSize = 12.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
    }
}

@Composable
private fun AttachmentThumb(path: String, isImage: Boolean, modifier: Modifier) {
    val bitmap = remember(path, isImage) {
        if (!isImage) null else runCatching {
            val bounds = BitmapFactory.Options().apply { inJustDecodeBounds = true }
            BitmapFactory.decodeFile(path, bounds)
            var sample = 1
            val longest = maxOf(bounds.outWidth, bounds.outHeight).coerceAtLeast(1)
            while (longest / sample > 512) sample *= 2
            BitmapFactory.decodeFile(path, BitmapFactory.Options().apply { inSampleSize = sample })
        }.getOrNull()
    }
    if (bitmap != null) {
        Image(
            bitmap.asImageBitmap(),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier.clip(RoundedCornerShape(12.dp)),
        )
    } else {
        Box(
            modifier = modifier
                .clip(RoundedCornerShape(12.dp))
                .background(AgColors.SurfaceRaised),
            contentAlignment = Alignment.Center,
        ) {
            Icon(Icons.AutoMirrored.Outlined.InsertDriveFile, contentDescription = null, tint = AgColors.Accent, modifier = Modifier.size(18.dp))
        }
    }
}

@Composable
private fun Field(value: String, onValueChange: (String) -> Unit, placeholder: String) {
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        textStyle = TextStyle(
            color = AgColors.Text,
            fontSize = 13.sp,
            fontFamily = FontFamily.Monospace,
        ),
        cursorBrush = SolidColor(AgColors.Accent),
        modifier = Modifier
            .fillMaxWidth()
            .background(AgColors.Surface, RoundedCornerShape(AgRadius.Chip))
            .border(1.dp, AgColors.Border, RoundedCornerShape(AgRadius.Chip))
            .padding(horizontal = 10.dp, vertical = 8.dp),
        decorationBox = { inner ->
            if (value.isEmpty()) Text(placeholder, color = AgColors.Muted, fontSize = 12.sp, fontFamily = FontFamily.Monospace)
            inner()
        },
    )
}

@Composable
private fun Appear(
    delayMs: Int = 0,
    fromUser: Boolean = false,
    fromBottom: Boolean = false,
    content: @Composable () -> Unit,
) {
    var visible by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) {
        if (delayMs > 0) delay(delayMs.toLong())
        visible = true
    }
    val enter = when {
        fromUser -> fadeIn(tween(280, easing = EnterEase)) + slideInHorizontally(tween(320, easing = EnterEase)) { it / 6 }
        fromBottom -> fadeIn(tween(280, easing = EnterEase)) + slideInVertically(tween(360, easing = EnterEase)) { 18 }
        else -> fadeIn(tween(280, easing = EnterEase)) + slideInVertically(tween(320, easing = EnterEase)) { 14 }
    }
    AnimatedVisibility(
        visible = visible,
        enter = enter,
        exit = fadeOut(tween(160)) + slideOutVertically(tween(160)) { 8 },
    ) { content() }
}

@Composable
private fun IconPress(
    onClick: () -> Unit,
    enabled: Boolean = true,
    size: Dp = 44.dp,
    content: @Composable () -> Unit,
) {
    val interaction = remember { MutableInteractionSource() }
    val pressed by interaction.collectIsPressedAsState()
    Box(
        modifier = Modifier
            .size(size)
            .scale(if (pressed) 0.96f else 1f)
            .clip(CircleShape)
            .clickable(enabled = enabled, interactionSource = interaction, indication = null, onClick = onClick),
        contentAlignment = Alignment.Center,
    ) { content() }
}

@Composable
private fun StatusDot(active: Boolean) {
    val pulse = rememberInfiniteTransition(label = "dot")
    val alpha by pulse.animateFloat(
        initialValue = 0.35f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(900), RepeatMode.Reverse),
        label = "dot-a",
    )
    Box(
        Modifier
            .size(7.dp)
            .graphicsLayer { this.alpha = if (active) alpha else 1f }
            .background(if (active) AgColors.Accent else AgColors.AccentDim, CircleShape),
    )
}

@Composable
fun ShimmerLabel(text: String) {
    val transition = rememberInfiniteTransition(label = "shimmer")
    val shift by transition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(2250, easing = ShineEase)),
        label = "shine",
    )
    val brush = Brush.linearGradient(
        colors = listOf(AgColors.Muted, AgColors.Accent.copy(alpha = 0.45f), AgColors.Accent, AgColors.Accent.copy(alpha = 0.45f), AgColors.Muted),
        start = Offset(280f * (1f - shift), 0f),
        end = Offset(280f * (1f - shift) + 220f, 0f),
    )
    Text(
        text,
        style = TextStyle(
            brush = brush,
            fontSize = 13.sp,
            fontWeight = FontWeight.Medium,
            letterSpacing = (-0.1).sp,
        ),
    )
}

@Composable
private fun AccentButton(label: String, onClick: () -> Unit, enabled: Boolean = true) {
    val interaction = remember { MutableInteractionSource() }
    val pressed by interaction.collectIsPressedAsState()
    Button(
        onClick = onClick,
        enabled = enabled,
        interactionSource = interaction,
        modifier = Modifier.scale(if (pressed) 0.96f else 1f),
        shape = RoundedCornerShape(AgRadius.Inner),
        colors = ButtonDefaults.buttonColors(
            containerColor = AgColors.Accent,
            contentColor = AgColors.OnAccent,
            disabledContainerColor = AgColors.SurfaceRaised,
            disabledContentColor = AgColors.Muted,
        ),
        contentPadding = PaddingValues(horizontal = 18.dp, vertical = 12.dp),
    ) { Text(label, fontWeight = FontWeight.SemiBold) }
}
