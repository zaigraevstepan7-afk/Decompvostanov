package fun.nursultan.client.modules.visual;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;

/** Restored from KDFzREm.bG @UZ FreeLook — pov / back / front */
public final class FreeLook extends Module {
    public static float camYaw;
    public static float camPitch;
    private float yaw;
    private float pitch;

    public FreeLook() {
        super("freelook", "FreeLook", Category.VISUAL, "world", "KDFzREm.bG", 28);
        bool("pov", true);
        bool("back", true);
        bool("front", false);
        bool("nothing", false);
    }

    public static void add(float dx, float dy) {
        camYaw += dx * 0.15F;
        camPitch = Math.max(-90, Math.min(90, camPitch + dy * 0.15F));
    }

    @Override
    public void onEnable() {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            yaw = mc.player.getYRot();
            pitch = mc.player.getXRot();
            camYaw = yaw;
            camPitch = pitch;
            if (setting("pov") && !setting("nothing")) {
                mc.options.setCameraType(setting("front")
                        ? net.minecraft.client.CameraType.THIRD_PERSON_FRONT
                        : setting("back")
                                ? net.minecraft.client.CameraType.THIRD_PERSON_BACK
                                : net.minecraft.client.CameraType.FIRST_PERSON);
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
