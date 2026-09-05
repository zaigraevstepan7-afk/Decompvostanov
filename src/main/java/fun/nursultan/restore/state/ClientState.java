// Java 21, persisted module / course state
package fun.nursultan.restore.state;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import fun.nursultan.restore.catalog.Catalog;
import fun.nursultan.restore.catalog.ModuleDef;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ClientState {
    private final Path file;
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private final Map<String, Boolean> enabled = new LinkedHashMap<>();
    private final Map<String, Map<String, Boolean>> settings = new LinkedHashMap<>();
    private final List<Listener> listeners = new CopyOnWriteArrayList<>();

    public ClientState(Catalog catalog, Path dataDir) {
        this.file = dataDir.resolve("state.json");
        for (ModuleDef module : catalog.modules) {
            enabled.put(module.id, false);
            Map<String, Boolean> row = new LinkedHashMap<>();
            if (module.settings != null) {
                for (ModuleDef.SettingDef setting : module.settings) {
                    row.put(setting.id, false);
                }
            }
            settings.put(module.id, row);
        }
        load();
    }

    public boolean isEnabled(String moduleId) {
        return Boolean.TRUE.equals(enabled.get(moduleId));
    }

    public void setEnabled(String moduleId, boolean value) {
        enabled.put(moduleId, value);
        save();
        fire();
    }

    public boolean setting(String moduleId, String settingId) {
        Map<String, Boolean> row = settings.get(moduleId);
        return row != null && Boolean.TRUE.equals(row.get(settingId));
    }

    public void setSetting(String moduleId, String settingId, boolean value) {
        settings.computeIfAbsent(moduleId, key -> new LinkedHashMap<>()).put(settingId, value);
        save();
        fire();
    }

    public Snapshot snapshot(String name) {
        return new Snapshot(name, new LinkedHashMap<>(enabled), copySettings());
    }

    public void apply(Snapshot snapshot) {
        enabled.clear();
        enabled.putAll(snapshot.enabled);
        settings.clear();
        settings.putAll(snapshot.settings);
        save();
        fire();
    }

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    private Map<String, Map<String, Boolean>> copySettings() {
        Map<String, Map<String, Boolean>> copy = new LinkedHashMap<>();
        for (Map.Entry<String, Map<String, Boolean>> e : settings.entrySet()) {
            copy.put(e.getKey(), new LinkedHashMap<>(e.getValue()));
        }
        return copy;
    }

    private void fire() {
        for (Listener listener : listeners) {
            listener.changed();
        }
    }

    private void load() {
        if (!Files.exists(file)) {
            return;
        }
        try {
            Snapshot snapshot = gson.fromJson(Files.readString(file, StandardCharsets.UTF_8), Snapshot.class);
            if (snapshot != null && snapshot.enabled != null) {
                enabled.putAll(snapshot.enabled);
            }
            if (snapshot != null && snapshot.settings != null) {
                for (Map.Entry<String, Map<String, Boolean>> e : snapshot.settings.entrySet()) {
                    settings.computeIfAbsent(e.getKey(), key -> new LinkedHashMap<>()).putAll(e.getValue());
                }
            }
        } catch (IOException ignored) {
            // keep defaults
        }
    }

    private void save() {
        try {
            Files.createDirectories(file.getParent());
            Files.writeString(file, gson.toJson(snapshot("current")), StandardCharsets.UTF_8);
        } catch (IOException ignored) {
            // disk is optional for the live menu
        }
    }

    public interface Listener {
        void changed();
    }

    public static final class Snapshot {
        public String name;
        public Map<String, Boolean> enabled = new LinkedHashMap<>();
        public Map<String, Map<String, Boolean>> settings = new LinkedHashMap<>();

        public Snapshot() {}

        public Snapshot(String name, Map<String, Boolean> enabled, Map<String, Map<String, Boolean>> settings) {
            this.name = name;
            this.enabled = enabled;
            this.settings = settings;
        }

        public int enabledCount() {
            int n = 0;
            for (Boolean value : enabled.values()) {
                if (Boolean.TRUE.equals(value)) {
                    n++;
                }
            }
            return n;
        }
    }

    public static List<Snapshot> readCourses(Path dir) {
        List<Snapshot> out = new ArrayList<>();
        if (!Files.isDirectory(dir)) {
            return out;
        }
        Gson gson = new Gson();
        try (var stream = Files.list(dir)) {
            stream.filter(p -> p.getFileName().toString().endsWith(".json")).sorted().forEach(path -> {
                try {
                    Snapshot snapshot = gson.fromJson(Files.readString(path, StandardCharsets.UTF_8), Snapshot.class);
                    if (snapshot != null) {
                        if (snapshot.name == null || snapshot.name.isBlank()) {
                            snapshot.name = path.getFileName().toString().replace(".json", "");
                        }
                        out.add(snapshot);
                    }
                } catch (IOException ignored) {
                    // skip broken course
                }
            });
        } catch (IOException ignored) {
            return out;
        }
        return out;
    }

    public static void writeCourse(Path dir, Snapshot snapshot) throws IOException {
        Files.createDirectories(dir);
        String file = snapshot.name.replaceAll("[^a-zA-Z0-9._-]+", "_") + ".json";
        Files.writeString(dir.resolve(file), new GsonBuilder().setPrettyPrinting().create().toJson(snapshot), StandardCharsets.UTF_8);
    }

}
