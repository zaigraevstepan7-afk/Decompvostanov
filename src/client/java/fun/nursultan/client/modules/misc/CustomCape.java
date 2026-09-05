package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.Identifier;

/** Restored from KDFzREm.WY — dump cape path textures/capes/cape.png */
public final class CustomCape extends Module {
    private static final Identifier CAPE = Identifier.fromNamespaceAndPath("nursultan", "textures/capes/cape.png");

    public CustomCape() {
        super("customcape", "CustomCape", Category.MISC, "client", "KDFzREm.WY", 18);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player != null) {
            mc.player.setCustomNameVisible(true);
        }
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.font == null) {
            return;
        }
        boolean present = mc.getResourceManager().getResource(CAPE).isPresent();
        g.drawString(mc.font, present ? "cape.png" : "textures/capes/cape.png", 8, height - 90,
                present ? fun.nursultan.client.ClientSettings.accent : 0xFFFFC107, false);
    }
}
