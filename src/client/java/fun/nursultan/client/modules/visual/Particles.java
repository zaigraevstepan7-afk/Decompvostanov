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
        float size = numberValue("size", 1);
        if (setting("critical-hit") && mc.player.swingTime == 1) {
            mc.level.addParticle(ParticleTypes.CRIT, mc.player.getX(), mc.player.getY() + 1, mc.player.getZ(), 0, 0.1 * size, 0);
        }
        if (setting("ambience") && mc.player.tickCount % 4 == 0) {
            mc.level.addParticle(
                    setting("hsv") ? ParticleTypes.END_ROD : ParticleTypes.CLOUD,
                    mc.player.getX() + (Math.random() - 0.5) * 2 * size,
                    mc.player.getY() + 0.2,
                    mc.player.getZ() + (Math.random() - 0.5) * 2 * size,
                    0, 0.02, 0);
        }
        if (setting("thrown-item")) {
            for (var entity : mc.level.getEntitiesOfClass(
                    net.minecraft.world.entity.item.ItemEntity.class, mc.player.getBoundingBox().inflate(16))) {
                mc.level.addParticle(ParticleTypes.CRIT, entity.getX(), entity.getY(), entity.getZ(), 0, 0.05, 0);
            }
        }
        if (setting("totem-popping") && mc.player.hurtTime == 9 && mc.player.getOffhandItem().isEmpty()) {
            for (int i = 0; i < 6; i++) {
                mc.level.addParticle(ParticleTypes.TOTEM_OF_UNDYING, mc.player.getX(), mc.player.getY() + 1, mc.player.getZ(), 0, 0.2, 0);
            }
        }
    }
}
