package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Restored from KDFzREm.Pr @UZ LockSlots — enforced in MultiPlayerGameModeMixin */
public final class LockSlots extends Module {
    public LockSlots() {
        super("lockslots", "LockSlots", Category.PLAYER, "base", "KDFzREm.Pr", 32);
        bool("from-inventory", true);
    }
}
