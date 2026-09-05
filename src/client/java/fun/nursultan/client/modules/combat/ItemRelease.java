package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.WU @UZ ItemRelease — hit-only */
public final class ItemRelease extends Module {
    public ItemRelease() {
        super("itemrelease", "ItemRelease", Category.COMBAT, "base", "KDFzREm.WU", 26);
        bool("hit-only", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || !mc.player.isUsingItem()) {
            return;
        }
        if (setting("hit-only") && mc.player.getAttackStrengthScale(0.0F) > 0.2F && mc.player.getLastHurtMob() == null) {
            return;
        }
        if (mc.player.swingTime > 0 || mc.player.getAttackStrengthScale(0.0F) < 0.15F) {
            mc.player.releaseUsingItem();
            mc.options.keyUse.setDown(false);
        }
    }
}
