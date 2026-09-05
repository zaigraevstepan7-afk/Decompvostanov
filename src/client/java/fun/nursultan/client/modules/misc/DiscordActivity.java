package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.mu @UZ DiscordActivity — local presence text, no remote RPC */
public final class DiscordActivity extends Module {
    public DiscordActivity() {
        super("discordactivity", "DiscordActivity", Category.MISC, "", "KDFzREm.mu", 10);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            g.drawString(mc.font, "nursultan.fun", width - 90, 8, 0xFF5865F2, false);
        }
    }
}
