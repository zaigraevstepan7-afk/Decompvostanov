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
        var inWeb = mc.level != null && (mc.level.getBlockState(mc.player.blockPosition()).is(net.minecraft.world.level.block.Blocks.COBWEB)
                || mc.level.getBlockState(mc.player.blockPosition().above()).is(net.minecraft.world.level.block.Blocks.COBWEB));
        if (!inWeb && !setting("really-world")) {
            return;
        }
        Vec3 v = mc.player.getDeltaMovement();
        if (Math.abs(v.x) < 0.08 && Math.abs(v.z) < 0.08 && (mc.options.keyUp.isDown() || mc.options.keyDown.isDown())) {
            double yaw = Math.toRadians(mc.player.getYRot());
            mc.player.setDeltaMovement(-Math.sin(yaw) * 0.28, v.y, Math.cos(yaw) * 0.28);
        }
    }
}
