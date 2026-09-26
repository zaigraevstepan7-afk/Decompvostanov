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
GOOS=darwin GOARCH=amd64 go build -trimpath -ldflags "-s -w" -o /tmp/bozya-mac/Bozya-VPN-intel .
GOOS=darwin GOARCH=arm64 go build -trimpath -ldflags "-s -w" -o /tmp/bozya-mac/Bozya-VPN-arm64 .
cp mac-readme.txt "/tmp/bozya-mac/Как открыть.txt"
cat > "/tmp/bozya-mac/Bozya VPN.command" << 'EOF'
#!/bin/bash
cd "$(dirname "$0")"
if [ "$(uname -m)" = "arm64" ]; then
  exec "./Bozya-VPN-arm64"
else
  exec "./Bozya-VPN-intel"
fi
EOF
chmod +x /tmp/bozya-mac/Bozya-VPN-intel /tmp/bozya-mac/Bozya-VPN-arm64 "/tmp/bozya-mac/Bozya VPN.command"
rm -f ../dist/Bozya-VPN-macos.zip
(
  cd /tmp/bozya-mac
  zip -r -X "$OLDPWD/../dist/Bozya-VPN-macos.zip" "Bozya VPN.command" "Bozya-VPN-intel" "Bozya-VPN-arm64" "Как открыть.txt"
)
