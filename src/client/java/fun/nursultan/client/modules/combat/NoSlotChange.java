package fun.nursultan.client.modules.combat;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.UW @UZ NoSlotChange */
public final class NoSlotChange extends Module {
    private int locked = -1;

    public NoSlotChange() {
        super("noslotchange", "NoSlotChange", Category.COMBAT, "other", "KDFzREm.UW", 13);
    }

    @Override
    public void onEnable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            locked = mc.player.getInventory().getSelectedSlot();
        }
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || locked < 0) {
            return;
        }
        if (mc.player.getInventory().getSelectedSlot() != locked) {
            mc.player.getInventory().setSelectedSlot(locked);
        }
    }
}
