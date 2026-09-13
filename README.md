# Nimbus

Android-клиент AmneziaWG / WireGuard с тёмным интерфейсом, импортом `.conf` и работой в фоне.

## Что умеет

- Импорт конфигов как у AmneziaWG: `Jc`, `Jmin`, `Jmax`, `S1–S4`, `H1–H4`, длинный `I1`
- Туннель через библиотеку `amneziawg-android` (`VpnService` + userspace `am-go`)
- Фоновый keep-alive: тихое уведомление, Always-on callback, автоподключение после reboot
- Root (если есть): whitelist Doze / appops / netpolicy, без глобального разгона CPU
- Анимации орба и mesh-фона останавливаются, когда приложение не на экране
- Конфиги в EncryptedSharedPreferences

## Сборка

JDK 17+ и Android SDK 35:

```bash
./gradlew :app:assembleDebug
./gradlew :app:testDebugUnitTest
```

APK: `app/build/outputs/apk/debug/app-debug.apk`  
Debug applicationId: `com.nimbus.vpn.debug`

## Установка

1. Разреши установку из неизвестных источников.
2. Поставь debug APK.
3. Импортируй `.conf` (файл или вставка).
4. При первом подключении разреши VPN.
5. В настройках включи автоподключение и root-защиту батареи.
6. Xiaomi / HyperOS: батарея → без ограничений для Nimbus.

## Батарея и root

Nimbus не отключает Doze на всём устройстве. С root он только добавляет себя в whitelist, чтобы OEM-киллер не резал VPN. Туннель — userspace AmneziaWG: обфускация `I1` не работает на обычном модуле `wireguard.ko`.

Если в конфиге нет `PersistentKeepalive`, Nimbus ставит 25 секунд.

## Приватность

Не коммить боевые `.conf`. Приватный ключ живёт только на телефоне.
