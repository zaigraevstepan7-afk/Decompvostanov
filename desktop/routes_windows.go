//go:build windows

package main

import (
	"fmt"
	"net"
	"os/exec"
	"strconv"
)

func captureGateway() (gateway, error) {
	script := `[Console]::OutputEncoding = [System.Text.Encoding]::UTF8
$r = Get-NetRoute -DestinationPrefix '0.0.0.0/0' | Where-Object { $_.NextHop -and $_.NextHop.ToString() -ne '0.0.0.0' } | Sort-Object { $_.RouteMetric + $_.InterfaceMetric } | Select-Object -First 1
if (-not $r) { exit 1 }
Write-Output ($r.NextHop.ToString() + '|' + $r.InterfaceAlias)`
	out, err := commandOutput(exec.Command("powershell", "-NoProfile", "-NonInteractive", "-Command", script))
	if err != nil {
		return gateway{}, fmt.Errorf("Не нашёл основной шлюз")
	}
	return parseWindowsGateway(out)
}

func prepareTunDevice() {}

func setupWarpRoutes(ifname string, addrs []string, endpoint net.IP, gw gateway, mtu int) (func(), error) {
	v4, v6 := splitAddrs(addrs)
	if len(v4) == 0 {
		return nil, fmt.Errorf("В конфиге WARP нет адреса")
	}
	ip, network, err := net.ParseCIDR(v4[0])
	if err != nil {
		return nil, fmt.Errorf("В конфиге WARP нет адреса")
	}
	mask := net.IP(network.Mask).String()
	if err := runQuiet(exec.Command("netsh", "interface", "ipv4", "set", "address", "name="+ifname, "source=static", "address="+ip.String(), "mask="+mask)); err != nil {
		return nil, fmt.Errorf("Не удалось назначить адрес туннеля")
	}
	_ = runQuiet(exec.Command("netsh", "interface", "ipv4", "set", "subinterface", ifname, "mtu="+strconv.Itoa(mtu), "store=active"))
	ep := endpoint.String()
	_ = runQuiet(exec.Command("route", "DELETE", ep))
	if err := runQuiet(exec.Command("route", "ADD", ep, "MASK", "255.255.255.255", gw.IP.String(), "METRIC", "1")); err != nil {
		return nil, fmt.Errorf("Не удалось обойти адрес сервера")
	}
	var kept []string
	for _, host := range hostsToBypass(currentDNSServers()) {
		_ = runQuiet(exec.Command("route", "DELETE", host))
		if runQuiet(exec.Command("route", "ADD", host, "MASK", "255.255.255.255", gw.IP.String(), "METRIC", "1")) == nil {
			kept = append(kept, host)
		}
	}
	cleanup := func() {
		_ = runQuiet(exec.Command("netsh", "interface", "ipv4", "delete", "route", "prefix=0.0.0.0/1", "interface="+ifname))
		_ = runQuiet(exec.Command("netsh", "interface", "ipv4", "delete", "route", "prefix=128.0.0.0/1", "interface="+ifname))
		_ = runQuiet(exec.Command("netsh", "interface", "ipv6", "delete", "route", "prefix=::/1", "interface="+ifname))
		_ = runQuiet(exec.Command("netsh", "interface", "ipv6", "delete", "route", "prefix=8000::/1", "interface="+ifname))
		_ = runQuiet(exec.Command("route", "DELETE", ep))
		for _, host := range kept {
			_ = runQuiet(exec.Command("route", "DELETE", host))
		}
	}
	if err := runQuiet(exec.Command("netsh", "interface", "ipv4", "add", "route", "prefix=0.0.0.0/1", "interface="+ifname, "metric=1", "store=active")); err != nil {
		cleanup()
		return nil, fmt.Errorf("Не удалось направить трафик в туннель")
	}
	if err := runQuiet(exec.Command("netsh", "interface", "ipv4", "add", "route", "prefix=128.0.0.0/1", "interface="+ifname, "metric=1", "store=active")); err != nil {
		cleanup()
		return nil, fmt.Errorf("Не удалось направить трафик в туннель")
	}
	for _, addr := range v6 {
		ip6, network, err := net.ParseCIDR(addr)
		if err != nil {
			continue
		}
		ones, _ := network.Mask.Size()
		_ = runQuiet(exec.Command("netsh", "interface", "ipv6", "add", "address", "interface="+ifname, "address="+ip6.String()+"/"+strconv.Itoa(ones), "store=active"))
	}
	_ = runQuiet(exec.Command("netsh", "interface", "ipv6", "add", "route", "prefix=::/1", "interface="+ifname, "metric=1", "store=active"))
	_ = runQuiet(exec.Command("netsh", "interface", "ipv6", "add", "route", "prefix=8000::/1", "interface="+ifname, "metric=1", "store=active"))
	return cleanup, nil
}
