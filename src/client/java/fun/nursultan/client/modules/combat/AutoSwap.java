package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

/** Restored from KDFzREm.sY @UZ AutoSwap */
public final class AutoSwap extends Module {
    private boolean first = true;

    public AutoSwap() {
        super("autoswap", "AutoSwap", Category.COMBAT, "base", "KDFzREm.sY", 55);
        bool("swap-key", true);
        bool("first-item", true);
        bool("second-item", true);
        bool("log-swapped-item", false);
        bool("sunrise-runes", false);
        bool("any-food", true);
        bool("g-apples", true);
        bool("shield", false);
        bool("totem", false);
        bool("fireworks", false);
        bool("sphere", false);
        bool("multi", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        if (setting("swap-key") && !mc.options.keySwapOffhand.isDown() && mc.player.getAttackStrengthScale(1) > 0.2F) {
            return;
        }
        if (mc.player.getAttackStrengthScale(0.0F) > 0.15F && !mc.options.keySwapOffhand.isDown()) {
            return;
        }
        int a = Inventories.findHotbar(mc.player.getInventory(), Items.ENDER_PEARL);
        int b = Inventories.findHotbar(mc.player.getInventory(), Items.GOLDEN_APPLE);
        if (setting("g-apples") && b < 0) {
            b = Inventories.findHotbar(mc.player.getInventory(), Items.ENCHANTED_GOLDEN_APPLE);
        }
        if (setting("totem") && a < 0) {
            a = Inventories.findHotbar(mc.player.getInventory(), Items.TOTEM_OF_UNDYING);
        }
        if (setting("shield") && b < 0) {
            b = Inventories.findHotbar(mc.player.getInventory(), Items.SHIELD);
        }
        if (setting("fireworks") && a < 0) {
            a = Inventories.findHotbar(mc.player.getInventory(), Items.FIREWORK_ROCKET);
        }
        if (setting("sphere")) {
            for (int i = 0; i < 9; i++) {
                String id = mc.player.getInventory().getItem(i).getItem().getDescriptionId();
                if (id.contains("sphere") || id.contains("ender_eye") || id.contains("chorus")) {
                    a = i;
                    break;
                }
            }
        }
        if (setting("any-food")) {
            for (int i = 0; i < 9; i++) {
                ItemStack stack = mc.player.getInventory().getItem(i);
                if (Inventories.isFood(stack)) {
                    b = i;
                    break;
                }
            }
        }
        int slot = first ? a : b;
        if (slot >= 0) {
            mc.player.getInventory().setSelectedSlot(slot);
            first = !first;
        }
    }
}
