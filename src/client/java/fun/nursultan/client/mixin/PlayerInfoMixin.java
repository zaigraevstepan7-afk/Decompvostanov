package fun.nursultan.client.mixin;

import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.world.entity.player.PlayerSkin;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerInfo.class)
public class PlayerInfoMixin {
    @Inject(method = "getSkin", at = @At("HEAD"), cancellable = true)
    private void nursultan$skins(CallbackInfoReturnable<PlayerSkin> cir) {
        if (!ClientHooks.hideSkins()) {
            return;
        }
        PlayerInfo self = (PlayerInfo) (Object) this;
        cir.setReturnValue(DefaultPlayerSkin.get(self.getProfile()));
    }
}
