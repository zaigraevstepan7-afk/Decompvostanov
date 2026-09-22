package fun.nursultan.client.mixin;

import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GameRenderer.class)
public class GameRendererMixin {
    @Inject(method = "pick", at = @At("TAIL"))
    private void nursultan$noEntityTrace(float tickDelta, CallbackInfo ci) {
        if (!ClientHooks.skipEntityTrace()) {
            return;
        }
        Minecraft mc = Minecraft.getInstance();
        if (mc.hitResult instanceof EntityHitResult && mc.player != null) {
            Vec3 eye = mc.player.getEyePosition();
            Vec3 look = mc.player.getViewVector(tickDelta).scale(5);
            mc.hitResult = BlockHitResult.miss(eye.add(look), mc.player.getDirection(), mc.player.blockPosition());
        }
    }

    @Inject(method = "displayItemActivation", at = @At("HEAD"), cancellable = true)
    private void nursultan$totem(ItemStack stack, CallbackInfo ci) {
        if (ClientHooks.removeTotemPop()) {
            ci.cancel();
        }
    }

    @Inject(method = "getProjectionMatrix", at = @At("RETURN"), cancellable = true)
    private void nursultan$aspect(float fov, CallbackInfoReturnable<Matrix4f> cir) {
        float scale = ClientHooks.aspectScale();
        if (Math.abs(scale - 1.0F) < 0.001F) {
            return;
        }
        Matrix4f matrix = new Matrix4f(cir.getReturnValue());
        matrix.m00(matrix.m00() * scale);
        cir.setReturnValue(matrix);
    }
}
