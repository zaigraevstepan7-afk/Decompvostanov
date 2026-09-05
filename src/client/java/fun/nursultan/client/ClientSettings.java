package fun.nursultan.client;

/** Client settings reconstructed from KDFzREm.zf — menu-scale / hud-scale / accent / bind. */
public final class ClientSettings {
    public static float menuScale = 1.0F;
    public static float hudScale = 1.0F;
    public static int accent = 0xFF9FCA2B;
    public static boolean descriptions = true;
    public static boolean autoSavePreset = true;
    public static boolean loading;
    public static String language = "ru";

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

    private ClientSettings() {}
}
