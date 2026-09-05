package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.sD @UZ NoDelay — block-breaking / right-click / jump-delay */
public final class NoDelay extends Module {
    public NoDelay() {
        super("nodelay", "NoDelay", Category.PLAYER, "base", "KDFzREm.sD", 28);
        bool("block-breaking", true);
        bool("right-click", true);
        bool("jump-delay", true);
        bool("delays", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (!setting("delays") || mc.player == null) {
            return;
        }
        if (setting("right-click") && mc.options.keyUse.isDown() && mc.gameMode != null) {
            mc.gameMode.useItem(mc.player, net.minecraft.world.InteractionHand.MAIN_HAND);
        }
        if (setting("jump-delay") && mc.options.keyJump.isDown() && mc.player.onGround()) {
            mc.player.jumpFromGround();
        }
    }
}
