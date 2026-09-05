// Java 21, catalog loaded from restored dump metadata
package fun.nursultan.restore.catalog;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class Catalog {
    public final String client;
    public final String site;
    public final String telegram;
    public final String packageName;
    public final String initializer;
    public final String core;
    public final String menuClass;
    public final String hudClass;
    public final List<String> categories;
    public final List<ModuleDef> modules;
    public final List<String> hudWidgets;
    public final List<String> menuIcons;
    public final int classCount;
    public final int lambdaCount;
    public final List<String> classes;
    public final List<String> lambdas;
    public final Map<String, List<String>> methods;

    private Catalog(
            String client,
            String site,
            String telegram,
            String packageName,
            String initializer,
            String core,
            String menuClass,
            String hudClass,
            List<String> categories,
            List<ModuleDef> modules,
            List<String> hudWidgets,
            List<String> menuIcons,
            int classCount,
            int lambdaCount,
            List<String> classes,
            List<String> lambdas,
            Map<String, List<String>> methods) {
        this.client = client;
        this.site = site;
        this.telegram = telegram;
        this.packageName = packageName;
        this.initializer = initializer;
        this.core = core;
        this.menuClass = menuClass;
        this.hudClass = hudClass;
        this.categories = categories;
        this.modules = modules;
        this.hudWidgets = hudWidgets;
        this.menuIcons = menuIcons;
        this.classCount = classCount;
        this.lambdaCount = lambdaCount;
        this.classes = classes;
        this.lambdas = lambdas;
        this.methods = methods;
    }

    public static Catalog load() {
        Gson gson = new Gson();
        JsonObject raw = readJson("/nursultan/catalog.json", gson);
        JsonObject index = readJson("/nursultan/restored-index.json", gson);
        Map<String, List<String>> methods = readMethods(gson);
        List<ModuleDef> modules = gson.fromJson(raw.get("modules"), new TypeToken<List<ModuleDef>>() {}.getType());
        JsonObject stats = raw.getAsJsonObject("stats");
        List<String> classes = gson.fromJson(index.get("classes"), new TypeToken<List<String>>() {}.getType());
        List<String> lambdas = gson.fromJson(index.get("lambdas"), new TypeToken<List<String>>() {}.getType());
        return new Catalog(
                raw.get("client").getAsString(),
                raw.get("site").getAsString(),
                raw.get("telegram").getAsString(),
                raw.get("package").getAsString(),
                raw.get("initializer").getAsString(),
                raw.get("core").getAsString(),
                raw.get("menuClass").getAsString(),
                raw.get("hudClass").getAsString(),
                gson.fromJson(raw.get("categories"), new TypeToken<List<String>>() {}.getType()),
                modules == null ? List.of() : modules,
                gson.fromJson(raw.get("hudWidgets"), new TypeToken<List<String>>() {}.getType()),
                gson.fromJson(raw.get("menuIcons"), new TypeToken<List<String>>() {}.getType()),
                stats.get("classes").getAsInt(),
                stats.get("lambdas").getAsInt(),
                classes == null ? List.of() : classes,
                lambdas == null ? List.of() : lambdas,
                methods);
    }

    public List<ModuleDef> byCategory(String category) {
        List<ModuleDef> out = new ArrayList<>();
        for (ModuleDef module : modules) {
            if (module.category.equals(category)) {
                out.add(module);
            }
        }
        return out;
    }

    public List<ModuleDef> search(String query) {
        String q = query == null ? "" : query.trim().toLowerCase();
        if (q.isEmpty()) {
            return modules;
        }
        List<ModuleDef> out = new ArrayList<>();
        for (ModuleDef module : modules) {
            if (module.name.toLowerCase().contains(q)
                    || module.description.toLowerCase().contains(q)
                    || module.category.contains(q)) {
                out.add(module);
            }
        }
        return out;
    }

    public int methodCount() {
        int n = 0;
        for (List<String> list : methods.values()) {
            n += list.size();
        }
        return n;
    }

    private static JsonObject readJson(String path, Gson gson) {
        try (InputStream in = Catalog.class.getResourceAsStream(path)) {
            if (in == null) {
                throw new IllegalStateException("missing resource " + path);
            }
            return gson.fromJson(new InputStreamReader(in, StandardCharsets.UTF_8), JsonObject.class);
        } catch (Exception e) {
            throw new IllegalStateException("failed to read " + path, e);
        }
    }

    private static Map<String, List<String>> readMethods(Gson gson) {
        try (InputStream in = Catalog.class.getResourceAsStream("/nursultan/methods.json")) {
            if (in == null) {
                return Map.of();
            }
            Map<String, List<String>> raw =
                    gson.fromJson(new InputStreamReader(in, StandardCharsets.UTF_8), new TypeToken<Map<String, List<String>>>() {}.getType());
            return raw == null ? new LinkedHashMap<>() : raw;
        } catch (Exception e) {
            return Map.of();
        }
    }
}
