package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.Uv — ft/grim/spooky-time, fov, targets, critical-hit, shield-break. */
public final class AttackAura extends Module {
    public AttackAura() {
        super("attackaura", "AttackAura", Category.COMBAT, "fighting", "KDFzREm.Uv", 104);
        bool("aim-range", true);
        bool("through-walls", false);
        bool("critical-hit", true);
        bool("critical-always", false);
        bool("critical-disabled", false);
        bool("critical-only-space", false);
        bool("increase-crit-accuracy", false);
        bool("sprint-mode", false);
        bool("swap-damage", false);
        bool("sort", false);
        bool("lite", false);
        bool("noise", false);
        bool("hw", false);
        bool("smart", false);
        bool("target-follow", true);
        bool("do-not-attack", false);
        bool("shield-break", false);
        bool("auto-mace", false);
        bool("move-correction", false);
        bool("ft", false);
        bool("grim", false);
        bool("spooky-time", false);
        bool("players", true);
        bool("mobs", true);
        bool("villagers", false);
        bool("naked", false);
        bool("invisible", false);
        bool("bot", false);
        number("fov", 180, 10, 360, 5);
        number("additional-range", 0.2F, 0, 2, 0.1F);
        number("health", 0, 0, 20, 1);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (setting("do-not-attack") || mc.player == null || mc.level == null || mc.gameMode == null) {
            return;
        }
        double extra = numberValue("additional-range", 0.2F);
        if (setting("ft") || setting("grim")) {
            extra += 0.15;
        }
        if (setting("spooky-time")) {
            extra += 0.05;
        }
        double range = 4.8 + extra;
        LivingEntity target = Targeting.nearest(mc, range, this);
        if (target == null) {
            return;
        }
        float minHealth = numberValue("health", 0);
        if (minHealth > 0 && target.getHealth() > minHealth) {
            return;
        }
        if (!setting("through-walls") && !mc.player.hasLineOfSight(target)) {
            return;
        }
        if (!Targeting.inFov(mc.player, target, numberValue("fov", 180))) {
            return;
        }
        if (setting("critical-disabled")) {
            // dump critical-disabled: skip crit gate
        } else if (setting("critical-always") || setting("critical-hit")) {
            if (setting("critical-only-space") && !mc.options.keyJump.isDown()) {
                return;
            }
            if (setting("increase-crit-accuracy") && (mc.player.onGround() || mc.player.fallDistance < 0.08F)) {
                return;
            }
            if (!setting("critical-always") && mc.player.getAttackStrengthScale(0.5F) < 0.92F) {
                return;
            }
        }
        if (setting("sprint-mode")) {
            mc.player.setSprinting(true);
        }
        if (setting("target-follow") || setting("aim-range")) {
            aim(mc.player, target);
        }
        if (setting("auto-mace")) {
            for (int i = 0; i < 9; i++) {
                if (mc.player.getInventory().getItem(i).is(Items.MACE)) {
                    mc.player.getInventory().setSelectedSlot(i);
                    break;
                }
            }
        }
        mc.gameMode.attack(mc.player, target);
        mc.player.swing(InteractionHand.MAIN_HAND);
        if (setting("shield-break") && target instanceof Player player && player.isBlocking()) {
            mc.gameMode.attack(mc.player, target);
        }
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
