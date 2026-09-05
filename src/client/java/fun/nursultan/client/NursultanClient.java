package fun.nursultan.client;

import fun.nursultan.client.module.ModuleManager;
import fun.nursultan.client.ui.ClickGuiScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.resources.Identifier;
import org.lwjgl.glfw.GLFW;

public final class NursultanClient implements ClientModInitializer {
    public static final String ID = "nursultan";
    private static KeyMapping menuKey;

    @Override
    public void onInitializeClient() {
        ModuleManager.INSTANCE.getClass();
        KeyMapping.Category category = KeyMapping.Category.register(Identifier.fromNamespaceAndPath("nursultan", "menu"));
        menuKey = KeyBindingHelper.registerKeyBinding(new KeyMapping(
                "key.nursultan.menu",
                GLFW.GLFW_KEY_RIGHT_SHIFT,
                category));
        ClientTickEvents.END_CLIENT_TICK.register(mc -> {
            while (menuKey.consumeClick()) {
                if (mc.screen == null) {
                    mc.setScreen(new ClickGuiScreen());
                } else if (mc.screen instanceof ClickGuiScreen) {
                    mc.setScreen(null);
                }
            }
            if (mc.screen == null) {
                ModuleManager.INSTANCE.tick(mc);
            }
        });
        System.out.println("Nursultan initialized · " + ModuleManager.INSTANCE.modules.size() + " modules · menu Right Shift");
    }
}
