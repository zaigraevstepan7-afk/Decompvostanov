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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.outlined.Logout
import androidx.compose.material.icons.outlined.AdminPanelSettings
import androidx.compose.material.icons.outlined.Apps
import androidx.compose.material.icons.outlined.AutoAwesome
import androidx.compose.material.icons.outlined.BarChart
import androidx.compose.material.icons.outlined.Brush
import androidx.compose.material.icons.outlined.BugReport
import androidx.compose.material.icons.outlined.Campaign
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.FamilyRestroom
import androidx.compose.material.icons.outlined.GraphicEq
import androidx.compose.material.icons.outlined.HealthAndSafety
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Laptop
import androidx.compose.material.icons.automirrored.outlined.MenuBook
import androidx.compose.material.icons.outlined.LightMode
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.SdStorage
import androidx.compose.material.icons.outlined.SentimentSatisfied
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Shield
import androidx.compose.material.icons.outlined.Storage
import androidx.compose.material.icons.outlined.VerifiedUser
import androidx.compose.material.icons.outlined.Work
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
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
                    IconRow(Icons.Outlined.SentimentSatisfied, "Персонализация", true) { onOpen(Routes.Personalization) }
                    IconRow(Icons.AutoMirrored.Outlined.MenuBook, "Память", true) { onOpen(Routes.Memory) }
                    IconRow(Icons.Outlined.Apps, "Плагины", false) { onOpen(Routes.Plugins) }
                }
            }
            item { SectionLabel("Учетная запись") }
            item {
                CardBlock {
                    IconRow(Icons.Outlined.Work, "Рабочая область", true, subtitle = "Личное") { onOpen(Routes.Workspace) }
                    IconRow(Icons.Outlined.AutoAwesome, "Изменить план", true) { onOpen(Routes.Plan) }
                    IconRow(Icons.Outlined.BarChart, "Использование и лимиты", true) { onOpen(Routes.Usage) }
                    IconRow(Icons.Outlined.FamilyRestroom, "Родительский контроль", true) { onOpen(Routes.Parental) }
                    IconRow(Icons.Outlined.Email, "Электронная почта", true, subtitle = viewModel.email) { onOpen(Routes.Email) }
                    IconRow(Icons.Outlined.AdminPanelSettings, "Проверка возраста", false) { onOpen(Routes.Age) }
                }
            }
            item { ScreenGap() }
            item {
                CardBlock {
                    IconRow(Icons.Outlined.LightMode, "Внешний вид", false, trailing = { Chevron() }) {
                        onOpen(Routes.Appearance)
                    }
                }
            }
            item { ScreenGap() }
            item {
                CardBlock {
                    IconRow(
                        icon = Icons.Outlined.Brush,
                        title = "Акцентный цвет",
                        showDivider = false,
                        trailing = { AccentValue(viewModel.accent.label) },
                    ) { onOpen(Routes.Accent) }
                }
            }
            item { ScreenGap() }
            item {
                CardBlock {
                    IconRow(Icons.Outlined.Settings, "Общие", true) { onOpen(Routes.General) }
                    IconRow(Icons.Outlined.Notifications, "Уведомления", true) { onOpen(Routes.Notifications) }
                    IconRow(Icons.Outlined.GraphicEq, "Голос", true) { onOpen(Routes.Voice) }
                    IconRow(Icons.Outlined.HealthAndSafety, "Безопасность и благополучие", true) { onOpen(Routes.Wellbeing) }
                    IconRow(Icons.Outlined.Shield, "Безопасность и вход", true) { onOpen(Routes.Security) }
                    IconRow(Icons.Outlined.Laptop, "Удалённое управление", true) { onOpen(Routes.Remote) }
                    IconRow(Icons.Outlined.SdStorage, "Хранилище", true) { onOpen(Routes.Storage) }
                    IconRow(Icons.Outlined.VerifiedUser, "Центр конфиденциальности", true) { onOpen(Routes.Privacy) }
                    IconRow(Icons.Outlined.Storage, "Управление данными", true) { onOpen(Routes.Data) }
                    IconRow(Icons.Outlined.Campaign, "Управление рекламой", true) { onOpen(Routes.Ads) }
                    IconRow(Icons.Outlined.BugReport, "Сообщить об ошибке", true) { onOpen(Routes.Bug) }
                    IconRow(Icons.Outlined.Info, "Информация", false) { onOpen(Routes.About) }
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
                        Icon(
                            Icons.AutoMirrored.Outlined.Logout,
                            contentDescription = null,
                            tint = palette.logout,
                            modifier = Modifier.size(22.dp),
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
                Icon(Icons.Outlined.Edit, contentDescription = "Изменить", tint = palette.text, modifier = Modifier.size(14.dp))
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
    icon: ImageVector,
    title: String,
    showDivider: Boolean,
    subtitle: String? = null,
    trailing: @Composable (() -> Unit)? = null,
    onClick: () -> Unit,
) {
    SettingRow(
        icon = icon,
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
