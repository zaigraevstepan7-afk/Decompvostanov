package fun.nursultan.client.module;

public final class BoolSetting {
    public final String id;
    public final String label;
    public boolean value;

    public BoolSetting(String id, String label, boolean value) {
        this.id = id;
        this.label = label;
        this.value = value;
    }
}
