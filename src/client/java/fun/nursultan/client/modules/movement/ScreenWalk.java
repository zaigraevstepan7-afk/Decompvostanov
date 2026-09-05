package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.ui.ClickGuiScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.Pi @UZ ScreenWalk — mode ft/matrix/hw/spooky/vanilla */
public final class ScreenWalk extends Module {
    public ScreenWalk() {
        super("screenwalk", "ScreenWalk", Category.MOVEMENT, "base", "KDFzREm.Pi", 28);
        bool("vanilla", true);
        bool("ft", false);
        bool("matrix", false);
        bool("spooky", false);
        bool("hw", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.screen == null || mc.screen instanceof ClickGuiScreen || mc.screen instanceof ChatScreen) {
            return;
        }
        double yaw = Math.toRadians(mc.player.getYRot());
        double speed = setting("hw") ? 0.18 : setting("vanilla") ? 0.22 : 0.16;
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
        if (mc.options.keyLeft.isDown()) {
            x += Math.cos(yaw) * speed;
            z += Math.sin(yaw) * speed;
        }
        if (mc.options.keyRight.isDown()) {
            x -= Math.cos(yaw) * speed;
            z -= Math.sin(yaw) * speed;
        }
        if (x == 0 && z == 0) {
            return;
        }
        Vec3 v = mc.player.getDeltaMovement();
        mc.player.setDeltaMovement(x, v.y, z);
        if (mc.options.keyJump.isDown() && mc.player.onGround()) {
            mc.player.jumpFromGround();
        }
    }
}
