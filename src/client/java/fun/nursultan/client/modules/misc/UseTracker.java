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
    private boolean heldTotem;

    public UseTracker() {
        super("usetracker", "UseTracker", Category.MISC, "trackers", "KDFzREm.mA", 24);
        bool("totem-tracker", true);
        bool("food-tracker", true);
        bool("trackers", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (!setting("trackers") || mc.player == null) {
            return;
        }
        boolean holding = mc.player.getOffhandItem().is(Items.TOTEM_OF_UNDYING)
                || mc.player.getMainHandItem().is(Items.TOTEM_OF_UNDYING);
        if (setting("totem-tracker") && heldTotem && !holding && mc.player.hurtTime > 0) {
            totems++;
        }
        heldTotem = holding;
        if (setting("food-tracker") && mc.player.isUsingItem() && fun.nursultan.client.util.Inventories.isFood(mc.player.getUseItem())) {
            food++;
        }
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (!setting("trackers")) {
            return;
        }
        int y = 76;
        if (setting("totem-tracker")) {
            g.drawString(mc.font, "totem-tracker " + totems, 8, y, 0xFFF2E9FF, false);
            y += 10;
        }
        if (setting("food-tracker")) {
            g.drawString(mc.font, "food-tracker " + food, 8, y, 0xFFF2E9FF, false);
        }
    }
}
