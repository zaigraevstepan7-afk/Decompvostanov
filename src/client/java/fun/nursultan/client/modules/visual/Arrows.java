package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.entity.player.Player;

/** Restored from KDFzREm.TQ @UZ Arrows */
public final class Arrows extends Module {
    public Arrows() {
        super("arrows", "Arrows", Category.VISUAL, "screen", "KDFzREm.TQ", 40);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || mc.level == null) {
            return;
        }
        int cx = width / 2;
        int cy = height / 2;
        for (Player player : mc.level.players()) {
            if (player == mc.player) {
                continue;
            }
            double dx = player.getX() - mc.player.getX();
            double dz = player.getZ() - mc.player.getZ();
            double yaw = Math.toRadians(mc.player.getYRot());
            double rx = dx * Math.cos(yaw) + dz * Math.sin(yaw);
            double rz = -dx * Math.sin(yaw) + dz * Math.cos(yaw);
            double ang = Math.atan2(rx, rz);
            int x = cx + (int) (Math.sin(ang) * 40);
            int y = cy - (int) (Math.cos(ang) * 40);
            g.fill(x - 2, y - 2, x + 2, y + 2, 0xFF9FCA2B);
        }
    }
}
