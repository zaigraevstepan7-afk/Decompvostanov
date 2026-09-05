package fun.nursultan.client.mixin;

import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.Camera;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.fog.FogRenderer;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FogRenderer.class)
public class FogRendererMixin {
    @Inject(method = "setupFog", at = @At("RETURN"), cancellable = true)
    private void nursultan$fog(Camera camera, int renderDistance, DeltaTracker tracker, float skyDarkness, ClientLevel level, CallbackInfoReturnable<Vector4f> cir) {
        Vector4f tinted = ClientHooks.fogColor(cir.getReturnValue());
        if (tinted != cir.getReturnValue()) {
            cir.setReturnValue(tinted);
        }
    }
}
