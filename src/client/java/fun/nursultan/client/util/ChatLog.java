package fun.nursultan.client.util;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ChatLog {
    private static final ArrayDeque<Line> LINES = new ArrayDeque<>();
    private static final long FRESH_MS = 8000;

    private static final class Line {
        final String text;
        final long at;
        boolean used;

        Line(String text, long at) {
            this.text = text;
            this.at = at;
        }

        boolean fresh() {
            return System.currentTimeMillis() - at <= FRESH_MS;
        }
    }

    private static String lastWhisper = "";

    public static void push(String text) {
        if (text == null || text.isBlank()) {
            return;
        }
        synchronized (LINES) {
            LINES.addLast(new Line(text, System.currentTimeMillis()));
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
            List<String> out = new ArrayList<>();
            for (Line line : LINES) {
                out.add(line.text);
            }
            return out;
        }
    }

    public static boolean recentContains(String needle) {
        return firstFresh(needle, false) != null;
    }

    /** Mark the first fresh matching line used so AutoAccept / AutoJoin do not fire forever. */
    public static String consumeContains(String needle) {
        Line line = firstFresh(needle, true);
        return line == null ? null : line.text;
    }

    public static String consumeFirst(String[] needles, String regex) {
        synchronized (LINES) {
            for (Line line : LINES) {
                if (line.used || !line.fresh()) {
                    continue;
                }
                if (needles != null) {
                    String lower = line.text.toLowerCase(Locale.ROOT);
                    for (String needle : needles) {
                        if (lower.contains(needle.toLowerCase(Locale.ROOT))) {
                            line.used = true;
                            return line.text;
                        }
                    }
                }
                if (regex != null && pattern(regex).matcher(line.text).find()) {
                    line.used = true;
                    return line.text;
                }
            }
        }
        return null;
    }

    public static boolean recentMatches(String regex) {
        Pattern compiled = pattern(regex);
        synchronized (LINES) {
            for (Line line : LINES) {
                if (!line.fresh()) {
                    continue;
                }
                if (compiled.matcher(line.text).find()) {
                    return true;
                }
            }
        }
        return false;
    }

    /** Dump leftover regex needles from KDFzREm.Pq. */
    public static String recentGroup(String regex, int group) {
        Pattern compiled = pattern(regex);
        synchronized (LINES) {
            for (Line line : LINES) {
                if (!line.fresh()) {
                    continue;
                }
                Matcher matcher = compiled.matcher(line.text);
                if (matcher.find()) {
                    return matcher.group(group);
                }
            }
        }
        return "";
    }

    private static Line firstFresh(String needle, boolean consume) {
        String n = needle.toLowerCase(Locale.ROOT);
        synchronized (LINES) {
            for (Line line : LINES) {
                if (line.used || !line.fresh()) {
                    continue;
                }
                if (line.text.toLowerCase(Locale.ROOT).contains(n)) {
                    if (consume) {
                        line.used = true;
                    }
                    return line;
                }
            }
        }
        return null;
    }

    private static Pattern pattern(String regex) {
        return Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
    }

    private ChatLog() {}
}
