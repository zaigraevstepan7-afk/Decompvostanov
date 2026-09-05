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
            for (int i = 0; i < 8; i++) {
                mc.level.addParticle(ParticleTypes.CLOUD, mc.player.getX(), mc.player.getY(), mc.player.getZ(), 0, 0.05, 0);
            }
        }
        wasGround = mc.player.onGround();
    }
}
