package fun.nursultan.client.mixin;

import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiGraphics;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Gui.class)
public class GuiMixin {
    @Inject(method = "renderScoreboardSidebar", at = @At("HEAD"), cancellable = true)
    private void nursultan$scoreboard(GuiGraphics graphics, DeltaTracker tracker, CallbackInfo ci) {
        Module removals = ClientHooks.module("removals");
        if (removals != null && removals.enabled && removals.setting("removals") && removals.setting("scoreboard")) {
            ci.cancel();
        }
    }

    @Inject(method = "renderEffects", at = @At("HEAD"), cancellable = true)
    private void nursultan$effects(GuiGraphics graphics, DeltaTracker tracker, CallbackInfo ci) {
        Module removals = ClientHooks.module("removals");
        if (removals != null && removals.enabled && removals.setting("removals") && removals.setting("status-effect-overlay")) {
            ci.cancel();
        }
    }

    @Inject(method = "renderCameraOverlays", at = @At("HEAD"), cancellable = true)
    private void nursultan$vignette(GuiGraphics graphics, DeltaTracker tracker, CallbackInfo ci) {
        Module removals = ClientHooks.module("removals");
        if (removals != null && removals.enabled && removals.setting("removals") && removals.setting("vignette-overlay")) {
            ci.cancel();
        }
    }
}
