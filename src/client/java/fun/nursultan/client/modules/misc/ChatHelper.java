package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ChatLog;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.ma @UZ ChatHelper */
public final class ChatHelper extends Module {
    public ChatHelper() {
        super("chathelper", "ChatHelper", Category.MISC, "helper", "KDFzREm.ma", 24);
        bool("better-commands", true);
        bool("chat-addons", true);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        if (!setting("chat-addons")) {
            return;
        }
        Minecraft mc = Minecraft.getInstance();
        var lines = ChatLog.snapshot();
        if (!lines.isEmpty()) {
            g.drawString(mc.font, lines.get(lines.size() - 1), 8, height - 70, 0xFFAAAAAA, false);
        }
    }
}
