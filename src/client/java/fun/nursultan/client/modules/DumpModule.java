package fun.nursultan.client.modules;

import fun.nursultan.client.module.Category;
import fun.nursultan.client.module.Module;

/** Dump-backed module: settings and identity from KDFzREm.UM subclass. */
public final class DumpModule extends Module {
    public DumpModule(
            String id,
            String name,
            Category category,
            String subcategory,
            String dumpClass,
            int dumpMethods,
            String[] settingIds) {
        super(id, name, category, subcategory, dumpClass, dumpMethods);
        for (String setting : settingIds) {
            bool(setting, false);
        }
    }
}
