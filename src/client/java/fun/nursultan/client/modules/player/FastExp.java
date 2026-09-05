package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.Items;

/** Restored from KDFzREm.Ph @UZ FastExp — only-without-pvp / delay */
public final class FastExp extends Module {
    private int delay;

    public FastExp() {
        super("fastexp", "FastExp", Category.PLAYER, "base", "KDFzREm.Ph", 23);
        bool("only-without-pvp", true);
        number("delay", 1, 0, 10, 1);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null) {
            return;
        }
        if (setting("only-without-pvp") && mc.player.getLastHurtByMob() != null && mc.player.tickCount - mc.player.getLastHurtByMobTimestamp() < 80) {
            return;
        }
        if (!mc.player.getMainHandItem().is(Items.EXPERIENCE_BOTTLE)) {
            return;
        }
        if (++delay < numberValue("delay", 1)) {
            return;
        }
        delay = 0;
        mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
        mc.player.swing(InteractionHand.MAIN_HAND);
    }
}
