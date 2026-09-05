package fun.nursultan.client.util;

import fun.nursultan.client.ClientSettings;
import fun.nursultan.client.config.ConfigStore;
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
        return skipBlockInteract(null);
    }

    public static boolean skipBlockInteract(net.minecraft.world.phys.BlockHitResult hit) {
        if (!enabled("nointeract")) {
            return false;
        }
        Module module = module("nointeract");
        Minecraft mc = Minecraft.getInstance();
        if (module != null && module.setting("aura-only") && !enabled("attackaura")) {
            return false;
        }
        if (module != null && module.setting("pvp-only") && (mc.player == null || mc.player.getLastHurtByMob() == null)) {
            return false;
        }
        if (module != null && hit != null && mc.level != null) {
            var state = mc.level.getBlockState(hit.getBlockPos());
            if (matchNoInteract(module, state)) {
                return true;
            }
        }
        return module == null || module.setting("block-interact") || !module.setting("aura-only");
    }

    private static boolean matchNoInteract(Module module, net.minecraft.world.level.block.state.BlockState state) {
        if (module.setting("chest") && (state.is(net.minecraft.world.level.block.Blocks.CHEST) || state.is(net.minecraft.world.level.block.Blocks.TRAPPED_CHEST) || state.is(net.minecraft.world.level.block.Blocks.ENDER_CHEST))) {
            return true;
        }
        if (module.setting("furnace") && (state.is(net.minecraft.world.level.block.Blocks.FURNACE) || state.is(net.minecraft.world.level.block.Blocks.BLAST_FURNACE) || state.is(net.minecraft.world.level.block.Blocks.SMOKER))) {
            return true;
        }
        if (module.setting("hopper") && state.is(net.minecraft.world.level.block.Blocks.HOPPER)) {
            return true;
        }
        if (module.setting("anvil") && (state.is(net.minecraft.world.level.block.Blocks.ANVIL) || state.is(net.minecraft.world.level.block.Blocks.CHIPPED_ANVIL) || state.is(net.minecraft.world.level.block.Blocks.DAMAGED_ANVIL))) {
            return true;
        }
        if (module.setting("crafting-tables") && state.is(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)) {
            return true;
        }
        if (module.setting("enchant-tables") && state.is(net.minecraft.world.level.block.Blocks.ENCHANTING_TABLE)) {
            return true;
        }
        if (module.setting("brewing-stands") && state.is(net.minecraft.world.level.block.Blocks.BREWING_STAND)) {
            return true;
        }
        if (module.setting("barrel") && state.is(net.minecraft.world.level.block.Blocks.BARREL)) {
            return true;
        }
        if (module.setting("shulker") && state.getBlock().toString().contains("shulker")) {
            return true;
        }
        if (module.setting("bed") && state.is(net.minecraft.tags.BlockTags.BEDS)) {
            return true;
        }
        if (module.setting("signs") && (state.is(net.minecraft.tags.BlockTags.ALL_SIGNS) || state.is(net.minecraft.tags.BlockTags.SIGNS))) {
            return true;
        }
        if (module.setting("door") && state.is(net.minecraft.tags.BlockTags.DOORS)) {
            return true;
        }
        if (module.setting("trapdoor") && state.is(net.minecraft.tags.BlockTags.TRAPDOORS)) {
            return true;
        }
        if (module.setting("button") && state.is(net.minecraft.tags.BlockTags.BUTTONS)) {
            return true;
        }
        if (module.setting("lever") && state.is(net.minecraft.world.level.block.Blocks.LEVER)) {
            return true;
        }
        if (module.setting("note-block") && state.is(net.minecraft.world.level.block.Blocks.NOTE_BLOCK)) {
            return true;
        }
        if (module.setting("dispenser") && state.is(net.minecraft.world.level.block.Blocks.DISPENSER)) {
            return true;
        }
        if (module.setting("dropper") && state.is(net.minecraft.world.level.block.Blocks.DROPPER)) {
            return true;
        }
        return false;
    }

    public static boolean skipEntityInteract() {
        return enabled("nointeract") && (module("nointeract") == null || module("nointeract").setting("entity-interact") || true);
    }

    public static boolean skipFriendAttack(net.minecraft.world.entity.Entity entity) {
        if (!enabled("nofrienddamage")) {
            return false;
        }
        if (Friends.isFriend(entity)) {
            return true;
        }
        Module module = module("nofrienddamage");
        Minecraft mc = Minecraft.getInstance();
        return module != null && module.setting("teams")
                && mc.player != null && entity instanceof net.minecraft.world.entity.player.Player other
                && mc.player.isAlliedTo(other);
    }

    public static boolean skipBot(net.minecraft.world.entity.Entity entity) {
        if (!enabled("antibot") || !(entity instanceof net.minecraft.world.entity.player.Player player)) {
            return false;
        }
        String name = player.getGameProfile().name();
        return name == null || name.isBlank() || name.contains(" ") || name.length() > 16;
    }

    public static boolean cameraClip() {
        Module module = module("removals");
        return module != null && module.enabled && module.setting("camera-clip");
    }

    public static boolean removeScreenEffects() {
        Module module = module("removals");
        return module != null && module.enabled
                && (module.setting("fire-overlay") || module.setting("under-water-overlay") || module.setting("wall-overlay"));
    }

    public static boolean removeTotemPop() {
        Module module = module("removals");
        return module != null && module.enabled && module.setting("totem-pop");
    }

    public static boolean removeFog() {
        Module module = module("removals");
        return module != null && module.enabled && module.setting("fog");
    }

    public static org.joml.Vector4f fogColor(org.joml.Vector4f current) {
        if (removeFog()) {
            return new org.joml.Vector4f(current.x, current.y, current.z, 0);
        }
        Module fog = module("fog");
        if (fog != null && fog.enabled && fog.setting("color")) {
            int accent = fun.nursultan.client.ClientSettings.accent;
            return new org.joml.Vector4f(
                    ((accent >> 16) & 0xFF) / 255F,
                    ((accent >> 8) & 0xFF) / 255F,
                    (accent & 0xFF) / 255F,
                    current.w);
        }
        return current;
    }

    public static float aspectScale() {
        Module module = module("aspectratio");
        if (module == null || !module.enabled || !module.setting("aspect-ratio")) {
            return 1.0F;
        }
        float custom = module.numberValue("custom-ratio", 1.777F);
        if (module.setting("_16_9")) {
            custom = 16F / 9F;
        } else if (module.setting("_16_10")) {
            custom = 16F / 10F;
        } else if (module.setting("_21_9")) {
            custom = 21F / 9F;
        } else if (module.setting("_4_3")) {
            custom = 4F / 3F;
        }
        return custom <= 0.01F ? 1.0F : (16F / 9F) / custom;
    }

    public static boolean noSlow() {
        return enabled("noslow");
    }

    public static float noSlowSpeed() {
        Module module = module("noslow");
        return module != null && module.setting("spooky-time-duels") ? 0.28F : 0.22F;
    }

    public static boolean noEntityPush() {
        Module module = module("nopush");
        return module != null && module.enabled && module.setting("entity-push");
    }

    public static boolean freeLook() {
        return enabled("freelook");
    }

    public static net.minecraft.network.chat.Component filterChat(net.minecraft.network.chat.Component message) {
        Module stream = module("streamermode");
        if (stream == null || !stream.enabled || message == null) {
            return message;
        }
        String raw = message.getString();
        String lower = raw.toLowerCase();
        if (stream.setting("links") && lower.matches("(?s).*(t\\.me/|vk\\.|https?://|discord\\.gg|funtime\\.su|spookytime\\.net).*")) {
            return net.minecraft.network.chat.Component.literal("[hidden]");
        }
        if (stream.setting("staff") && lower.matches("(?s).*(admin|moder|helper|staff|хелпер|модер|админ|князь|титан|элита).*")) {
            return net.minecraft.network.chat.Component.literal("[staff]");
        }
        if ((stream.setting("ft") || stream.setting("funtime")) && raw.contains("Фортуны")) {
            return null;
        }
        return message;
    }

    public static boolean handleClientChat(String message) {
        if (message == null) {
            return false;
        }
        String t = message.trim();
        if (t.startsWith(".friend add ")) {
            Friends.add(t.substring(".friend add ".length()).trim());
            ConfigStore.save();
            return true;
        }
        if (t.startsWith(".friend del ")) {
            Friends.remove(t.substring(".friend del ".length()).trim());
            ConfigStore.save();
            return true;
        }
        if (t.equals(".auth clear")) {
            ClientSettings.autoAuthPassword = "";
            ConfigStore.save();
            return true;
        }
        if (t.startsWith(".auth set ")) {
            ClientSettings.autoAuthPassword = t.substring(".auth set ".length()).trim();
            ConfigStore.save();
            return true;
        }
        Module chat = module("chathelper");
        if (chat != null && chat.enabled && chat.setting("better-commands")) {
            Minecraft mc = Minecraft.getInstance();
            if (t.equals(".help") && mc.player != null) {
                mc.player.displayClientMessage(net.minecraft.network.chat.Component.literal(
                        ".friend add/del  .auth set/clear  .r  .gm"), false);
                return true;
            }
            if (t.startsWith(".r ") && mc.player != null && mc.player.connection != null) {
                String who = ChatLog.lastWhisper();
                if (!who.isBlank()) {
                    mc.player.connection.sendCommand("msg " + who + " " + t.substring(3));
                }
                return true;
            }
            if (t.startsWith(".gm ") && mc.player != null && mc.player.connection != null) {
                mc.player.connection.sendCommand("gamemode " + t.substring(4).trim());
                return true;
            }
        }
        return false;
    }

    private ClientHooks() {}
}
