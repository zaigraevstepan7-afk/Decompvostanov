package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;

/** Restored from KDFzREm.Tb @UZ JumpEffect */
public final class JumpEffect extends Module {
    private boolean wasGround = true;

    public JumpEffect() {
        super("jumpeffect", "JumpEffect", Category.VISUAL, "world", "KDFzREm.Tb", 37);
        number("radius", 1, 0.2F, 4, 0.1F);
        number("wave-amplitude", 1, 0.2F, 3, 0.1F);
        bool("first-color", true);
        bool("second-color", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        if (wasGround && !mc.player.onGround()) {
            double r = numberValue("radius", 1);
            double amp = numberValue("wave-amplitude", 1);
            for (int i = 0; i < 12; i++) {
                double a = i * Math.PI / 6.0;
                mc.level.addParticle(
                        setting("first-color") ? ParticleTypes.CLOUD : ParticleTypes.SMOKE,
                        mc.player.getX() + Math.cos(a) * r,
                        mc.player.getY(),
                        mc.player.getZ() + Math.sin(a) * r,
                        0, 0.04 * amp, 0);
                if (setting("second-color")) {
                    mc.level.addParticle(
                            ParticleTypes.END_ROD,
                            mc.player.getX() + Math.cos(a) * r * 0.6,
                            mc.player.getY() + 0.1,
                            mc.player.getZ() + Math.sin(a) * r * 0.6,
                            0, 0.02 * amp, 0);
                }
            }
        }
        wasGround = mc.player.onGround();
    }
}
