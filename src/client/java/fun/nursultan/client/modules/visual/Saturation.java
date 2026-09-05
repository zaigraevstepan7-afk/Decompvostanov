package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.Tt @UZ Saturation */
public final class Saturation extends Module {
    public Saturation() {
        super("saturation", "Saturation", Category.VISUAL, "world", "KDFzREm.Tt", 30);
        number("saturation", 1.2F, 0.2F, 3, 0.1F);
        number("alpha", 1, 0.1F, 1, 0.05F);
        bool("sky_protection", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player != null) {
            mc.options.gamma().set((double) numberValue("saturation", 1.2F));
        }
    }
}
