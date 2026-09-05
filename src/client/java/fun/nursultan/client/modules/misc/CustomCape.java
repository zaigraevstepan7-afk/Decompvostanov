package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.WY @UZ CustomCape */
public final class CustomCape extends Module {
    public CustomCape() {
        super("customcape", "CustomCape", Category.MISC, "client", "KDFzREm.WY", 18);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player != null) {
            mc.player.setCustomNameVisible(true);
        }
    }
}
