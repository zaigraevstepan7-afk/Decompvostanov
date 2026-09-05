package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.Pz — slider {1.0, 0.1, 10.0, 0.05}. */
public final class Timer extends Module {
    public Timer() {
        super("timer", "Timer", Category.MOVEMENT, "base", "KDFzREm.Pz", 20);
        number("timer", 1.0F, 0.1F, 10.0F, 0.05F);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        float scale = numberValue("timer", 1.0F);
        if (scale == 1.0F) {
            return;
        }
        Vec3 v = mc.player.getDeltaMovement();
        mc.player.setDeltaMovement(v.x * scale, v.y, v.z * scale);
    }
}
