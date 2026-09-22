#!/usr/bin/env bash
# Per-boot reconciliation. The Android SDK lives in the snapshot, but the
# repository is checked out fresh on every pod, so re-create the (gitignored)
# local.properties that points Gradle at the SDK. Without it settings.gradle.kts
# excludes the :app module and the APK cannot be built.
set -euo pipefail

REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
PROJECT_DIR="$REPO_ROOT/antigravity"
export ANDROID_HOME="${ANDROID_HOME:-$HOME/android-sdk}"

if [ -x "$ANDROID_HOME/cmdline-tools/latest/bin/sdkmanager" ]; then
  printf 'sdk.dir=%s\n' "$ANDROID_HOME" > "$PROJECT_DIR/local.properties"
  echo "[start] local.properties -> sdk.dir=$ANDROID_HOME"
else
  echo "[start] WARNING: Android SDK not found at $ANDROID_HOME; run .cursor/install.sh" >&2
fi
