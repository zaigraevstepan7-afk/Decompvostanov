package org.telegram.ui.plus;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.util.SparseIntArray;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ActionBar.Theme;

public class PlusTheme {

    public static void apply(SparseIntArray colors, boolean dark) {
        PlusConfig.load();
        if (!PlusConfig.pixelMaterial || colors == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        Resources res = context.getResources();
        int accent = systemColor(res, "system_accent1_500", dark ? 0xFFD3E3FD : 0xFF0B57D0);
        int accentDark = systemColor(res, "system_accent1_700", 0xFF0842A0);
        int accentLight = systemColor(res, "system_accent1_200", 0xFFD3E3FD);
        int surface = systemColor(res, dark ? "system_neutral1_900" : "system_neutral1_50", dark ? 0xFF1C1B1F : 0xFFF8FAFD);
        int surfaceVariant = systemColor(res, dark ? "system_neutral1_800" : "system_neutral1_100", dark ? 0xFF2B2930 : 0xFFE9EEF6);
        int onSurface = systemColor(res, dark ? "system_neutral1_100" : "system_neutral1_900", dark ? 0xFFE6E1E5 : 0xFF1C1B1F);

        put(colors, Theme.key_actionBarDefault, accent);
        put(colors, Theme.key_actionBarDefaultTitle, 0xFFFFFFFF);
        put(colors, Theme.key_actionBarDefaultIcon, 0xFFFFFFFF);
        put(colors, Theme.key_actionBarDefaultSelector, Color.argb(40, 255, 255, 255));
        put(colors, Theme.key_actionBarDefaultSubmenuBackground, surface);
        put(colors, Theme.key_windowBackgroundWhite, surface);
        put(colors, Theme.key_windowBackgroundGray, surfaceVariant);
        put(colors, Theme.key_windowBackgroundWhiteBlueHeader, accent);
        put(colors, Theme.key_windowBackgroundWhiteBlueText2, accent);
        put(colors, Theme.key_windowBackgroundWhiteBlueText4, accent);
        put(colors, Theme.key_windowBackgroundWhiteBlueButton, accent);
        put(colors, Theme.key_featuredStickers_addButton, accent);
        put(colors, Theme.key_featuredStickers_addButtonPressed, accentDark);
        put(colors, Theme.key_switchTrackChecked, accent);
        put(colors, Theme.key_checkbox, accent);
        put(colors, Theme.key_checkboxCheck, 0xFFFFFFFF);
        put(colors, Theme.key_chats_actionBackground, accent);
        put(colors, Theme.key_chats_actionPressedBackground, accentDark);
        put(colors, Theme.key_chats_unreadCounter, accent);
        put(colors, Theme.key_chats_nameMessage, accent);
        put(colors, Theme.key_chat_messagePanelVoiceBackground, accent);
        put(colors, Theme.key_chat_messagePanelSend, accent);
        put(colors, Theme.key_dialogButton, accent);
        put(colors, Theme.key_avatar_backgroundBlue, accent);
        put(colors, Theme.key_avatar_backgroundSaved, accent);
        put(colors, Theme.key_profile_actionBackground, accentLight);
        put(colors, Theme.key_profile_actionIcon, accentDark);
        put(colors, Theme.key_windowBackgroundWhiteBlackText, onSurface);
    }

    private static void put(SparseIntArray colors, int key, int color) {
        colors.put(key, color);
    }

    private static int systemColor(Resources res, String name, int fallback) {
        try {
            int id = res.getIdentifier(name, "color", "android");
            if (id != 0) {
                return res.getColor(id, null);
            }
        } catch (Exception ignore) {
        }
        return fallback;
    }
}
