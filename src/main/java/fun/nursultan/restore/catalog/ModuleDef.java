// Java 21, module descriptor from restored dump
package fun.nursultan.restore.catalog;

import java.util.ArrayList;
import java.util.List;

public final class ModuleDef {
    public String id;
    public String name;
    public String category;
    public String description;
    public List<SettingDef> settings = new ArrayList<>();

    public static final class SettingDef {
        public String id;
        public String label;
        public String type;
    }
}
