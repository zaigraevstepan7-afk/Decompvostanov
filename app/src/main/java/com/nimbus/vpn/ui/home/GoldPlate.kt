package com.nimbus.vpn.ui.home

import android.graphics.RuntimeShader
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import kotlin.math.sin

/**
 * Brushed gold for the Auto card. The rim brightens toward the edges.
 */
object GoldLook {
    const val SPEED = 0.05f
    val Rim = Color(0xFFF0C14B)
    val Deep = Color(0xFF8A6420)

    const val AGSL = """
        uniform float2 iResolution;
        uniform float iTime;

        half4 main(float2 frag) {
            float2 extent = max(iResolution, float2(1.0));
            float2 uv = frag / extent;
            float t = iTime * 0.05;
            float2 p = uv * float2(2.4, 1.15);
            float flow = sin(p.x * 3.1 + p.y * 1.4 + t);
            flow += 0.45 * sin(p.y * 6.2 - t * 0.7 + sin(p.x * 2.0));
            float sheen = pow(clamp(0.5 + 0.5 * flow, 0.0, 1.0), 3.2);
            float3 col = mix(float3(0.96, 0.86, 0.52), float3(0.78, 0.55, 0.16), sheen * 0.42);
            col += float3(1.0, 0.94, 0.72) * pow(clamp(sheen, 0.0, 1.0), 8.0) * 0.22;
            float edge = min(min(frag.x, extent.x - frag.x), min(frag.y, extent.y - frag.y));
            float rim = smoothstep(42.0, 0.0, edge);
            float pulse = 0.62 + 0.38 * sin(t * 2.4);
            col += float3(1.0, 0.84, 0.38) * rim * 0.85 * pulse;
            col = clamp(col, float3(0.0), float3(1.0));
            return half4(col.r, col.g, col.b, 1.0);
        }
    """
}

@Composable
fun Modifier.gold(time: Float): Modifier {
    val paint = remember { GoldPaint() }
    return this.drawBehind { paint.draw(this, time) }
}

private class GoldPaint {
    private val shader: RuntimeShader? = runCatching {
        if (Build.VERSION.SDK_INT >= 33) GoldShaders.new() else null
    }.getOrNull()

    fun draw(scope: DrawScope, time: Float) {
        val runtime = shader
        if (runtime == null || scope.size.minDimension < 1f) {
            scope.drawGoldFallback(time)
            return
        }
        val painted = runCatching {
            runtime.setFloatUniform("iResolution", scope.size.width, scope.size.height)
            runtime.setFloatUniform("iTime", time)
            scope.drawRect(brush = ShaderBrush(runtime))
        }.isSuccess
        if (!painted) scope.drawGoldFallback(time)
    }
}

@RequiresApi(33)
private object GoldShaders {
    fun new(): RuntimeShader = RuntimeShader(GoldLook.AGSL)
}

private fun DrawScope.drawGoldFallback(time: Float) {
    drawRect(Color(0xFFF3D78A))
    val t = time * GoldLook.SPEED
    val pulse = 0.55f + 0.45f * ((sin(t * 2.4f) + 1f) / 2f)
    drawRect(GoldLook.Rim.copy(alpha = 0.55f * pulse), style = Stroke(width = 10f))
    drawRect(GoldLook.Deep.copy(alpha = 0.35f), style = Stroke(width = 3f))
}
