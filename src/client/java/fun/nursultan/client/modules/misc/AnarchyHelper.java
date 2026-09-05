package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.modules.combat.Targeting;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;

/** Restored from KDFzREm.mZ @UZ AnarchyHelper */
public final class AnarchyHelper extends Module {
    public AnarchyHelper() {
        super("anarchyhelper", "AnarchyHelper", Category.MISC, "helper", "KDFzREm.mZ", 57);
        bool("desorientation", true);
        bool("trap", true);
        bool("god-aura", true);
        bool("sheer-dust", true);
        bool("stratum", true);
        bool("snowball", true);
        bool("fierytornado", true);
        bool("holy-water", true);
        bool("potion-holy-water", true);
        bool("potion-rage", true);
        bool("potion-paladin", false);
        bool("potion-assassin", false);
        bool("potion-drowsiness", false);
        bool("potion-radiation", false);
        bool("godsaura", true);
        bool("sheerdust", true);
        bool("freezeball", true);
        bool("assassin", false);
        bool("paladin", false);
        bool("drowsiness", false);
        bool("radiation", false);
        bool("rage", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null || Targeting.nearest(mc, 6) == null) {
            return;
        }
        if (!mc.options.keyUse.isDown()) {
            return;
        }
        for (int i = 0; i < 9; i++) {
            ItemStack stack = mc.player.getInventory().getItem(i);
            String name = stack.getHoverName().getString().toLowerCase();
            boolean match = setting("god-aura") && (name.contains("aura") || name.contains("аура") || name.contains("Божья аура".toLowerCase()))
                    || setting("sheer-dust") && (name.contains("пыл") || name.contains("dust") || name.contains("Явная пыль".toLowerCase()))
                    || setting("holy-water") && (name.contains("свят") || name.contains("holy"))
                    || setting("desorientation") && (name.contains("дезор") || name.contains("Дезориентация".toLowerCase()))
                    || setting("trap") && (name.contains("трап") || name.contains("Трапка".toLowerCase()))
                    || setting("stratum") && (name.contains("пласт") || name.contains("Пласт".toLowerCase()) || name.contains("stratum"))
                    || setting("fierytornado") && (name.contains("смерч") || name.contains("tornado") || name.contains("Огненный смерч".toLowerCase()))
                    || setting("snowball") && (name.contains("снеж") || name.contains("Снежок заморозка".toLowerCase()))
                    || setting("godsaura") && name.contains("god")
                    || setting("sheerdust") && name.contains("sheer")
                    || setting("freezeball") && name.contains("freeze")
                    || setting("assassin") && name.contains("assassin")
                    || setting("paladin") && name.contains("paladin")
                    || setting("drowsiness") && name.contains("drowsy")
                    || setting("radiation") && name.contains("radia")
                    || setting("rage") && name.contains("rage")
                    || setting("potion-rage") && name.contains("rage")
                    || setting("potion-holy-water") && name.contains("holy")
                    || setting("potion-paladin") && name.contains("paladin")
                    || setting("potion-assassin") && name.contains("assassin")
                    || setting("potion-drowsiness") && (name.contains("drowsy") || name.contains("сон"))
                    || setting("potion-radiation") && (name.contains("radia") || name.contains("ради"));
            if (match) {
                int prev = mc.player.getInventory().getSelectedSlot();
                mc.player.getInventory().setSelectedSlot(i);
                mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
                mc.player.getInventory().setSelectedSlot(prev);
                return;
            }
        }
    }
}
