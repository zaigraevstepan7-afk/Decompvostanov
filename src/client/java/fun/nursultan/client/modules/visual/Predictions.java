package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrowableItemProjectile;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.bx @UZ Predictions */
public final class Predictions extends Module {
    public Predictions() {
        super("predictions", "Predictions", Category.VISUAL, "world", "KDFzREm.bx", 40);
        bool("predict-entity", true);
        bool("line-color", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null || !setting("predict-entity")) {
            return;
        }
        for (var entity : mc.level.entitiesForRendering()) {
            if (entity instanceof ThrowableItemProjectile proj) {
                Vec3 p = proj.position().add(proj.getDeltaMovement().scale(8));
                mc.level.addParticle(ParticleTypes.CRIT, p.x, p.y, p.z, 0, 0, 0);
            }
        }
    }
}
