package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ChatLog;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;

/** Restored from KDFzREm.WC @UZ AutoJoin */
public final class AutoJoin extends Module {
    private int cool;

    public AutoJoin() {
        super("autojoin", "AutoJoin", Category.PLAYER, "auto", "KDFzREm.WC", 25);
        bool("spooky-time-duels", false);
        bool("really-world", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.player.connection == null || --cool > 0) {
            return;
        }
        if (mc.screen instanceof ContainerScreen) {
            return;
        }
        if (setting("spooky-time-duels") && ChatLog.recentContains("duel")) {
            mc.player.connection.sendCommand("duel");
            cool = 80;
        }
        if (setting("really-world")) {
            mc.player.connection.sendCommand("anarchy");
            cool = 80;
        }
    }
}
