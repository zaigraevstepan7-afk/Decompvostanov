package fun.nursultan.client.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ItemLore;

/** Dump leftover price needles / regexes from KDFzREm.mc. */
public final class AuctionPrices {
    public static final String CENA_A = " Ценa";
    public static final String CENA = " Цена";
    public static final String STRIP_NON_DIGIT = "[^0-9]";
    public static final String PER_ITEM = "§a$ §fЗа штуку §a$###,###";
    public static final String DOLLAR = "\\$\\s*.*?(\\d{1,3}(?:,\\d{3})*)";
    public static final String CURRENT = "▌ (?:Текущая цена|Цена): ([\\d ]+)¤";
    public static final String SEARCH = "поиск:";
    public static final String AUCTIONS = "аукционы";
    public static final String AUCTION = "аукцион";
    public static final String PRICE_TAG = " п: ";
    public static final String HAN = "漢:";
    /** Dump leftover name sanitizers from KDFzREm.mc Z[] / z[]. */
    public static final String STRIP_NON_LETTER = "[^\\p{L} \\-]";
    public static final String XXX_MID = " (?i)xxx (?i)";
    public static final String XXX_END = " (?i)xxx$";
    public static final String XXX_START = "^xxx (?i)";

    private static final Pattern DOLLAR_P = Pattern.compile(DOLLAR);
    private static final Pattern CURRENT_P = Pattern.compile(CURRENT);

    public static String blob(ItemStack item) {
        if (item == null || item.isEmpty()) {
            return "";
        }
        StringBuilder text = new StringBuilder(item.getHoverName().getString());
        ItemLore lore = item.get(DataComponents.LORE);
        if (lore != null) {
            for (Component line : lore.lines()) {
                text.append('\n').append(line.getString());
            }
        }
        return text.toString();
    }

    public static String sanitizeName(String name) {
        if (name == null || name.isBlank()) {
            return "";
        }
        String q = name.replaceAll(STRIP_NON_LETTER, "");
        q = q.replaceAll(XXX_MID, "");
        q = q.replaceAll(XXX_END, "");
        q = q.replaceAll(XXX_START, "");
        return q.replaceAll("[,\\s]+", " ").trim();
    }

    public static boolean auctionScreen(String title) {
        if (title == null || title.isBlank()) {
            return false;
        }
        String lower = title.toLowerCase();
        return lower.contains(SEARCH) || lower.contains(AUCTIONS) || lower.contains(AUCTION)
                || lower.contains(PRICE_TAG) || title.contains(HAN);
    }

    public static int parse(String text) {
        if (text == null || text.isBlank()) {
            return -1;
        }
        Matcher dollar = DOLLAR_P.matcher(text);
        if (dollar.find()) {
            return digits(dollar.group(1).replace(",", ""));
        }
        Matcher current = CURRENT_P.matcher(text);
        if (current.find()) {
            return digits(current.group(1).replace(" ", ""));
        }
        if (text.contains(CENA) || text.contains(CENA_A) || text.contains("Текущая цена")
                || text.contains("За штуку") || text.contains("¤") || text.contains(PRICE_TAG)
                || text.contains(HAN)) {
            return digits(text.replaceAll(STRIP_NON_DIGIT, ""));
        }
        return -1;
    }

    public static String format(int price) {
        if (price < 0) {
            return PER_ITEM.replace("###,###", "-");
        }
        String raw = Integer.toString(price);
        StringBuilder grouped = new StringBuilder();
        int n = 0;
        for (int i = raw.length() - 1; i >= 0; i--) {
            if (n > 0 && n % 3 == 0) {
                grouped.insert(0, ',');
            }
            grouped.insert(0, raw.charAt(i));
            n++;
        }
        return PER_ITEM.replace("###,###", grouped.toString());
    }

    private static int digits(String raw) {
        if (raw == null || raw.isBlank()) {
            return -1;
        }
        try {
            return Integer.parseInt(raw);
        } catch (NumberFormatException ignored) {
            return -1;
        }
    }

    private AuctionPrices() {}
}
