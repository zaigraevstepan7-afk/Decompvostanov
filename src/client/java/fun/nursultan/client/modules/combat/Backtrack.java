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
    private int delayLeft;
    private int lastId;

    public Backtrack() {
        super("backtrack", "Backtrack", Category.COMBAT, "tools", "KDFzREm.UP", 52);
        bool("color", true);
        bool("hold-after-attack", true);
        number("ticks", 4, 1, 20, 1);
        number("delay", 0, 0, 10, 1);
        number("distance", 6, 2, 12, 0.5F);
    }

    @Override
    public void onTick(Minecraft mc) {
        LivingEntity target = Targeting.nearest(mc, numberValue("distance", 6));
        if (target == null) {
            held = null;
            delayLeft = 0;
            lastId = -1;
            return;
        }
        if (target.getId() != lastId) {
            lastId = target.getId();
            delayLeft = (int) numberValue("delay", 0);
            held = null;
        }
        if (delayLeft > 0) {
            delayLeft--;
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

    @Override
    public void onHud(net.minecraft.client.gui.GuiGraphics g, int width, int height) {
        if (held == null) {
            return;
        }
        Minecraft mc = Minecraft.getInstance();
        int color = setting("color") ? 0xFF9FCA2B : 0xFFFFFFFF;
        g.drawString(mc.font, "bt " + ticks, width / 2 - 10, height / 2 + 16, color, false);
    }
}
