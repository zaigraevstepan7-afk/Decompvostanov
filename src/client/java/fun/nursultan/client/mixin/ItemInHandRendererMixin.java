package fun.nursultan.client.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemInHandRenderer.class)
public class ItemInHandRendererMixin {
    @Inject(method = "renderHandsWithItems", at = @At("HEAD"))
    private void nursultan$viewModel(float tickDelta, PoseStack pose, SubmitNodeCollector collector, LocalPlayer player, int light, CallbackInfo ci) {
        Module view = ClientHooks.module("viewmodel");
        if (view == null || !view.enabled) {
            return;
        }
        pose.translate(
                view.numberValue("right-hand-x", 0) + view.numberValue("left-hand-x", 0),
                view.numberValue("right-hand-y", 0) + view.numberValue("left-hand-y", 0),
                view.numberValue("right-hand-z", 0) + view.numberValue("left-hand-z", 0));
        float scale = view.numberValue("right-scale", 1) * view.numberValue("left-scale", 1);
        Module hands = ClientHooks.module("hands");
        if (hands != null && hands.enabled) {
            if (hands.setting("texture-mix")) {
                scale *= 1.05F;
            }
            if (hands.setting("color-right")) {
                pose.translate(0.02F, 0.01F, 0);
            }
            if (hands.setting("color-left")) {
                pose.translate(-0.02F, 0.01F, 0);
            }
            if (hands.setting("blur")) {
                scale *= 0.97F;
            }
        }
        pose.scale(scale, scale, scale);
    }
}
