package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.item.Items;

/** Restored from KDFzREm.Pc @UZ AutoFish */
public final class AutoFish extends Module {
    private int recast;

    public AutoFish() {
        super("autofish", "AutoFish", Category.PLAYER, "auto", "KDFzREm.Pc", 16);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null) {
            return;
        }
        if (!mc.player.getMainHandItem().is(Items.FISHING_ROD) && !mc.player.getOffhandItem().is(Items.FISHING_ROD)) {
            return;
        }
        FishingHook hook = mc.player.fishing;
        if (hook == null) {
            if (--recast <= 0) {
                mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
                recast = 10;
            }
            return;
        }
        if (hook.getHookedIn() != null || hook.isInWater() && hook.getDeltaMovement().y < -0.045) {
            mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
            recast = 8;
        }
    }
}
