#!/usr/bin/env python3
from pathlib import Path
ROOT = Path("/workspace/src/client/java/fun/nursultan/client/modules")

def write(rel, text):
    path = ROOT / rel
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(text.strip() + "\n")
    print("wrote", rel)

write("misc/AnarchyHelper.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.modules.combat.Targeting;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;

/** Restored from KDFzREm.mZ @UZ AnarchyHelper */
public final class AnarchyHelper extends Module {
    public AnarchyHelper() {
        super("anarchyhelper", "AnarchyHelper", Category.MISC, "helper", "KDFzREm.mZ", 57);
        bool("god-aura", true);
        bool("sheer-dust", true);
        bool("holy-water", true);
        bool("potion-holy-water", true);
        bool("potion-rage", true);
        bool("potion-paladin", false);
        bool("potion-assassin", false);
        bool("potion-drowsiness", false);
        bool("potion-radiation", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null || Targeting.nearest(mc, 6) == null) {
            return;
        }
        ItemStack stack = mc.player.getMainHandItem();
        String name = stack.getHoverName().getString().toLowerCase();
        boolean match = setting("god-aura") && name.contains("aura")
                || setting("sheer-dust") && name.contains("пыл")
                || setting("holy-water") && name.contains("свят");
        if (match && mc.options.keyUse.isDown()) {
            mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
        }
    }
}
''')

write("misc/AuctionHelper.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.world.inventory.Slot;

/** Restored from KDFzREm.mc @UZ AuctionHelper */
public final class AuctionHelper extends Module {
    public AuctionHelper() {
        super("auctionhelper", "AuctionHelper", Category.MISC, "helper", "KDFzREm.mc", 77);
        bool("profitable-color", true);
        number("profitable-items-count", 6, 1, 27, 1);
        bool("open-auction-from-item", true);
        bool("show-item-price", true);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (!(mc.screen instanceof ContainerScreen) || mc.player == null || !setting("show-item-price")) {
            return;
        }
        int shown = 0;
        for (Slot slot : mc.player.containerMenu.slots) {
            if (slot.getItem().isEmpty()) {
                continue;
            }
            String hover = slot.getItem().getHoverName().getString();
            if (hover.matches(".*\\d+.*")) {
                shown++;
            }
            if (shown >= numberValue("profitable-items-count", 6)) {
                break;
            }
        }
        g.drawString(mc.font, "auction " + shown, 8, 30, 0xFF9FCA2B, false);
    }
}
''')

write("misc/AutoBuy.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.inventory.Slot;

/** Restored from KDFzREm.WV @UZ AutoBuy */
public final class AutoBuy extends Module {
    private int delay;

    public AutoBuy() {
        super("autobuy", "AutoBuy", Category.MISC, "base", "KDFzREm.WV", 50);
        bool("decrease-prices", true);
        bool("auto-parser", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (!(mc.screen instanceof ContainerScreen) || mc.player == null || mc.gameMode == null) {
            return;
        }
        if (++delay < 4) {
            return;
        }
        delay = 0;
        if (!setting("auto-parser")) {
            return;
        }
        for (Slot slot : mc.player.containerMenu.slots) {
            if (slot.index < 27 && !slot.getItem().isEmpty()) {
                Inventories.click(mc, slot.index, 0, ClickType.PICKUP);
                return;
            }
        }
    }
}
''')

write("misc/BypassHealth.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.Ww @UZ BypassHealth */
public final class BypassHealth extends Module {
    public BypassHealth() {
        super("bypasshealth", "BypassHealth", Category.MISC, "base", "KDFzREm.Ww", 8);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            g.drawString(mc.font, String.format("hp %.2f", mc.player.getHealth()), width / 2 + 10, height / 2 + 8, 0xFFFF5555, false);
        }
    }
}
''')

write("misc/ChatHelper.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ChatLog;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.ma @UZ ChatHelper */
public final class ChatHelper extends Module {
    public ChatHelper() {
        super("chathelper", "ChatHelper", Category.MISC, "helper", "KDFzREm.ma", 24);
        bool("better-commands", true);
        bool("chat-addons", true);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        if (!setting("chat-addons")) {
            return;
        }
        Minecraft mc = Minecraft.getInstance();
        var lines = ChatLog.snapshot();
        if (!lines.isEmpty()) {
            g.drawString(mc.font, lines.get(lines.size() - 1), 8, height - 70, 0xFFAAAAAA, false);
        }
    }
}
''')

write("misc/ClickAction.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Friends;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.EntityHitResult;

/** Restored from KDFzREm.Wr @UZ ClickAction */
public final class ClickAction extends Module {
    public ClickAction() {
        super("clickaction", "ClickAction", Category.MISC, "base", "KDFzREm.Wr", 16);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || !(mc.hitResult instanceof EntityHitResult hit)) {
            return;
        }
        if (hit.getEntity() instanceof Player player && mc.options.keyUse.isDown() && mc.screen == null) {
            Friends.add(player.getGameProfile().name());
        }
    }
}
''')

write("misc/ClientSounds.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.sounds.SoundEvents;

/** Restored from KDFzREm.Wk @UZ ClientSounds */
public final class ClientSounds extends Module {
    private final java.util.Map<String, Boolean> last = new java.util.HashMap<>();

    public ClientSounds() {
        super("clientsounds", "ClientSounds", Category.MISC, "", "KDFzREm.Wk", 54);
        bool("toggle-sounds", true);
        bool("sound-type", true);
        bool("select-enable-sound", true);
        bool("select-disable-sound", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || !setting("toggle-sounds")) {
            return;
        }
        for (var module : fun.nursultan.client.module.ModuleManager.INSTANCE.modules) {
            Boolean prev = last.put(module.id, module.enabled);
            if (prev != null && prev != module.enabled) {
                mc.player.playSound(module.enabled ? SoundEvents.NOTE_BLOCK_PLING.value() : SoundEvents.NOTE_BLOCK_BASS.value(), 0.4F, 1.2F);
            }
        }
    }
}
''')

write("misc/CustomCape.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.WY @UZ CustomCape */
public final class CustomCape extends Module {
    public CustomCape() {
        super("customcape", "CustomCape", Category.MISC, "", "KDFzREm.WY", 18);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player != null) {
            mc.player.setCustomNameVisible(true);
        }
    }
}
''')

write("misc/DiscordActivity.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.mu @UZ DiscordActivity — local presence text, no remote RPC */
public final class DiscordActivity extends Module {
    public DiscordActivity() {
        super("discordactivity", "DiscordActivity", Category.MISC, "", "KDFzREm.mu", 10);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            g.drawString(mc.font, "nursultan.fun", width - 90, 8, 0xFF5865F2, false);
        }
    }
}
''')

write("misc/ElytraHelper.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Items;

/** Restored from KDFzREm.WO @UZ ElytraHelper */
public final class ElytraHelper extends Module {
    public ElytraHelper() {
        super("elytrahelper", "ElytraHelper", Category.MISC, "helper", "KDFzREm.WO", 41);
        bool("swap-key", true);
        bool("firework-key", true);
        bool("only-space", true);
        bool("auto-launch", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null) {
            return;
        }
        if (setting("auto-launch") && mc.options.keyJump.isDown() && mc.player.onGround()
                && mc.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
            mc.player.jumpFromGround();
        }
        if (setting("firework-key") && mc.player.isFallFlying() && (!setting("only-space") || mc.options.keyJump.isDown())) {
            int slot = Inventories.findHotbar(mc.player.getInventory(), Items.FIREWORK_ROCKET);
            if (slot >= 0) {
                int prev = mc.player.getInventory().getSelectedSlot();
                mc.player.getInventory().setSelectedSlot(slot);
                mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
                mc.player.getInventory().setSelectedSlot(prev);
            }
        }
    }
}
''')

write("misc/HolyHelper.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.modules.combat.Targeting;
import fun.nursultan.client.util.Inventories;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.Items;

/** Restored from KDFzREm.mO @UZ HolyHelper */
public final class HolyHelper extends Module {
    public HolyHelper() {
        super("holyhelper", "HolyHelper", Category.MISC, "helper", "KDFzREm.mO", 38);
        bool("explosive-stuff", true);
        bool("exp-bottle", true);
        bool("explosive-trap", true);
        bool("snow-ball", true);
        bool("show-stun-zone", true);
        bool("zone-color", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.gameMode == null || Targeting.nearest(mc, 5) == null) {
            return;
        }
        if (setting("snow-ball")) {
            int slot = Inventories.findHotbar(mc.player.getInventory(), Items.SNOWBALL);
            if (slot >= 0 && mc.options.keyUse.isDown()) {
                int prev = mc.player.getInventory().getSelectedSlot();
                mc.player.getInventory().setSelectedSlot(slot);
                mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
                mc.player.getInventory().setSelectedSlot(prev);
            }
        }
        if (setting("exp-bottle") && mc.player.getMainHandItem().is(Items.EXPERIENCE_BOTTLE) && mc.options.keyUse.isDown()) {
            mc.gameMode.useItem(mc.player, InteractionHand.MAIN_HAND);
        }
    }
}
''')

write("misc/IRC.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.Wg @UZ IRC — local overlay only, no remote socket */
public final class IRC extends Module {
    public IRC() {
        super("irc", "IRC", Category.MISC, "", "KDFzREm.Wg", 8);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        g.drawString(mc.font, "irc local", 8, height - 80, 0xFF9FCA2B, false);
    }
}
''')

write("misc/OpenWalls.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.WI @UZ OpenWalls */
public final class OpenWalls extends Module {
    public OpenWalls() {
        super("openwalls", "OpenWalls", Category.MISC, "base", "KDFzREm.WI", 13);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player != null) {
            mc.player.noPhysics = true;
        }
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            mc.player.noPhysics = false;
        }
    }
}
''')

write("misc/PotionTracker.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.entity.projectile.ThrownPotion;

/** Restored from KDFzREm.WJ @UZ PotionTracker */
public final class PotionTracker extends Module {
    public PotionTracker() {
        super("potiontracker", "PotionTracker", Category.MISC, "trackers", "KDFzREm.WJ", 43);
        bool("ignore-self", true);
        bool("ignore-common-splash-potions", false);
        bool("ft-bypass", false);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level == null || mc.player == null) {
            return;
        }
        int n = 0;
        for (var entity : mc.level.entitiesForRendering()) {
            if (entity instanceof ThrownPotion) {
                n++;
            }
        }
        g.drawString(mc.font, "splash " + n, 8, 52, 0xFF9FCA2B, false);
    }
}
''')

write("misc/SRPSpoofer.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.packs.PackSelectionScreen;

/** Restored from KDFzREm.Wq @UZ SRPSpoofer — closes pack prompt, does not forge hashes */
public final class SRPSpoofer extends Module {
    public SRPSpoofer() {
        super("srpspoofer", "SRPSpoofer", Category.MISC, "base", "KDFzREm.Wq", 9);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.screen instanceof PackSelectionScreen) {
            mc.setScreen(null);
        }
    }
}
''')

write("misc/TickRateSync.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.WK @UZ TickRateSync */
public final class TickRateSync extends Module {
    public TickRateSync() {
        super("tickratesync", "TickRateSync", Category.MISC, "base", "KDFzREm.WK", 11);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level != null) {
            float rate = mc.level.tickRateManager().tickrate();
            g.drawString(mc.font, String.format("tps %.1f", rate), 8, 64, 0xFFF2E9FF, false);
        }
    }
}
''')

write("misc/UseTracker.java", r'''
package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.item.Items;

/** Restored from KDFzREm.mA @UZ UseTracker */
public final class UseTracker extends Module {
    private int totems;
    private int food;

    public UseTracker() {
        super("usetracker", "UseTracker", Category.MISC, "trackers", "KDFzREm.mA", 24);
        bool("totem-tracker", true);
        bool("food-tracker", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        if (setting("totem-tracker") && mc.player.getOffhandItem().is(Items.TOTEM_OF_UNDYING)) {
            totems = Math.max(totems, 1);
        }
        if (setting("food-tracker") && mc.player.isUsingItem() && fun.nursultan.client.util.Inventories.isFood(mc.player.getUseItem())) {
            food++;
        }
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        g.drawString(mc.font, "use t" + totems + " f" + food, 8, 76, 0xFFF2E9FF, false);
    }
}
''')

print("misc done")
