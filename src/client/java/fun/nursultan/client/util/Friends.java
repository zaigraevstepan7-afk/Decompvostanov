package fun.nursultan.client.util;

import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;

/** Friend list used by NoFriendDamage / Targeting, same contract as dump. */
public final class Friends {
    private static final Set<String> NAMES = ConcurrentHashMap.newKeySet();

    public static void add(String name) {
        if (name != null && !name.isBlank()) {
            NAMES.add(name.toLowerCase(Locale.ROOT));
        }
    }

    public static void remove(String name) {
        if (name != null) {
            NAMES.remove(name.toLowerCase(Locale.ROOT));
        }
    }

    public static boolean isFriend(Entity entity) {
        if (!(entity instanceof Player player)) {
            return false;
        }
        return NAMES.contains(player.getGameProfile().name().toLowerCase(Locale.ROOT));
    }

    public static Set<String> all() {
        return NAMES;
    }

    private Friends() {}
}
