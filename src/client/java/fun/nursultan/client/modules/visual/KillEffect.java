package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.LivingEntity;

/** Restored from KDFzREm.bQ @UZ KillEffect */
public final class KillEffect extends Module {
    private final java.util.Set<Integer> seen = new java.util.HashSet<>();

    public KillEffect() {
        super("killeffect", "KillEffect", Category.VISUAL, "world", "KDFzREm.bQ", 47);
        bool("behind-walls", true);
        bool("color", true);
        number("count", 8, 1, 32, 1);
        number("duration", 20, 5, 80, 5);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        for (LivingEntity entity : mc.level.getEntitiesOfClass(LivingEntity.class, mc.player.getBoundingBox().inflate(24), e -> e != mc.player)) {
            if (entity.isAlive() && entity.getHealth() > 0) {
                seen.remove(entity.getId());
                continue;
            }
            if (!seen.add(entity.getId())) {
                continue;
            }
            if (!setting("behind-walls") && !mc.player.hasLineOfSight(entity)) {
                continue;
            }
            int n = (int) numberValue("count", 8);
            for (int i = 0; i < n; i++) {
                mc.level.addParticle(
                        setting("color") ? ParticleTypes.TOTEM_OF_UNDYING : ParticleTypes.SMOKE,
                        entity.getX(), entity.getY() + 1, entity.getZ(), 0, 0.2, 0);
            }
        }
    }
}
