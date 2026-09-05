// Java 21, headless-capable menu construction check
package fun.nursultan.restore;

import fun.nursultan.restore.catalog.Catalog;
import fun.nursultan.restore.ui.ClickGuiFrame;
import java.awt.image.BufferedImage;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

public final class Smoke {
    public static int run(Catalog catalog) {
        try {
            PathHolder.dir = Files.createTempDirectory("nursultan-smoke");
            final int[] code = {1};
            Path shots = Path.of("/opt/cursor/artifacts");
            if (!Files.isDirectory(shots)) {
                shots = Path.of("artifacts");
            }
            final Path outDir = shots;
            SwingUtilities.invokeAndWait(() -> {
                try {
                    ClickGuiFrame frame = new ClickGuiFrame(catalog, PathHolder.dir);
                    frame.pack();
                    frame.setVisible(true);
                    for (String tab : ClickGuiFrame.TABS) {
                        frame.showTab(tab);
                    }
                    for (String cat : new String[] {"combat", "movement", "player", "visual", "misc"}) {
                        frame.showCategory(cat);
                    }
                    frame.showCategory("combat");
                    frame.state().setEnabled("attackaura", true);
                    frame.state().setEnabled("aimassist", true);
                    frame.state().setEnabled("triggerbot", true);
                    var aura = catalog.modules.stream().filter(m -> "AttackAura".equals(m.name)).findFirst().orElseThrow();
                    frame.settings(aura);
                    frame.refreshModules("");
                    frame.setSize(1280, 800);
                    frame.doLayout();
                    capture(frame, outDir.resolve("clickgui_combat.png"));
                    frame.showCategory("movement");
                    capture(frame, outDir.resolve("clickgui_movement.png"));
                    frame.showTab("classes");
                    capture(frame, outDir.resolve("clickgui_classes.png"));
                    if (!frame.isDisplayable()) {
                        throw new IllegalStateException("frame not displayable");
                    }
                    frame.dispose();
                    code[0] = 0;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
            if (code[0] == 0) {
                System.out.println("SMOKE OK menu constructed and all tabs opened");
            }
            return code[0];
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    private static void capture(ClickGuiFrame frame, Path out) throws Exception {
        Files.createDirectories(out.getParent());
        frame.validate();
        BufferedImage image = new BufferedImage(Math.max(1, frame.getWidth()), Math.max(1, frame.getHeight()), BufferedImage.TYPE_INT_RGB);
        frame.paint(image.getGraphics());
        ImageIO.write(image, "png", out.toFile());
        System.out.println("wrote " + out.toAbsolutePath());
    }

    private static final class PathHolder {
        static Path dir;
    }
}
