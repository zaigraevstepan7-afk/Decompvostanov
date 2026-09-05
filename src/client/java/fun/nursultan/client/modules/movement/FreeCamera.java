package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.PN @UZ FreeCamera */
public final class FreeCamera extends Module {
    private Vec3 origin;

    public FreeCamera() {
        super("freecamera", "FreeCamera", Category.MOVEMENT, "tools", "KDFzREm.PN", 39);
        number("speed-xz", 0.8F, 0.1F, 3.0F, 0.1F);
        number("speed-y", 0.6F, 0.1F, 3.0F, 0.1F);
        bool("walk-by-click", false);
        bool("show-camera-position", true);
    }

    @Override
    public void onEnable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            origin = mc.player.position();
            mc.player.noPhysics = true;
            mc.player.setInvisible(true);
        }
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            mc.player.noPhysics = false;
            mc.player.setInvisible(false);
            if (origin != null) {
                mc.player.setPos(origin.x, origin.y, origin.z);
            }
        }
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        mc.player.noPhysics = true;
        double yaw = Math.toRadians(mc.player.getYRot());
        double speed = numberValue("speed-xz", 0.8F);
        double y = 0;
        if (mc.options.keyJump.isDown()) {
            y = numberValue("speed-y", 0.6F);
        } else if (mc.options.keyShift.isDown()) {
            y = -numberValue("speed-y", 0.6F);
        }
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
        mc.player.setDeltaMovement(x, y, z);
        mc.player.fallDistance = 0;
    }

    @Override
    public void onHud(net.minecraft.client.gui.GuiGraphics g, int width, int height) {
        if (!setting("show-camera-position")) {
            return;
        }
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) {
            return;
        }
        g.drawString(mc.font, String.format("cam %.1f %.1f %.1f", mc.player.getX(), mc.player.getY(), mc.player.getZ()), 8, height - 20, 0xFF9FCA2B, false);
    }
}
