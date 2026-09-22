package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.packs.PackSelectionScreen;

/** Restored from KDFzREm.Wq @UZ SRPSpoofer — closes pack prompt, does not forge hashes */
public final class SRPSpoofer extends Module {
    public SRPSpoofer() {
        super("srpspoofer", "SRPSpoofer", Category.MISC, "base", "KDFzREm.Wq", 9);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.screen instanceof PackSelectionScreen) {
            mc.setScreen(null);
        }
    }
}
