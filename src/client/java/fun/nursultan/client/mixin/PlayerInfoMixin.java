package fun.nursultan.client.mixin;

import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.network.chat.Component;
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

    @Inject(method = "getTabListDisplayName", at = @At("HEAD"), cancellable = true)
    private void nursultan$tabName(CallbackInfoReturnable<Component> cir) {
        Module stream = ClientHooks.module("streamermode");
        if (stream == null || !stream.enabled) {
            return;
        }
        PlayerInfo self = (PlayerInfo) (Object) this;
        String shown = self.getProfile().name();
        if (shown == null) {
            shown = "";
        }
        String lower = shown.toLowerCase();
        boolean staff = stream.setting("staff") && lower.matches(
                ".*(admin|moder|helper|staff|хелпер|модер|админ|князь|титан|элита|герой|барон|принц|страж|аспид|герцог|глава).*");
        boolean link = stream.setting("links") && lower.matches(".*(t\\.me|vk\\.|https?://|discord\\.gg|/links).*");
        if (stream.setting("hide-entries") || staff || link) {
            cir.setReturnValue(Component.literal("hidden"));
            return;
        }
        if (stream.setting("name")) {
            cir.setReturnValue(Component.literal("Player"));
        }
    }
}
