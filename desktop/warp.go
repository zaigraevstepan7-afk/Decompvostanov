package main

import (
	"context"
	"crypto/rand"
	"encoding/base64"
	"encoding/hex"
	"encoding/json"
	"fmt"
	"io"
	"math/big"
	"net"
	"net/http"
	"strings"
	"time"
)

const (
	warpAPIURL      = "https://generator-config-warp.vercel.app/api/warp-data"
	warpDefaultPort = 4500
	warpMTU         = 1280
	warpKeepalive   = 25
	warpDNS         = "1.1.1.1, 1.0.0.1, 2606:4700:4700::1111, 2606:4700:4700::1001"
	warpAllowedIPs  = "0.0.0.0/0, ::/0"
)

var warpPorts = []int{
	500, 854, 859, 864, 878, 880, 890, 891, 894, 903, 908, 928, 934, 939, 942, 943,
	945, 946, 955, 968, 987, 988, 1002, 1010, 1014, 1018, 1070, 1074, 1180, 1387,
	1701, 1843, 2371, 2408, 2506, 3138, 3476, 3581, 3854, 4177, 4198, 4233, 4500,
	5279, 5956, 7103, 7152, 7156, 7281, 7559, 8319, 8742, 8854, 8886,
}

type country struct {
	id, name, flag, host, lteHost string
	lteSkip                       []int
}

var countries = []country{
	{"de", "Германия", "🇩🇪", "de.tribukvy.ltd", "tel.de.tribukvy.ltd", nil},
	{"pl", "Польша", "🇵🇱", "pl.tribukvy.ltd", "tel.pl.tribukvy.ltd", []int{988}},
	{"nl", "Нидерланды", "🇳🇱", "nl.tribukvy.ltd", "", nil},
	{"fi", "Финляндия", "🇫🇮", "fi.tribukvy.ltd", "tel.fi.tribukvy.ltd", []int{1010}},
	{"ee", "Эстония", "🇪🇪", "ee.tribukvy.ltd", "", nil},
	{"lv", "Латвия", "🇱🇻", "lv.tribukvy.ltd", "", nil},
	{"ru", "Россия", "🇷🇺", "ru0.tribukvy.ltd", "", nil},
}

func countryByID(id string) (country, bool) {
	for _, c := range countries {
		if c.id == id {
			return c, true
		}
	}
	return country{}, false
}

type warpKeys struct {
	Private string
	Peer    string
	IPv4    string
	IPv6    string
}

type warpAPIResponse struct {
	Success bool   `json:"success"`
	PrivKey string `json:"privKey"`
	PeerPub string `json:"peer_pub"`
	IPv4    string `json:"client_ipv4"`
	IPv6    string `json:"client_ipv6"`
	Message string `json:"message"`
}

var cachedWarp warpKeys
var cachedWarpOK bool

func parseWarpBody(body string) (warpKeys, error) {
	var parsed warpAPIResponse
	if err := json.Unmarshal([]byte(body), &parsed); err != nil {
		return warpKeys{}, fmt.Errorf("Не удалось получить данные WARP")
	}
	if !parsed.Success {
		if strings.TrimSpace(parsed.Message) != "" {
			return warpKeys{}, fmt.Errorf("%s", redact(parsed.Message))
		}
		return warpKeys{}, fmt.Errorf("Не удалось получить данные WARP")
	}
	keys := warpKeys{
		Private: strings.TrimSpace(parsed.PrivKey),
		Peer:    strings.TrimSpace(parsed.PeerPub),
		IPv4:    strings.TrimSpace(parsed.IPv4),
		IPv6:    strings.TrimSpace(parsed.IPv6),
	}
	if keys.Private == "" || keys.Peer == "" || keys.IPv4 == "" {
		return warpKeys{}, fmt.Errorf("Не удалось получить данные WARP")
	}
	return keys, nil
}

func fetchWarpKeys() (warpKeys, error) {
	if cachedWarpOK {
		return cachedWarp, nil
	}
	ctx, cancel := context.WithTimeout(context.Background(), 25*time.Second)
	defer cancel()
	req, err := http.NewRequestWithContext(ctx, http.MethodGet, warpAPIURL, nil)
	if err != nil {
		return warpKeys{}, fmt.Errorf("Не удалось получить данные WARP")
	}
	req.Header.Set("Accept", "application/json")
	req.Header.Set("User-Agent", "BozyaVPN/"+appVersion)
	resp, err := http.DefaultClient.Do(req)
	if err != nil {
		return warpKeys{}, fmt.Errorf("Не удалось получить данные WARP")
	}
	defer resp.Body.Close()
	body, err := io.ReadAll(io.LimitReader(resp.Body, 1<<20))
	if err != nil || resp.StatusCode < 200 || resp.StatusCode > 299 {
		return warpKeys{}, fmt.Errorf("Не удалось получить данные WARP")
	}
	keys, err := parseWarpBody(string(body))
	if err != nil {
		return warpKeys{}, err
	}
	cachedWarp = keys
	cachedWarpOK = true
	return keys, nil
}

func randomPort(excluded map[int]bool) int {
	pool := make([]int, 0, len(warpPorts))
	for _, port := range warpPorts {
		if !excluded[port] {
			pool = append(pool, port)
		}
	}
	if len(pool) == 0 {
		return warpDefaultPort
	}
	n, err := rand.Int(rand.Reader, big.NewInt(int64(len(pool))))
	if err != nil {
		return pool[0]
	}
	return pool[n.Int64()]
}

func buildWarpConf(keys warpKeys, host string, port int) string {
	address := strings.TrimSpace(keys.IPv4)
	if strings.TrimSpace(keys.IPv6) != "" {
		address += ", " + strings.TrimSpace(keys.IPv6)
	}
	return strings.Join([]string{
		"[Interface]",
		"PrivateKey = " + strings.TrimSpace(keys.Private),
		"MTU = " + fmt.Sprint(warpMTU),
		"Address = " + address,
		"DNS = " + warpDNS,
		"S1 = 0",
		"S2 = 0",
		"S3 = 0",
		"S4 = 0",
		"Jc = 4",
		"Jmin = 40",
		"Jmax = 70",
		"H1 = 1",
		"H2 = 2",
		"H3 = 3",
		"H4 = 4",
		"I1 = " + junkI1,
		"",
		"[Peer]",
		"PublicKey = " + strings.TrimSpace(keys.Peer),
		"AllowedIPs = " + warpAllowedIPs,
		"Endpoint = " + host + ":" + fmt.Sprint(port),
		"PersistentKeepalive = " + fmt.Sprint(warpKeepalive),
		"",
	}, "\n")
}

func generateWarp(countryID string, lte bool, port int) (Profile, error) {
	c, ok := countryByID(countryID)
	if !ok {
		return Profile{}, fmt.Errorf("Неизвестная страна")
	}
	host := c.host
	name := c.name
	id := "warp:" + c.id
	excluded := map[int]bool{}
	if lte && c.lteHost != "" {
		host = c.lteHost
		name = c.name + " LTE"
		id = "warp:lte-" + c.id
		for _, skip := range c.lteSkip {
			excluded[skip] = true
		}
	}
	if port == 0 {
		port = randomPort(excluded)
	} else if excluded[port] {
		port = randomPort(excluded)
	}
	keys, err := fetchWarpKeys()
	if err != nil {
		return Profile{}, err
	}
	return Profile{
		ID:       id,
		Name:     name,
		Kind:     "warp",
		Endpoint: fmt.Sprintf("%s:%d", host, port),
		Conf:     buildWarpConf(keys, host, port),
	}, nil
}

func wgValue(raw, key string) string {
	raw = strings.ReplaceAll(raw, "\r\n", "\n")
	for _, line := range strings.Split(raw, "\n") {
		body := line
		if i := strings.Index(body, "#"); i >= 0 {
			body = body[:i]
		}
		eq := strings.Index(body, "=")
		if eq <= 0 {
			continue
		}
		if strings.EqualFold(strings.TrimSpace(body[:eq]), key) {
			return strings.TrimSpace(body[eq+1:])
		}
	}
	return ""
}

func b64ToHex(s string) (string, error) {
	s = strings.TrimSpace(s)
	b, err := base64.StdEncoding.DecodeString(s)
	if err != nil {
		b, err = base64.RawStdEncoding.DecodeString(s)
	}
	if err != nil || len(b) != 32 {
		return "", fmt.Errorf("Неверный ключ WARP")
	}
	return hex.EncodeToString(b), nil
}

func confAddrs(conf string) []string {
	var out []string
	for _, part := range strings.Split(wgValue(conf, "Address"), ",") {
		part = strings.TrimSpace(part)
		if part != "" {
			out = append(out, part)
		}
	}
	return out
}

func buildUAPI(conf, endpoint string) (string, error) {
	priv, err := b64ToHex(wgValue(conf, "PrivateKey"))
	if err != nil {
		return "", err
	}
	pub, err := b64ToHex(wgValue(conf, "PublicKey"))
	if err != nil {
		return "", err
	}
	i1 := wgValue(conf, "I1")
	if i1 == "" {
		i1 = junkI1
	}
	jc := wgValue(conf, "Jc")
	if jc == "" {
		jc = "4"
	}
	keepalive := wgValue(conf, "PersistentKeepalive")
	if keepalive == "" {
		keepalive = fmt.Sprint(warpKeepalive)
	}
	var b strings.Builder
	fmt.Fprintf(&b, "private_key=%s\n", priv)
	fmt.Fprintf(&b, "jc=%s\n", jc)
	fmt.Fprintf(&b, "jmin=%s\n", orDefault(wgValue(conf, "Jmin"), "40"))
	fmt.Fprintf(&b, "jmax=%s\n", orDefault(wgValue(conf, "Jmax"), "70"))
	fmt.Fprintf(&b, "s1=%s\n", orDefault(wgValue(conf, "S1"), "0"))
	fmt.Fprintf(&b, "s2=%s\n", orDefault(wgValue(conf, "S2"), "0"))
	fmt.Fprintf(&b, "s3=%s\n", orDefault(wgValue(conf, "S3"), "0"))
	fmt.Fprintf(&b, "s4=%s\n", orDefault(wgValue(conf, "S4"), "0"))
	fmt.Fprintf(&b, "h1=%s\n", orDefault(wgValue(conf, "H1"), "1"))
	fmt.Fprintf(&b, "h2=%s\n", orDefault(wgValue(conf, "H2"), "2"))
	fmt.Fprintf(&b, "h3=%s\n", orDefault(wgValue(conf, "H3"), "3"))
	fmt.Fprintf(&b, "h4=%s\n", orDefault(wgValue(conf, "H4"), "4"))
	fmt.Fprintf(&b, "i1=%s\n", i1)
	b.WriteString("replace_peers=true\n")
	fmt.Fprintf(&b, "public_key=%s\n", pub)
	fmt.Fprintf(&b, "endpoint=%s\n", endpoint)
	fmt.Fprintf(&b, "persistent_keepalive_interval=%s\n", keepalive)
	b.WriteString("allowed_ip=0.0.0.0/0\n")
	b.WriteString("allowed_ip=::/0\n")
	return b.String(), nil
}

func orDefault(value, fallback string) string {
	if strings.TrimSpace(value) == "" {
		return fallback
	}
	return strings.TrimSpace(value)
}

func splitEndpoint(ep string) (string, string, error) {
	ep = strings.TrimSpace(ep)
	if ep == "" {
		return "", "", fmt.Errorf("empty")
	}
	if strings.HasPrefix(ep, "[") {
		return net.SplitHostPort(ep)
	}
	i := strings.LastIndex(ep, ":")
	if i <= 0 || i == len(ep)-1 {
		return "", "", fmt.Errorf("empty")
	}
	return ep[:i], ep[i+1:], nil
}

func resolveIPv4(host string) (net.IP, error) {
	if ip := net.ParseIP(host); ip != nil {
		if v4 := ip.To4(); v4 != nil {
			return v4, nil
		}
		return nil, fmt.Errorf("Нужен IPv4-адрес сервера")
	}
	ctx, cancel := context.WithTimeout(context.Background(), 8*time.Second)
	defer cancel()
	ips, err := net.DefaultResolver.LookupIP(ctx, "ip4", host)
	if err != nil || len(ips) == 0 {
		return nil, fmt.Errorf("Не удалось найти адрес %s", host)
	}
	return ips[0].To4(), nil
}
