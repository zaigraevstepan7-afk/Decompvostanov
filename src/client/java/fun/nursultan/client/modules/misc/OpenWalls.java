package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.WI @UZ OpenWalls */
public final class OpenWalls extends Module {
    public OpenWalls() {
        super("openwalls", "OpenWalls", Category.MISC, "base", "KDFzREm.WI", 13);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player != null) {
            mc.player.noPhysics = true;
        }
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            mc.player.noPhysics = false;
        }
    }
}
