//go:build linux

package main

import (
	"fmt"
	"os/exec"
)

func setSystemDNS() (func(), error) {
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
	if err := runQuiet(exec.Command("resolvectl", "dns", gw.Iface, "127.0.0.1")); err != nil {
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
