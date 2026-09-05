package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.Pz — slider {1.0, 0.1, 10.0, 0.05}. */
public final class Timer extends Module {
    private float previous = 20.0F;

    public Timer() {
        super("timer", "Timer", Category.MOVEMENT, "base", "KDFzREm.Pz", 20);
        number("timer", 1.0F, 0.1F, 10.0F, 0.05F);
    }

    @Override
    public void onEnable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level != null) {
            previous = mc.level.tickRateManager().tickrate();
        }
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.level == null) {
            return;
        }
        float scale = numberValue("timer", 1.0F);
        mc.level.tickRateManager().setTickRate(Math.max(1.0F, 20.0F * scale));
        if (mc.player != null && scale != 1.0F) {
            Vec3 v = mc.player.getDeltaMovement();
            mc.player.setDeltaMovement(v.x * Math.min(scale, 1.35F), v.y, v.z * Math.min(scale, 1.35F));
        }
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level != null) {
            mc.level.tickRateManager().setTickRate(previous <= 0 ? 20.0F : previous);
        }
    }
}
