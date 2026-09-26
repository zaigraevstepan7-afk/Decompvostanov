package main

import (
	"bytes"
	"encoding/json"
	"os"
	"path/filepath"
	"runtime"
)

type Profile struct {
	ID       string `json:"id"`
	Name     string `json:"name"`
	Kind     string `json:"kind"`
	Endpoint string `json:"endpoint"`
	Link     string `json:"link,omitempty"`
	Core     string `json:"core,omitempty"`
	Conf     string `json:"conf,omitempty"`
}

type diskState struct {
	Active   string    `json:"active"`
	Profiles []Profile `json:"profiles"`
}

func dataDir() (string, error) {
	if flagHome != nil && *flagHome != "" {
		return *flagHome, nil
	}
	if v := os.Getenv("BOZYA_HOME"); v != "" {
		return v, nil
	}
	switch runtime.GOOS {
	case "windows":
		base := os.Getenv("APPDATA")
		if base == "" {
			home, err := os.UserHomeDir()
			if err != nil {
				return "", err
			}
			base = filepath.Join(home, "AppData", "Roaming")
		}
		return filepath.Join(base, "Bozya"), nil
	case "darwin":
		home, err := os.UserHomeDir()
		if err != nil {
			return "", err
		}
		return filepath.Join(home, "Library", "Application Support", "Bozya"), nil
	default:
		home, err := os.UserHomeDir()
		if err != nil {
			return "", err
		}
		return filepath.Join(home, ".bozya"), nil
	}
}

func storePath() (string, error) {
	dir, err := dataDir()
	if err != nil {
		return "", err
	}
	if err := os.MkdirAll(dir, 0o700); err != nil {
		return "", err
	}
	return filepath.Join(dir, "profiles.json"), nil
}

func loadDisk() (diskState, error) {
	path, err := storePath()
	if err != nil {
		return diskState{}, err
	}
	raw, err := os.ReadFile(path)
	if err != nil {
		if os.IsNotExist(err) {
			return diskState{}, nil
		}
		return diskState{}, err
	}
	var disk diskState
	if err := json.Unmarshal(raw, &disk); err != nil {
		return diskState{}, err
	}
	return disk, nil
}

func saveDisk(disk diskState) error {
	path, err := storePath()
	if err != nil {
		return err
	}
	var buf bytes.Buffer
	enc := json.NewEncoder(&buf)
	enc.SetEscapeHTML(false)
	enc.SetIndent("", "  ")
	if err := enc.Encode(disk); err != nil {
		return err
	}
	raw := buf.Bytes()
	tmp := path + ".tmp"
	if err := os.WriteFile(tmp, raw, 0o600); err != nil {
		return err
	}
	return os.Rename(tmp, path)
}
