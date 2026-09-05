package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.Pl @UZ NoSlow */
public final class NoSlow extends Module {
    public NoSlow() {
        super("noslow", "NoSlow", Category.MOVEMENT, "base", "KDFzREm.Pl", 23);
        bool("vanilla", true);
        bool("spooky-time-duels", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || !mc.player.isUsingItem()) {
            return;
        }
        if (!setting("vanilla") && !setting("spooky-time-duels")) {
            return;
        }
        Vec3 v = mc.player.getDeltaMovement();
        float speed = fun.nursultan.client.util.ClientHooks.noSlowSpeed();
        if (Math.hypot(v.x, v.z) < 0.2 && (mc.options.keyUp.isDown() || mc.options.keyDown.isDown())) {
            double yaw = Math.toRadians(mc.player.getYRot());
            mc.player.setDeltaMovement(-Math.sin(yaw) * speed, v.y, Math.cos(yaw) * speed);
        }
    }
}
