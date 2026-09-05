package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.Wg @UZ IRC — local overlay only, no remote socket */
public final class IRC extends Module {
    public IRC() {
        super("irc", "IRC", Category.MISC, "client", "KDFzREm.Wg", 8);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        g.drawString(mc.font, "irc local", 8, height - 80, 0xFF9FCA2B, false);
    }
}
