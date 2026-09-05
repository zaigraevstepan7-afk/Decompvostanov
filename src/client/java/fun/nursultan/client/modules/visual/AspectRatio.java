package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Restored from KDFzREm.Tm @UZ AspectRatio */
public final class AspectRatio extends Module {
    public AspectRatio() {
        super("aspectratio", "AspectRatio", Category.VISUAL, "screen", "KDFzREm.Tm", 29);
        bool("aspect-ratio", true);
        number("custom-ratio", 1.7F, 0.5F, 3.0F, 0.05F);
    }
}
