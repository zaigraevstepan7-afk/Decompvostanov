package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.modules.combat.AttackAura;
import fun.nursultan.client.modules.combat.Targeting;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.Ps @UZ ElytraTarget */
public final class ElytraTarget extends Module {
    private int delay;

    public ElytraTarget() {
        super("elytratarget", "ElytraTarget", Category.MOVEMENT, "base", "KDFzREm.Ps", 37);
        number("chase-distance", 40, 8, 80, 2);
        number("overtake-distance", 6, 1, 20, 1);
        bool("auto-firework-use", true);
        bool("timing-firework-use", true);
        number("delay-ticks", 10, 1, 40, 1);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || !mc.player.isFallFlying() || mc.gameMode == null) {
            return;
        }
        LivingEntity target = Targeting.nearest(mc, numberValue("chase-distance", 40));
        if (target == null) {
            return;
        }
        AttackAura.aim(mc.player, target);
        Vec3 look = mc.player.getLookAngle().scale(1.15);
        mc.player.setDeltaMovement(look);
        if (mc.player.distanceTo(target) < numberValue("overtake-distance", 6)) {
            return;
        }
        if (setting("auto-firework-use") && ++delay >= numberValue("delay-ticks", 10)) {
            int slot = Inventories.findHotbar(mc.player.getInventory(), Items.FIREWORK_ROCKET);
            if (slot >= 0) {
                int prev = mc.player.getInventory().getSelectedSlot();
                mc.player.getInventory().setSelectedSlot(slot);
                mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
                mc.player.getInventory().setSelectedSlot(prev);
            }
            delay = 0;
        }
    }
}
