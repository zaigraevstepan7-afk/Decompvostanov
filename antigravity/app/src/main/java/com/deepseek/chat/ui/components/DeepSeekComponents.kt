package com.deepseek.chat.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepseek.chat.ui.model.*
import com.deepseek.chat.ui.theme.*

/**
 * Верхняя панель (TopBar) с выбором модели, боковым меню и кнопкой создания нового чата.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DeepSeekTopBar(
    currentModel: DeepSeekModel,
    onModelSelected: (DeepSeekModel) -> Unit,
    onMenuClick: () -> Unit,
    onNewChatClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    val isDark = isSystemInDarkTheme()

    TopAppBar(
        modifier = modifier,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = if (isDark) DarkBackground else LightBackground
        ),
        navigationIcon = {
            IconButton(onClick = onMenuClick) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu",
                    tint = if (isDark) DarkTextPrimary else LightTextPrimary
                )
            }
        },
        title = {
            Box {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .clickable { expanded = true }
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = currentModel.displayName,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = if (isDark) DarkTextPrimary else LightTextPrimary
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(
                        imageVector = if (expanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                        contentDescription = "Select Model",
                        modifier = Modifier.size(20.dp),
                        tint = if (isDark) DarkTextSecondary else LightTextSecondary
                    )
                }

                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false },
                    modifier = Modifier.background(if (isDark) DarkSurface else LightBackground)
                ) {
                    DeepSeekModel.values().forEach { model ->
                        DropdownMenuItem(
                            text = {
                                Column {
                                    Text(
                                        text = model.displayName,
                                        fontWeight = if (model == currentModel) FontWeight.Bold else FontWeight.Normal,
                                        color = if (model == currentModel) DeepSeekPrimary else (if (isDark) DarkTextPrimary else LightTextPrimary)
                                    )
                                    Text(
                                        text = model.description,
                                        fontSize = 12.sp,
                                        color = if (isDark) DarkTextSecondary else LightTextSecondary
                                    )
                                }
                            },
                            onClick = {
                                onModelSelected(model)
                                expanded = false
                            },
                            leadingIcon = {
                                if (model == currentModel) {
                                    Icon(
                                        imageVector = Icons.Default.Check,
                                        contentDescription = "Selected",
                                        tint = DeepSeekPrimary
                                    )
                                }
                            }
                        )
                    }
                }
            }
        },
        actions = {
            IconButton(onClick = onNewChatClick) {
                Icon(
                    imageVector = Icons.Outlined.Edit,
                    contentDescription = "New Chat",
                    tint = if (isDark) DarkTextPrimary else LightTextPrimary
                )
            }
        }
    )
}

/**
 * Блок рассуждений (DeepThink / Thinking Process) для моделей R1.
 * Точно повторяет визуальное отображение процесса размышлений в официальном приложении DeepSeek.
 */
@Composable
fun ThinkingBlock(
    thinking: ThinkingProcess,
    onToggleExpand: () -> Unit,
    modifier: Modifier = Modifier
) {
    val isDark = isSystemInDarkTheme()

    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(if (isDark) DarkThinkingBg else LightThinkingBg)
            .border(
                width = 1.dp,
                color = if (isDark) DarkThinkingBorder else LightThinkingBorder,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(12.dp)
            .animateContentSize()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                    onClick = onToggleExpand
                )
        ) {
            Icon(
                imageVector = Icons.Outlined.Psychology,
                contentDescription = "Thinking",
                tint = DeepSeekPrimary,
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = if (thinking.durationSeconds > 0) {
                    "Продумано ${thinking.durationSeconds} сек."
                } else if (!thinking.isFinished) {
                    "Размышляет..."
                } else {
                    "Ход мыслей"
                },
                fontSize = 13.sp,
                fontWeight = FontWeight.Medium,
                color = if (isDark) DarkTextSecondary else LightTextSecondary
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                imageVector = if (thinking.isExpanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                contentDescription = "Toggle",
                tint = if (isDark) DarkTextSecondary else LightTextSecondary,
                modifier = Modifier.size(18.dp)
            )
        }

        AnimatedVisibility(
            visible = thinking.isExpanded,
            enter = androidx.compose.animation.expandVertically(animationSpec = tween(200)),
            exit = androidx.compose.animation.shrinkVertically(animationSpec = tween(200))
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth()
            ) {
                // Вертикальная черта слева
                Box(
                    modifier = Modifier
                        .width(2.dp)
                        .fillMaxHeight()
                        .background(if (isDark) Color(0xFF333842) else Color(0xFFCBD5E1))
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = thinking.reasoningText,
                    fontSize = 13.sp,
                    lineHeight = 18.sp,
                    fontFamily = FontFamily.Monospace,
                    color = if (isDark) Color(0xFF9CA3AF) else Color(0xFF64748B)
                )
            }
        }
    }
}

/**
 * Пузырек сообщения в ленте чата (пользователь или ассистент).
 */
@Composable
fun MessageItem(
    message: ChatMessage,
    onCopyContent: (String) -> Unit,
    onRegenerate: () -> Unit,
    modifier: Modifier = Modifier
) {
    val isDark = isSystemInDarkTheme()
    var isThinkingExpanded by remember { mutableStateOf(message.thinkingProcess?.isExpanded ?: false) }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        if (message.sender == MessageSender.USER) {
            // Сообщение пользователя (прижато вправо)
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.End,
            ) {
                if (message.imagePaths.isNotEmpty()) {
                    Row(
                        modifier = Modifier.horizontalScroll(rememberScrollState()),
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                    ) {
                        message.imagePaths.forEach { path ->
                            val bitmap = remember(path) {
                                runCatching {
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
                                    modifier = Modifier
                                        .size(148.dp, 110.dp)
                                        .clip(RoundedCornerShape(12.dp)),
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                }
                message.fileNames.forEach { name ->
                    Text(
                        text = name,
                        fontSize = 12.sp,
                        color = if (isDark) DarkTextSecondary else LightTextSecondary,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                if (message.content.isNotBlank()) {
                    Box(
                        modifier = Modifier
                            .widthIn(max = 300.dp)
                            .clip(RoundedCornerShape(18.dp, 4.dp, 18.dp, 18.dp))
                            .background(if (isDark) DarkUserBubble else LightUserBubble)
                            .padding(horizontal = 14.dp, vertical = 10.dp)
                    ) {
                        Text(
                            text = message.content,
                            fontSize = 15.sp,
                            lineHeight = 22.sp,
                            color = if (isDark) DarkTextPrimary else LightTextPrimary
                        )
                    }
                }
            }
        } else {
            // Сообщение ассистента DeepSeek (прижато влево)
            Column(modifier = Modifier.fillMaxWidth()) {
                // Аватар и имя модели
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(bottom = 6.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .clip(CircleShape)
                            .background(DeepSeekPrimary),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "D",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.sp
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "DeepSeek",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                        color = if (isDark) DarkTextPrimary else LightTextPrimary
                    )
                }

                // Блок размышления (DeepThink / R1)
                message.thinkingProcess?.let { thinking ->
                    ThinkingBlock(
                        thinking = thinking.copy(isExpanded = isThinkingExpanded),
                        onToggleExpand = { isThinkingExpanded = !isThinkingExpanded },
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                }

                // Основное содержимое ответа с поддержкой Markdown и блоков кода
                DeepSeekMarkdownText(
                    markdown = message.content,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                if (message.content.isNotBlank() && !message.isStreaming) Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 4.dp)
                ) {
                    IconButton(
                        onClick = { onCopyContent(message.content) },
                        modifier = Modifier.size(28.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.ContentCopy,
                            contentDescription = "Copy",
                            tint = if (isDark) DarkTextSecondary else LightTextSecondary,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                    IconButton(
                        onClick = onRegenerate,
                        modifier = Modifier.size(28.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Refresh,
                            contentDescription = "Regenerate",
                            tint = if (isDark) DarkTextSecondary else LightTextSecondary,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                    IconButton(
                        onClick = {},
                        modifier = Modifier.size(28.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.ThumbUp,
                            contentDescription = "Like",
                            tint = if (isDark) DarkTextSecondary else LightTextSecondary,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                    IconButton(
                        onClick = {},
                        modifier = Modifier.size(28.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.ThumbDown,
                            contentDescription = "Dislike",
                            tint = if (isDark) DarkTextSecondary else LightTextSecondary,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                    IconButton(
                        onClick = {},
                        modifier = Modifier.size(28.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Share,
                            contentDescription = "Share",
                            tint = if (isDark) DarkTextSecondary else LightTextSecondary,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }
        }
    }
}

/**
 * Фирменная плавающая нижняя панель ввода DeepSeek.
 * Включает:
 * - Кнопку DeepThink (R1)
 * - Кнопку Поиска в сети (Search)
 * - Прикрепление файлов
 * - Многострочное поле ввода
 * - Кнопку отправки / остановки
 */
@Composable
fun DeepSeekInputBar(
    inputText: String,
    onInputChanged: (String) -> Unit,
    isDeepThinkActive: Boolean,
    onDeepThinkToggle: () -> Unit,
    isWebSearchActive: Boolean,
    onWebSearchToggle: () -> Unit,
    isGenerating: Boolean,
    onSend: () -> Unit,
    onStop: () -> Unit,
    onAttachClick: () -> Unit,
    hasPending: Boolean = false,
    modifier: Modifier = Modifier
) {
    val isDark = isSystemInDarkTheme()

    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(if (isDark) DarkBackground else LightBackground)
            .padding(horizontal = 16.dp, vertical = 10.dp)
    ) {
        // Контейнер поля ввода с закругленными краями
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(20.dp))
                .background(if (isDark) DarkSurface else LightSurface)
                .border(
                    width = 1.dp,
                    color = if (isDark) DarkBorder else LightBorder,
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(12.dp)
        ) {
            // Текстовое поле ввода
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp, vertical = 2.dp)
            ) {
                if (inputText.isEmpty()) {
                    Text(
                        text = "Спросите о чем угодно...",
                        fontSize = 15.sp,
                        color = if (isDark) DarkTextSecondary else LightTextSecondary
                    )
                }
                BasicTextField(
                    value = inputText,
                    onValueChange = onInputChanged,
                    textStyle = TextStyle(
                        fontSize = 15.sp,
                        color = if (isDark) DarkTextPrimary else LightTextPrimary,
                        lineHeight = 22.sp
                    ),
                    cursorBrush = SolidColor(DeepSeekPrimary),
                    modifier = Modifier.fillMaxWidth()
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Нижний ряд кнопок управления внутри поля ввода
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                // Переключатель DeepThink (R1)
                FeaturePill(
                    icon = Icons.Outlined.Psychology,
                    label = "DeepThink (R1)",
                    isActive = isDeepThinkActive,
                    onClick = onDeepThinkToggle
                )

                Spacer(modifier = Modifier.width(8.dp))

                // Переключатель веб-поиска
                FeaturePill(
                    icon = Icons.Outlined.Language,
                    label = "Поиск",
                    isActive = isWebSearchActive,
                    onClick = onWebSearchToggle
                )

                Spacer(modifier = Modifier.weight(1f))

                // Кнопка вложений (+)
                IconButton(
                    onClick = onAttachClick,
                    modifier = Modifier.size(32.dp)
                ) {
                    Icon(
                        imageVector = Icons.Outlined.AddCircleOutline,
                        contentDescription = "Attachment",
                        tint = if (isDark) DarkTextSecondary else LightTextSecondary,
                        modifier = Modifier.size(22.dp)
                    )
                }

                Spacer(modifier = Modifier.width(4.dp))

                // Кнопка отправки / остановки
                val canSend = (inputText.isNotBlank() || hasPending) && !isGenerating
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .clip(CircleShape)
                        .background(
                            when {
                                isGenerating -> Color(0xFFEF4444)
                                canSend -> DeepSeekPrimary
                                else -> if (isDark) Color(0xFF2C313A) else Color(0xFFE2E8F0)
                            }
                        )
                        .clickable(enabled = canSend || isGenerating) {
                            if (isGenerating) onStop() else onSend()
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = if (isGenerating) Icons.Default.Stop else Icons.Default.ArrowUpward,
                        contentDescription = if (isGenerating) "Stop" else "Send",
                        tint = if (canSend || isGenerating) Color.White else (if (isDark) Color(0xFF6B7280) else Color(0xFF94A3B8)),
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
        }
    }
}

/**
 * Кнопка-таблетка (Feature Pill) для активации DeepThink и Веб-поиска.
 */
@Composable
fun FeaturePill(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String,
    isActive: Boolean,
    onClick: () -> Unit
) {
    val isDark = isSystemInDarkTheme()

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(
                if (isActive) DeepSeekPrimary.copy(alpha = 0.15f)
                else (if (isDark) DarkSurfaceVariant else LightSurfaceVariant)
            )
            .border(
                width = 1.dp,
                color = if (isActive) DeepSeekPrimary else Color.Transparent,
                shape = RoundedCornerShape(16.dp)
            )
            .clickable(onClick = onClick)
            .padding(horizontal = 10.dp, vertical = 5.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = label,
            modifier = Modifier.size(15.dp),
            tint = if (isActive) DeepSeekPrimary else (if (isDark) DarkTextSecondary else LightTextSecondary)
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = label,
            fontSize = 12.sp,
            fontWeight = if (isActive) FontWeight.SemiBold else FontWeight.Normal,
            color = if (isActive) DeepSeekPrimary else (if (isDark) DarkTextPrimary else LightTextPrimary)
        )
    }
}

/**
 * Начальный экран без сообщений (Приветствие DeepSeek).
 */
@Composable
fun EmptyChatGreeting(
    onPromptSuggested: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val isDark = isSystemInDarkTheme()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        // Логотип DeepSeek
        Box(
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .background(DeepSeekPrimary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "D",
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Привет, я DeepSeek.",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = if (isDark) DarkTextPrimary else LightTextPrimary
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = "Чем я могу помочь вам сегодня?",
            fontSize = 15.sp,
            color = if (isDark) DarkTextSecondary else LightTextSecondary
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Быстрые подсказки / примеры вопросов
        val suggestions = listOf(
            "Объясни квантовые вычисления простыми словами",
            "Напиши функцию на Kotlin для сортировки списка",
            "Помоги составить план тренировок на неделю"
        )

        suggestions.forEach { prompt ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(if (isDark) DarkSurface else LightSurface)
                    .border(
                        width = 1.dp,
                        color = if (isDark) DarkBorder else LightBorder,
                        shape = RoundedCornerShape(12.dp)
                    )
                    .clickable { onPromptSuggested(prompt) }
                    .padding(horizontal = 16.dp, vertical = 12.dp)
            ) {
                Text(
                    text = prompt,
                    fontSize = 14.sp,
                    color = if (isDark) DarkTextPrimary else LightTextPrimary
                )
            }
        }
    }
}
