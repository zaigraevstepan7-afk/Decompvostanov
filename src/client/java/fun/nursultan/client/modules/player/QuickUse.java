package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

/** Restored from KDFzREm.TL @UZ QuickUse */
public final class QuickUse extends Module {
    public QuickUse() {
        super("quickuse", "QuickUse", Category.PLAYER, "base", "KDFzREm.TL", 32);
        bool("golden-apple", true);
        bool("enchanted-golden-apple", true);
        bool("bottle-of-exp", true);
        bool("instant-damage", false);
        bool("instant-health", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null || !mc.options.keyUse.isDown()) {
            return;
        }
        ItemStack stack = mc.player.getMainHandItem();
        boolean ok = setting("golden-apple") && stack.is(Items.GOLDEN_APPLE)
                || setting("enchanted-golden-apple") && stack.is(Items.ENCHANTED_GOLDEN_APPLE)
                || setting("bottle-of-exp") && stack.is(Items.EXPERIENCE_BOTTLE)
                || setting("instant-health") && stack.is(Items.SPLASH_POTION);
        if (ok) {
            mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
        }
    }
}
