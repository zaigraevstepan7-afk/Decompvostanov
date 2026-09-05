package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.Ww @UZ BypassHealth */
public final class BypassHealth extends Module {
    public BypassHealth() {
        super("bypasshealth", "BypassHealth", Category.MISC, "base", "KDFzREm.Ww", 8);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            g.drawString(mc.font, String.format("hp %.2f", mc.player.getHealth()), width / 2 + 10, height / 2 + 8, 0xFFFF5555, false);
        }
    }
}
