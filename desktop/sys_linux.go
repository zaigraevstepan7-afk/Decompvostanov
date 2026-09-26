//go:build linux

package main

import (
	"fmt"
	"os"
	"os/exec"
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

func ensureAdmin() {}

func openBrowser(url string) {
	_ = exec.Command("xdg-open", url).Start()
}

func showMessage(text string) {
	fmt.Fprintln(os.Stderr, text)
}

func fatal(msg string) {
	appendLog(msg)
	showMessage(msg)
	os.Exit(1)
}
