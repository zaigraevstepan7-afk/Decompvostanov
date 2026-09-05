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
