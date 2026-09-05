package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Restored from KDFzREm.Ty @UZ NoInteract — MultiPlayerGameModeMixin */
public final class NoInteract extends Module {
    public NoInteract() {
        super("nointeract", "NoInteract", Category.PLAYER, "base", "KDFzREm.Ty", 59);
        bool("aura-only", false);
        bool("pvp-only", false);
        bool("dont-place-orbs", true);
        bool("block-interact", true);
        bool("note-block", true);
        bool("enchant-tables", true);
        bool("brewing-stands", true);
        bool("crafting-tables", true);
        bool("entity-interact", true);
        bool("armor-stand", true);
    }
}
