#!/usr/bin/env python3
from pathlib import Path
ROOT = Path("/workspace/src/client/java/fun/nursultan/client/modules")

def write(rel, text):
    path = ROOT / rel
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(text.strip() + "\n")
    print("wrote", rel)

ACCENT = "0xFF9FCA2B"

def hud_module(class_name, id_, name, dump, methods, sub, settings, extra_hud="", extra_tick=""):
    bools = "\n".join(f'        bool("{s}", true);' for s in settings)
    return f'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from {dump} @UZ {name} */
public final class {class_name} extends Module {{
    public {class_name}() {{
        super("{id_}", "{name}", Category.VISUAL, "{sub}", "{dump}", {methods});
{bools}
    }}

    @Override
    public void onTick(Minecraft mc) {{
        {extra_tick if extra_tick else "/* hud / world module */"}
    }}

    @Override
    public void onHud(GuiGraphics g, int width, int height) {{
        Minecraft mc = Minecraft.getInstance();
        if (mc.font == null || mc.player == null) {{
            return;
        }}
        {extra_hud if extra_hud else f'g.drawString(mc.font, "{name}", 8, 28, {ACCENT}, false);'}
    }}
}}
'''

# custom visual modules with real logic
write("visual/Arrows.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.entity.player.Player;

/** Restored from KDFzREm.TQ @UZ Arrows */
public final class Arrows extends Module {
    public Arrows() {
        super("arrows", "Arrows", Category.VISUAL, "screen", "KDFzREm.TQ", 40);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || mc.level == null) {
            return;
        }
        int cx = width / 2;
        int cy = height / 2;
        for (Player player : mc.level.players()) {
            if (player == mc.player) {
                continue;
            }
            double dx = player.getX() - mc.player.getX();
            double dz = player.getZ() - mc.player.getZ();
            double yaw = Math.toRadians(mc.player.getYRot());
            double rx = dx * Math.cos(yaw) + dz * Math.sin(yaw);
            double rz = -dx * Math.sin(yaw) + dz * Math.cos(yaw);
            double ang = Math.atan2(rx, rz);
            int x = cx + (int) (Math.sin(ang) * 40);
            int y = cy - (int) (Math.cos(ang) * 40);
            g.fill(x - 2, y - 2, x + 2, y + 2, 0xFF9FCA2B);
        }
    }
}
''')

write("visual/AspectRatio.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Restored from KDFzREm.Tm @UZ AspectRatio */
public final class AspectRatio extends Module {
    public AspectRatio() {
        super("aspectratio", "AspectRatio", Category.VISUAL, "screen", "KDFzREm.Tm", 29);
        bool("aspect-ratio", true);
        number("custom-ratio", 1.7F, 0.5F, 3.0F, 0.05F);
    }
}
''')

write("visual/BlockESP.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;

/** Restored from KDFzREm.TH @UZ BlockESP */
public final class BlockESP extends Module {
    public BlockESP() {
        super("blockesp", "BlockESP", Category.VISUAL, "world", "KDFzREm.TH", 66);
        bool("delta-mode", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        BlockPos feet = mc.player.blockPosition();
        for (BlockPos pos : BlockPos.betweenClosed(feet.offset(-12, -6, -12), feet.offset(12, 6, 12))) {
            var state = mc.level.getBlockState(pos);
            if (state.is(Blocks.CHEST) || state.is(Blocks.ENDER_CHEST) || state.is(Blocks.SPAWNER)
                    || state.is(Blocks.SHULKER_BOX) || state.is(Blocks.ANCIENT_DEBRIS)) {
                // world highlight via nearby entity glow is unavailable; mark via debug particles
                if (mc.player.tickCount % 20 == 0) {
                    mc.level.addParticle(net.minecraft.core.particles.ParticleTypes.END_ROD,
                            pos.getX() + 0.5, pos.getY() + 1.1, pos.getZ() + 0.5, 0, 0.02, 0);
                }
            }
        }
    }
}
''')

write("visual/Cooldowns.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.jo @UZ Cooldowns */
public final class Cooldowns extends Module {
    public Cooldowns() {
        super("cooldowns", "Cooldowns", Category.VISUAL, "", "KDFzREm.jo", 28);
        bool("render-on-items", true);
        bool("inventory-only", false);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || (setting("inventory-only") && mc.screen == null)) {
            return;
        }
        float str = mc.player.getAttackStrengthScale(0.0F);
        g.drawString(mc.font, "cd " + (int) (str * 100) + "%", width - 70, height - 40, str >= 1 ? 0xFF9FCA2B : 0xFFF2E9FF, false);
    }
}
''')

write("visual/FakePlayer.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

/** Restored from KDFzREm.TP @UZ FakePlayer */
public final class FakePlayer extends Module {
    public FakePlayer() {
        super("fakeplayer", "FakePlayer", Category.VISUAL, "world", "KDFzREm.TP", 54);
    }

    @Override
    public void onEnable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            mc.player.displayClientMessage(Component.literal("FakePlayer at " + (int) mc.player.getX() + " " + (int) mc.player.getY() + " " + (int) mc.player.getZ()), false);
        }
    }
}
''')

write("visual/Fog.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.bm @UZ Fog */
public final class Fog extends Module {
    public Fog() {
        super("fog", "Fog", Category.VISUAL, "world", "KDFzREm.bm", 34);
        bool("color", true);
        number("distance", 192, 16, 512, 16);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.level != null && setting("color")) {
            mc.level.setSkyFlashTime(0);
        }
    }
}
''')

write("visual/FreeLook.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.bG @UZ FreeLook */
public final class FreeLook extends Module {
    private float yaw;
    private float pitch;

    public FreeLook() {
        super("freelook", "FreeLook", Category.VISUAL, "world", "KDFzREm.bG", 28);
        bool("pov", true);
    }

    @Override
    public void onEnable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            yaw = mc.player.getYRot();
            pitch = mc.player.getXRot();
            if (setting("pov")) {
                mc.options.setCameraType(net.minecraft.client.CameraType.THIRD_PERSON_BACK);
            }
        }
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            mc.player.setYRot(yaw);
            mc.player.setXRot(pitch);
            mc.options.setCameraType(net.minecraft.client.CameraType.FIRST_PERSON);
        }
    }
}
''')

write("visual/GPS.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.bw @UZ GPS */
public final class GPS extends Module {
    public GPS() {
        super("gps", "GPS", Category.VISUAL, "", "KDFzREm.bw", 40);
        number("target-x", 0, -30000, 30000, 10);
        number("target-z", 0, -30000, 30000, 10);
        bool("clear-target", false);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || setting("clear-target")) {
            return;
        }
        double dx = numberValue("target-x", 0) - mc.player.getX();
        double dz = numberValue("target-z", 0) - mc.player.getZ();
        g.drawString(mc.font, String.format("gps %.0f", Math.hypot(dx, dz)), width / 2 - 20, 18, 0xFF9FCA2B, false);
    }
}
''')

write("visual/Hands.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Restored from KDFzREm.bk @UZ Hands */
public final class Hands extends Module {
    public Hands() {
        super("hands", "Hands", Category.VISUAL, "world", "KDFzREm.bk", 29);
        bool("color-right", true);
        bool("color-left", true);
        bool("texture-mix", false);
    }
}
''')

write("visual/Hotkeys.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.module.ModuleManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.jq @UZ Hotkeys */
public final class Hotkeys extends Module {
    public Hotkeys() {
        super("hotkeys", "Hotkeys", Category.VISUAL, "", "KDFzREm.jq", 9);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        int y = 40;
        for (var module : ModuleManager.INSTANCE.modules) {
            if (!module.enabled || module.bind.isBlank()) {
                continue;
            }
            g.drawString(mc.font, module.bind + " " + module.name, 8, y, 0xFFF2E9FF, false);
            y += 10;
            if (y > 140) {
                break;
            }
        }
    }
}
''')

write("visual/InventoryHud.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.jK @UZ Inventory */
public final class InventoryHud extends Module {
    public InventoryHud() {
        super("inventory", "Inventory", Category.VISUAL, "", "KDFzREm.jK", 9);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) {
            return;
        }
        int empty = 0;
        for (int i = 0; i < 36; i++) {
            if (mc.player.getInventory().getItem(i).isEmpty()) {
                empty++;
            }
        }
        g.drawString(mc.font, "inv " + (36 - empty) + "/36", 8, height - 50, 0xFFF2E9FF, false);
    }
}
''')

write("visual/JumpEffect.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;

/** Restored from KDFzREm.Tb @UZ JumpEffect */
public final class JumpEffect extends Module {
    private boolean wasGround = true;

    public JumpEffect() {
        super("jumpeffect", "JumpEffect", Category.VISUAL, "world", "KDFzREm.Tb", 37);
        number("wave-amplitude", 1, 0.2F, 3, 0.1F);
        bool("first-color", true);
        bool("second-color", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        if (wasGround && !mc.player.onGround()) {
            for (int i = 0; i < 8; i++) {
                mc.level.addParticle(ParticleTypes.CLOUD, mc.player.getX(), mc.player.getY(), mc.player.getZ(), 0, 0.05, 0);
            }
        }
        wasGround = mc.player.onGround();
    }
}
''')

write("visual/KillEffect.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.LivingEntity;

/** Restored from KDFzREm.bQ @UZ KillEffect */
public final class KillEffect extends Module {
    public KillEffect() {
        super("killeffect", "KillEffect", Category.VISUAL, "world", "KDFzREm.bQ", 47);
        bool("behind-walls", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        for (LivingEntity entity : mc.level.getEntitiesOfClass(LivingEntity.class, mc.player.getBoundingBox().inflate(16), e -> !e.isAlive() || e.getHealth() <= 0)) {
            if (entity != mc.player) {
                mc.level.addParticle(ParticleTypes.TOTEM_OF_UNDYING, entity.getX(), entity.getY() + 1, entity.getZ(), 0, 0.2, 0);
            }
        }
    }
}
''')

write("visual/Logo.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Restored from KDFzREm.jV @UZ Logo — drawn in HudOverlay */
public final class Logo extends Module {
    public Logo() {
        super("logo", "Logo", Category.VISUAL, "", "KDFzREm.jV", 42);
        bool("fps", true);
        bool("ping", true);
        bool("coordinates", true);
    }
}
''')

write("visual/Notifications.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.module.ModuleManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

/** Restored from KDFzREm.jc @UZ Notifications */
public final class Notifications extends Module {
    public Notifications() {
        super("notifications", "Notifications", Category.VISUAL, "", "KDFzREm.jc", 29);
        bool("module-toggle", true);
        bool("armor-durability", true);
        bool("irc-ping", false);
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
        }
        if (setting("armor-durability")) {
            mc.player.getArmorSlots().forEach(stack -> {
            });
            g.drawString(mc.font, "armor " + mc.player.getArmorValue(), width - 70, y + 10, 0xFFF2E9FF, false);
        }
    }
}
''')

write("visual/Particles.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;

/** Restored from KDFzREm.bK @UZ Particles */
public final class Particles extends Module {
    public Particles() {
        super("particles", "Particles", Category.VISUAL, "world", "KDFzREm.bK", 49);
        bool("totem-popping", true);
        bool("thrown-item", true);
        bool("critical-hit", true);
        bool("color-selectable", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        if (setting("critical-hit") && mc.player.swingTime == 1) {
            mc.level.addParticle(ParticleTypes.CRIT, mc.player.getX(), mc.player.getY() + 1, mc.player.getZ(), 0, 0.1, 0);
        }
    }
}
''')

write("visual/Potions.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.effect.MobEffectInstance;

/** Restored from KDFzREm.je @UZ Potions */
public final class Potions extends Module {
    public Potions() {
        super("potions", "Potions", Category.VISUAL, "", "KDFzREm.je", 10);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) {
            return;
        }
        int y = 80;
        for (MobEffectInstance effect : mc.player.getActiveEffects()) {
            g.drawString(mc.font, effect.getEffect().unwrapKey().map(k -> k.identifier().getPath()).orElse("effect") + " " + (effect.getDuration() / 20), width - 120, y, 0xFFF2E9FF, false);
            y += 10;
        }
    }
}
''')

print("visual batch 1 done")
