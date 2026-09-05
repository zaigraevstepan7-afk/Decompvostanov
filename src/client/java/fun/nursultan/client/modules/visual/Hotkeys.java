package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.module.ModuleManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.jq @UZ Hotkeys */
public final class Hotkeys extends Module {
    public Hotkeys() {
        super("hotkeys", "Hotkeys", Category.VISUAL, "", "KDFzREm.jq", 9);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        int y = 40;
        for (var module : ModuleManager.INSTANCE.modules) {
            if (!module.enabled || module.bind.isBlank()) {
                continue;
            }
            g.drawString(mc.font, module.bind + " " + module.name, 8, y, 0xFFF2E9FF, false);
            y += 10;
            if (y > 140) {
                break;
            }
        }
    }
}
