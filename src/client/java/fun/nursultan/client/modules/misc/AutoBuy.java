package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.inventory.Slot;

/** Restored from KDFzREm.WV @UZ AutoBuy — item ids from KDFzREm.k dump catalog. */
public final class AutoBuy extends Module {
    private static final String[] CATALOG = {
            "shulker", "elytra", "totem-of-undying", "enchanted-golden-apple", "golden-apple", "apple",
            "netherite-ingot", "ancient-debris", "experience-bottle", "gunpowder", "blaze-rod", "ender-pearl",
            "diamond", "gold-ingot", "gold-block", "diamond-ore", "emerald-ore", "beacon",
            "blaze-spawn-egg", "ghast-spawn-egg", "enderman-spawn-egg", "creeper-spawn-egg",
            "pig-spawn-egg", "sheep-spawn-egg", "villager-spawn-egg", "cow-spawn-egg",
            "zombie-villager-spawn-egg", "dragon-head", "wind-charge", "heavy-core"
    };
    private int delay;

    public AutoBuy() {
        super("autobuy", "AutoBuy", Category.MISC, "base", "KDFzREm.WV", 50);
        bool("buyer", true);
        bool("checker", false);
        bool("decrease-prices", true);
        bool("auto-parser", true);
        bool("auto-parser.complete", true);
        bool("autobuy.name", true);
        number("delay", 4, 0, 90, 1);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (!(mc.screen instanceof ContainerScreen) || mc.player == null || mc.gameMode == null) {
            return;
        }
        if (++delay < Math.max(1, (int) numberValue("delay", 4))) {
            return;
        }
        delay = 0;
        if (!setting("auto-parser") && !setting("buyer")) {
            return;
        }
        for (Slot slot : mc.player.containerMenu.slots) {
            if (slot.index >= 27 || slot.getItem().isEmpty()) {
                continue;
            }
            String name = slot.getItem().getHoverName().getString().toLowerCase();
            String id = slot.getItem().getItem().getDescriptionId().toLowerCase();
            if (setting("buyer") && !inCatalog(id, name)) {
                continue;
            }
            if (setting("checker") && !name.matches(".*\\d+.*")) {
                continue;
            }
            if (setting("decrease-prices") && name.contains("дорого")) {
                continue;
            }
            Inventories.click(mc, slot.index, 0, ClickType.PICKUP);
            if (setting("auto-parser.complete")) {
                return;
            }
        }
    }

    @Override
    public void onHud(net.minecraft.client.gui.GuiGraphics g, int width, int height) {
        if (!setting("autobuy.name")) {
            return;
        }
        Minecraft mc = Minecraft.getInstance();
        if (mc.font == null) {
            return;
        }
        g.drawString(mc.font, "autobuy.name " + CATALOG.length, 8, 88, fun.nursultan.client.ClientSettings.accent, false);
    }

    private static boolean inCatalog(String id, String name) {
        for (String key : CATALOG) {
            String token = key.replace('-', '_');
            if (id.contains(token) || id.contains(key) || name.contains(key.replace('-', ' '))) {
                return true;
            }
        }
        return name.contains("тотем") || name.contains("элитры") || name.contains("шалкер")
                || name.contains("незерит") || name.contains("алмаз") || name.contains("маяк")
                || name.contains("зачарованное золотое") || name.contains("золотое яблоко")
                || name.contains("древние обломки") || name.contains("пузырёк опыта") || name.contains("порох")
                || name.contains("огненный стержень") || name.contains("эндер жемчуг") || name.contains("золотой слиток")
                || name.contains("золотой блок") || name.contains("яйцо призыва") || name.contains("голова дракона")
                || name.contains("заряд ветра") || name.contains("навершие булавы");
    }
}
