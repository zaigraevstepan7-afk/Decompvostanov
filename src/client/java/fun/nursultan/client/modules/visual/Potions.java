package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.effect.MobEffectInstance;

/** Restored from KDFzREm.je @UZ Potions */
public final class Potions extends Module {
    public Potions() {
        super("potions", "Potions", Category.VISUAL, "interface", "KDFzREm.je", 10);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) {
            return;
        }
        int y = 80;
        for (MobEffectInstance effect : mc.player.getActiveEffects()) {
            g.drawString(mc.font, effect.getEffect().unwrapKey().map(k -> k.identifier().getPath()).orElse("effect") + " " + (effect.getDuration() / 20), width - 120, y, 0xFFF2E9FF, false);
            y += 10;
        }
    }
}
