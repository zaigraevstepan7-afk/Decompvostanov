package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.Tt @UZ Saturation */
public final class Saturation extends Module {
    public Saturation() {
        super("saturation", "Saturation", Category.VISUAL, "world", "KDFzREm.Tt", 30);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player != null && mc.options.gamma().get() < 1.2) {
            mc.options.gamma().set(1.2);
        }
    }
}
