package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.WG — jump-reset / vanilla / mode */
public final class NoVelocity extends Module {
    public NoVelocity() {
        super("novelocity", "NoVelocity", Category.COMBAT, "fighting", "KDFzREm.WG", 16);
        bool("vanilla", true);
        bool("jump-reset", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.player.hurtTime <= 0) {
            return;
        }
        Vec3 v = mc.player.getDeltaMovement();
        if (setting("vanilla")) {
            mc.player.setDeltaMovement(0, v.y, 0);
        }
        if (setting("jump-reset") && mc.player.onGround()) {
            mc.player.jumpFromGround();
        }
    }
}
