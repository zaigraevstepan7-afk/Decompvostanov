package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.modules.combat.Targeting;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.PV @UZ AutoDripstone */
public final class AutoDripstone extends Module {
    public AutoDripstone() {
        super("autodripstone", "AutoDripstone", Category.PLAYER, "auto", "KDFzREm.PV", 25);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null || mc.gameMode == null) {
            return;
        }
        LivingEntity target = Targeting.nearest(mc, 5);
        if (target == null) {
            return;
        }
        int slot = Inventories.findHotbar(mc.player.getInventory(), Items.POINTED_DRIPSTONE);
        if (slot < 0) {
            return;
        }
        int prev = mc.player.getInventory().getSelectedSlot();
        mc.player.getInventory().setSelectedSlot(slot);
        BlockPos above = target.blockPosition().above(2);
        if (mc.level.getBlockState(above).isAir()) {
            mc.gameMode.useItemOn(mc.player, InteractionHand.MAIN_HAND,
                    new BlockHitResult(Vec3.atCenterOf(above), Direction.DOWN, above, false));
        }
        mc.player.getInventory().setSelectedSlot(prev);
    }
}
