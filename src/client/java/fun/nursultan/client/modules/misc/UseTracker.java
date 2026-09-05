package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.item.Items;

/** Restored from KDFzREm.mA @UZ UseTracker */
public final class UseTracker extends Module {
    private int totems;
    private int food;

    public UseTracker() {
        super("usetracker", "UseTracker", Category.MISC, "trackers", "KDFzREm.mA", 24);
        bool("totem-tracker", true);
        bool("food-tracker", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        if (setting("totem-tracker") && mc.player.getOffhandItem().is(Items.TOTEM_OF_UNDYING)) {
            totems = Math.max(totems, 1);
        }
        if (setting("food-tracker") && mc.player.isUsingItem() && fun.nursultan.client.util.Inventories.isFood(mc.player.getUseItem())) {
            food++;
        }
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        g.drawString(mc.font, "use t" + totems + " f" + food, 8, 76, 0xFFF2E9FF, false);
    }
}
