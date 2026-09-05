package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.AuctionPrices;
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
        boolean titled = AuctionPrices.auctionScreen(mc.screen.getTitle().getString());
        int shown = 0;
        int first = -1;
        for (Slot slot : mc.player.containerMenu.slots) {
            if (slot.getItem().isEmpty()) {
                continue;
            }
            int price = AuctionPrices.parse(AuctionPrices.blob(slot.getItem()));
            if (price < 0) {
                continue;
            }
            if (first < 0) {
                first = price;
            }
            shown++;
            if (shown >= numberValue("profitable-items-count", 6)) {
                break;
            }
        }
        if (shown == 0 && !titled) {
            return;
        }
        int color = setting("profitable-color") ? fun.nursultan.client.ClientSettings.accent : 0xFFF2E9FF;
        String line = AuctionPrices.format(first).replace("§a", "").replace("§f", "");
        g.drawString(mc.font, line + " " + shown, 8, 30, color, false);
    }
}
