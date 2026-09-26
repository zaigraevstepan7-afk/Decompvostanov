package main

import (
	"fmt"
	"net"
	"strings"
)

type gateway struct {
	IP    net.IP
	Iface string
}

func parseLinuxDefault(out string) (gateway, error) {
	for _, line := range strings.Split(out, "\n") {
		fields := strings.Fields(line)
		if len(fields) >= 5 && fields[0] == "default" && fields[1] == "via" && fields[3] == "dev" {
			ip := net.ParseIP(fields[2])
			if ip == nil || ip.To4() == nil {
				continue
			}
			return gateway{IP: ip.To4(), Iface: fields[4]}, nil
		}
	}
	return gateway{}, fmt.Errorf("Не нашёл основной шлюз")
}

func parseDarwinDefault(out string) (gateway, error) {
	var ip net.IP
	iface := ""
	for _, line := range strings.Split(out, "\n") {
		line = strings.TrimSpace(line)
		if strings.HasPrefix(line, "gateway:") {
			ip = net.ParseIP(strings.TrimSpace(strings.TrimPrefix(line, "gateway:")))
		}
		if strings.HasPrefix(line, "interface:") {
			iface = strings.TrimSpace(strings.TrimPrefix(line, "interface:"))
		}
	}
	if ip == nil || ip.To4() == nil {
		return gateway{}, fmt.Errorf("Не нашёл основной шлюз")
	}
	return gateway{IP: ip.To4(), Iface: iface}, nil
}

func parseWindowsGateway(out string) (gateway, error) {
	line := ""
	for _, candidate := range strings.Split(out, "\n") {
		candidate = strings.TrimSpace(candidate)
		if strings.Contains(candidate, "|") {
			line = candidate
		}
	}
	parts := strings.SplitN(line, "|", 2)
	if len(parts) != 2 {
		return gateway{}, fmt.Errorf("Не нашёл основной шлюз")
	}
	ip := net.ParseIP(strings.TrimSpace(parts[0]))
	alias := strings.TrimSpace(parts[1])
	if ip == nil || ip.To4() == nil || ip.IsUnspecified() || alias == "" {
		return gateway{}, fmt.Errorf("Не нашёл основной шлюз")
	}
	return gateway{IP: ip.To4(), Iface: alias}, nil
}

func normalizeCIDR(addr string) string {
	addr = strings.TrimSpace(addr)
	if addr == "" {
		return ""
	}
	if strings.Contains(addr, "/") {
		return addr
	}
	if strings.Contains(addr, ":") {
		return addr + "/128"
	}
	return addr + "/32"
}

func splitAddrs(addrs []string) (v4, v6 []string) {
	for _, addr := range addrs {
		addr = normalizeCIDR(addr)
		if addr == "" {
			continue
		}
		host := addr
		if i := strings.Index(addr, "/"); i >= 0 {
			host = addr[:i]
		}
		if strings.Contains(host, ":") {
			v6 = append(v6, addr)
		} else {
			v4 = append(v4, addr)
		}
	}
	return v4, v6
}
