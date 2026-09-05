package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Blocks;

/** Restored from KDFzREm.sL @UZ Nuker */
public final class Nuker extends Module {
    public Nuker() {
        super("nuker", "Nuker", Category.PLAYER, "base", "KDFzREm.sL", 40);
        bool("break-only-allowed-blocks", false);
        bool("break-only-in-selection", false);
        bool("nuker.allowed-blocks-empty", true);
        number("height-range", 2, 1, 5, 1);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null || mc.gameMode == null) {
            return;
        }
        if (setting("break-only-in-selection") && mc.hitResult instanceof net.minecraft.world.phys.BlockHitResult hit
                && hit.getType() == net.minecraft.world.phys.HitResult.Type.BLOCK) {
            var state = mc.level.getBlockState(hit.getBlockPos());
            if (!state.isAir() && !state.is(Blocks.BEDROCK)) {
                mc.gameMode.startDestroyBlock(hit.getBlockPos(), hit.getDirection());
                mc.gameMode.continueDestroyBlock(hit.getBlockPos(), hit.getDirection());
            }
            return;
        }
        int h = (int) numberValue("height-range", 2);
        BlockPos feet = mc.player.blockPosition();
        for (BlockPos pos : BlockPos.betweenClosed(feet.offset(-2, 0, -2), feet.offset(2, h, 2))) {
            var state = mc.level.getBlockState(pos);
            if (state.isAir() || state.is(Blocks.BEDROCK) || state.is(Blocks.BARRIER)) {
                continue;
            }
            if (setting("break-only-allowed-blocks") && !(state.is(Blocks.NETHERRACK) || state.is(Blocks.STONE) || state.is(Blocks.DIRT))) {
                continue;
            }
            mc.gameMode.startDestroyBlock(pos.immutable(), Direction.UP);
            mc.gameMode.continueDestroyBlock(pos.immutable(), Direction.UP);
            return;
        }
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        if (!setting("nuker.allowed-blocks-empty") || !setting("break-only-allowed-blocks")) {
            return;
        }
        Minecraft mc = Minecraft.getInstance();
        if (mc.font == null) {
            return;
        }
        g.drawString(mc.font, "nuker.allowed-blocks-empty", 8, height - 50, 0xFFFFC107, false);
    }
}
