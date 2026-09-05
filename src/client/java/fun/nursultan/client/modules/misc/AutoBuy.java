package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.inventory.Slot;

/** Restored from KDFzREm.WV @UZ AutoBuy */
public final class AutoBuy extends Module {
    private int delay;

    public AutoBuy() {
        super("autobuy", "AutoBuy", Category.MISC, "base", "KDFzREm.WV", 50);
        bool("buyer", true);
        bool("checker", false);
        bool("decrease-prices", true);
        bool("auto-parser", true);
        bool("auto-parser.complete", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (!(mc.screen instanceof ContainerScreen) || mc.player == null || mc.gameMode == null) {
            return;
        }
        if (++delay < 4) {
            return;
        }
        delay = 0;
        if (!setting("auto-parser") && !setting("buyer")) {
            return;
        }
        for (Slot slot : mc.player.containerMenu.slots) {
            if (slot.index >= 27 || slot.getItem().isEmpty()) {
                continue;
            }
            String name = slot.getItem().getHoverName().getString().toLowerCase();
            if (setting("checker") && !name.matches(".*\\d+.*")) {
                continue;
            }
            if (setting("decrease-prices") && name.contains("дорого")) {
                continue;
            }
            Inventories.click(mc, slot.index, 0, ClickType.PICKUP);
            if (setting("auto-parser.complete")) {
                return;
            }
        }
    }
}
