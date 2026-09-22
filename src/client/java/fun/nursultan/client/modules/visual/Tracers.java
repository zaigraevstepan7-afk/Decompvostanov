package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Friends;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

/** Restored from KDFzREm.jQ — players/friends/entities. */
public final class Tracers extends Module {
    public Tracers() {
        super("tracers", "Tracers", Category.VISUAL, "screen", "KDFzREm.jQ", 23);
        bool("players", true);
        bool("friends", true);
        bool("entities", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        for (LivingEntity entity : mc.level.getEntitiesOfClass(
                LivingEntity.class, mc.player.getBoundingBox().inflate(80), e -> accept(mc.player, e))) {
            entity.setGlowingTag(true);
        }
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || mc.level == null) {
            return;
        }
        int cx = width / 2;
        int cy = height / 2;
        for (LivingEntity entity : mc.level.getEntitiesOfClass(
                LivingEntity.class, mc.player.getBoundingBox().inflate(80), e -> accept(mc.player, e))) {
            double dx = entity.getX() - mc.player.getX();
            double dz = entity.getZ() - mc.player.getZ();
            double yaw = Math.toRadians(mc.player.getYRot());
            double rx = dx * Math.cos(yaw) + dz * Math.sin(yaw);
            double rz = -dx * Math.sin(yaw) + dz * Math.cos(yaw);
            double ang = Math.atan2(rx, rz);
            int x = cx + (int) (Math.sin(ang) * 55);
            int y = cy - (int) (Math.cos(ang) * 55);
            int color = entity instanceof Player && Friends.isFriend(entity) ? 0xFF64B5F6 : fun.nursultan.client.ClientSettings.accent;
            g.fill(cx - 1, cy - 1, x + 1, y + 1, color & 0x44FFFFFF);
            g.fill(x - 1, y - 1, x + 1, y + 1, color);
        }
    }

    private boolean accept(Player self, LivingEntity entity) {
        if (entity == self || !entity.isAlive()) {
            return false;
        }
        if (entity instanceof Player player) {
            if (Friends.isFriend(player)) {
                return setting("friends");
            }
            return setting("players");
        }
        return setting("entities");
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
}
