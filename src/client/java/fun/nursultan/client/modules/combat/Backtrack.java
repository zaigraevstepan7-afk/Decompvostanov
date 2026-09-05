package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.UP @UZ Backtrack — hold-after-attack */
public final class Backtrack extends Module {
    private Vec3 held;
    private int ticks;

    public Backtrack() {
        super("backtrack", "Backtrack", Category.COMBAT, "tools", "KDFzREm.UP", 52);
        bool("hold-after-attack", true);
        number("ticks", 4, 1, 20, 1);
    }

    @Override
    public void onTick(Minecraft mc) {
        LivingEntity target = Targeting.nearest(mc, 6);
        if (target == null) {
            held = null;
            return;
        }
        if (setting("hold-after-attack") && mc.player != null && mc.player.getAttackStrengthScale(0.0F) < 0.2F) {
            if (held == null) {
                held = target.position();
                ticks = (int) numberValue("ticks", 4);
            }
        }
        if (held != null && ticks-- > 0) {
            target.setPos(held.x, held.y, held.z);
        } else {
            held = target.position();
        }
    }
}
