package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
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
        bool("health-bar", true);
        bool("box-color", true);
        bool("name", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
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
}
