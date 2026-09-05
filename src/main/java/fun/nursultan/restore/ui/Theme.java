// Java 21, Nursultan palette
package fun.nursultan.restore.ui;

import java.awt.Color;
import java.awt.Font;

public final class Theme {
    public static final Color BG = new Color(0x0B0B10);
    public static final Color PANEL = new Color(0x14141C);
    public static final Color PANEL_ALT = new Color(0x1B1B26);
    public static final Color STROKE = new Color(0x2A2A38);
    public static final Color ACCENT = new Color(0xC85CFF);
    public static final Color ACCENT_DIM = new Color(0x7A3AA0);
    public static final Color TEXT = new Color(0xF2E9FF);
    public static final Color MUTED = new Color(0x9A90A8);
    public static final Color DANGER = new Color(0xFF5C8A);
    public static final Color OK = new Color(0x6CFFB2);

    public static Font ui(int size, int style) {
        return new Font("SansSerif", style, size);
    }

    private Theme() {}
}
