package fun.nursultan.client.module;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;

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
        settings.add(new BoolSetting(id, id.replace('-', ' '), def));
    }

    public void onEnable() {}

    public void onDisable() {}

    public void onTick(Minecraft mc) {}

    public void onRenderWorld(Minecraft mc, float tickDelta) {}
}
