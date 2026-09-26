package main

import (
	"encoding/json"
	"os"
	"path/filepath"
	"regexp"
)

type dnsBackup struct {
	Alias   string   `json:"alias"`
	Service string   `json:"service,omitempty"`
	DHCP    bool     `json:"dhcp"`
	Servers []string `json:"servers,omitempty"`
}

var ipv4re = regexp.MustCompile(`\b(?:(?:25[0-5]|2[0-4]\d|[01]?\d\d?)\.){3}(?:25[0-5]|2[0-4]\d|[01]?\d\d?)\b`)

func ipv4s(s string) []string {
	found := ipv4re.FindAllString(s, -1)
	var out []string
	seen := map[string]bool{}
	for _, ip := range found {
		if ip == "0.0.0.0" || ip == "255.255.255.255" || seen[ip] {
			continue
		}
		seen[ip] = true
		out = append(out, ip)
	}
	return out
}

func dnsBackupPath() string {
	dir, err := dataDir()
	if err != nil {
		return ""
	}
	return filepath.Join(dir, "dns-backup.json")
}

func saveDNSBackup(b dnsBackup) error {
	path := dnsBackupPath()
	if path == "" {
		return os.ErrInvalid
	}
	if err := os.MkdirAll(filepath.Dir(path), 0o700); err != nil {
		return err
	}
	raw, err := json.Marshal(b)
	if err != nil {
		return err
	}
	return os.WriteFile(path, raw, 0o600)
}

func loadDNSBackup() (dnsBackup, bool) {
	path := dnsBackupPath()
	if path == "" {
		return dnsBackup{}, false
	}
	raw, err := os.ReadFile(path)
	if err != nil {
		return dnsBackup{}, false
	}
	var b dnsBackup
	if json.Unmarshal(raw, &b) != nil {
		return dnsBackup{}, false
	}
	return b, true
}

func clearDNSBackup() {
	path := dnsBackupPath()
	if path != "" {
		_ = os.Remove(path)
	}
}

func restoreDNSIfNeeded() {
	b, ok := loadDNSBackup()
	if !ok {
		return
	}
	_ = applyDNSRestore(b)
	clearDNSBackup()
}
