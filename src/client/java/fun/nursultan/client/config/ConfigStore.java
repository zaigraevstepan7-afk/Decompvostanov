package fun.nursultan.client.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import fun.nursultan.client.ClientSettings;
import fun.nursultan.client.module.BoolSetting;
import fun.nursultan.client.module.Module;
import fun.nursultan.client.module.ModuleManager;
import fun.nursultan.client.module.NumberSetting;
import fun.nursultan.client.util.Friends;
import java.nio.file.Files;
import java.nio.file.Path;
import net.fabricmc.loader.api.FabricLoader;

/** Preset IO from KDFzREm.zf auto-save-preset. */
public final class ConfigStore {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static Path file() {
        return FabricLoader.getInstance().getConfigDir().resolve("nursultan-preset.json");
    }

    public static void load() {
        Path path = file();
        if (!Files.isRegularFile(path)) {
            return;
        }
        ClientSettings.loading = true;
        try {
            JsonObject root = GSON.fromJson(Files.readString(path), JsonObject.class);
            if (root.has("menuScale")) {
                ClientSettings.menuScale = root.get("menuScale").getAsFloat();
            }
            if (root.has("hudScale")) {
                ClientSettings.hudScale = root.get("hudScale").getAsFloat();
            }
            if (root.has("accent")) {
                ClientSettings.accent = root.get("accent").getAsInt();
            }
            if (root.has("language")) {
                ClientSettings.language = root.get("language").getAsString();
            }
            if (root.has("autoSavePreset")) {
                ClientSettings.autoSavePreset = root.get("autoSavePreset").getAsBoolean();
            }
            if (root.has("descriptions")) {
                ClientSettings.descriptions = root.get("descriptions").getAsBoolean();
            }
            if (root.has("autoAuthPassword")) {
                ClientSettings.autoAuthPassword = root.get("autoAuthPassword").getAsString();
            }
            if (root.has("friends") && root.get("friends").isJsonArray()) {
                root.getAsJsonArray("friends").forEach(e -> Friends.add(e.getAsString()));
            }
            if (root.has("modules") && root.get("modules").isJsonObject()) {
                JsonObject mods = root.getAsJsonObject("modules");
                for (Module module : ModuleManager.INSTANCE.modules) {
                    if (!mods.has(module.id)) {
                        continue;
                    }
                    JsonObject node = mods.getAsJsonObject(module.id);
                    if (node.has("bind")) {
                        module.bind = node.get("bind").getAsString();
                    }
                    if (node.has("settings") && node.get("settings").isJsonObject()) {
                        JsonObject sets = node.getAsJsonObject("settings");
                        for (BoolSetting setting : module.settings) {
                            if (sets.has(setting.id)) {
                                setting.value = sets.get(setting.id).getAsBoolean();
                            }
                        }
                    }
                    if (node.has("numbers") && node.get("numbers").isJsonObject()) {
                        JsonObject nums = node.getAsJsonObject("numbers");
                        for (NumberSetting setting : module.numbers) {
                            if (nums.has(setting.id)) {
                                setting.value = nums.get(setting.id).getAsFloat();
                            }
                        }
                    }
                    if (node.has("enabled") && node.get("enabled").getAsBoolean() != module.enabled) {
                        module.setEnabled(node.get("enabled").getAsBoolean());
                    }
                }
            }
            System.out.println("Nursultan preset loaded " + path);
        } catch (Exception e) {
            System.err.println("Nursultan preset load failed: " + e.getMessage());
        } finally {
            ClientSettings.loading = false;
        }
    }

    public static void save() {
        if (!ClientSettings.autoSavePreset) {
            return;
        }
        try {
            JsonObject root = new JsonObject();
            root.addProperty("menuScale", ClientSettings.menuScale);
            root.addProperty("hudScale", ClientSettings.hudScale);
            root.addProperty("accent", ClientSettings.accent);
            root.addProperty("language", ClientSettings.language);
            root.addProperty("autoSavePreset", ClientSettings.autoSavePreset);
            root.addProperty("descriptions", ClientSettings.descriptions);
            root.addProperty("autoAuthPassword", ClientSettings.autoAuthPassword == null ? "" : ClientSettings.autoAuthPassword);
            var friends = new com.google.gson.JsonArray();
            Friends.all().forEach(friends::add);
            root.add("friends", friends);
            JsonObject mods = new JsonObject();
            for (Module module : ModuleManager.INSTANCE.modules) {
                JsonObject node = new JsonObject();
                node.addProperty("enabled", module.enabled);
                node.addProperty("bind", module.bind == null ? "" : module.bind);
                JsonObject sets = new JsonObject();
                for (BoolSetting setting : module.settings) {
                    sets.addProperty(setting.id, setting.value);
                }
                node.add("settings", sets);
                JsonObject nums = new JsonObject();
                for (NumberSetting setting : module.numbers) {
                    nums.addProperty(setting.id, setting.value);
                }
                node.add("numbers", nums);
                mods.add(module.id, node);
            }
            root.add("modules", mods);
            Path path = file();
            Files.createDirectories(path.getParent());
            Files.writeString(path, GSON.toJson(root));
        } catch (Exception e) {
            System.err.println("Nursultan preset save failed: " + e.getMessage());
        }
    }

    private ConfigStore() {}
}
