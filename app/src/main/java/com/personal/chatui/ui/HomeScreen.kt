package com.personal.chatui.ui

import androidx.activity.compose.BackHandler
import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.union
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Send
import androidx.compose.material.icons.outlined.AttachFile
import androidx.compose.material.icons.outlined.PhotoCamera
import androidx.compose.material.icons.outlined.PhotoLibrary
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.personal.chatui.R
import com.personal.chatui.data.AppViewModel
import com.personal.chatui.data.ChatMessage
import com.personal.chatui.ui.theme.LocalPalette
import kotlinx.coroutines.launch

private val UserBubble = Color(0xFF10145A)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    viewModel: AppViewModel,
    onNavigate: (String) -> Unit,
) {
    val palette = LocalPalette.current
    val snackbar = remember { SnackbarHostState() }
    var drawerOpen by remember { mutableStateOf(false) }
    var pendingDelete by remember { mutableStateOf<Long?>(null) }
    val progress by animateFloatAsState(
        targetValue = if (drawerOpen) 1f else 0f,
        animationSpec = spring(dampingRatio = 0.78f, stiffness = Spring.StiffnessMediumLow),
        label = "drawer",
    )
    BackHandler(enabled = drawerOpen) { drawerOpen = false }

    Box(Modifier.fillMaxSize().background(Color.Black)) {
        Box(
            Modifier
                .fillMaxSize()
                .graphicsLayer {
                    val shift = progress
                    scaleX = 1f - 0.045f * shift
                    scaleY = 1f - 0.045f * shift
                    transformOrigin = TransformOrigin(0.5f, 0.5f)
                    shape = RoundedCornerShape((26f * shift).dp)
                    clip = shift > 0.01f
                }
                .blur((18f * progress).dp),
        ) {
            ChatPane(
                viewModel = viewModel,
                snackbar = snackbar,
                onMenu = { drawerOpen = true },
                onConnect = { onNavigate(Routes.Connect) },
            )
            if (!drawerOpen) {
                Box(
                    Modifier
                        .align(Alignment.CenterStart)
                        .fillMaxHeight()
                        .width(28.dp)
                        .pointerInput(Unit) {
                            detectHorizontalDragGestures { _, drag ->
                                if (drag > 28f) drawerOpen = true
                            }
                        },
                )
            }
        }
        if (progress > 0.02f) {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.28f * progress))
                    .clickable(
                        enabled = drawerOpen,
                        indication = null,
                        interactionSource = remember { MutableInteractionSource() },
                    ) { drawerOpen = false },
            )
        }
        Box(
            Modifier
                .fillMaxSize()
                .graphicsLayer { translationX = size.width * (progress - 1f) }
                .pointerInput(drawerOpen) {
                    detectHorizontalDragGestures { _, drag ->
                        if (drag < -36f) drawerOpen = false
                    }
                },
        ) {
            DrawerContent(
                viewModel = viewModel,
                onNavigate = { route ->
                    drawerOpen = false
                    onNavigate(route)
                },
                onChat = { id ->
                    viewModel.currentChatId = id
                    drawerOpen = false
                },
                onNewChat = {
                    viewModel.newChat()
                    drawerOpen = false
                },
                onLongChat = { pendingDelete = it },
            )
        }
        SnackbarHost(
            hostState = snackbar,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 96.dp),
        )
    }

    val deleteId = pendingDelete
    if (deleteId != null) {
        val title = viewModel.chats.firstOrNull { it.id == deleteId }?.title.orEmpty()
        AlertDialog(
            onDismissRequest = { pendingDelete = null },
            containerColor = palette.card,
            titleContentColor = palette.text,
            textContentColor = palette.secondary,
            title = { Text("Удалить чат") },
            text = { Text(title) },
            confirmButton = {
                TextButton(onClick = {
                    viewModel.deleteChat(deleteId)
                    pendingDelete = null
                }) { Text("Удалить", color = palette.logout) }
            },
            dismissButton = {
                TextButton(onClick = { pendingDelete = null }) { Text("Отмена", color = palette.text) }
            },
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun DrawerContent(
    viewModel: AppViewModel,
    onNavigate: (String) -> Unit,
    onChat: (Long) -> Unit,
    onNewChat: () -> Unit,
    onLongChat: (Long) -> Unit,
) {
    val palette = LocalPalette.current
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.Black)
            .statusBarsPadding()
            .windowInsetsPadding(WindowInsets.navigationBars),
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 22.dp, end = 8.dp, top = 18.dp, bottom = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                "ChatGPT",
                color = palette.text,
                fontSize = 22.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.weight(1f),
            )
            HeaderGlyph(R.drawable.ic_search, "Поиск") { onNavigate(Routes.Search) }
            HeaderGlyph(R.drawable.ic_compose, "Новый чат", onNewChat)
        }
        DrawerItem(R.drawable.ic_images, "Изображения") { onNavigate(Routes.Images) }
        DrawerItem(R.drawable.ic_library, "Библиотека") { onNavigate(Routes.Library) }
        DrawerItem(R.drawable.ic_folder, "Проекты") { onNavigate(Routes.Projects) }
        DrawerItem(R.drawable.ic_remote, "Remote") { onNavigate(Routes.Remote) }
        DrawerItem(R.drawable.ic_clock, "Запланировано") { onNavigate(Routes.Scheduled) }
        DrawerItem(R.drawable.ic_plugins, "Плагины") { onNavigate(Routes.Plugins) }
        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp),
            color = Color(0xFF2A2A2A),
            thickness = 0.5.dp,
        )
        LazyColumn(Modifier.weight(1f)) {
            items(viewModel.chats, key = { it.id }) { chat ->
                val selected = chat.id == viewModel.currentChatId
                Text(
                    text = chat.title,
                    color = palette.text,
                    fontSize = 16.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .padding(horizontal = 10.dp, vertical = 1.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(if (selected) palette.input else Color.Transparent)
                        .combinedClickable(
                            onClick = { onChat(chat.id) },
                            onLongClick = { onLongChat(chat.id) },
                        )
                        .padding(horizontal = 14.dp, vertical = 13.dp)
                        .fillMaxWidth(),
                )
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Row(
                Modifier
                    .height(48.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .background(palette.accent)
                    .clickable(onClick = onNewChat)
                    .padding(horizontal = 18.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                CutIcon(R.drawable.ic_compose, modifier = Modifier.size(18.dp), tint = Color.White)
                Spacer(Modifier.width(8.dp))
                Text("Чат", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Medium)
            }
            Spacer(Modifier.weight(1f))
            PhotoCircle(R.drawable.ic_settings, "Настройки", 46.dp) { onNavigate(Routes.Settings) }
        }
    }
}

@Composable
private fun HeaderGlyph(@DrawableRes icon: Int, description: String, onClick: () -> Unit) {
    Box(
        Modifier
            .size(44.dp)
            .clip(CircleShape)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        CutIcon(icon, modifier = Modifier.size(22.dp), description = description)
    }
}

@Composable
private fun DrawerItem(@DrawableRes icon: Int, title: String, onClick: () -> Unit) {
    val palette = LocalPalette.current
    Row(
        Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 22.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        CutIcon(icon, modifier = Modifier.size(22.dp))
        Spacer(Modifier.width(16.dp))
        Text(title, color = palette.text, fontSize = 16.sp)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ChatPane(
    viewModel: AppViewModel,
    snackbar: SnackbarHostState,
    onMenu: () -> Unit,
    onConnect: () -> Unit,
) {
    val palette = LocalPalette.current
    val scope = rememberCoroutineScope()
    val thread = viewModel.chats.firstOrNull { it.id == viewModel.currentChatId }
    var draft by remember(viewModel.currentChatId) { mutableStateOf("") }
    var sheet by remember { mutableStateOf(false) }
    val showSuggestions = viewModel.showSuggestions && draft.isEmpty() && (thread == null || thread.messages.isEmpty())
    val hint = if (thread != null && thread.messages.isNotEmpty()) "Ответить ChatGPT" else "Спросить ChatGPT"

    fun tell(text: String) {
        scope.launch { snackbar.showSnackbar(text) }
    }

    BoxWithConstraints(Modifier.fillMaxSize().background(palette.bg)) {
        val screenWidth = maxWidth
        val side = screenWidth * 0.08f
        val circle = screenWidth * 0.112f
        val composerHeight = screenWidth * 0.128f
        val voice = composerHeight * 0.66f
        Column(Modifier.fillMaxSize()) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .statusBarsPadding()
                    .padding(horizontal = screenWidth * 0.035f, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                PhotoCircle(R.drawable.ic_nav_menu, "Меню", circle, onMenu)
                Spacer(Modifier.width(10.dp))
                Row(
                    Modifier
                        .height(circle * 0.82f)
                        .clip(RoundedCornerShape(50))
                        .background(Color(0xFF1A1C1E))
                        .clickable(onClick = onConnect)
                        .padding(horizontal = 14.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    CutIcon(
                        R.drawable.ic_sparkle,
                        modifier = Modifier.size(circle * 0.38f),
                        tint = palette.accent,
                    )
                    Spacer(Modifier.width(6.dp))
                    Text("Подключить", color = palette.accent, fontSize = 15.sp, fontWeight = FontWeight.Medium)
                }
                Spacer(Modifier.weight(1f))
                PhotoCircle(R.drawable.ic_compose, "Новый чат", circle) { viewModel.newChat() }
            }

            if (thread != null && thread.messages.isNotEmpty()) {
                LazyColumn(
                    modifier = Modifier.weight(1f).fillMaxWidth(),
                    reverseLayout = true,
                    contentPadding = PaddingValues(horizontal = side, vertical = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                ) {
                    items(thread.messages.asReversed(), key = { it.id }) { message ->
                        Appearing(enabled = message.id >= 1000) {
                            Bubble(message, screenWidth * 0.78f)
                        }
                    }
                }
            } else {
                Spacer(Modifier.weight(1f))
            }

            AnimatedVisibility(
                visible = showSuggestions,
                enter = fadeIn(tween(220)) + slideInVertically(tween(280)) { it / 3 },
                exit = fadeOut(tween(140)) + slideOutVertically(tween(180)) { it / 4 },
            ) {
                Column(Modifier.padding(bottom = 8.dp)) {
                    Suggestion(R.drawable.ic_suggest_image, "Создать изображение") { draft = "Создай изображение " }
                    Suggestion(R.drawable.ic_suggest_write, "Напиши или отредактируй") { draft = "Напиши текст: " }
                    Suggestion(R.drawable.ic_suggest_web, "Искать в интернете") { draft = "Найди в интернете " }
                }
            }

            val hasText = draft.isNotBlank()
            Row(
                Modifier
                    .windowInsetsPadding(WindowInsets.ime.union(WindowInsets.navigationBars))
                    .padding(horizontal = side, vertical = 10.dp)
                    .fillMaxWidth()
                    .heightIn(min = composerHeight)
                    .clip(RoundedCornerShape(composerHeight / 2))
                    .background(palette.input)
                    .padding(start = 4.dp, end = 6.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(
                    Modifier
                        .size(voice)
                        .clip(CircleShape)
                        .clickable { sheet = true },
                    contentAlignment = Alignment.Center,
                ) {
                    CutIcon(R.drawable.ic_plus, modifier = Modifier.size(voice * 0.46f), description = "Вложение")
                }
                BasicTextField(
                    value = draft,
                    onValueChange = { draft = it },
                    modifier = Modifier.weight(1f).padding(vertical = 8.dp),
                    textStyle = TextStyle(color = palette.text, fontSize = 16.sp),
                    cursorBrush = SolidColor(palette.accent),
                    maxLines = 5,
                    keyboardOptions = KeyboardOptions(
                        capitalization = KeyboardCapitalization.Sentences,
                        imeAction = ImeAction.Send,
                    ),
                    keyboardActions = KeyboardActions(onSend = {
                        viewModel.send(draft)
                        draft = ""
                    }),
                    decorationBox = { inner ->
                        Box(contentAlignment = Alignment.CenterStart) {
                            if (draft.isEmpty()) {
                                Crossfade(hint, animationSpec = tween(180), label = "hint") { label ->
                                    Text(label, color = palette.subtitle, fontSize = 16.sp)
                                }
                            }
                            inner()
                        }
                    },
                )
                Box(
                    Modifier
                        .size(voice * 0.9f)
                        .clip(CircleShape)
                        .clickable { tell("Микрофон в этой копии ничего не записывает") },
                    contentAlignment = Alignment.Center,
                ) {
                    CutIcon(
                        R.drawable.ic_mic,
                        modifier = Modifier.size(voice * 0.48f),
                        description = "Микрофон",
                        tint = palette.subtitle,
                    )
                }
                Spacer(Modifier.width(4.dp))
                Box(
                    Modifier
                        .size(voice)
                        .clip(CircleShape)
                        .background(palette.accent)
                        .clickable {
                            if (hasText) {
                                viewModel.send(draft)
                                draft = ""
                            } else {
                                tell("Голосовой режим без модели недоступен")
                            }
                        },
                    contentAlignment = Alignment.Center,
                ) {
                    if (hasText) {
                        Icon(
                            Icons.AutoMirrored.Outlined.Send,
                            contentDescription = "Отправить",
                            tint = Color.White,
                            modifier = Modifier.size(voice * 0.42f),
                        )
                    } else {
                        CutIcon(
                            R.drawable.ic_wave,
                            modifier = Modifier.size(voice * 0.5f),
                            description = "Голос",
                            tint = Color.White,
                        )
                    }
                }
            }
        }
    }

    if (sheet) {
        ModalBottomSheet(
            onDismissRequest = { sheet = false },
            containerColor = Color(0xFF1C1C1E),
            contentColor = Color.White,
        ) {
            SheetItem(Icons.Outlined.PhotoCamera, "Камера") {
                sheet = false
                tell("Камера в этой копии не открывается")
            }
            SheetItem(Icons.Outlined.PhotoLibrary, "Фотографии") {
                sheet = false
                tell("Галерея в этой копии не открывается")
            }
            SheetItem(Icons.Outlined.AttachFile, "Файл") {
                sheet = false
                tell("Файлы в этой копии не прикрепляются")
            }
            Spacer(Modifier.height(24.dp))
        }
    }
}

@Composable
private fun PhotoCircle(@DrawableRes icon: Int, description: String, size: Dp, onClick: () -> Unit) {
    val palette = LocalPalette.current
    val pressed = remember { MutableInteractionSource() }
    Box(
        Modifier
            .size(size)
            .clip(CircleShape)
            .background(palette.input)
            .clickable(
                interactionSource = pressed,
                indication = ripple(bounded = true, color = Color.White),
                onClick = onClick,
            ),
        contentAlignment = Alignment.Center,
    ) {
        CutIcon(icon, modifier = Modifier.size(size * 0.46f), description = description)
    }
}

@Composable
private fun Appearing(enabled: Boolean, content: @Composable () -> Unit) {
    var shown by remember { mutableStateOf(!enabled) }
    LaunchedEffect(Unit) { shown = true }
    AnimatedVisibility(
        visible = shown,
        enter = fadeIn(tween(180)) + slideInVertically(tween(220)) { it / 3 },
    ) { content() }
}

@Composable
private fun Bubble(message: ChatMessage, maxWidth: Dp) {
    val palette = LocalPalette.current
    if (message.fromUser) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
            Text(
                text = message.text,
                color = Color.White,
                fontSize = 16.sp,
                modifier = Modifier
                    .widthIn(max = maxWidth)
                    .clip(RoundedCornerShape(22.dp))
                    .background(UserBubble)
                    .padding(horizontal = 14.dp, vertical = 10.dp),
            )
        }
    } else {
        Text(
            text = message.text,
            color = palette.text,
            fontSize = 16.sp,
            lineHeight = 22.sp,
            modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp),
        )
    }
}

@Composable
private fun Suggestion(@DrawableRes icon: Int, title: String, onClick: () -> Unit) {
    val palette = LocalPalette.current
    Row(
        Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 28.dp, vertical = 13.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        CutIcon(icon, modifier = Modifier.size(22.dp))
        Spacer(Modifier.width(16.dp))
        Text(title, color = palette.text, fontSize = 16.sp)
    }
}

@Composable
private fun SheetItem(icon: ImageVector, title: String, onClick: () -> Unit) {
    Row(
        Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 20.dp, vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(icon, contentDescription = null, tint = Color.White, modifier = Modifier.size(22.dp))
        Spacer(Modifier.width(14.dp))
        Text(title, color = Color.White, fontSize = 16.sp)
    }
}
