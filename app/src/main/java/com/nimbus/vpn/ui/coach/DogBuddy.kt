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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInParent
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nimbus.vpn.tunnel.ConnectionStatus
import com.nimbus.vpn.ui.theme.Accent
import com.nimbus.vpn.ui.theme.Canvas
import com.nimbus.vpn.ui.theme.Ink
import com.nimbus.vpn.ui.theme.Motion
import com.nimbus.vpn.ui.theme.Paper
import kotlinx.coroutines.delay
import kotlin.math.PI
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

private enum class Act { IDLE, THROW, CHASE, WAIT, BACK, HOP }

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
    status: ConnectionStatus = ConnectionStatus.DISCONNECTED,
    modifier: Modifier = Modifier,
) {
    val density = LocalDensity.current
    val cellPx = with(density) { DOG_CELL_DP.dp.toPx() }.roundToInt().coerceAtLeast(2)
    val sit = DogPixels.rows(DogFrame.SIT)
    val sitW = sit.first().length
    val peakH = DogPixels.rows(DogFrame.PEAK).size
    val boxW = with(density) { (sitW * cellPx).toDp() }
    val boxH = with(density) { ((peakH + DOG_PAD_TOP) * cellPx).toDp() }
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
        var dogInColumn by remember { mutableStateOf(Offset.Zero) }
        val homeCenter = remember { mutableFloatStateOf(0f) }
        val ground = remember { mutableFloatStateOf(0f) }
        homeCenter.floatValue = placeX + dogInColumn.x + sitW * cellPx / 2f
        ground.floatValue = placeY + dogInColumn.y + (peakH + DOG_PAD_TOP) * cellPx.toFloat()

        var act by remember { mutableStateOf(Act.IDLE) }
        val bring = remember { mutableStateOf(false) }
        val armed = remember { mutableStateOf(false) }
        var playFrame by remember { mutableStateOf(DogFrame.RUN_A) }
        var playLift by remember { mutableIntStateOf(0) }
        var flip by remember { mutableStateOf(false) }
        var carry by remember { mutableStateOf(false) }
        var showBall by remember { mutableStateOf(false) }
        var centerX by remember { mutableFloatStateOf(0f) }
        var ballX by remember { mutableFloatStateOf(0f) }
        var ballY by remember { mutableFloatStateOf(0f) }
        var stride by remember { mutableIntStateOf(0) }

        LaunchedEffect(status) {
            when (status) {
                ConnectionStatus.CONNECTING -> {
                    armed.value = true
                    if (act == Act.IDLE) {
                        centerX = homeCenter.floatValue
                        playFrame = DogFrame.RUN_A
                        playLift = 0
                        carry = false
                        showBall = true
                        act = Act.THROW
                    }
                }
                ConnectionStatus.CONNECTED -> if (armed.value) bring.value = true
                else -> {
                    armed.value = false
                    bring.value = false
                    if (act != Act.IDLE) act = Act.IDLE
                }
            }
        }
        LaunchedEffect(act) {
            val cell = cellPx.toFloat()
            val run = arrayOf(DogFrame.RUN_A, DogFrame.RUN_B, DogFrame.RUN_C, DogFrame.RUN_B)
            val lifts = intArrayOf(0, 1, 0, 3)
            when (act) {
                Act.IDLE -> {
                    showBall = false
                    carry = false
                }
                Act.THROW -> {
                    var guard = 0
                    while (homeCenter.floatValue < 1f && guard < 20) {
                        delay(16)
                        guard++
                    }
                    val start = homeCenter.floatValue
                    val floor = ground.floatValue
                    val travel = with(density) { 156.dp.toPx() }
                    val sign = if (start < maxW * 0.55f) 1 else -1
                    val dest = (start + sign * travel).coerceIn(48f, maxW - 48f)
                    centerX = start
                    flip = sign < 0
                    playFrame = DogFrame.RUN_A
                    showBall = true
                    carry = false
                    val steps = 12
                    for (i in 0..steps) {
                        val t = i / steps.toFloat()
                        ballX = start + (dest - start) * t
                        ballY = floor - sin(t * PI).toFloat() * with(density) { 72.dp.toPx() } - cell * 4
                        delay(34)
                    }
                    ballX = dest
                    ballY = floor - cell * 4
                    act = Act.CHASE
                }
                Act.CHASE -> {
                    var n = 0
                    while (n < 48 && !noseReached(centerX, ballX, flip, cell)) {
                        centerX = (centerX + if (flip) -cell * 2 else cell * 2).coerceIn(cell * 6, maxW - cell * 6)
                        playFrame = run[stride % 4]
                        playLift = lifts[stride % 4]
                        stride++
                        ballY = ground.floatValue - cell * 4 + if (stride % 2 == 0) 0f else -cell
                        n++
                        delay(58)
                    }
                    playLift = 0
                    playFrame = DogFrame.RUN_A
                    act = if (bring.value) Act.BACK else Act.WAIT
                }
                Act.WAIT -> {
                    var n = 0
                    while (!bring.value) {
                        playFrame = if (n % 2 == 0) DogFrame.RUN_A else DogFrame.RUN_B
                        playLift = if (n % 2 == 0) 0 else 1
                        ballY = ground.floatValue - cell * 4 + if (n % 2 == 0) 0f else -cell
                        n++
                        delay(140)
                    }
                    act = Act.BACK
                }
                Act.BACK -> {
                    flip = !flip
                    showBall = false
                    carry = true
                    var n = 0
                    while (n < 48 && kotlin.math.abs(centerX - homeCenter.floatValue) > cell * 2) {
                        val step = if (centerX < homeCenter.floatValue) cell * 2 else -cell * 2
                        flip = step < 0
                        centerX = (centerX + step).coerceIn(cell * 6, maxW - cell * 6)
                        playFrame = run[stride % 4]
                        playLift = lifts[stride % 4]
                        stride++
                        n++
                        delay(58)
                    }
                    centerX = homeCenter.floatValue
                    flip = false
                    playLift = 0
                    act = Act.HOP
                }
                Act.HOP -> {
                    flip = false
                    carry = true
                    showBall = false
                    val jumps = listOf(
                        DogFrame.SIT,
                        DogFrame.RISE,
                        DogFrame.PEAK,
                        DogFrame.RISE,
                        DogFrame.SIT,
                        DogFrame.RISE,
                        DogFrame.PEAK,
                        DogFrame.HAPPY,
                    )
                    for (frame in jumps) {
                        playFrame = frame
                        centerX = homeCenter.floatValue
                        delay(78)
                    }
                    carry = false
                    showBall = true
                    ballX = centerX + cell * 8
                    ballY = ground.floatValue - cell * 4
                    playFrame = DogFrame.HAPPY
                    delay(320)
                    showBall = false
                    armed.value = false
                    bring.value = false
                    act = Act.IDLE
                }
            }
        }

        Box(Modifier.fillMaxSize()) {
            if (act != Act.IDLE) {
                Canvas(
                    Modifier
                        .fillMaxSize()
                        .semantics { contentDescription = "Пёс" },
                ) {
                    val cell = cellPx
                    val rows = DogPixels.rows(playFrame)
                    val width = rows.first().length
                    val height = rows.size
                    val left = snap(centerX - width * cell / 2f, cell)
                    val top = snap(ground.floatValue - (height + playLift) * cell, cell)
                    if (playLift > 0 || playFrame == DogFrame.PEAK || playFrame == DogFrame.RISE) {
                        drawShadow(centerX, ground.floatValue, cell)
                    }
                    drawPixels(rows, left, top, cell, flip)
                    if (showBall) drawBall(ballX, ballY, cell)
                    if (carry) {
                        val (mx, my) = DogPixels.mouth(playFrame)
                        val bx = if (!flip) left + mx * cell else left + (width - 1 - mx) * cell
                        drawBall(bx, top + my * cell, cell)
                    }
                    if (playFrame == DogFrame.PEAK) {
                        val star = Color(0xFFF0C36A)
                        pixelStar(left - cell, top + cell.toFloat(), cell.toFloat(), star)
                        pixelStar(left + width * cell, top + 3f * cell, cell.toFloat(), star)
                    }
                }
            }
            Column(Modifier.offset { IntOffset(placeX, placeY) }) {
                if (bubbleAbove && message != null) {
                    SpeechBubble(
                        message,
                        action,
                        onAction,
                        Modifier.offset(y = (DOG_PAD_TOP * DOG_CELL_DP).dp),
                    )
                }
                Box(
                    Modifier
                        .size(boxW, boxH)
                        .onGloballyPositioned { dogInColumn = it.positionInParent() }
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
                ) {
                    if (act == Act.IDLE) {
                        DogSprite(
                            mood = if (status == ConnectionStatus.DISCONNECTED && joyPulse > 0) DogMood.JOY else mood,
                            cellPx = cellPx,
                            modifier = Modifier.fillMaxSize(),
                        )
                    }
                }
                if (!bubbleAbove && message != null) {
                    SpeechBubble(message, action, onAction)
                }
            }
        }
    }
}

private fun noseReached(center: Float, ball: Float, flip: Boolean, cell: Float): Boolean {
    val nose = center + if (flip) -7f * cell else 7f * cell
    return if (flip) nose <= ball else nose >= ball
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
    '1' to Color(0xFF141210),
    '2' to Color(0xFF1B1B1B),
    '3' to Color(0xFF3C3C3C),
    '4' to Color(0xFFC8C0B8),
    '5' to Color(0xFFF3F0EA),
    '6' to Color(0xFFF7F7F8),
    '7' to Color(0xFF6E564C),
)

@Composable
private fun DogSprite(mood: DogMood, cellPx: Int, modifier: Modifier = Modifier) {
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
    val bob = if (bobT > 0.5f) 1 else 0
    val blinkShut = blinkT in 0.90f..0.96f
    val frame = when {
        mood == DogMood.JOY -> DogFrame.HAPPY
        blinkShut -> DogFrame.BLINK
        blinkT in 0.62f..0.74f -> DogFrame.PAW
        mood == DogMood.POINT || (mood == DogMood.WAVE && bob == 1) -> DogFrame.LOOK
        else -> DogFrame.SIT
    }
    val lift = if (frame == DogFrame.PEAK) 2 else bob
    Canvas(modifier.semantics { contentDescription = "Пёс" }) {
        val rows = DogPixels.rows(frame)
        val top = snap(size.height - (rows.size + lift) * cellPx, cellPx)
        if (frame == DogFrame.PEAK || frame == DogFrame.RISE) {
            drawShadow(size.width / 2f, size.height, cellPx)
        }
        drawPixels(rows, snap((size.width - rows.first().length * cellPx) / 2f, cellPx), top, cellPx, flip = false)
        if (frame == DogFrame.PEAK) {
            val star = Color(0xFFF0C36A)
            pixelStar(4f, top, cellPx.toFloat(), star)
            pixelStar(size.width - cellPx * 3f, top + cellPx, cellPx.toFloat(), star)
        }
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

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawBall(x: Float, y: Float, cell: Int) {
    val c = cell.toFloat()
    val left = snap(x, cell)
    val top = snap(y, cell)
    val yellow = Color(0xFFE6D23A)
    val shade = Color(0xFFB39A16)
    val hi = Color(0xFFFFF4A0)
    fun cellAt(dx: Int, dy: Int, color: Color) {
        drawRect(color, Offset(left + dx * c, top + dy * c), Size(c, c))
    }
    cellAt(1, 0, yellow)
    cellAt(2, 0, yellow)
    cellAt(0, 1, yellow)
    cellAt(1, 1, hi)
    cellAt(2, 1, yellow)
    cellAt(3, 1, shade)
    cellAt(0, 2, yellow)
    cellAt(1, 2, yellow)
    cellAt(2, 2, shade)
    cellAt(3, 2, shade)
    cellAt(1, 3, shade)
    cellAt(2, 3, shade)
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawShadow(center: Float, ground: Float, cell: Int) {
    val c = cell.toFloat()
    drawRect(
        Color(0x33000000),
        Offset(snap(center - 4 * c, cell), snap(ground - c, cell)),
        Size(c * 8, c),
    )
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.pixelStar(
    cx: Float,
    cy: Float,
    cell: Float,
    color: Color,
) {
    drawRect(color, Offset(cx, cy), Size(cell, cell))
    drawRect(color, Offset(cx - cell, cy), Size(cell, cell))
    drawRect(color, Offset(cx + cell, cy), Size(cell, cell))
    drawRect(color, Offset(cx, cy - cell), Size(cell, cell))
    drawRect(color, Offset(cx, cy + cell), Size(cell, cell))
}
