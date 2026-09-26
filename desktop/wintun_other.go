//go:build !windows

package main

func stagePlatformBins(dir string) error { return nil }

func ensureWintunBesideExe() {}
