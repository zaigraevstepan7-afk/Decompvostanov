package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.LivingEntity;

/** Restored from KDFzREm.Ta (72 methods). */
public final class EntityESP extends Module {
    public EntityESP() {
        super("entityesp", "EntityESP", Category.VISUAL, "screen", "KDFzREm.Ta", 72);
        bool("through-walls", true);
        bool("health-bar", true);
        bool("box-color", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        for (LivingEntity entity : mc.level.getEntitiesOfClass(
                LivingEntity.class, mc.player.getBoundingBox().inflate(80), e -> e != mc.player && e.isAlive())) {
            entity.setGlowingTag(true);
            if (setting("health-bar")) {
                entity.setCustomNameVisible(true);
            }
        }
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level == null || mc.player == null) {
            return;
        }
        for (LivingEntity entity : mc.level.getEntitiesOfClass(
                LivingEntity.class, mc.player.getBoundingBox().inflate(80), e -> true)) {
            entity.setGlowingTag(false);
        }
    }
}
