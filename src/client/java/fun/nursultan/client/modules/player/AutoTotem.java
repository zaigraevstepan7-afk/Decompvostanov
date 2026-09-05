package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.projectile.arrow.ThrownTrident;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;

/** Restored from KDFzREm.sJ @UZ AutoTotem — health/crystal/tnt/trident/mace triggers */
public final class AutoTotem extends Module {
    public AutoTotem() {
        super("autototem", "AutoTotem", Category.PLAYER, "auto", "KDFzREm.sJ", 55);
        bool("health-trigger", true);
        bool("elytra-health-trigger", true);
        bool("crystal-trigger", true);
        bool("tnt-trigger", true);
        bool("falling-dripstone-trigger", true);
        bool("falling-trigger", true);
        bool("trident-trigger", true);
        bool("mace-smash-trigger", true);
        bool("triggers", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (!setting("triggers") || mc.player == null || mc.level == null) {
            return;
        }
        if (mc.player.getOffhandItem().is(Items.TOTEM_OF_UNDYING)) {
            return;
        }
        if (!shouldSwap(mc)) {
            return;
        }
        int slot = Inventories.find(mc.player.getInventory(), Items.TOTEM_OF_UNDYING);
        if (slot >= 0) {
            Inventories.swapOffhand(mc, slot);
        }
    }

    private boolean shouldSwap(Minecraft mc) {
        float health = mc.player.getHealth() + mc.player.getAbsorptionAmount();
        if (setting("health-trigger") && health <= 12.0F) {
            return true;
        }
        if (setting("elytra-health-trigger") && mc.player.isFallFlying() && health <= 16.0F) {
            return true;
        }
        if (setting("falling-trigger") && mc.player.fallDistance >= 6) {
            return true;
        }
        AABB box = mc.player.getBoundingBox().inflate(6);
        if (setting("crystal-trigger") && !mc.level.getEntitiesOfClass(EndCrystal.class, box).isEmpty()) {
            return true;
        }
        if (setting("tnt-trigger") && !mc.level.getEntitiesOfClass(PrimedTnt.class, box).isEmpty()) {
            return true;
        }
        if (setting("trident-trigger") && !mc.level.getEntitiesOfClass(ThrownTrident.class, box).isEmpty()) {
            return true;
        }
        if (setting("mace-smash-trigger")) {
            boolean smash = mc.level.players().stream().anyMatch(p ->
                    p != mc.player && p.distanceTo(mc.player) < 6 && p.getMainHandItem().is(Items.MACE) && p.fallDistance > 1.5F);
            if (smash) {
                return true;
            }
        }
        if (setting("falling-dripstone-trigger")) {
            BlockPos head = mc.player.blockPosition().above(2);
            for (int y = 0; y < 8; y++) {
                if (mc.level.getBlockState(head.above(y)).is(Blocks.POINTED_DRIPSTONE)) {
                    return true;
                }
            }
        }
        return false;
    }
}
