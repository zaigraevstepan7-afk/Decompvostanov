package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.modules.combat.Targeting;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.Items;

/** Restored from KDFzREm.mO @UZ HolyHelper */
public final class HolyHelper extends Module {
    public HolyHelper() {
        super("holyhelper", "HolyHelper", Category.MISC, "helper", "KDFzREm.mO", 38);
        bool("explosive-stuff", true);
        bool("exp-bottle", true);
        bool("explosive-trap", true);
        bool("snow-ball", true);
        bool("show-stun-zone", true);
        bool("zone-color", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null || Targeting.nearest(mc, 5) == null) {
            return;
        }
        if (setting("snow-ball")) {
            int slot = Inventories.findHotbar(mc.player.getInventory(), Items.SNOWBALL);
            if (slot >= 0 && mc.options.keyUse.isDown()) {
                int prev = mc.player.getInventory().getSelectedSlot();
                mc.player.getInventory().setSelectedSlot(slot);
                mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
                mc.player.getInventory().setSelectedSlot(prev);
            }
        }
        if (setting("exp-bottle") && mc.player.getMainHandItem().is(Items.EXPERIENCE_BOTTLE) && mc.options.keyUse.isDown()) {
            mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
        }
    }
}
