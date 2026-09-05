package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.world.inventory.Slot;

/** Restored from KDFzREm.mc @UZ AuctionHelper */
public final class AuctionHelper extends Module {
    public AuctionHelper() {
        super("auctionhelper", "AuctionHelper", Category.MISC, "helper", "KDFzREm.mc", 77);
        bool("profitable-color", true);
        number("profitable-items-count", 6, 1, 27, 1);
        bool("open-auction-from-item", true);
        bool("show-item-price", true);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (!(mc.screen instanceof ContainerScreen) || mc.player == null || !setting("show-item-price")) {
            return;
        }
        int shown = 0;
        for (Slot slot : mc.player.containerMenu.slots) {
            if (slot.getItem().isEmpty()) {
                continue;
            }
            String hover = slot.getItem().getHoverName().getString();
            if (hover.matches(".*\\d+.*") || hover.contains("Цена") || hover.contains("¤")) {
                shown++;
            }
            if (shown >= numberValue("profitable-items-count", 6)) {
                break;
            }
        }
        g.drawString(mc.font, "auction " + shown, 8, 30, 0xFF9FCA2B, false);
    }
}
