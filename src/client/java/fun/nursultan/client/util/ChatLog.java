package fun.nursultan.client.util;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class ChatLog {
    private static final ArrayDeque<String> LINES = new ArrayDeque<>();

    private static String lastWhisper = "";

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
        String lower = text.toLowerCase(Locale.ROOT);
        int at = lower.indexOf(" whispers");
        if (at < 0) {
            at = lower.indexOf(" шепчет");
        }
        if (at > 0) {
            lastWhisper = text.substring(0, at).replaceAll("§.", "").trim();
        }
    }

    public static String lastWhisper() {
        return lastWhisper;
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

    /** Dump leftover regex needles from KDFzREm.Pq. */
    public static boolean recentMatches(String regex) {
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex, java.util.regex.Pattern.CASE_INSENSITIVE | java.util.regex.Pattern.UNICODE_CASE);
        for (String line : snapshot()) {
            if (pattern.matcher(line).find()) {
                return true;
            }
        }
        return false;
    }

    private ChatLog() {}
}
