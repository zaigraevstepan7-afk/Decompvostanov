package fun.nursultan.client.mixin;

import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.renderer.ScreenEffectRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ScreenEffectRenderer.class)
public class ScreenEffectRendererMixin {
    @Inject(method = "renderScreenEffect", at = @At("HEAD"), cancellable = true)
    private void nursultan$overlays(boolean firstPerson, float tickDelta, SubmitNodeCollector collector, CallbackInfo ci) {
        if (ClientHooks.removeScreenEffects()) {
            ci.cancel();
        }
    }
}
