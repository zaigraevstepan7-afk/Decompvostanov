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
        bool("pearl", true);
        bool("trident", true);
        bool("bow", true);
        bool("potions", true);
        bool("crossbow", true);
        bool("snowball", true);
        bool("windcharge", true);
        bool("predict-entity", true);
        bool("line-color", true);
        bool("hit-line-color", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        var hand = mc.player.getMainHandItem();
        boolean thrower = setting("pearl") && hand.is(Items.ENDER_PEARL)
                || setting("bow") && hand.is(Items.BOW)
                || setting("trident") && hand.is(Items.TRIDENT)
                || setting("snowball") && hand.is(Items.SNOWBALL)
                || setting("crossbow") && hand.is(Items.CROSSBOW)
                || setting("potions") && (hand.is(Items.SPLASH_POTION) || hand.is(Items.LINGERING_POTION))
                || setting("windcharge") && hand.is(Items.WIND_CHARGE);
        if (!thrower) {
            return;
        }
        Vec3 pos = mc.player.getEyePosition();
        Vec3 vel = mc.player.getLookAngle().scale(1.5);
        for (int i = 0; i < 20; i++) {
            pos = pos.add(vel);
            vel = vel.add(0, -0.03, 0);
            var type = setting("hit-line-color") && i > 16 ? ParticleTypes.FLAME
                    : setting("line-color") ? ParticleTypes.CRIT : ParticleTypes.SMOKE;
            mc.level.addParticle(type, pos.x, pos.y, pos.z, 0, 0, 0);
        }
    }
}
