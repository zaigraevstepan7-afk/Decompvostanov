#!/usr/bin/env bash
set -euo pipefail

SDK_ROOT="${ANDROID_HOME:-${ANDROID_SDK_ROOT:-$HOME/android-sdk}}"
CMDLINE_VERSION="${ANDROID_CMDLINE_TOOLS_VERSION:-13114758}"
ZIP_NAME="commandlinetools-linux-${CMDLINE_VERSION}_latest.zip"
ZIP_URL="https://dl.google.com/android/repository/${ZIP_NAME}"

mkdir -p "${SDK_ROOT}/cmdline-tools"
if [[ ! -x "${SDK_ROOT}/cmdline-tools/latest/bin/sdkmanager" ]]; then
  tmpdir="$(mktemp -d)"
  curl -fL "${ZIP_URL}" -o "${tmpdir}/${ZIP_NAME}"
  unzip -q "${tmpdir}/${ZIP_NAME}" -d "${tmpdir}"
  rm -rf "${SDK_ROOT}/cmdline-tools/latest"
  mv "${tmpdir}/cmdline-tools" "${SDK_ROOT}/cmdline-tools/latest"
  rm -rf "${tmpdir}"
fi

export ANDROID_HOME="${SDK_ROOT}"
export ANDROID_SDK_ROOT="${SDK_ROOT}"
SDKMANAGER="${SDK_ROOT}/cmdline-tools/latest/bin/sdkmanager"

yes | "${SDKMANAGER}" --sdk_root="${SDK_ROOT}" --licenses >/dev/null || true
"${SDKMANAGER}" --sdk_root="${SDK_ROOT}" \
  "platform-tools" \
  "platforms;android-36" \
  "build-tools;36.0.0" \
  "ndk;27.2.12479018" \
  "cmake;3.22.1"

cat > "$(dirname "$0")/../local.properties" <<EOF
sdk.dir=${SDK_ROOT}
EOF

echo "Android SDK installed at ${SDK_ROOT}"
echo "Wrote local.properties"
