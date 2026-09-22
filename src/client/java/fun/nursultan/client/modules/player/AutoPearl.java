package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.modules.combat.AttackAura;
import fun.nursultan.client.modules.combat.Targeting;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Items;

/** Restored from KDFzREm.PX @UZ AutoPearl — only-in-pvp / target-follow / min-distance */
public final class AutoPearl extends Module {
    public AutoPearl() {
        super("autopearl", "AutoPearl", Category.PLAYER, "auto", "KDFzREm.PX", 36);
        bool("only-in-pvp", true);
        bool("target-follow", true);
        number("threshold", 8, 1, 24, 1);
        number("min-distance", 6, 1, 24, 1);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null) {
            return;
        }
        if (setting("only-in-pvp") && mc.player.getLastHurtByMob() == null) {
            return;
        }
        LivingEntity target = Targeting.nearest(mc, 24);
        if (target == null) {
            return;
        }
        double min = Math.max(numberValue("min-distance", 6), numberValue("threshold", 8));
        if (mc.player.distanceTo(target) < min) {
            return;
        }
        int slot = Inventories.findHotbar(mc.player.getInventory(), Items.ENDER_PEARL);
        if (slot < 0) {
            return;
        }
        if (setting("target-follow")) {
            AttackAura.aim(mc.player, target);
        }
        int prev = mc.player.getInventory().getSelectedSlot();
        mc.player.getInventory().setSelectedSlot(slot);
        mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
        mc.player.getInventory().setSelectedSlot(prev);
    }
}
