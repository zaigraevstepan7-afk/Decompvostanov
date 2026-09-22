package com.deepseek.chat.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepseek.chat.ui.components.DeepSeekInputBar
import com.deepseek.chat.ui.components.DeepSeekTopBar
import com.deepseek.chat.ui.components.EmptyChatGreeting
import com.deepseek.chat.ui.components.MessageItem
import com.deepseek.chat.ui.model.ChatMessage
import com.deepseek.chat.ui.model.DeepSeekModel
import com.deepseek.chat.ui.theme.DarkBackground
import com.deepseek.chat.ui.theme.LightBackground
import kotlinx.coroutines.launch

@Composable
fun DeepSeekChatScreen(
    messages: List<ChatMessage>,
    inputText: String,
    onInputChanged: (String) -> Unit,
    currentModel: DeepSeekModel,
    isDeepThinkActive: Boolean,
    isWebSearchActive: Boolean,
    isGenerating: Boolean,
    hasPending: Boolean,
    error: String?,
    pending: List<Pair<String, String>>,
    onRemovePending: (String) -> Unit,
    onModelSelected: (DeepSeekModel) -> Unit,
    onDeepThinkToggle: () -> Unit,
    onWebSearchToggle: () -> Unit,
    onSend: () -> Unit,
    onStop: () -> Unit,
    onAttachClick: () -> Unit,
    onNewChatClick: () -> Unit,
    onOpenDrawer: () -> Unit,
    onRegenerate: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val isDark = isSystemInDarkTheme()
    val scope = rememberCoroutineScope()
    val listState = rememberLazyListState()
    val snackbarHostState = remember { SnackbarHostState() }
    val clipboardManager = LocalClipboardManager.current
    val last = messages.lastOrNull()

    LaunchedEffect(messages.size, last?.content?.length, last?.thinkingProcess?.reasoningText?.length, isGenerating) {
        if (messages.isNotEmpty()) {
            listState.scrollToItem(messages.lastIndex)
        }
    }

    Scaffold(
        modifier = modifier.fillMaxSize(),
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            DeepSeekTopBar(
                currentModel = currentModel,
                onModelSelected = onModelSelected,
                onMenuClick = onOpenDrawer,
                onNewChatClick = onNewChatClick,
            )
        },
        bottomBar = {
            Column(Modifier.fillMaxWidth().imePadding()) {
                error?.let {
                    Text(
                        it,
                        color = androidx.compose.ui.graphics.Color(0xFFEF4444),
                        fontSize = 13.sp,
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
                    )
                }
                pending.forEach { (id, name) ->
                    Text(
                        name,
                        fontSize = 12.sp,
                        color = com.deepseek.chat.ui.theme.DeepSeekPrimary,
                        modifier = Modifier
                            .padding(horizontal = 16.dp, vertical = 2.dp)
                            .clickable { onRemovePending(id) },
                    )
                }
                DeepSeekInputBar(
                    inputText = inputText,
                    onInputChanged = onInputChanged,
                    isDeepThinkActive = isDeepThinkActive,
                    onDeepThinkToggle = onDeepThinkToggle,
                    isWebSearchActive = isWebSearchActive,
                    onWebSearchToggle = onWebSearchToggle,
                    isGenerating = isGenerating,
                    onSend = onSend,
                    onStop = onStop,
                    onAttachClick = onAttachClick,
                    hasPending = hasPending,
                )
            }
        },
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(if (isDark) DarkBackground else LightBackground),
        ) {
            if (messages.isEmpty()) {
                EmptyChatGreeting(onPromptSuggested = onInputChanged)
            } else {
                LazyColumn(
                    state = listState,
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(top = 12.dp, bottom = 28.dp),
                ) {
                    items(messages, key = { it.id }) { message ->
                        MessageItem(
                            message = message,
                            onCopyContent = { content ->
                                clipboardManager.setText(AnnotatedString(content))
                                scope.launch { snackbarHostState.showSnackbar("Скопировано в буфер") }
                            },
                            onRegenerate = onRegenerate,
                        )
                    }
                }
            }
        }
    }
}
