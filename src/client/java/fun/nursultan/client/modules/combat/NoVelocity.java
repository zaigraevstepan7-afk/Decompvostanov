package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.WG. */
public final class NoVelocity extends Module {
    public NoVelocity() {
        super("novelocity", "NoVelocity", Category.COMBAT, "", "KDFzREm.WG", 16);
        bool("enabled", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || !setting("enabled")) {
            return;
        }
        if (mc.player.hurtTime > 0) {
            Vec3 v = mc.player.getDeltaMovement();
            mc.player.setDeltaMovement(0, v.y, 0);
        }
    }
}
