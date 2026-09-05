package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.bw @UZ GPS */
public final class GPS extends Module {
    public GPS() {
        super("gps", "GPS", Category.VISUAL, "", "KDFzREm.bw", 40);
        number("target-x", 0, -30000, 30000, 10);
        number("target-z", 0, -30000, 30000, 10);
        bool("clear-target", false);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (setting("clear-target")) {
            numbers.stream().filter(n -> n.id.startsWith("target-")).forEach(n -> n.value = 0);
            settings.stream().filter(s -> s.id.equals("clear-target")).findFirst().ifPresent(s -> s.value = false);
            return;
        }
        if (mc.player == null) {
            return;
        }
        double dx = numberValue("target-x", 0) - mc.player.getX();
        double dz = numberValue("target-z", 0) - mc.player.getZ();
        double dist = Math.hypot(dx, dz);
        g.drawString(mc.font, String.format("gps %.0f", dist), width / 2 - 20, 18, 0xFF9FCA2B, false);
        double yaw = Math.toRadians(mc.player.getYRot());
        double rx = dx * Math.cos(yaw) + dz * Math.sin(yaw);
        double rz = -dx * Math.sin(yaw) + dz * Math.cos(yaw);
        double ang = Math.atan2(rx, rz);
        int x = width / 2 + (int) (Math.sin(ang) * 28);
        int y = 40 - (int) (Math.cos(ang) * 12);
        g.fill(x - 2, y - 2, x + 2, y + 2, 0xFF9FCA2B);
    }
}
