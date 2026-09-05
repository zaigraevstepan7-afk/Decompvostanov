package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Items;

/** Restored from KDFzREm.WO @UZ ElytraHelper */
public final class ElytraHelper extends Module {
    public ElytraHelper() {
        super("elytrahelper", "ElytraHelper", Category.MISC, "helper", "KDFzREm.WO", 41);
        bool("swap-key", true);
        bool("firework-key", true);
        bool("only-space", true);
        bool("auto-launch", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null) {
            return;
        }
        if (setting("auto-launch") && mc.options.keyJump.isDown() && mc.player.onGround()
                && mc.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
            mc.player.jumpFromGround();
        }
        if (setting("firework-key") && mc.player.isFallFlying() && (!setting("only-space") || mc.options.keyJump.isDown())) {
            int slot = Inventories.findHotbar(mc.player.getInventory(), Items.FIREWORK_ROCKET);
            if (slot >= 0) {
                int prev = mc.player.getInventory().getSelectedSlot();
                mc.player.getInventory().setSelectedSlot(slot);
                mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
                mc.player.getInventory().setSelectedSlot(prev);
            }
        }
    }
}
