package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.LivingEntity;

/** Restored from KDFzREm.bQ @UZ KillEffect */
public final class KillEffect extends Module {
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
        for (LivingEntity entity : mc.level.getEntitiesOfClass(LivingEntity.class, mc.player.getBoundingBox().inflate(16), e -> !e.isAlive() || e.getHealth() <= 0)) {
            if (entity != mc.player) {
                int n = (int) numberValue("count", 8);
                for (int i = 0; i < n; i++) {
                    mc.level.addParticle(ParticleTypes.TOTEM_OF_UNDYING, entity.getX(), entity.getY() + 1, entity.getZ(), 0, 0.2, 0);
                }
            }
        }
    }
}
