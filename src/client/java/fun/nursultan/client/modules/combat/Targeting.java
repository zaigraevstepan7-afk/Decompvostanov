package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ClientHooks;
import fun.nursultan.client.util.Friends;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.villager.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public final class Targeting {
    public static LivingEntity nearest(Minecraft mc, double range) {
        return nearest(mc, range, null);
    }

    public static LivingEntity nearest(Minecraft mc, double range, Module filters) {
        if (mc.player == null || mc.level == null) {
            return null;
        }
        Player self = mc.player;
        AABB box = self.getBoundingBox().inflate(range);
        LivingEntity best = null;
        double bestD = range * range;
        for (LivingEntity entity : mc.level.getEntitiesOfClass(LivingEntity.class, box, e -> accept(self, e, filters))) {
            double d = self.distanceToSqr(entity);
            if (d < bestD) {
                bestD = d;
                best = entity;
            }
        }
        return best;
    }

    private static boolean accept(Player self, LivingEntity entity, Module filters) {
        if (entity == self || !entity.isAlive()) {
            return false;
        }
        if (Friends.isFriend(entity) || ClientHooks.skipBot(entity)) {
            return false;
        }
        if (filters == null) {
            return !entity.isInvisible();
        }
        if (!filters.setting("invisible") && entity.isInvisible()) {
            return false;
        }
        if (entity instanceof Player player) {
            if (filters.settings.stream().anyMatch(s -> s.id.equals("players")) && !filters.setting("players")) {
                return false;
            }
            if (filters.setting("naked") && player.getArmorValue() > 0) {
                return false;
            }
            return true;
        }
        if (entity instanceof Villager) {
            return filters.setting("villagers");
        }
        if (entity instanceof Monster) {
            return !filters.settings.stream().anyMatch(s -> s.id.equals("mobs")) || filters.setting("mobs");
        }
        if (entity instanceof Animal) {
            return filters.setting("animals") || filters.setting("mobs");
        }
        return filters.setting("mobs");
    }

    public static boolean inFov(Player self, LivingEntity target, float fov) {
        if (fov >= 360) {
            return true;
        }
        Vec3 look = self.getLookAngle();
        Vec3 dir = target.position().subtract(self.getEyePosition()).normalize();
        double angle = Math.toDegrees(Math.acos(Math.max(-1, Math.min(1, look.dot(dir)))));
        return angle <= fov / 2.0;
    }

    public static boolean hasOtherPlayer(Minecraft mc, double range) {
        if (mc.player == null || mc.level == null) {
            return false;
        }
        AABB box = mc.player.getBoundingBox().inflate(range);
        return !mc.level.getEntitiesOfClass(Player.class, box, e -> e != mc.player && e.isAlive()).isEmpty();
    }

    private Targeting() {}
}
