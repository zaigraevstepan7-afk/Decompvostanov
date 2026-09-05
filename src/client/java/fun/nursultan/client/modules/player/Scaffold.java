package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.TM @UZ Scaffold — telly/grim/basic, auto-jump, safe-walk, save-y */
public final class Scaffold extends Module {
    private double savedY = Double.NaN;

    public Scaffold() {
        super("scaffold", "Scaffold", Category.PLAYER, "base", "KDFzREm.TM", 36);
        bool("auto-jump", false);
        bool("safe-walk", true);
        bool("save-y", true);
        bool("telly", false);
        bool("grim", false);
    }

    @Override
    public void onEnable() {
        savedY = Double.NaN;
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null || mc.gameMode == null) {
            return;
        }
        if (Double.isNaN(savedY)) {
            savedY = Math.floor(mc.player.getY());
        }
        if (setting("auto-jump") && mc.player.onGround()) {
            mc.player.jumpFromGround();
        }
        if (setting("safe-walk")) {
            mc.player.setShiftKeyDown(true);
        }
        int slot = findBlock(mc);
        if (slot < 0) {
            return;
        }
        int prev = mc.player.getInventory().getSelectedSlot();
        mc.player.getInventory().setSelectedSlot(slot);
        double y = setting("save-y") ? savedY - 1 : mc.player.getY() - 1;
        BlockPos pos = BlockPos.containing(mc.player.getX(), y, mc.player.getZ());
        if (mc.level.getBlockState(pos).isAir()) {
            BlockHitResult hit = new BlockHitResult(Vec3.atCenterOf(pos), Direction.UP, pos, false);
            mc.gameMode.useItemOn(mc.player, InteractionHand.MAIN_HAND, hit);
        }
        mc.player.getInventory().setSelectedSlot(prev);
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            mc.player.setShiftKeyDown(false);
        }
    }

    private static int findBlock(Minecraft mc) {
        for (int i = 0; i < 9; i++) {
            ItemStack stack = mc.player.getInventory().getItem(i);
            if (stack.getItem() instanceof BlockItem) {
                return i;
            }
        }
        return -1;
    }
}
