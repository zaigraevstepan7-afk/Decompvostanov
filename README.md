# Nursultan restored

Два архива из `nursultan.zip`:

1. `nursultan.jar` — классы уже сведены в `manifest.tsv` (`KDFzREm/*`).
2. `nursultan-lambdas.jar` — сырые лямбды, раньше не обрабатывались.

Скрипт `tools/reconstruct.py` собирает оба в пакет `KDFzREm` и пишет runtime-jar.

## Что восстановлено

| слой | число |
|---|---|
| классы | 3001 |
| лямбды | 11267 |
| методы / функции | 39080 |
| модули (`UM`) | 109 |
| вход | `KDFzREm.NNNNGY` (`ClientModInitializer`) |
| ядро | `KDFzREm.y` |
| меню | `KDFzREm.Gs` |
| HUD | `KDFzREm.td` |

Байткод: `runtime/nursultan-classes-restored.jar`, `runtime/nursultan-lambdas-restored.jar`.  
Индекс методов: `src/main/resources/nursultan/methods.json`.  
Ядро, декомпил: `decompiled/KDFzREm/{y,Gs,td,NNNNGY}.java`.  
Все 109 чит-модулей: `decompiled/modules/KDFzREm/` (`Uv` = AttackAura, `Ub` = AimAssist, …).

Оригинальный клиент — Fabric + Minecraft. Полный запуск внутри игры требует игру, loader и нативы. Здесь поднимается живое меню со всеми восстановленными категориями, модулями, HUD, AutoBuy, аккаунтами, реди-курсами (пресеты) и браузером классов/функций.

## Запуск

```bash
./gradlew run
```

Проверка без окна:

```bash
./gradlew selfTest
```

Либо без Gradle:

```bash
./run.sh
./run.sh --self-test
```

Меню: Combat / Movement / Player / Visual / Misc, HUD, AutoBuy, аккаунты, реди курсы, классы.

Повторная сборка дампов:

```bash
python3 tools/reconstruct.py
```
