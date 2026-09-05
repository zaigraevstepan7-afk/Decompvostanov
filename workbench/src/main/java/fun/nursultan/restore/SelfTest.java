// Java 21, restore integrity checks
package fun.nursultan.restore;

import fun.nursultan.restore.catalog.Catalog;
import fun.nursultan.restore.catalog.ModuleDef;
import fun.nursultan.restore.state.ClientState;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.zip.ZipFile;

public final class SelfTest {
    public static int run(Catalog catalog) {
        int errors = 0;
        errors += check("client name", "Nursultan".equals(catalog.client));
        errors += check("3001 classes", catalog.classCount == 3001 && catalog.classes.size() == 3001);
        errors += check("11267 lambdas", catalog.lambdaCount == 11267 && catalog.lambdas.size() == 11267);
        errors += check("methods restored", catalog.methodCount() >= 39000);
        errors += check("initializer", "KDFzREm.NNNNGY".equals(catalog.initializer));
        errors += check("menu class", "KDFzREm.Gs".equals(catalog.menuClass));
        errors += check("hud class", "KDFzREm.td".equals(catalog.hudClass));
        errors += check("109 UM modules", catalog.modules.size() == 109);
        for (String cat : new String[] {"combat", "movement", "player", "visual", "misc"}) {
            errors += check("category " + cat, !catalog.byCategory(cat).isEmpty());
        }
        ModuleDef aura = catalog.modules.stream().filter(m -> "AttackAura".equals(m.name)).findFirst().orElse(null);
        errors += check("AttackAura class", aura != null && "KDFzREm.Uv".equals(aura.className) && aura.methodCount > 50);
        ModuleDef aim = catalog.modules.stream().filter(m -> "AimAssist".equals(m.name)).findFirst().orElse(null);
        errors += check("AimAssist class", aim != null && "KDFzREm.Ub".equals(aim.className));
        Set<String> required = Set.of("AimAssist", "AttackAura", "TriggerBot", "Speed", "Scaffold", "EntityESP", "NoVelocity", "AutoTotem");
        long hit = catalog.modules.stream().map(m -> m.name).filter(required::contains).count();
        errors += check("core modules", hit == required.size());
        Path classesJar = Path.of("runtime/nursultan-classes-restored.jar");
        Path lambdasJar = Path.of("runtime/nursultan-lambdas-restored.jar");
        errors += check("classes jar", Files.isRegularFile(classesJar));
        errors += check("lambdas jar", Files.isRegularFile(lambdasJar));
        errors += check("classes jar entries", zipCount(classesJar) >= 3001);
        errors += check("lambdas jar entries", zipCount(lambdasJar) >= 11267);
        try {
            Path tmp = Files.createTempDirectory("nursultan-selftest");
            ClientState state = new ClientState(catalog, tmp);
            state.setEnabled("aimassist", true);
            state.setSetting("aimassist", "aim-range", true);
            ClientState.Snapshot snapshot = state.snapshot("ready-pvp");
            ClientState.writeCourse(tmp.resolve("courses"), snapshot);
            var loaded = ClientState.readCourses(tmp.resolve("courses"));
            errors += check("course save", !loaded.isEmpty() && loaded.get(0).enabledCount() >= 1);
        } catch (Exception e) {
            System.err.println("FAIL course io: " + e.getMessage());
            errors++;
        }
        Path auraSrc = Path.of("decompiled/modules/KDFzREm/Uv.java");
        try {
            errors += check("AttackAura source", Files.isRegularFile(auraSrc) && Files.size(auraSrc) > 20_000);
            String auraText = Files.readString(auraSrc);
            errors += check("AttackAura logic", auraText.contains("aim-range") && auraText.contains("class Uv"));
        } catch (Exception e) {
            errors += check("AttackAura logic", false);
        }
        if (errors == 0) {
            System.out.println("SELF-TEST OK");
            System.out.println("classes=" + catalog.classCount + " lambdas=" + catalog.lambdaCount
                    + " methods=" + catalog.methodCount() + " modules=" + catalog.modules.size());
        } else {
            System.err.println("SELF-TEST FAILED errors=" + errors);
        }
        return errors == 0 ? 0 : 1;
    }

    private static int check(String name, boolean ok) {
        if (ok) {
            System.out.println("ok  " + name);
            return 0;
        }
        System.err.println("FAIL " + name);
        return 1;
    }

    private static int zipCount(Path path) {
        try (ZipFile zip = new ZipFile(path.toFile())) {
            return zip.size();
        } catch (Exception e) {
            return 0;
        }
    }
}
