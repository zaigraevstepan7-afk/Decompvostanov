package org.telegram.ui.plus;

import android.app.Activity;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GeminiHelper {

    public enum Mode {
        TRANSLATE,
        SUMMARY,
        FORMAL,
        PROOFREAD,
        ERRORS
    }

    public interface Callback {
        void onResult(String text);
    }

    public static String title(Mode mode) {
        switch (mode) {
            case TRANSLATE:
                return "Перевод";
            case SUMMARY:
                return "Саммаризация";
            case FORMAL:
                return "Формальный стиль";
            case PROOFREAD:
                return "Запятые и заглавные";
            case ERRORS:
                return "Поиск ошибок";
            default:
                return "Gemini";
        }
    }

    public static String prompt(Mode mode, String text) {
        switch (mode) {
            case TRANSLATE:
                return "Переведи текст на русский. Если он уже на русском — переведи на английский. Верни только перевод, без пояснений.\n\n" + text;
            case SUMMARY:
                return "Сделай краткое саммари текста на языке оригинала. 3–6 предложений. Без вступлений.\n\n" + text;
            case FORMAL:
                return "Перепиши текст в официально-деловом стиле, сохрани смысл. Верни только результат.\n\n" + text;
            case PROOFREAD:
                return "Исправь только пунктуацию и заглавные буквы. Слова, порядок слов и смысл не меняй. Верни только исправленный текст.\n\n" + text;
            case ERRORS:
                return "Найди орфографические и грамматические ошибки. Не переписывай текст целиком: выдай список ошибок в формате «было → стало» и коротко почему. Если ошибок нет, напиши «Ошибок не найдено».\n\n" + text;
            default:
                return text;
        }
    }

    public static void showModes(BaseFragment fragment, String source, Callback onReplace) {
        if (fragment == null || fragment.getParentActivity() == null) {
            return;
        }
        if (TextUtils.isEmpty(source)) {
            BulletinFactory.of(fragment).createErrorBulletin("Нет текста для Gemini").show();
            return;
        }
        CharSequence[] items = new CharSequence[]{
                title(Mode.TRANSLATE),
                title(Mode.SUMMARY),
                title(Mode.FORMAL),
                title(Mode.PROOFREAD),
                title(Mode.ERRORS)
        };
        Mode[] modes = new Mode[]{Mode.TRANSLATE, Mode.SUMMARY, Mode.FORMAL, Mode.PROOFREAD, Mode.ERRORS};
        AlertDialog.Builder builder = new AlertDialog.Builder(fragment.getParentActivity(), fragment.getResourceProvider());
        builder.setTitle("Gemini 3.5 Flash-Lite");
        builder.setItems(items, (dialog, which) -> run(fragment, modes[which], source, onReplace));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        fragment.showDialog(builder.create());
    }

    public static void run(BaseFragment fragment, Mode mode, String source, Callback onReplace) {
        if (fragment == null || fragment.getParentActivity() == null) {
            return;
        }
        AlertDialog progress = new AlertDialog(fragment.getParentActivity(), AlertDialog.ALERT_TYPE_SPINNER, fragment.getResourceProvider());
        progress.setCanCancel(true);
        progress.showDelayed(200);
        Utilities.globalQueue.postRunnable(() -> {
            try {
                String result = request(prompt(mode, source));
                AndroidUtilities.runOnUIThread(() -> {
                    try {
                        progress.dismiss();
                    } catch (Exception ignore) {
                    }
                    if (TextUtils.isEmpty(result)) {
                        BulletinFactory.of(fragment).createErrorBulletin("Gemini не ответил").show();
                        return;
                    }
                    showResult(fragment, mode, result, onReplace);
                });
            } catch (Exception e) {
                FileLog.e(e);
                AndroidUtilities.runOnUIThread(() -> {
                    try {
                        progress.dismiss();
                    } catch (Exception ignore) {
                    }
                    BulletinFactory.of(fragment).createErrorBulletin(e.getMessage() != null ? e.getMessage() : "Ошибка Gemini").show();
                });
            }
        });
    }

    private static void showResult(BaseFragment fragment, Mode mode, String result, Callback onReplace) {
        Activity activity = fragment.getParentActivity();
        if (activity == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, fragment.getResourceProvider());
        builder.setTitle(title(mode));

        LinearLayout layout = new LinearLayout(activity);
        layout.setOrientation(LinearLayout.VERTICAL);
        int pad = AndroidUtilities.dp(24);
        layout.setPadding(pad, AndroidUtilities.dp(8), pad, 0);

        TextView textView = new TextView(activity);
        textView.setText(result);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 16);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
        textView.setGravity(Gravity.LEFT);
        layout.addView(textView);
        builder.setView(layout);

        builder.setPositiveButton("В буфер", (d, w) -> {
            AndroidUtilities.addToClipboard(result);
            BulletinFactory.of(fragment).createCopyBulletin("Скопировано").show();
        });
        if (onReplace != null && (mode == Mode.FORMAL || mode == Mode.PROOFREAD || mode == Mode.TRANSLATE)) {
            builder.setNegativeButton("Заменить", (d, w) -> onReplace.onResult(result));
        } else {
            builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
        }
        fragment.showDialog(builder.create());
    }

    public static String request(String prompt) throws Exception {
        String key = PlusConfig.getGeminiApiKey();
        String model = PlusConfig.getGeminiModel();
        if (TextUtils.isEmpty(key)) {
            throw new IllegalStateException("Нет ключа Gemini");
        }
        URL url = new URL("https://generativelanguage.googleapis.com/v1beta/models/" + model + ":generateContent");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setConnectTimeout(20000);
        connection.setReadTimeout(40000);
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        connection.setRequestProperty("x-goog-api-key", key);

        JSONObject body = new JSONObject();
        JSONArray contents = new JSONArray();
        JSONObject content = new JSONObject();
        JSONArray parts = new JSONArray();
        parts.put(new JSONObject().put("text", prompt));
        content.put("parts", parts);
        contents.put(content);
        body.put("contents", contents);
        JSONObject gen = new JSONObject();
        gen.put("temperature", 0.2d);
        gen.put("maxOutputTokens", 2048);
        body.put("generationConfig", gen);

        byte[] bytes = body.toString().getBytes(StandardCharsets.UTF_8);
        try (OutputStream os = connection.getOutputStream()) {
            os.write(bytes);
        }

        int code = connection.getResponseCode();
        InputStream stream = code >= 200 && code < 300 ? connection.getInputStream() : connection.getErrorStream();
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        }
        connection.disconnect();
        if (code < 200 || code >= 300) {
            throw new IllegalStateException(shortError(sb.toString(), code));
        }
        return parseText(sb.toString());
    }

    private static String parseText(String json) throws Exception {
        JSONObject root = new JSONObject(json);
        JSONArray candidates = root.optJSONArray("candidates");
        if (candidates == null || candidates.length() == 0) {
            return null;
        }
        JSONObject content = candidates.getJSONObject(0).optJSONObject("content");
        if (content == null) {
            return null;
        }
        JSONArray parts = content.optJSONArray("parts");
        if (parts == null) {
            return null;
        }
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < parts.length(); i++) {
            String text = parts.getJSONObject(i).optString("text");
            if (!TextUtils.isEmpty(text)) {
                if (out.length() > 0) {
                    out.append('\n');
                }
                out.append(text.trim());
            }
        }
        return out.toString();
    }

    private static String shortError(String json, int code) {
        try {
            JSONObject root = new JSONObject(json);
            JSONObject error = root.optJSONObject("error");
            if (error != null) {
                String message = error.optString("message");
                if (!TextUtils.isEmpty(message)) {
                    return message;
                }
            }
        } catch (Exception ignore) {
        }
        return "Gemini HTTP " + code;
    }
}
