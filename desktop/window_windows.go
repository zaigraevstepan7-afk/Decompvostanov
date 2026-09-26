//go:build windows

package main

import (
	"os"
	"os/exec"
	"path/filepath"

	webview2 "github.com/jchv/go-webview2"
)

func showAppWindow(url string) bool {
	if w := openWebView(url); w {
		return true
	}
	return openEdgeApp(url)
}

func openWebView(url string) (ok bool) {
	defer func() { _ = recover() }()
	home, err := dataDir()
	if err != nil {
		home = os.TempDir()
	}
	data := filepath.Join(home, "window")
	_ = os.MkdirAll(data, 0o700)
	w := webview2.NewWithOptions(webview2.WebViewOptions{
		AutoFocus: true,
		DataPath:  data,
		WindowOptions: webview2.WindowOptions{
			Title:  "Bozya VPN",
			Width:  440,
			Height: 820,
			Center: true,
		},
	})
	if w == nil {
		return false
	}
	defer w.Destroy()
	w.SetSize(440, 820, webview2.HintMin)
	w.Navigate(url)
	w.Run()
	return true
}

func openEdgeApp(url string) bool {
	edge := findEdge()
	if edge == "" {
		return false
	}
	home, err := dataDir()
	if err != nil {
		home = os.TempDir()
	}
	profile := filepath.Join(home, "edge-app")
	_ = os.MkdirAll(profile, 0o700)
	cmd := exec.Command(edge, "--app="+url, "--window-size=440,820", "--user-data-dir="+profile)
	quiet(cmd)
	if err := cmd.Start(); err != nil {
		return false
	}
	_ = cmd.Wait()
	return true
}

func findEdge() string {
	roots := []string{os.Getenv("ProgramFiles(x86)"), os.Getenv("ProgramFiles"), os.Getenv("LocalAppData")}
	for _, root := range roots {
		if root == "" {
			continue
		}
		path := filepath.Join(root, "Microsoft", "Edge", "Application", "msedge.exe")
		if st, err := os.Stat(path); err == nil && !st.IsDir() {
			return path
		}
	}
	return ""
}
