package fun.nursultan.client.mixin;

import fun.nursultan.client.modules.visual.FreeLook;
import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.Camera;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Camera.class)
public abstract class CameraMixin {
    @Shadow
    protected abstract void setRotation(float yRot, float xRot);

    @Shadow
    protected abstract void setPosition(double x, double y, double z);

    @Shadow
    public abstract Entity entity();

    @Inject(method = "setup", at = @At("TAIL"))
    private void nursultan$camera(Level level, Entity entity, boolean detached, boolean reverse, float partialTick, CallbackInfo ci) {
        if (ClientHooks.freeLook()) {
            setRotation(FreeLook.camYaw, FreeLook.camPitch);
        }
        if (ClientHooks.cameraClip() && entity != null) {
            setPosition(entity.getX(), entity.getEyeY(), entity.getZ());
        }
    }
}
