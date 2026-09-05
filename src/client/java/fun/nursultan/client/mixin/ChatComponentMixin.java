package fun.nursultan.client.mixin;

import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MessageSignature;
import net.minecraft.client.GuiMessageTag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChatComponent.class)
public class ChatComponentMixin {
    private static final String ADD =
            "addMessage(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/MessageSignature;Lnet/minecraft/client/GuiMessageTag;)V";

    @Inject(method = ADD, at = @At("HEAD"), cancellable = true)
    private void nursultan$drop(Component message, MessageSignature signature, GuiMessageTag tag, CallbackInfo ci) {
        if (ClientHooks.filterChat(message) == null) {
            ci.cancel();
        }
    }

    @ModifyVariable(method = ADD, at = @At("HEAD"), argsOnly = true)
    private Component nursultan$filter(Component message) {
        Component next = ClientHooks.filterChat(message);
        return next == null ? Component.empty() : next;
    }
}
