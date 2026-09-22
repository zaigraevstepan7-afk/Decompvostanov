package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.Equippable;

/** Restored from KDFzREm.PK @UZ AutoArmor */
public final class AutoArmor extends Module {
    private int delay;

    public AutoArmor() {
        super("autoarmor", "AutoArmor", Category.PLAYER, "auto", "KDFzREm.PK", 31);
        number("delay-in-ticks", 2, 0, 20, 1);
        bool("swap-only-while-standing", false);
        bool("swap-only-while-inventory-open", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null) {
            return;
        }
        if (setting("swap-only-while-standing") && !mc.player.onGround()) {
            return;
        }
        if (setting("swap-only-while-inventory-open") && mc.screen == null) {
            return;
        }
        if (++delay < numberValue("delay-in-ticks", 2)) {
            return;
        }
        delay = 0;
        for (int i = 0; i < 36; i++) {
            ItemStack stack = mc.player.getInventory().getItem(i);
            Equippable equip = stack.get(net.minecraft.core.component.DataComponents.EQUIPPABLE);
            if (equip == null) {
                continue;
            }
            EquipmentSlot slot = equip.slot();
            if (slot.getType() != EquipmentSlot.Type.HUMANOID_ARMOR) {
                continue;
            }
            ItemStack worn = mc.player.getItemBySlot(slot);
            if (worn.isEmpty() || worn.getDamageValue() > stack.getDamageValue()) {
                Inventories.click(mc, Inventories.containerSlot(i), 0, ClickType.QUICK_MOVE);
                return;
            }
        }
    }
}
