package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ChatLog;
import fun.nursultan.client.util.Friends;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.Pq @UZ AutoAccept */
public final class AutoAccept extends Module {
    /** Dump leftover regexes from Pq B[]. */
    public static final String DUEL = "Игрок\\s+(\\S+)\\s+приглашает вас в свою дуэльную команду";
    public static final String CLAN = "\\[⚔]\\s*(\\S+)\\s+приглашает\\s+Вас\\s+в\\s+клан";
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
        if (setting("teleport-request") && acceptLine(new String[] {
                "телепорт", "teleport", "tpaccept", "/tpaccept",
                "просит телепортироваться", "хочет телепортироваться"
        }, null)) {
            mc.player.connection.sendCommand("tpaccept");
            cool = 40;
        }
        if (setting("command-duel-request") && acceptLine(new String[] {
                "дуэль", "duel", "дуэльную команду", "приглашает вас в свою дуэльную команду"
        }, DUEL)) {
            mc.player.connection.sendCommand("duel accept");
            cool = 40;
        }
        if (setting("clan-invite-request") && acceptLine(new String[] {
                "клан", "clan", "приглашает вас в клан", "приглашает Вас в клан", "[⚔]"
        }, CLAN)) {
            mc.player.connection.sendCommand("clan accept");
            cool = 40;
        }
    }

    private boolean acceptLine(String[] needles, String regex) {
        String line = ChatLog.consumeFirst(needles, regex);
        if (line == null) {
            return false;
        }
        if (!setting("friends-accept-only")) {
            return true;
        }
        if (regex != null) {
            Matcher matcher = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE).matcher(line);
            if (matcher.find()) {
                return Friends.named(matcher.group(1));
            }
        }
        return Friends.namedIn(line);
    }
}
