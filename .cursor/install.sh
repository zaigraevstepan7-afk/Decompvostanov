#!/usr/bin/env bash
# Idempotent bootstrap for the Antigravity Android project.
# Installs the Android SDK (once, captured in the environment snapshot),
# wires up local.properties, and warms the Gradle caches by building the
# debug APK and compiling the :core test sources.
set -euo pipefail

REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
PROJECT_DIR="$REPO_ROOT/antigravity"
export ANDROID_HOME="${ANDROID_HOME:-$HOME/android-sdk}"
export ANDROID_SDK_ROOT="$ANDROID_HOME"

CMDLINE_TOOLS_VERSION="commandlinetools-linux-11076708_latest.zip"
SDKMANAGER="$ANDROID_HOME/cmdline-tools/latest/bin/sdkmanager"

if [ ! -x "$SDKMANAGER" ]; then
  echo "[install] Installing Android command-line tools..."
  mkdir -p "$ANDROID_HOME/cmdline-tools"
  tmp_zip="$(mktemp --suffix=.zip)"
  curl -fsSL -o "$tmp_zip" "https://dl.google.com/android/repository/$CMDLINE_TOOLS_VERSION"
  rm -rf "$ANDROID_HOME/cmdline-tools/latest" "$ANDROID_HOME/cmdline-tools/extracted"
  python3 -c "import zipfile,sys; zipfile.ZipFile(sys.argv[1]).extractall(sys.argv[2])" "$tmp_zip" "$ANDROID_HOME/cmdline-tools/extracted"
  mv "$ANDROID_HOME/cmdline-tools/extracted/cmdline-tools" "$ANDROID_HOME/cmdline-tools/latest"
  rmdir "$ANDROID_HOME/cmdline-tools/extracted" 2>/dev/null || true
  rm -f "$tmp_zip"
  chmod +x "$ANDROID_HOME/cmdline-tools/latest/bin/"*
fi

echo "[install] Accepting SDK licenses and installing packages (idempotent)..."
# `yes` receives SIGPIPE once sdkmanager stops reading; guard pipefail so that
# expected 141 does not abort the script.
set +o pipefail
yes | "$SDKMANAGER" --sdk_root="$ANDROID_HOME" --licenses >/dev/null
set -o pipefail
"$SDKMANAGER" --sdk_root="$ANDROID_HOME" \
  "platform-tools" "platforms;android-34" "build-tools;34.0.0" >/dev/null

echo "[install] Writing $PROJECT_DIR/local.properties"
printf 'sdk.dir=%s\n' "$ANDROID_HOME" > "$PROJECT_DIR/local.properties"

echo "[install] Warming Gradle caches (build debug APK + compile core tests)..."
cd "$PROJECT_DIR"
./gradlew --no-daemon :app:assembleDebug :core:compileTestKotlin

echo "[install] Done. Android SDK at $ANDROID_HOME"
