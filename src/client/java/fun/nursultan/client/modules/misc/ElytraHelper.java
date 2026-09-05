package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Items;

/** Restored from KDFzREm.WO @UZ ElytraHelper */
public final class ElytraHelper extends Module {
    public ElytraHelper() {
        super("elytrahelper", "ElytraHelper", Category.MISC, "helper", "KDFzREm.WO", 41);
        bool("swap-key", true);
        bool("firework-key", true);
        bool("only-space", true);
        bool("auto-launch", true);
        bool("disabled", false);
        bool("always", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null) {
            return;
        }
        if (setting("swap-key") && mc.options.keySwapOffhand.isDown()) {
            int chest = -1;
            boolean wearingElytra = mc.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA);
            for (int i = 0; i < 36; i++) {
                var stack = mc.player.getInventory().getItem(i);
                if (wearingElytra && stack.get(net.minecraft.core.component.DataComponents.EQUIPPABLE) != null
                        && !stack.is(Items.ELYTRA)) {
                    chest = i;
                    break;
                }
                if (!wearingElytra && stack.is(Items.ELYTRA)) {
                    chest = i;
                    break;
                }
            }
            if (chest >= 0) {
                Inventories.click(mc, Inventories.containerSlot(chest), 0, net.minecraft.world.inventory.ClickType.QUICK_MOVE);
            }
        }
        if (setting("auto-launch") && mc.options.keyJump.isDown() && mc.player.onGround()
                && mc.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
            mc.player.jumpFromGround();
        }
        if (setting("disabled")) {
            return;
        }
        if (setting("firework-key") && mc.player.isFallFlying() && (setting("always") || !setting("only-space") || mc.options.keyJump.isDown())) {
            int slot = Inventories.findHotbar(mc.player.getInventory(), Items.FIREWORK_ROCKET);
            if (slot >= 0) {
                int prev = mc.player.getInventory().getSelectedSlot();
                mc.player.getInventory().setSelectedSlot(slot);
                mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
                mc.player.getInventory().setSelectedSlot(prev);
            }
        }
    }
}
