package fun.nursultan.client.ui;

import fun.nursultan.client.module.Module;
import fun.nursultan.client.module.ModuleManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** In-game HUD reconstructed from KDFzREm.td — logo / hotkeys / potions / target / gps. */
public final class HudOverlay {
    private static final int ACCENT = 0xFF9FCA2B;
    private static final int TEXT = 0xFFF2E9FF;

    public static void render(GuiGraphics g) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || mc.options.hideGui || mc.screen instanceof ClickGuiScreen) {
            return;
        }
        int w = mc.getWindow().getGuiScaledWidth();
        int h = mc.getWindow().getGuiScaledHeight();
        for (Module module : ModuleManager.INSTANCE.modules) {
            if (module.enabled) {
                module.onHud(g, w, h);
            }
        }
        Module logo = ModuleManager.INSTANCE.byName("logo");
        if (logo != null && logo.enabled && logo.setting("details")) {
            g.drawString(mc.font, "td · hud-scale " + fun.nursultan.client.ClientSettings.hudScale
                    + " · " + ModuleManager.INSTANCE.modules.stream().filter(m -> m.enabled).count(), 6, 28, TEXT, false);
        }
    }

    private HudOverlay() {}
}
