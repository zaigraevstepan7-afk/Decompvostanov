package com.personal.chatui.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.union
import androidx.compose.foundation.layout.width
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
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Apps
import androidx.compose.material.icons.outlined.AttachFile
import androidx.compose.material.icons.outlined.AutoAwesome
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Folder
import androidx.compose.material.icons.outlined.GraphicEq
import androidx.compose.material.icons.outlined.Image
import androidx.compose.material.icons.automirrored.outlined.LibraryBooks
import androidx.compose.material.icons.outlined.Laptop
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Mic
import androidx.compose.material.icons.outlined.PhotoCamera
import androidx.compose.material.icons.outlined.PhotoLibrary
import androidx.compose.material.icons.outlined.Public
import androidx.compose.material.icons.outlined.Schedule
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.PaddingValues
import com.personal.chatui.data.AppViewModel
import com.personal.chatui.data.ChatMessage
import com.personal.chatui.ui.theme.LocalPalette
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    viewModel: AppViewModel,
    onNavigate: (String) -> Unit,
) {
    val palette = LocalPalette.current
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val snackbar = remember { SnackbarHostState() }
    val drawerWidth = LocalConfiguration.current.screenWidthDp.dp - 52.dp
    var pendingDelete by remember { mutableStateOf<Long?>(null) }

    ModalNavigationDrawer(
        drawerState = drawerState,
        scrimColor = Color.Black.copy(alpha = 0.45f),
        drawerContent = {
            ModalDrawerSheet(
                modifier = Modifier.width(drawerWidth).fillMaxHeight(),
                drawerShape = RoundedCornerShape(0.dp),
                drawerContainerColor = Color.Black,
                drawerContentColor = Color.White,
                drawerTonalElevation = 0.dp,
                windowInsets = WindowInsets(0, 0, 0, 0),
            ) {
                DrawerContent(
                    viewModel = viewModel,
                    onNavigate = { route ->
                        scope.launch {
                            drawerState.close()
                            onNavigate(route)
                        }
                    },
                    onChat = { id ->
                        viewModel.currentChatId = id
                        scope.launch { drawerState.close() }
                    },
                    onNewChat = {
                        viewModel.newChat()
                        scope.launch { drawerState.close() }
                    },
                    onLongChat = { pendingDelete = it },
                )
            }
        },
    ) {
        Box(Modifier.fillMaxSize()) {
            ChatPane(
                viewModel = viewModel,
                snackbar = snackbar,
                onMenu = { scope.launch { drawerState.open() } },
                onConnect = { onNavigate(Routes.Connect) },
            )
            SnackbarHost(
                hostState = snackbar,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 96.dp),
            )
        }
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
            .statusBarsPadding()
            .windowInsetsPadding(WindowInsets.navigationBars),
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 8.dp, top = 8.dp, bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                "ChatGPT",
                color = palette.text,
                fontSize = 26.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.weight(1f),
            )
            CirclePlain(Icons.Outlined.Search, "Поиск") { onNavigate(Routes.Search) }
            CirclePlain(Icons.Outlined.Edit, "Новый чат", onNewChat)
        }
        DrawerItem(Icons.Outlined.Image, "Изображения") { onNavigate(Routes.Images) }
        DrawerItem(Icons.AutoMirrored.Outlined.LibraryBooks, "Библиотека") { onNavigate(Routes.Library) }
        DrawerItem(Icons.Outlined.Folder, "Проекты") { onNavigate(Routes.Projects) }
        DrawerItem(Icons.Outlined.Laptop, "Remote") { onNavigate(Routes.Remote) }
        DrawerItem(Icons.Outlined.Schedule, "Запланировано") { onNavigate(Routes.Scheduled) }
        DrawerItem(Icons.Outlined.Apps, "Плагины") { onNavigate(Routes.Plugins) }
        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
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
                        .padding(horizontal = 8.dp, vertical = 2.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(if (selected) palette.input else Color.Transparent)
                        .combinedClickable(
                            onClick = { onChat(chat.id) },
                            onLongClick = { onLongChat(chat.id) },
                        )
                        .padding(horizontal = 12.dp, vertical = 12.dp)
                        .fillMaxWidth(),
                )
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Row(
                Modifier
                    .clip(RoundedCornerShape(22.dp))
                    .background(palette.accent)
                    .clickable(onClick = onNewChat)
                    .padding(horizontal = 16.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(Icons.Outlined.Edit, contentDescription = null, tint = Color.White, modifier = Modifier.size(18.dp))
                Spacer(Modifier.width(8.dp))
                Text("Чат", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Medium)
            }
            Spacer(Modifier.weight(1f))
            CircleButton(Icons.Outlined.Settings, "Настройки", { onNavigate(Routes.Settings) }, size = 44.dp)
        }
    }
}

@Composable
private fun CirclePlain(icon: ImageVector, description: String, onClick: () -> Unit) {
    val palette = LocalPalette.current
    Box(
        Modifier
            .size(40.dp)
            .clip(CircleShape)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        Icon(icon, contentDescription = description, tint = palette.text, modifier = Modifier.size(22.dp))
    }
}

@Composable
private fun DrawerItem(icon: ImageVector, title: String, onClick: () -> Unit) {
    val palette = LocalPalette.current
    Row(
        Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 20.dp, vertical = 13.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(icon, contentDescription = null, tint = palette.text, modifier = Modifier.size(22.dp))
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

    fun tell(text: String) {
        scope.launch { snackbar.showSnackbar(text) }
    }

    Column(Modifier.fillMaxSize().background(palette.bg)) {
        Row(
            Modifier
                .fillMaxWidth()
                .statusBarsPadding()
                .padding(horizontal = 12.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            CircleButton(Icons.Outlined.Menu, "Меню", onMenu)
            Spacer(Modifier.width(8.dp))
            Row(
                Modifier
                    .height(36.dp)
                    .clip(RoundedCornerShape(18.dp))
                    .background(Color(0xFF1A1A1A))
                    .clickable(onClick = onConnect)
                    .padding(horizontal = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    Icons.Outlined.AutoAwesome,
                    contentDescription = null,
                    tint = palette.accent,
                    modifier = Modifier.size(16.dp),
                )
                Spacer(Modifier.width(6.dp))
                Text("Подключить", color = palette.accent, fontSize = 15.sp, fontWeight = FontWeight.Medium)
            }
            Spacer(Modifier.weight(1f))
            CircleButton(Icons.Outlined.Edit, "Новый чат", onClick = { viewModel.newChat() })
        }

        if (thread != null && thread.messages.isNotEmpty()) {
            LazyColumn(
                modifier = Modifier.weight(1f).fillMaxWidth(),
                reverseLayout = true,
                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 8.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                items(thread.messages.asReversed(), key = { it.id }) { message ->
                    Bubble(message)
                }
            }
        } else {
            Spacer(Modifier.weight(1f))
        }

        if (showSuggestions) {
            Suggestion(Icons.Outlined.Image, "Создать изображение") { draft = "Создай изображение " }
            Suggestion(Icons.Outlined.Edit, "Напиши или отредактируй") { draft = "Напиши текст: " }
            Suggestion(Icons.Outlined.Public, "Искать в интернете") { draft = "Найди в интернете " }
            Spacer(Modifier.height(6.dp))
        }

        Row(
            Modifier
                .windowInsetsPadding(WindowInsets.ime.union(WindowInsets.navigationBars))
                .padding(horizontal = 12.dp, vertical = 8.dp)
                .fillMaxWidth()
                .heightIn(min = 52.dp)
                .clip(RoundedCornerShape(26.dp))
                .background(palette.input)
                .padding(start = 4.dp, end = 6.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .clickable { sheet = true },
                contentAlignment = Alignment.Center,
            ) {
                Icon(Icons.Outlined.Add, contentDescription = "Вложение", tint = palette.text)
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
                            Text("Спросить ChatGPT", color = palette.subtitle, fontSize = 16.sp)
                        }
                        inner()
                    }
                },
            )
            Box(
                Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .clickable { tell("Микрофон в этой копии ничего не записывает") },
                contentAlignment = Alignment.Center,
            ) {
                Icon(Icons.Outlined.Mic, contentDescription = "Микрофон", tint = palette.subtitle, modifier = Modifier.size(20.dp))
            }
            Spacer(Modifier.width(4.dp))
            val hasText = draft.isNotBlank()
            Box(
                Modifier
                    .size(34.dp)
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
                Icon(
                    if (hasText) Icons.AutoMirrored.Outlined.Send else Icons.Outlined.GraphicEq,
                    contentDescription = if (hasText) "Отправить" else "Голос",
                    tint = Color.White,
                    modifier = Modifier.size(18.dp),
                )
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
private fun Bubble(message: ChatMessage) {
    val palette = LocalPalette.current
    if (message.fromUser) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
            Text(
                text = message.text,
                color = palette.text,
                fontSize = 16.sp,
                modifier = Modifier
                    .widthIn(max = 320.dp)
                    .clip(RoundedCornerShape(18.dp))
                    .background(palette.bubble)
                    .padding(horizontal = 14.dp, vertical = 10.dp),
            )
        }
    } else {
        Text(
            text = message.text,
            color = palette.text,
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 6.dp, vertical = 4.dp),
        )
    }
}

@Composable
private fun Suggestion(icon: ImageVector, title: String, onClick: () -> Unit) {
    val palette = LocalPalette.current
    Row(
        Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 22.dp, vertical = 11.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(icon, contentDescription = null, tint = palette.text, modifier = Modifier.size(22.dp))
        Spacer(Modifier.width(14.dp))
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
