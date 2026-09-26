package main

import (
	"fmt"
	"os"
	"os/exec"
	"path/filepath"
	"strings"
	"time"
)

func runQuiet(cmd *exec.Cmd) error {
	quiet(cmd)
	out, err := cmd.CombinedOutput()
	if err != nil {
		msg := strings.TrimSpace(string(out))
		if len(msg) > 160 {
			msg = msg[:160]
		}
		msg = redact(msg)
		if msg == "" {
			return err
		}
		return fmt.Errorf("%s", msg)
	}
	return nil
}

func commandOutput(cmd *exec.Cmd) (string, error) {
	quiet(cmd)
	out, err := cmd.CombinedOutput()
	return string(out), err
}

func appendLog(msg string) {
	dir, err := dataDir()
	if err != nil {
		return
	}
	_ = os.MkdirAll(dir, 0o700)
	f, err := os.OpenFile(filepath.Join(dir, "bozya.log"), os.O_CREATE|os.O_APPEND|os.O_WRONLY, 0o600)
	if err != nil {
		return
	}
	defer f.Close()
	fmt.Fprintln(f, time.Now().Format(time.RFC3339), redact(msg))
}

func takeRunes(s string, n int) string {
	r := []rune(s)
	if len(r) <= n {
		return s
	}
	return string(r[:n])
}
