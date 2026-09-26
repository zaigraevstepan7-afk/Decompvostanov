package main

import (
	"archive/zip"
	"fmt"
	"io"
	"net/http"
	"os"
	"os/exec"
	"path/filepath"
	"strings"
	"time"
)

const xrayRelease = "v26.3.27"

func xrayNames() (string, string) {
	switch runtimeGOOS() {
	case "windows":
		return "Xray-windows-64.zip", "xray.exe"
	case "darwin":
		if runtimeGOARCH() == "arm64" {
			return "Xray-macos-arm64-v8a.zip", "xray"
		}
		return "Xray-macos-64.zip", "xray"
	default:
		return "Xray-linux-64.zip", "xray"
	}
}

func xrayBinPath() (string, error) {
	dir, err := dataDir()
	if err != nil {
		return "", err
	}
	_, binName := xrayNames()
	return filepath.Join(dir, "bin", binName), nil
}

func xrayInstalled() bool {
	path, err := xrayBinPath()
	if err != nil {
		return false
	}
	st, err := os.Stat(path)
	return err == nil && st.Size() > 1_000_000
}

func ensureXray(progress func(string)) (string, error) {
	dir, err := dataDir()
	if err != nil {
		return "", err
	}
	binDir := filepath.Join(dir, "bin")
	if err := os.MkdirAll(binDir, 0o755); err != nil {
		return "", err
	}
	zipName, binName := xrayNames()
	dest := filepath.Join(binDir, binName)
	if st, err := os.Stat(dest); err != nil || st.Size() < 1_000_000 {
		if progress != nil {
			progress("Скачиваю Xray…")
		}
		url := "https://github.com/XTLS/Xray-core/releases/download/" + xrayRelease + "/" + zipName
		if err := downloadXray(url, dest, binName); err != nil {
			return "", err
		}
	}
	if err := os.Chmod(dest, 0o755); err != nil && runtimeGOOS() != "windows" {
		return "", err
	}
	if err := stagePlatformBins(binDir); err != nil {
		return "", fmt.Errorf("Не удалось подготовить Xray")
	}
	return dest, nil
}

func downloadXray(rawURL, dest, binName string) error {
	client := &http.Client{Timeout: 3 * time.Minute}
	req, err := http.NewRequest(http.MethodGet, rawURL, nil)
	if err != nil {
		return fmt.Errorf("Не удалось скачать Xray")
	}
	req.Header.Set("User-Agent", "BozyaVPN/"+appVersion)
	resp, err := client.Do(req)
	if err != nil || resp.StatusCode != http.StatusOK {
		if resp != nil {
			resp.Body.Close()
		}
		return fmt.Errorf("Не удалось скачать Xray")
	}
	defer resp.Body.Close()
	tmp, err := os.CreateTemp(filepath.Dir(dest), "xray-*.zip")
	if err != nil {
		return fmt.Errorf("Не удалось скачать Xray")
	}
	tmpName := tmp.Name()
	defer os.Remove(tmpName)
	if _, err := io.Copy(tmp, io.LimitReader(resp.Body, 80<<20)); err != nil {
		tmp.Close()
		return fmt.Errorf("Не удалось скачать Xray")
	}
	if err := tmp.Close(); err != nil {
		return fmt.Errorf("Не удалось скачать Xray")
	}
	reader, err := zip.OpenReader(tmpName)
	if err != nil {
		return fmt.Errorf("Не удалось скачать Xray")
	}
	defer reader.Close()
	var found *zip.File
	for _, file := range reader.File {
		name := filepath.ToSlash(file.Name)
		if strings.Contains(name, "..") {
			continue
		}
		if name == binName || strings.HasSuffix(name, "/"+binName) {
			found = file
			break
		}
	}
	if found == nil {
		return fmt.Errorf("Не удалось скачать Xray")
	}
	src, err := found.Open()
	if err != nil {
		return fmt.Errorf("Не удалось скачать Xray")
	}
	defer src.Close()
	out, err := os.OpenFile(dest, os.O_CREATE|os.O_TRUNC|os.O_WRONLY, 0o755)
	if err != nil {
		return fmt.Errorf("Не удалось скачать Xray")
	}
	if _, err := io.Copy(out, io.LimitReader(src, 80<<20)); err != nil {
		out.Close()
		return fmt.Errorf("Не удалось скачать Xray")
	}
	return out.Close()
}

type xrayProc struct {
	cmd    *exec.Cmd
	cfg    string
	log    *os.File
	exited chan struct{}
}

func (p *xrayProc) watch(fn func()) {
	if p == nil || fn == nil || p.exited == nil {
		return
	}
	go func() {
		<-p.exited
		fn()
	}()
}

func startXray(config []byte, progress func(string)) (*xrayProc, error) {
	bin, err := ensureXray(progress)
	if err != nil {
		return nil, err
	}
	dir, err := dataDir()
	if err != nil {
		return nil, err
	}
	runDir := filepath.Join(dir, "run")
	if err := os.MkdirAll(runDir, 0o700); err != nil {
		return nil, err
	}
	cfg := filepath.Join(runDir, "xray.json")
	if err := os.WriteFile(cfg, config, 0o600); err != nil {
		return nil, err
	}
	logf, err := os.OpenFile(filepath.Join(runDir, "xray.log"), os.O_CREATE|os.O_TRUNC|os.O_WRONLY, 0o600)
	if err != nil {
		os.Remove(cfg)
		return nil, err
	}
	cmd := exec.Command(bin, "run", "-c", cfg)
	cmd.Dir = filepath.Dir(bin)
	quietXray(cmd)
	cmd.Stdout = logf
	cmd.Stderr = logf
	if err := cmd.Start(); err != nil {
		logf.Close()
		os.Remove(cfg)
		return nil, fmt.Errorf("Не удалось запустить Xray")
	}
	exited := make(chan struct{})
	go func() {
		_ = cmd.Wait()
		close(exited)
	}()
	select {
	case <-exited:
		logf.Close()
		os.Remove(cfg)
		return nil, fmt.Errorf("%s", xrayFailure(readLog(filepath.Join(runDir, "xray.log"))))
	case <-time.After(1500 * time.Millisecond):
		return &xrayProc{cmd: cmd, cfg: cfg, log: logf, exited: exited}, nil
	}
}

func (p *xrayProc) Close() error {
	if p == nil {
		return nil
	}
	if p.cmd != nil {
		killProc(p.cmd)
	}
	if p.log != nil {
		p.log.Close()
	}
	if p.cfg != "" {
		_ = os.Remove(p.cfg)
	}
	return nil
}

func readLog(path string) string {
	b, err := os.ReadFile(path)
	if err != nil {
		return ""
	}
	return string(b)
}

func xrayFailure(log string) string {
	low := strings.ToLower(log)
	if strings.Contains(low, "not permitted") || strings.Contains(low, "access is denied") || strings.Contains(low, "privilege") {
		return "Нужны права администратора"
	}
	picked := ""
	for _, line := range strings.Split(log, "\n") {
		line = strings.TrimSpace(line)
		l := strings.ToLower(line)
		if strings.Contains(l, "fail") || strings.Contains(l, "error") || strings.Contains(l, "denied") {
			picked = line
		}
	}
	if picked == "" {
		return "Xray сразу завершился"
	}
	return "Xray: " + redact(picked)
}
