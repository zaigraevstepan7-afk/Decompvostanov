package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.DisconnectedScreen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;

/** Restored from KDFzREm.PA @UZ AutoReconnect */
public final class AutoReconnect extends Module {
    private int ticks;

    public AutoReconnect() {
        super("autoreconnect", "AutoReconnect", Category.PLAYER, "auto", "KDFzREm.PA", 26);
        bool("auto-enable-auto-leave", false);
        number("delay", 40, 10, 200, 5);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (!(mc.screen instanceof DisconnectedScreen)) {
            ticks = 0;
            return;
        }
        if (++ticks < numberValue("delay", 40)) {
            return;
        }
        ticks = 0;
        if (setting("auto-enable-auto-leave")) {
            Module leave = fun.nursultan.client.module.ModuleManager.INSTANCE.byName("autoleave");
            if (leave != null) {
                leave.setEnabled(true);
            }
        }
        mc.setScreen(new JoinMultiplayerScreen(new TitleScreen()));
    }
}
