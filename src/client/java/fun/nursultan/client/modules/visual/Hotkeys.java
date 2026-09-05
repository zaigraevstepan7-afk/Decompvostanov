package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.module.ModuleManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.jq @UZ Hotkeys */
public final class Hotkeys extends Module {
    public Hotkeys() {
        super("hotkeys", "Hotkeys", Category.VISUAL, "interface", "KDFzREm.jq", 9);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        int y = 40;
        for (var module : ModuleManager.INSTANCE.modules) {
            if (!module.enabled || module.bind.isBlank()) {
                continue;
            }
            int accent = fun.nursultan.client.ClientSettings.accent;
            int bw = Math.max(18, mc.font.width(module.bind) + 8);
            g.fill(8, y - 2, 8 + bw, y + 12, 0xFF2A2A30);
            g.fill(8, y - 2, 9, y + 12, accent);
            g.drawString(mc.font, module.bind, 12, y, 0xFF8A8A96, false);
            g.drawString(mc.font, module.name, 12 + bw, y, 0xFFF2E9FF, false);
            y += 10;
            if (y > 140) {
                break;
            }
        }
    }
}
