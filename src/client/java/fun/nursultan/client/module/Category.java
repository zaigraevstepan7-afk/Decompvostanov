package fun.nursultan.client.module;

public enum Category {
    COMBAT,
    MOVEMENT,
    PLAYER,
    VISUAL,
    MISC;

    public static Category fromDump(String raw) {
        if (raw == null) {
            return MISC;
        }
        return switch (raw.toLowerCase()) {
            case "combat" -> COMBAT;
            case "movement" -> MOVEMENT;
            case "player" -> PLAYER;
            case "visual" -> VISUAL;
            default -> MISC;
        };
    }
}
