package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from dump Sprint module. */
public final class Sprint extends Module {
    public Sprint() {
        super("sprint", "Sprint", Category.MOVEMENT, "base", "KDFzREm.PB", 8);
        bool("ignore-hunger", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player != null && (setting("ignore-hunger") || mc.player.getFoodData().getFoodLevel() > 6)) {
            mc.player.setSprinting(true);
        }
    }
}
