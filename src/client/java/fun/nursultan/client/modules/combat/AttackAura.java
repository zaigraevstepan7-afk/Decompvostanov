package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.Uv — ft/grim/spooky-time, fov, targets, critical-hit, shield-break. */
public final class AttackAura extends Module {
    public AttackAura() {
        super("attackaura", "AttackAura", Category.COMBAT, "fighting", "KDFzREm.Uv", 104);
        bool("aim-range", true);
        bool("through-walls", false);
        bool("always", false);
        bool("disabled", false);
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
        bool("fast", false);
        bool("strong", false);
        number("distance", 4.8F, 2, 8, 0.1F);
        bool("target-follow", true);
        bool("do-not-attack", false);
        bool("shield-break", false);
        bool("auto-mace", false);
        bool("move-correction", false);
        bool("ft", false);
        bool("grim", false);
        bool("spooky-time", false);
        bool("targets", true);
        bool("target-condition", true);
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
        if (!setting("targets")) {
            return;
        }
        double extra = numberValue("additional-range", 0.2F);
        if (setting("ft") || setting("grim")) {
            extra += 0.15;
        }
        if (setting("spooky-time")) {
            extra += 0.05;
        }
        if (setting("hw")) {
            extra += 0.35;
        }
        double range = numberValue("distance", 4.8F) + extra;
        if (setting("fast")) {
            range += 0.1;
        }
        if (setting("strong") && mc.player.getAttackStrengthScale(0) < 1) {
            return;
        }
        LivingEntity target = Targeting.nearest(mc, range, this);
        if (target == null) {
            return;
        }
        if (setting("target-condition")) {
            float minHealth = numberValue("health", 0);
            if (minHealth > 0 && target.getHealth() > minHealth) {
                return;
            }
            if (setting("smart") && target.getHealth() + target.getArmorValue() > mc.player.getHealth() + mc.player.getArmorValue() + 8) {
                return;
            }
        }
        boolean through = !setting("disabled") && (setting("always") || setting("through-walls"));
        if (!through && !setting("lite") && !mc.player.hasLineOfSight(target)) {
            return;
        }
        if (!setting("lite") && !Targeting.inFov(mc.player, target, numberValue("fov", 180))) {
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
            aim(mc.player, target, setting("noise"), setting("move-correction"));
        }
        if (setting("auto-mace") || setting("swap-damage")) {
            swapWeapon(mc, setting("auto-mace"));
        }
        mc.gameMode.attack(mc.player, target);
        mc.player.swing(InteractionHand.MAIN_HAND);
        if (setting("shield-break") && target instanceof Player player && player.isBlocking()) {
            mc.gameMode.attack(mc.player, target);
        }
    }

    public static void swapWeapon(Minecraft mc, boolean preferMace) {
        int best = -1;
        int rank = -1;
        for (int i = 0; i < 9; i++) {
            ItemStack stack = mc.player.getInventory().getItem(i);
            int next = weaponRank(stack, preferMace);
            if (next > rank) {
                rank = next;
                best = i;
            }
        }
        if (best >= 0) {
            mc.player.getInventory().setSelectedSlot(best);
        }
    }

    private static int weaponRank(ItemStack stack, boolean preferMace) {
        if (stack.isEmpty()) {
            return -1;
        }
        if (stack.is(Items.MACE)) {
            return preferMace ? 50 : 40;
        }
        String id = stack.getItem().getDescriptionId();
        if (id.contains("netherite_sword")) {
            return 35;
        }
        if (id.contains("diamond_sword")) {
            return 30;
        }
        if (id.contains("iron_sword") || id.contains("sword")) {
            return 20;
        }
        if (id.contains("axe")) {
            return 18;
        }
        if (stack.get(DataComponents.WEAPON) != null) {
            return 10;
        }
        return -1;
    }

    public static void aim(Player player, LivingEntity target) {
        aim(player, target, false, false);
    }

    public static void aim(Player player, LivingEntity target, boolean noise, boolean moveCorrection) {
        Vec3 eye = player.getEyePosition();
        Vec3 dest = target.getBoundingBox().getCenter();
        if (moveCorrection) {
            dest = dest.add(target.getDeltaMovement());
        }
        if (noise) {
            dest = dest.add((Math.random() - 0.5) * 0.18, (Math.random() - 0.5) * 0.08, (Math.random() - 0.5) * 0.18);
        }
        Vec3 d = dest.subtract(eye);
        double xz = Math.sqrt(d.x * d.x + d.z * d.z);
        float yaw = (float) (Math.toDegrees(Math.atan2(d.z, d.x)) - 90.0);
        float pitch = (float) (-Math.toDegrees(Math.atan2(d.y, xz)));
        player.setYRot(yaw);
        player.setXRot(pitch);
        player.yHeadRot = yaw;
    }
}
