package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.Wn @UZ TapeMouse */
public final class TapeMouse extends Module {
    private int leftWait;
    private int rightWait;

    public TapeMouse() {
        super("tapemouse", "TapeMouse", Category.COMBAT, "tools", "KDFzREm.Wn", 25);
        bool("left-mouse", true);
        bool("right-mouse", false);
        number("left-mouse-delay-sec", 0.05F, 0.0F, 2.0F, 0.05F);
        number("right-mouse-delay-sec", 0.10F, 0.0F, 2.0F, 0.05F);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        if (setting("left-mouse")) {
            int every = Math.max(1, (int) (numberValue("left-mouse-delay-sec", 0.05F) * 20));
            if (++leftWait >= every) {
                mc.options.keyAttack.setDown(true);
                leftWait = 0;
            } else {
                mc.options.keyAttack.setDown(false);
            }
        }
        if (setting("right-mouse")) {
            int every = Math.max(1, (int) (numberValue("right-mouse-delay-sec", 0.10F) * 20));
            if (++rightWait >= every) {
                mc.options.keyUse.setDown(true);
                rightWait = 0;
            } else {
                mc.options.keyUse.setDown(false);
            }
        }
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.options != null) {
            mc.options.keyAttack.setDown(false);
            mc.options.keyUse.setDown(false);
        }
    }
}
