package fun.nursultan.client.modules.visual;

import com.mojang.authlib.GameProfile;
import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;

/** Restored from KDFzREm.TP — walk / rotate / Steve + dump name pool. */
public final class FakePlayer extends Module {
    private static final String[] NAMES = {
            "Steve", "Alex", "Herobrine", "Nagibator", "Vitalik", "Sanya", "Dimon", "Leha",
            "KolyaPRO", "Artem", "Nikita", "Timoha", "Zhenya", "MaksFX", "Vladik"
    };
    private static final int ENTITY_ID = 1_900_000_007;
    private RemotePlayer spawned;
    private double originX;
    private double originY;
    private double originZ;
    private float walkPhase;

    public FakePlayer() {
        super("fakeplayer", "FakePlayer", Category.VISUAL, "world", "KDFzREm.TP", 54);
        bool("walk", true);
        bool("rotate", true);
        bool("Steve", true);
    }

    @Override
    public void onEnable() {
        spawn();
    }

    @Override
    public void onDisable() {
        despawn();
    }

    @Override
    public void onTick(Minecraft mc) {
        if (spawned == null || mc.level == null) {
            if (mc.level != null) {
                spawn();
            }
            return;
        }
        if (spawned.level() != mc.level) {
            despawn();
            spawn();
            return;
        }
        if (setting("rotate")) {
            spawned.setYRot(spawned.getYRot() + 3.5F);
            spawned.yHeadRot = spawned.getYRot();
            spawned.yBodyRot = spawned.getYRot();
        }
        if (setting("walk")) {
            walkPhase += 0.12F;
            double x = originX + Math.sin(walkPhase) * 1.6;
            double z = originZ + Math.cos(walkPhase) * 1.6;
            spawned.setPos(x, originY, z);
            spawned.setDeltaMovement(Math.cos(walkPhase) * 0.08, 0, -Math.sin(walkPhase) * 0.08);
        }
    }

    private void spawn() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || mc.level == null) {
            return;
        }
        despawn();
        String name = setting("Steve") ? "Steve" : NAMES[(int) (System.nanoTime() % NAMES.length)];
        RemotePlayer fake = new RemotePlayer(mc.level, new GameProfile(UUID.nameUUIDFromBytes(("nursultan-fp-" + name).getBytes()), name));
        fake.setId(ENTITY_ID);
        originX = mc.player.getX();
        originY = mc.player.getY();
        originZ = mc.player.getZ();
        fake.absSnapTo(originX, originY, originZ, mc.player.getYRot(), mc.player.getXRot());
        fake.setCustomName(Component.literal(name));
        fake.setCustomNameVisible(true);
        for (EquipmentSlot slot : EquipmentSlot.values()) {
            fake.setItemSlot(slot, mc.player.getItemBySlot(slot).copy());
        }
        mc.level.addEntity(fake);
        spawned = fake;
        mc.player.displayClientMessage(Component.literal("FakePlayer " + name + " @ " + (int) originX + " " + (int) originY + " " + (int) originZ), false);
    }

    private void despawn() {
        Minecraft mc = Minecraft.getInstance();
        if (spawned != null && mc.level != null) {
            mc.level.removeEntity(spawned.getId(), net.minecraft.world.entity.Entity.RemovalReason.DISCARDED);
        }
        spawned = null;
    }
}
