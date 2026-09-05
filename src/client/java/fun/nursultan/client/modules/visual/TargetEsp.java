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
    public void onHud(net.minecraft.client.gui.GuiGraphics g, int width, int height) {
        if (last == null) {
            return;
        }
        int color = setting("color") ? fun.nursultan.client.ClientSettings.accent : 0xFFFFFFFF;
        int size = setting("jello") ? 30 : setting("scan") ? 16 : 22;
        int cx = width / 2;
        int cy = height / 2;
        if (setting("scan")) {
            int pulse = (int) ((System.currentTimeMillis() / 40) % 24);
            size += pulse / 3;
        }
        g.fill(cx - size, cy - size, cx - size + 2, cy - size + 8, color);
        g.fill(cx - size, cy - size, cx - size + 8, cy - size + 2, color);
        g.fill(cx + size - 2, cy - size, cx + size, cy - size + 8, color);
        g.fill(cx + size - 8, cy - size, cx + size, cy - size + 2, color);
        g.fill(cx - size, cy + size - 8, cx - size + 2, cy + size, color);
        g.fill(cx - size, cy + size - 2, cx - size + 8, cy + size, color);
        g.fill(cx + size - 2, cy + size - 8, cx + size, cy + size, color);
        g.fill(cx + size - 8, cy + size - 2, cx + size, cy + size, color);
        if (setting("square") || setting("jello")) {
            g.fill(cx - size, cy - 1, cx + size, cy + 1, color & 0x55FFFFFF | 0x55000000);
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
