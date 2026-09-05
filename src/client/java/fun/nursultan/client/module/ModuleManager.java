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

    private final java.util.Set<String> heldBinds = new java.util.HashSet<>();

    public void pollBinds(Minecraft mc) {
        if (mc.getWindow() == null) {
            return;
        }
        long window = mc.getWindow().handle();
        java.util.Set<String> down = new java.util.HashSet<>();
        for (Module module : modules) {
            if (module.bind == null || module.bind.isBlank()) {
                continue;
            }
            int key = bindToGlfw(module.bind);
            if (key == -1) {
                continue;
            }
            boolean pressed = org.lwjgl.glfw.GLFW.glfwGetKey(window, key) == org.lwjgl.glfw.GLFW.GLFW_PRESS;
            if (pressed) {
                down.add(module.bind);
                if (!heldBinds.contains(module.bind)) {
                    module.toggle();
                }
            }
        }
        heldBinds.clear();
        heldBinds.addAll(down);
    }

    private static int bindToGlfw(String bind) {
        String key = bind.toUpperCase();
        if (key.length() == 1) {
            char c = key.charAt(0);
            if (c >= 'A' && c <= 'Z') {
                return org.lwjgl.glfw.GLFW.GLFW_KEY_A + (c - 'A');
            }
            if (c >= '0' && c <= '9') {
                return org.lwjgl.glfw.GLFW.GLFW_KEY_0 + (c - '0');
            }
        }
        return switch (key) {
            case "RSHIFT", "RIGHT SHIFT" -> org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_SHIFT;
            case "LSHIFT", "LEFT SHIFT", "SHIFT" -> org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_SHIFT;
            case "SPACE" -> org.lwjgl.glfw.GLFW.GLFW_KEY_SPACE;
            case "TAB" -> org.lwjgl.glfw.GLFW.GLFW_KEY_TAB;
            case "CTRL", "LCTRL" -> org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_CONTROL;
            case "RCTRL" -> org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_CONTROL;
            case "ALT", "LALT" -> org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_ALT;
            case "RALT" -> org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_ALT;
            case "INSERT" -> org.lwjgl.glfw.GLFW.GLFW_KEY_INSERT;
            case "DELETE" -> org.lwjgl.glfw.GLFW.GLFW_KEY_DELETE;
            case "HOME" -> org.lwjgl.glfw.GLFW.GLFW_KEY_HOME;
            case "END" -> org.lwjgl.glfw.GLFW.GLFW_KEY_END;
            case "F1" -> org.lwjgl.glfw.GLFW.GLFW_KEY_F1;
            case "F2" -> org.lwjgl.glfw.GLFW.GLFW_KEY_F2;
            case "F3" -> org.lwjgl.glfw.GLFW.GLFW_KEY_F3;
            case "F4" -> org.lwjgl.glfw.GLFW.GLFW_KEY_F4;
            case "F5" -> org.lwjgl.glfw.GLFW.GLFW_KEY_F5;
            case "F6" -> org.lwjgl.glfw.GLFW.GLFW_KEY_F6;
            case "F7" -> org.lwjgl.glfw.GLFW.GLFW_KEY_F7;
            case "F8" -> org.lwjgl.glfw.GLFW.GLFW_KEY_F8;
            case "F9" -> org.lwjgl.glfw.GLFW.GLFW_KEY_F9;
            case "F10" -> org.lwjgl.glfw.GLFW.GLFW_KEY_F10;
            case "F11" -> org.lwjgl.glfw.GLFW.GLFW_KEY_F11;
            case "F12" -> org.lwjgl.glfw.GLFW.GLFW_KEY_F12;
            default -> -1;
        };
    }
}
