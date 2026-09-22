#!/usr/bin/env python3
"""Rebuild both Nursultan dumps: remapped classes (jar 1) and raw lambdas (jar 2)."""

from __future__ import annotations

import csv
import hashlib
import json
import os
import shutil
import struct
import zipfile
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
ZIP_PATH = ROOT / "nursultan.zip"
WORK = Path("/tmp/nursultan-rebuild")
OUT_RUNTIME = ROOT / "runtime"
OUT_CATALOG = ROOT / "src" / "main" / "resources" / "nursultan"


def read_utf8_strings(data: bytes) -> list[str]:
    out: list[str] = []
    if len(data) < 10:
        return out
    count = struct.unpack(">H", data[8:10])[0]
    i = 10
    n = 1
    while n < count and i < len(data) - 2:
        tag = data[i]
        if tag == 1:
            ln = struct.unpack(">H", data[i + 1 : i + 3])[0]
            raw = data[i + 3 : i + 3 + ln]
            try:
                out.append(raw.decode("utf-8"))
            except UnicodeDecodeError:
                pass
            i += 3 + ln
        elif tag in (7, 8, 16, 19, 20):
            i += 3
        elif tag in (3, 4, 9, 10, 11, 12, 17, 18):
            i += 5
        elif tag in (5, 6):
            i += 9
            n += 1
        elif tag == 15:
            i += 4
        else:
            break
        n += 1
    return out


def class_internal_name(data: bytes) -> str | None:
    if len(data) < 10 or data[:4] != b"\xca\xfe\xba\xbe":
        return None
    count = struct.unpack(">H", data[8:10])[0]
    i = 10
    n = 1
    strings: dict[int, str] = {}
    class_refs: dict[int, int] = {}
    while n < count and i < len(data) - 2:
        tag = data[i]
        if tag == 1:
            ln = struct.unpack(">H", data[i + 1 : i + 3])[0]
            raw = data[i + 3 : i + 3 + ln]
            try:
                strings[n] = raw.decode("utf-8")
            except UnicodeDecodeError:
                strings[n] = ""
            i += 3 + ln
        elif tag == 7:
            class_refs[n] = struct.unpack(">H", data[i + 1 : i + 3])[0]
            i += 3
        elif tag in (8, 16, 19, 20):
            i += 3
        elif tag in (3, 4, 9, 10, 11, 12, 17, 18):
            i += 5
        elif tag in (5, 6):
            i += 9
            n += 1
        elif tag == 15:
            i += 4
        else:
            return None
        n += 1
    if i + 2 > len(data):
        return None
    this_class = struct.unpack(">H", data[i + 2 : i + 4])[0]
    utf_index = class_refs.get(this_class)
    if utf_index is None:
        return None
    return strings.get(utf_index)


def extract_zip() -> tuple[Path, Path]:
    WORK.mkdir(parents=True, exist_ok=True)
    with zipfile.ZipFile(ZIP_PATH) as zf:
        zf.extractall(WORK / "zip")
    classes_jar = WORK / "zip" / "nursultan" / "nursultan.jar"
    lambdas_jar = WORK / "zip" / "nursultan" / "nursultan-lambdas.jar"
    if not classes_jar.exists() or not lambdas_jar.exists():
        raise SystemExit("expected both jars inside nursultan.zip")
    return classes_jar, lambdas_jar


def rebuild_classes(classes_jar: Path) -> list[dict]:
    dest_root = WORK / "classes-tree"
    if dest_root.exists():
        shutil.rmtree(dest_root)
    dest_root.mkdir(parents=True)
    rows: list[dict] = []
    with zipfile.ZipFile(classes_jar) as zf:
        names = [n for n in zf.namelist() if n.startswith("classes/") and n.endswith(".class") and "__MACOSX" not in n]
        manifest_data = zf.read("classes/manifest.tsv").decode("utf-8", "replace")
        file_to_internal: dict[str, str] = {}
        for line in manifest_data.splitlines():
            parts = line.split("\t")
            if len(parts) >= 2:
                file_to_internal[parts[1]] = parts[0]
        for name in names:
            raw = zf.read(name)
            filename = Path(name).name
            internal = file_to_internal.get(filename) or class_internal_name(raw) or f"KDFzREm/{filename[:-6]}"
            out = dest_root / f"{internal}.class"
            out.parent.mkdir(parents=True, exist_ok=True)
            out.write_bytes(raw)
            rows.append(
                {
                    "internal": internal,
                    "file": filename,
                    "size": len(raw),
                    "sha1": hashlib.sha1(raw).hexdigest(),
                    "source": "nursultan.jar",
                }
            )
    OUT_RUNTIME.mkdir(parents=True, exist_ok=True)
    jar_path = OUT_RUNTIME / "nursultan-classes-restored.jar"
    with zipfile.ZipFile(jar_path, "w", compression=zipfile.ZIP_DEFLATED) as out:
        for path in dest_root.rglob("*.class"):
            out.write(path, path.relative_to(dest_root).as_posix())
        manifest = WORK / "manifest-classes.tsv"
        write_manifest(manifest, rows)
        out.write(manifest, "manifest.tsv")
    shutil.copy2(WORK / "manifest-classes.tsv", OUT_RUNTIME / "manifest-classes.tsv")
    return rows


def rebuild_lambdas(lambdas_jar: Path) -> list[dict]:
    dest_root = WORK / "lambdas-tree"
    if dest_root.exists():
        shutil.rmtree(dest_root)
    dest_root.mkdir(parents=True)
    rows: list[dict] = []
    with zipfile.ZipFile(lambdas_jar) as zf:
        names = [n for n in zf.namelist() if n.startswith("lambdas/") and n.endswith(".class") and "__MACOSX" not in n]
        for name in names:
            raw = zf.read(name)
            filename = Path(name).name
            internal = class_internal_name(raw)
            if not internal:
                stem = filename[:-6]
                internal = f"KDFzREm/{stem}"
            # Keep original synthetic name; only sanitize path separators.
            safe = internal.replace("\\", "/")
            out = dest_root / f"{safe}.class"
            out.parent.mkdir(parents=True, exist_ok=True)
            if out.exists():
                digest = hashlib.sha1(raw).hexdigest()[:8]
                out = dest_root / f"{safe}__{digest}.class"
            out.write_bytes(raw)
            rows.append(
                {
                    "internal": internal,
                    "file": filename,
                    "size": len(raw),
                    "sha1": hashlib.sha1(raw).hexdigest(),
                    "source": "nursultan-lambdas.jar",
                }
            )
    jar_path = OUT_RUNTIME / "nursultan-lambdas-restored.jar"
    with zipfile.ZipFile(jar_path, "w", compression=zipfile.ZIP_DEFLATED) as out:
        for path in dest_root.rglob("*.class"):
            out.write(path, path.relative_to(dest_root).as_posix())
        manifest = WORK / "manifest-lambdas.tsv"
        write_manifest(manifest, rows)
        out.write(manifest, "manifest.tsv")
    shutil.copy2(WORK / "manifest-lambdas.tsv", OUT_RUNTIME / "manifest-lambdas.tsv")
    return rows


def write_manifest(path: Path, rows: list[dict]) -> None:
    with path.open("w", encoding="utf-8", newline="") as fh:
        w = csv.writer(fh, delimiter="\t", lineterminator="\n")
        w.writerow(["internal", "file", "size", "sha1", "source"])
        for row in sorted(rows, key=lambda r: r["internal"].lower()):
            w.writerow([row["internal"], row["file"], row["size"], row["sha1"], row["source"]])


KNOWN_MODULES = [
    ("combat", "AimAssist", "Наведение на цель в заданном радиусе", ["aim-range", "through-walls", "pvp-only"]),
    ("combat", "AttackAura", "Автоатака выбранных сущностей", ["aim-range", "aura-only", "critical-hit", "through-walls"]),
    ("combat", "TriggerBot", "Удар при наведении на цель", ["pvp-only", "critical-only-space", "hit-only"]),
    ("combat", "AntiBot", "Отсев ботов из таргетинга", ["no-bot-interaction"]),
    ("combat", "NoVelocity", "Гашение отдачи и нокбэка", ["enabled"]),
    ("combat", "AutoTotem", "Автопостановка тотема", ["totem-of-undying", "from-inventory"]),
    ("combat", "AutoExplosion", "Автоподрыв кристаллов / TNT", ["crystal-trigger", "tnt-trigger", "distance-to-crystal"]),
    ("combat", "AutoSwap", "Смена предмета по условию", ["swap-key", "swap-item", "from-inventory"]),
    ("combat", "NoFriendDamage", "Не бить друзей", ["friends"]),
    ("combat", "Criticals", "Принудительные криты", ["critical-always", "critical-only-space", "increase-crit-accuracy"]),
    ("combat", "ShieldBreak", "Сбитие щита", ["shield-break"]),
    ("combat", "NoSlow", "Без замедления при использовании", ["using-item", "using-shield"]),
    ("movement", "Speed", "Ускорение перемещения", ["speed-xz", "speed-y", "ground-only"]),
    ("movement", "Sprint", "Постоянный спринт", ["sprint-mode", "reset-sprint"]),
    ("movement", "SprintReset", "Сброс спринта для удара", ["reset-sprint", "jump-reset"]),
    ("movement", "Scaffold", "Автоустановка блоков под ногами", ["safe-walk", "tower"]),
    ("movement", "Timer", "Искажение клиентского таймера", ["speed"]),
    ("movement", "Blink", "Буфер пакетов движения", ["auto-release-packets", "release-packets-on-hit"]),
    ("movement", "AutoJump", "Автопрыжок", ["auto-jump", "jump-delay"]),
    ("movement", "NoWeb", "Игнор паутины", []),
    ("movement", "NoPush", "Игнор столкновений", ["entity-push", "block-push"]),
    ("movement", "ElytraTarget", "Наведение / полёт на элитрах", ["elytra-gliding", "elytra-health-trigger"]),
    ("player", "AutoArmor", "Автоэкипировка брони", ["armor-durability", "min-durability-percentage"]),
    ("player", "AutoEat", "Автоеда", ["any-food", "ignore-hunger", "health-trigger"]),
    ("player", "AutoFish", "Авторыбалка", ["fishing-rod"]),
    ("player", "AutoTool", "Автовыбор инструмента", ["only-while-breaking"]),
    ("player", "AutoPotion", "Автозелья", ["heal-health", "speed-potion", "strength-potion"]),
    ("player", "AutoPearl", "Автоэндерперл", ["ender-pearl", "throw-key"]),
    ("player", "AutoTotem", "Тотем в руку", ["totem-of-undying"]),
    ("player", "ChestStealer", "Сбор лута из контейнеров", ["auto-close", "delay-in-ticks"]),
    ("player", "Inventory", "Инвентарь и хотбар", ["inventory-only", "hotbar-only"]),
    ("player", "NoDelay", "Снятие клиентских задержек", ["break-delay", "delay-ticks"]),
    ("player", "NoInteract", "Блок взаимодействий", ["block-interact", "entity-interact"]),
    ("player", "NoSlotChange", "Запрет смены слота сервером", ["reset-slot"]),
    ("player", "ClickAction", "Действия по клику", ["left-mouse", "right-click", "any-item-click"]),
    ("player", "ExpBottle", "Автоопыт", ["exp-bottle", "fast"]),
    ("player", "FastExp", "Быстрые пузырьки опыта", ["bottle-of-exp"]),
    ("player", "AutoDripstone", "Автодрипстоун", ["falling-dripstone-trigger"]),
    ("visual", "EntityESP", "Подсветка сущностей", ["player-color", "living-color", "through-walls"]),
    ("visual", "BlockESP", "Подсветка блоков", ["box-color", "blockesp"]),
    ("visual", "TargetEsp", "ESP текущей цели", ["target", "line-color"]),
    ("visual", "TargetInfo", "Карточка цели", ["show-absorption", "show-armor-details", "health-bar"]),
    ("visual", "Tracers", "Линии до сущностей", ["line-color", "player-radius"]),
    ("visual", "FreeCamera", "Свободная камера", ["camera-clip", "show-camera-position"]),
    ("visual", "ViewModel", "Смещение рук / предмета", ["left-hand-x", "right-hand-x", "aspect-ratio"]),
    ("visual", "AspectRatio", "Соотношение сторон", ["custom-ratio", "aspect-ratio"]),
    ("visual", "KillEffect", "Эффект убийства", ["heart-effect", "shader-effect"]),
    ("visual", "CustomCape", "Кастомный плащ", []),
    ("visual", "FakePlayer", "Фейковый игрок", ["custom-name"]),
    ("visual", "NoEntityTrace", "Клик сквозь сущности", []),
    ("visual", "NoServerRotation", "Игнор серверного поворота", []),
    ("visual", "Ambience", "Время и атмосфера", ["ambience", "spooky-time"]),
    ("visual", "Nuker", "Массовая ломка блоков", ["break-only-allowed-blocks", "break-only-in-selection"]),
    ("misc", "AutoAuth", "Автологин", []),
    ("misc", "AutoAccept", "Автопринятие запросов", ["teleport-request", "clan-invite-request", "friends-accept-only"]),
    ("misc", "AutoJoin", "Автовход на сервер", ["auto-launch"]),
    ("misc", "AutoLeave", "Автовыход", ["auto-enable-auto-leave", "auto-leave"]),
    ("misc", "AutoReconnect", "Переподключение", []),
    ("misc", "AutoRespawn", "Автореспавн", ["death-waypoint"]),
    ("misc", "AntiAFK", "Анти-афк", []),
    ("misc", "BypassHealth", "Обход отображения здоровья", []),
    ("misc", "SRPSpoofer", "Подмена ресурс-пака", []),
    ("misc", "StreamerMode", "Скрытие ников / IP", ["custom-name"]),
    ("misc", "Notifications", "Уведомления клиента", ["event-notification", "toggle-sounds"]),
    ("misc", "IRC", "Чат nursultan.fun", ["irc-ping"]),
    ("misc", "DeathCoords", "Координаты смерти", ["save-waypoint", "automatic-add-waypoint"]),
    ("misc", "PotionTracker", "Трекинг зелий", ["food-tracker", "totem-tracker"]),
    ("misc", "NoSlow", "Без слоу", ["using-item"]),
    ("hud", "Watermark", "Водяной знак Nursultan", ["hud-scale"]),
    ("hud", "Coordinates", "Координаты", ["hud-scale"]),
    ("hud", "Hotkeys", "Список биндов", ["hud-hotkeys"]),
    ("hud", "Effects", "Эффекты зелий", ["hud-effects"]),
    ("hud", "Inventory", "Превью инвентаря", ["hud-inventory"]),
    ("hud", "Cooldowns", "Откаты предметов", ["hud-cooldowns"]),
    ("hud", "Target", "Target HUD", ["health-bar", "show-armor-details"]),
    ("hud", "Arrows", "Счётчик стрел", []),
    ("hud", "Potions", "Счётчик зелий", ["Potions"]),
    ("autobuy", "AutoBuy", "Автозакуп на аукционе", ["max-price", "min-count", "auto-parser", "decrease-prices"]),
]

HUD_WIDGETS = [
    "nursultan",
    "coordinates",
    "hotkeys",
    "effects",
    "inventory",
    "cooldowns",
    "target",
    "arrows",
    "potions",
]

MENU_ICONS = [
    "nursultan",
    "search",
    "bind",
    "client-settings",
    "plus",
    "import",
    "delete",
    "dots",
    "expand",
    "squeeze",
    "sparkles",
    "angles",
    "xmark",
]


def write_catalog(class_rows: list[dict], lambda_rows: list[dict]) -> None:
    OUT_CATALOG.mkdir(parents=True, exist_ok=True)
    modules = []
    seen = set()
    for cat, name, desc, settings in KNOWN_MODULES:
        key = (cat, name)
        if key in seen:
            continue
        seen.add(key)
        modules.append(
            {
                "id": name.lower(),
                "name": name,
                "category": cat,
                "description": desc,
                "settings": [{"id": s, "label": s.replace("-", " "), "type": "toggle"} for s in settings],
            }
        )
    catalog = {
        "client": "Nursultan",
        "site": "https://nursultan.fun",
        "telegram": "https://t.me/nursultan_mc",
        "package": "KDFzREm",
        "initializer": "KDFzREm.NNNNGY",
        "core": "KDFzREm.y",
        "menuClass": "KDFzREm.Gs",
        "hudClass": "KDFzREm.td",
        "categories": [
            "combat",
            "movement",
            "player",
            "visual",
            "misc",
            "hud",
            "autobuy",
            "configs",
            "accounts",
        ],
        "modules": modules,
        "hudWidgets": HUD_WIDGETS,
        "menuIcons": MENU_ICONS,
        "stats": {
            "classes": len(class_rows),
            "lambdas": len(lambda_rows),
        },
    }
    (OUT_CATALOG / "catalog.json").write_text(json.dumps(catalog, ensure_ascii=False, indent=2), encoding="utf-8")
    index = {
        "classes": [r["internal"] for r in sorted(class_rows, key=lambda r: r["internal"].lower())],
        "lambdas": [r["internal"] for r in sorted(lambda_rows, key=lambda r: r["internal"].lower())],
    }
    (OUT_CATALOG / "restored-index.json").write_text(json.dumps(index, ensure_ascii=False), encoding="utf-8")


def main() -> None:
    classes_jar, lambdas_jar = extract_zip()
    print("rebuilding classes from", classes_jar)
    class_rows = rebuild_classes(classes_jar)
    print("classes", len(class_rows))
    print("processing lambdas from", lambdas_jar)
    lambda_rows = rebuild_lambdas(lambdas_jar)
    print("lambdas", len(lambda_rows))
    write_catalog(class_rows, lambda_rows)
    print("wrote catalog + restored jars")


if __name__ == "__main__":
    main()
