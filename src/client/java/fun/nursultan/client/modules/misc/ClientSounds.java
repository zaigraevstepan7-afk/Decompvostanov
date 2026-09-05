package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
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
        number("volume", 0.4F, 0, 1, 0.05F);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || !setting("toggle-sounds")) {
            return;
        }
        for (var module : fun.nursultan.client.module.ModuleManager.INSTANCE.modules) {
            Boolean prev = last.put(module.id, module.enabled);
            if (prev != null && prev != module.enabled) {
                float vol = numberValue("volume", 0.4F);
                mc.player.playSound(module.enabled ? SoundEvents.NOTE_BLOCK_PLING.value() : SoundEvents.NOTE_BLOCK_BASS.value(), vol, 1.2F);
            }
        }
    }
}
