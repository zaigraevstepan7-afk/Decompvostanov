package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.TT @UZ Gamma */
public final class Gamma extends Module {
    private double previous = 1.0;

    public Gamma() {
        super("gamma", "Gamma", Category.VISUAL, "world", "KDFzREm.TT", 21);
    }

    @Override
    public void onEnable() {
        Minecraft mc = Minecraft.getInstance();
        previous = mc.options.gamma().get();
        mc.options.gamma().set(16.0);
    }

    @Override
    public void onDisable() {
        Minecraft.getInstance().options.gamma().set(previous);
    }
}
