package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.AABB;

/** Restored from KDFzREm.mr @UZ EdgeJump / MOVEMENT / TOOLS */
public final class EdgeJump extends Module {
    public EdgeJump() {
        super("edgejump", "EdgeJump", Category.MOVEMENT, "tools", "KDFzREm.mr", 13);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null || !mc.player.onGround()) {
            return;
        }
        AABB box = mc.player.getBoundingBox().move(0, -0.05, 0);
        BlockPos below = BlockPos.containing(mc.player.getX(), mc.player.getY() - 0.1, mc.player.getZ());
        if (mc.level.getBlockState(below).isAir() && mc.level.noCollision(mc.player, box)) {
            mc.player.jumpFromGround();
        }
    }
}
