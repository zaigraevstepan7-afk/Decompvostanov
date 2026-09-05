// Java 21, module descriptor from restored UM subclasses
package fun.nursultan.restore.catalog;

import java.util.ArrayList;
import java.util.List;

public final class ModuleDef {
    public String id;
    public String name;
    public String category;
    public String subcategory;
    public String className;
    public String bytecodeClass;
    public String description;
    public int methodCount;
    public int size;
    public List<SettingDef> settings = new ArrayList<>();

    public static final class SettingDef {
        public String id;
        public String label;
        public String type;
    }
}
