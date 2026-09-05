package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Restored from KDFzREm.TY @UZ ViewModel */
public final class ViewModel extends Module {
    public ViewModel() {
        super("viewmodel", "ViewModel", Category.VISUAL, "world", "KDFzREm.TY", 27);
        number("right-hand-x", 0, -2, 2, 0.05F);
        number("right-hand-y", 0, -2, 2, 0.05F);
        number("right-hand-z", 0, -2, 2, 0.05F);
        number("right-scale", 1, 0.2F, 2, 0.05F);
        number("left-hand-x", 0, -2, 2, 0.05F);
        number("left-hand-y", 0, -2, 2, 0.05F);
        number("left-hand-z", 0, -2, 2, 0.05F);
        number("left-scale", 1, 0.2F, 2, 0.05F);
    }
}
