package fun.nursultan.client.mixin;

import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ClientHooks;
import java.util.Optional;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.core.ClientAsset;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.PlayerSkin;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerInfo.class)
public class PlayerInfoMixin {
    private static final Identifier CAPE = Identifier.fromNamespaceAndPath("nursultan", "textures/capes/cape.png");

    @Inject(method = "getSkin", at = @At("HEAD"), cancellable = true)
    private void nursultan$skins(CallbackInfoReturnable<PlayerSkin> cir) {
        if (!ClientHooks.hideSkins()) {
            return;
        }
        PlayerInfo self = (PlayerInfo) (Object) this;
        cir.setReturnValue(DefaultPlayerSkin.get(self.getProfile()));
    }

    @Inject(method = "getSkin", at = @At("RETURN"), cancellable = true)
    private void nursultan$cape(CallbackInfoReturnable<PlayerSkin> cir) {
        if (!ClientHooks.customCape()) {
            return;
        }
        PlayerSkin orig = cir.getReturnValue();
        if (orig == null) {
            return;
        }
        PlayerInfo self = (PlayerInfo) (Object) this;
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || !self.getProfile().id().equals(mc.player.getUUID())) {
            return;
        }
        if (mc.getResourceManager().getResource(CAPE).isEmpty()) {
            return;
        }
        cir.setReturnValue(orig.with(PlayerSkin.Patch.create(
                Optional.empty(),
                Optional.of(new ClientAsset.ResourceTexture(CAPE)),
                Optional.empty(),
                Optional.empty())));
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
        boolean staff = stream.setting("staff") && ClientHooks.streamerStaff(shown);
        boolean link = stream.setting("links") && ClientHooks.streamerLink(shown);
        if (stream.setting("hide-entries") || staff || link) {
            cir.setReturnValue(Component.literal("hidden"));
            return;
        }
        if (stream.setting("name")) {
            cir.setReturnValue(Component.literal("Player"));
        }
    }
}
