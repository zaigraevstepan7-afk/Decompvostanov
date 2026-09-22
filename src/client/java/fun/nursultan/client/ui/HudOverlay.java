package fun.nursultan.client.ui;

import fun.nursultan.client.module.Module;
import fun.nursultan.client.module.ModuleManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** In-game HUD reconstructed from KDFzREm.td — logo / hotkeys / potions / target / gps. */
public final class HudOverlay {
    private static final int TEXT = 0xFFF2E9FF;

    public static void render(GuiGraphics g) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || mc.options.hideGui || mc.screen instanceof ClickGuiScreen) {
            return;
        }
        int realW = mc.getWindow().getGuiScaledWidth();
        int realH = mc.getWindow().getGuiScaledHeight();
        float scale = fun.nursultan.client.ClientSettings.hudScale < 1.25F ? 1.0F
                : fun.nursultan.client.ClientSettings.hudScale < 1.75F ? 1.5F : 2.0F;
        var pose = g.pose();
        pose.pushMatrix();
        pose.scale(scale, scale);
        int w = (int) (realW / scale);
        int h = (int) (realH / scale);
        try {
            for (Module module : ModuleManager.INSTANCE.modules) {
                if (module.enabled) {
                    module.onHud(g, w, h);
                }
            }
            if (fun.nursultan.client.ClientSettings.snapGuides) {
                int cx = w / 2;
                int cy = h / 2;
                int guide = (fun.nursultan.client.ClientSettings.accent & 0x00FFFFFF) | 0x33000000;
                g.fill(cx - 1, 8, cx + 1, h - 8, guide);
                g.fill(8, cy - 1, w - 8, cy + 1, guide);
            }
            Module logo = ModuleManager.INSTANCE.byName("logo");
            if (logo != null && logo.enabled && logo.setting("details")) {
                g.drawString(mc.font, "Hud dumped " + fun.nursultan.client.ClientSettings.scaleKey(
                        fun.nursultan.client.ClientSettings.hudScale)
                        + " · " + ModuleManager.INSTANCE.modules.stream().filter(m -> m.enabled).count(), 6, 28, TEXT, false);
            }
        } finally {
            pose.popMatrix();
        }
    }

    private HudOverlay() {}
}
