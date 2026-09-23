package com.nimbus.vpn.ui.home

import android.graphics.RuntimeShader
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import kotlin.math.cos
import kotlin.math.sin
import kotlinx.coroutines.isActive
import androidx.compose.runtime.withFrameNanos

/**
 * Carrara marble from the shader pack, slowed so the veins drift instead of racing.
 * The pack used Moment * 0.09. This keeps the same veins and only turns the clock down.
 */
object MarbleLook {
    const val SPEED = 0.072f

    const val AGSL = """
        uniform float2 iResolution;
        uniform float2 iShift;
        uniform float iTime;
        uniform float iPhase;
        uniform float iSpeed;

        half4 main(float2 frag) {
            float2 extent = max(iResolution, float2(1.0));
            float span = max(extent.x, extent.y);
            float2 uv = frag / span;
            float t = iTime * iSpeed + iPhase;
            float2 p = uv * 2.35 + iShift;
            p += 0.42 * float2(sin(p.y * 1.7 + t), cos(p.x * 1.45 - t * 0.85));
            p += 0.22 * float2(sin(p.y * 3.4 - t * 0.55), cos(p.x * 2.9 + t * 0.40));
            p += 0.08 * float2(sin(p.y * 7.0 + t * 0.9), cos(p.x * 6.2 - t * 0.7));
            float vein = abs(sin(p.x * 2.35 + sin(p.y * 3.05) * 1.35));
            vein *= abs(sin(p.y * 1.55 + cos(p.x * 2.15) * 0.85));
            vein = pow(1.0 - clamp(vein, 0.0, 1.0), 9.5);
            float fine = pow(1.0 - clamp(abs(sin(p.x * 7.2 + p.y * 2.8 + t * 0.6)), 0.0, 1.0), 18.0);
            float drift = 0.5 + 0.5 * sin(p.x * 1.1 - t * 0.7 + p.y * 0.35);
            float spec = pow(clamp(drift, 0.0, 1.0), 14.0);
            float grain = fract(sin(dot(uv * 42.0 + t * 0.2, float2(12.9, 78.2))) * 43758.5453);
            float3 col = mix(float3(0.86, 0.83, 0.78), float3(0.22, 0.18, 0.17), vein * 0.62);
            col = mix(col, float3(0.55, 0.44, 0.34), fine * 0.22);
            col += float3(0.96, 0.94, 0.90) * spec * 0.18;
            col -= grain * 0.025;
            col = clamp(col, float3(0.0), float3(1.0));
            return half4(col.r, col.g, col.b, 1.0);
        }
    """
}

data class MarbleMotion(
    val phase: Float,
    val rate: Float,
    val shiftX: Float,
    val shiftY: Float,
)

@Composable
fun rememberMarbleTime(animate: Boolean): Float {
    var time by remember { mutableFloatStateOf(0f) }
    LaunchedEffect(animate) {
        if (!animate) return@LaunchedEffect
        val start = System.nanoTime()
        while (isActive) {
            withFrameNanos { now ->
                time = (now - start) / 1_000_000_000f
            }
        }
    }
    return time
}

fun marbleMotion(id: String): MarbleMotion {
    val h = id.hashCode().toUInt()
    fun unit(salt: UInt): Float {
        var x = h xor salt
        x = x * 1664525u + 1013904223u
        return (x % 10000u).toFloat() / 10000f
    }
    return MarbleMotion(
        phase = unit(0xA5A5u) * 24f,
        rate = 0.62f + unit(0x3C3Cu) * 0.85f,
        shiftX = unit(0x7F1u) * 5.5f,
        shiftY = unit(0x91D2u) * 4.2f,
    )
}

@Composable
fun Modifier.marble(time: Float, motion: MarbleMotion): Modifier {
    val paint = remember { MarblePaint() }
    return this.drawBehind { paint.draw(this, time, motion) }
}

private class MarblePaint {
    private val shader: RuntimeShader? = runCatching {
        if (Build.VERSION.SDK_INT >= 33) MarbleShaders.new() else null
    }.getOrNull()

    fun draw(scope: DrawScope, time: Float, motion: MarbleMotion) {
        val runtime = shader
        if (runtime == null || scope.size.minDimension < 1f) {
            scope.drawMarbleFallback(time, motion)
            return
        }
        val painted = runCatching {
            runtime.setFloatUniform("iResolution", scope.size.width, scope.size.height)
            runtime.setFloatUniform("iShift", motion.shiftX, motion.shiftY)
            runtime.setFloatUniform("iTime", time)
            runtime.setFloatUniform("iPhase", motion.phase)
            runtime.setFloatUniform("iSpeed", MarbleLook.SPEED * motion.rate)
            scope.drawRect(brush = ShaderBrush(runtime))
        }.isSuccess
        if (!painted) scope.drawMarbleFallback(time, motion)
    }
}

@RequiresApi(33)
private object MarbleShaders {
    fun new(): RuntimeShader = RuntimeShader(MarbleLook.AGSL)
}

private fun DrawScope.drawMarbleFallback(time: Float, motion: MarbleMotion) {
    drawRect(Color(0xFFDCD4C8))
    val t = time * MarbleLook.SPEED * motion.rate + motion.phase
    val width = size.width
    val height = size.height
    repeat(3) { band ->
        val path = Path()
        val origin = height * (0.22f + band * 0.28f + motion.shiftY * 0.04f)
        var x = 0f
        var first = true
        while (x <= width + 4f) {
            val warp = sin(x * 0.012f + t * 0.35f + motion.shiftX + band) * height * 0.22f
            val y = origin + warp
            if (first) path.moveTo(x, y) else path.lineTo(x, y)
            first = false
            x += 8f
        }
        drawPath(path, Color(0x55382E2A), style = Stroke(width = 2.2f))
    }
}
