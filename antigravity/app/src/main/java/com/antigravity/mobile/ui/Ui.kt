package com.antigravity.mobile.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.automirrored.outlined.Send
import androidx.compose.material.icons.outlined.ExpandMore
import androidx.compose.material.icons.outlined.Lock
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
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.antigravity.core.agent.ChatMessage
import com.antigravity.core.api.GeminiModels
import com.antigravity.mobile.UiState
import com.antigravity.mobile.root.RootState
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
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(AgColors.Bg)
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
        BrandMark()
        Spacer(Modifier.height(18.dp))
        Text("Нужен root", color = AgColors.Text, fontSize = 34.sp, fontWeight = FontWeight.SemiBold, letterSpacing = (-0.6).sp)
        Spacer(Modifier.height(10.dp))
        Text(
            "Без Magisk / su агент не стартует. Файлы на телефоне не трогаем, Google закрыт.",
            color = AgColors.Muted,
            fontSize = 16.sp,
            lineHeight = 22.sp,
        )
        Spacer(Modifier.height(28.dp))
        if (root == RootState.Checking) {
            ShimmerLabel("Проверяю Magisk…")
        } else {
            Text("Root не выдан этому приложению.", color = AgColors.Danger, fontSize = 14.sp)
            Spacer(Modifier.height(16.dp))
            AccentButton("Проверить снова", onRetry)
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
        BrandMark()
        Spacer(Modifier.height(18.dp))
        Text("Вход Google", color = AgColors.Text, fontSize = 34.sp, fontWeight = FontWeight.SemiBold, letterSpacing = (-0.6).sp)
        Spacer(Modifier.height(10.dp))
        Text(
            "Это квоты Antigravity, не Gemini API key. На экране «downloaded this app from Google» нажмите Sign in — возврат перехватится сам.",
            color = AgColors.Muted,
            fontSize = 16.sp,
            lineHeight = 22.sp,
        )
        Spacer(Modifier.height(28.dp))
        AccentButton(
            if (state.loggingIn) "Жду браузер…" else "Войти через Google",
            onLogin,
            enabled = !state.loggingIn,
        )
        state.error?.let {
            Spacer(Modifier.height(16.dp))
            Text(it, color = AgColors.Danger, fontSize = 13.sp, lineHeight = 18.sp)
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
) {
    var draft by remember { mutableStateOf("") }
    var settings by remember { mutableStateOf(false) }
    val listState = rememberLazyListState()
    LaunchedEffect(state.messages.size, state.busy) {
        val last = state.messages.lastIndex + if (state.busy) 1 else 0
        if (last >= 0) listState.animateScrollToItem(last.coerceAtLeast(0))
    }
    if (settings) {
        SettingsScreen(
            state = state,
            onBack = { settings = false },
            onWorkspace = onWorkspace,
            onLogout = {
                settings = false
                onLogout()
            },
        )
        return
    }
    Column(Modifier.fillMaxSize().imePadding()) {
        LazyColumn(
            state = listState,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(horizontal = 12.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(top = 12.dp, bottom = 8.dp),
        ) {
            if (state.messages.isEmpty() && !state.busy) {
                item { EmptyState() }
            }
            itemsIndexed(state.messages) { _, message ->
                AnimatedVisibility(
                    visible = true,
                    enter = fadeIn(tween(320, easing = EnterEase)) + slideInVertically(
                        tween(320, easing = EnterEase),
                        initialOffsetY = { 12 },
                    ),
                ) {
                    when (message.role) {
                        "user" -> UserBubble(message.text)
                        "thinking" -> ThinkingBlock(message, live = state.busy && message.durationMs == null)
                        "tool" -> ToolCard(message.tool ?: "tool", message.text, running = true)
                        "tool-result" -> ToolCard(message.tool ?: "tool", message.text, running = false)
                        else -> AssistantBubble(message.text)
                    }
                }
            }
            if (state.busy && state.messages.none { it.role == "thinking" && it.durationMs == null }) {
                item { ShimmerLabel("Thinking") }
            }
        }
        state.error?.let {
            Text(it, color = AgColors.Danger, modifier = Modifier.padding(horizontal = 16.dp), fontSize = 13.sp, lineHeight = 18.sp)
        }
        Composer(
            draft = draft,
            busy = state.busy,
            model = state.model,
            onDraft = { draft = it },
            onModel = onModel,
            onSettings = { settings = true },
            onSend = {
                val text = draft
                draft = ""
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
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .clip(CircleShape)
                    .clickable(onClick = onBack),
                contentAlignment = Alignment.Center,
            ) {
                Icon(Icons.AutoMirrored.Outlined.ArrowBack, contentDescription = "Назад", tint = AgColors.Text)
            }
            Spacer(Modifier.width(4.dp))
            Text("Настройки", color = AgColors.Text, fontSize = 22.sp, fontWeight = FontWeight.SemiBold, letterSpacing = (-0.4).sp)
        }
        Spacer(Modifier.height(24.dp))
        BrandMark()
        Spacer(Modifier.height(18.dp))
        Text("Аккаунт", color = AgColors.Muted, fontSize = 12.sp, fontWeight = FontWeight.Medium, letterSpacing = 1.sp)
        Spacer(Modifier.height(6.dp))
        Text(state.session?.email ?: "", color = AgColors.Text, fontSize = 16.sp)
        Spacer(Modifier.height(22.dp))
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
        Spacer(Modifier.weight(1f))
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
        Spacer(Modifier.height(12.dp))
    }
}

@Composable
private fun EmptyState() {
    Column(Modifier.padding(horizontal = 8.dp, vertical = 20.dp)) {
        Text("Агент на телефоне", color = AgColors.Text, fontSize = 22.sp, fontWeight = FontWeight.SemiBold, letterSpacing = (-0.4).sp)
        Spacer(Modifier.height(8.dp))
        Text(
            "Как Claude Code: правки, zip, shell — строго на устройстве.",
            color = AgColors.Muted,
            fontSize = 14.sp,
            lineHeight = 20.sp,
        )
        Spacer(Modifier.height(16.dp))
        listOf(
            "Распакуй zip в Download",
            "Найди баг в проекте",
            "Поправь код и сохрани",
        ).forEach { hint ->
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

@Composable
private fun UserBubble(text: String) {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.86f)
                .background(AgColors.Accent, RoundedCornerShape(18.dp, 18.dp, 4.dp, 18.dp))
                .padding(horizontal = 14.dp, vertical = 10.dp),
        ) {
            Text(text, color = AgColors.OnAccent, fontSize = 15.sp, lineHeight = 21.sp)
        }
    }
}

@Composable
private fun AssistantBubble(text: String) {
    Column(Modifier.fillMaxWidth().padding(end = 12.dp)) {
        Text("ANTIGRAVITY", color = AgColors.AccentDim, fontSize = 10.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.4.sp)
        Spacer(Modifier.height(6.dp))
        MarkdownBody(text)
    }
}

@Composable
private fun ThinkingBlock(message: ChatMessage, live: Boolean) {
    var open by remember(message.durationMs) { mutableStateOf(live) }
    val seconds = ((message.durationMs ?: 0L) / 1000.0).roundToInt().coerceAtLeast(1)
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
                        .graphicsLayer { rotationZ = if (open) 180f else 0f },
                )
            }
        }
        AnimatedVisibility(visible = live || open) {
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
private fun ToolCard(name: String, body: String, running: Boolean) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(AgColors.Surface, RoundedCornerShape(AgRadius.Chip))
            .border(1.dp, AgColors.Border, RoundedCornerShape(AgRadius.Chip))
            .padding(12.dp),
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                Modifier
                    .size(7.dp)
                    .background(if (running) AgColors.Accent else AgColors.AccentDim, CircleShape),
            )
            Spacer(Modifier.width(8.dp))
            Text(name, color = AgColors.Accent, fontSize = 12.sp, fontWeight = FontWeight.SemiBold, fontFamily = FontFamily.Monospace)
            Spacer(Modifier.weight(1f))
            Text(if (running) "running" else "done", color = AgColors.Muted, fontSize = 11.sp)
        }
        if (body.isNotBlank()) {
            Spacer(Modifier.height(8.dp))
            Text(body, color = AgColors.Thought, fontSize = 12.sp, fontFamily = FontFamily.Monospace, lineHeight = 17.sp)
        }
    }
}

@Composable
private fun Composer(
    draft: String,
    busy: Boolean,
    model: String,
    onDraft: (String) -> Unit,
    onModel: (String) -> Unit,
    onSettings: () -> Unit,
    onSend: () -> Unit,
) {
    val interaction = remember { MutableInteractionSource() }
    val pressed by interaction.collectIsPressedAsState()
    var menu by remember { mutableStateOf(false) }
    Row(
        modifier = Modifier
            .padding(12.dp)
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
        BasicTextField(
            value = draft,
            onValueChange = onDraft,
            textStyle = TextStyle(color = AgColors.Text, fontSize = 16.sp, lineHeight = 22.sp),
            cursorBrush = SolidColor(AgColors.Accent),
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 8.dp, vertical = 8.dp),
            decorationBox = { inner ->
                if (draft.isEmpty()) Text("Задача для телефона…", color = AgColors.Muted, fontSize = 16.sp)
                inner()
            },
        )
        Box(
            modifier = Modifier
                .size(44.dp)
                .clip(CircleShape)
                .clickable(onClick = onSettings),
            contentAlignment = Alignment.Center,
        ) {
            Icon(Icons.Outlined.Settings, contentDescription = "Настройки", tint = AgColors.Muted, modifier = Modifier.size(20.dp))
        }
        Box(
            modifier = Modifier
                .size(44.dp)
                .scale(if (pressed) 0.96f else 1f)
                .clip(CircleShape)
                .background(if (!busy && draft.isNotBlank()) AgColors.Accent else AgColors.SurfaceRaised)
                .clickable(
                    enabled = !busy && draft.isNotBlank(),
                    interactionSource = interaction,
                    indication = null,
                    onClick = onSend,
                ),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                Icons.AutoMirrored.Outlined.Send,
                contentDescription = "Отправить",
                tint = if (!busy && draft.isNotBlank()) AgColors.OnAccent else AgColors.Muted,
                modifier = Modifier.size(18.dp).padding(start = 1.dp),
            )
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
private fun BrandMark() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(Icons.Outlined.Lock, contentDescription = null, tint = AgColors.Accent, modifier = Modifier.size(16.dp))
        Spacer(Modifier.width(8.dp))
        Text("ANTIGRAVITY", color = AgColors.Accent, fontSize = 12.sp, fontWeight = FontWeight.Bold, letterSpacing = 2.sp)
    }
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
    Button(
        onClick = onClick,
        enabled = enabled,
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
