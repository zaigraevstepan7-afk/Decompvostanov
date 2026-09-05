package fun.nursultan.client.mixin;

import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public class EntityMixin {
    @Inject(method = "push(Lnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true)
    private void nursultan$noPush(Entity other, CallbackInfo ci) {
        if ((Object) this == Minecraft.getInstance().player && ClientHooks.noEntityPush()) {
            ci.cancel();
        }
    }

    @Inject(method = "isPushedByFluid", at = @At("HEAD"), cancellable = true)
    private void nursultan$noFluidPush(CallbackInfoReturnable<Boolean> cir) {
        if ((Object) this == Minecraft.getInstance().player && ClientHooks.enabled("nopush")) {
            cir.setReturnValue(false);
        }
    }
}
