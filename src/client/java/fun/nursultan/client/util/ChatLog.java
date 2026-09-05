package fun.nursultan.client.util;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class ChatLog {
    private static final ArrayDeque<String> LINES = new ArrayDeque<>();

    public static void push(String text) {
        if (text == null || text.isBlank()) {
            return;
        }
        synchronized (LINES) {
            LINES.addLast(text);
            while (LINES.size() > 80) {
                LINES.removeFirst();
            }
        }
    }

    public static List<String> snapshot() {
        synchronized (LINES) {
            return new ArrayList<>(LINES);
        }
    }

    public static boolean recentContains(String needle) {
        String n = needle.toLowerCase(Locale.ROOT);
        for (String line : snapshot()) {
            if (line.toLowerCase(Locale.ROOT).contains(n)) {
                return true;
            }
        }
        return false;
    }

    private ChatLog() {}
}
