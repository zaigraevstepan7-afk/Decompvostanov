package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.WK @UZ TickRateSync */
public final class TickRateSync extends Module {
    public TickRateSync() {
        super("tickratesync", "TickRateSync", Category.MISC, "base", "KDFzREm.WK", 11);
        number("tick-rate", 20, 1, 20, 1);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.level == null) {
            return;
        }
        float want = Math.max(1.0F, numberValue("tick-rate", 20));
        if (Math.abs(mc.level.tickRateManager().tickrate() - want) > 0.05F) {
            mc.level.tickRateManager().setTickRate(want);
        }
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level != null) {
            mc.level.tickRateManager().setTickRate(20.0F);
        }
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level != null) {
            float rate = mc.level.tickRateManager().tickrate();
            float want = numberValue("tick-rate", 20);
            g.drawString(mc.font, String.format("tps %.1f / %.0f", rate, want), 8, 64, 0xFFF2E9FF, false);
        }
    }
}
