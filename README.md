# Nursultan Client — restored source (1.21.11)

Готовый Fabric-проект. Запуск как оригинал: Minecraft + Fabric Loader, меню по **Right Shift**.

Dump: `Build: 1.21.11`. Вход оригинала — `KDFzREm.NNNNGY`. Дерево модулей — 109 классов `KDFzREm.UM`.

## Запуск чита

```bash
./gradlew runClient
```

Правый Shift открывает clickgui. ЛКМ по карточке — toggle. ПКМ / край карточки — settings.

Собранный мод: `build/libs/nursultan-client-1.21.11-restored.jar`  
Кинуть в `.minecraft/mods` вместе с Fabric API `0.141.6+1.21.11`.

```bash
./gradlew build
./gradlew selfTest
```

## Исходник клиента

| путь | что |
|---|---|
| `src/client/java/fun/nursultan/client/NursultanClient.java` | Fabric entry (как `NNNNGY`) |
| `src/client/java/fun/nursultan/client/ui/ClickGuiScreen.java` | игровое меню |
| `src/client/java/fun/nursultan/client/modules/combat/` | AttackAura (`Uv`), AimAssist (`Ub`), TriggerBot (`Uj`), NoVelocity (`WG`) |
| `src/client/java/fun/nursultan/client/modules/movement/` | Speed, Sprint |
| `src/client/java/fun/nursultan/client/modules/visual/` | EntityESP (`Ta`) |
| `src/client/java/fun/nursultan/client/modules/GeneratedModules.java` | все 109 UM-модулей |
| `decompiled/modules/KDFzREm/` | полный декомпил 109 модулей + `UM` |
| `decompiled/KDFzREm/{y,Gs,td,NNNNGY}.java` | ядро / меню / HUD / entry |
| `runtime/*.jar` | восстановленный байткод обоих архивов |

Оригинальный `Gs` рисует через MC RenderPipeline — без игры не встанет. Здесь меню и тики завязаны на официальные Mojang mappings 1.21.11, модули из дампа, логика combat/movement/visual — рабочая.

## Дамп

`tools/reconstruct.py` собирает обе шипки в `KDFzREm`. 3001 класс, 11267 лямбд, 39080 методов.
