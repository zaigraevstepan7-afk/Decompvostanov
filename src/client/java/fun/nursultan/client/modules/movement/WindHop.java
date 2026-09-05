package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.Items;

/** Restored from KDFzREm.PU @UZ WindHop */
public final class WindHop extends Module {
    public WindHop() {
        super("windhop", "WindHop", Category.MOVEMENT, "tools", "KDFzREm.PU", 36);
        bool("auto-jump", true);
        bool("jump-key", true);
        bool("combo-key", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null) {
            return;
        }
        if (setting("jump-key") && !mc.options.keyJump.isDown()) {
            return;
        }
        if (setting("auto-jump") && mc.player.onGround()) {
            mc.player.jumpFromGround();
        }
        int slot = Inventories.findHotbar(mc.player.getInventory(), Items.WIND_CHARGE);
        if (slot < 0) {
            return;
        }
        int prev = mc.player.getInventory().getSelectedSlot();
        mc.player.getInventory().setSelectedSlot(slot);
        if (mc.player.getDeltaMovement().y < 0.2 || setting("combo-key")) {
            mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
        }
        mc.player.getInventory().setSelectedSlot(prev);
    }
}
