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
        bool("heal-key", false);
        bool("single", true);
        bool("multi", false);
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
        if (setting("heal-key") && !mc.options.keyUse.isDown()) {
            return;
        }
        int limit = setting("hotbar-only") ? 9 : 36;
        for (int i = 0; i < limit; i++) {
            ItemStack stack = mc.player.getInventory().getItem(i);
            if (!stack.is(Items.SPLASH_POTION)) {
                continue;
            }
            PotionContents contents = stack.get(DataComponents.POTION_CONTENTS);
            if (contents == null || !contents.hasEffects()) {
                continue;
            }
            boolean heal = false;
            boolean speed = false;
            boolean strength = false;
            boolean fire = false;
            for (var effect : contents.getAllEffects()) {
                if (effect.getEffect() == MobEffects.INSTANT_HEALTH) {
                    heal = true;
                }
                if (effect.getEffect() == MobEffects.SPEED) {
                    speed = true;
                }
                if (effect.getEffect() == MobEffects.STRENGTH) {
                    strength = true;
                }
                if (effect.getEffect() == MobEffects.FIRE_RESISTANCE) {
                    fire = true;
                }
            }
            boolean want = setting("healing-potion") && mc.player.getHealth() <= numberValue("heal-health", 10) && heal
                    || setting("speed-potion") && !mc.player.hasEffect(MobEffects.SPEED) && speed
                    || setting("strength-potion") && !mc.player.hasEffect(MobEffects.STRENGTH) && strength
                    || setting("fire-resistance-potion") && !mc.player.hasEffect(MobEffects.FIRE_RESISTANCE) && fire;
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
