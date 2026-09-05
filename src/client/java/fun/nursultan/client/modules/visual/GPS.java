package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.bw @UZ GPS */
public final class GPS extends Module {
    public GPS() {
        super("gps", "GPS", Category.VISUAL, "", "KDFzREm.bw", 40);
        number("target-x", 0, -30000, 30000, 10);
        number("target-z", 0, -30000, 30000, 10);
        bool("clear-target", false);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || setting("clear-target")) {
            return;
        }
        double dx = numberValue("target-x", 0) - mc.player.getX();
        double dz = numberValue("target-z", 0) - mc.player.getZ();
        g.drawString(mc.font, String.format("gps %.0f", Math.hypot(dx, dz)), width / 2 - 20, 18, 0xFF9FCA2B, false);
    }
}
