package fun.nursultan.client.module;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

public abstract class Module {
    public final String id;
    public final String name;
    public final Category category;
    public final String subcategory;
    public final String dumpClass;
    public final int dumpMethods;
    public boolean enabled;
    public String bind = "";
    public final List<BoolSetting> settings = new ArrayList<>();
    public final List<NumberSetting> numbers = new ArrayList<>();

    protected Module(String id, String name, Category category, String subcategory, String dumpClass, int dumpMethods) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.subcategory = subcategory == null ? "" : subcategory;
        this.dumpClass = dumpClass;
        this.dumpMethods = dumpMethods;
    }

    public void toggle() {
        setEnabled(!enabled);
    }

    public void setEnabled(boolean value) {
        if (enabled == value) {
            return;
        }
        enabled = value;
        if (enabled) {
            onEnable();
        } else {
            onDisable();
        }
        if (fun.nursultan.client.ClientSettings.autoSavePreset && !fun.nursultan.client.ClientSettings.loading) {
            fun.nursultan.client.config.ConfigStore.save();
        }
    }

    public boolean setting(String id) {
        for (BoolSetting setting : settings) {
            if (setting.id.equals(id)) {
                return setting.value;
            }
        }
        return false;
    }

    protected void bool(String id, boolean def) {
        if (settings.stream().anyMatch(s -> s.id.equals(id))) {
            throw new IllegalStateException("Setting with key %s already registered".formatted(id));
        }
        settings.add(new BoolSetting(id, labelOf(id), def));
    }

    protected void number(String id, float def, float min, float max, float step) {
        if (numbers.stream().anyMatch(s -> s.id.equals(id))) {
            throw new IllegalStateException("Setting with key %s already registered".formatted(id));
        }
        numbers.add(new NumberSetting(id, labelOf(id), def, min, max, step));
    }

    /** Dump leftover from zf descriptions — class / methods / settings, not invented lore. */
    public String dumpHint() {
        return dumpClass + " · " + dumpMethods + " fn · " + (settings.size() + numbers.size()) + " set";
    }

    private static String labelOf(String id) {
        String[] parts = id.replace('.', ' ').replace('-', ' ').split(" ");
        StringBuilder out = new StringBuilder();
        for (String part : parts) {
            if (part.isBlank()) {
                continue;
            }
            if (!out.isEmpty()) {
                out.append(' ');
            }
            out.append(Character.toUpperCase(part.charAt(0)));
            if (part.length() > 1) {
                out.append(part.substring(1));
            }
        }
        return out.toString();
    }

    public float numberValue(String id, float fallback) {
        for (NumberSetting setting : numbers) {
            if (setting.id.equals(id)) {
                return setting.value;
            }
        }
        return fallback;
    }

    public void onEnable() {}

    public void onDisable() {}

    public void onTick(Minecraft mc) {}

    public void onRenderWorld(Minecraft mc, float tickDelta) {}

    public void onHud(GuiGraphics g, int width, int height) {}
}
