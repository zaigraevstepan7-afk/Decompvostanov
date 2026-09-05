#!/usr/bin/env python3
from pathlib import Path
ROOT = Path("/workspace/src/client/java/fun/nursultan/client/modules")

def write(rel, text):
    path = ROOT / rel
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(text.strip() + "\n")
    print("wrote", rel)

write("player/AutoAccept.java", r'''
package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ChatLog;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.Pq @UZ AutoAccept */
public final class AutoAccept extends Module {
    private int cool;

    public AutoAccept() {
        super("autoaccept", "AutoAccept", Category.PLAYER, "auto", "KDFzREm.Pq", 39);
        bool("teleport-request", true);
        bool("command-duel-request", true);
        bool("clan-invite-request", true);
        bool("friends-accept-only", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.player.connection == null || --cool > 0) {
            return;
        }
        if (setting("teleport-request") && (ChatLog.recentContains("телепорт") || ChatLog.recentContains("teleport") || ChatLog.recentContains("tpaccept"))) {
            mc.player.connection.sendCommand("tpaccept");
            cool = 40;
        }
        if (setting("command-duel-request") && (ChatLog.recentContains("дуэль") || ChatLog.recentContains("duel"))) {
            mc.player.connection.sendCommand("duel accept");
            cool = 40;
        }
        if (setting("clan-invite-request") && (ChatLog.recentContains("клан") || ChatLog.recentContains("clan"))) {
            mc.player.connection.sendCommand("clan accept");
            cool = 40;
        }
    }
}
''')

write("player/AutoAuth.java", r'''
package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ChatLog;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.sT @UZ AutoAuth — password is never hardcoded */
public final class AutoAuth extends Module {
    private boolean sent;

    public AutoAuth() {
        super("autoauth", "AutoAuth", Category.PLAYER, "auto", "KDFzREm.sT", 29);
        bool("open-path", false);
    }

    @Override
    public void onEnable() {
        sent = false;
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.player.connection == null || sent) {
            return;
        }
        if (ChatLog.recentContains("/login") || ChatLog.recentContains("авториза") || ChatLog.recentContains("password")) {
            mc.player.connection.sendCommand("login");
            sent = true;
        }
    }
}
''')

write("player/AutoDripstone.java", r'''
package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.modules.combat.Targeting;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.PV @UZ AutoDripstone */
public final class AutoDripstone extends Module {
    public AutoDripstone() {
        super("autodripstone", "AutoDripstone", Category.PLAYER, "auto", "KDFzREm.PV", 25);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null || mc.gameMode == null) {
            return;
        }
        LivingEntity target = Targeting.nearest(mc, 5);
        if (target == null) {
            return;
        }
        int slot = Inventories.findHotbar(mc.player.getInventory(), Items.POINTED_DRIPSTONE);
        if (slot < 0) {
            return;
        }
        int prev = mc.player.getInventory().getSelectedSlot();
        mc.player.getInventory().setSelectedSlot(slot);
        BlockPos above = target.blockPosition().above(2);
        if (mc.level.getBlockState(above).isAir()) {
            mc.gameMode.useItemOn(mc.player, InteractionHand.MAIN_HAND,
                    new BlockHitResult(Vec3.atCenterOf(above), Direction.DOWN, above, false));
        }
        mc.player.getInventory().setSelectedSlot(prev);
    }
}
''')

write("player/AutoJoin.java", r'''
package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ChatLog;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;

/** Restored from KDFzREm.WC @UZ AutoJoin */
public final class AutoJoin extends Module {
    private int cool;

    public AutoJoin() {
        super("autojoin", "AutoJoin", Category.PLAYER, "auto", "KDFzREm.WC", 25);
        bool("spooky-time-duels", false);
        bool("really-world", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.player.connection == null || --cool > 0) {
            return;
        }
        if (mc.screen instanceof ContainerScreen) {
            return;
        }
        if (setting("spooky-time-duels") && ChatLog.recentContains("duel")) {
            mc.player.connection.sendCommand("duel");
            cool = 80;
        }
        if (setting("really-world")) {
            mc.player.connection.sendCommand("anarchy");
            cool = 80;
        }
    }
}
''')

write("player/AutoPotion.java", r'''
package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;

/** Restored from KDFzREm.Pa @UZ AutoPotion */
public final class AutoPotion extends Module {
    private int delay;

    public AutoPotion() {
        super("autopotion", "AutoPotion", Category.PLAYER, "auto", "KDFzREm.Pa", 65);
        bool("speed-potion", true);
        bool("strength-potion", true);
        bool("fire-resistance-potion", true);
        bool("healing-potion", true);
        number("heal-health", 10, 2, 20, 1);
        bool("hotbar-only", true);
        bool("only-in-pvp", false);
        bool("disable-after-throw", false);
        bool("exclude-donate-potions", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null || ++delay < 8) {
            return;
        }
        delay = 0;
        if (setting("only-in-pvp") && mc.player.getLastHurtByMob() == null) {
            return;
        }
        int limit = setting("hotbar-only") ? 9 : 36;
        for (int i = 0; i < limit; i++) {
            ItemStack stack = mc.player.getInventory().getItem(i);
            if (!stack.is(Items.SPLASH_POTION)) {
                continue;
            }
            PotionContents contents = stack.get(DataComponents.POTION_CONTENTS);
            if (contents == null) {
                continue;
            }
            boolean want = false;
            if (setting("healing-potion") && mc.player.getHealth() <= numberValue("heal-health", 10) && contents.hasEffect(MobEffects.INSTANT_HEALTH)) {
                want = true;
            }
            if (setting("speed-potion") && !mc.player.hasEffect(MobEffects.SPEED) && contents.hasEffect(MobEffects.SPEED)) {
                want = true;
            }
            if (setting("strength-potion") && !mc.player.hasEffect(MobEffects.STRENGTH) && contents.hasEffect(MobEffects.STRENGTH)) {
                want = true;
            }
            if (setting("fire-resistance-potion") && !mc.player.hasEffect(MobEffects.FIRE_RESISTANCE) && contents.hasEffect(MobEffects.FIRE_RESISTANCE)) {
                want = true;
            }
            if (!want || i >= 9) {
                continue;
            }
            int prev = mc.player.getInventory().getSelectedSlot();
            float pitch = mc.player.getXRot();
            mc.player.setXRot(90);
            mc.player.getInventory().setSelectedSlot(i);
            mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
            mc.player.getInventory().setSelectedSlot(prev);
            mc.player.setXRot(pitch);
            if (setting("disable-after-throw")) {
                setEnabled(false);
            }
            return;
        }
    }
}
''')

write("player/AutoReconnect.java", r'''
package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.DisconnectedScreen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;

/** Restored from KDFzREm.PA @UZ AutoReconnect */
public final class AutoReconnect extends Module {
    private int ticks;

    public AutoReconnect() {
        super("autoreconnect", "AutoReconnect", Category.PLAYER, "auto", "KDFzREm.PA", 26);
        bool("auto-enable-auto-leave", false);
        number("delay", 40, 10, 200, 5);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (!(mc.screen instanceof DisconnectedScreen)) {
            ticks = 0;
            return;
        }
        if (++ticks < numberValue("delay", 40)) {
            return;
        }
        ticks = 0;
        if (setting("auto-enable-auto-leave")) {
            Module leave = fun.nursultan.client.module.ModuleManager.INSTANCE.byName("autoleave");
            if (leave != null) {
                leave.setEnabled(true);
            }
        }
        mc.setScreen(new JoinMultiplayerScreen(new TitleScreen()));
    }
}
''')

write("player/Blink.java", r'''
package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.Minecraft;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.PD @UZ Blink — mixin queues move packets */
public final class Blink extends Module {
    private int ticks;
    private Vec3 start;

    public Blink() {
        super("blink", "Blink", Category.PLAYER, "base", "KDFzREm.PD", 38);
        bool("release-packets-on-hit", true);
        bool("render-server-position", true);
        bool("auto-release-packets", true);
        number("release-packets-ticks", 40, 5, 200, 5);
    }

    @Override
    public void onEnable() {
        Minecraft mc = Minecraft.getInstance();
        start = mc.player == null ? null : mc.player.position();
        ticks = 0;
    }

    @Override
    public void onDisable() {
        ClientHooks.flushBlink();
    }

    @Override
    public void onTick(Minecraft mc) {
        ticks++;
        if (setting("release-packets-on-hit") && mc.player != null && mc.player.hurtTime > 0) {
            ClientHooks.flushBlink();
        }
        if (setting("auto-release-packets") && ticks >= numberValue("release-packets-ticks", 40)) {
            ClientHooks.flushBlink();
            ticks = 0;
        }
    }

    @Override
    public void onHud(net.minecraft.client.gui.GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.font != null) {
            g.drawString(mc.font, "blink " + ClientHooks.blinkSize(), 8, height - 32, 0xFF9FCA2B, false);
        }
    }
}
''')

write("player/LockSlots.java", r'''
package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Restored from KDFzREm.Pr @UZ LockSlots — enforced in MultiPlayerGameModeMixin */
public final class LockSlots extends Module {
    public LockSlots() {
        super("lockslots", "LockSlots", Category.PLAYER, "base", "KDFzREm.Pr", 32);
        bool("from-inventory", true);
    }
}
''')

write("player/NoEntityTrace.java", r'''
package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Restored from KDFzREm.sN @UZ NoEntityTrace — GameRendererMixin */
public final class NoEntityTrace extends Module {
    public NoEntityTrace() {
        super("noentitytrace", "NoEntityTrace", Category.PLAYER, "base", "KDFzREm.sN", 17);
        bool("only-while-breaking", true);
    }
}
''')

write("player/NoInteract.java", r'''
package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Restored from KDFzREm.Ty @UZ NoInteract — MultiPlayerGameModeMixin */
public final class NoInteract extends Module {
    public NoInteract() {
        super("nointeract", "NoInteract", Category.PLAYER, "base", "KDFzREm.Ty", 59);
        bool("aura-only", false);
        bool("pvp-only", false);
        bool("dont-place-orbs", true);
        bool("block-interact", true);
        bool("note-block", true);
        bool("enchant-tables", true);
        bool("brewing-stands", true);
        bool("crafting-tables", true);
        bool("entity-interact", true);
        bool("armor-stand", true);
    }
}
''')

write("player/NoServerRotation.java", r'''
package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Restored from KDFzREm.sy @UZ NoServerRotation — ClientPacketListenerMixin */
public final class NoServerRotation extends Module {
    public NoServerRotation() {
        super("noserverrotation", "NoServerRotation", Category.PLAYER, "base", "KDFzREm.sy", 22);
    }
}
''')

write("player/Nuker.java", r'''
package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Blocks;

/** Restored from KDFzREm.sL @UZ Nuker */
public final class Nuker extends Module {
    public Nuker() {
        super("nuker", "Nuker", Category.PLAYER, "base", "KDFzREm.sL", 40);
        bool("break-only-allowed-blocks", false);
        bool("break-only-in-selection", false);
        number("height-range", 2, 1, 5, 1);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null || mc.gameMode == null) {
            return;
        }
        int h = (int) numberValue("height-range", 2);
        BlockPos feet = mc.player.blockPosition();
        for (BlockPos pos : BlockPos.betweenClosed(feet.offset(-2, 0, -2), feet.offset(2, h, 2))) {
            var state = mc.level.getBlockState(pos);
            if (state.isAir() || state.is(Blocks.BEDROCK) || state.is(Blocks.BARRIER)) {
                continue;
            }
            if (setting("break-only-allowed-blocks") && !(state.is(Blocks.NETHERRACK) || state.is(Blocks.STONE) || state.is(Blocks.DIRT))) {
                continue;
            }
            mc.gameMode.startDestroyBlock(pos.immutable(), Direction.UP);
            mc.gameMode.continueDestroyBlock(pos.immutable(), Direction.UP);
            return;
        }
    }
}
''')

write("player/QuickUse.java", r'''
package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

/** Restored from KDFzREm.TL @UZ QuickUse */
public final class QuickUse extends Module {
    public QuickUse() {
        super("quickuse", "QuickUse", Category.PLAYER, "base", "KDFzREm.TL", 32);
        bool("golden-apple", true);
        bool("enchanted-golden-apple", true);
        bool("bottle-of-exp", true);
        bool("instant-damage", false);
        bool("instant-health", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null || !mc.options.keyUse.isDown()) {
            return;
        }
        ItemStack stack = mc.player.getMainHandItem();
        boolean ok = setting("golden-apple") && stack.is(Items.GOLDEN_APPLE)
                || setting("enchanted-golden-apple") && stack.is(Items.ENCHANTED_GOLDEN_APPLE)
                || setting("bottle-of-exp") && stack.is(Items.EXPERIENCE_BOTTLE)
                || setting("instant-health") && stack.is(Items.SPLASH_POTION);
        if (ok) {
            mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
        }
    }
}
''')

print("player done")
