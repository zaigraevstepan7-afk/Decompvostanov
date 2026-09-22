package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.jo @UZ Cooldowns */
public final class Cooldowns extends Module {
    public Cooldowns() {
        super("cooldowns", "Cooldowns", Category.VISUAL, "interface", "KDFzREm.jo", 28);
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
        g.drawString(mc.font, "cd " + (int) (str * 100) + "%", width - 70, height - 40, str >= 1 ? fun.nursultan.client.ClientSettings.accent : 0xFFF2E9FF, false);
        if (!setting("render-on-items")) {
            return;
        }
        int x = width / 2 - 90;
        int y = height - 70;
        for (int i = 0; i < 9; i++) {
            var stack = mc.player.getInventory().getItem(i);
            if (stack.isEmpty() || !mc.player.getCooldowns().isOnCooldown(stack)) {
                continue;
            }
            float pct = mc.player.getCooldowns().getCooldownPercent(stack, 0);
            int shown = setting("99+") && pct > 0.99F ? 99 : (int) (pct * 100);
            g.fill(x + i * 20, y, x + i * 20 + 16, y + 16, 0x66000000);
            g.drawString(mc.font, Integer.toString(shown), x + i * 20 + 2, y + 4, 0xFFFFC107, false);
        }
    }
}
