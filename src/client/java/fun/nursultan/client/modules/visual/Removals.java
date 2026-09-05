package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.ji @UZ Removals */
public final class Removals extends Module {
    public Removals() {
        super("removals", "Removals", Category.VISUAL, "screen", "KDFzREm.ji", 62);
        bool("tilt-view", true);
        bool("vignette-overlay", true);
        bool("fire-overlay", true);
        bool("under-water-overlay", true);
        bool("wall-overlay", true);
        bool("totem-pop", false);
        bool("status-effect-overlay", true);
        bool("fog", false);
        bool("rain", false);
        bool("blindness", true);
        bool("nausea", true);
        bool("camera-clip", true);
        bool("heart-effect", true);
        bool("fishing-bobber", false);
        bool("wither-spawn", true);
        bool("end-portal-open", true);
        bool("anarchy-events", true);
        bool("exp-bottle", false);
        bool("scoreboard", false);
        bool("holograms", false);
        bool("trident", false);
        number("sound-multiplier", 1, 0, 2, 0.1F);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        if (setting("tilt-view")) {
            mc.player.hurtTime = 0;
            mc.player.hurtDuration = 0;
        }
        if (setting("rain") && mc.level != null) {
            mc.level.setRainLevel(0);
            mc.level.setThunderLevel(0);
        }
    }
}
