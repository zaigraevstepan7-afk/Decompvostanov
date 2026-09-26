# Bozya VPN

Телефон, Windows и macOS. Версия `1.0.68`. Телефон не закрывается сам. Windows — программа `Bozya-VPN-windows.exe` со своим окном. macOS — `Bozya VPN.app`. VLESS — вшитый сервер Nikitok. AI Ultra меняет только DNS. «Поддержать» показывает Сбербанк и номер.

Телефон (`com.nimbus.vpn.debug`):

https://github.com/zaigraevstepan7-afk/Decompvostanov/raw/cursor/nimbus-android-vpn-0272/dist/Bozya-VPN-debug.apk

Windows:

https://github.com/zaigraevstepan7-afk/Decompvostanov/raw/cursor/nimbus-android-vpn-0272/dist/Bozya-VPN-windows.exe

Это обычная программа: двойной клик открывает окно Bozya VPN. Запуск спросит права администратора. SmartScreen может остановить неподписанный файл: «Подробнее» → «Выполнить в любом случае». В окне создаются WARP, Nikitok и AI Ultra, обновляются белые списки. Первый запуск VLESS, белых списков и AI Ultra скачивает Xray. WARP поднимает свой туннель сразу.

macOS (Apple Silicon и Intel в одном архиве):

https://github.com/zaigraevstepan7-afk/Decompvostanov/raw/cursor/nimbus-android-vpn-0272/dist/Bozya-VPN-macos.zip

Распакуй и открой «Bozya VPN.app». Система спросит пароль. Если Gatekeeper не пускает: правый клик → «Открыть».

«Выход» выключает туннель и саму программу. Повторный запуск снова открывает окно.
