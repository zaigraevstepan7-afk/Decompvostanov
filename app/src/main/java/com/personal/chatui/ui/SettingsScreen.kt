package com.personal.chatui.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.annotation.DrawableRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material3.Icon
import com.personal.chatui.R
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.personal.chatui.data.AppViewModel
import com.personal.chatui.ui.theme.LocalPalette

@Composable
fun SettingsScreen(
    viewModel: AppViewModel,
    onBack: () -> Unit,
    onOpen: (String) -> Unit,
) {
    val palette = LocalPalette.current
    Column(
        Modifier
            .fillMaxSize()
            .background(palette.bg)
            .statusBarsPadding(),
    ) {
        Box(Modifier.fillMaxWidth().padding(start = 12.dp, top = 8.dp, bottom = 4.dp)) {
            CircleButton(Icons.AutoMirrored.Outlined.ArrowBack, "Назад", onBack)
        }
        LazyColumn(
            Modifier
                .weight(1f)
                .navigationBarsPadding(),
        ) {
            item { ProfileHeader(viewModel.displayName) { onOpen(Routes.Personalization) } }
            item { SectionLabel("Мой ChatGPT") }
            item {
                CardBlock {
                    IconRow(R.drawable.ic_personal, "Персонализация", true) { onOpen(Routes.Personalization) }
                    IconRow(R.drawable.ic_memory, "Память", true) { onOpen(Routes.Memory) }
                    IconRow(R.drawable.ic_plugins_set, "Плагины", false) { onOpen(Routes.Plugins) }
                }
            }
            item { SectionLabel("Учетная запись") }
            item {
                CardBlock {
                    IconRow(R.drawable.ic_work, "Рабочая область", true, subtitle = "Личное") { onOpen(Routes.Workspace) }
                    IconRow(R.drawable.ic_plan, "Изменить план", true) { onOpen(Routes.Plan) }
                    IconRow(R.drawable.ic_usage, "Использование и лимиты", true) { onOpen(Routes.Usage) }
                    IconRow(R.drawable.ic_parental, "Родительский контроль", true) { onOpen(Routes.Parental) }
                    IconRow(R.drawable.ic_email, "Электронная почта", true, subtitle = viewModel.email) { onOpen(Routes.Email) }
                    IconRow(R.drawable.ic_shield, "Проверка возраста", false) { onOpen(Routes.Age) }
                }
            }
            item { ScreenGap() }
            item {
                CardBlock {
                    IconRow(R.drawable.ic_sun, "Внешний вид", false, trailing = { Chevron() }) {
                        onOpen(Routes.Appearance)
                    }
                }
            }
            item { ScreenGap() }
            item {
                CardBlock {
                    IconRow(
                        iconRes = R.drawable.ic_brush,
                        title = "Акцентный цвет",
                        showDivider = false,
                        trailing = { AccentValue(viewModel.accent.label) },
                    ) { onOpen(Routes.Accent) }
                }
            }
            item { ScreenGap() }
            item {
                CardBlock {
                    IconRow(R.drawable.ic_gear, "Общие", true) { onOpen(Routes.General) }
                    IconRow(R.drawable.ic_bell, "Уведомления", true) { onOpen(Routes.Notifications) }
                    IconRow(R.drawable.ic_voice, "Голос", true) { onOpen(Routes.Voice) }
                    IconRow(R.drawable.ic_wellbeing, "Безопасность и благополучие", true) { onOpen(Routes.Wellbeing) }
                    IconRow(R.drawable.ic_shield, "Безопасность и вход", true) { onOpen(Routes.Security) }
                    IconRow(R.drawable.ic_laptop, "Удалённое управление", true) { onOpen(Routes.Remote) }
                    IconRow(R.drawable.ic_storage, "Хранилище", true) { onOpen(Routes.Storage) }
                    IconRow(R.drawable.ic_privacy, "Центр конфиденциальности", true) { onOpen(Routes.Privacy) }
                    IconRow(R.drawable.ic_data, "Управление данными", true) { onOpen(Routes.Data) }
                    IconRow(R.drawable.ic_ads, "Управление рекламой", true) { onOpen(Routes.Ads) }
                    IconRow(R.drawable.ic_bug, "Сообщить об ошибке", true) { onOpen(Routes.Bug) }
                    IconRow(R.drawable.ic_info, "Информация", false) { onOpen(Routes.About) }
                }
            }
            item {
                Column(
                    Modifier
                        .padding(horizontal = 16.dp, vertical = 16.dp)
                        .clip(androidx.compose.foundation.shape.RoundedCornerShape(18.dp))
                        .background(palette.card)
                        .clickable { viewModel.signedIn = false },
                ) {
                    Row(
                        Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 14.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        CutIcon(
                            R.drawable.ic_logout,
                            modifier = Modifier.size(22.dp),
                            tint = palette.logout,
                        )
                        Spacer(Modifier.width(14.dp))
                        Text("Выйти", color = palette.logout, fontSize = 16.sp)
                    }
                }
            }
        }
    }
}

@Composable
private fun ProfileHeader(name: String, onEdit: () -> Unit) {
    val palette = LocalPalette.current
    Column(
        Modifier.fillMaxWidth().padding(top = 8.dp, bottom = 6.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(Modifier.clickable(onClick = onEdit)) {
            Box(
                Modifier
                    .size(88.dp)
                    .clip(CircleShape)
                    .background(palette.avatar),
                contentAlignment = Alignment.Center,
            ) {
                Text("ZA", color = Color.White, fontSize = 28.sp, fontWeight = FontWeight.SemiBold)
            }
            Box(
                Modifier
                    .align(Alignment.BottomEnd)
                    .offset(x = 2.dp, y = 2.dp)
                    .size(28.dp)
                    .clip(CircleShape)
                    .background(palette.input),
                contentAlignment = Alignment.Center,
            ) {
                CutIcon(R.drawable.ic_compose, modifier = Modifier.size(14.dp), description = "Изменить")
            }
        }
        Text(
            name,
            color = palette.text,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 10.dp),
        )
    }
}

@Composable
private fun IconRow(
    @DrawableRes iconRes: Int,
    title: String,
    showDivider: Boolean,
    subtitle: String? = null,
    trailing: @Composable (() -> Unit)? = null,
    onClick: () -> Unit,
) {
    SettingRow(
        iconRes = iconRes,
        title = title,
        subtitle = subtitle,
        showDivider = showDivider,
        trailing = trailing,
        onClick = onClick,
    )
}

@Composable
private fun Chevron() {
    Icon(
        Icons.AutoMirrored.Outlined.KeyboardArrowRight,
        contentDescription = null,
        tint = LocalPalette.current.subtitle,
        modifier = Modifier.size(22.dp),
    )
}

@Composable
private fun AccentValue(label: String) {
    val palette = LocalPalette.current
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            Modifier
                .size(8.dp)
                .clip(CircleShape)
                .background(palette.accent),
        )
        Spacer(Modifier.width(6.dp))
        Text(label, color = palette.text, fontSize = 15.sp)
        Icon(
            Icons.AutoMirrored.Outlined.KeyboardArrowRight,
            contentDescription = null,
            tint = palette.subtitle,
            modifier = Modifier.size(22.dp),
        )
    }
}
