//go:build darwin

package main

import (
	"fmt"
	"os/exec"
	"strings"
)

func currentDNSServers() []string {
	out, err := commandOutput(exec.Command("scutil", "--dns"))
	if err != nil {
		return nil
	}
	return ipv4s(out)
}

func setSystemDNS(servers []string) (func(), error) {
	gw, err := captureGateway()
	if err != nil {
		return nil, err
	}
	service, err := darwinService(gw.Iface)
	if err != nil {
		return nil, err
	}
	out, _ := commandOutput(exec.Command("networksetup", "-getdnsservers", service))
	current := ipv4s(out)
	dhcp := len(current) == 0 || strings.Contains(strings.ToLower(out), "aren't any")
	b := dnsBackup{Service: service, DHCP: dhcp, Servers: current}
	if err := saveDNSBackup(b); err != nil {
		return nil, err
	}
	if len(servers) == 0 {
		clearDNSBackup()
		return nil, fmt.Errorf("Не удалось сменить DNS")
	}
	args := append([]string{"-setdnsservers", service}, servers...)
	if err := runQuiet(exec.Command("networksetup", args...)); err != nil {
		clearDNSBackup()
		return nil, fmt.Errorf("Не удалось сменить DNS")
	}
	return func() {
		_ = applyDNSRestore(b)
		clearDNSBackup()
	}, nil
}

func applyDNSRestore(b dnsBackup) error {
	if b.Service == "" {
		return nil
	}
	if b.DHCP || len(b.Servers) == 0 {
		return runQuiet(exec.Command("networksetup", "-setdnsservers", b.Service, "empty"))
	}
	args := append([]string{"-setdnsservers", b.Service}, b.Servers...)
	return runQuiet(exec.Command("networksetup", args...))
}

func darwinService(iface string) (string, error) {
	out, err := commandOutput(exec.Command("networksetup", "-listnetworkserviceorder"))
	if err != nil {
		return "", fmt.Errorf("Не удалось сменить DNS")
	}
	last := ""
	for _, line := range strings.Split(out, "\n") {
		line = strings.TrimSpace(line)
		if strings.Contains(line, "Device: "+iface+")") || strings.Contains(line, "Device: "+iface+",") {
			if last != "" {
				return last, nil
			}
		}
		if strings.HasPrefix(line, "(") {
			if i := strings.Index(line, ") "); i >= 0 && !strings.Contains(line, "Device:") {
				last = strings.TrimSpace(line[i+2:])
			}
		}
	}
	return "", fmt.Errorf("Не удалось сменить DNS")
}
