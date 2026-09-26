//go:build darwin

package main

import (
	"fmt"
	"os"
	"os/exec"
	"strconv"
	"strings"
	"syscall"
	"time"
)

func quiet(cmd *exec.Cmd) {}

func quietXray(cmd *exec.Cmd) {
	cmd.SysProcAttr = &syscall.SysProcAttr{Setpgid: true}
}

func killProc(cmd *exec.Cmd) {
	if cmd == nil || cmd.Process == nil {
		return
	}
	_ = syscall.Kill(-cmd.Process.Pid, syscall.SIGTERM)
	time.Sleep(200 * time.Millisecond)
	_ = syscall.Kill(-cmd.Process.Pid, syscall.SIGKILL)
}

func ensureAdmin() {
	if os.Getenv("BOZYA_NO_ELEVATE") == "1" || os.Geteuid() == 0 {
		return
	}
	exe, err := os.Executable()
	if err != nil {
		fatal("Не удалось запустить Bozya VPN")
	}
	home, err := dataDir()
	if err != nil {
		fatal("Не удалось найти папку данных")
	}
	arg := shellQuote(exe) + " --home " + shellQuote(home)
	if flagPort != nil && *flagPort != 17931 {
		arg += " --port " + strconv.Itoa(*flagPort)
	}
	script := "do shell script " + appleQuote(arg) + " with administrator privileges"
	cmd := exec.Command("osascript", "-e", script)
	cmd.SysProcAttr = &syscall.SysProcAttr{Setpgid: true}
	if err := cmd.Start(); err != nil {
		fatal("Нужны права администратора")
	}
	os.Exit(0)
}

func shellQuote(s string) string {
	return "'" + strings.ReplaceAll(s, "'", `'\''`) + "'"
}

func appleQuote(s string) string {
	s = strings.ReplaceAll(s, `\`, `\\`)
	s = strings.ReplaceAll(s, `"`, `\"`)
	return `"` + s + `"`
}

func openBrowser(url string) {
	_ = exec.Command("open", url).Start()
}

func showMessage(text string) {
	fmt.Fprintln(os.Stderr, text)
}

func fatal(msg string) {
	appendLog(msg)
	showMessage(msg)
	os.Exit(1)
}
