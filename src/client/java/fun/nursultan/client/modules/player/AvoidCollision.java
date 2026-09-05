package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.Px @UZ AvoidCollision */
public final class AvoidCollision extends Module {
    public AvoidCollision() {
        super("avoidcollision", "AvoidCollision", Category.PLAYER, "base", "KDFzREm.Px", 19);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        for (Entity entity : mc.level.getEntities(mc.player, mc.player.getBoundingBox().inflate(0.6))) {
            if (entity instanceof Player && entity != mc.player) {
                Vec3 away = mc.player.position().subtract(entity.position()).normalize().scale(0.18);
                Vec3 v = mc.player.getDeltaMovement();
                mc.player.setDeltaMovement(v.x + away.x, v.y, v.z + away.z);
                return;
            }
        }
    }
}
