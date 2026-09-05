package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.DeathScreen;

/** Restored from KDFzREm.PC @UZ AutoRespawn */
public final class AutoRespawn extends Module {
    public AutoRespawn() {
        super("autorespawn", "AutoRespawn", Category.PLAYER, "auto", "KDFzREm.PC", 27);
        bool("death-waypoint", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player != null && mc.screen instanceof DeathScreen) {
            mc.player.respawn();
            mc.setScreen(null);
        }
    }
}
