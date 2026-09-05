package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;

/** Restored from KDFzREm.TH @UZ BlockESP */
public final class BlockESP extends Module {
    public BlockESP() {
        super("blockesp", "BlockESP", Category.VISUAL, "world", "KDFzREm.TH", 66);
        bool("delta-mode", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        BlockPos feet = mc.player.blockPosition();
        int r = setting("delta-mode") ? 8 : 12;
        for (BlockPos pos : BlockPos.betweenClosed(feet.offset(-r, -4, -r), feet.offset(r, 4, r))) {
            var state = mc.level.getBlockState(pos);
            if (state.is(Blocks.CHEST) || state.is(Blocks.ENDER_CHEST) || state.is(Blocks.SPAWNER)
                    || state.is(Blocks.SHULKER_BOX) || state.is(Blocks.ANCIENT_DEBRIS)) {
                // world highlight via nearby entity glow is unavailable; mark via debug particles
                if (mc.player.tickCount % 20 == 0) {
                    mc.level.addParticle(net.minecraft.core.particles.ParticleTypes.END_ROD,
                            pos.getX() + 0.5, pos.getY() + 1.1, pos.getZ() + 0.5, 0, 0.02, 0);
                }
            }
        }
    }
}
