package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.Uv (104 methods). */
public final class AttackAura extends Module {
    public AttackAura() {
        super("attackaura", "AttackAura", Category.COMBAT, "fighting", "KDFzREm.Uv", 104);
        bool("aim-range", true);
        bool("through-walls", false);
        bool("critical-hit", true);
        bool("target-follow", true);
        bool("do-not-attack", false);
        bool("shield-break", false);
        bool("auto-mace", false);
        bool("move-correction", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (setting("do-not-attack") || mc.player == null || mc.level == null || mc.gameMode == null) {
            return;
        }
        LivingEntity target = Targeting.nearest(mc, 4.8);
        if (target == null) {
            return;
        }
        if (!setting("through-walls") && !mc.player.hasLineOfSight(target)) {
            return;
        }
        if (setting("critical-hit") && mc.player.getAttackStrengthScale(0.5F) < 0.92F) {
            return;
        }
        if (setting("target-follow") || setting("aim-range")) {
            aim(mc.player, target);
        }
        mc.gameMode.attack(mc.player, target);
        mc.player.swing(InteractionHand.MAIN_HAND);
    }

    public static void aim(Player player, LivingEntity target) {
        Vec3 eye = player.getEyePosition();
        Vec3 dest = target.getBoundingBox().getCenter();
        Vec3 d = dest.subtract(eye);
        double xz = Math.sqrt(d.x * d.x + d.z * d.z);
        float yaw = (float) (Math.toDegrees(Math.atan2(d.z, d.x)) - 90.0);
        float pitch = (float) (-Math.toDegrees(Math.atan2(d.y, xz)));
        player.setYRot(yaw);
        player.setXRot(pitch);
        player.yHeadRot = yaw;
    }
}
