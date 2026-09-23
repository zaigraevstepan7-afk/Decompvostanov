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
    const val SPEED = 0.028f

    const val AGSL = """
        uniform float2 iResolution;
        uniform float iTime;
        uniform float iPhase;
        uniform float iSpeed;

        half4 main(float2 frag) {
            float2 extent = max(iResolution, float2(1.0));
            float2 uv = frag / extent.y;
            float t = iTime * iSpeed + iPhase;
            float2 p = uv * 2.05;
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
            float3 col = mix(float3(0.76, 0.72, 0.67), float3(0.14, 0.12, 0.13), vein * 0.88);
            col = mix(col, float3(0.42, 0.32, 0.24), fine * 0.35);
            col += float3(0.90, 0.88, 0.82) * spec * 0.16;
            col -= grain * 0.035;
            col = clamp(col, float3(0.0), float3(1.0));
            return half4(col.r, col.g, col.b, 1.0);
        }
    """
}

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

fun marblePhase(id: String): Float {
    val bucket = id.hashCode().toUInt() % 1000u
    return bucket.toFloat() / 1000f * 6.2831855f
}

@Composable
fun Modifier.marble(time: Float, phase: Float): Modifier {
    val paint = remember { MarblePaint() }
    return this.drawBehind { paint.draw(this, time, phase) }
}

private class MarblePaint {
    private val shader: RuntimeShader? = runCatching {
        if (Build.VERSION.SDK_INT >= 33) MarbleShaders.new() else null
    }.getOrNull()

    fun draw(scope: DrawScope, time: Float, phase: Float) {
        val runtime = shader
        if (runtime == null || scope.size.minDimension < 1f) {
            scope.drawMarbleFallback(time, phase)
            return
        }
        val painted = runCatching {
            runtime.setFloatUniform("iResolution", scope.size.width, scope.size.height)
            runtime.setFloatUniform("iTime", time)
            runtime.setFloatUniform("iPhase", phase)
            runtime.setFloatUniform("iSpeed", MarbleLook.SPEED)
            scope.drawRect(brush = ShaderBrush(runtime))
        }.isSuccess
        if (!painted) scope.drawMarbleFallback(time, phase)
    }
}

@RequiresApi(33)
private object MarbleShaders {
    fun new(): RuntimeShader = RuntimeShader(MarbleLook.AGSL)
}

private fun DrawScope.drawMarbleFallback(time: Float, phase: Float) {
    drawRect(Color(0xFFC2B8AB))
    val t = time * MarbleLook.SPEED + phase
    val width = size.width
    val height = size.height
    repeat(4) { band ->
        val path = Path()
        val origin = height * (0.18f + band * 0.22f)
        var x = 0f
        var first = true
        while (x <= width + 4f) {
            val warp = sin(x * 0.018f + t + band) * height * 0.16f +
                cos(x * 0.011f - t * 0.7f) * height * 0.05f
            val y = origin + warp
            if (first) path.moveTo(x, y) else path.lineTo(x, y)
            first = false
            x += 6f
        }
        val tone = if (band % 2 == 0) Color(0x66241F21) else Color(0x446B523D)
        drawPath(path, tone, style = Stroke(width = 1.6f + band * 0.35f))
    }
}
