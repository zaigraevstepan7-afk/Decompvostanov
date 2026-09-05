package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.util.Friends;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;

/** Restored from KDFzREm.UE @UZ NoFriendDamage */
public final class NoFriendDamage extends Module {
    public NoFriendDamage() {
        super("nofrienddamage", "NoFriendDamage", Category.COMBAT, "other", "KDFzREm.UE", 18);
        bool("teams", true);
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
