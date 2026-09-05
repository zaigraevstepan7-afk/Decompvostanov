package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.modules.combat.Targeting;
import fun.nursultan.client.util.ClientHooks;
import fun.nursultan.client.util.Friends;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.villager.Villager;
import net.minecraft.world.entity.player.Player;

/** Restored from KDFzREm.Ta — players/friends/villagers/monsters/animals + health-bar. */
public final class EntityESP extends Module {
    private final java.util.Map<Integer, net.minecraft.world.phys.Vec3> lastPos = new java.util.HashMap<>();
    private final java.util.Map<Integer, Integer> idle = new java.util.HashMap<>();
    public EntityESP() {
        super("entityesp", "EntityESP", Category.VISUAL, "screen", "KDFzREm.Ta", 72);
        bool("players", true);
        bool("friends", true);
        bool("villagers", false);
        bool("monsters", true);
        bool("animals", false);
        bool("invisible", false);
        bool("naked", false);
        bool("bot", false);
        bool("self", false);
        bool("through-walls", true);
        bool("entities", true);
        bool("health-bar", true);
        bool("health-bar-color", true);
        bool("health-bar-color-bottom", true);
        bool("health", true);
        bool("box-color", true);
        bool("box", true);
        bool("chams", false);
        bool("ft-spheres", false);
        bool("equipment", false);
        bool("name", true);
        bool("items", false);
        bool("chest-minecart", false);
        bool("dormant", false);
        number("dormant-display-time", 20, 1, 80, 1);
        number("equipment-size", 1, 0.5F, 2, 0.1F);
        bool("shader", false);
        bool("hold-in-hands", false);
        bool("item-name", false);
        bool("item-name-mode", false);
        bool("health-bar-mode", true);
        bool("details", true);
        bool("_1x", true);
        bool("_2x", false);
        bool("custom", false);
        bool("client", true);
        bool("formatted", true);
        bool("both", false);
        bool("target-condition", false);
        number("scale", 1, 0.5F, 2, 0.1F);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (!setting("entities") || mc.player == null || mc.level == null) {
            return;
        }
        if (setting("chest-minecart")) {
            for (var cart : mc.level.getEntitiesOfClass(
                    net.minecraft.world.entity.vehicle.minecart.MinecartChest.class,
                    mc.player.getBoundingBox().inflate(48))) {
                cart.setGlowingTag(true);
            }
        }
        for (LivingEntity entity : mc.level.getEntitiesOfClass(
                LivingEntity.class, mc.player.getBoundingBox().inflate(80), e -> accept(mc.player, e))) {
            entity.setGlowingTag(true);
            if (setting("health-bar") || setting("name")) {
                entity.setCustomNameVisible(true);
            }
        }
    }

    private boolean accept(Player self, LivingEntity entity) {
        if (!entity.isAlive()) {
            return false;
        }
        if (setting("target-condition") && Targeting.nearest(Minecraft.getInstance(), 24, null) != entity) {
            return false;
        }
        if (!setting("through-walls") && self != null && !self.hasLineOfSight(entity)) {
            return false;
        }
        if (entity == self) {
            return setting("self");
        }
        if (!setting("invisible") && entity.isInvisible()) {
            return false;
        }
        if (entity instanceof Player player) {
            if (Friends.isFriend(player)) {
                return setting("friends");
            }
            if (!setting("bot") && ClientHooks.skipBot(player)) {
                return false;
            }
            if (setting("naked") && player.getArmorValue() > 0) {
                return false;
            }
            return setting("players");
        }
        if (entity instanceof Villager) {
            return setting("villagers");
        }
        if (entity instanceof Monster) {
            return setting("monsters");
        }
        if (entity instanceof Animal) {
            return setting("animals");
        }
        return false;
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level == null || mc.player == null) {
            return;
        }
        for (LivingEntity entity : mc.level.getEntitiesOfClass(
                LivingEntity.class, mc.player.getBoundingBox().inflate(80), e -> true)) {
            entity.setGlowingTag(false);
        }
    }

    @Override
    public void onHud(net.minecraft.client.gui.GuiGraphics g, int width, int height) {
        if (!setting("entities") || !setting("health-bar") && !setting("name")) {
            return;
        }
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || mc.level == null) {
            return;
        }
        float ui = numberValue("scale", 1);
        if (setting("_2x")) {
            ui *= 2;
        } else if (setting("custom")) {
            ui *= 1.25F;
        }
        int y = 72;
        int accent = fun.nursultan.client.ClientSettings.accent;
        int barW = Math.max(40, (int) (110 * ui));
        for (LivingEntity entity : mc.level.getEntitiesOfClass(
                LivingEntity.class, mc.player.getBoundingBox().inflate(48), e -> accept(mc.player, e))) {
            boolean dim = false;
            if (setting("dormant")) {
                var now = entity.position();
                var prev = lastPos.put(entity.getId(), now);
                if (prev != null && prev.distanceToSqr(now) < 0.0004) {
                    int n = idle.merge(entity.getId(), 1, Integer::sum);
                    if (n > numberValue("dormant-display-time", 20)) {
                        dim = true;
                    }
                } else {
                    idle.put(entity.getId(), 0);
                }
            }
            String label = entity.getName().getString();
            if ((setting("item-name") || setting("item-name-mode")) && !entity.getMainHandItem().isEmpty()) {
                label += " · " + entity.getMainHandItem().getHoverName().getString();
            }
            float max = Math.max(1.0F, entity.getMaxHealth());
            float pct = Math.max(0, Math.min(1, entity.getHealth() / max));
            int color = setting("health-bar-color") ? 0xFF4CAF50 : accent;
            if (setting("health-bar-color-bottom") && pct < 0.35F) {
                color = 0xFFE53935;
            } else if (setting("health-bar-color-bottom") && pct < 0.65F) {
                color = 0xFFFFC107;
            }
            if (dim) {
                color = 0xFF666666;
            }
            int x = width - barW - 8;
            g.fill(x, y, x + barW, y + 11, 0x66000000);
            g.fill(x, y, x + (int) (barW * pct), y + 11, color);
            if (setting("name") || setting("health")) {
                String text = setting("health") ? label + " " + (int) entity.getHealth() : label;
                g.drawString(mc.font, text, x + 2, y + 2, 0xFFFFFFFF, false);
            }
            if (setting("equipment") && entity instanceof Player) {
                int slotX = x;
                float scale = numberValue("equipment-size", 1);
                int size = Math.max(8, (int) (12 * scale));
                for (var slot : net.minecraft.world.entity.EquipmentSlot.values()) {
                    if (slot.getType() != net.minecraft.world.entity.EquipmentSlot.Type.HUMANOID_ARMOR) {
                        continue;
                    }
                    var worn = entity.getItemBySlot(slot);
                    if (!worn.isEmpty()) {
                        g.renderItem(worn, slotX, y + 12);
                    }
                    slotX += size;
                }
                y += size + 2;
            }
            y += 13;
            if (y > height - 48) {
                break;
            }
        }
    }
}
