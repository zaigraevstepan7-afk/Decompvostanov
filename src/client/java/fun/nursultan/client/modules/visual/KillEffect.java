package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.bQ @UZ KillEffect */
public final class KillEffect extends Module {
    private final java.util.Set<Integer> seen = new java.util.HashSet<>();
    private final Map<Integer, Integer> remaining = new HashMap<>();
    private final Map<Integer, Vec3> where = new HashMap<>();

    public KillEffect() {
        super("killeffect", "KillEffect", Category.VISUAL, "world", "KDFzREm.bQ", 47);
        bool("behind-walls", true);
        bool("color", true);
        number("count", 8, 1, 32, 1);
        number("duration", 20, 5, 80, 5);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        for (LivingEntity entity : mc.level.getEntitiesOfClass(LivingEntity.class, mc.player.getBoundingBox().inflate(24), e -> e != mc.player)) {
            if (entity.isAlive() && entity.getHealth() > 0) {
                seen.remove(entity.getId());
                continue;
            }
            if (!seen.add(entity.getId())) {
                continue;
            }
            if (!setting("behind-walls") && !mc.player.hasLineOfSight(entity)) {
                continue;
            }
            remaining.put(entity.getId(), Math.max(1, (int) numberValue("duration", 20)));
            where.put(entity.getId(), entity.position());
        }
        int burst = Math.max(1, (int) numberValue("count", 8));
        Iterator<Map.Entry<Integer, Integer>> it = remaining.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> e = it.next();
            Vec3 pos = where.get(e.getKey());
            if (pos == null) {
                it.remove();
                continue;
            }
            int left = e.getValue();
            int n = Math.max(1, burst / Math.max(1, (int) numberValue("duration", 20)));
            for (int i = 0; i < n; i++) {
                mc.level.addParticle(
                        setting("color") ? ParticleTypes.TOTEM_OF_UNDYING : ParticleTypes.SMOKE,
                        pos.x, pos.y + 1, pos.z, 0, 0.2, 0);
            }
            if (left <= 1) {
                it.remove();
                where.remove(e.getKey());
            } else {
                e.setValue(left - 1);
            }
        }
    }
}
