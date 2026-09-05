package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ItemContainerContents;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import org.lwjgl.glfw.GLFW;

/** Restored from KDFzREm.Tl — show-in-world / holdControl + container preview. */
public final class ShulkerPreview extends Module {
    public ShulkerPreview() {
        super("shulkerpreview", "ShulkerPreview", Category.VISUAL, "screen", "KDFzREm.Tl", 43);
        bool("show-in-world", true);
        bool("shulker.holdControl", false);
        bool("shulker.contains", true);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) {
            return;
        }
        if (setting("shulker.holdControl") && mc.getWindow() != null
                && GLFW.glfwGetKey(mc.getWindow().handle(), GLFW.GLFW_KEY_LEFT_CONTROL) != GLFW.GLFW_PRESS) {
            return;
        }
        ItemStack stack = mc.player.getMainHandItem();
        if (!(stack.getItem() instanceof BlockItem block) || !(block.getBlock() instanceof ShulkerBoxBlock)) {
            return;
        }
        ItemContainerContents contents = stack.get(DataComponents.CONTAINER);
        if (setting("shulker.contains") && (contents == null || !contents.nonEmptyItems().iterator().hasNext())) {
            return;
        }
        int x = width / 2 + 16;
        int y = height / 2 - 20;
        var grid = net.minecraft.resources.Identifier.fromNamespaceAndPath("nursultan", "icons/3x9.png");
        boolean atlas = mc.getResourceManager().getResource(grid).isPresent();
        for (int slot = 0; slot < 27; slot++) {
            int sx = x + (slot % 9) * 18;
            int sy = y + (slot / 9) * 18;
            g.fill(sx, sy, sx + 16, sy + 16, atlas ? 0xAA1A1A1E : 0x88000000);
            g.fill(sx, sy, sx + 16, sy + 1, 0x33FFFFFF);
            g.fill(sx, sy + 15, sx + 16, sy + 16, 0x33000000);
        }
        int i = 0;
        if (contents != null) {
            for (ItemStack item : contents.nonEmptyItems()) {
                g.renderItem(item, x + (i % 9) * 18, y + (i / 9) * 18);
                i++;
                if (i >= 27) {
                    break;
                }
            }
        }
        if (setting("show-in-world")) {
            g.drawString(mc.font, atlas ? "icons/3x9.png" : "shulker " + i, x, y - 10,
                    fun.nursultan.client.ClientSettings.accent, false);
        }
    }
}
