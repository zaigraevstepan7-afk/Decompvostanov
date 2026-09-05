package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;

/** Restored from KDFzREm.js @UZ StreamerMode */
public final class StreamerMode extends Module {
    public StreamerMode() {
        super("streamermode", "StreamerMode", Category.VISUAL, "screen", "KDFzREm.js", 63);
        bool("skins", false);
        bool("name", true);
        bool("links", true);
        bool("ft", false);
        bool("funtime", false);
        bool("staff", false);
        bool("hide-entries", true);
        bool("custom-name", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        if (setting("custom-name")) {
            mc.player.setCustomName(Component.literal(setting("funtime") ? "FunTime" : "Nursultan"));
            mc.player.setCustomNameVisible(true);
        }
        if (setting("hide-entries")) {
            for (Player player : mc.level.players()) {
                if (player != mc.player) {
                    player.setCustomName(Component.literal("hidden"));
                    player.setCustomNameVisible(false);
                }
            }
        }
    }
}
