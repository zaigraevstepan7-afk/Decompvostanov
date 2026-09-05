package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

/** Restored from KDFzREm.Uj (67 methods). */
public final class TriggerBot extends Module {
    public TriggerBot() {
        super("triggerbot", "TriggerBot", Category.COMBAT, "fighting", "KDFzREm.Uj", 67);
        bool("critical-hit", true);
        bool("do-not-attack", false);
        bool("reset-sprint", false);
        bool("shield-break", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (setting("do-not-attack") || mc.player == null || mc.gameMode == null) {
            return;
        }
        if (!(mc.hitResult instanceof EntityHitResult hit) || mc.hitResult.getType() != HitResult.Type.ENTITY) {
            return;
        }
        Entity entity = hit.getEntity();
        if (!(entity instanceof LivingEntity) || entity == mc.player) {
            return;
        }
        if (setting("critical-hit") && mc.player.getAttackStrengthScale(0.5F) < 0.92F) {
            return;
        }
        if (setting("reset-sprint")) {
            mc.player.setSprinting(false);
        }
        mc.gameMode.attack(mc.player, entity);
        mc.player.swing(InteractionHand.MAIN_HAND);
    }
}
