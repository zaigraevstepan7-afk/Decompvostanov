package fun.nursultan.client.ui;

import fun.nursultan.client.ClientSettings;
import fun.nursultan.client.module.BoolSetting;
import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.module.ModuleManager;
import fun.nursultan.client.module.NumberSetting;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;

/**
 * In-game menu reconstructed from KDFzREm.Gs
 * colors from Gs: fill 0x64000000, accent -6305237 = 0xFF9FCA2B
 * cards: switch / dots / bind — same contract as the dump + docs.
 */
public final class ClickGuiScreen extends Screen {
    private static final int OVERLAY = 0x64000000;
    private static final int PANEL = 0xE00E0E12;
    private static final int CARD = 0xE018181F;
    private static int accent() {
        return ClientSettings.accent;
    }
    private static final int TEXT = 0xFFF2E9FF;
    private static final int MUTED = 0xFF8A8A96;

    private Category category = Category.COMBAT;
    private Module open;
    private int scroll;
    private String query = "";
    private boolean typing;
    private boolean binding;

    public ClickGuiScreen() {
        super(Component.literal("Nursultan"));
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    private List<Module> visible() {
        List<Module> src = query.isBlank()
                ? ModuleManager.INSTANCE.byCategory(category)
                : ModuleManager.INSTANCE.modules.stream()
                        .filter(m -> m.name.toLowerCase(Locale.ROOT).contains(query.toLowerCase(Locale.ROOT))
                                || m.dumpClass.toLowerCase(Locale.ROOT).contains(query.toLowerCase(Locale.ROOT)))
                        .toList();
        return new ArrayList<>(src);
    }

    @Override
    public void render(GuiGraphics g, int mouseX, int mouseY, float delta) {
        g.fill(0, 0, width, height, OVERLAY);
        float scale = ClientSettings.menuScale;
        int w = (int) (860 * Math.min(1.15F, scale));
        int h = (int) (440 * Math.min(1.15F, scale));
        int x = width / 2 - w / 2;
        int y = height / 2 - h / 2;
        g.fill(x, y, x + w, y + h, PANEL);
        g.fill(x, y, x + w, y + 2, accent());
        g.drawString(font, "NURSULTAN", x + 16, y + 12, accent(), false);
        g.drawString(font, "Gs · menu " + ClientSettings.menuScale + " · hud " + ClientSettings.hudScale + " · " + ModuleManager.INSTANCE.modules.size(), x + 16, y + 24, MUTED, false);

        String search = (typing ? ">" : "") + (query.isBlank() ? "search" : query);
        g.fill(x + w - 220, y + 10, x + w - 14, y + 28, CARD);
        g.drawString(font, search, x + w - 212, y + 16, query.isBlank() ? MUTED : TEXT, false);

        int i = 0;
        for (Category cat : Category.values()) {
            int cy = y + 44 + i * 24;
            boolean on = cat == category && query.isBlank();
            g.fill(x + 10, cy, x + 132, cy + 22, on ? 0xE0222218 : CARD);
            if (on) {
                g.fill(x + 10, cy, x + 13, cy + 22, accent());
            }
            int count = ModuleManager.INSTANCE.byCategory(cat).size();
            g.drawString(font, cat.name().toLowerCase(Locale.ROOT) + " " + count, x + 20, cy + 7, on ? TEXT : MUTED, false);
            i++;
        }

        List<Module> list = visible();
        int listX = x + 144;
        int listY = y + 44;
        String lastSub = "";
        int shown = 0;
        int row = 0;
        for (int n = scroll; n < list.size() && shown < 12; n++) {
            Module module = list.get(n);
            if (!module.subcategory.isBlank() && !module.subcategory.equals(lastSub) && query.isBlank()) {
                g.drawString(font, module.subcategory, listX + 4, listY + row * 26, MUTED, false);
                lastSub = module.subcategory;
                row++;
                if (row >= 12) {
                    break;
                }
            }
            int my = listY + row * 26;
            g.fill(listX, my, listX + 420, my + 24, module.enabled ? 0xE0242A14 : CARD);
            if (module.enabled) {
                g.fill(listX, my + 5, listX + 3, my + 19, accent());
            }
            g.drawString(font, module.name, listX + 10, my + 3, TEXT, false);
            g.drawString(font, module.dumpClass + " · " + module.dumpMethods, listX + 10, my + 13, MUTED, false);
            String bind = module.bind.isBlank() ? "R" : module.bind;
            g.drawString(font, bind, listX + 330, my + 8, MUTED, false);
            g.drawString(font, "...", listX + 358, my + 8, MUTED, false);
            g.fill(listX + 384, my + 6, listX + 412, my + 18, module.enabled ? accent() : 0xFF2E2E3A);
            shown++;
            row++;
        }

        int sx = x + 576;
        g.fill(sx, y + 44, x + w - 12, y + h - 12, CARD);
        if (open == null) {
            g.drawString(font, "dots / RMB · settings", sx + 10, y + 56, MUTED, false);
            g.drawString(font, "MMB · bind", sx + 10, y + 70, MUTED, false);
        } else {
            g.drawString(font, open.name, sx + 10, y + 52, TEXT, false);
            g.drawString(font, open.dumpClass, sx + 10, y + 64, accent(), false);
            if (binding) {
                g.drawString(font, "press key...", sx + 10, y + 78, accent(), false);
            }
            int sy = y + 94;
            for (BoolSetting setting : open.settings) {
                g.fill(sx + 10, sy, sx + 20, sy + 10, setting.value ? accent() : 0xFF2E2E3A);
                g.drawString(font, setting.label, sx + 26, sy + 1, TEXT, false);
                sy += 13;
                if (sy > y + h - 20) {
                    break;
                }
            }
            for (NumberSetting setting : open.numbers) {
                g.fill(sx + 10, sy, sx + 250, sy + 10, 0xFF2E2E3A);
                float t = (setting.value - setting.min) / Math.max(0.0001F, setting.max - setting.min);
                g.fill(sx + 10, sy, sx + 10 + (int) (240 * t), sy + 10, accent());
                g.drawString(font, setting.label + " " + format(setting.value), sx + 14, sy + 1, TEXT, false);
                sy += 13;
                if (sy > y + h - 20) {
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
        float scale = ClientSettings.menuScale;
        int w = (int) (860 * Math.min(1.15F, scale));
        int h = (int) (440 * Math.min(1.15F, scale));
        int x = width / 2 - w / 2;
        int y = height / 2 - h / 2;
        if (inside(mouseX, mouseY, x + w - 220, y + 10, 206, 18)) {
            typing = true;
            return true;
        }
        if (inside(mouseX, mouseY, x + 16, y + 20, 200, 14)) {
            if (button == 1) {
                ClientSettings.cycleHudScale();
            } else {
                ClientSettings.cycleMenuScale();
            }
            return true;
        }
        typing = false;
        int i = 0;
        for (Category cat : Category.values()) {
            int cy = y + 44 + i * 24;
            if (inside(mouseX, mouseY, x + 10, cy, 122, 22)) {
                category = cat;
                query = "";
                scroll = 0;
                return true;
            }
            i++;
        }
        List<Module> list = visible();
        int row = 0;
        String lastSub = "";
        for (int n = scroll; n < list.size() && row < 12; n++) {
            Module module = list.get(n);
            if (!module.subcategory.isBlank() && !module.subcategory.equals(lastSub) && query.isBlank()) {
                lastSub = module.subcategory;
                row++;
                if (row >= 12) {
                    break;
                }
            }
            int my = y + 44 + row * 26;
            if (inside(mouseX, mouseY, x + 144, my, 420, 24)) {
                if (button == 2 || inside(mouseX, mouseY, x + 144 + 320, my, 28, 24)) {
                    open = module;
                    binding = true;
                } else if (button == 1 || inside(mouseX, mouseY, x + 144 + 350, my, 28, 24)) {
                    open = module;
                    binding = false;
                } else {
                    module.toggle();
                    open = module;
                }
                return true;
            }
            row++;
        }
        if (open != null) {
            int sx = x + 576;
            int sy = y + 94;
            for (BoolSetting setting : open.settings) {
                if (inside(mouseX, mouseY, sx + 10, sy, 200, 12)) {
                    setting.value = !setting.value;
                    fun.nursultan.client.config.ConfigStore.save();
                    return true;
                }
                sy += 13;
            }
            for (NumberSetting setting : open.numbers) {
                if (inside(mouseX, mouseY, sx + 10, sy, 240, 12)) {
                    setting.nudge(button == 1 ? -1 : 1);
                    fun.nursultan.client.config.ConfigStore.save();
                    return true;
                }
                sy += 13;
            }
        }
        return super.mouseClicked(event, doubled);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double scrollX, double scrollY) {
        int max = Math.max(0, visible().size() - 10);
        scroll = (int) Math.max(0, Math.min(max, scroll - (int) Math.signum(scrollY)));
        return true;
    }

    @Override
    public boolean keyPressed(KeyEvent event) {
        if (binding && open != null) {
            String name = org.lwjgl.glfw.GLFW.glfwGetKeyName(event.key(), event.scancode());
            open.bind = name == null ? "" : name.toUpperCase(Locale.ROOT);
            binding = false;
            fun.nursultan.client.config.ConfigStore.save();
            return true;
        }
        if (typing) {
            if (event.key() == 259 && !query.isEmpty()) {
                query = query.substring(0, query.length() - 1);
                return true;
            }
            if (event.key() == 256) {
                typing = false;
                return true;
            }
        }
        return super.keyPressed(event);
    }

    @Override
    public boolean charTyped(net.minecraft.client.input.CharacterEvent event) {
        if (typing) {
            char ch = (char) event.codepoint();
            if (ch >= 32 && ch < 127) {
                query += ch;
            }
            return true;
        }
        return super.charTyped(event);
    }

    private static boolean inside(double mx, double my, int x, int y, int w, int h) {
        return mx >= x && my >= y && mx <= x + w && my <= y + h;
    }

    private static String format(float value) {
        if (Math.abs(value - Math.round(value)) < 0.001F) {
            return Integer.toString(Math.round(value));
        }
        return String.format(Locale.ROOT, "%.2f", value);
    }
}
