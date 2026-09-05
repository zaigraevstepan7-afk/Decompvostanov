package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.Pg. */
public final class Speed extends Module {
    public Speed() {
        super("speed", "Speed", Category.MOVEMENT, "", "KDFzREm.Pg", 18);
        bool("speed-xz", true);
        bool("ground-only", false);
        bool("collision", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || !mc.player.onGround() && setting("ground-only")) {
            return;
        }
        if (setting("collision") && mc.player.horizontalCollision) {
            return;
        }
        if (!setting("speed-xz")) {
            return;
        }
        Vec3 v = mc.player.getDeltaMovement();
        double yaw = Math.toRadians(mc.player.getYRot());
        boolean moving = mc.options.keyUp.isDown()
                || mc.options.keyDown.isDown()
                || mc.options.keyLeft.isDown()
                || mc.options.keyRight.isDown();
        if (!moving) {
            return;
        }
        double speed = 0.36;
        mc.player.setDeltaMovement(-Math.sin(yaw) * speed, v.y, Math.cos(yaw) * speed);
    }
}
