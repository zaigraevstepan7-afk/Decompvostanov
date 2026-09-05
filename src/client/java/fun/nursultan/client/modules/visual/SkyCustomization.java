package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.jW @UZ SkyCustomization */
public final class SkyCustomization extends Module {
    public SkyCustomization() {
        super("skycustomization", "SkyCustomization", Category.VISUAL, "world", "KDFzREm.jW", 56);
        bool("chroma", false);
        bool("borealis", true);
        bool("aurora-first", true);
        bool("aurora-second", true);
        number("intensity", 1, 0.1F, 3, 0.1F);
        number("softness", 0.5F, 0.1F, 2, 0.1F);
        number("coverage", 1, 0.1F, 3, 0.1F);
        number("speed", 1, 0.1F, 4, 0.1F);
        bool("downscale", false);
        bool("_1x", true);
        bool("_2x", false);
        bool("_4x", false);
        bool("_8x", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.level != null && setting("aurora-first")) {
            float scale = 1;
            if (setting("downscale")) {
                if (setting("_8x")) {
                    scale = 0.125F;
                } else if (setting("_4x")) {
                    scale = 0.25F;
                } else if (setting("_2x")) {
                    scale = 0.5F;
                }
            }
            mc.level.setSkyFlashTime((int) (4 * numberValue("intensity", 1) * scale));
        }
    }
}
