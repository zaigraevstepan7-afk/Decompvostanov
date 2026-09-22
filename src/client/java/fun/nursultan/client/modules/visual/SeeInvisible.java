package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.LivingEntity;

/** Restored from KDFzREm.TG @UZ SeeInvisible — opacity */
public final class SeeInvisible extends Module {
    public SeeInvisible() {
        super("seeinvisible", "SeeInvisible", Category.VISUAL, "world", "KDFzREm.TG", 20);
        number("opacity", 0.4F, 0.1F, 1.0F, 0.05F);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        for (LivingEntity entity : mc.level.getEntitiesOfClass(
                LivingEntity.class, mc.player.getBoundingBox().inflate(64), e -> e != mc.player)) {
            if (entity.isInvisible()) {
                entity.setInvisible(false);
                entity.setGlowingTag(numberValue("opacity", 0.4F) >= 0.35F);
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
                LivingEntity.class, mc.player.getBoundingBox().inflate(64), e -> true)) {
            entity.setGlowingTag(false);
        }
    }
}
