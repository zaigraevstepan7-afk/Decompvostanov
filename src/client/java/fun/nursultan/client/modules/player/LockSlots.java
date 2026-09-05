package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Restored from KDFzREm.Pr @UZ LockSlots — slots _1.._7 + from-inventory */
public final class LockSlots extends Module {
    public LockSlots() {
        super("lockslots", "LockSlots", Category.PLAYER, "base", "KDFzREm.Pr", 32);
        bool("slots", true);
        bool("from-inventory", true);
        bool("_1", true);
        bool("_2", true);
        bool("_3", true);
        bool("_4", false);
        bool("_5", false);
        bool("_6", false);
        bool("_7", false);
        bool("_8", false);
        bool("_9", false);
    }

    public boolean locked(int hotbarSlot) {
        if (!enabled || !setting("slots") || hotbarSlot < 0 || hotbarSlot > 8) {
            return false;
        }
        String key = "_" + (hotbarSlot + 1);
        if (settings.stream().noneMatch(s -> s.id.equals(key))) {
            return setting("from-inventory");
        }
        return setting(key);
    }
}
