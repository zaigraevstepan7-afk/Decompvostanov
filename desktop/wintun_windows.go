//go:build windows

package main

import (
	_ "embed"
	"os"
	"path/filepath"
)

//go:embed third_party/wintun/wintun.dll
var wintunDLL []byte

func stagePlatformBins(dir string) error {
	return os.WriteFile(filepath.Join(dir, "wintun.dll"), wintunDLL, 0o644)
}

func ensureWintunBesideExe() {
	exe, err := os.Executable()
	if err != nil {
		return
	}
	dest := filepath.Join(filepath.Dir(exe), "wintun.dll")
	if st, err := os.Stat(dest); err == nil && st.Size() == int64(len(wintunDLL)) {
		return
	}
	_ = os.WriteFile(dest, wintunDLL, 0o644)
}
