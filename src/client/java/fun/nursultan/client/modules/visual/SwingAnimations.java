package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.jG @UZ SwingAnimations */
public final class SwingAnimations extends Module {
    public SwingAnimations() {
        super("swinganimations", "SwingAnimations", Category.VISUAL, "world", "KDFzREm.jG", 35);
        bool("swing", true);
        bool("swing-1", true);
        bool("swing-2", false);
        bool("swing-3", false);
        bool("swing-4", false);
        number("swing-strength", 1, 0.2F, 3, 0.1F);
        number("spin-smoothness", 0.5F, 0.1F, 1, 0.05F);
        bool("spinning", false);
        bool("only-while-have-target", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (!setting("swing") || mc.player == null) {
            return;
        }
        if (setting("only-while-have-target") && fun.nursultan.client.modules.combat.Targeting.nearest(mc, 6) == null) {
            return;
        }
        if (mc.player.swingTime > 0) {
            mc.player.yBobO += numberValue("swing-strength", 1);
            if (setting("spinning")) {
                mc.player.yHeadRot += 8 * numberValue("spin-smoothness", 0.5F);
            }
        }
    }
}
