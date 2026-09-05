package fun.nursultan.client.modules.misc;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.sounds.SoundEvents;

/** Restored from KDFzREm.Wk @UZ ClientSounds */
public final class ClientSounds extends Module {
    private final java.util.Map<String, Boolean> last = new java.util.HashMap<>();

    public ClientSounds() {
        super("clientsounds", "ClientSounds", Category.MISC, "", "KDFzREm.Wk", 54);
        bool("toggle-sounds", true);
        bool("sound-type", true);
        bool("select-enable-sound", true);
        bool("select-disable-sound", true);
    }

    @Override
    public void onTick(Minecraft mc) {
        if (mc.player == null || !setting("toggle-sounds")) {
            return;
        }
        for (var module : fun.nursultan.client.module.ModuleManager.INSTANCE.modules) {
            Boolean prev = last.put(module.id, module.enabled);
            if (prev != null && prev != module.enabled) {
                mc.player.playSound(module.enabled ? SoundEvents.NOTE_BLOCK_PLING.value() : SoundEvents.NOTE_BLOCK_BASS.value(), 0.4F, 1.2F);
            }
        }
    }
}
