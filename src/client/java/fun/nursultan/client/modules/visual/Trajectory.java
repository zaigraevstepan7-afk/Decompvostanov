package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.bh @UZ Trajectory */
public final class Trajectory extends Module {
    public Trajectory() {
        super("trajectory", "Trajectory", Category.VISUAL, "world", "KDFzREm.bh", 48);
        bool("predict-entity", true);
        bool("line-color", true);
        bool("hit-line-color", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        boolean thrower = mc.player.getMainHandItem().is(Items.ENDER_PEARL)
                || mc.player.getMainHandItem().is(Items.BOW)
                || mc.player.getMainHandItem().is(Items.TRIDENT)
                || mc.player.getMainHandItem().is(Items.SNOWBALL);
        if (!thrower) {
            return;
        }
        Vec3 pos = mc.player.getEyePosition();
        Vec3 vel = mc.player.getLookAngle().scale(1.5);
        for (int i = 0; i < 20; i++) {
            pos = pos.add(vel);
            vel = vel.add(0, -0.03, 0);
            mc.level.addParticle(ParticleTypes.CRIT, pos.x, pos.y, pos.z, 0, 0, 0);
        }
    }
}
