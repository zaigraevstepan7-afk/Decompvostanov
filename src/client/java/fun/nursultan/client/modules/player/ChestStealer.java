package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.ClickType;

/** Restored from KDFzREm.sp @UZ ChestStealer — loot-type / auto-close / ignore-server-menus */
public final class ChestStealer extends Module {
    private int delay;

    public ChestStealer() {
        super("cheststealer", "ChestStealer", Category.PLAYER, "base", "KDFzREm.sp", 42);
        bool("auto-close", true);
        bool("ignore-server-menus", true);
        bool("normal", true);
        bool("reverse", false);
        bool("shuffle", false);
        bool("loot-type", true);
        number("delay", 1, 0, 10, 1);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null) {
            return;
        }
        if (!(mc.player.containerMenu instanceof ChestMenu menu)) {
            delay = 0;
            return;
        }
        if (mc.screen instanceof ContainerScreen && setting("ignore-server-menus") && mc.screen.getTitle().getString().isBlank()) {
            return;
        }
        if (!setting("normal") && !setting("reverse") && !setting("shuffle")) {
            return;
        }
        if (++delay < numberValue("delay", 1)) {
            return;
        }
        delay = 0;
        int containerSlots = menu.getRowCount() * 9;
        if (setting("shuffle")) {
            java.util.List<Integer> filled = new java.util.ArrayList<>();
            for (int i = 0; i < containerSlots; i++) {
                if (!menu.getSlot(i).getItem().isEmpty() && lootOk(menu.getSlot(i).getItem())) {
                    filled.add(i);
                }
            }
            if (!filled.isEmpty()) {
                Inventories.click(mc, filled.get(java.util.concurrent.ThreadLocalRandom.current().nextInt(filled.size())), 0, ClickType.QUICK_MOVE);
                return;
            }
        } else {
            int start = setting("reverse") ? containerSlots - 1 : 0;
            int step = setting("reverse") ? -1 : 1;
            for (int i = start; i >= 0 && i < containerSlots; i += step) {
                if (!menu.getSlot(i).getItem().isEmpty() && lootOk(menu.getSlot(i).getItem())) {
                    Inventories.click(mc, i, 0, ClickType.QUICK_MOVE);
                    return;
                }
            }
        }
        if (setting("auto-close")) {
            mc.player.closeContainer();
        }
    }

    private boolean lootOk(net.minecraft.world.item.ItemStack stack) {
        if (!setting("loot-type")) {
            return true;
        }
        String id = stack.getItem().getDescriptionId();
        return stack.isEnchanted()
                || Inventories.isFood(stack)
                || id.contains("diamond")
                || id.contains("netherite")
                || id.contains("gold")
                || id.contains("totem")
                || id.contains("elytra")
                || id.contains("pearl")
                || id.contains("apple")
                || id.contains("potion")
                || id.contains("shulker")
                || stack.hasFoil();
    }
}
