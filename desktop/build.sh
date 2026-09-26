#!/bin/sh
set -eu
cd "$(dirname "$0")"
if [ -x /tmp/gotool/go/bin/go ]; then
  export PATH="/tmp/gotool/go/bin:$PATH"
fi
export CGO_ENABLED=0
go test ./...
mkdir -p ../dist /tmp/bozya-mac
GOOS=windows GOARCH=amd64 go build -trimpath -ldflags "-s -w -H=windowsgui" -o ../dist/Bozya-VPN-windows.exe .
APP="/tmp/bozya-mac/Bozya VPN.app/Contents"
rm -rf "/tmp/bozya-mac/Bozya VPN.app"
mkdir -p "$APP/MacOS" "$APP/Resources"
GOOS=darwin GOARCH=amd64 go build -trimpath -ldflags "-s -w" -o "$APP/MacOS/Bozya-VPN-intel" .
GOOS=darwin GOARCH=arm64 go build -trimpath -ldflags "-s -w" -o "$APP/MacOS/Bozya-VPN-arm64" .
cp mac-readme.txt "/tmp/bozya-mac/Как открыть.txt"
cat > "$APP/Info.plist" << 'EOF'
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN" "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
<plist version="1.0">
<dict>
  <key>CFBundleName</key><string>Bozya VPN</string>
  <key>CFBundleDisplayName</key><string>Bozya VPN</string>
  <key>CFBundleIdentifier</key><string>dev.bozya.vpn</string>
  <key>CFBundleExecutable</key><string>Bozya VPN</string>
  <key>CFBundlePackageType</key><string>APPL</string>
  <key>CFBundleVersion</key><string>1.0.69</string>
  <key>CFBundleShortVersionString</key><string>1.0.69</string>
  <key>LSMinimumSystemVersion</key><string>11.0</string>
  <key>NSHighResolutionCapable</key><true/>
</dict>
</plist>
EOF
cat > "$APP/MacOS/Bozya VPN" << 'EOF'
#!/bin/bash
DIR="$(cd "$(dirname "$0")" && pwd)"
if [ "$(uname -m)" = "arm64" ]; then
  exec "$DIR/Bozya-VPN-arm64" "$@"
else
  exec "$DIR/Bozya-VPN-intel" "$@"
fi
EOF
chmod +x "$APP/MacOS/Bozya-VPN-intel" "$APP/MacOS/Bozya-VPN-arm64" "$APP/MacOS/Bozya VPN"
rm -f ../dist/Bozya-VPN-macos.zip
(
  cd /tmp/bozya-mac
  zip -r -X "$OLDPWD/../dist/Bozya-VPN-macos.zip" "Bozya VPN.app" "Как открыть.txt"
)
