package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.modules.combat.Targeting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.entity.LivingEntity;

/** Restored from KDFzREm.jH @UZ TargetInfo */
public final class TargetInfo extends Module {
    public TargetInfo() {
        super("targetinfo", "TargetInfo", Category.VISUAL, "interface", "KDFzREm.jH", 26);
        bool("show-from-mouse", true);
        bool("show-armor-details", true);
        bool("show-absorption", true);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        LivingEntity target = null;
        if (setting("show-from-mouse") && mc.hitResult instanceof net.minecraft.world.phys.EntityHitResult hit
                && hit.getEntity() instanceof LivingEntity living) {
            target = living;
        }
        if (target == null) {
            target = Targeting.nearest(mc, 24);
        }
        if (target == null) {
            return;
        }
        int x = width / 2 - 60;
        int y = height / 2 + 24;
        g.fill(x, y, x + 120, y + 40, 0xE00E0E12);
        g.drawString(mc.font, target.getName().getString(), x + 4, y + 4, 0xFFF2E9FF, false);
        float hp = target.getHealth() + (setting("show-absorption") ? target.getAbsorptionAmount() : 0);
        g.drawString(mc.font, String.format("hp %.1f", hp), x + 4, y + 14, fun.nursultan.client.ClientSettings.accent, false);
        if (setting("show-armor-details") && target instanceof net.minecraft.world.entity.player.Player player) {
            g.drawString(mc.font, "armor " + player.getArmorValue(), x + 4, y + 24, 0xFF8A8A96, false);
            int ax = x + 70;
            for (var slot : net.minecraft.world.entity.EquipmentSlot.values()) {
                if (slot.getType() != net.minecraft.world.entity.EquipmentSlot.Type.HUMANOID_ARMOR) {
                    continue;
                }
                var worn = player.getItemBySlot(slot);
                if (!worn.isEmpty()) {
                    g.renderItem(worn, ax, y + 20);
                    ax += 12;
                }
            }
        }
    }
}
