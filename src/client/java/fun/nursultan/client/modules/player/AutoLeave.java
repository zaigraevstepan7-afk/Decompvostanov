package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.modules.combat.Targeting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

/** Restored from KDFzREm.sv @UZ AutoLeave — custom-command / player-nearby / was-in-pvp */
public final class AutoLeave extends Module {
    public AutoLeave() {
        super("autoleave", "AutoLeave", Category.PLAYER, "auto", "KDFzREm.sv", 31);
        bool("action", true);
        bool("hub", true);
        bool("spawn", false);
        bool("custom-command", false);
        bool("disconnect", true);
        bool("player-nearby", true);
        bool("was-in-pvp", true);
        number("health", 6, 1, 20, 1);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        boolean low = mc.player.getHealth() <= numberValue("health", 6);
        boolean pvp = !setting("was-in-pvp") || mc.player.getLastHurtByMob() != null;
        boolean nearby = !setting("player-nearby") || Targeting.hasOtherPlayer(mc, 12);
        if (!low || !pvp || !nearby) {
            return;
        }
        if (mc.player.connection != null && (setting("custom-command") || setting("hub") || setting("spawn"))) {
            mc.player.connection.sendCommand(setting("spawn") ? "spawn" : "hub");
        } else if (setting("disconnect")) {
            mc.disconnectFromWorld(Component.literal("AutoLeave"));
        }
        setEnabled(false);
    }
}
