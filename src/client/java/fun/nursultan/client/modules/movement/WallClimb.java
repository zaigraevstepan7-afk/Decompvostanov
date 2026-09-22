package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.Po @UZ WallClimb — mode / block */
public final class WallClimb extends Module {
    public WallClimb() {
        super("wallclimb", "WallClimb", Category.MOVEMENT, "base", "KDFzREm.Po", 18);
        bool("block", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || !mc.player.horizontalCollision) {
            return;
        }
        Vec3 v = mc.player.getDeltaMovement();
        mc.player.setDeltaMovement(v.x, setting("block") ? 0.28 : 0.2, v.z);
        mc.player.fallDistance = 0;
    }
}
