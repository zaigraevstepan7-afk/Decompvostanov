//go:build windows

package main

import (
	"fmt"
	"os/exec"
	"strconv"
	"strings"
)

func currentDNSServers() []string {
	script := `Get-DnsClientServerAddress -AddressFamily IPv4 | ForEach-Object { $_.ServerAddresses }`
	out, err := commandOutput(exec.Command("powershell", "-NoProfile", "-NonInteractive", "-Command", script))
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
	out, err := commandOutput(exec.Command("netsh", "interface", "ipv4", "show", "dnsservers", "name="+gw.Iface))
	if err != nil {
		return nil, fmt.Errorf("Не удалось сменить DNS")
	}
	low := strings.ToLower(out)
	dhcp := strings.Contains(low, "dhcp") && !strings.Contains(low, "static") && !strings.Contains(low, "статическ")
	b := dnsBackup{Alias: gw.Iface, DHCP: dhcp, Servers: ipv4s(out)}
	if err := saveDNSBackup(b); err != nil {
		return nil, err
	}
	if len(servers) == 0 {
		clearDNSBackup()
		return nil, fmt.Errorf("Не удалось сменить DNS")
	}
	if err := runQuiet(exec.Command("netsh", "interface", "ipv4", "set", "dnsservers", "name="+gw.Iface, "static", servers[0], "primary", "validate=no")); err != nil {
		clearDNSBackup()
		return nil, fmt.Errorf("Не удалось сменить DNS")
	}
	for i, server := range servers[1:] {
		_ = runQuiet(exec.Command("netsh", "interface", "ipv4", "add", "dnsservers", "name="+gw.Iface, server, "index="+strconv.Itoa(i+2), "validate=no"))
	}
	return func() {
		_ = applyDNSRestore(b)
		clearDNSBackup()
	}, nil
}

func applyDNSRestore(b dnsBackup) error {
	if b.Alias == "" {
		return nil
	}
	if b.DHCP || len(b.Servers) == 0 {
		return runQuiet(exec.Command("netsh", "interface", "ipv4", "set", "dnsservers", "name="+b.Alias, "source=dhcp"))
	}
	if err := runQuiet(exec.Command("netsh", "interface", "ipv4", "set", "dnsservers", "name="+b.Alias, "static", b.Servers[0], "primary", "validate=no")); err != nil {
		return err
	}
	for i, server := range b.Servers[1:] {
		_ = runQuiet(exec.Command("netsh", "interface", "ipv4", "add", "dnsservers", "name="+b.Alias, server, "index="+strconv.Itoa(i+2), "validate=no"))
	}
	return nil
}
