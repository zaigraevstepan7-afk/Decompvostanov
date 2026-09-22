package fun.nursultan.client.util;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public final class Inventories {
    public static int find(Inventory inv, Item item) {
        for (int i = 0; i < inv.getContainerSize(); i++) {
            if (inv.getItem(i).is(item)) {
                return i;
            }
        }
        return -1;
    }

    public static int findHotbar(Inventory inv, Item item) {
        for (int i = 0; i < 9; i++) {
            if (inv.getItem(i).is(item)) {
                return i;
            }
        }
        return -1;
    }

    /** Player-inventory index 0-8 hotbar, 9-35 main → container slot. */
    public static int containerSlot(int inventoryIndex) {
        if (inventoryIndex >= 0 && inventoryIndex < 9) {
            return inventoryIndex + 36;
        }
        return inventoryIndex;
    }

    public static boolean click(Minecraft mc, int containerSlot, int button, ClickType type) {
        if (mc.gameMode == null || mc.player == null) {
            return false;
        }
        mc.gameMode.handleInventoryMouseClick(
                mc.player.containerMenu.containerId, containerSlot, button, type, mc.player);
        return true;
    }

    public static boolean swapOffhand(Minecraft mc, int inventoryIndex) {
        return click(mc, containerSlot(inventoryIndex), 40, ClickType.SWAP);
    }

    public static boolean isFood(ItemStack stack) {
        return !stack.isEmpty() && stack.get(net.minecraft.core.component.DataComponents.FOOD) != null;
    }

    private Inventories() {}
}
