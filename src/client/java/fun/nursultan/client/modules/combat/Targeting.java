package fun.nursultan.client.modules.combat;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;

public final class Targeting {
    public static LivingEntity nearest(Minecraft mc, double range) {
        if (mc.player == null || mc.level == null) {
            return null;
        }
        Player self = mc.player;
        AABB box = self.getBoundingBox().inflate(range);
        LivingEntity best = null;
        double bestD = range * range;
        for (LivingEntity entity : mc.level.getEntitiesOfClass(LivingEntity.class, box, e -> e != self && e.isAlive() && !e.isInvisible())) {
            double d = self.distanceToSqr(entity);
            if (d < bestD) {
                bestD = d;
                best = entity;
            }
        }
        return best;
    }

    private Targeting() {}
}
