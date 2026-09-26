//go:build windows

package main

import (
	"os"
	"os/exec"
	"path/filepath"
	"strconv"
	"syscall"
	"unsafe"

	"golang.org/x/sys/windows"
)

func quiet(cmd *exec.Cmd) {
	cmd.SysProcAttr = &syscall.SysProcAttr{HideWindow: true}
}

func quietXray(cmd *exec.Cmd) { quiet(cmd) }

func killProc(cmd *exec.Cmd) {
	if cmd != nil && cmd.Process != nil {
		_ = cmd.Process.Kill()
	}
}

func isAdmin() bool {
	cmd := exec.Command("net", "session")
	quiet(cmd)
	return cmd.Run() == nil
}

func ensureAdmin() {
	if os.Getenv("BOZYA_NO_ELEVATE") == "1" || isAdmin() {
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
	args := "--home \"" + home + "\""
	if flagPort != nil && *flagPort != 17931 {
		args += " --port " + strconv.Itoa(*flagPort)
	}
	verb, _ := windows.UTF16PtrFromString("runas")
	file, _ := windows.UTF16PtrFromString(exe)
	params, _ := windows.UTF16PtrFromString(args)
	cwd, _ := windows.UTF16PtrFromString(filepath.Dir(exe))
	proc := windows.NewLazySystemDLL("shell32.dll").NewProc("ShellExecuteW")
	r, _, _ := proc.Call(0, uintptr(unsafe.Pointer(verb)), uintptr(unsafe.Pointer(file)), uintptr(unsafe.Pointer(params)), uintptr(unsafe.Pointer(cwd)), 1)
	if r <= 32 {
		showMessage("Нужны права администратора, чтобы включить туннель.")
	}
	os.Exit(0)
}

func openBrowser(url string) {
	cmd := exec.Command("rundll32", "url.dll,FileProtocolHandler", url)
	quiet(cmd)
	_ = cmd.Start()
}

func showMessage(text string) {
	user32 := windows.NewLazySystemDLL("user32.dll")
	mb := user32.NewProc("MessageBoxW")
	title, _ := windows.UTF16PtrFromString("Bozya VPN")
	body, _ := windows.UTF16PtrFromString(text)
	_, _, _ = mb.Call(0, uintptr(unsafe.Pointer(body)), uintptr(unsafe.Pointer(title)), 0)
}

func fatal(msg string) {
	appendLog(msg)
	showMessage(msg)
	os.Exit(1)
}
