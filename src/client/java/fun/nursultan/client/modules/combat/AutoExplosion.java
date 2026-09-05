package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.WZ @UZ AutoExplosion — any-item-click / reset-slot */
public final class AutoExplosion extends Module {
    public AutoExplosion() {
        super("autoexplosion", "AutoExplosion", Category.COMBAT, "fighting", "KDFzREm.WZ", 39);
        bool("crystals", true);
        bool("anchor", true);
        bool("any-item-click", false);
        bool("reset-slot", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null || mc.gameMode == null) {
            return;
        }
        BlockPos feet = mc.player.blockPosition();
        int crystal = setting("crystals") ? Inventories.findHotbar(mc.player.getInventory(), Items.END_CRYSTAL) : -1;
        int anchor = setting("anchor") ? Inventories.findHotbar(mc.player.getInventory(), Items.RESPAWN_ANCHOR) : -1;
        if (crystal < 0 && anchor < 0 && !setting("any-item-click")) {
            return;
        }
        int prev = mc.player.getInventory().getSelectedSlot();
        if (crystal >= 0) {
            mc.player.getInventory().setSelectedSlot(crystal);
        } else if (anchor >= 0) {
            mc.player.getInventory().setSelectedSlot(anchor);
        }
        for (BlockPos pos : BlockPos.betweenClosed(feet.offset(-3, -1, -3), feet.offset(3, 2, 3))) {
            if (mc.level.getBlockState(pos).is(Blocks.OBSIDIAN) || mc.level.getBlockState(pos).is(Blocks.BEDROCK)) {
                BlockHitResult hit = new BlockHitResult(Vec3.atCenterOf(pos), Direction.UP, pos, false);
                mc.gameMode.useItemOn(mc.player, InteractionHand.MAIN_HAND, hit);
                break;
            }
        }
        if (setting("reset-slot")) {
            mc.player.getInventory().setSelectedSlot(prev);
        }
    }
}
