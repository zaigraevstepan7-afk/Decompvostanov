package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.LivingEntity;

/** Restored from KDFzREm.Ub (37 methods). */
public final class AimAssist extends Module {
    public AimAssist() {
        super("aimassist", "AimAssist", Category.COMBAT, "fighting", "KDFzREm.Ub", 37);
        bool("aim-range", true);
        bool("through-walls", false);
        bool("pvp-only", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        LivingEntity target = Targeting.nearest(mc, 5.5);
        if (target == null) {
            return;
        }
        if (!setting("through-walls") && !mc.player.hasLineOfSight(target)) {
            return;
        }
        AttackAura.aim(mc.player, target);
    }
}
