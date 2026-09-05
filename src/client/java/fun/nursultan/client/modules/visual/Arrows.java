package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.villager.Villager;
import net.minecraft.world.entity.player.Player;

/** Restored from KDFzREm.TQ — players/friends/villagers/monsters/animals/items/party/entities. */
public final class Arrows extends Module {
    public Arrows() {
        super("arrows", "Arrows", Category.VISUAL, "screen", "KDFzREm.TQ", 40);
        bool("players", true);
        bool("friends", true);
        bool("villagers", false);
        bool("monsters", false);
        bool("animals", false);
        bool("items", false);
        bool("party", true);
        bool("entities", false);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || mc.level == null) {
            return;
        }
        int cx = width / 2;
        int cy = height / 2;
        for (Entity entity : mc.level.getEntities(mc.player, mc.player.getBoundingBox().inflate(64))) {
            int color = colorOf(entity);
            if (color == 0) {
                continue;
            }
            double dx = entity.getX() - mc.player.getX();
            double dz = entity.getZ() - mc.player.getZ();
            double yaw = Math.toRadians(mc.player.getYRot());
            double rx = dx * Math.cos(yaw) + dz * Math.sin(yaw);
            double rz = -dx * Math.sin(yaw) + dz * Math.cos(yaw);
            double ang = Math.atan2(rx, rz);
            int x = cx + (int) (Math.sin(ang) * 40);
            int y = cy - (int) (Math.cos(ang) * 40);
            g.fill(x - 2, y - 2, x + 2, y + 2, color);
        }
    }

    private int colorOf(Entity entity) {
        if (entity instanceof Player player) {
            if (fun.nursultan.client.util.Friends.isFriend(player)) {
                return setting("friends") || setting("party") ? 0xFF64B5F6 : 0;
            }
            return setting("players") ? 0xFF9FCA2B : 0;
        }
        if (entity instanceof Villager) {
            return setting("villagers") ? 0xFFFFB74D : 0;
        }
        if (entity instanceof Monster) {
            return setting("monsters") ? 0xFFE57373 : 0;
        }
        if (entity instanceof Animal) {
            return setting("animals") ? 0xFF81C784 : 0;
        }
        if (entity instanceof ItemEntity) {
            return setting("items") ? 0xFFFFF176 : 0;
        }
        if (entity instanceof LivingEntity) {
            return setting("entities") ? 0xFFCE93D8 : 0;
        }
        return 0;
    }
}
