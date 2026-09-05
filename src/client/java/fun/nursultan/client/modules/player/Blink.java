package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.Minecraft;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.PD @UZ Blink — mixin queues move packets */
public final class Blink extends Module {
    private int ticks;
    private Vec3 start;

    public Blink() {
        super("blink", "Blink", Category.PLAYER, "base", "KDFzREm.PD", 38);
        bool("release-packets-on-hit", true);
        bool("render-server-position", true);
        bool("render-color", true);
        bool("auto-release-packets", true);
        number("release-packets-ticks", 40, 5, 200, 5);
    }

    @Override
    public void onEnable() {
        Minecraft mc = Minecraft.getInstance();
        start = mc.player == null ? null : mc.player.position();
        ticks = 0;
    }

    @Override
    public void onDisable() {
        ClientHooks.flushBlink();
    }

    @Override
    public void onTick(Minecraft mc) {
        ticks++;
        if (setting("release-packets-on-hit") && mc.player != null && mc.player.hurtTime > 0) {
            ClientHooks.flushBlink();
        }
        if (setting("auto-release-packets") && ticks >= numberValue("release-packets-ticks", 40)) {
            ClientHooks.flushBlink();
            ticks = 0;
        }
    }

    @Override
    public void onHud(net.minecraft.client.gui.GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.font != null) {
            int color = setting("render-color") ? 0xFF9FCA2B : 0xFFF2E9FF;
            String text = "blink " + ClientHooks.blinkSize();
            if (setting("render-server-position") && start != null) {
                text += String.format(" @ %.0f %.0f %.0f", start.x, start.y, start.z);
            }
            g.drawString(mc.font, text, 8, height - 32, color, false);
        }
    }
}
