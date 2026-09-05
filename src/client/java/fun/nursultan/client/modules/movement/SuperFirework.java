package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.PZ @UZ SuperFirework */
public final class SuperFirework extends Module {
    public SuperFirework() {
        super("superfirework", "SuperFirework", Category.MOVEMENT, "tools", "KDFzREm.PZ", 18);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null || !mc.player.isFallFlying()) {
            return;
        }
        int slot = Inventories.findHotbar(mc.player.getInventory(), Items.FIREWORK_ROCKET);
        if (slot < 0) {
            return;
        }
        int prev = mc.player.getInventory().getSelectedSlot();
        mc.player.getInventory().setSelectedSlot(slot);
        mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
        mc.player.getInventory().setSelectedSlot(prev);
        Vec3 look = mc.player.getLookAngle();
        mc.player.setDeltaMovement(look.x * 1.6, look.y * 1.6, look.z * 1.6);
    }
}
