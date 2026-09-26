//go:build darwin

package main

import (
	"os"
	"os/exec"
	"path/filepath"
)

func showAppWindow(url string) bool {
	home, err := dataDir()
	if err != nil {
		home = os.TempDir()
	}
	profile := filepath.Join(home, "app-window")
	_ = os.MkdirAll(profile, 0o700)
	bins := []string{
		"/Applications/Google Chrome.app/Contents/MacOS/Google Chrome",
		"/Applications/Microsoft Edge.app/Contents/MacOS/Microsoft Edge",
		"/Applications/Chromium.app/Contents/MacOS/Chromium",
		"/Applications/Brave Browser.app/Contents/MacOS/Brave Browser",
		filepath.Join(os.Getenv("HOME"), "Applications/Google Chrome.app/Contents/MacOS/Google Chrome"),
	}
	for _, bin := range bins {
		st, err := os.Stat(bin)
		if err != nil || st.IsDir() {
			continue
		}
		cmd := exec.Command(bin, "--app="+url, "--window-size=440,820", "--user-data-dir="+profile, "--no-first-run")
		cmd.SysProcAttr = nil
		if err := cmd.Start(); err != nil {
			continue
		}
		_ = cmd.Wait()
		return true
	}
	return false
}
