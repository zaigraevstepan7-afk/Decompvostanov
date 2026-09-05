package fun.nursultan.client.modules.player;

import fun.nursultan.client.ClientSettings;
import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ChatLog;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.sT — leftover auth / AutoAuth.json / password regex. */
public final class AutoAuth extends Module {
    /** Dump leftover from sT B[] — never invent a longer default. */
    public static final String PASSWORD = "^[^\\s]{1,16}$";
    private boolean sent;

    public AutoAuth() {
        super("autoauth", "AutoAuth", Category.PLAYER, "auto", "KDFzREm.sT", 29);
        bool("auth", true);
        bool("password", true);
        bool("open-path", false);
    }

    @Override
    public void onEnable() {
        sent = false;
        if (setting("open-path")) {
            Minecraft mc = Minecraft.getInstance();
            if (mc.player != null) {
                mc.player.displayClientMessage(net.minecraft.network.chat.Component.literal(
                        "AutoAuth.json " + fun.nursultan.client.config.ConfigStore.file()), false);
            }
        }
    }

    @Override
    public void onTick(Minecraft mc) {
        if (!setting("auth") || !setting("password") || mc.player == null || mc.player.connection == null || sent) {
            return;
        }
        String secret = ClientSettings.autoAuthPassword;
        if (secret == null || secret.isBlank() || !secret.matches(PASSWORD)) {
            return;
        }
        if (ChatLog.recentContains("/login") || ChatLog.recentContains("/l ")
                || ChatLog.recentContains("авториза") || ChatLog.recentContains("password")
                || ChatLog.recentContains("auth")) {
            mc.player.connection.sendCommand("login " + secret);
            sent = true;
        }
    }
}
