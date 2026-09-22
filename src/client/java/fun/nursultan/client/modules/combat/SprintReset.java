package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.WP @UZ SprintReset */
public final class SprintReset extends Module {
    public SprintReset() {
        super("sprintreset", "SprintReset", Category.COMBAT, "tools", "KDFzREm.WP", 33);
        bool("w-tap", true);
        bool("s-tap", false);
        bool("shift-tap", true);
        bool("no-stop", false);
        bool("ground-only", true);
        number("chance", 100, 0, 100, 5);
        number("delay", 1, 0, 10, 1);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        if (setting("ground-only") && !mc.player.onGround()) {
            return;
        }
        if (mc.player.tickCount % Math.max(1, (int) numberValue("delay", 1)) != 0) {
            return;
        }
        if (mc.player.getRandom().nextInt(100) > numberValue("chance", 100)) {
            return;
        }
        if (mc.player.getAttackStrengthScale(1.0F) < 0.15F) {
            mc.player.setSprinting(false);
            if (setting("shift-tap")) {
                mc.player.setShiftKeyDown(true);
            }
            if (setting("s-tap")) {
                mc.options.keyDown.setDown(true);
            }
            if (setting("w-tap")) {
                mc.options.keyUp.setDown(false);
            }
        } else if (!setting("no-stop")) {
            mc.player.setSprinting(true);
            mc.player.setShiftKeyDown(false);
        }
    }
}
