package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ChatLog;
import fun.nursultan.client.util.Friends;
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
        bool("accept", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (!setting("accept") || mc.player == null || mc.player.connection == null || --cool > 0) {
            return;
        }
        if (setting("teleport-request") && friendOk("телепорт", "teleport", "tpaccept", "просит телепортироваться", "хочет телепортироваться")) {
            mc.player.connection.sendCommand("tpaccept");
            cool = 40;
        }
        if (setting("command-duel-request") && friendOk("дуэль", "duel", "дуэльную команду",
                "приглашает вас в свою дуэльную команду")) {
            mc.player.connection.sendCommand("duel accept");
            cool = 40;
        }
        if (setting("clan-invite-request") && friendOk("клан", "clan", "приглашает вас в клан", "приглашает Вас в клан",
                "[⚔]")) {
            mc.player.connection.sendCommand("clan accept");
            cool = 40;
        }
    }

    private boolean friendOk(String... needles) {
        boolean hit = false;
        for (String needle : needles) {
            if (ChatLog.recentContains(needle)) {
                hit = true;
                break;
            }
        }
        if (!hit) {
            return false;
        }
        if (!setting("friends-accept-only")) {
            return true;
        }
        for (String line : ChatLog.snapshot()) {
            String lower = line.toLowerCase();
            for (String friend : Friends.all()) {
                if (lower.contains(friend)) {
                    return true;
                }
            }
        }
        return false;
    }
}
