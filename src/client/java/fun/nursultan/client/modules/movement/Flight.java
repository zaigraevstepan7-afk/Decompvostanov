package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.Pv @UZ Flight / MOVEMENT / BASE */
public final class Flight extends Module {
    public Flight() {
        super("flight", "Flight", Category.MOVEMENT, "base", "KDFzREm.Pv", 25);
        bool("multi-jump", true);
        bool("vanilla", true);
        bool("motion", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        Vec3 v = mc.player.getDeltaMovement();
        double y = 0;
        if (mc.options.keyJump.isDown()) {
            y = setting("multi-jump") ? 0.42 : 0.6;
        } else if (mc.options.keyShift.isDown()) {
            y = -0.42;
        }
        double yaw = Math.toRadians(mc.player.getYRot());
        double speed = setting("motion") ? 0.85 : 0.55;
        double x = 0;
        double z = 0;
        if (mc.options.keyUp.isDown()) {
            x -= Math.sin(yaw) * speed;
            z += Math.cos(yaw) * speed;
        }
        if (mc.options.keyDown.isDown()) {
            x += Math.sin(yaw) * speed;
            z -= Math.cos(yaw) * speed;
        }
        if (setting("vanilla")) {
            mc.player.getAbilities().flying = true;
        }
        mc.player.setDeltaMovement(x, y == 0 ? v.y * 0.6 : y, z);
        mc.player.fallDistance = 0;
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            mc.player.getAbilities().flying = mc.player.getAbilities().mayfly && mc.player.isCreative();
        }
    }
}
