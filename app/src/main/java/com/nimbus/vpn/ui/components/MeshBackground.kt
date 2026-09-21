package com.nimbus.vpn.ui.components

import android.graphics.RuntimeShader
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.withFrameNanos
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import com.nimbus.vpn.tunnel.ConnectionStatus
import kotlin.math.PI
import kotlin.math.sin

private const val MARBLE_AGSL = """
uniform float2 resolution;
uniform float time;
uniform float glow;

float hash(float2 p) {
    return fract(sin(dot(p, float2(127.1, 311.7))) * 43758.5453123);
}

float noise(float2 p) {
    float2 i = floor(p);
    float2 f = fract(p);
    float2 u = f * f * (3.0 - 2.0 * f);
    float a = hash(i);
    float b = hash(i + float2(1.0, 0.0));
    float c = hash(i + float2(0.0, 1.0));
    float d = hash(i + float2(1.0, 1.0));
    return mix(mix(a, b, u.x), mix(c, d, u.x), u.y);
}

float fbm(float2 p) {
    float v = 0.0;
    float a = 0.55;
    for (int i = 0; i < 5; i++) {
        v += a * noise(p);
        p = p * 2.02 + float2(1.7, 9.2);
        a *= 0.5;
    }
    return v;
}

half4 main(float2 coord) {
    float2 uv = coord / resolution;
    float2 p = uv * float2(2.2, 3.4);
    p.y += time * 0.045;
    p.x += sin(time * 0.17) * 0.12;
    float warp = fbm(p + time * 0.03);
    float n = fbm(p + warp * 1.6);
    float vein = abs(sin(n * 10.0 + uv.y * 3.0 + time * 0.15));
    vein = smoothstep(0.28, 0.95, vein);
    float3 stone = mix(float3(0.09, 0.09, 0.11), float3(0.22, 0.20, 0.23), n);
    float shift = sin(n * 7.0 + time * 0.45 + uv.x * 4.0);
    float3 pearl = mix(float3(0.95, 0.88, 0.74), float3(0.58, 0.72, 0.98), shift * 0.5 + 0.5);
    pearl = mix(pearl, float3(0.84, 0.62, 0.88), sin(time * 0.28 + n * 5.0) * 0.5 + 0.5);
    float gold = glow * smoothstep(0.4, 0.9, vein) * 0.35;
    pearl = mix(pearl, float3(0.93, 0.74, 0.38), gold);
    float3 col = mix(stone, pearl, vein * 0.62 + 0.06);
    float vignette = smoothstep(0.95, 0.25, length(uv - float2(0.5, 0.45)));
    col *= 0.78 + 0.22 * vignette;
    return half4(half3(col), 1.0);
}
"""

@Composable
fun MeshBackground(
    status: ConnectionStatus,
    animate: Boolean,
    modifier: Modifier = Modifier,
) {
    var time by remember { mutableFloatStateOf(0f) }
    LaunchedEffect(animate) {
        if (!animate) return@LaunchedEffect
        val start = System.nanoTime()
        while (true) {
            withFrameNanos { now ->
                time = (now - start) / 1_000_000_000f
            }
        }
    }
    val glow = when (status) {
        ConnectionStatus.CONNECTED -> 1f
        ConnectionStatus.CONNECTING -> 0.45f
        else -> 0f
    }
    if (Build.VERSION.SDK_INT >= 33) {
        MarbleShader(time = time, glow = glow, modifier = modifier)
    } else {
        MarbleFallback(time = time, glow = glow, modifier = modifier)
    }
}

@RequiresApi(33)
@Composable
private fun MarbleShader(time: Float, glow: Float, modifier: Modifier) {
    val shader = remember { runCatching { RuntimeShader(MARBLE_AGSL) }.getOrNull() }
    if (shader == null) {
        MarbleFallback(time = time, glow = glow, modifier = modifier)
        return
    }
    Canvas(modifier.fillMaxSize()) {
        shader.setFloatUniform("resolution", size.width, size.height)
        shader.setFloatUniform("time", time)
        shader.setFloatUniform("glow", glow)
        drawRect(ShaderBrush(shader))
    }
}

@Composable
private fun MarbleFallback(time: Float, glow: Float, modifier: Modifier) {
    Canvas(modifier.fillMaxSize()) {
        drawRect(Color(0xFF141416))
        val veins = listOf(
            Vein(0.18f, 1.05f, 0.16f, Color(0xFFF3E6C8)),
            Vein(0.40f, 1.55f, 0.20f, Color(0xFF8FB0E6)),
            Vein(0.62f, 0.85f, 0.18f, Color(0xFFD7A8DE)),
            Vein(0.78f, 1.9f, 0.12f, Color(0xFFF7F4EE)),
        )
        veins.forEachIndexed { index, vein ->
            val path = Path()
            val drift = sin(time * 0.33f + index) * size.height * 0.035f
            var x = 0f
            val step = 14f
            fun yAt(px: Float): Float {
                val wave = sin(
                    px / size.width * vein.freq * (PI.toFloat() * 2f) + time * (0.22f + index * 0.04f),
                )
                return size.height * vein.base + wave * size.height * 0.11f + drift
            }
            path.moveTo(0f, yAt(0f))
            while (x <= size.width + step) {
                path.lineTo(x, yAt(x))
                x += step
            }
            val tint = if (glow > 0f && index == 0) Color(0xFFE4B15A) else vein.color
            drawPath(
                path = path,
                color = tint.copy(alpha = vein.alpha),
                style = Stroke(width = size.minDimension * 0.22f, cap = StrokeCap.Round),
            )
        }
        drawCircle(
            color = Color.White.copy(alpha = 0.05f),
            radius = size.minDimension * 0.55f,
            center = Offset(size.width * 0.5f, size.height * (0.32f + 0.02f * sin(time * 0.4f))),
        )
    }
}

private data class Vein(val base: Float, val freq: Float, val alpha: Float, val color: Color)
