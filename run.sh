#!/usr/bin/env bash
set -euo pipefail
ROOT="$(cd "$(dirname "$0")" && pwd)"
cd "$ROOT"
OUT="$ROOT/build/manual"
mkdir -p "$OUT"
find src/main/java -name '*.java' > "$OUT/sources.txt"
javac --release 21 -cp "$ROOT/lib/gson-2.11.0.jar" -d "$OUT" @"$OUT/sources.txt"
cp -R src/main/resources/. "$OUT/"
exec java -cp "$OUT:$ROOT/lib/gson-2.11.0.jar" fun.nursultan.restore.Main "$@"
