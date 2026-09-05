package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.sounds.SoundEvents;

/** Restored from KDFzREm.Wk @UZ ClientSounds */
public final class ClientSounds extends Module {
    private final java.util.Map<String, Boolean> last = new java.util.HashMap<>();

    public ClientSounds() {
        super("clientsounds", "ClientSounds", Category.MISC, "client", "KDFzREm.Wk", 54);
        bool("toggle-sounds", true);
        bool("custom", false);
        bool("default", true);
        bool("sound-type", true);
        bool("select-enable-sound", true);
        bool("select-disable-sound", true);
        bool("sounds", true);
        bool("sound-does-not-exist", true);
        bool("error-please-report", true);
        number("volume", 0.4F, 0, 1, 0.05F);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || !setting("sounds") || !setting("toggle-sounds")) {
            return;
        }
        for (var module : fun.nursultan.client.module.ModuleManager.INSTANCE.modules) {
            Boolean prev = last.put(module.id, module.enabled);
            if (prev != null && prev != module.enabled) {
                float vol = numberValue("volume", 0.4F) * fun.nursultan.client.util.ClientHooks.soundMultiplier();
                if (module.enabled && !setting("select-enable-sound") || !module.enabled && !setting("select-disable-sound")) {
                    continue;
                }
                var sound = module.enabled
                        ? (setting("default") && !setting("custom") ? SoundEvents.NOTE_BLOCK_PLING.value()
                                : setting("sound-type") ? SoundEvents.NOTE_BLOCK_HARP.value() : SoundEvents.EXPERIENCE_ORB_PICKUP)
                        : (setting("default") && !setting("custom") ? SoundEvents.NOTE_BLOCK_BASS.value()
                                : SoundEvents.NOTE_BLOCK_HAT.value());
                mc.player.playSound(sound, vol, setting("custom") ? 0.8F : 1.2F);
            }
        }
    }

    @Override
    public void onHud(GuiGraphics g, int width, int height) {
        if (!setting("custom") || !setting("sounds")) {
            return;
        }
        Minecraft mc = Minecraft.getInstance();
        if (mc.font == null) {
            return;
        }
        java.nio.file.Path home = java.nio.file.Path.of(System.getProperty("user.home", ""), "Downloads");
        boolean enableMissing = !java.nio.file.Files.isRegularFile(home.resolve("custom-enable-sound.wav"));
        boolean disableMissing = !java.nio.file.Files.isRegularFile(home.resolve("custom-disable-sound.wav"));
        if ((enableMissing || disableMissing) && setting("sound-does-not-exist")) {
            g.drawString(mc.font, "sound-does-not-exist WAV files", 8, height - 62, 0xFFFFC107, false);
        }
        if ((enableMissing || disableMissing) && setting("error-please-report")) {
            g.drawString(mc.font, "error-please-report", 8, height - 52, 0xFFE53935, false);
        }
    }
}
