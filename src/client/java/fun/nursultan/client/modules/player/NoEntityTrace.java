package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Restored from KDFzREm.sN @UZ NoEntityTrace — GameRendererMixin */
public final class NoEntityTrace extends Module {
    public NoEntityTrace() {
        super("noentitytrace", "NoEntityTrace", Category.PLAYER, "base", "KDFzREm.sN", 17);
        bool("only-while-breaking", true);
    }
}
