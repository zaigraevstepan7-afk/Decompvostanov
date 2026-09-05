package fun.nursultan.client.modules.player;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;

/** Restored from KDFzREm.PH @UZ AutoEat */
public final class AutoEat extends Module {
    public AutoEat() {
        super("autoeat", "AutoEat", Category.PLAYER, "auto", "KDFzREm.PH", 41);
        bool("any-food", true);
        bool("ignore-hunger", false);
        bool("health-trigger", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || mc.options == null) {
            return;
        }
        boolean hungry = mc.player.getFoodData().getFoodLevel() <= 16 || setting("ignore-hunger");
        boolean low = setting("health-trigger") && mc.player.getHealth() < 14.0F;
        if (!hungry && !low) {
            return;
        }
        if (!fun.nursultan.client.util.Inventories.isFood(mc.player.getMainHandItem())
                && !fun.nursultan.client.util.Inventories.isFood(mc.player.getOffhandItem())) {
            int food = -1;
            for (int i = 0; i < 9; i++) {
                if (fun.nursultan.client.util.Inventories.isFood(mc.player.getInventory().getItem(i))) {
                    food = i;
                    break;
                }
            }
            if (food < 0) {
                return;
            }
            mc.player.getInventory().setSelectedSlot(food);
        }
        mc.options.keyUse.setDown(true);
        mc.player.startUsingItem(InteractionHand.MAIN_HAND);
    }

    @Override
    public void onDisable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.options != null) {
            mc.options.keyUse.setDown(false);
        }
    }
}
