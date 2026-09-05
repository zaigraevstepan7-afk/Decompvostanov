package fun.nursultan.client.modules.visual;

import fun.nursultan.client.ClientSettings;
import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.jV @UZ Logo — login/fps/ping/time/tps/bps/coordinates */
public final class Logo extends Module {
    public Logo() {
        super("logo", "Logo", Category.VISUAL, "", "KDFzREm.jV", 42);
        bool("login", true);
        bool("fps", true);
        bool("ping", true);
        bool("time", true);
        bool("tps", true);
        bool("coordinates", true);
        bool("bps", true);
        bool("details", true);
        bool("left", true);
        bool("right", false);
        enabled = true;
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.font == null || mc.player == null) {
            return;
        }
        int y = (int) (6 * ClientSettings.hudScale);
        int x = setting("right") && !setting("left") ? width - 160 : 6;
        g.drawString(mc.font, "NURSULTAN", x, y, ClientSettings.accent, false);
        y += 10;
        StringBuilder line = new StringBuilder();
        if (setting("login") && mc.player.getGameProfile().name() != null) {
            line.append(mc.player.getGameProfile().name()).append("  ");
        }
        if (setting("fps")) {
            line.append(mc.getFps()).append(" fps  ");
        }
        if (setting("ping") && mc.getConnection() != null) {
            var info = mc.getConnection().getPlayerInfo(mc.player.getUUID());
            line.append(info == null ? 0 : info.getLatency()).append(" ms  ");
        }
        if (setting("tps") && mc.level != null) {
            line.append(String.format("tps %.0f  ", mc.level.tickRateManager().tickrate()));
        }
        if (setting("time")) {
            long day = mc.level == null ? 0 : mc.level.getDayTime() % 24000;
            line.append(String.format("%02d:%02d  ", (6 + day / 1000) % 24, (int) ((day % 1000) * 60 / 1000)));
        }
        if (setting("bps")) {
            var v = mc.player.getDeltaMovement();
            line.append(String.format("%.1f bps  ", Math.hypot(v.x, v.z) * 20));
        }
        if (setting("coordinates")) {
            line.append((int) mc.player.getX()).append(' ').append((int) mc.player.getY()).append(' ').append((int) mc.player.getZ());
        }
        if (!line.isEmpty()) {
            g.drawString(mc.font, line.toString(), x, y, 0xFFF2E9FF, false);
        }
    }
}
