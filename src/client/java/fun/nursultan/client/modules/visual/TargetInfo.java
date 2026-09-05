package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.modules.combat.Targeting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.entity.LivingEntity;

/** Restored from KDFzREm.jH @UZ TargetInfo */
public final class TargetInfo extends Module {
    public TargetInfo() {
        super("targetinfo", "TargetInfo", Category.VISUAL, "", "KDFzREm.jH", 26);
        bool("show-from-mouse", true);
        bool("show-armor-details", true);
        bool("show-absorption", true);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        LivingEntity target = Targeting.nearest(mc, 24);
        if (target == null) {
            return;
        }
        int x = width / 2 - 60;
        int y = height / 2 + 24;
        g.fill(x, y, x + 120, y + 28, 0xE00E0E12);
        g.drawString(mc.font, target.getName().getString(), x + 4, y + 4, 0xFFF2E9FF, false);
        g.drawString(mc.font, String.format("hp %.1f", target.getHealth() + (setting("show-absorption") ? target.getAbsorptionAmount() : 0)), x + 4, y + 14, 0xFF9FCA2B, false);
    }
}
