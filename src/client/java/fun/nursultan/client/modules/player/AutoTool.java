package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

/** Restored from KDFzREm.PS @UZ AutoTool — hotbar-only */
public final class AutoTool extends Module {
    public AutoTool() {
        super("autotool", "AutoTool", Category.PLAYER, "auto", "KDFzREm.PS", 41);
        bool("hotbar-only", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null || !(mc.hitResult instanceof BlockHitResult hit)) {
            return;
        }
        if (hit.getType() != HitResult.Type.BLOCK || !mc.options.keyAttack.isDown()) {
            return;
        }
        BlockPos pos = hit.getBlockPos();
        BlockState state = mc.level.getBlockState(pos);
        int best = -1;
        float bestSpeed = 1.0F;
        int limit = setting("hotbar-only") ? 9 : 36;
        for (int i = 0; i < limit; i++) {
            ItemStack stack = mc.player.getInventory().getItem(i);
            float speed = stack.getDestroySpeed(state);
            if (speed > bestSpeed) {
                bestSpeed = speed;
                best = i;
            }
        }
        if (best >= 0 && best < 9) {
            mc.player.getInventory().setSelectedSlot(best);
        }
    }
}
