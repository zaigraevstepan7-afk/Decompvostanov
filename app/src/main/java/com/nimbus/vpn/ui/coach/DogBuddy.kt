package com.nimbus.vpn.ui.coach

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.R
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Canvas
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.Motion
import com.nimbus.vpn.ui.theme.Paper
import kotlinx.coroutines.launch
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.roundToInt
import kotlin.math.sin

enum class DogMood { WAVE, POINT, JOY, CALM }

@Composable
fun Modifier.coachGlow(active: Boolean): Modifier {
    val transition = rememberInfiniteTransition(label = "coach-glow")
    val pulse by transition.animateFloat(
        initialValue = 0.35f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            tween(durationMillis = 780, easing = FastOutSlowInEasing),
            RepeatMode.Reverse,
        ),
        label = "coach-pulse",
    )
    val ring by animateColorAsState(
        if (active) Color(0xFFFFC56A) else Color.Transparent,
        animationSpec = Motion.color(280),
        label = "coach-ring",
    )
    return drawBehind {
        if (!active) return@drawBehind
        val radius = size.maxDimension * (0.62f + 0.22f * pulse)
        drawCircle(Color(0xFFFFC56A).copy(alpha = 0.22f * pulse), radius = radius)
        drawCircle(ring.copy(alpha = 0.85f), radius = size.maxDimension * 0.48f, style = androidx.compose.ui.graphics.drawscope.Stroke(3.dp.toPx()))
    }
}

@Composable
fun DogDock(
    mood: DogMood,
    message: String?,
    action: String?,
    onAction: (() -> Unit)?,
    joyPulse: Int,
    anchorX: Float,
    anchorY: Float,
    onAnchor: (Float, Float) -> Unit,
    modifier: Modifier = Modifier,
) {
    val density = LocalDensity.current
    BoxWithConstraints(modifier) {
        val maxW = constraints.maxWidth.toFloat().coerceAtLeast(1f)
        val maxH = constraints.maxHeight.toFloat().coerceAtLeast(1f)
        var px by remember(maxW, anchorX) {
            mutableFloatStateOf(
                if (anchorX < 0f) with(density) { 12.dp.toPx() } else anchorX * maxW,
            )
        }
        var py by remember(maxH, anchorY) {
            mutableFloatStateOf(
                if (anchorY < 0f) maxH * 0.58f else anchorY * maxH,
            )
        }
        val margin = with(density) { 8.dp.toPx() }
        val bubbleAbove = py > maxH * 0.38f
        val placeX = px.roundToInt()
        val placeY = py.roundToInt()
        Column(
            Modifier.offset { IntOffset(placeX, placeY) },
        ) {
            if (bubbleAbove && message != null) {
                SpeechBubble(message, action, onAction)
            }
            DogSprite(
                mood = mood,
                joyPulse = joyPulse,
                modifier = Modifier.pointerInput(maxW, maxH) {
                    detectDragGestures(
                        onDragEnd = { onAnchor(px / maxW, py / maxH) },
                        onDragCancel = { onAnchor(px / maxW, py / maxH) },
                    ) { change, drag ->
                        change.consume()
                        px = (px + drag.x).coerceIn(margin, maxW - margin)
                        py = (py + drag.y).coerceIn(margin, maxH - margin)
                    }
                },
            )
            if (!bubbleAbove && message != null) {
                SpeechBubble(message, action, onAction)
            }
        }
    }
}

@Composable
private fun SpeechBubble(message: String, action: String?, onAction: (() -> Unit)?) {
    Column(
        Modifier
            .padding(bottom = 6.dp)
            .widthIn(max = 210.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(Paper)
            .padding(horizontal = 14.dp, vertical = 12.dp),
    ) {
        AnimatedContent(
            targetState = message,
            transitionSpec = {
                (fadeIn(Motion.fade(220)) + slideInVertically { it / 4 }) togetherWith fadeOut(Motion.fade(120))
            },
            label = "dog-line",
        ) { line ->
            Text(line, color = Ink, fontSize = 14.sp, lineHeight = 19.sp)
        }
        if (action != null && onAction != null) {
            Text(
                action,
                color = Canvas,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(top = 10.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(Accent)
                    .clickable(onClick = onAction)
                    .padding(horizontal = 18.dp, vertical = 8.dp),
            )
        }
    }
}

@Composable
private fun DogSprite(mood: DogMood, joyPulse: Int, modifier: Modifier = Modifier) {
    val drift = rememberInfiniteTransition(label = "dog")
    val bob by drift.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(if (mood == DogMood.CALM) 1800 else 900, easing = FastOutSlowInEasing), RepeatMode.Reverse),
        label = "bob",
    )
    val sway by drift.animateFloat(
        initialValue = -1f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(if (mood == DogMood.WAVE) 520 else 1400, easing = FastOutSlowInEasing), RepeatMode.Reverse),
        label = "sway",
    )
    val blink by drift.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(3200), RepeatMode.Restart),
        label = "blink",
    )
    val jump = remember { androidx.compose.animation.core.Animatable(0f) }
    val squash = remember { androidx.compose.animation.core.Animatable(1f) }
    LaunchedEffect(joyPulse, mood) {
        if (joyPulse == 0 && mood != DogMood.JOY) return@LaunchedEffect
        launch {
            jump.snapTo(0f)
            jump.animateTo(-26f, spring(dampingRatio = 0.38f, stiffness = 340f))
            jump.animateTo(0f, spring(dampingRatio = 0.45f, stiffness = 460f))
            jump.animateTo(-12f, spring(dampingRatio = 0.5f, stiffness = 400f))
            jump.animateTo(0f, spring(dampingRatio = Spring.DampingRatioMediumBouncy, stiffness = 380f))
        }
        launch {
            squash.snapTo(1f)
            squash.animateTo(0.86f, tween(90))
            squash.animateTo(1.08f, spring(dampingRatio = 0.4f, stiffness = 500f))
            squash.animateTo(1f, spring(dampingRatio = 0.6f, stiffness = 320f))
        }
    }
    val shut = blink > 0.94f
    val tilt = when (mood) {
        DogMood.WAVE -> sway * 7f
        DogMood.POINT -> -8f + sway * 2f
        DogMood.JOY -> sway * 6f
        DogMood.CALM -> sway * 1.5f
    }
    Box(
        modifier
            .size(84.dp)
            .graphicsLayer {
                translationY = (bob - 0.5f) * 10.dp.toPx() + jump.value * density
                rotationZ = tilt
                scaleX = if (mood == DogMood.JOY) squash.value else 1f + bob * 0.03f
                scaleY = if (mood == DogMood.JOY) 2f - squash.value else 1f - bob * 0.02f
            },
        contentAlignment = Alignment.Center,
    ) {
        if (mood == DogMood.JOY) {
            Canvas(Modifier.matchParentSize()) {
                repeat(6) { index ->
                    val angle = index / 6f * (PI.toFloat() * 2f) + bob * PI.toFloat()
                    val dist = 46.dp.toPx() + (index % 3) * 6.dp.toPx()
                    drawCircle(
                        color = Color(0xFFFFD27A),
                        radius = 2.4.dp.toPx(),
                        center = Offset(size.width / 2f + cos(angle) * dist, size.height * 0.42f + sin(angle) * dist * 0.55f),
                    )
                }
            }
        }
        Image(
            painter = painterResource(R.drawable.dog_bozya),
            contentDescription = "Пёс",
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(76.dp),
        )
        if (shut || mood == DogMood.JOY) {
            Blink(happy = mood == DogMood.JOY)
        }
    }
}

@Composable
private fun Blink(happy: Boolean) {
    BoxWithConstraints(Modifier.size(76.dp)) {
        val barW = maxWidth * 0.16f
        val barH = if (happy) maxHeight * 0.045f else maxHeight * 0.028f
        val y = maxHeight * if (happy) 0.33f else 0.345f
        listOf(0.30f, 0.66f).forEach { xFrac ->
            Canvas(
                Modifier
                    .align(Alignment.TopStart)
                    .padding(start = maxWidth * xFrac, top = y)
                    .size(barW, barH),
            ) {
                drawLine(
                    color = Color(0xFF1C1E26),
                    start = Offset(0f, size.height / 2f),
                    end = Offset(size.width, size.height / 2f),
                    strokeWidth = size.height,
                    cap = StrokeCap.Round,
                )
            }
        }
    }
}
