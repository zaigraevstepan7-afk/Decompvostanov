//go:build linux

package main

import (
	"fmt"
	"os"
	"os/exec"
	"strings"
)

func currentDNSServers() []string {
	out, err := commandOutput(exec.Command("resolvectl", "dns"))
	if err != nil || strings.TrimSpace(out) == "" {
		raw, readErr := os.ReadFile("/etc/resolv.conf")
		if readErr != nil {
			return nil
		}
		out = string(raw)
	}
	return ipv4s(out)
}

func setSystemDNS(servers []string) (func(), error) {
	gw, err := captureGateway()
	if err != nil {
		return nil, err
	}
	if gw.Iface == "" {
		return nil, fmt.Errorf("Не удалось сменить DNS")
	}
	b := dnsBackup{Alias: gw.Iface}
	if err := saveDNSBackup(b); err != nil {
		return nil, err
	}
	args := append([]string{"dns", gw.Iface}, servers...)
	if err := runQuiet(exec.Command("resolvectl", args...)); err != nil {
		clearDNSBackup()
		return nil, fmt.Errorf("Не удалось сменить DNS")
	}
	_ = runQuiet(exec.Command("resolvectl", "domain", gw.Iface, "~."))
	return func() {
		_ = applyDNSRestore(b)
		clearDNSBackup()
	}, nil
}

func applyDNSRestore(b dnsBackup) error {
	if b.Alias == "" {
		return nil
	}
	return runQuiet(exec.Command("resolvectl", "revert", b.Alias))
}
