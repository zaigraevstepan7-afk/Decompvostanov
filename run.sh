#!/usr/bin/env bash
set -euo pipefail
ROOT="$(cd "$(dirname "$0")" && pwd)"
cd "$ROOT"
OUT="$ROOT/build/workbench-manual"
mkdir -p "$OUT"
find workbench/src/main/java -name '*.java' > "$OUT/sources.txt"
javac --release 21 -cp "$ROOT/lib/gson-2.11.0.jar" -d "$OUT" @"$OUT/sources.txt"
cp -R src/main/resources/. "$OUT/" 2>/dev/null || true
cp -R workbench/src/main/resources/. "$OUT/" 2>/dev/null || true
exec java -cp "$OUT:$ROOT/lib/gson-2.11.0.jar" fun.nursultan.restore.Main "$@"
