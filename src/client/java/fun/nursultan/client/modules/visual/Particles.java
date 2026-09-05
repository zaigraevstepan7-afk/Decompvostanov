package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;

/** Restored from KDFzREm.bK @UZ Particles */
public final class Particles extends Module {
    public Particles() {
        super("particles", "Particles", Category.VISUAL, "world", "KDFzREm.bK", 49);
        bool("totem-popping", true);
        bool("thrown-item", true);
        bool("critical-hit", true);
        bool("color-selectable", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        if (setting("critical-hit") && mc.player.swingTime == 1) {
            mc.level.addParticle(ParticleTypes.CRIT, mc.player.getX(), mc.player.getY() + 1, mc.player.getZ(), 0, 0.1, 0);
        }
    }
}
