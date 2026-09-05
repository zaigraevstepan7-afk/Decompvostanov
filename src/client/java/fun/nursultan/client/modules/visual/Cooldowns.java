package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.jo @UZ Cooldowns */
public final class Cooldowns extends Module {
    public Cooldowns() {
        super("cooldowns", "Cooldowns", Category.VISUAL, "", "KDFzREm.jo", 28);
        bool("render-on-items", true);
        bool("inventory-only", false);
        bool("99+", true);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || (setting("inventory-only") && mc.screen == null)) {
            return;
        }
        float str = mc.player.getAttackStrengthScale(0.0F);
        g.drawString(mc.font, "cd " + (int) (str * 100) + "%", width - 70, height - 40, str >= 1 ? 0xFF9FCA2B : 0xFFF2E9FF, false);
    }
}
