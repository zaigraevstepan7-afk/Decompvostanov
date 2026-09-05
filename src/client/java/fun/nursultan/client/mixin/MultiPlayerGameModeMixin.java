package fun.nursultan.client.mixin;

import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MultiPlayerGameMode.class)
public class MultiPlayerGameModeMixin {
    @Shadow
    private int destroyDelay;
    @Inject(method = "useItemOn", at = @At("HEAD"), cancellable = true)
    private void nursultan$noInteractBlock(LocalPlayer player, InteractionHand hand, BlockHitResult hit, CallbackInfoReturnable<InteractionResult> cir) {
        if (ClientHooks.skipBlockInteract(hit)) {
            cir.setReturnValue(InteractionResult.PASS);
        }
    }

    @Inject(method = "interact", at = @At("HEAD"), cancellable = true)
    private void nursultan$noInteractEntity(Player player, Entity entity, InteractionHand hand, CallbackInfoReturnable<InteractionResult> cir) {
        if (ClientHooks.skipEntityInteract(entity)) {
            cir.setReturnValue(InteractionResult.PASS);
        }
    }

    @Inject(method = "interactAt", at = @At("HEAD"), cancellable = true)
    private void nursultan$noInteractAt(Player player, Entity entity, EntityHitResult hit, InteractionHand hand, CallbackInfoReturnable<InteractionResult> cir) {
        if (ClientHooks.skipEntityInteract(entity)) {
            cir.setReturnValue(InteractionResult.PASS);
        }
    }

    @Inject(method = "attack", at = @At("HEAD"), cancellable = true)
    private void nursultan$noFriend(Player player, Entity entity, CallbackInfo ci) {
        if (ClientHooks.skipFriendAttack(entity) || ClientHooks.skipBot(entity)) {
            ci.cancel();
        }
    }

    @Inject(method = "continueDestroyBlock", at = @At("HEAD"))
    private void nursultan$noBreakDelay(net.minecraft.core.BlockPos pos, net.minecraft.core.Direction face, CallbackInfoReturnable<Boolean> cir) {
        Module delay = ClientHooks.module("nodelay");
        if (delay != null && delay.enabled && delay.setting("delays") && delay.setting("block-breaking")) {
            destroyDelay = 0;
        }
    }

    @Inject(method = "handleInventoryMouseClick", at = @At("HEAD"), cancellable = true)
    private void nursultan$lockSlots(int containerId, int slotId, int button, ClickType type, Player player, CallbackInfo ci) {
        Module lock = ClientHooks.module("lockslots");
        if (lock instanceof fun.nursultan.client.modules.player.LockSlots slots
                && slots.enabled && slots.setting("from-inventory") && slotId >= 36 && slotId <= 44
                && slots.locked(slotId - 36)) {
            ci.cancel();
        } else if (lock instanceof fun.nursultan.client.modules.player.LockSlots slots
                && slots.enabled && slots.setting("from-inventory") && slotId >= 0 && slotId <= 8
                && slots.locked(slotId)) {
            ci.cancel();
        }
    }
}
