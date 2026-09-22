package fun.nursultan.client.mixin;

import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LocalPlayer.class)
public class LocalPlayerMixin {
    @Inject(method = "aiStep", at = @At("TAIL"))
    private void nursultan$noSlow(CallbackInfo ci) {
        LocalPlayer self = (LocalPlayer) (Object) this;
        if (!ClientHooks.noSlow() || !self.isUsingItem() || self.input == null || !self.input.hasForwardImpulse()) {
            return;
        }
        Vec3 v = self.getDeltaMovement();
        double yaw = Math.toRadians(self.getYRot());
        float speed = ClientHooks.noSlowSpeed();
        self.setDeltaMovement(-Math.sin(yaw) * speed, v.y, Math.cos(yaw) * speed);
    }
}
