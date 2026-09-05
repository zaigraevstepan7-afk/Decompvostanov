package fun.nursultan.client.ui;

import fun.nursultan.client.module.BoolSetting;
import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.module.ModuleManager;
import java.util.List;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;

public final class ClickGuiScreen extends Screen {
    private static final int BG = 0xF00B0B10;
    private static final int PANEL = 0xF014141C;
    private static final int ACCENT = 0xFFC85CFF;
    private static final int TEXT = 0xFFF2E9FF;
    private static final int MUTED = 0xFF9A90A8;
    private static final int CARD = 0xF01B1B26;

    private Category category = Category.COMBAT;
    private Module open;
    private int scroll;

    public ClickGuiScreen() {
        super(Component.literal("Nursultan"));
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    @Override
    public void render(GuiGraphics g, int mouseX, int mouseY, float delta) {
        g.fill(0, 0, width, height, 0x66000000);
        int x = width / 2 - 420;
        int y = height / 2 - 210;
        int w = 840;
        int h = 420;
        g.fill(x, y, x + w, y + h, BG);
        g.fill(x, y, x + 3, y + h, ACCENT);
        g.drawString(font, "NURSULTAN", x + 16, y + 14, ACCENT, false);
        g.drawString(font, "Right Shift · " + ModuleManager.INSTANCE.modules.size() + " modules", x + 16, y + 28, MUTED, false);

        int i = 0;
        for (Category cat : Category.values()) {
            int cy = y + 50 + i * 22;
            boolean on = cat == category;
            g.fill(x + 12, cy, x + 140, cy + 20, on ? PANEL : BG);
            if (on) {
                g.fill(x + 12, cy, x + 15, cy + 20, ACCENT);
            }
            g.drawString(font, cat.name().toLowerCase(), x + 22, cy + 6, on ? TEXT : MUTED, false);
            i++;
        }

        List<Module> list = ModuleManager.INSTANCE.byCategory(category);
        int listX = x + 156;
        int listY = y + 50;
        int shown = 0;
        for (int n = scroll; n < list.size() && shown < 14; n++) {
            Module module = list.get(n);
            int my = listY + shown * 24;
            g.fill(listX, my, listX + 400, my + 22, module.enabled ? 0xF0281833 : CARD);
            if (module.enabled) {
                g.fill(listX, my + 4, listX + 3, my + 18, ACCENT);
            }
            g.drawString(font, module.name, listX + 10, my + 4, TEXT, false);
            g.drawString(font, module.dumpClass + " · " + module.dumpMethods + " fn", listX + 10, my + 13, MUTED, false);
            g.fill(listX + 360, my + 5, listX + 392, my + 17, module.enabled ? ACCENT : 0xFF2E2E3A);
            shown++;
        }

        int sx = x + 566;
        g.fill(sx, y + 50, x + w - 12, y + h - 12, PANEL);
        if (open == null) {
            g.drawString(font, "dots / click a module", sx + 10, y + 62, MUTED, false);
        } else {
            g.drawString(font, open.name, sx + 10, y + 58, TEXT, false);
            g.drawString(font, open.dumpClass, sx + 10, y + 70, MUTED, false);
            int sy = y + 90;
            for (BoolSetting setting : open.settings) {
                g.fill(sx + 10, sy, sx + 20, sy + 10, setting.value ? ACCENT : 0xFF2E2E3A);
                g.drawString(font, setting.label, sx + 26, sy + 1, TEXT, false);
                sy += 14;
                if (sy > y + h - 24) {
                    break;
                }
            }
        }
        super.render(g, mouseX, mouseY, delta);
    }

    @Override
    public boolean mouseClicked(MouseButtonEvent event, boolean doubled) {
        double mouseX = event.x();
        double mouseY = event.y();
        int button = event.button();
        int x = width / 2 - 420;
        int y = height / 2 - 210;
        int i = 0;
        for (Category cat : Category.values()) {
            int cy = y + 50 + i * 22;
            if (inside(mouseX, mouseY, x + 12, cy, 128, 20)) {
                category = cat;
                scroll = 0;
                return true;
            }
            i++;
        }
        List<Module> list = ModuleManager.INSTANCE.byCategory(category);
        int shown = 0;
        for (int n = scroll; n < list.size() && shown < 14; n++) {
            Module module = list.get(n);
            int my = y + 50 + shown * 24;
            if (inside(mouseX, mouseY, x + 156, my, 400, 22)) {
                if (button == 1 || button == 0 && mouseX > x + 156 + 350) {
                    open = module;
                } else if (button == 0) {
                    module.toggle();
                    open = module;
                }
                return true;
            }
            shown++;
        }
        if (open != null) {
            int sx = x + 566;
            int sy = y + 90;
            for (BoolSetting setting : open.settings) {
                if (inside(mouseX, mouseY, sx + 10, sy, 200, 12)) {
                    setting.value = !setting.value;
                    return true;
                }
                sy += 14;
            }
        }
        return super.mouseClicked(event, doubled);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double scrollX, double scrollY) {
        int max = Math.max(0, ModuleManager.INSTANCE.byCategory(category).size() - 14);
        scroll = (int) Math.max(0, Math.min(max, scroll - (int) Math.signum(scrollY)));
        return true;
    }

    private static boolean inside(double mx, double my, int x, int y, int w, int h) {
        return mx >= x && my >= y && mx <= x + w && my <= y + h;
    }
}
