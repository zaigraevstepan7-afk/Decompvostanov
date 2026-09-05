package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.module.ModuleManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;

/** Restored from KDFzREm.jc — module-toggle / armor-durability / irc-ping. */
public final class Notifications extends Module {
    private final Map<String, Boolean> last = new HashMap<>();
    private final List<String> lines = new ArrayList<>();

    public Notifications() {
        super("notifications", "Notifications", Category.VISUAL, "", "KDFzREm.jc", 29);
        bool("module-toggle", true);
        bool("armor-durability", true);
        bool("irc-ping", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (setting("module-toggle")) {
            for (Module module : ModuleManager.INSTANCE.modules) {
                Boolean prev = last.put(module.id, module.enabled);
                if (prev != null && prev != module.enabled) {
                    push(module.name + (module.enabled ? " on" : " off"));
                }
            }
        }
        if (setting("armor-durability") && mc.player != null && mc.player.tickCount % 40 == 0) {
            for (EquipmentSlot slot : EquipmentSlot.values()) {
                if (slot.getType() != EquipmentSlot.Type.HUMANOID_ARMOR) {
                    continue;
                }
                ItemStack stack = mc.player.getItemBySlot(slot);
                if (stack.isEmpty() || !stack.isDamageableItem()) {
                    continue;
                }
                int left = stack.getMaxDamage() - stack.getDamageValue();
                if (left < stack.getMaxDamage() * 0.15F) {
                    push("armor " + slot.getName() + " " + left);
                }
            }
        }
    }

    private void push(String line) {
        lines.add(0, line);
        while (lines.size() > 8) {
            lines.remove(lines.size() - 1);
        }
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) {
            return;
        }
        int y = 60;
        if (setting("module-toggle")) {
            long on = ModuleManager.INSTANCE.modules.stream().filter(m -> m.enabled).count();
            g.drawString(mc.font, "on " + on, width - 50, y, 0xFF9FCA2B, false);
            y += 12;
        }
        if (setting("armor-durability")) {
            g.drawString(mc.font, "armor " + mc.player.getArmorValue(), width - 70, y, 0xFFF2E9FF, false);
            y += 12;
        }
        if (setting("irc-ping") && mc.getCurrentServer() != null) {
            g.drawString(mc.font, "ping " + mc.getCurrentServer().ping, width - 70, y, 0xFF8A8A96, false);
            y += 12;
        }
        for (String line : lines) {
            g.drawString(mc.font, line, width - 8 - mc.font.width(line), y, 0xFFF2E9FF, false);
            y += 10;
        }
    }
}
