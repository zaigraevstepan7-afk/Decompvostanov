package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.ClientHooks;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;

/** Restored from KDFzREm.UU @UZ AntiBot */
public final class AntiBot extends Module {
    public AntiBot() {
        super("antibot", "AntiBot", Category.COMBAT, "other", "KDFzREm.UU", 23);
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
