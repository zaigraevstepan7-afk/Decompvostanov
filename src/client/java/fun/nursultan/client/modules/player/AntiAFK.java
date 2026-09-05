package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.su @UZ AntiAFK */
public final class AntiAFK extends Module {
    private int ticks;

    public AntiAFK() {
        super("antiafk", "AntiAFK", Category.PLAYER, "base", "KDFzREm.su", 24);
        bool("camera-shake", true);
        bool("click", false);
        bool("custom", false);
        bool("ft", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        ticks++;
        if (ticks % 80 == 0) {
            if (setting("camera-shake")) {
                mc.player.setYRot(mc.player.getYRot() + (setting("ft") ? 3 : 8));
            }
            if (mc.player.onGround() && !setting("custom")) {
                mc.player.jumpFromGround();
            }
            if (setting("custom")) {
                mc.options.keyLeft.setDown(ticks / 80 % 2 == 0);
            }
        }
        if (setting("click") && ticks % 40 == 0 && mc.gameMode != null) {
            mc.gameMode.useItem(mc.player, net.minecraft.world.InteractionHand.MAIN_HAND);
        }
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.options != null) {
            mc.options.keyLeft.setDown(false);
        }
    }
}
