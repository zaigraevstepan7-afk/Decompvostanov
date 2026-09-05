package fun.nursultan.client.ui;

import fun.nursultan.client.ClientSettings;
import fun.nursultan.client.config.ConfigStore;
import fun.nursultan.client.module.BoolSetting;
import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.module.ModuleManager;
import fun.nursultan.client.module.NumberSetting;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;

/**
 * Click GUI reconstructed to the live Nursultan menu: sidebar + subcategory cards,
 * orange-gold accents, pill toggles, «...» settings. Module list from dump @UZ.
 */
public final class ClickGuiScreen extends Screen {
    private static final int OVERLAY = 0x99000000;
    private static final int SHELL = 0xF0121214;
    private static final int SIDEBAR = 0xF0101012;
    private static final int CARD = 0xE018181C;
    private static final int SEARCH_BG = 0xFF1A1A1E;
    private static final int TEXT = 0xFFECE8E0;
    private static final int MUTED = 0xFF8A8680;
    private static final int PILL_OFF = 0xFF3A3A40;
    private static final int KNOB_OFF = 0xFF8C8C94;
    private static final int ROW_H = 30;
    private static final int CARD_HEAD = 26;
    private static final int SIDE_W = 176;
    private static final int TOP_H = 44;
    private static final List<String> SUB_ORDER = List.of(
            "fighting", "tools", "base", "other", "auto", "world", "screen",
            "interface", "helper", "trackers", "client");
    private static final List<String> FIGHT_ORDER = List.of(
            "attackaura", "novelocity", "triggerbot", "aimassist", "autoexplosion");
    private static final List<String> TOOL_ORDER = List.of(
            "sprintreset", "tapemouse", "backtrack", "webtrap");
    private static final List<String> BASE_ORDER = List.of("autoswap", "itemrelease");
    private static final List<String> OTHER_ORDER = List.of("noslotchange", "antibot", "nofrienddamage");

    private enum Section {
        COMBAT, MOVEMENT, VISUAL, PLAYER, MISC, PRESETS, AUTOBUY, ACCOUNTS
    }

    private record Hit(String kind, int x, int y, int w, int h, Object extra) {}

    private Section section = Section.COMBAT;
    private Module open;
    private String query = "";
    private boolean typing;
    private boolean binding;
    private boolean burger;
    private int contentScroll;
    private int settingScroll;
    private NumberSetting sliding;
    private final Set<String> collapsed = new HashSet<>();
    private final List<Hit> hits = new ArrayList<>();
    private int winX;
    private int winY;
    private int winW;
    private int winH;

    public ClickGuiScreen() {
        super(Component.literal("Nursultan"));
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    private static int accent() {
        return ClientSettings.accent;
    }

    private void frame() {
        int margin = Math.max(10, (int) (16 / Math.max(0.85F, ClientSettings.menuScale)));
        winX = margin;
        winY = margin;
        winW = width - margin * 2;
        winH = height - margin * 2;
    }

    @Override
    public void render(GuiGraphics g, int mouseX, int mouseY, float delta) {
        hits.clear();
        frame();
        g.fill(0, 0, width, height, OVERLAY);
        round(g, winX, winY, winW, winH, 7, SHELL);
        fill(g, winX, winY, SIDE_W, winH, SIDEBAR);
        fill(g, winX + SIDE_W, winY, 1, winH, 0x22FFFFFF);
        fill(g, winX, winY + TOP_H - 1, winW, 1, 0x18FFFFFF);

        drawLogo(g, winX + 16, winY + 12);
        drawSearch(g);
        drawBurger(g);
        drawSidebar(g, mouseX, mouseY);

        int cx = winX + SIDE_W + 14;
        int cy = winY + TOP_H + 8;
        int cw = winW - SIDE_W - 28;
        int ch = winH - TOP_H - 20;
        try {
            g.enableScissor(cx - 2, cy - 2, cx + cw + 2, cy + ch + 2);
            if (section.ordinal() <= Section.MISC.ordinal()) {
                drawCards(g, cx, cy, cw, ch);
            } else {
                drawManage(g, cx, cy, cw);
            }
        } finally {
            g.disableScissor();
        }
        if (open != null) {
            drawSettings(g, mouseX, mouseY);
        }
        if (burger) {
            drawBurgerMenu(g);
        }
        super.render(g, mouseX, mouseY, delta);
    }

    private void drawLogo(GuiGraphics g, int x, int y) {
        int a = accent();
        fill(g, x, y, 3, 18, a);
        fill(g, x + 13, y, 3, 18, a);
        for (int i = 0; i < 13; i++) {
            fill(g, x + 2 + i, y + i, 3, 2, a);
        }
        hit("logo", x - 4, y - 4, 28, 26, null);
    }

    private void drawSearch(GuiGraphics g) {
        int sw = Math.min(380, Math.max(220, winW - 200));
        int sx = winX + (winW - sw) / 2;
        int sy = winY + 12;
        round(g, sx, sy, sw, 22, 6, SEARCH_BG);
        int icon = query.isBlank() && !typing ? MUTED : TEXT;
        fill(g, sx + 8, sy + 7, 7, 7, 0x00000000);
        ring(g, sx + 10, sy + 7, icon);
        fill(g, sx + 16, sy + 14, 3, 2, icon);
        String placeholder = ClientSettings.ru() ? "Поиск" : "Search";
        String shown = query.isBlank() ? placeholder : query;
        if (typing) {
            shown += (System.currentTimeMillis() / 400 % 2 == 0) ? "|" : "";
        }
        g.drawString(font, shown, sx + 24, sy + 7, query.isBlank() ? MUTED : TEXT, false);
        hit("search", sx, sy, sw, 22, null);
    }

    private void drawBurger(GuiGraphics g) {
        int bx = winX + winW - 28;
        int by = winY + 16;
        for (int i = 0; i < 3; i++) {
            fill(g, bx, by + i * 5, 14, 2, MUTED);
        }
        hit("burger", bx - 6, by - 6, 26, 24, null);
    }

    private void drawSidebar(GuiGraphics g, int mouseX, int mouseY) {
        int x = winX + 10;
        int y = winY + TOP_H + 4;
        g.drawString(font, ClientSettings.ru() ? "ФУНКЦИИ" : "FUNCTIONS", x + 6, y, MUTED, false);
        y += 16;
        y = nav(g, x, y, Section.COMBAT, ClientSettings.ru() ? "Бой" : "Combat", "combat", mouseX, mouseY);
        y = nav(g, x, y, Section.MOVEMENT, ClientSettings.ru() ? "Движение" : "Movement", "move", mouseX, mouseY);
        y = nav(g, x, y, Section.VISUAL, ClientSettings.ru() ? "Визуалы" : "Visuals", "eye", mouseX, mouseY);
        y = nav(g, x, y, Section.PLAYER, ClientSettings.ru() ? "Игрок" : "Player", "player", mouseX, mouseY);
        y = nav(g, x, y, Section.MISC, ClientSettings.ru() ? "Разное" : "Misc", "misc", mouseX, mouseY);
        y += 10;
        g.drawString(font, ClientSettings.ru() ? "УПРАВЛЕНИЕ" : "MANAGE", x + 6, y, MUTED, false);
        y += 16;
        y = nav(g, x, y, Section.PRESETS, ClientSettings.ru() ? "Пресеты" : "Presets", "gear", mouseX, mouseY);
        y = nav(g, x, y, Section.AUTOBUY, ClientSettings.ru() ? "Авто покупка" : "Auto buy", "bag", mouseX, mouseY);
        nav(g, x, y, Section.ACCOUNTS, ClientSettings.ru() ? "Аккаунты" : "Accounts", "key", mouseX, mouseY);

        String name = "Player";
        if (minecraft != null && minecraft.player != null && minecraft.player.getGameProfile().name() != null) {
            name = minecraft.player.getGameProfile().name();
        }
        int py = winY + winH - 36;
        fill(g, winX + 14, py, 16, 16, 0xFF2A2A30);
        g.drawString(font, name, winX + 36, py, TEXT, false);
        g.drawString(font, ClientSettings.ru() ? "До 30 декабря 2027" : "Until Dec 30, 2027", winX + 36, py + 10, MUTED, false);
    }

    private int nav(GuiGraphics g, int x, int y, Section s, String label, String icon, int mx, int my) {
        int w = SIDE_W - 20;
        int h = 26;
        boolean on = section == s && query.isBlank();
        if (on) {
            stroke(g, x, y, w, h, accent());
            stroke(g, x + 1, y + 1, w - 2, h - 2, accent());
        } else if (inside(mx, my, x, y, w, h)) {
            round(g, x, y, w, h, 3, 0x2218181C);
        }
        icon(g, x + 8, y + 6, icon, on ? accent() : MUTED);
        g.drawString(font, label, x + 28, y + 8, on ? TEXT : MUTED, false);
        hit("nav", x, y, w, h, s);
        return y + 30;
    }

    private void drawCards(GuiGraphics g, int cx, int cy, int cw, int ch) {
        Map<String, List<Module>> groups = groups();
        int colW = (cw - 12) / 2;
        int leftY = cy - contentScroll;
        int rightY = cy - contentScroll;
        int col = 0;
        for (Map.Entry<String, List<Module>> e : groups.entrySet()) {
            List<Module> mods = e.getValue();
            if (mods.isEmpty()) {
                continue;
            }
            boolean shut = collapsed.contains(e.getKey());
            int h = CARD_HEAD + (shut ? 6 : mods.size() * ROW_H + 8);
            int x = col == 0 ? cx : cx + colW + 12;
            int y = col == 0 ? leftY : rightY;
            drawCard(g, x, y, colW, h, e.getKey(), mods, shut);
            if (col == 0) {
                leftY += h + 12;
            } else {
                rightY += h + 12;
            }
            col = leftY <= rightY ? 0 : 1;
        }
    }

    private void drawCard(GuiGraphics g, int x, int y, int w, int h, String sub, List<Module> mods, boolean shut) {
        fill(g, x + 2, y + 3, w, h, 0x33000000);
        round(g, x, y, w, h, 6, CARD);
        g.drawString(font, subLabel(sub), x + 12, y + 8, accent(), false);
        g.drawString(font, "⇅", x + w - 22, y + 8, MUTED, false);
        hit("collapse", x + w - 28, y, 28, CARD_HEAD, sub);
        if (shut) {
            return;
        }
        int ry = y + CARD_HEAD;
        for (Module module : mods) {
            g.drawString(font, displayName(module.name), x + 12, ry + 10, TEXT, false);
            int dotsX = x + Math.max(w / 2, w - 110);
            g.drawString(font, "···", dotsX, ry + 10, MUTED, false);
            if (!module.bind.isBlank()) {
                g.drawString(font, module.bind, dotsX - 36, ry + 10, MUTED, false);
            }
            pill(g, x + w - 40, ry + 8, module.enabled);
            hit("dots", dotsX - 8, ry, 28, ROW_H, module);
            hit("toggle", x + w - 44, ry, 36, ROW_H, module);
            hit("row", x, ry, dotsX - x - 4, ROW_H, module);
            ry += ROW_H;
        }
    }

    private void drawManage(GuiGraphics g, int cx, int cy, int cw) {
        int cardW = Math.min(420, cw);
        if (section == Section.PRESETS) {
            round(g, cx, cy, cardW, 120, 6, CARD);
            g.drawString(font, ClientSettings.ru() ? "Пресеты" : "Presets", cx + 14, cy + 10, accent(), false);
            g.drawString(font, ConfigStore.file().getFileName().toString(), cx + 14, cy + 28, MUTED, false);
            button(g, cx + 14, cy + 52, 110, 22, ClientSettings.ru() ? "Сохранить" : "Save", "save");
            button(g, cx + 132, cy + 52, 110, 22, ClientSettings.ru() ? "Загрузить" : "Load", "load");
            g.drawString(font, ClientSettings.autoSavePreset
                    ? (ClientSettings.ru() ? "автосохранение вкл" : "autosave on")
                    : (ClientSettings.ru() ? "автосохранение выкл" : "autosave off"), cx + 14, cy + 86, MUTED, false);
            hit("autosave", cx + 14, cy + 82, 200, 16, null);
        } else if (section == Section.AUTOBUY) {
            Module buy = ModuleManager.INSTANCE.byName("autobuy");
            int h = 70 + (buy == null ? 0 : buy.settings.size() * 18);
            round(g, cx, cy, cardW, h, 6, CARD);
            g.drawString(font, ClientSettings.ru() ? "Авто покупка" : "Auto buy", cx + 14, cy + 10, accent(), false);
            if (buy != null) {
                g.drawString(font, buy.name, cx + 14, cy + 30, TEXT, false);
                pill(g, cx + cardW - 40, cy + 28, buy.enabled);
                hit("toggle", cx + cardW - 44, cy + 20, 36, ROW_H, buy);
                int sy = cy + 54;
                for (BoolSetting setting : buy.settings) {
                    fill(g, cx + 14, sy, 10, 10, setting.value ? accent() : PILL_OFF);
                    g.drawString(font, setting.label, cx + 30, sy, TEXT, false);
                    hit("bool", cx + 14, sy - 2, 220, 14, setting);
                    sy += 18;
                }
            }
        } else {
            round(g, cx, cy, cardW, 90, 6, CARD);
            g.drawString(font, ClientSettings.ru() ? "Аккаунты" : "Accounts", cx + 14, cy + 10, accent(), false);
            String name = "Player";
            if (minecraft != null && minecraft.player != null && minecraft.player.getGameProfile().name() != null) {
                name = minecraft.player.getGameProfile().name();
            }
            g.drawString(font, name, cx + 14, cy + 32, TEXT, false);
            g.drawString(font, ClientSettings.ru() ? "До 30 декабря 2027" : "Until Dec 30, 2027", cx + 14, cy + 48, MUTED, false);
        }
    }

    private void drawSettings(GuiGraphics g, int mouseX, int mouseY) {
        int pw = 280;
        int px = winX + winW - pw - 16;
        int py = winY + TOP_H + 8;
        int ph = winH - TOP_H - 24;
        fill(g, winX + SIDE_W, winY + TOP_H, winW - SIDE_W, winH - TOP_H, 0x66000000);
        round(g, px, py, pw, ph, 6, 0xF016161A);
        g.drawString(font, displayName(open.name), px + 14, py + 12, TEXT, false);
        g.drawString(font, "×", px + pw - 20, py + 12, MUTED, false);
        hit("close", px + pw - 26, py + 6, 22, 20, null);
        if (binding) {
            g.drawString(font, ClientSettings.ru() ? "нажмите клавишу" : "press a key", px + 14, py + 30, accent(), false);
        } else {
            String bind = open.bind.isBlank() ? (ClientSettings.ru() ? "без бинда" : "no bind") : open.bind;
            g.drawString(font, bind, px + 14, py + 30, MUTED, false);
            hit("bind", px + 14, py + 26, 120, 14, open);
        }
        int sy = py + 52;
        int skip = settingScroll;
        for (BoolSetting setting : open.settings) {
            if (skip-- > 0) {
                continue;
            }
            fill(g, px + 14, sy, 10, 10, setting.value ? accent() : PILL_OFF);
            g.drawString(font, setting.label, px + 30, sy, TEXT, false);
            hit("bool", px + 14, sy - 2, 240, 14, setting);
            sy += 16;
            if (sy > py + ph - 18) {
                return;
            }
        }
        for (NumberSetting setting : open.numbers) {
            if (skip-- > 0) {
                continue;
            }
            float t = (setting.value - setting.min) / Math.max(0.0001F, setting.max - setting.min);
            fill(g, px + 14, sy + 10, 240, 6, PILL_OFF);
            fill(g, px + 14, sy + 10, Math.max(4, (int) (240 * t)), 6, accent());
            g.drawString(font, setting.label + " " + format(setting.value), px + 14, sy, TEXT, false);
            hit("num", px + 14, sy, 240, 18, setting);
            sy += 24;
            if (sy > py + ph - 18) {
                return;
            }
        }
    }

    private void drawBurgerMenu(GuiGraphics g) {
        int mx = winX + winW - 168;
        int my = winY + 40;
        round(g, mx, my, 152, 106, 5, 0xF01C1C20);
        String lang = ClientSettings.ru() ? "Язык: RU" : "Language: EN";
        String menu = (ClientSettings.ru() ? "Меню " : "Menu ") + ClientSettings.menuScale;
        String hud = "HUD " + ClientSettings.hudScale;
        String desc = ClientSettings.descriptions
                ? (ClientSettings.ru() ? "Описания вкл" : "Descriptions on")
                : (ClientSettings.ru() ? "Описания выкл" : "Descriptions off");
        String snap = ClientSettings.snapGuides
                ? (ClientSettings.ru() ? "Направляющие вкл" : "Snap guides on")
                : (ClientSettings.ru() ? "Направляющие выкл" : "Snap guides off");
        g.drawString(font, lang, mx + 10, my + 10, TEXT, false);
        g.drawString(font, menu, mx + 10, my + 28, TEXT, false);
        g.drawString(font, hud, mx + 10, my + 46, TEXT, false);
        g.drawString(font, desc, mx + 10, my + 64, TEXT, false);
        g.drawString(font, snap, mx + 10, my + 82, TEXT, false);
        hit("lang", mx, my + 6, 152, 18, null);
        hit("menu-scale", mx, my + 24, 152, 18, null);
        hit("hud-scale", mx, my + 42, 152, 18, null);
        hit("desc", mx, my + 60, 152, 18, null);
        hit("snap", mx, my + 78, 152, 18, null);
    }

    private Map<String, List<Module>> groups() {
        List<Module> src;
        if (!query.isBlank()) {
            String q = query.toLowerCase(Locale.ROOT);
            src = ModuleManager.INSTANCE.modules.stream()
                    .filter(m -> m.name.toLowerCase(Locale.ROOT).contains(q)
                            || m.id.toLowerCase(Locale.ROOT).contains(q)
                            || subLabel(m.subcategory).toLowerCase(Locale.ROOT).contains(q))
                    .toList();
        } else {
            src = ModuleManager.INSTANCE.byCategory(categoryOf(section));
        }
        Map<String, List<Module>> map = new LinkedHashMap<>();
        for (String key : SUB_ORDER) {
            map.put(key, new ArrayList<>());
        }
        for (Module module : src) {
            String key = module.subcategory.isBlank() ? "other" : module.subcategory;
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(module);
        }
        for (Map.Entry<String, List<Module>> e : map.entrySet()) {
            e.getValue().sort(order(e.getKey()));
        }
        return map;
    }

    private static Comparator<Module> order(String sub) {
        List<String> pref = switch (sub) {
            case "fighting" -> FIGHT_ORDER;
            case "tools" -> TOOL_ORDER;
            case "base" -> BASE_ORDER;
            case "other" -> OTHER_ORDER;
            default -> List.of();
        };
        return Comparator
                .comparingInt((Module m) -> {
                    int i = pref.indexOf(m.id);
                    return i < 0 ? 100 : i;
                })
                .thenComparing(m -> m.name);
    }

    private static Category categoryOf(Section s) {
        return switch (s) {
            case COMBAT -> Category.COMBAT;
            case MOVEMENT -> Category.MOVEMENT;
            case VISUAL -> Category.VISUAL;
            case PLAYER -> Category.PLAYER;
            default -> Category.MISC;
        };
    }

    static String displayName(String name) {
        if (name == null || name.isBlank()) {
            return "";
        }
        return name.replaceAll("([a-z])([A-Z])", "$1 $2")
                .replaceAll("([A-Za-z])(\\d)", "$1 $2");
    }

    private static String subLabel(String raw) {
        String key = raw == null || raw.isBlank() ? "other" : raw;
        if (!ClientSettings.ru()) {
            return switch (key) {
                case "fighting" -> "Fight";
                case "tools" -> "Tools";
                case "base" -> "Basic";
                case "other" -> "Other";
                case "auto" -> "Auto";
                case "world" -> "World";
                case "screen" -> "Screen";
                case "interface" -> "Interface";
                case "helper" -> "Helpers";
                case "trackers" -> "Trackers";
                case "client" -> "Client";
                default -> key;
            };
        }
        return switch (key) {
            case "fighting" -> "Драка";
            case "tools" -> "Инструменты";
            case "base" -> "Базовые";
            case "other" -> "Остальное";
            case "auto" -> "Авто";
            case "world" -> "Мир";
            case "screen" -> "Экран";
            case "interface" -> "Интерфейс";
            case "helper" -> "Хелперы";
            case "trackers" -> "Трекеры";
            case "client" -> "Клиент";
            default -> key;
        };
    }

    @Override
    public boolean mouseClicked(MouseButtonEvent event, boolean doubled) {
        double mx = event.x();
        double my = event.y();
        int button = event.button();
        frame();
        if (burger) {
            Hit item = at(mx, my, "lang", "menu-scale", "hud-scale", "desc", "snap", "burger");
            burger = false;
            if (item != null) {
                switch (item.kind) {
                    case "lang" -> ClientSettings.cycleLanguage();
                    case "menu-scale" -> ClientSettings.cycleMenuScale();
                    case "hud-scale" -> ClientSettings.cycleHudScale();
                    case "desc" -> ClientSettings.toggleDescriptions();
                    case "snap" -> ClientSettings.toggleSnapGuides();
                    default -> burger = true;
                }
                return true;
            }
        }
        Hit hit = at(mx, my);
        if (hit == null) {
            typing = false;
            if (open != null && mx < winX + winW - 296) {
                open = null;
                binding = false;
                return true;
            }
            return super.mouseClicked(event, doubled);
        }
        switch (hit.kind) {
            case "search" -> {
                typing = true;
                return true;
            }
            case "burger" -> {
                burger = !burger;
                typing = false;
                return true;
            }
            case "logo" -> {
                if (button == 1) {
                    ClientSettings.toggleDescriptions();
                } else {
                    ClientSettings.cycleLanguage();
                }
                return true;
            }
            case "nav" -> {
                section = (Section) hit.extra;
                query = "";
                contentScroll = 0;
                open = null;
                typing = false;
                return true;
            }
            case "collapse" -> {
                String key = (String) hit.extra;
                if (!collapsed.add(key)) {
                    collapsed.remove(key);
                }
                return true;
            }
            case "toggle", "row" -> {
                Module module = (Module) hit.extra;
                if (button == 2) {
                    open = module;
                    binding = true;
                } else if (button == 1) {
                    open = module;
                    binding = false;
                    settingScroll = 0;
                } else {
                    module.toggle();
                }
                return true;
            }
            case "dots" -> {
                open = (Module) hit.extra;
                binding = false;
                settingScroll = 0;
                return true;
            }
            case "close" -> {
                open = null;
                binding = false;
                return true;
            }
            case "bind" -> {
                binding = true;
                return true;
            }
            case "bool" -> {
                BoolSetting setting = (BoolSetting) hit.extra;
                setting.value = !setting.value;
                ConfigStore.save();
                return true;
            }
            case "num" -> {
                NumberSetting setting = (NumberSetting) hit.extra;
                if (button == 1) {
                    setting.nudge(-1);
                } else {
                    sliding = setting;
                    slide(setting, mx, hit.x);
                }
                ConfigStore.save();
                return true;
            }
            case "save" -> {
                ConfigStore.saveNow();
                return true;
            }
            case "load" -> {
                ConfigStore.load();
                return true;
            }
            case "autosave" -> {
                ClientSettings.autoSavePreset = !ClientSettings.autoSavePreset;
                ConfigStore.saveNow();
                return true;
            }
            default -> {
            }
        }
        typing = false;
        return super.mouseClicked(event, doubled);
    }

    @Override
    public boolean mouseReleased(MouseButtonEvent event) {
        sliding = null;
        return super.mouseReleased(event);
    }

    @Override
    public boolean mouseDragged(MouseButtonEvent event, double dx, double dy) {
        if (sliding != null) {
            Hit bar = at(event.x(), event.y(), "num");
            if (bar != null && bar.extra == sliding) {
                slide(sliding, event.x(), bar.x);
            } else {
                slide(sliding, event.x(), winX + winW - 280 - 16 + 14);
            }
            return true;
        }
        return super.mouseDragged(event, dx, dy);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double scrollX, double scrollY) {
        int dir = (int) Math.signum(scrollY);
        if (open != null && mouseX > winX + winW - 300) {
            int max = Math.max(0, open.settings.size() + open.numbers.size() - 16);
            settingScroll = Math.max(0, Math.min(max, settingScroll - dir));
            return true;
        }
        contentScroll = Math.max(0, contentScroll - dir * 24);
        return true;
    }

    @Override
    public boolean keyPressed(KeyEvent event) {
        if (binding && open != null) {
            if (event.key() == 256) {
                open.bind = "";
            } else {
                open.bind = bindName(event.key(), event.scancode());
            }
            binding = false;
            ConfigStore.save();
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
    public boolean charTyped(CharacterEvent event) {
        if (typing) {
            char ch = (char) event.codepoint();
            if (!Character.isISOControl(ch)) {
                query += ch;
            }
            return true;
        }
        return super.charTyped(event);
    }

    private void slide(NumberSetting setting, double mx, int barX) {
        float t = (float) Math.max(0, Math.min(1, (mx - barX) / 240.0));
        float raw = setting.min + t * (setting.max - setting.min);
        float stepped = Math.round(raw / setting.step) * setting.step;
        setting.value = Math.max(setting.min, Math.min(setting.max, stepped));
        ConfigStore.save();
    }

    private Hit at(double mx, double my, String... kinds) {
        for (int i = hits.size() - 1; i >= 0; i--) {
            Hit hit = hits.get(i);
            if (kinds.length > 0) {
                boolean ok = false;
                for (String kind : kinds) {
                    if (kind.equals(hit.kind)) {
                        ok = true;
                        break;
                    }
                }
                if (!ok) {
                    continue;
                }
            }
            if (inside(mx, my, hit.x, hit.y, hit.w, hit.h)) {
                return hit;
            }
        }
        return null;
    }

    private void button(GuiGraphics g, int x, int y, int w, int h, String label, String kind) {
        round(g, x, y, w, h, 4, 0xFF2A2A30);
        stroke(g, x, y, w, h, accent());
        g.drawString(font, label, x + 10, y + 7, TEXT, false);
        hit(kind, x, y, w, h, null);
    }

    private void pill(GuiGraphics g, int x, int y, boolean on) {
        fill(g, x, y, 28, 14, on ? accent() : PILL_OFF);
        fill(g, x + 1, y + 1, 26, 12, on ? accent() : PILL_OFF);
        if (on) {
            fill(g, x + 15, y + 2, 11, 10, 0xFFF2E9FF);
        } else {
            fill(g, x + 2, y + 2, 11, 10, KNOB_OFF);
        }
    }

    private void icon(GuiGraphics g, int x, int y, String id, int color) {
        switch (id) {
            case "combat" -> {
                fill(g, x + 5, y + 1, 2, 12, color);
                fill(g, x + 1, y + 5, 12, 2, color);
                fill(g, x + 4, y + 4, 4, 4, color);
            }
            case "move" -> {
                fill(g, x + 6, y + 1, 2, 12, color);
                fill(g, x + 1, y + 6, 12, 2, color);
            }
            case "eye" -> {
                fill(g, x + 1, y + 5, 12, 4, color);
                fill(g, x + 5, y + 4, 4, 6, color);
            }
            case "player" -> {
                fill(g, x + 5, y + 1, 4, 4, color);
                fill(g, x + 3, y + 6, 8, 7, color);
            }
            case "misc" -> {
                fill(g, x + 2, y + 3, 3, 3, color);
                fill(g, x + 9, y + 3, 3, 3, color);
                fill(g, x + 5, y + 9, 3, 3, color);
            }
            case "gear" -> {
                fill(g, x + 3, y + 3, 8, 8, color);
                fill(g, x + 5, y + 5, 4, 4, SIDEBAR);
            }
            case "bag" -> {
                fill(g, x + 3, y + 4, 8, 8, color);
                fill(g, x + 5, y + 2, 4, 3, color);
            }
            default -> {
                fill(g, x + 2, y + 5, 10, 3, color);
                fill(g, x + 8, y + 3, 3, 7, color);
            }
        }
    }

    private static void ring(GuiGraphics g, int x, int y, int color) {
        fill(g, x, y, 7, 1, color);
        fill(g, x, y + 6, 7, 1, color);
        fill(g, x, y, 1, 7, color);
        fill(g, x + 6, y, 1, 7, color);
    }

    private void hit(String kind, int x, int y, int w, int h, Object extra) {
        hits.add(new Hit(kind, x, y, w, h, extra));
    }

    private static void fill(GuiGraphics g, int x, int y, int w, int h, int color) {
        g.fill(x, y, x + w, y + h, color);
    }

    private static void round(GuiGraphics g, int x, int y, int w, int h, int r, int color) {
        fill(g, x + r, y, w - r * 2, h, color);
        fill(g, x, y + r, w, h - r * 2, color);
        fill(g, x + 1, y + 1, r, r, color);
        fill(g, x + w - r - 1, y + 1, r, r, color);
        fill(g, x + 1, y + h - r - 1, r, r, color);
        fill(g, x + w - r - 1, y + h - r - 1, r, r, color);
    }

    private static void stroke(GuiGraphics g, int x, int y, int w, int h, int color) {
        fill(g, x, y, w, 1, color);
        fill(g, x, y + h - 1, w, 1, color);
        fill(g, x, y, 1, h, color);
        fill(g, x + w - 1, y, 1, h, color);
    }

    private static boolean inside(double mx, double my, int x, int y, int w, int h) {
        return mx >= x && my >= y && mx <= x + w && my <= y + h;
    }

    private static String bindName(int key, int scancode) {
        String name = org.lwjgl.glfw.GLFW.glfwGetKeyName(key, scancode);
        if (name != null && !name.isBlank()) {
            return name.toUpperCase(Locale.ROOT);
        }
        return switch (key) {
            case org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_SHIFT -> "RSHIFT";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_SHIFT -> "LSHIFT";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_CONTROL -> "RCTRL";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_CONTROL -> "CTRL";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_ALT -> "ALT";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_ALT -> "RALT";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_INSERT -> "INSERT";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_DELETE -> "DELETE";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_HOME -> "HOME";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_END -> "END";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_SPACE -> "SPACE";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_TAB -> "TAB";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F1 -> "F1";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F2 -> "F2";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F3 -> "F3";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F4 -> "F4";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F5 -> "F5";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F6 -> "F6";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F7 -> "F7";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F8 -> "F8";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F9 -> "F9";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F10 -> "F10";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F11 -> "F11";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F12 -> "F12";
            default -> "";
        };
    }

    private static String format(float value) {
        if (Math.abs(value - Math.round(value)) < 0.001F) {
            return Integer.toString(Math.round(value));
        }
        return String.format(Locale.ROOT, "%.2f", value);
    }
}
