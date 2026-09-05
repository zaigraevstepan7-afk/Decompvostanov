package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from dump Sprint module. */
public final class Sprint extends Module {
    public Sprint() {
        super("sprint", "Sprint", Category.MOVEMENT, "", "KDFzREm.Sprint", 8);
        bool("sprint-mode", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player != null && setting("sprint-mode")) {
            mc.player.setSprinting(true);
        }
    }
}
