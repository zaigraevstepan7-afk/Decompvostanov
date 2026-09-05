package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

/** Restored from KDFzREm.TP @UZ FakePlayer */
public final class FakePlayer extends Module {
    public FakePlayer() {
        super("fakeplayer", "FakePlayer", Category.VISUAL, "world", "KDFzREm.TP", 54);
        bool("walk", true);
        bool("rotate", true);
        bool("Steve", true);
    }

    @Override
    public void onEnable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            mc.player.displayClientMessage(Component.literal("FakePlayer at " + (int) mc.player.getX() + " " + (int) mc.player.getY() + " " + (int) mc.player.getZ()), false);
        }
    }
}
