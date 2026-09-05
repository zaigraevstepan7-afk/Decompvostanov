package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.mD @UZ AirStuck / MOVEMENT / TOOLS */
public final class AirStuck extends Module {
    public AirStuck() {
        super("airstuck", "AirStuck", Category.MOVEMENT, "tools", "KDFzREm.mD", 23);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        mc.player.setDeltaMovement(0, 0, 0);
        mc.player.setNoGravity(true);
        mc.player.fallDistance = 0;
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            mc.player.setNoGravity(false);
        }
    }
}
