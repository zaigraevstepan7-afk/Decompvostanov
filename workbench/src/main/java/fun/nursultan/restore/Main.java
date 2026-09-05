// Java 21, Swing, Nursultan restore launcher
package fun.nursultan.restore;

import fun.nursultan.restore.catalog.Catalog;
import fun.nursultan.restore.ui.ClickGuiFrame;
import java.nio.file.Path;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public final class Main {
    public static void main(String[] args) {
        Catalog catalog = Catalog.load();
        if (args.length > 0 && "--self-test".equals(args[0])) {
            int code = SelfTest.run(catalog);
            System.exit(code);
            return;
        }
        if (args.length > 0 && "--smoke".equals(args[0])) {
            int code = Smoke.run(catalog);
            System.exit(code);
            return;
        }
        System.setProperty("sun.java2d.uiScale", "1");
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception ignored) {
                // stay on default
            }
            ClickGuiFrame frame = new ClickGuiFrame(catalog, defaultDataDir());
            frame.setVisible(true);
        });
    }

    public static Path defaultDataDir() {
        return Path.of(System.getProperty("user.dir"), "data");
    }
}
