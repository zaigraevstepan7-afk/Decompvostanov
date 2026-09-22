package com.nimbus.vpn.ui.coach

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
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
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Canvas
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.Motion
import com.nimbus.vpn.ui.theme.Paper
import kotlinx.coroutines.delay
import kotlin.math.roundToInt

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
    val cellPx = with(density) { DOG_CELL_DP.dp.toPx() }.roundToInt().coerceAtLeast(2)
    val boxW = with(density) { ((DogPixels.COLS + DogPixels.TAIL_PAD) * cellPx).toDp() }
    val boxH = with(density) { ((DogPixels.ROWS + DOG_PAD_TOP) * cellPx).toDp() }
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
        Column(Modifier.offset { IntOffset(placeX, placeY) }) {
            if (bubbleAbove && message != null) {
                SpeechBubble(
                    message,
                    action,
                    onAction,
                    Modifier.offset(y = ((DOG_PAD_TOP - 1) * DOG_CELL_DP).dp),
                )
            }
            DogSprite(
                mood = mood,
                joyPulse = joyPulse,
                cellPx = cellPx,
                modifier = Modifier
                    .size(boxW, boxH)
                    .pointerInput(maxW, maxH) {
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
private fun SpeechBubble(
    message: String,
    action: String?,
    onAction: (() -> Unit)?,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier
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

private val dogInk = mapOf(
    '1' to Color(0xFF1A1C22),
    '2' to Color(0xFF3C3E44),
    '3' to Color(0xFF6A6C72),
    '4' to Color(0xFF9A9CA2),
    '5' to Color(0xFFC8CACF),
    '6' to Color(0xFFF7F7F8),
)

@Composable
private fun DogSprite(mood: DogMood, joyPulse: Int, cellPx: Int, modifier: Modifier = Modifier) {
    val drift = rememberInfiniteTransition(label = "dog")
    val bobT by drift.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            tween(if (mood == DogMood.CALM) 1500 else 720, easing = LinearEasing),
            RepeatMode.Reverse,
        ),
        label = "bob",
    )
    val blinkT by drift.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            tween(if (mood == DogMood.CALM) 4400 else 2800, easing = LinearEasing),
            RepeatMode.Restart,
        ),
        label = "blink",
    )
    var hop by remember { mutableIntStateOf(0) }
    var jumping by remember { mutableStateOf(false) }
    var tail by remember { mutableStateOf(Tail.HIDDEN) }
    var wagging by remember { mutableStateOf(false) }
    LaunchedEffect(joyPulse) {
        if (joyPulse == 0) return@LaunchedEffect
        jumping = true
        wagging = false
        tail = Tail.HIDDEN
        for (step in intArrayOf(0, 2, 5, 7, 5, 2, 0)) {
            hop = step
            delay(68)
        }
        hop = 0
        jumping = false
        wagging = true
        val sweep = listOf(Tail.LEVEL, Tail.HIGH, Tail.LEVEL, Tail.LOW)
        repeat(5) {
            for (frame in sweep) {
                tail = frame
                delay(78)
            }
        }
        tail = Tail.HIDDEN
        wagging = false
    }
    val bob = if (bobT > 0.5f) 1 else 0
    val blink = when {
        blinkT < 0.86f -> EyePose.OPEN
        blinkT < 0.90f -> EyePose.HALF
        blinkT < 0.95f -> EyePose.SHUT
        blinkT < 0.98f -> EyePose.HALF
        else -> EyePose.OPEN
    }
    val pose = when {
        wagging || mood == DogMood.JOY -> EyePose.HAPPY
        blink == EyePose.HALF || blink == EyePose.SHUT -> blink
        mood == DogMood.POINT || (mood == DogMood.WAVE && bob == 1) -> EyePose.LOOK
        else -> EyePose.OPEN
    }
    val paws = when {
        jumping && hop >= 4 -> Paws.UP
        jumping && hop > 0 -> Paws.TUCK
        wagging -> Paws.DOWN
        mood != DogMood.JOY && blinkT in 0.62f..0.74f -> Paws.TUCK
        else -> Paws.DOWN
    }
    val lift = if (jumping) hop else bob
    Canvas(modifier.semantics { contentDescription = "Пёс" }) {
        val rows = DogPixels.rows(pose, paws, tail)
        val top = snap(size.height - (rows.size + lift) * cellPx, cellPx)
        drawPixels(rows, snap((size.width - rows.first().length * cellPx) / 2f, cellPx), top, cellPx, flip = false)
    }
}

private fun snap(value: Float, cell: Int): Float = (value / cell).roundToInt() * cell.toFloat()

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawPixels(
    rows: List<String>,
    left: Float,
    top: Float,
    cell: Int,
    flip: Boolean,
) {
    val width = rows.first().length
    val c = cell.toFloat()
    for (y in rows.indices) {
        val row = rows[y]
        val yPx = top + y * c
        for (x in row.indices) {
            val color = dogInk[row[x]] ?: continue
            val xPx = if (flip) left + (width - 1 - x) * c else left + x * c
            drawRect(color, Offset(xPx, yPx), Size(c, c))
        }
    }
}
