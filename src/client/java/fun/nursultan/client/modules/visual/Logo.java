package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Restored from KDFzREm.jV @UZ Logo — drawn in HudOverlay */
public final class Logo extends Module {
    public Logo() {
        super("logo", "Logo", Category.VISUAL, "", "KDFzREm.jV", 42);
        bool("fps", true);
        bool("ping", true);
        bool("coordinates", true);
    }
}
