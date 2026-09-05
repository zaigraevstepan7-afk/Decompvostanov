package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

/** Restored from KDFzREm.Uj — targets / critical-hit / reset-sprint / shield-break */
public final class TriggerBot extends Module {
    public TriggerBot() {
        super("triggerbot", "TriggerBot", Category.COMBAT, "fighting", "KDFzREm.Uj", 67);
        bool("critical-hit", true);
        bool("critical-always", false);
        bool("critical-disabled", false);
        bool("critical-only-space", false);
        bool("bot", false);
        bool("fast", false);
        bool("do-not-attack", false);
        bool("reset-sprint", false);
        bool("shield-break", false);
        bool("auto-mace", false);
        bool("players", true);
        bool("animals", false);
        bool("monsters", true);
        bool("villagers", false);
        bool("invisible", false);
        bool("naked", false);
        bool("targets", true);
        bool("target-condition", true);
        bool("disable", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (setting("disable") || setting("do-not-attack") || mc.player == null || mc.gameMode == null) {
            return;
        }
        if (!setting("targets")) {
            return;
        }
        if (!(mc.hitResult instanceof EntityHitResult hit) || mc.hitResult.getType() != HitResult.Type.ENTITY) {
            return;
        }
        Entity entity = hit.getEntity();
        if (!(entity instanceof LivingEntity living) || entity == mc.player) {
            return;
        }
        LivingEntity filtered = Targeting.nearest(mc, 6, this);
        if (filtered != living && !(living instanceof Player && setting("players"))) {
            return;
        }
        if (setting("target-condition") && living.getHealth() > mc.player.getHealth() + 8) {
            return;
        }
        if (setting("critical-disabled")) {
            // dump critical-disabled: skip crit gate
        } else if (setting("critical-always") || setting("critical-hit")) {
            if (setting("critical-only-space") && !mc.options.keyJump.isDown()) {
                return;
            }
            float need = setting("fast") ? 0.72F : 0.92F;
            if (!setting("critical-always") && mc.player.getAttackStrengthScale(0.5F) < need) {
                return;
            }
        } else if (setting("fast") && mc.player.getAttackStrengthScale(0) < 0.65F) {
            return;
        }
        if (setting("auto-mace")) {
            AttackAura.swapWeapon(mc, true);
        }
        if (setting("reset-sprint")) {
            mc.player.setSprinting(false);
        }
        mc.gameMode.attack(mc.player, entity);
        mc.player.swing(InteractionHand.MAIN_HAND);
        if (setting("shield-break") && living instanceof Player player && player.isBlocking()) {
            mc.gameMode.attack(mc.player, entity);
        }
    }
}
