//go:build darwin

package main

import (
	"fmt"
	"net"
	"os/exec"
	"strconv"
)

func captureGateway() (gateway, error) {
	out, err := commandOutput(exec.Command("route", "-n", "get", "default"))
	if err != nil && out == "" {
		return gateway{}, fmt.Errorf("Не нашёл основной шлюз")
	}
	return parseDarwinDefault(out)
}

func prepareTunDevice() {}

func setupWarpRoutes(ifname string, addrs []string, endpoint net.IP, gw gateway, mtu int) (func(), error) {
	v4, v6 := splitAddrs(addrs)
	if len(v4) == 0 {
		return nil, fmt.Errorf("В конфиге WARP нет адреса")
	}
	ip, _, err := net.ParseCIDR(v4[0])
	if err != nil {
		return nil, fmt.Errorf("В конфиге WARP нет адреса")
	}
	if err := runQuiet(exec.Command("ifconfig", ifname, "inet", ip.String(), ip.String(), "netmask", "255.255.255.255", "up")); err != nil {
		return nil, fmt.Errorf("Не удалось назначить адрес туннеля")
	}
	_ = runQuiet(exec.Command("ifconfig", ifname, "mtu", strconv.Itoa(mtu)))
	for _, addr := range v6 {
		ip6, network, err := net.ParseCIDR(addr)
		if err != nil {
			continue
		}
		ones, _ := network.Mask.Size()
		_ = runQuiet(exec.Command("ifconfig", ifname, "inet6", ip6.String(), "prefixlen", strconv.Itoa(ones)))
	}
	ep := endpoint.String()
	_ = runQuiet(exec.Command("route", "-n", "delete", "-host", ep))
	if err := runQuiet(exec.Command("route", "-n", "add", "-host", ep, gw.IP.String())); err != nil {
		return nil, fmt.Errorf("Не удалось обойти адрес сервера")
	}
	var kept []string
	for _, host := range hostsToBypass(currentDNSServers()) {
		_ = runQuiet(exec.Command("route", "-n", "delete", "-host", host))
		if runQuiet(exec.Command("route", "-n", "add", "-host", host, gw.IP.String())) == nil {
			kept = append(kept, host)
		}
	}
	cleanup := func() {
		_ = runQuiet(exec.Command("route", "-n", "delete", "-net", "0.0.0.0/1", "-interface", ifname))
		_ = runQuiet(exec.Command("route", "-n", "delete", "-net", "128.0.0.0/1", "-interface", ifname))
		_ = runQuiet(exec.Command("route", "-n", "delete", "-inet6", "-net", "::/1", "-interface", ifname))
		_ = runQuiet(exec.Command("route", "-n", "delete", "-inet6", "-net", "8000::/1", "-interface", ifname))
		_ = runQuiet(exec.Command("route", "-n", "delete", "-host", ep))
		for _, host := range kept {
			_ = runQuiet(exec.Command("route", "-n", "delete", "-host", host))
		}
	}
	if err := runQuiet(exec.Command("route", "-n", "add", "-net", "0.0.0.0/1", "-interface", ifname)); err != nil {
		cleanup()
		return nil, fmt.Errorf("Не удалось направить трафик в туннель")
	}
	if err := runQuiet(exec.Command("route", "-n", "add", "-net", "128.0.0.0/1", "-interface", ifname)); err != nil {
		cleanup()
		return nil, fmt.Errorf("Не удалось направить трафик в туннель")
	}
	_ = runQuiet(exec.Command("route", "-n", "add", "-inet6", "-net", "::/1", "-interface", ifname))
	_ = runQuiet(exec.Command("route", "-n", "add", "-inet6", "-net", "8000::/1", "-interface", ifname))
	return cleanup, nil
}
