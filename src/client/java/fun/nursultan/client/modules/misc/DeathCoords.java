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
            if (!announced) {
                int x = (int) mc.player.getX();
                int y = (int) mc.player.getY();
                int z = (int) mc.player.getZ();
                if (setting("death-message")) {
                    mc.player.displayClientMessage(Component.literal("death-waypoint " + x + " " + y + " " + z), false);
                }
                if (setting("save-waypoint") || setting("death-waypoint")) {
                    fun.nursultan.client.module.Module gps = fun.nursultan.client.module.ModuleManager.INSTANCE.byName("gps");
                    if (gps != null) {
                        gps.numbers.stream().filter(n -> n.id.equals("target-x")).findFirst().ifPresent(n -> n.value = x);
                        gps.numbers.stream().filter(n -> n.id.equals("target-z")).findFirst().ifPresent(n -> n.value = z);
                    }
                }
                announced = true;
            }
        } else {
            announced = false;
        }
    }
}
