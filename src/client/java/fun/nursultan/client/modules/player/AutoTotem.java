package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.Items;

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
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        if (mc.player.getOffhandItem().is(Items.TOTEM_OF_UNDYING)) {
            return;
        }
        if (setting("health-trigger") && mc.player.getHealth() > 12.0F && mc.player.fallDistance < 6) {
            return;
        }
        int slot = Inventories.find(mc.player.getInventory(), Items.TOTEM_OF_UNDYING);
        if (slot >= 0) {
            Inventories.swapOffhand(mc, slot);
        }
    }
}
