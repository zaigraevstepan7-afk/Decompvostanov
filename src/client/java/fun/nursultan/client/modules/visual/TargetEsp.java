package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.modules.combat.Targeting;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.LivingEntity;

/** Restored from KDFzREm.jY @UZ TargetEsp — square/jello/scan */
public final class TargetEsp extends Module {
    private LivingEntity last;

    public TargetEsp() {
        super("targetesp", "TargetEsp", Category.VISUAL, "world", "KDFzREm.jY", 36);
        bool("square", true);
        bool("jello", false);
        bool("scan", false);
        bool("color", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (last != null) {
            last.setGlowingTag(false);
            last = null;
        }
        if (mc.player == null || mc.level == null) {
            return;
        }
        LivingEntity target = Targeting.nearest(mc, 24);
        if (target != null) {
            target.setGlowingTag(true);
            last = target;
        }
    }

    @Override
    public void onDisable() {
        if (last != null) {
            last.setGlowingTag(false);
            last = null;
        }
    }
}
