package fun.nursultan.client.mixin;

import fun.nursultan.client.modules.visual.FreeLook;
import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MouseHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MouseHandler.class)
public class MouseHandlerMixin {
    @Shadow
    private double accumulatedDX;
    @Shadow
    private double accumulatedDY;

    @Inject(method = "turnPlayer", at = @At("HEAD"), cancellable = true)
    private void nursultan$freeLook(double movementTime, CallbackInfo ci) {
        if (!ClientHooks.freeLook()) {
            return;
        }
        Minecraft mc = Minecraft.getInstance();
        double sens = mc.options.sensitivity().get() * 0.6 + 0.2;
        double step = sens * sens * sens * 8.0;
        FreeLook.add((float) (accumulatedDX * step), (float) (accumulatedDY * step));
        accumulatedDX = 0;
        accumulatedDY = 0;
        ci.cancel();
    }
}
