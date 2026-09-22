package org.telegram.ui.plus;

import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.LaunchActivity;

import java.util.HashMap;
import java.util.concurrent.Executor;

public class PlusBiometric {

    private static final long UNLOCK_MS = 5 * 60 * 1000L;
    private static final HashMap<String, Long> unlockedUntil = new HashMap<>();

    public static boolean isAvailable() {
        try {
            Activity activity = LaunchActivity.instance;
            if (activity == null) {
                return false;
            }
            BiometricManager manager = BiometricManager.from(activity);
            int can = manager.canAuthenticate(BiometricManager.Authenticators.BIOMETRIC_WEAK | BiometricManager.Authenticators.DEVICE_CREDENTIAL);
            return can == BiometricManager.BIOMETRIC_SUCCESS;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static boolean isUnlocked(String key) {
        Long until = unlockedUntil.get(key);
        return until != null && until > System.currentTimeMillis();
    }

    public static void markUnlocked(String key) {
        unlockedUntil.put(key, System.currentTimeMillis() + UNLOCK_MS);
    }

    public static void authenticate(BaseFragment fragment, String title, String key, Runnable onSuccess, Runnable onFail) {
        if (fragment == null) {
            if (onFail != null) {
                onFail.run();
            }
            return;
        }
        if (key != null && isUnlocked(key)) {
            if (onSuccess != null) {
                onSuccess.run();
            }
            return;
        }
        Activity activity = fragment.getParentActivity();
        if (!(activity instanceof LaunchActivity) || !isAvailable()) {
            confirmFallback(fragment, title, key, onSuccess, onFail);
            return;
        }
        Executor executor = ContextCompat.getMainExecutor(activity);
        BiometricPrompt prompt = new BiometricPrompt((LaunchActivity) activity, executor, new BiometricPrompt.AuthenticationCallback() {
            @Override
            public void onAuthenticationError(int errorCode, @NonNull CharSequence errString) {
                if (onFail != null) {
                    AndroidUtilities.runOnUIThread(onFail);
                }
            }

            @Override
            public void onAuthenticationSucceeded(@NonNull BiometricPrompt.AuthenticationResult result) {
                if (key != null) {
                    markUnlocked(key);
                }
                if (onSuccess != null) {
                    AndroidUtilities.runOnUIThread(onSuccess);
                }
            }

            @Override
            public void onAuthenticationFailed() {
            }
        });
        BiometricPrompt.PromptInfo info = new BiometricPrompt.PromptInfo.Builder()
                .setTitle(title != null ? title : "Подтверждение")
                .setSubtitle("Биометрия или пароль устройства")
                .setAllowedAuthenticators(BiometricManager.Authenticators.BIOMETRIC_WEAK | BiometricManager.Authenticators.DEVICE_CREDENTIAL)
                .build();
        try {
            prompt.authenticate(info);
        } catch (Exception e) {
            FileLog.e(e);
            confirmFallback(fragment, title, key, onSuccess, onFail);
        }
    }

    private static void confirmFallback(BaseFragment fragment, String title, String key, Runnable onSuccess, Runnable onFail) {
        if (fragment.getParentActivity() == null) {
            if (onFail != null) {
                onFail.run();
            }
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(fragment.getParentActivity(), fragment.getResourceProvider());
        builder.setTitle(title != null ? title : "Подтверждение");
        builder.setMessage("На устройстве нет биометрии. Открыть всё равно?");
        builder.setPositiveButton("Открыть", (d, w) -> {
            if (key != null) {
                markUnlocked(key);
            }
            if (onSuccess != null) {
                onSuccess.run();
            }
        });
        builder.setNegativeButton("Отмена", (d, w) -> {
            if (onFail != null) {
                onFail.run();
            }
        });
        builder.setOnCancelListener(d -> {
            if (onFail != null) {
                onFail.run();
            }
        });
        fragment.showDialog(builder.create());
    }
}
