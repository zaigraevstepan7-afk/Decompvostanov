package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.WK @UZ TickRateSync */
public final class TickRateSync extends Module {
    public TickRateSync() {
        super("tickratesync", "TickRateSync", Category.MISC, "base", "KDFzREm.WK", 11);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level != null) {
            float rate = mc.level.tickRateManager().tickrate();
            g.drawString(mc.font, String.format("tps %.1f", rate), 8, 64, 0xFFF2E9FF, false);
        }
    }
}
