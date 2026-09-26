package main

import (
	"regexp"
	"strings"
)

var (
	uuidRe = regexp.MustCompile(`(?i)[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}`)
	hexRe  = regexp.MustCompile(`[0-9a-fA-F]{32,}`)
)

func redact(s string) string {
	s = strings.ReplaceAll(s, "\n", " ")
	s = uuidRe.ReplaceAllString(s, "…")
	s = hexRe.ReplaceAllString(s, "…")
	s = strings.TrimSpace(s)
	if len(s) > 240 {
		s = s[:240]
	}
	return s
}
