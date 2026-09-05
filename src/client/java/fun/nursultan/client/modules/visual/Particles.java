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
        bool("ambience", false);
        bool("thrown-item", true);
        bool("critical-hit", true);
        bool("emitters", false);
        bool("color-selectable", false);
        bool("color-range", false);
        bool("pinch", false);
        bool("hsv", false);
        number("size", 1, 0.2F, 3, 0.1F);
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
