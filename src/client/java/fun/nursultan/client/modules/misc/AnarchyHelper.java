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
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null || Targeting.nearest(mc, 6) == null) {
            return;
        }
        ItemStack stack = mc.player.getMainHandItem();
        String name = stack.getHoverName().getString().toLowerCase();
        boolean match = setting("god-aura") && (name.contains("aura") || name.contains("аура"))
                || setting("sheer-dust") && (name.contains("пыл") || name.contains("dust"))
                || setting("holy-water") && (name.contains("свят") || name.contains("holy"))
                || setting("desorientation") && name.contains("дезор")
                || setting("trap") && name.contains("трап")
                || setting("stratum") && (name.contains("пласт") || name.contains("stratum"))
                || setting("fierytornado") && (name.contains("смерч") || name.contains("tornado"))
                || setting("snowball") && name.contains("снеж");
        if (match && mc.options.keyUse.isDown()) {
            mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
        }
    }
}
