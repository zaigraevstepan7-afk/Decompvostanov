package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.entity.projectile.throwableitemprojectile.AbstractThrownPotion;

/** Restored from KDFzREm.WJ @UZ PotionTracker */
public final class PotionTracker extends Module {
    public PotionTracker() {
        super("potiontracker", "PotionTracker", Category.MISC, "trackers", "KDFzREm.WJ", 43);
        bool("ignore-self", true);
        bool("ignore-common-splash-potions", false);
        bool("ft-bypass", false);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level == null || mc.player == null) {
            return;
        }
        int n = 0;
        for (var entity : mc.level.entitiesForRendering()) {
            if (!(entity instanceof AbstractThrownPotion potion)) {
                continue;
            }
            if (setting("ignore-self") && potion.getOwner() == mc.player) {
                continue;
            }
            n++;
        }
        g.drawString(mc.font, "splash " + n, 8, 52, 0xFF9FCA2B, false);
    }
}
