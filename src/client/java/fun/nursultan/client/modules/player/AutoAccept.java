package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ChatLog;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.Pq @UZ AutoAccept */
public final class AutoAccept extends Module {
    private int cool;

    public AutoAccept() {
        super("autoaccept", "AutoAccept", Category.PLAYER, "auto", "KDFzREm.Pq", 39);
        bool("teleport-request", true);
        bool("command-duel-request", true);
        bool("clan-invite-request", true);
        bool("friends-accept-only", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.player.connection == null || --cool > 0) {
            return;
        }
        if (setting("teleport-request") && (ChatLog.recentContains("телепорт") || ChatLog.recentContains("teleport") || ChatLog.recentContains("tpaccept"))) {
            mc.player.connection.sendCommand("tpaccept");
            cool = 40;
        }
        if (setting("command-duel-request") && (ChatLog.recentContains("дуэль") || ChatLog.recentContains("duel"))) {
            mc.player.connection.sendCommand("duel accept");
            cool = 40;
        }
        if (setting("clan-invite-request") && (ChatLog.recentContains("клан") || ChatLog.recentContains("clan"))) {
            mc.player.connection.sendCommand("clan accept");
            cool = 40;
        }
    }
}
