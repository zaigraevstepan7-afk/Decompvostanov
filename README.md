# Неофициальный Telegram-клиент для Android

Полноценный Android-клиент Telegram на официальном исходнике [DrKLO/Telegram](https://github.com/DrKLO/Telegram) (версия **12.10.3**).  
Пока без плюшек ExtraGram/CherryGram — обычный Telegram.

Это **неофициальный** клиент. Он не связан с Telegram FZ-LLC.

## Что уже настроено

В `TMessagesProj/src/main/java/org/telegram/messenger/BuildVars.java`:

- `APP_ID = 2040`
- `APP_HASH = b18441a1ff607e10a989891a5462e627`
- автообновления официального приложения выключены
- Google Play Billing выключен (оплата через invoice внутри Telegram)
- passkeys выключены (работают только у официального приложения)

Package id:

| Сборка | applicationId | Можно ставить рядом с Telegram из Play Store |
|---|---|---|
| Debug | `org.telegram.messenger.beta` | да, если нет Telegram Beta |
| Standalone (рекомендуется) | `org.telegram.messenger.web` | да |

## Сборка в Android Studio

Нужно:

- Android Studio (рекомендуется 2024.3 / 2025.x)
- Android SDK 36
- Build-Tools 36.0.0
- NDK **27.2.12479018**
- CMake **3.22.1**
- JDK 17 или 21

Шаги:

1. Клонировать этот репозиторий.
2. Открыть проект в Android Studio (**Open**, не Import).
3. Дождаться Gradle sync.
4. Собрать конфигурацию:

```text
TMessagesProj_AppStandalone → afatStandalone
```

или debug:

```text
TMessagesProj_App → afatDebug
```

APK появится примерно здесь:

```text
TMessagesProj_AppStandalone/build/outputs/apk/afat/standalone/app.apk
TMessagesProj_App/build/outputs/apk/afat/debug/app.apk
```

## Сборка из терминала

```bash
# один раз: SDK + NDK
./scripts/setup-android-sdk.sh

export ANDROID_HOME="$HOME/android-sdk"
export ANDROID_SDK_ROOT="$ANDROID_HOME"

# debug APK
./gradlew :TMessagesProj_App:assembleAfatDebug

# standalone APK (как ставится с telegram.org)
./gradlew :TMessagesProj_AppStandalone:assembleAfatStandalone
```

## Подпись

В репозитории лежит демо-keystore из официального исходника:

- файл: `TMessagesProj/config/release.keystore`
- alias / пароли: `gradle.properties`

Перед публичным релизом замените keystore на свой и обновите пароли в `gradle.properties`.

## Лицензия

Код Telegram — GNU GPL v2 или новее, см. `LICENSE`.  
Официальный README апстрима: `README.upstream.md`.

Апстрим: `https://github.com/DrKLO/Telegram`  
Коммит: `9552e5541e1274b9557c9832b204dbfcaf44b3dc` (12.10.3 / 7089)
