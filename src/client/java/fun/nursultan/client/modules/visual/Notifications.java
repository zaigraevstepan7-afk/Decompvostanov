package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.module.ModuleManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.jc @UZ Notifications */
public final class Notifications extends Module {
    public Notifications() {
        super("notifications", "Notifications", Category.VISUAL, "", "KDFzREm.jc", 29);
        bool("module-toggle", true);
        bool("armor-durability", true);
        bool("irc-ping", false);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) {
            return;
        }
        int y = 60;
        if (setting("module-toggle")) {
            long on = ModuleManager.INSTANCE.modules.stream().filter(m -> m.enabled).count();
            g.drawString(mc.font, "on " + on, width - 50, y, 0xFF9FCA2B, false);
        }
        if (setting("armor-durability")) {
            g.drawString(mc.font, "armor " + mc.player.getArmorValue(), width - 70, y + 10, 0xFFF2E9FF, false);
        }
    }
}
