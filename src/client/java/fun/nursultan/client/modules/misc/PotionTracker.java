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
        int y = 52;
        int n = 0;
        for (var entity : mc.level.entitiesForRendering()) {
            if (!(entity instanceof AbstractThrownPotion potion)) {
                continue;
            }
            if (setting("ignore-self") && potion.getOwner() == mc.player) {
                continue;
            }
            String hover = potion.getItem().getHoverName().getString();
            String lower = hover.toLowerCase();
            if (setting("ignore-common-splash-potions") && (lower.contains("water") || lower.contains("mundane")
                    || lower.contains("обычн") || lower.contains("вода") || lower.contains("splash potion"))) {
                continue;
            }
            if (setting("ft-bypass") && (lower.contains("funtime") || lower.contains("ft ") || lower.contains("донат"))) {
                continue;
            }
            // dump leftover WJ: "\n● "
            g.drawString(mc.font, "● " + hover, 8, y, fun.nursultan.client.ClientSettings.accent, false);
            y += 10;
            n++;
            if (n >= 6) {
                break;
            }
        }
        if (n == 0) {
            g.drawString(mc.font, "● 0", 8, 52, 0xFF8A8A96, false);
        }
    }
}
