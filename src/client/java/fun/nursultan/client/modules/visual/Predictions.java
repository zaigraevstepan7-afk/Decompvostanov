package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrowableItemProjectile;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.bx @UZ Predictions */
public final class Predictions extends Module {
    public Predictions() {
        super("predictions", "Predictions", Category.VISUAL, "world", "KDFzREm.bx", 40);
        bool("pearl", true);
        bool("trident", true);
        bool("arrow", true);
        bool("potions", true);
        bool("snowball", true);
        bool("windcharge", true);
        bool("predict-entity", true);
        bool("line-color", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null || !setting("predict-entity")) {
            return;
        }
        for (var entity : mc.level.entitiesForRendering()) {
            if (entity instanceof ThrowableItemProjectile proj && accept(proj.getItem())) {
                Vec3 p = proj.position().add(proj.getDeltaMovement().scale(8));
                mc.level.addParticle(ParticleTypes.CRIT, p.x, p.y, p.z, 0, 0, 0);
            } else if (setting("arrow") && entity instanceof net.minecraft.world.entity.projectile.arrow.AbstractArrow arrow) {
                Vec3 p = arrow.position().add(arrow.getDeltaMovement().scale(10));
                mc.level.addParticle(ParticleTypes.CRIT, p.x, p.y, p.z, 0, 0, 0);
            } else if (setting("trident") && entity instanceof net.minecraft.world.entity.projectile.arrow.ThrownTrident trident) {
                Vec3 p = trident.position().add(trident.getDeltaMovement().scale(10));
                mc.level.addParticle(ParticleTypes.CRIT, p.x, p.y, p.z, 0, 0, 0);
            }
        }
    }

    private boolean accept(net.minecraft.world.item.ItemStack stack) {
        if (setting("pearl") && stack.is(net.minecraft.world.item.Items.ENDER_PEARL)) {
            return true;
        }
        if (setting("snowball") && stack.is(net.minecraft.world.item.Items.SNOWBALL)) {
            return true;
        }
        if (setting("potions") && (stack.is(net.minecraft.world.item.Items.SPLASH_POTION) || stack.is(net.minecraft.world.item.Items.LINGERING_POTION))) {
            return true;
        }
        if (setting("windcharge") && stack.is(net.minecraft.world.item.Items.WIND_CHARGE)) {
            return true;
        }
        return setting("arrow") || setting("trident");
    }
}
