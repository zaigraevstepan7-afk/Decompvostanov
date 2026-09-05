package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.PY @UZ NoWeb */
public final class NoWeb extends Module {
    public NoWeb() {
        super("noweb", "NoWeb", Category.MOVEMENT, "tools", "KDFzREm.PY", 20);
        bool("really-world", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        Vec3 v = mc.player.getDeltaMovement();
        if (Math.abs(v.x) < 0.06 && Math.abs(v.z) < 0.06 && (mc.options.keyUp.isDown() || mc.options.keyDown.isDown())) {
            double yaw = Math.toRadians(mc.player.getYRot());
            mc.player.setDeltaMovement(-Math.sin(yaw) * 0.28, v.y, Math.cos(yaw) * 0.28);
        }
    }
}
