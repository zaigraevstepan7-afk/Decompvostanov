package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.Tw @UZ TimeChanger — dawn/morning/day/evening/sunset/night */
public final class TimeChanger extends Module {
    public TimeChanger() {
        super("timechanger", "TimeChanger", Category.VISUAL, "world", "KDFzREm.Tw", 41);
        bool("select", true);
        bool("time", true);
        bool("dawn", false);
        bool("morning", false);
        bool("day", true);
        bool("evening", false);
        bool("sunset", false);
        bool("night", false);
        number("time-value", 120, 0, 240, 1);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.level == null || !setting("select") && !setting("time")) {
            return;
        }
        long time = (long) (numberValue("time-value", 120) / 240.0F * 24000.0F);
        if (setting("dawn")) {
            time = 0;
        } else if (setting("morning")) {
            time = 1000;
        } else if (setting("day")) {
            time = 6000;
        } else if (setting("evening")) {
            time = 11000;
        } else if (setting("sunset")) {
            time = 12500;
        } else if (setting("night")) {
            time = 18000;
        }
        mc.level.setTimeFromServer(mc.level.getGameTime(), time, true);
    }
}
