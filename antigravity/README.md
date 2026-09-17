# Antigravity

Агентный редактор для **рутованного Android**, по смыслу как Claude Code, но всё происходит **на телефоне**.

- Без root приложение не работает: нет чата, нет входа.
- Вход только через **Google / Antigravity OAuth** (квоты Cloud Code Assist). Это **не** Gemini API key.
- Модели: `gemini-3-flash`, `gemini-3.5-flash`, `gemini-3-pro-low`, `gemini-3-pro-high`, `gemini-2.5-pro`, `gemini-2.5-flash`.
- Файлы, zip/rar/7z/tar, загрузки и shell выполняются локально на устройстве. Пример: «в Download лежит zip — распакуй и поправь» → агент сам вызывает `extract_archive` и правит распакованное.

OAuth совпадает с [EasyCLIProxyAPI](https://github.com/router-for-me/EasyCLIProxyAPI) / [CLIProxyAPI](https://github.com/router-for-me/CLIProxyAPI): браузер Google → `http://127.0.0.1:51121/oauth-callback` → обмен code → `loadCodeAssist` / `onboardUser` → `cloudcode-pa.googleapis.com/v1internal:generateContent`.

## Сборка APK

Нужны JDK 17 и Android SDK (platform 34).

```bash
cd antigravity
echo "sdk.dir=/path/to/Android/sdk" > local.properties
./gradlew :app:assembleDebug
```

APK: `app/build/outputs/apk/debug/app-debug.apk`.

Установите на телефон, выдайте приложению root в Magisk, откройте **Antigravity**, войдите Google, укажите workspace (по умолчанию `/sdcard/Antigravity`).

## Тесты ядра (без SDK)

```bash
cd antigravity
./gradlew :core:test
```

## Инструменты агента

`read_file`, `write_file`, `edit_file`, `list_dir`, `glob`, `grep`, `mkdir`, `delete_path`, `move_path`, `copy_path`, `download`, `extract_archive`, `shell`.
