package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ChatLog;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.sT @UZ AutoAuth — password is never hardcoded */
public final class AutoAuth extends Module {
    private boolean sent;

    public AutoAuth() {
        super("autoauth", "AutoAuth", Category.PLAYER, "auto", "KDFzREm.sT", 29);
        bool("open-path", false);
    }

    @Override
    public void onEnable() {
        sent = false;
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.player.connection == null || sent) {
            return;
        }
        if (ChatLog.recentContains("/login") || ChatLog.recentContains("авториза") || ChatLog.recentContains("password")) {
            mc.player.connection.sendCommand("login");
            sent = true;
        }
    }
}
