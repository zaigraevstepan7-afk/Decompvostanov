package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.Py @UZ NoPush — entity-push / block-push / fishing-rod */
public final class NoPush extends Module {
    public NoPush() {
        super("nopush", "NoPush", Category.MOVEMENT, "tools", "KDFzREm.Py", 24);
        bool("entity-push", true);
        bool("block-push", true);
        bool("fishing-rod", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        if (setting("entity-push")) {
            for (Entity entity : mc.level.getEntities(mc.player, mc.player.getBoundingBox().inflate(0.3))) {
                if (entity instanceof Player && entity != mc.player) {
                    Vec3 v = mc.player.getDeltaMovement();
                    mc.player.setDeltaMovement(v.x * 0.2, v.y, v.z * 0.2);
                    break;
                }
            }
        }
        if (setting("block-push")) {
            mc.player.horizontalCollision = false;
        }
    }
}
