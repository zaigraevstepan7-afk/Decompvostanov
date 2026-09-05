package fun.nursultan.client.mixin;

import fun.nursultan.client.util.ChatLog;
import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerRotationPacket;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPacketListener.class)
public class ClientPacketListenerMixin {
    @Inject(method = "handleMovePlayer", at = @At("HEAD"), cancellable = true)
    private void nursultan$noServerRotPos(ClientboundPlayerPositionPacket packet, CallbackInfo ci) {
        if (ClientHooks.ignoreServerLook()) {
            ci.cancel();
        }
    }

    @Inject(method = "handleRotatePlayer", at = @At("HEAD"), cancellable = true)
    private void nursultan$noServerRot(ClientboundPlayerRotationPacket packet, CallbackInfo ci) {
        if (ClientHooks.ignoreServerLook()) {
            ci.cancel();
        }
    }

    @Inject(method = "handleSystemChat", at = @At("TAIL"))
    private void nursultan$chat(ClientboundSystemChatPacket packet, CallbackInfo ci) {
        ChatLog.push(packet.content().getString());
        Minecraft.getInstance();
    }
}
