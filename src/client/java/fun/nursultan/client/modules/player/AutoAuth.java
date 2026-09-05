package fun.nursultan.client.modules.player;

import fun.nursultan.client.ClientSettings;
import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ChatLog;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.sT — password lives in preset via `.auth set`, never hardcoded. */
public final class AutoAuth extends Module {
    private boolean sent;

    public AutoAuth() {
        super("autoauth", "AutoAuth", Category.PLAYER, "auto", "KDFzREm.sT", 29);
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
                        "AutoAuth " + fun.nursultan.client.config.ConfigStore.file()), false);
            }
        }
    }

    @Override
    public void onTick(Minecraft mc) {
        if (!setting("password") || mc.player == null || mc.player.connection == null || sent) {
            return;
        }
        String secret = ClientSettings.autoAuthPassword;
        if (secret == null || secret.isBlank()) {
            return;
        }
        if (ChatLog.recentContains("/login") || ChatLog.recentContains("авториза") || ChatLog.recentContains("password")) {
            mc.player.connection.sendCommand("login " + secret);
            sent = true;
        }
    }
}
