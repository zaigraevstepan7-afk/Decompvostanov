package fun.nursultan.client.util;

import fun.nursultan.client.module.Module;
import fun.nursultan.client.module.ModuleManager;
import java.util.ArrayDeque;
import java.util.Deque;
import net.minecraft.client.Minecraft;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket;
import net.minecraft.network.protocol.game.ServerboundMoveVehiclePacket;

/** Mixin-facing hooks for dump modules that cannot run as ticks alone. */
public final class ClientHooks {
    private static final Deque<Packet<?>> BLINK = new ArrayDeque<>();

    public static boolean enabled(String id) {
        Module module = ModuleManager.INSTANCE.byName(id);
        return module != null && module.enabled;
    }

    public static Module module(String id) {
        return ModuleManager.INSTANCE.byName(id);
    }

    public static boolean cancelOutgoing(Packet<?> packet) {
        if (!enabled("blink")) {
            return false;
        }
        if (packet instanceof ServerboundMovePlayerPacket || packet instanceof ServerboundMoveVehiclePacket) {
            BLINK.addLast(packet);
            return true;
        }
        return false;
    }

    public static void flushBlink(Connection connection) {
        while (!BLINK.isEmpty()) {
            connection.send(BLINK.removeFirst());
        }
    }

    public static void flushBlink() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null && mc.player.connection != null) {
            flushBlink(mc.player.connection.getConnection());
        }
        BLINK.clear();
    }

    public static int blinkSize() {
        return BLINK.size();
    }

    public static boolean ignoreServerLook() {
        return enabled("noserverrotation");
    }

    public static boolean skipEntityTrace() {
        if (!enabled("noentitytrace")) {
            return false;
        }
        Module module = module("noentitytrace");
        Minecraft mc = Minecraft.getInstance();
        if (module != null && module.setting("only-while-breaking") && mc.options != null && !mc.options.keyAttack.isDown()) {
            return false;
        }
        return true;
    }

    public static boolean skipBlockInteract() {
        if (!enabled("nointeract")) {
            return false;
        }
        Module module = module("nointeract");
        if (module != null && module.setting("aura-only") && !enabled("attackaura")) {
            return false;
        }
        return module == null || module.setting("block-interact") || !module.setting("aura-only");
    }

    public static boolean skipEntityInteract() {
        return enabled("nointeract") && (module("nointeract") == null || module("nointeract").setting("entity-interact") || true);
    }

    public static boolean skipFriendAttack(net.minecraft.world.entity.Entity entity) {
        return enabled("nofrienddamage") && Friends.isFriend(entity);
    }

    public static boolean skipBot(net.minecraft.world.entity.Entity entity) {
        if (!enabled("antibot") || !(entity instanceof net.minecraft.world.entity.player.Player player)) {
            return false;
        }
        String name = player.getGameProfile().name();
        return name == null || name.isBlank() || name.contains(" ") || name.length() > 16;
    }

    private ClientHooks() {}
}
