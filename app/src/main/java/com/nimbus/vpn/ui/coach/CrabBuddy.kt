package com.nimbus.vpn.ui.coach

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Canvas
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.Motion
import com.nimbus.vpn.ui.theme.Paper
import kotlinx.coroutines.launch
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

enum class CrabMood { WAVE, POINT, JOY, CALM }

private val Shell = Color(0xFFE36A42)
private val ShellDeep = Color(0xFFC44B30)
private val Belly = Color(0xFFF6D3C0)
private val Blush = Color(0xFFF0A090)

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
        drawCircle(ring.copy(alpha = 0.85f), radius = size.maxDimension * 0.48f, style = Stroke(3.dp.toPx()))
    }
}

@Composable
fun CrabDock(
    mood: CrabMood,
    message: String?,
    action: String?,
    onAction: (() -> Unit)?,
    joyPulse: Int,
    modifier: Modifier = Modifier,
) {
    val jump = remember { androidx.compose.animation.core.Animatable(0f) }
    val spin = remember { androidx.compose.animation.core.Animatable(0f) }
    LaunchedEffect(joyPulse) {
        if (joyPulse == 0 && mood != CrabMood.JOY) return@LaunchedEffect
        if (mood != CrabMood.JOY && joyPulse == 0) return@LaunchedEffect
        launch {
            jump.snapTo(0f)
            jump.animateTo(-34f, spring(dampingRatio = 0.42f, stiffness = 320f))
            jump.animateTo(0f, spring(dampingRatio = 0.5f, stiffness = 420f))
            jump.animateTo(-16f, spring(dampingRatio = 0.55f, stiffness = 380f))
            jump.animateTo(0f, spring(dampingRatio = Spring.DampingRatioMediumBouncy, stiffness = 360f))
        }
        launch {
            spin.snapTo(0f)
            spin.animateTo(-10f, tween(160))
            spin.animateTo(10f, tween(180))
            spin.animateTo(0f, spring(dampingRatio = 0.6f, stiffness = 280f))
        }
    }
    Column(modifier.widthIn(max = 280.dp), horizontalAlignment = Alignment.Start) {
        if (message != null) {
            SpeechBubble(message, action, onAction)
        }
        CrabBody(
            mood = mood,
            modifier = Modifier
                .padding(start = 6.dp, top = 2.dp)
                .graphicsLayer {
                    translationY = jump.value * density
                    rotationZ = spin.value
                },
        )
    }
}

@Composable
private fun SpeechBubble(message: String, action: String?, onAction: (() -> Unit)?) {
    Column(
        Modifier
            .clip(RoundedCornerShape(18.dp))
            .background(Paper)
            .padding(horizontal = 14.dp, vertical = 12.dp),
    ) {
        AnimatedContent(
            targetState = message,
            transitionSpec = {
                (fadeIn(Motion.fade(220)) + slideInVertically { it / 4 }) togetherWith fadeOut(Motion.fade(120))
            },
            label = "crab-line",
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
private fun CrabBody(mood: CrabMood, modifier: Modifier = Modifier) {
    val drift = rememberInfiniteTransition(label = "crab")
    val bob by drift.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(1600, easing = FastOutSlowInEasing), RepeatMode.Reverse),
        label = "bob",
    )
    val wave by drift.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(520, easing = FastOutSlowInEasing), RepeatMode.Reverse),
        label = "wave",
    )
    val blink by drift.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(2800), RepeatMode.Restart),
        label = "blink",
    )
    val joyLift by animateFloatAsState(
        targetValue = if (mood == CrabMood.JOY) 1f else 0f,
        animationSpec = spring(dampingRatio = 0.6f, stiffness = 220f),
        label = "joy-lift",
    )
    androidx.compose.foundation.Canvas(modifier.size(108.dp)) {
        val bobPx = (bob - 0.5f) * 8.dp.toPx()
        val cx = size.width * 0.52f
        val cy = size.height * 0.58f + bobPx - joyLift * 6.dp.toPx()
        val blinkShut = blink > 0.92f
        drawOval(
            color = Color(0x14000000),
            topLeft = Offset(cx - 34.dp.toPx(), size.height * 0.86f),
            size = Size(68.dp.toPx(), 10.dp.toPx()),
        )
        legs(cx, cy, bob)
        val clawLift = when (mood) {
            CrabMood.WAVE -> wave
            CrabMood.JOY -> 0.85f + wave * 0.15f
            CrabMood.POINT -> 0.65f
            CrabMood.CALM -> 0.15f + wave * 0.08f
        }
        claw(cx - 34.dp.toPx(), cy - 6.dp.toPx(), clawLift, left = true, joy = mood == CrabMood.JOY)
        claw(cx + 34.dp.toPx(), cy - 4.dp.toPx(), if (mood == CrabMood.POINT) 0.2f else clawLift * 0.45f, left = false, joy = mood == CrabMood.JOY)
        drawOval(
            brush = Brush.radialGradient(
                colors = listOf(Color(0xFFF08962), Shell, ShellDeep),
                center = Offset(cx - 8.dp.toPx(), cy - 10.dp.toPx()),
                radius = 48.dp.toPx(),
            ),
            topLeft = Offset(cx - 30.dp.toPx(), cy - 26.dp.toPx()),
            size = Size(60.dp.toPx(), 48.dp.toPx()),
        )
        drawOval(
            color = Belly,
            topLeft = Offset(cx - 16.dp.toPx(), cy - 6.dp.toPx()),
            size = Size(32.dp.toPx(), 24.dp.toPx()),
        )
        eyes(cx, cy - 30.dp.toPx(), blinkShut, mood)
        blush(cx, cy - 8.dp.toPx())
        smile(cx, cy - 2.dp.toPx(), mood == CrabMood.JOY)
        if (mood == CrabMood.JOY) sparkles(cx, cy, bob)
    }
}

private fun DrawScope.legs(cx: Float, cy: Float, bob: Float) {
    val reach = 16.dp.toPx()
    repeat(3) { index ->
        val spread = (index - 1) * 7.dp.toPx()
        val wobble = sin((bob + index) * PI).toFloat() * 2.dp.toPx()
        leg(Offset(cx - 18.dp.toPx(), cy + 8.dp.toPx() + spread * 0.3f), Offset(cx - 18.dp.toPx() - reach, cy + 16.dp.toPx() + spread + wobble))
        leg(Offset(cx + 18.dp.toPx(), cy + 8.dp.toPx() + spread * 0.3f), Offset(cx + 18.dp.toPx() + reach, cy + 16.dp.toPx() + spread - wobble))
    }
}

private fun DrawScope.leg(from: Offset, to: Offset) {
    drawLine(ShellDeep, from, to, strokeWidth = 2.4.dp.toPx(), cap = StrokeCap.Round)
}

private fun DrawScope.claw(anchorX: Float, anchorY: Float, lift: Float, left: Boolean, joy: Boolean) {
    val dir = if (left) -1f else 1f
    val angle = dir * (18f + lift * 48f)
    rotate(angle, Offset(anchorX, anchorY)) {
        drawCircle(Shell, radius = 11.dp.toPx(), center = Offset(anchorX + dir * 8.dp.toPx(), anchorY - lift * 10.dp.toPx()))
        val open = 8.dp.toPx() + lift * 7.dp.toPx() + if (joy) 4.dp.toPx() else 0f
        val base = Offset(anchorX + dir * 14.dp.toPx(), anchorY - 8.dp.toPx() - lift * 12.dp.toPx())
        drawArcLike(base, -open, left)
        drawArcLike(base, open * 0.15f, left)
    }
}

private fun DrawScope.drawArcLike(base: Offset, shift: Float, left: Boolean) {
    val path = Path()
    val dir = if (left) -1f else 1f
    path.moveTo(base.x, base.y)
    path.quadraticTo(
        base.x + dir * 16.dp.toPx(),
        base.y + shift,
        base.x + dir * 8.dp.toPx(),
        base.y + shift + dir * 2.dp.toPx(),
    )
    drawPath(path, ShellDeep, style = Stroke(width = 3.dp.toPx(), cap = StrokeCap.Round))
}

private fun DrawScope.eyes(cx: Float, cy: Float, shut: Boolean, mood: CrabMood) {
    val look = when (mood) {
        CrabMood.POINT -> 2.2.dp.toPx()
        CrabMood.JOY -> 0f
        else -> 0.6.dp.toPx()
    }
    eye(Offset(cx - 10.dp.toPx(), cy), look, shut, mood == CrabMood.JOY)
    eye(Offset(cx + 12.dp.toPx(), cy), look, shut, mood == CrabMood.JOY)
}

private fun DrawScope.eye(at: Offset, look: Float, shut: Boolean, joy: Boolean) {
    drawCircle(Color(0xFF2A211C), radius = 3.2.dp.toPx(), center = Offset(at.x, at.y - 10.dp.toPx()))
    if (shut) {
        drawLine(Ink, Offset(at.x - 6.dp.toPx(), at.y), Offset(at.x + 6.dp.toPx(), at.y), strokeWidth = 2.dp.toPx(), cap = StrokeCap.Round)
        return
    }
    drawCircle(Color.White, radius = 7.dp.toPx(), center = at)
    drawCircle(Ink, radius = 3.4.dp.toPx(), center = Offset(at.x + look, at.y + if (joy) -1.dp.toPx() else 0.5.dp.toPx()))
    drawCircle(Color.White, radius = 1.3.dp.toPx(), center = Offset(at.x + look - 1.dp.toPx(), at.y - 1.2.dp.toPx()))
}

private fun DrawScope.blush(cx: Float, cy: Float) {
    drawCircle(Blush.copy(alpha = 0.85f), radius = 4.5.dp.toPx(), center = Offset(cx - 18.dp.toPx(), cy))
    drawCircle(Blush.copy(alpha = 0.85f), radius = 4.5.dp.toPx(), center = Offset(cx + 18.dp.toPx(), cy))
}

private fun DrawScope.smile(cx: Float, cy: Float, joy: Boolean) {
    val path = Path()
    val width = if (joy) 16.dp.toPx() else 10.dp.toPx()
    val drop = if (joy) 8.dp.toPx() else 4.dp.toPx()
    path.moveTo(cx - width, cy)
    path.quadraticTo(cx, cy + drop, cx + width, cy)
    drawPath(path, Ink, style = Stroke(width = 1.8.dp.toPx(), cap = StrokeCap.Round))
}

private fun DrawScope.sparkles(cx: Float, cy: Float, phase: Float) {
    repeat(5) { index ->
        val angle = (index / 5f) * (PI.toFloat() * 2f) + phase
        val dist = 40.dp.toPx() + index * 3.dp.toPx()
        val spark = Offset(cx + cos(angle) * dist, cy - 24.dp.toPx() + sin(angle) * dist * 0.45f)
        drawCircle(Color(0xFFFFD27A), radius = 2.2.dp.toPx(), center = spark)
    }
}
