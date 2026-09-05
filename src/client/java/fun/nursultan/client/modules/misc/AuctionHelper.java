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
        if (mc.player == null) {
            return;
        }
        if (setting("open-auction-from-item") && !(mc.screen instanceof ContainerScreen)
                && mc.player.isShiftKeyDown() && mc.options.keyUse.isDown() && !mc.player.getMainHandItem().isEmpty()
                && mc.player.tickCount % 40 == 0 && mc.player.connection != null) {
            mc.player.connection.sendCommand("ah " + mc.player.getMainHandItem().getHoverName().getString());
        }
        if (!(mc.screen instanceof ContainerScreen) || !setting("show-item-price")) {
            return;
        }
        int shown = 0;
        for (Slot slot : mc.player.containerMenu.slots) {
            if (slot.getItem().isEmpty()) {
                continue;
            }
            String hover = slot.getItem().getHoverName().getString();
            if (hover.matches(".*\\d+.*") || hover.contains("Цена") || hover.contains("Текущая цена")
                    || hover.contains("За штуку") || hover.contains("¤") || hover.contains("аукцион")) {
                shown++;
            }
            if (shown >= numberValue("profitable-items-count", 6)) {
                break;
            }
        }
        int color = setting("profitable-color") ? fun.nursultan.client.ClientSettings.accent : 0xFFF2E9FF;
        g.drawString(mc.font, "auction " + shown, 8, 30, color, false);
    }
}
