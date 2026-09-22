#!/usr/bin/env python3
"""Generate remaining Nursultan UM ports from dump metadata."""
from pathlib import Path

ROOT = Path("/workspace/src/client/java/fun/nursultan/client/modules")

def write(rel, text):
    path = ROOT / rel
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(text.strip() + "\n")
    print("wrote", path.relative_to(ROOT))

# --- combat ---
write("combat/AntiBot.java", r'''
package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;

/** Restored from KDFzREm.UU @UZ AntiBot */
public final class AntiBot extends Module {
    public AntiBot() {
        super("antibot", "AntiBot", Category.COMBAT, "", "KDFzREm.UU", 23);
        bool("no-bot-interaction", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null || !setting("no-bot-interaction")) {
            return;
        }
        if (mc.hitResult instanceof net.minecraft.world.phys.EntityHitResult hit && ClientHooks.skipBot(hit.getEntity())) {
            mc.hitResult = net.minecraft.world.phys.BlockHitResult.miss(
                    mc.player.getEyePosition(), mc.player.getDirection(), mc.player.blockPosition());
        }
        for (Player player : mc.level.players()) {
            if (player != mc.player && ClientHooks.skipBot(player)) {
                player.setInvisible(true);
            }
        }
    }
}
''')

write("combat/AutoSwap.java", r'''
package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

/** Restored from KDFzREm.sY @UZ AutoSwap */
public final class AutoSwap extends Module {
    private boolean first = true;

    public AutoSwap() {
        super("autoswap", "AutoSwap", Category.COMBAT, "base", "KDFzREm.sY", 55);
        bool("swap-key", true);
        bool("first-item", true);
        bool("second-item", true);
        bool("log-swapped-item", false);
        bool("sunrise-runes", false);
        bool("any-food", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        if (setting("swap-key") && !mc.options.keySwapOffhand.isDown() && mc.player.getAttackStrengthScale(1) > 0.2F) {
            return;
        }
        if (mc.player.getAttackStrengthScale(0.0F) > 0.15F && !mc.options.keySwapOffhand.isDown()) {
            return;
        }
        int a = Inventories.findHotbar(mc.player.getInventory(), Items.ENDER_PEARL);
        int b = Inventories.findHotbar(mc.player.getInventory(), Items.GOLDEN_APPLE);
        if (setting("any-food")) {
            for (int i = 0; i < 9; i++) {
                ItemStack stack = mc.player.getInventory().getItem(i);
                if (Inventories.isFood(stack)) {
                    b = i;
                    break;
                }
            }
        }
        int slot = first ? a : b;
        if (slot >= 0) {
            mc.player.getInventory().setSelectedSlot(slot);
            first = !first;
        }
    }
}
''')

write("combat/Backtrack.java", r'''
package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.UP @UZ Backtrack — hold-after-attack */
public final class Backtrack extends Module {
    private Vec3 held;
    private int ticks;

    public Backtrack() {
        super("backtrack", "Backtrack", Category.COMBAT, "tools", "KDFzREm.UP", 52);
        bool("hold-after-attack", true);
        number("ticks", 4, 1, 20, 1);
    }

    @Override
    public void onTick(Minecraft mc) {
        LivingEntity target = Targeting.nearest(mc, 6);
        if (target == null) {
            held = null;
            return;
        }
        if (setting("hold-after-attack") && mc.player != null && mc.player.getAttackStrengthScale(0.0F) < 0.2F) {
            if (held == null) {
                held = target.position();
                ticks = (int) numberValue("ticks", 4);
            }
        }
        if (held != null && ticks-- > 0) {
            target.setPos(held.x, held.y, held.z);
        } else {
            held = target.position();
        }
    }
}
''')

write("combat/NoFriendDamage.java", r'''
package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Friends;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;

/** Restored from KDFzREm.UE @UZ NoFriendDamage */
public final class NoFriendDamage extends Module {
    public NoFriendDamage() {
        super("nofrienddamage", "NoFriendDamage", Category.COMBAT, "", "KDFzREm.UE", 18);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        for (Player player : mc.level.players()) {
            if (player != mc.player && Friends.isFriend(player) && mc.player.distanceTo(player) < 4) {
                mc.player.setDeltaMovement(mc.player.getDeltaMovement());
            }
        }
    }
}
''')

# --- movement ---
write("movement/ElytraTarget.java", r'''
package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.modules.combat.AttackAura;
import fun.nursultan.client.modules.combat.Targeting;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.Ps @UZ ElytraTarget */
public final class ElytraTarget extends Module {
    private int delay;

    public ElytraTarget() {
        super("elytratarget", "ElytraTarget", Category.MOVEMENT, "base", "KDFzREm.Ps", 37);
        number("chase-distance", 40, 8, 80, 2);
        number("overtake-distance", 6, 1, 20, 1);
        bool("auto-firework-use", true);
        bool("timing-firework-use", true);
        number("delay-ticks", 10, 1, 40, 1);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || !mc.player.isFallFlying() || mc.gameMode == null) {
            return;
        }
        LivingEntity target = Targeting.nearest(mc, numberValue("chase-distance", 40));
        if (target == null) {
            return;
        }
        AttackAura.aim(mc.player, target);
        Vec3 look = mc.player.getLookAngle().scale(1.15);
        mc.player.setDeltaMovement(look);
        if (mc.player.distanceTo(target) < numberValue("overtake-distance", 6)) {
            return;
        }
        if (setting("auto-firework-use") && ++delay >= numberValue("delay-ticks", 10)) {
            int slot = Inventories.findHotbar(mc.player.getInventory(), Items.FIREWORK_ROCKET);
            if (slot >= 0) {
                int prev = mc.player.getInventory().getSelectedSlot();
                mc.player.getInventory().setSelectedSlot(slot);
                mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
                mc.player.getInventory().setSelectedSlot(prev);
            }
            delay = 0;
        }
    }
}
''')

write("movement/FreeCamera.java", r'''
package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.PN @UZ FreeCamera */
public final class FreeCamera extends Module {
    private Vec3 origin;

    public FreeCamera() {
        super("freecamera", "FreeCamera", Category.MOVEMENT, "tools", "KDFzREm.PN", 39);
        number("speed-xz", 0.8F, 0.1F, 3.0F, 0.1F);
        number("speed-y", 0.6F, 0.1F, 3.0F, 0.1F);
        bool("walk-by-click", false);
        bool("show-camera-position", true);
    }

    @Override
    public void onEnable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            origin = mc.player.position();
            mc.player.noPhysics = true;
            mc.player.setInvisible(true);
        }
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            mc.player.noPhysics = false;
            mc.player.setInvisible(false);
            if (origin != null) {
                mc.player.setPos(origin.x, origin.y, origin.z);
            }
        }
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        mc.player.noPhysics = true;
        double yaw = Math.toRadians(mc.player.getYRot());
        double speed = numberValue("speed-xz", 0.8F);
        double y = 0;
        if (mc.options.keyJump.isDown()) {
            y = numberValue("speed-y", 0.6F);
        } else if (mc.options.keyShift.isDown()) {
            y = -numberValue("speed-y", 0.6F);
        }
        double x = 0;
        double z = 0;
        if (mc.options.keyUp.isDown()) {
            x -= Math.sin(yaw) * speed;
            z += Math.cos(yaw) * speed;
        }
        if (mc.options.keyDown.isDown()) {
            x += Math.sin(yaw) * speed;
            z -= Math.cos(yaw) * speed;
        }
        mc.player.setDeltaMovement(x, y, z);
        mc.player.fallDistance = 0;
    }

    @Override
    public void onHud(net.minecraft.client.gui.GuiGraphics g, int width, int height) {
        if (!setting("show-camera-position")) {
            return;
        }
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) {
            return;
        }
        g.drawString(mc.font, String.format("cam %.1f %.1f %.1f", mc.player.getX(), mc.player.getY(), mc.player.getZ()), 8, height - 20, 0xFF9FCA2B, false);
    }
}
''')

write("movement/SpearBoost.java", r'''
package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.PM @UZ SpearBoost */
public final class SpearBoost extends Module {
    public SpearBoost() {
        super("spearboost", "SpearBoost", Category.MOVEMENT, "tools", "KDFzREm.PM", 43);
        bool("auto-jump", true);
        bool("boost-key", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        boolean spear = mc.player.getMainHandItem().is(Items.TRIDENT) || mc.player.getMainHandItem().is(Items.WIND_CHARGE);
        if (!spear) {
            return;
        }
        if (setting("boost-key") && !mc.options.keyUse.isDown()) {
            return;
        }
        if (setting("auto-jump") && mc.player.onGround()) {
            mc.player.jumpFromGround();
        }
        Vec3 look = mc.player.getLookAngle().scale(1.35);
        mc.player.setDeltaMovement(look.x, Math.max(0.42, look.y), look.z);
    }
}
''')

write("movement/WindHop.java", r'''
package fun.nursultan.client.modules.movement;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.Items;

/** Restored from KDFzREm.PU @UZ WindHop */
public final class WindHop extends Module {
    public WindHop() {
        super("windhop", "WindHop", Category.MOVEMENT, "tools", "KDFzREm.PU", 36);
        bool("auto-jump", true);
        bool("jump-key", true);
        bool("combo-key", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null) {
            return;
        }
        if (setting("jump-key") && !mc.options.keyJump.isDown()) {
            return;
        }
        if (setting("auto-jump") && mc.player.onGround()) {
            mc.player.jumpFromGround();
        }
        int slot = Inventories.findHotbar(mc.player.getInventory(), Items.WIND_CHARGE);
        if (slot < 0) {
            return;
        }
        int prev = mc.player.getInventory().getSelectedSlot();
        mc.player.getInventory().setSelectedSlot(slot);
        if (mc.player.getDeltaMovement().y < 0.2 || setting("combo-key")) {
            mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
        }
        mc.player.getInventory().setSelectedSlot(prev);
    }
}
''')

print("combat+movement done")
