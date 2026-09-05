package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.PM @UZ SpearBoost */
public final class SpearBoost extends Module {
    public SpearBoost() {
        super("spearboost", "SpearBoost", Category.MOVEMENT, "tools", "KDFzREm.PM", 43);
        bool("auto-jump", true);
        bool("rapid", false);
        bool("boost-key", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        boolean spear = mc.player.getMainHandItem().is(Items.TRIDENT) || mc.player.getMainHandItem().is(Items.WIND_CHARGE);
        if (!spear) {
            return;
        }
        if (setting("boost-key") && !mc.options.keyUse.isDown()) {
            return;
        }
        if (setting("auto-jump") && mc.player.onGround()) {
            mc.player.jumpFromGround();
        }
        double scale = setting("rapid") ? 1.7 : 1.35;
        Vec3 look = mc.player.getLookAngle().scale(scale);
        mc.player.setDeltaMovement(look.x, Math.max(0.42, look.y), look.z);
    }
}
