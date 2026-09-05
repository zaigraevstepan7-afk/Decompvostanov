package fun.nursultan.client;

/** Client settings reconstructed from KDFzREm.zf — menu-scale / hud-scale / accent / bind. */
public final class ClientSettings {
    public static float menuScale = 1.0F;
    public static float hudScale = 1.0F;
    public static int accent = 0xFFD48A00;
    public static boolean descriptions = false;
    public static boolean autoSavePreset = true;
    public static boolean loading;
    public static String language = "ru";
    /** Set with `.auth set <pass>` — dump stores this in AutoAuth.json, never shipped as a default. */
    public static String autoAuthPassword = "";

    public static void cycleMenuScale() {
        if (menuScale < 1.25F) {
            menuScale = 1.5F;
        } else if (menuScale < 1.75F) {
            menuScale = 2.0F;
        } else {
            menuScale = 1.0F;
        }
        if (autoSavePreset && !loading) {
            fun.nursultan.client.config.ConfigStore.save();
        }
    }

    public static void cycleLanguage() {
        language = "en".equals(language) ? "ru" : "en";
        if (autoSavePreset && !loading) {
            fun.nursultan.client.config.ConfigStore.save();
        }
    }

    public static boolean ru() {
        return !"en".equals(language);
    }

    public static void toggleDescriptions() {
        descriptions = !descriptions;
        if (autoSavePreset && !loading) {
            fun.nursultan.client.config.ConfigStore.save();
        }
    }

    public static void cycleHudScale() {
        if (hudScale < 1.25F) {
            hudScale = 1.5F;
        } else if (hudScale < 1.75F) {
            hudScale = 2.0F;
        } else {
            hudScale = 1.0F;
        }
        if (autoSavePreset && !loading) {
            fun.nursultan.client.config.ConfigStore.save();
        }
    }

    private ClientSettings() {}
}
