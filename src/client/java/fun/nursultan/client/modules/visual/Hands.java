package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Restored from KDFzREm.bk @UZ Hands */
public final class Hands extends Module {
    public Hands() {
        super("hands", "Hands", Category.VISUAL, "world", "KDFzREm.bk", 29);
        bool("color-right", true);
        bool("color-left", true);
        bool("texture-mix", false);
    }
}
