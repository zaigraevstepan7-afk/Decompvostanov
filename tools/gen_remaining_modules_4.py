#!/usr/bin/env python3
from pathlib import Path
ROOT = Path("/workspace/src/client/java/fun/nursultan/client/modules")

def write(rel, text):
    path = ROOT / rel
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(text.strip() + "\n")
    print("wrote", rel)

write("visual/Predictions.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.bx @UZ Predictions */
public final class Predictions extends Module {
    public Predictions() {
        super("predictions", "Predictions", Category.VISUAL, "world", "KDFzREm.bx", 40);
        bool("predict-entity", true);
        bool("line-color", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null || !setting("predict-entity")) {
            return;
        }
        for (var entity : mc.level.entitiesForRendering()) {
            if (entity instanceof ThrowableItemProjectile proj) {
                Vec3 p = proj.position().add(proj.getDeltaMovement().scale(8));
                mc.level.addParticle(ParticleTypes.CRIT, p.x, p.y, p.z, 0, 0, 0);
            }
        }
    }
}
''')

write("visual/Removals.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.ji @UZ Removals */
public final class Removals extends Module {
    public Removals() {
        super("removals", "Removals", Category.VISUAL, "screen", "KDFzREm.ji", 62);
        bool("tilt-view", true);
        bool("vignette-overlay", true);
        bool("fire-overlay", true);
        bool("under-water-overlay", true);
        bool("wall-overlay", true);
        bool("totem-pop", false);
        bool("status-effect-overlay", true);
        bool("camera-clip", true);
        bool("heart-effect", true);
        bool("fishing-bobber", false);
        bool("wither-spawn", true);
        bool("end-portal-open", true);
        bool("anarchy-events", true);
        bool("exp-bottle", false);
        number("sound-multiplier", 1, 0, 2, 0.1F);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        if (setting("tilt-view")) {
            mc.player.hurtTime = 0;
            mc.player.hurtDuration = 0;
        }
    }
}
''')

write("visual/Saturation.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.Tt @UZ Saturation */
public final class Saturation extends Module {
    public Saturation() {
        super("saturation", "Saturation", Category.VISUAL, "world", "KDFzREm.Tt", 30);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player != null && mc.options.gamma().get() < 1.2) {
            mc.options.gamma().set(1.2);
        }
    }
}
''')

write("visual/ShulkerPreview.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.ShulkerBoxBlock;

/** Restored from KDFzREm.Tl @UZ ShulkerPreview */
public final class ShulkerPreview extends Module {
    public ShulkerPreview() {
        super("shulkerpreview", "ShulkerPreview", Category.VISUAL, "screen", "KDFzREm.Tl", 43);
        bool("show-in-world", true);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) {
            return;
        }
        var stack = mc.player.getMainHandItem();
        if (stack.getItem() instanceof BlockItem block && block.getBlock() instanceof ShulkerBoxBlock) {
            g.drawString(mc.font, "shulker " + stack.getCount(), width / 2 + 12, height / 2 - 4, 0xFF9FCA2B, false);
        }
    }
}
''')

write("visual/SkyCustomization.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.jW @UZ SkyCustomization */
public final class SkyCustomization extends Module {
    public SkyCustomization() {
        super("skycustomization", "SkyCustomization", Category.VISUAL, "world", "KDFzREm.jW", 56);
        bool("aurora-first", true);
        bool("aurora-second", true);
        number("intensity", 1, 0.1F, 3, 0.1F);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.level != null && setting("aurora-first")) {
            mc.level.setSkyFlashTime((int) (4 * numberValue("intensity", 1)));
        }
    }
}
''')

write("visual/StreamerMode.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;

/** Restored from KDFzREm.js @UZ StreamerMode */
public final class StreamerMode extends Module {
    public StreamerMode() {
        super("streamermode", "StreamerMode", Category.VISUAL, "screen", "KDFzREm.js", 63);
        bool("hide-entries", true);
        bool("custom-name", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        if (setting("custom-name")) {
            mc.player.setCustomName(Component.literal("Nursultan"));
            mc.player.setCustomNameVisible(true);
        }
        if (setting("hide-entries")) {
            for (Player player : mc.level.players()) {
                if (player != mc.player) {
                    player.setCustomName(Component.literal("hidden"));
                    player.setCustomNameVisible(false);
                }
            }
        }
    }
}
''')

write("visual/SwingAnimations.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.jG @UZ SwingAnimations */
public final class SwingAnimations extends Module {
    public SwingAnimations() {
        super("swinganimations", "SwingAnimations", Category.VISUAL, "world", "KDFzREm.jG", 35);
        bool("swing-1", true);
        bool("swing-2", false);
        bool("swing-3", false);
        bool("swing-4", false);
        number("swing-strength", 1, 0.2F, 3, 0.1F);
        number("spin-smoothness", 0.5F, 0.1F, 1, 0.05F);
        bool("only-while-have-target", false);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null) {
            return;
        }
        if (setting("only-while-have-target") && fun.nursultan.client.modules.combat.Targeting.nearest(mc, 6) == null) {
            return;
        }
        if (mc.player.swingTime > 0) {
            mc.player.yBobO += numberValue("swing-strength", 1);
        }
    }
}
''')

write("visual/TargetInfo.java", r'''
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
        super("targetinfo", "TargetInfo", Category.VISUAL, "", "KDFzREm.jH", 26);
        bool("show-from-mouse", true);
        bool("show-armor-details", true);
        bool("show-absorption", true);
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        LivingEntity target = Targeting.nearest(mc, 24);
        if (target == null) {
            return;
        }
        int x = width / 2 - 60;
        int y = height / 2 + 24;
        g.fill(x, y, x + 120, y + 28, 0xE00E0E12);
        g.drawString(mc.font, target.getName().getString(), x + 4, y + 4, 0xFFF2E9FF, false);
        g.drawString(mc.font, String.format("hp %.1f", target.getHealth() + (setting("show-absorption") ? target.getAbsorptionAmount() : 0)), x + 4, y + 14, 0xFF9FCA2B, false);
    }
}
''')

write("visual/Tracers.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;

/** Restored from KDFzREm.jQ @UZ Tracers */
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
        if (setting("players")) {
            for (Player player : mc.level.players()) {
                if (player != mc.player) {
                    player.setGlowingTag(true);
                }
            }
        }
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level == null) {
            return;
        }
        for (Player player : mc.level.players()) {
            player.setGlowingTag(false);
        }
    }
}
''')

write("visual/Trajectory.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;

/** Restored from KDFzREm.bh @UZ Trajectory */
public final class Trajectory extends Module {
    public Trajectory() {
        super("trajectory", "Trajectory", Category.VISUAL, "world", "KDFzREm.bh", 48);
        bool("predict-entity", true);
        bool("line-color", true);
        bool("hit-line-color", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.level == null) {
            return;
        }
        boolean thrower = mc.player.getMainHandItem().is(Items.ENDER_PEARL)
                || mc.player.getMainHandItem().is(Items.BOW)
                || mc.player.getMainHandItem().is(Items.TRIDENT)
                || mc.player.getMainHandItem().is(Items.SNOWBALL);
        if (!thrower) {
            return;
        }
        Vec3 pos = mc.player.getEyePosition();
        Vec3 vel = mc.player.getLookAngle().scale(1.5);
        for (int i = 0; i < 20; i++) {
            pos = pos.add(vel);
            vel = vel.add(0, -0.03, 0);
            mc.level.addParticle(ParticleTypes.CRIT, pos.x, pos.y, pos.z, 0, 0, 0);
        }
    }
}
''')

write("visual/ViewModel.java", r'''
package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Restored from KDFzREm.TY @UZ ViewModel */
public final class ViewModel extends Module {
    public ViewModel() {
        super("viewmodel", "ViewModel", Category.VISUAL, "world", "KDFzREm.TY", 27);
        number("right-hand-x", 0, -2, 2, 0.05F);
        number("right-hand-y", 0, -2, 2, 0.05F);
        number("right-hand-z", 0, -2, 2, 0.05F);
        number("right-scale", 1, 0.2F, 2, 0.05F);
        number("left-hand-x", 0, -2, 2, 0.05F);
        number("left-hand-y", 0, -2, 2, 0.05F);
        number("left-hand-z", 0, -2, 2, 0.05F);
        number("left-scale", 1, 0.2F, 2, 0.05F);
    }
}
''')

print("visual 2 done")
