package org.telegram.ui.plus;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;

import java.util.HashSet;
import java.util.Set;

public class PlusConfig {

    public static final String PREF = "plusconfig";
    public static final String DEFAULT_GEMINI_KEY = "AIzaSyBSczcS2nJc01BDN4EkRK-9E7sZ7XE8UEQ";
    public static final String DEFAULT_GEMINI_MODEL = "gemini-3.5-flash-lite";

    public static final int SWIPE_REPLY = 0;
    public static final int SWIPE_DELETE = 1;
    public static final int SWIPE_PIN = 2;

    private static SharedPreferences prefs;
    private static boolean loaded;

    public static boolean stealthTyping;
    public static boolean stealthRead;
    public static boolean lockSecretChats;
    public static boolean hideKeyboardOnScroll;
    public static boolean autoplayVoice;
    public static boolean pixelMaterial;
    public static int swipeAction;
    public static String geminiApiKey;
    public static String geminiModel;
    public static Set<String> lockedFolderIds;

    public static synchronized void load() {
        if (loaded) {
            return;
        }
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        prefs = context.getSharedPreferences(PREF, Context.MODE_PRIVATE);
        stealthTyping = prefs.getBoolean("stealthTyping", false);
        stealthRead = prefs.getBoolean("stealthRead", false);
        lockSecretChats = prefs.getBoolean("lockSecretChats", false);
        hideKeyboardOnScroll = prefs.getBoolean("hideKeyboardOnScroll", true);
        autoplayVoice = prefs.getBoolean("autoplayVoice", true);
        pixelMaterial = prefs.getBoolean("pixelMaterial", true);
        swipeAction = prefs.getInt("swipeAction", SWIPE_REPLY);
        geminiApiKey = prefs.getString("geminiApiKey", DEFAULT_GEMINI_KEY);
        geminiModel = prefs.getString("geminiModel", DEFAULT_GEMINI_MODEL);
        lockedFolderIds = new HashSet<>(prefs.getStringSet("lockedFolderIds", new HashSet<>()));
        loaded = true;
    }

    private static SharedPreferences prefs() {
        load();
        return prefs;
    }

    public static void setBoolean(String key, boolean value) {
        load();
        switch (key) {
            case "stealthTyping":
                stealthTyping = value;
                break;
            case "stealthRead":
                stealthRead = value;
                break;
            case "lockSecretChats":
                lockSecretChats = value;
                break;
            case "hideKeyboardOnScroll":
                hideKeyboardOnScroll = value;
                break;
            case "autoplayVoice":
                autoplayVoice = value;
                break;
            case "pixelMaterial":
                pixelMaterial = value;
                break;
        }
        prefs().edit().putBoolean(key, value).apply();
    }

    public static void setSwipeAction(int action) {
        load();
        swipeAction = action;
        prefs().edit().putInt("swipeAction", action).apply();
    }

    public static void setGeminiApiKey(String key) {
        load();
        geminiApiKey = key == null ? "" : key.trim();
        prefs().edit().putString("geminiApiKey", geminiApiKey).apply();
    }

    public static String getGeminiApiKey() {
        load();
        return TextUtils.isEmpty(geminiApiKey) ? DEFAULT_GEMINI_KEY : geminiApiKey;
    }

    public static String getGeminiModel() {
        load();
        return TextUtils.isEmpty(geminiModel) ? DEFAULT_GEMINI_MODEL : geminiModel;
    }

    public static boolean isFolderLocked(int filterId) {
        load();
        return lockedFolderIds.contains(Integer.toString(filterId));
    }

    public static void setFolderLocked(int filterId, boolean locked) {
        load();
        String id = Integer.toString(filterId);
        if (locked) {
            lockedFolderIds.add(id);
        } else {
            lockedFolderIds.remove(id);
        }
        prefs().edit().putStringSet("lockedFolderIds", new HashSet<>(lockedFolderIds)).apply();
    }

    public static String swipeActionName() {
        load();
        if (swipeAction == SWIPE_DELETE) {
            return LocaleController.getString(org.telegram.messenger.R.string.Delete);
        }
        if (swipeAction == SWIPE_PIN) {
            return LocaleController.getString(org.telegram.messenger.R.string.PinMessage);
        }
        return LocaleController.getString(org.telegram.messenger.R.string.Reply);
    }

    public static void cycleSwipeAction() {
        load();
        setSwipeAction((swipeAction + 1) % 3);
    }
}
