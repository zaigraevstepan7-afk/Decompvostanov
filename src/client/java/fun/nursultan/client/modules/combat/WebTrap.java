package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.Um @UZ WebTrap — place-key */
public final class WebTrap extends Module {
    public WebTrap() {
        super("webtrap", "WebTrap", Category.COMBAT, "tools", "KDFzREm.Um", 40);
        bool("place-key", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null || mc.gameMode == null) {
            return;
        }
        if (setting("place-key") && !mc.options.keyUse.isDown()) {
            return;
        }
        LivingEntity target = Targeting.nearest(mc, 4.5);
        if (target == null) {
            return;
        }
        int slot = Inventories.findHotbar(mc.player.getInventory(), Items.COBWEB);
        if (slot < 0) {
            return;
        }
        int prev = mc.player.getInventory().getSelectedSlot();
        mc.player.getInventory().setSelectedSlot(slot);
        BlockPos pos = target.blockPosition();
        if (mc.level.getBlockState(pos).isAir()) {
            BlockHitResult hit = new BlockHitResult(Vec3.atCenterOf(pos.below()), Direction.UP, pos.below(), false);
            mc.gameMode.useItemOn(mc.player, InteractionHand.MAIN_HAND, hit);
        }
        mc.player.getInventory().setSelectedSlot(prev);
    }
}
