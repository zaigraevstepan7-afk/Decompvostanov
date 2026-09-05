package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

/** Restored from KDFzREm.WQ @UZ DeathCoords */
public final class DeathCoords extends Module {
    private boolean announced;

    public DeathCoords() {
        super("deathcoords", "DeathCoords", Category.MISC, "base", "KDFzREm.WQ", 20);
        bool("save-waypoint", true);
        bool("death-message", true);
        bool("death-waypoint", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        if (mc.player.isDeadOrDying()) {
            if (!announced && setting("death-message")) {
                String msg = "death-waypoint " + (int) mc.player.getX() + " " + (int) mc.player.getY() + " " + (int) mc.player.getZ();
                mc.player.displayClientMessage(Component.literal(msg), false);
                announced = true;
            }
        } else {
            announced = false;
        }
    }
}
