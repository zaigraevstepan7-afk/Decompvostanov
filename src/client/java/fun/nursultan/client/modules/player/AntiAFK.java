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
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        ticks++;
        if (ticks % 80 == 0) {
            if (setting("camera-shake")) {
                mc.player.setYRot(mc.player.getYRot() + 8);
            }
            mc.player.jumpFromGround();
        }
    }
}
