//go:build linux

package main

import (
	"fmt"
	"net"
	"os/exec"
	"strconv"
)

func captureGateway() (gateway, error) {
	out, err := commandOutput(exec.Command("ip", "route", "show", "default"))
	if err != nil && out == "" {
		return gateway{}, fmt.Errorf("Не нашёл основной шлюз")
	}
	return parseLinuxDefault(out)
}

func prepareTunDevice() {
	_ = runQuiet(exec.Command("ip", "link", "del", "bozya"))
}

func setupWarpRoutes(ifname string, addrs []string, endpoint net.IP, gw gateway, mtu int) (func(), error) {
	v4, v6 := splitAddrs(addrs)
	if len(v4) == 0 {
		return nil, fmt.Errorf("В конфиге WARP нет адреса")
	}
	if err := runQuiet(exec.Command("ip", "addr", "add", v4[0], "dev", ifname)); err != nil {
		return nil, fmt.Errorf("Не удалось назначить адрес туннеля")
	}
	for _, addr := range v4[1:] {
		_ = runQuiet(exec.Command("ip", "addr", "add", addr, "dev", ifname))
	}
	for _, addr := range v6 {
		_ = runQuiet(exec.Command("ip", "-6", "addr", "add", addr, "dev", ifname))
	}
	if err := runQuiet(exec.Command("ip", "link", "set", "dev", ifname, "mtu", strconv.Itoa(mtu), "up")); err != nil {
		return nil, fmt.Errorf("Не удалось поднять туннель")
	}
	ep := endpoint.String() + "/32"
	_ = runQuiet(exec.Command("ip", "route", "del", ep))
	if err := runQuiet(exec.Command("ip", "route", "add", ep, "via", gw.IP.String(), "dev", gw.Iface)); err != nil {
		return nil, fmt.Errorf("Не удалось обойти адрес сервера")
	}
	var kept []string
	for _, host := range hostsToBypass(currentDNSServers()) {
		dest := host + "/32"
		_ = runQuiet(exec.Command("ip", "route", "del", dest))
		if runQuiet(exec.Command("ip", "route", "add", dest, "via", gw.IP.String(), "dev", gw.Iface)) == nil {
			kept = append(kept, dest)
		}
	}
	cleanup := func() {
		_ = runQuiet(exec.Command("ip", "route", "del", "0.0.0.0/1", "dev", ifname))
		_ = runQuiet(exec.Command("ip", "route", "del", "128.0.0.0/1", "dev", ifname))
		_ = runQuiet(exec.Command("ip", "-6", "route", "del", "::/1", "dev", ifname))
		_ = runQuiet(exec.Command("ip", "-6", "route", "del", "8000::/1", "dev", ifname))
		_ = runQuiet(exec.Command("ip", "route", "del", ep))
		for _, dest := range kept {
			_ = runQuiet(exec.Command("ip", "route", "del", dest))
		}
	}
	if err := runQuiet(exec.Command("ip", "route", "add", "0.0.0.0/1", "dev", ifname)); err != nil {
		cleanup()
		return nil, fmt.Errorf("Не удалось направить трафик в туннель")
	}
	if err := runQuiet(exec.Command("ip", "route", "add", "128.0.0.0/1", "dev", ifname)); err != nil {
		cleanup()
		return nil, fmt.Errorf("Не удалось направить трафик в туннель")
	}
	_ = runQuiet(exec.Command("ip", "-6", "route", "add", "::/1", "dev", ifname))
	_ = runQuiet(exec.Command("ip", "-6", "route", "add", "8000::/1", "dev", ifname))
	return cleanup, nil
}
