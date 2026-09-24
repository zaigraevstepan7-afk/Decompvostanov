package com.personal.chatui.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Image
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.personal.chatui.data.Accent
import com.personal.chatui.data.AppViewModel
import com.personal.chatui.data.ThemeMode
import com.personal.chatui.data.Voices
import com.personal.chatui.ui.theme.LocalPalette

@Composable
fun ConnectPage(viewModel: AppViewModel, onBack: () -> Unit) {
    Subpage("Подключить", onBack) {
        Note("Переключатели хранятся на устройстве и никуда не отправляются.")
        CardBlock {
            viewModel.connectors.forEachIndexed { index, connector ->
                ToggleRow(
                    title = connector.name,
                    checked = connector.enabled,
                    onChecked = { viewModel.toggleConnector(connector.name) },
                    showDivider = index != viewModel.connectors.lastIndex,
                )
            }
        }
    }
}

@Composable
fun ImagesPage(onBack: () -> Unit) {
    val palette = LocalPalette.current
    Subpage("Изображения", onBack) {
        Column(
            Modifier.fillMaxWidth().padding(top = 80.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            androidx.compose.material3.Icon(
                Icons.Outlined.Image,
                contentDescription = null,
                tint = palette.subtitle,
                modifier = Modifier.size(48.dp),
            )
            Text(
                "Здесь появятся изображения",
                color = palette.secondary,
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 12.dp),
            )
        }
    }
}

@Composable
fun LibraryPage(viewModel: AppViewModel, onBack: () -> Unit, onOpenChat: (Long) -> Unit) {
    Subpage("Библиотека", onBack) {
        Note("Чаты на этом устройстве")
        CardBlock {
            if (viewModel.chats.isEmpty()) {
                Text(
                    "Пока пусто",
                    color = LocalPalette.current.secondary,
                    modifier = Modifier.padding(16.dp),
                )
            } else {
                viewModel.chats.forEachIndexed { index, chat ->
                    ChoiceRow(
                        title = chat.title,
                        selected = chat.id == viewModel.currentChatId,
                        onClick = { onOpenChat(chat.id) },
                        showDivider = index != viewModel.chats.lastIndex,
                    )
                }
            }
        }
    }
}

@Composable
fun ProjectsPage(viewModel: AppViewModel, onBack: () -> Unit) {
    var ask by remember { mutableStateOf(false) }
    var name by remember { mutableStateOf("") }
    Subpage("Проекты", onBack) {
        Note("Проекты сохраняются только в этой копии.")
        CardBlock {
            if (viewModel.projects.isEmpty()) {
                Text("Нет проектов", color = LocalPalette.current.secondary, modifier = Modifier.padding(16.dp))
            } else {
                viewModel.projects.forEachIndexed { index, project ->
                    ChoiceRow(project, selected = false, onClick = {}, showDivider = index != viewModel.projects.lastIndex)
                }
            }
        }
        ScreenGap()
        ActionButton("Создать проект") { ask = true }
    }
    if (ask) {
        NameDialog(
            title = "Новый проект",
            value = name,
            onValue = { name = it },
            onDismiss = { ask = false },
            onConfirm = {
                viewModel.addProject(name)
                name = ""
                ask = false
            },
        )
    }
}

@Composable
fun RemotePage(viewModel: AppViewModel, onBack: () -> Unit) {
    Subpage("Удалённое управление", onBack) {
        Note("Удалённый доступ к этому телефону не включается. Переключатель ничего не открывает в сети.")
        CardBlock {
            ToggleRow(
                title = "Показывать статус Remote",
                checked = viewModel.remoteEnabled,
                onChecked = { viewModel.remoteEnabled = it },
            )
        }
    }
}

@Composable
fun ScheduledPage(viewModel: AppViewModel, onBack: () -> Unit) {
    var ask by remember { mutableStateOf(false) }
    var name by remember { mutableStateOf("") }
    Subpage("Запланировано", onBack) {
        CardBlock {
            if (viewModel.tasks.isEmpty()) {
                Text("Нет запланированных задач", color = LocalPalette.current.secondary, modifier = Modifier.padding(16.dp))
            } else {
                viewModel.tasks.forEachIndexed { index, task ->
                    ChoiceRow(task, selected = false, onClick = {}, showDivider = index != viewModel.tasks.lastIndex)
                }
            }
        }
        ScreenGap()
        ActionButton("Добавить задачу") { ask = true }
    }
    if (ask) {
        NameDialog(
            title = "Новая задача",
            value = name,
            onValue = { name = it },
            onDismiss = { ask = false },
            onConfirm = {
                viewModel.addTask(name)
                name = ""
                ask = false
            },
        )
    }
}

@Composable
fun PluginsPage(onBack: () -> Unit) {
    Subpage("Плагины", onBack) {
        Note("Подключённых плагинов нет. Внешние сервисы отсюда не запускаются.")
    }
}

@Composable
fun SearchPage(viewModel: AppViewModel, onBack: () -> Unit, onOpenChat: (Long) -> Unit) {
    val palette = LocalPalette.current
    var query by remember { mutableStateOf("") }
    val results = viewModel.chats.filter { it.title.contains(query, ignoreCase = true) }
    Subpage("Поиск", onBack) {
        Box(
            Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(14.dp))
                .background(palette.input)
                .padding(horizontal = 14.dp, vertical = 12.dp),
        ) {
            if (query.isEmpty()) {
                Text("Поиск по чатам", color = palette.subtitle, fontSize = 16.sp)
            }
            BasicTextField(
                value = query,
                onValueChange = { query = it },
                textStyle = TextStyle(color = palette.text, fontSize = 16.sp),
                cursorBrush = SolidColor(palette.accent),
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
            )
        }
        CardBlock {
            if (results.isEmpty()) {
                Text("Ничего не найдено", color = palette.secondary, modifier = Modifier.padding(16.dp))
            } else {
                results.forEachIndexed { index, chat ->
                    ChoiceRow(
                        title = chat.title,
                        selected = false,
                        onClick = { onOpenChat(chat.id) },
                        showDivider = index != results.lastIndex,
                    )
                }
            }
        }
    }
}

@Composable
fun PersonalizationPage(viewModel: AppViewModel, onBack: () -> Unit) {
    Subpage("Персонализация", onBack) {
        Note("Эти поля читает только этот телефон.")
        LabeledField("Как к вам обращаться", viewModel.displayName) { viewModel.displayName = it }
        LabeledField("О вас", viewModel.aboutYou) { viewModel.aboutYou = it }
        LabeledField("Каким должен быть ответ", viewModel.responseStyle) { viewModel.responseStyle = it }
    }
}

@Composable
fun MemoryPage(viewModel: AppViewModel, onBack: () -> Unit) {
    Subpage("Память", onBack) {
        CardBlock {
            ToggleRow(
                title = "Использовать память",
                checked = viewModel.memoryEnabled,
                onChecked = { viewModel.memoryEnabled = it },
                subtitle = "Только внутри этой копии",
            )
        }
        ScreenGap()
        CardBlock {
            if (!viewModel.memoryEnabled || viewModel.memoryNote.isBlank()) {
                Text("Нет сохранённых воспоминаний", color = LocalPalette.current.secondary, modifier = Modifier.padding(16.dp))
            } else {
                ChoiceRow(viewModel.memoryNote, selected = false, onClick = { viewModel.memoryNote = "" })
            }
        }
        Note("Нажатие на строку стирает её с устройства.")
    }
}

@Composable
fun WorkspacePage(onBack: () -> Unit) {
    Subpage("Рабочая область", onBack) {
        CardBlock {
            ChoiceRow("Личное", selected = true, onClick = {})
        }
        Note("Другие рабочие области не подключены.")
    }
}

@Composable
fun PlanPage(onBack: () -> Unit) {
    val palette = LocalPalette.current
    Subpage("Изменить план", onBack) {
        Note("Оплата не подключена. Карты и счета здесь не вводятся.")
        PlanCard("Free", "Текущий просмотр интерфейса", selected = true)
        Spacer(Modifier.height(10.dp))
        PlanCard("Plus", "В этой копии не активируется", selected = false)
        Spacer(Modifier.height(10.dp))
        PlanCard("Pro", "В этой копии не активируется", selected = false)
        Text(
            "Смена плана недоступна",
            color = palette.subtitle,
            fontSize = 13.sp,
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp),
        )
    }
}

@Composable
private fun PlanCard(title: String, body: String, selected: Boolean) {
    val palette = LocalPalette.current
    Column(
        Modifier
            .padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(palette.card)
            .padding(16.dp)
            .fillMaxWidth(),
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(title, color = palette.text, fontSize = 18.sp, fontWeight = FontWeight.SemiBold, modifier = Modifier.weight(1f))
            if (selected) Text("Сейчас", color = palette.accent, fontSize = 14.sp)
        }
        Text(body, color = palette.secondary, fontSize = 14.sp, modifier = Modifier.padding(top = 6.dp))
    }
}

@Composable
fun UsagePage(viewModel: AppViewModel, onBack: () -> Unit) {
    val palette = LocalPalette.current
    val progress = (viewModel.messagesSent / 50f).coerceIn(0f, 1f)
    Subpage("Использование и лимиты", onBack) {
        CardBlock {
            Column(Modifier.padding(16.dp)) {
                Text("Сообщений в этой копии", color = palette.secondary, fontSize = 13.sp)
                Text(
                    viewModel.messagesSent.toString(),
                    color = palette.text,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(top = 4.dp),
                )
                LinearProgressIndicator(
                    progress = { progress },
                    modifier = Modifier.fillMaxWidth().padding(top = 12.dp),
                    color = palette.accent,
                    trackColor = palette.input,
                )
            }
        }
        Note("Счётчик местный. К серверам он не относится.")
    }
}

@Composable
fun ParentalPage(viewModel: AppViewModel, onBack: () -> Unit) {
    Subpage("Родительский контроль", onBack) {
        CardBlock {
            ToggleRow(
                title = "Родительский контроль",
                checked = viewModel.parentalControl,
                onChecked = { viewModel.parentalControl = it },
                subtitle = "Только пометка на устройстве",
            )
        }
        Note("Аккаунт ребёнка и семейный доступ отсюда не создаются.")
    }
}

@Composable
fun EmailPage(viewModel: AppViewModel, onBack: () -> Unit) {
    val palette = LocalPalette.current
    Subpage("Электронная почта", onBack) {
        CardBlock {
            Column(Modifier.padding(16.dp)) {
                Text(viewModel.email, color = palette.text, fontSize = 16.sp)
                Text("Подтверждена", color = palette.accent, fontSize = 14.sp, modifier = Modifier.padding(top = 6.dp))
            }
        }
        Note("Адрес показан как на вашем экране. Письма отсюда не уходят.")
    }
}

@Composable
fun AgePage(viewModel: AppViewModel, onBack: () -> Unit) {
    Subpage("Проверка возраста", onBack) {
        CardBlock {
            ChoiceRow(
                title = if (viewModel.ageConfirmed) "Возраст отмечен на устройстве" else "Возраст не отмечен",
                selected = viewModel.ageConfirmed,
                onClick = { viewModel.ageConfirmed = !viewModel.ageConfirmed },
            )
        }
        Note("Это локальная отметка. Документы никуда не отправляются.")
    }
}

@Composable
fun AppearancePage(viewModel: AppViewModel, onBack: () -> Unit) {
    Subpage("Внешний вид", onBack) {
        CardBlock {
            ThemeMode.entries.forEachIndexed { index, mode ->
                ChoiceRow(
                    title = mode.label,
                    selected = viewModel.themeMode == mode,
                    onClick = { viewModel.themeMode = mode },
                    showDivider = index != ThemeMode.entries.lastIndex,
                )
            }
        }
    }
}

@Composable
fun AccentPage(viewModel: AppViewModel, onBack: () -> Unit) {
    Subpage("Акцентный цвет", onBack) {
        CardBlock {
            Accent.entries.forEachIndexed { index, accent ->
                Row(
                    Modifier
                        .fillMaxWidth()
                        .clickable { viewModel.accent = accent }
                        .padding(horizontal = 16.dp, vertical = 14.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Box(Modifier.size(14.dp).clip(CircleShape).background(accent.color))
                    Text(
                        accent.label,
                        color = LocalPalette.current.text,
                        fontSize = 16.sp,
                        modifier = Modifier.weight(1f).padding(start = 12.dp),
                    )
                    if (viewModel.accent == accent) {
                        Text("✓", color = accent.color, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
                    }
                }
                if (index != Accent.entries.lastIndex) {
                    androidx.compose.material3.HorizontalDivider(
                        thickness = 0.5.dp,
                        color = LocalPalette.current.hairline,
                    )
                }
            }
        }
    }
}

@Composable
fun GeneralPage(viewModel: AppViewModel, onBack: () -> Unit) {
    Subpage("Общие", onBack) {
        CardBlock {
            ChoiceRow("Язык: Русский", selected = true, onClick = {}, showDivider = true)
            ToggleRow(
                title = "Показывать подсказки",
                checked = viewModel.showSuggestions,
                onChecked = { viewModel.showSuggestions = it },
                showDivider = true,
            )
            ToggleRow(
                title = "Вибрация",
                checked = viewModel.haptics,
                onChecked = { viewModel.haptics = it },
            )
        }
    }
}

@Composable
fun NotificationsPage(viewModel: AppViewModel, onBack: () -> Unit) {
    Subpage("Уведомления", onBack) {
        Note("Системные уведомления не запрашиваются.")
        CardBlock {
            ToggleRow("Ответы", viewModel.notifications, { viewModel.notifications = it }, showDivider = true)
            ToggleRow("Запланированные задачи", viewModel.scheduledNotifications, { viewModel.scheduledNotifications = it })
        }
    }
}

@Composable
fun VoicePage(viewModel: AppViewModel, onBack: () -> Unit) {
    Subpage("Голос", onBack) {
        Note("Имя голоса запоминается на устройстве. Звук не воспроизводится.")
        CardBlock {
            Voices.forEachIndexed { index, voice ->
                ChoiceRow(
                    title = voice,
                    selected = viewModel.voice == voice,
                    onClick = { viewModel.voice = voice },
                    showDivider = index != Voices.lastIndex,
                )
            }
        }
    }
}

@Composable
fun WellbeingPage(viewModel: AppViewModel, onBack: () -> Unit) {
    Subpage("Безопасность и благополучие", onBack) {
        CardBlock {
            ToggleRow(
                title = "Строгий фильтр",
                checked = viewModel.strictFilter,
                onChecked = { viewModel.strictFilter = it },
                subtitle = "Пометка только для этого приложения",
            )
        }
    }
}

@Composable
fun SecurityPage(onBack: () -> Unit) {
    Subpage("Безопасность и вход", onBack) {
        CardBlock {
            ChoiceRow("Пароль", selected = false, onClick = {}, showDivider = true)
            ChoiceRow("Это устройство", selected = true, onClick = {})
        }
        Note("Пароль здесь не вводится и никуда не отправляется. Входа в чужой аккаунт нет.")
    }
}

@Composable
fun StoragePage(onBack: () -> Unit) {
    val palette = LocalPalette.current
    var cleared by remember { mutableStateOf(false) }
    Subpage("Хранилище", onBack) {
        CardBlock {
            Column(Modifier.padding(16.dp)) {
                Text(if (cleared) "Кэш очищен" else "Кэш: 0 МБ", color = palette.text, fontSize = 16.sp)
            }
        }
        ScreenGap()
        ActionButton("Очистить кэш") { cleared = true }
    }
}

@Composable
fun PrivacyPage(viewModel: AppViewModel, onBack: () -> Unit) {
    Subpage("Центр конфиденциальности", onBack) {
        Note("Чаты лежат в памяти приложения на телефоне. Сеть для них не используется.")
        CardBlock {
            ToggleRow(
                title = "Аналитика",
                checked = viewModel.analytics,
                onChecked = { viewModel.analytics = it },
                subtitle = "Выключена и никуда не уходит",
            )
        }
    }
}

@Composable
fun DataPage(viewModel: AppViewModel, onBack: () -> Unit) {
    val clipboard = LocalClipboardManager.current
    var confirm by remember { mutableStateOf(false) }
    var exported by remember { mutableStateOf(false) }
    Subpage("Управление данными", onBack) {
        CardBlock {
            ToggleRow(
                title = "Улучшать модель",
                checked = viewModel.improveModel,
                onChecked = { viewModel.improveModel = it },
                subtitle = "На сервер ничего не отправляется",
            )
        }
        ScreenGap()
        ActionButton(if (exported) "Скопировано" else "Экспорт чатов") {
            clipboard.setText(AnnotatedString(viewModel.exportText()))
            exported = true
        }
        ScreenGap()
        ActionButton("Удалить все чаты") { confirm = true }
    }
    if (confirm) {
        val palette = LocalPalette.current
        AlertDialog(
            onDismissRequest = { confirm = false },
            containerColor = palette.card,
            titleContentColor = palette.text,
            textContentColor = palette.secondary,
            title = { Text("Удалить все чаты") },
            text = { Text("Локальный список будет стёрт с этого экрана.") },
            confirmButton = {
                TextButton(onClick = {
                    viewModel.clearChats()
                    confirm = false
                }) { Text("Удалить", color = palette.logout) }
            },
            dismissButton = {
                TextButton(onClick = { confirm = false }) { Text("Отмена", color = palette.text) }
            },
        )
    }
}

@Composable
fun AdsPage(viewModel: AppViewModel, onBack: () -> Unit) {
    Subpage("Управление рекламой", onBack) {
        Note("Реклама в этой копии не показывается.")
        CardBlock {
            ToggleRow(
                title = "Персонализированная реклама",
                checked = viewModel.adsPersonalization,
                onChecked = { viewModel.adsPersonalization = it },
            )
        }
    }
}

@Composable
fun BugPage(viewModel: AppViewModel, onBack: () -> Unit) {
    Subpage("Сообщить об ошибке", onBack) {
        Note("Текст остаётся на устройстве.")
        LabeledField("Что случилось", viewModel.bugReport) { viewModel.bugReport = it }
        ActionButton(if (viewModel.bugSaved) "Сохранено на устройстве" else "Сохранить") {
            if (viewModel.bugReport.isNotBlank()) viewModel.bugSaved = true
        }
    }
}

@Composable
fun AboutPage(onBack: () -> Unit) {
    val palette = LocalPalette.current
    Subpage("Информация", onBack) {
        CardBlock {
            Column(Modifier.padding(16.dp)) {
                Text("Версия 1.0", color = palette.text, fontSize = 16.sp)
                Text(
                    "Локальная копия интерфейса. К OpenAI не подключается, пароль не спрашивает и сообщения никуда не отправляет.",
                    color = palette.secondary,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 8.dp),
                )
            }
        }
    }
}

@Composable
fun SignedOut(onReturn: () -> Unit) {
    val palette = LocalPalette.current
    Column(
        Modifier
            .fillMaxSize()
            .background(palette.bg)
            .padding(24.dp),
    ) {
        Spacer(Modifier.height(120.dp))
        Text("Вы вышли", color = palette.text, fontSize = 28.sp, fontWeight = FontWeight.SemiBold)
        Text(
            "Пароль не нужен. Чаты по-прежнему только на устройстве.",
            color = palette.secondary,
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp, bottom = 24.dp),
        )
        ActionButton("Вернуться", onReturn)
    }
}

@Composable
private fun LabeledField(label: String, value: String, onValue: (String) -> Unit) {
    val palette = LocalPalette.current
    OutlinedTextField(
        value = value,
        onValueChange = onValue,
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 6.dp)
            .fillMaxWidth(),
        label = { Text(label) },
        colors = OutlinedTextFieldDefaults.colors(
            focusedTextColor = palette.text,
            unfocusedTextColor = palette.text,
            focusedBorderColor = palette.accent,
            unfocusedBorderColor = palette.hairline,
            cursorColor = palette.accent,
            focusedLabelColor = palette.accent,
            unfocusedLabelColor = palette.secondary,
        ),
    )
}

@Composable
private fun ActionButton(title: String, onClick: () -> Unit) {
    val palette = LocalPalette.current
    Box(
        Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(18.dp))
            .background(palette.card)
            .clickable(onClick = onClick)
            .padding(vertical = 14.dp),
        contentAlignment = Alignment.Center,
    ) {
        Text(title, color = palette.accent, fontSize = 16.sp, fontWeight = FontWeight.Medium)
    }
}

@Composable
private fun NameDialog(
    title: String,
    value: String,
    onValue: (String) -> Unit,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit,
) {
    val palette = LocalPalette.current
    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = palette.card,
        titleContentColor = palette.text,
        title = { Text(title) },
        text = {
            OutlinedTextField(
                value = value,
                onValueChange = onValue,
                singleLine = true,
                placeholder = { Text("Название") },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = palette.text,
                    unfocusedTextColor = palette.text,
                    focusedBorderColor = palette.accent,
                    unfocusedBorderColor = palette.hairline,
                    cursorColor = palette.accent,
                ),
            )
        },
        confirmButton = {
            TextButton(onClick = onConfirm) { Text("Сохранить", color = palette.accent) }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) { Text("Отмена", color = palette.text) }
        },
    )
}
