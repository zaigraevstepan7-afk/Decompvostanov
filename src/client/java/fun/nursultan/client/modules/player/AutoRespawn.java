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
            if (setting("death-waypoint")) {
                fun.nursultan.client.module.Module gps = fun.nursultan.client.module.ModuleManager.INSTANCE.byName("gps");
                if (gps != null) {
                    gps.numbers.stream().filter(n -> n.id.equals("target-x")).findFirst().ifPresent(n -> n.value = (float) mc.player.getX());
                    gps.numbers.stream().filter(n -> n.id.equals("target-z")).findFirst().ifPresent(n -> n.value = (float) mc.player.getZ());
                }
            }
            mc.player.respawn();
            mc.setScreen(null);
        }
    }
}
