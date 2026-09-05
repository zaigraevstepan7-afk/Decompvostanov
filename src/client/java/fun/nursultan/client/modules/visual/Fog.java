package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.bm @UZ Fog */
public final class Fog extends Module {
    public Fog() {
        super("fog", "Fog", Category.VISUAL, "world", "KDFzREm.bm", 34);
        bool("color", true);
        bool("blur", false);
        number("distance", 192, 16, 512, 16);
        number("radius", 8, 1, 32, 1);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.level != null && setting("color")) {
            mc.level.setSkyFlashTime(0);
        }
    }
}
