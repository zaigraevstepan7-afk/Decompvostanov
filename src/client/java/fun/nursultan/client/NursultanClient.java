package fun.nursultan.client;

import fun.nursultan.client.config.ConfigStore;
import fun.nursultan.client.module.ModuleManager;
import fun.nursultan.client.ui.ClickGuiScreen;
import fun.nursultan.client.ui.HudOverlay;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.minecraft.client.KeyMapping;
import net.minecraft.resources.Identifier;
import org.lwjgl.glfw.GLFW;

public final class NursultanClient implements ClientModInitializer {
    public static final String ID = "nursultan";
    private static KeyMapping menuKey;

    @Override
    public void onInitializeClient() {
        ModuleManager.INSTANCE.getClass();
        ConfigStore.load();
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
            if (!(mc.screen instanceof ClickGuiScreen)) {
                ModuleManager.INSTANCE.pollBinds(mc);
            }
            ModuleManager.INSTANCE.tick(mc);
        });
        HudElementRegistry.addLast(Identifier.fromNamespaceAndPath("nursultan", "hud"), (graphics, tickCounter) -> HudOverlay.render(graphics));
        System.out.println("Nursultan initialized · " + ModuleManager.INSTANCE.modules.size() + " modules · menu Right Shift");
    }
}
