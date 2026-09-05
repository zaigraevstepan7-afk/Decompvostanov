package fun.nursultan.client.module;

import fun.nursultan.client.modules.GeneratedModules;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;

public final class ModuleManager {
    public static final ModuleManager INSTANCE = new ModuleManager();
    public final List<Module> modules = new ArrayList<>();

    private ModuleManager() {
        GeneratedModules.register(modules);
    }

    public List<Module> byCategory(Category category) {
        List<Module> out = new ArrayList<>();
        for (Module module : modules) {
            if (module.category == category) {
                out.add(module);
            }
        }
        return out;
    }

    public Module byName(String name) {
        for (Module module : modules) {
            if (module.name.equalsIgnoreCase(name) || module.id.equalsIgnoreCase(name)) {
                return module;
            }
        }
        return null;
    }

    public void tick(Minecraft mc) {
        for (Module module : modules) {
            if (module.enabled) {
                module.onTick(mc);
            }
        }
    }

    public void renderWorld(Minecraft mc, float tickDelta) {
        for (Module module : modules) {
            if (module.enabled) {
                module.onRenderWorld(mc, tickDelta);
            }
        }
    }

    public void toggleBind(int glfwKey) {
        String name = org.lwjgl.glfw.GLFW.glfwGetKeyName(glfwKey, 0);
        if (name == null) {
            return;
        }
        String key = name.toUpperCase();
        for (Module module : modules) {
            if (key.equals(module.bind)) {
                module.toggle();
            }
        }
    }
}
