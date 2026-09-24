package com.personal.chatui.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.personal.chatui.ui.theme.LocalPalette

@Composable
fun CircleButton(
    icon: ImageVector,
    description: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    size: Dp = 40.dp,
    iconTint: Color = LocalPalette.current.text,
) {
    val palette = LocalPalette.current
    Box(
        modifier
            .size(size)
            .clip(CircleShape)
            .background(palette.input)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        Icon(icon, contentDescription = description, tint = iconTint, modifier = Modifier.size(20.dp))
    }
}

@Composable
fun Subpage(
    title: String,
    onBack: () -> Unit,
    content: @Composable ColumnScope.() -> Unit,
) {
    val palette = LocalPalette.current
    Column(
        Modifier
            .fillMaxSize()
            .background(palette.bg)
            .statusBarsPadding(),
    ) {
        Box(Modifier.fillMaxWidth().height(56.dp)) {
            CircleButton(
                icon = Icons.AutoMirrored.Outlined.ArrowBack,
                description = "Назад",
                onClick = onBack,
                modifier = Modifier.align(Alignment.CenterStart).padding(start = 12.dp),
            )
            Text(
                text = title,
                color = palette.text,
                fontSize = 17.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(horizontal = 64.dp),
            )
        }
        Column(
            Modifier
                .weight(1f)
                .verticalScroll(rememberScrollState())
                .navigationBarsPadding()
                .padding(bottom = 24.dp),
            content = content,
        )
    }
}

@Composable
fun CardBlock(content: @Composable ColumnScope.() -> Unit) {
    val palette = LocalPalette.current
    Column(
        Modifier
            .padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(palette.card),
        content = content,
    )
}

@Composable
fun SectionLabel(text: String) {
    val palette = LocalPalette.current
    Text(
        text = text,
        color = palette.secondary,
        fontSize = 13.sp,
        modifier = Modifier.padding(start = 28.dp, top = 18.dp, bottom = 8.dp),
    )
}

@Composable
fun SettingRow(
    icon: ImageVector,
    title: String,
    onClick: () -> Unit,
    subtitle: String? = null,
    iconTint: Color = LocalPalette.current.text,
    titleColor: Color = LocalPalette.current.text,
    showDivider: Boolean = false,
    trailing: @Composable (() -> Unit)? = null,
) {
    val palette = LocalPalette.current
    Column(Modifier.clickable(onClick = onClick)) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 14.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(icon, contentDescription = null, tint = iconTint, modifier = Modifier.size(22.dp))
            Spacer(Modifier.width(14.dp))
            Column(Modifier.weight(1f)) {
                Text(title, color = titleColor, fontSize = 16.sp)
                if (subtitle != null) {
                    Text(subtitle, color = palette.subtitle, fontSize = 13.sp, modifier = Modifier.padding(top = 2.dp))
                }
            }
            if (trailing != null) trailing()
        }
        if (showDivider) {
            HorizontalDivider(
                modifier = Modifier.padding(start = 52.dp),
                thickness = 0.5.dp,
                color = palette.hairline,
            )
        }
    }
}

@Composable
fun ToggleRow(
    title: String,
    checked: Boolean,
    onChecked: (Boolean) -> Unit,
    subtitle: String? = null,
    showDivider: Boolean = false,
) {
    val palette = LocalPalette.current
    Column {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(Modifier.weight(1f).padding(end = 12.dp)) {
                Text(title, color = palette.text, fontSize = 16.sp)
                if (subtitle != null) {
                    Text(subtitle, color = palette.subtitle, fontSize = 13.sp, modifier = Modifier.padding(top = 2.dp))
                }
            }
            Switch(
                checked = checked,
                onCheckedChange = onChecked,
                colors = SwitchDefaults.colors(
                    checkedTrackColor = palette.accent,
                    checkedThumbColor = Color.White,
                    uncheckedTrackColor = Color(0xFF5A5A5A),
                    uncheckedThumbColor = Color(0xFFD0D0D0),
                    uncheckedBorderColor = Color.Transparent,
                ),
            )
        }
        if (showDivider) {
            HorizontalDivider(thickness = 0.5.dp, color = palette.hairline)
        }
    }
}

@Composable
fun ChoiceRow(
    title: String,
    selected: Boolean,
    onClick: () -> Unit,
    showDivider: Boolean = false,
) {
    val palette = LocalPalette.current
    Column(Modifier.clickable(onClick = onClick)) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 14.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(title, color = palette.text, fontSize = 16.sp, modifier = Modifier.weight(1f))
            if (selected) {
                Text("✓", color = palette.accent, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            }
        }
        if (showDivider) {
            HorizontalDivider(thickness = 0.5.dp, color = palette.hairline)
        }
    }
}

@Composable
fun Note(text: String) {
    val palette = LocalPalette.current
    Text(
        text = text,
        color = palette.secondary,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        modifier = Modifier.padding(horizontal = 20.dp, vertical = 12.dp),
    )
}

@Composable
fun ScreenGap() {
    Spacer(Modifier.height(10.dp))
}
