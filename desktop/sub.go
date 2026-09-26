package main

import (
	"bytes"
	"crypto/sha256"
	"encoding/base64"
	"encoding/hex"
	"encoding/json"
	"fmt"
	"io"
	"net"
	"net/http"
	"net/url"
	"regexp"
	"strconv"
	"strings"
	"time"
	"unicode"
	"unicode/utf8"
)

const maxSubBytes = 1_500_000
const maxProfiles = 400

var (
	vlessLinkRe = regexp.MustCompile(`(?i)vless://[^\s"'#]+(?:#[^\r\n"']*)?`)
	whiteWord   = regexp.MustCompile(`белы[ейхм]`)
)

func idFor(s string) string {
	bare := s
	if i := strings.Index(s, "#"); i >= 0 {
		bare = s[:i]
	}
	sum := sha256.Sum256([]byte(bare))
	return "bs:" + hex.EncodeToString(sum[:8])
}

func unwrapSub(body string) string {
	trimmed := strings.TrimPrefix(strings.TrimSpace(body), "\uFEFF")
	if strings.Contains(trimmed, "://") {
		return trimmed
	}
	compact := strings.Map(func(r rune) rune {
		if r == '\n' || r == '\r' || r == ' ' || r == '\t' {
			return -1
		}
		return r
	}, trimmed)
	for _, enc := range []*base64.Encoding{base64.StdEncoding, base64.URLEncoding, base64.RawStdEncoding, base64.RawURLEncoding} {
		decoded, err := enc.DecodeString(compact)
		if err != nil {
			continue
		}
		text := string(decoded)
		if strings.Contains(text, "://") {
			return text
		}
	}
	return trimmed
}

func isWhitelistName(name string) bool {
	low := strings.ToLower(name)
	if strings.Contains(low, "lte") || strings.Contains(low, "вайт") || strings.Contains(low, "обход") {
		return true
	}
	if strings.Contains(low, "whitelist") || strings.Contains(low, "white list") || strings.Contains(low, "white-list") {
		return true
	}
	if hasBS(low) {
		return true
	}
	return whiteWord.MatchString(low)
}

func hasBS(low string) bool {
	const mark = "бс"
	start := 0
	for {
		rel := strings.Index(low[start:], mark)
		if rel < 0 {
			return false
		}
		pos := start + rel
		if !runeLetterBefore(low, pos) && !runeLetterAfter(low, pos+len(mark)) {
			return true
		}
		start = pos + len(mark)
	}
}

func runeLetterBefore(s string, pos int) bool {
	if pos <= 0 || pos > len(s) {
		return false
	}
	r, _ := utf8.DecodeLastRuneInString(s[:pos])
	return unicode.IsLetter(r)
}

func runeLetterAfter(s string, pos int) bool {
	if pos < 0 || pos >= len(s) {
		return false
	}
	r, _ := utf8.DecodeRuneInString(s[pos:])
	return unicode.IsLetter(r)
}

func isNotice(name, host string, port int) bool {
	low := strings.ToLower(name)
	if strings.Contains(low, "устарел") || strings.Contains(low, "обновите") || strings.Contains(low, "github.com") || strings.Contains(low, "t.me/") {
		return true
	}
	return strings.EqualFold(host, "zieng2.org") && port <= 10
}

type subFetch struct {
	profiles []Profile
	note     string
}

func downloadSubs() (subFetch, error) {
	merged := map[string]Profile{}
	var order []string
	var failed []string
	client := &http.Client{Timeout: 25 * time.Second}
	for _, item := range feeds {
		body, err := httpGet(client, item.url)
		if err != nil {
			failed = append(failed, item.label)
			continue
		}
		for _, profile := range profilesFrom(body, item.onlyWhitelist) {
			if _, ok := merged[profile.ID]; ok {
				continue
			}
			if len(merged) >= maxProfiles {
				break
			}
			merged[profile.ID] = profile
			order = append(order, profile.ID)
		}
	}
	if len(merged) == 0 && len(failed) == len(feeds) {
		return subFetch{}, fmt.Errorf("Подписки не скачались")
	}
	profiles := make([]Profile, 0, len(order))
	for _, id := range order {
		profiles = append(profiles, merged[id])
	}
	note := fmt.Sprintf("Белые списки: %d", len(profiles))
	if len(failed) > 0 {
		note += ". Не скачалось: " + strings.Join(failed, ", ")
	}
	return subFetch{profiles: profiles, note: note}, nil
}

func httpGet(client *http.Client, rawURL string) (string, error) {
	req, err := http.NewRequest(http.MethodGet, rawURL, nil)
	if err != nil {
		return "", err
	}
	req.Header.Set("Accept", "text/plain, */*")
	req.Header.Set("User-Agent", "BozyaVPN/"+appVersion)
	resp, err := client.Do(req)
	if err != nil {
		return "", err
	}
	defer resp.Body.Close()
	body, err := io.ReadAll(io.LimitReader(resp.Body, maxSubBytes))
	if err != nil {
		return "", err
	}
	if resp.StatusCode < 200 || resp.StatusCode > 299 {
		return "", fmt.Errorf("status %d", resp.StatusCode)
	}
	return string(body), nil
}

func profilesFrom(body string, onlyWhitelist bool) []Profile {
	text := unwrapSub(body)
	trimmed := strings.TrimSpace(text)
	if strings.HasPrefix(trimmed, "[") || strings.HasPrefix(trimmed, "{") {
		return profilesFromXray(trimmed, onlyWhitelist)
	}
	seen := map[string]bool{}
	var profiles []Profile
	for _, match := range vlessLinkRe.FindAllString(text, -1) {
		if len(profiles) >= maxProfiles {
			break
		}
		link := strings.TrimSpace(match)
		name, endpoint, ok := linkEndpoint(link)
		if !ok || isNotice(name, endpointHost(endpoint), endpointPort(endpoint)) {
			continue
		}
		if onlyWhitelist && !isWhitelistName(name) {
			continue
		}
		id := idFor(link)
		if seen[id] {
			continue
		}
		seen[id] = true
		if name == "" {
			name = endpoint
		}
		profiles = append(profiles, Profile{
			ID: id, Name: takeRunes(name, 80), Kind: "whitelist", Endpoint: endpoint, Link: link,
		})
	}
	return profiles
}

func linkEndpoint(link string) (string, string, bool) {
	hash := strings.LastIndex(link, "#")
	bare := link
	name := ""
	if hash >= 0 {
		bare = link[:hash]
		decoded, err := url.QueryUnescape(link[hash+1:])
		if err != nil {
			decoded = link[hash+1:]
		}
		name = strings.TrimSpace(decoded)
	}
	rest := bare
	if i := strings.Index(rest, "://"); i >= 0 {
		rest = rest[i+3:]
	}
	at := strings.LastIndex(rest, "@")
	if at < 0 {
		return "", "", false
	}
	host, port, err := splitHostPort(strings.Split(rest[at+1:], "?")[0])
	if err != nil || host == "" || port < 1 || port > 65535 {
		return "", "", false
	}
	if name == "" {
		name = host
	}
	return name, net.JoinHostPort(host, strconv.Itoa(port)), true
}

func endpointHost(endpoint string) string {
	host, _, err := splitEndpoint(endpoint)
	if err != nil {
		return endpoint
	}
	return host
}

func endpointPort(endpoint string) int {
	_, port, err := splitEndpoint(endpoint)
	if err != nil {
		return 0
	}
	n := 0
	for _, r := range port {
		if r < '0' || r > '9' {
			return 0
		}
		n = n*10 + int(r-'0')
	}
	return n
}

func netJoin(host string, port int) string {
	return net.JoinHostPort(host, strconv.Itoa(port))
}

func profilesFromXray(text string, onlyWhitelist bool) []Profile {
	var elems []json.RawMessage
	if strings.HasPrefix(text, "[") {
		if json.Unmarshal([]byte(text), &elems) != nil {
			return nil
		}
	} else {
		elems = []json.RawMessage{json.RawMessage(text)}
	}
	seen := map[string]bool{}
	var profiles []Profile
	for _, el := range elems {
		if len(profiles) >= maxProfiles {
			break
		}
		dec := json.NewDecoder(bytes.NewReader(el))
		dec.UseNumber()
		var config map[string]any
		if dec.Decode(&config) != nil {
			continue
		}
		name := takeRunes(strings.TrimSpace(asString(config["remarks"])), 80)
		if name != "" && isNotice(name, "", 0) {
			continue
		}
		if onlyWhitelist && !isWhitelistName(name) {
			continue
		}
		endpoint := hopEndpoint(config)
		if endpoint == "" {
			continue
		}
		id := idFor(string(el))
		if seen[id] {
			continue
		}
		seen[id] = true
		if name == "" {
			name = endpoint
		}
		profiles = append(profiles, Profile{
			ID: id, Name: name, Kind: "whitelist", Endpoint: endpoint, Core: string(bytes.TrimSpace(el)),
		})
	}
	return profiles
}

func hopEndpoint(config map[string]any) string {
	outs, _ := config["outbounds"].([]any)
	var vless []map[string]any
	for _, item := range outs {
		m, ok := item.(map[string]any)
		if !ok {
			continue
		}
		if strings.EqualFold(asString(m["protocol"]), "vless") {
			vless = append(vless, m)
		}
	}
	fallback := ""
	if routing, ok := config["routing"].(map[string]any); ok {
		if bals, ok := routing["balancers"].([]any); ok && len(bals) > 0 {
			if b, ok := bals[0].(map[string]any); ok {
				fallback = asString(b["fallbackTag"])
			}
		}
	}
	var chosen map[string]any
	for _, item := range vless {
		if fallback != "" && asString(item["tag"]) == fallback {
			chosen = item
			break
		}
	}
	if chosen == nil {
		for _, item := range vless {
			if strings.Contains(strings.ToLower(asString(item["tag"])), "wl") {
				chosen = item
				break
			}
		}
	}
	if chosen == nil {
		for _, item := range vless {
			if strings.EqualFold(asString(item["tag"]), "proxy") {
				chosen = item
				break
			}
		}
	}
	if chosen == nil && len(vless) > 0 {
		chosen = vless[0]
	}
	if chosen == nil {
		return ""
	}
	settings, _ := chosen["settings"].(map[string]any)
	vnext, _ := settings["vnext"].([]any)
	if len(vnext) == 0 {
		return ""
	}
	first, _ := vnext[0].(map[string]any)
	host := asString(first["address"])
	port := asInt(first["port"])
	if host == "" || port < 1 || port > 65535 {
		return ""
	}
	return netJoin(host, port)
}

func asString(v any) string {
	switch t := v.(type) {
	case string:
		return t
	case json.Number:
		return t.String()
	case float64:
		return fmt.Sprint(int64(t))
	default:
		return ""
	}
}

func asInt(v any) int {
	switch t := v.(type) {
	case json.Number:
		n, _ := t.Int64()
		return int(n)
	case float64:
		return int(t)
	case string:
		n := 0
		for _, r := range t {
			if r < '0' || r > '9' {
				return 0
			}
			n = n*10 + int(r-'0')
		}
		return n
	default:
		return 0
	}
}

func adaptSubscription(text string) (string, error) {
	dec := json.NewDecoder(strings.NewReader(text))
	dec.UseNumber()
	var root map[string]any
	if err := dec.Decode(&root); err != nil {
		return "", err
	}
	delete(root, "remarks")
	root["inbounds"] = []any{tunInbound()}
	dns, _ := root["dns"].(map[string]any)
	if dns == nil {
		dns = map[string]any{}
	}
	dns["tag"] = "dns"
	dns["queryStrategy"] = "UseIPv4"
	root["dns"] = dns
	outs, _ := root["outbounds"].([]any)
	hasDNS := false
	for _, item := range outs {
		m, _ := item.(map[string]any)
		if strings.EqualFold(asString(m["protocol"]), "dns") {
			hasDNS = true
		}
	}
	if !hasDNS {
		outs = append(outs, map[string]any{"tag": "dns-out", "protocol": "dns"})
	}
	root["outbounds"] = outs
	routing, _ := root["routing"].(map[string]any)
	if routing == nil {
		routing = map[string]any{}
	}
	balancer := ""
	if bals, ok := routing["balancers"].([]any); ok && len(bals) > 0 {
		if b, ok := bals[0].(map[string]any); ok {
			balancer = asString(b["tag"])
		}
	}
	dnsHop := map[string]any{"type": "field", "inboundTag": []any{"dns"}}
	if balancer != "" {
		dnsHop["balancerTag"] = balancer
	} else {
		dnsHop["outboundTag"] = "proxy"
	}
	portHop := map[string]any{
		"type": "field", "inboundTag": []any{"tun"}, "port": "53", "outboundTag": "dns-out",
	}
	var existing []any
	if rules, ok := routing["rules"].([]any); ok {
		existing = rules
	}
	routing["domainStrategy"] = "AsIs"
	routing["rules"] = append([]any{portHop, dnsHop}, existing...)
	root["routing"] = routing
	raw, err := json.Marshal(root)
	if err != nil {
		return "", err
	}
	return string(raw), nil
}
