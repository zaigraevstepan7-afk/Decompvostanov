package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;

/** Restored from KDFzREm.jQ @UZ Tracers */
public final class Tracers extends Module {
    public Tracers() {
        super("tracers", "Tracers", Category.VISUAL, "screen", "KDFzREm.jQ", 23);
        bool("players", true);
        bool("friends", true);
        bool("entities", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        if (setting("players")) {
            for (Player player : mc.level.players()) {
                if (player != mc.player) {
                    player.setGlowingTag(true);
                }
            }
        }
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level == null) {
            return;
        }
        for (Player player : mc.level.players()) {
            player.setGlowingTag(false);
        }
    }
}
