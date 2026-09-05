package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.ShulkerBoxBlock;

/** Restored from KDFzREm.Tl @UZ ShulkerPreview */
public final class ShulkerPreview extends Module {
    public ShulkerPreview() {
        super("shulkerpreview", "ShulkerPreview", Category.VISUAL, "screen", "KDFzREm.Tl", 43);
        bool("show-in-world", true);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) {
            return;
        }
        var stack = mc.player.getMainHandItem();
        if (stack.getItem() instanceof BlockItem block && block.getBlock() instanceof ShulkerBoxBlock) {
            g.drawString(mc.font, "shulker " + stack.getCount(), width / 2 + 12, height / 2 - 4, 0xFF9FCA2B, false);
        }
    }
}
