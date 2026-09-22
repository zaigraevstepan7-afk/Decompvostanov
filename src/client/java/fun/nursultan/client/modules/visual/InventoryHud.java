package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.jK @UZ Inventory */
public final class InventoryHud extends Module {
    public InventoryHud() {
        super("inventory", "Inventory", Category.VISUAL, "interface", "KDFzREm.jK", 9);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) {
            return;
        }
        int empty = 0;
        int x = 8;
        int y = height - 70;
        for (int i = 0; i < 9; i++) {
            var stack = mc.player.getInventory().getItem(i);
            g.fill(x + i * 18, y, x + i * 18 + 16, y + 16, 0x66000000);
            if (!stack.isEmpty()) {
                g.renderItem(stack, x + i * 18, y);
            } else {
                empty++;
            }
        }
        for (int i = 9; i < 36; i++) {
            if (mc.player.getInventory().getItem(i).isEmpty()) {
                empty++;
            }
        }
        g.drawString(mc.font, "inv " + (36 - empty) + "/36", 8, height - 50, 0xFFF2E9FF, false);
    }
}
