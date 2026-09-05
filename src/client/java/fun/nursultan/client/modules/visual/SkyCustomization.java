package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.jW @UZ SkyCustomization */
public final class SkyCustomization extends Module {
    public SkyCustomization() {
        super("skycustomization", "SkyCustomization", Category.VISUAL, "world", "KDFzREm.jW", 56);
        bool("aurora-first", true);
        bool("aurora-second", true);
        number("intensity", 1, 0.1F, 3, 0.1F);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.level != null && setting("aurora-first")) {
            mc.level.setSkyFlashTime((int) (4 * numberValue("intensity", 1)));
        }
    }
}
