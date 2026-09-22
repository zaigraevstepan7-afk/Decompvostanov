package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.mh @UZ AutoJump */
public final class AutoJump extends Module {
    public AutoJump() {
        super("autojump", "AutoJump", Category.MOVEMENT, "tools", "KDFzREm.mh", 12);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player != null && mc.player.onGround()
                && (mc.options.keyUp.isDown() || mc.options.keyDown.isDown()
                || mc.options.keyLeft.isDown() || mc.options.keyRight.isDown())) {
            mc.player.jumpFromGround();
        }
    }
}
