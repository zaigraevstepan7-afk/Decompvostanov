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
            fun.nursultan.client.config.ConfigStore.save();
        }
    }
}
