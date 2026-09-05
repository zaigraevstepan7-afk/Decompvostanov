package fun.nursultan.client.module;

/** Slider setting reconstructed from dump float arrays (e.g. Timer 1.0 / 0.1 / 10.0 / 0.05). */
public final class NumberSetting {
    public final String id;
    public final String label;
    public final float min;
    public final float max;
    public final float step;
    public float value;

    public NumberSetting(String id, String label, float value, float min, float max, float step) {
        this.id = id;
        this.label = label;
        this.value = value;
        this.min = min;
        this.max = max;
        this.step = step;
    }

    public void nudge(int dir) {
        value = Math.max(min, Math.min(max, value + dir * step));
    }
}
