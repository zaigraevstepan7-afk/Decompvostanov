package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.LivingEntity;

/** Restored from KDFzREm.Ub — fov / aim-range / speed */
public final class AimAssist extends Module {
    public AimAssist() {
        super("aimassist", "AimAssist", Category.COMBAT, "fighting", "KDFzREm.Ub", 37);
        bool("aim-range", true);
        bool("through-walls", false);
        bool("players", true);
        bool("mobs", false);
        number("fov", 90, 10, 180, 5);
        number("speed", 0.45F, 0.05F, 1.0F, 0.05F);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        LivingEntity target = Targeting.nearest(mc, setting("aim-range") ? 5.5 : 3.5, this);
        if (target == null) {
            return;
        }
        if (!setting("through-walls") && !mc.player.hasLineOfSight(target)) {
            return;
        }
        if (!Targeting.inFov(mc.player, target, numberValue("fov", 90))) {
            return;
        }
        float speed = numberValue("speed", 0.45F);
        float oldYaw = mc.player.getYRot();
        float oldPitch = mc.player.getXRot();
        AttackAura.aim(mc.player, target);
        mc.player.setYRot(oldYaw + (mc.player.getYRot() - oldYaw) * speed);
        mc.player.setXRot(oldPitch + (mc.player.getXRot() - oldPitch) * speed);
    }
}
