package main

import (
	"crypto/sha256"
	"encoding/hex"
	"encoding/json"
	"fmt"
	"net"
	"net/url"
	"runtime"
	"strconv"
	"strings"
)

type vlessNode struct {
	id, host                                  string
	port                                      int
	network, security, sni, fp, pbk, sid, spx string
	flow, path, hostHeader, serviceName       string
	authority, mode, encryption, alpn, extra  string
}

func parseVless(link string) (vlessNode, error) {
	bare := link
	if hash := strings.LastIndex(link, "#"); hash >= 0 {
		bare = link[:hash]
	}
	schemeSep := strings.Index(bare, "://")
	if schemeSep <= 0 || !strings.EqualFold(bare[:schemeSep], "vless") {
		return vlessNode{}, fmt.Errorf("Этот сервер пока нельзя включить")
	}
	rest := bare[schemeSep+3:]
	at := strings.LastIndex(rest, "@")
	if at <= 0 {
		return vlessNode{}, fmt.Errorf("В ссылке нет адреса")
	}
	id := rest[:at]
	hostportAndQuery := rest[at+1:]
	hostport := hostportAndQuery
	query := ""
	if i := strings.Index(hostportAndQuery, "?"); i >= 0 {
		hostport = hostportAndQuery[:i]
		query = hostportAndQuery[i+1:]
	}
	host, port, err := splitHostPort(hostport)
	if err != nil || host == "" || id == "" || port < 1 || port > 65535 {
		return vlessNode{}, fmt.Errorf("В ссылке нет адреса")
	}
	params := queryParams(query)
	network := strings.ToLower(params["type"])
	switch network {
	case "", "tcp", "raw":
		network = "raw"
	case "http", "h2":
		network = "xhttp"
	}
	security := strings.ToLower(params["security"])
	fp := params["fp"]
	if fp == "" && (security == "reality" || security == "tls") {
		fp = "chrome"
	}
	path := params["path"]
	if path == "" {
		path = "/"
	}
	enc := params["encryption"]
	if enc == "" {
		enc = "none"
	}
	return vlessNode{
		id: id, host: host, port: port, network: network, security: security,
		sni: params["sni"], fp: fp, pbk: params["pbk"], sid: params["sid"], spx: params["spx"],
		flow: params["flow"], path: path, hostHeader: params["host"], serviceName: params["serviceName"],
		authority: params["authority"], mode: params["mode"], encryption: enc, alpn: params["alpn"], extra: params["extra"],
	}, nil
}

func splitHostPort(hostport string) (string, int, error) {
	if strings.HasPrefix(hostport, "[") {
		end := strings.Index(hostport, "]")
		if end < 0 {
			return "", 0, fmt.Errorf("bad")
		}
		host := hostport[1:end]
		portText := strings.TrimPrefix(hostport[end+1:], ":")
		port, err := strconv.Atoi(portText)
		return host, port, err
	}
	colon := strings.LastIndex(hostport, ":")
	if colon <= 0 {
		return "", 0, fmt.Errorf("bad")
	}
	port, err := strconv.Atoi(hostport[colon+1:])
	return hostport[:colon], port, err
}

func queryParams(query string) map[string]string {
	out := map[string]string{}
	if query == "" {
		return out
	}
	for _, part := range strings.Split(query, "&") {
		if part == "" {
			continue
		}
		key, err := url.QueryUnescape(part)
		value := ""
		if i := strings.Index(part, "="); i >= 0 {
			key, _ = url.QueryUnescape(part[:i])
			value, _ = url.QueryUnescape(part[i+1:])
		}
		if err != nil && key == "" {
			continue
		}
		if key != "" {
			out[key] = value
		}
	}
	return out
}

func vlessTitle(link, host string) string {
	frag := ""
	if i := strings.LastIndex(link, "#"); i >= 0 {
		frag = link[i+1:]
	}
	if frag == "" {
		return host
	}
	decoded, err := url.QueryUnescape(frag)
	if err != nil {
		decoded = frag
	}
	decoded = takeRunes(strings.TrimSpace(decoded), 48)
	if decoded == "" {
		return host
	}
	return decoded
}

func fingerprint(link string) string {
	sum := sha256.Sum256([]byte(link))
	return hex.EncodeToString(sum[:8])
}

func profileFromVless(link string) (Profile, error) {
	node, err := parseVless(link)
	if err != nil {
		return Profile{}, err
	}
	if _, err := vlessCore(node); err != nil {
		return Profile{}, err
	}
	return Profile{
		ID:       "vless:" + fingerprint(link),
		Name:     vlessTitle(link, node.host),
		Kind:     "vless",
		Endpoint: net.JoinHostPort(node.host, strconv.Itoa(node.port)),
		Link:     link,
	}, nil
}

func bundledVless() (Profile, error) {
	return profileFromVless(bundledVlessLink)
}

func tunIfaceName() string {
	if runtime.GOOS == "darwin" {
		return "utun10"
	}
	return "xray0"
}

func tunInbound() map[string]any {
	return map[string]any{
		"tag":      "tun",
		"protocol": "tun",
		"settings": map[string]any{
			"name":                   tunIfaceName(),
			"mtu":                    1500,
			"gateway":                []any{"169.254.10.1/30"},
			"autoSystemRoutingTable": []any{"0.0.0.0/0", "::/0"},
			"autoOutboundsInterface": "auto",
		},
		"sniffing": map[string]any{
			"enabled":      true,
			"destOverride": []any{"http", "tls", "quic"},
		},
	}
}

func vlessCore(node vlessNode) ([]byte, error) {
	user := map[string]any{
		"id":         node.id,
		"encryption": node.encryption,
	}
	if node.flow != "" && node.network == "raw" {
		user["flow"] = node.flow
	}
	stream := map[string]any{"network": node.network}
	switch node.network {
	case "ws":
		stream["wsSettings"] = map[string]any{"path": node.path, "host": node.hostHeader}
	case "xhttp":
		xhttp := map[string]any{"path": node.path, "host": node.hostHeader}
		if node.mode != "" {
			xhttp["mode"] = node.mode
		}
		if node.extra != "" {
			var extra any
			if json.Unmarshal([]byte(node.extra), &extra) == nil {
				xhttp["extra"] = extra
			}
		}
		stream["xhttpSettings"] = xhttp
	case "grpc":
		authority := node.authority
		if authority == "" {
			authority = node.hostHeader
		}
		stream["grpcSettings"] = map[string]any{
			"serviceName": node.serviceName,
			"authority":   authority,
			"multiMode":   node.mode == "multi",
		}
	}
	if node.security == "reality" || node.security == "tls" {
		stream["security"] = node.security
		name := node.sni
		if name == "" {
			name = node.hostHeader
		}
		if name == "" {
			name = node.host
		}
		tls := map[string]any{}
		if name != "" {
			tls["serverName"] = name
		}
		if node.fp != "" {
			tls["fingerprint"] = node.fp
		}
		if node.pbk != "" {
			tls["publicKey"] = node.pbk
		}
		if node.sid != "" {
			tls["shortId"] = node.sid
		}
		if node.spx != "" {
			tls["spiderX"] = node.spx
		}
		if node.security == "tls" && node.alpn != "" {
			var alpn []any
			for _, part := range strings.Split(node.alpn, ",") {
				part = strings.TrimSpace(part)
				if part != "" {
					alpn = append(alpn, part)
				}
			}
			if len(alpn) > 0 {
				tls["alpn"] = alpn
			}
		}
		if node.security == "reality" {
			stream["realitySettings"] = tls
		} else {
			stream["tlsSettings"] = tls
		}
	}
	cfg := map[string]any{
		"log":      map[string]any{"loglevel": "warning"},
		"inbounds": []any{tunInbound()},
		"outbounds": []any{
			map[string]any{
				"tag":      "proxy",
				"protocol": "vless",
				"settings": map[string]any{
					"vnext": []any{
						map[string]any{
							"address": node.host,
							"port":    node.port,
							"users":   []any{user},
						},
					},
				},
				"streamSettings": stream,
			},
			map[string]any{"tag": "dns-out", "protocol": "dns"},
			map[string]any{"tag": "direct", "protocol": "freedom"},
		},
		"dns": map[string]any{
			"tag":           "dns",
			"queryStrategy": "UseIPv4",
			"servers":       []any{"https://1.1.1.1/dns-query", "https://8.8.8.8/dns-query"},
		},
		"routing": map[string]any{
			"domainStrategy": "AsIs",
			"rules": []any{
				map[string]any{"type": "field", "inboundTag": []any{"tun"}, "port": "53", "outboundTag": "dns-out"},
				map[string]any{"type": "field", "inboundTag": []any{"dns"}, "outboundTag": "proxy"},
				map[string]any{"type": "field", "network": "tcp,udp", "outboundTag": "proxy"},
			},
		},
	}
	return json.Marshal(cfg)
}

func dnsOnlyJSON() []byte {
	cfg := map[string]any{
		"log": map[string]any{"loglevel": "warning"},
		"inbounds": []any{
			map[string]any{
				"tag":      "dns-in",
				"listen":   "127.0.0.1",
				"port":     53,
				"protocol": "dokodemo-door",
				"settings": map[string]any{
					"address": "1.1.1.1",
					"port":    53,
					"network": "tcp,udp",
				},
			},
		},
		"outbounds": []any{
			map[string]any{"tag": "dns-out", "protocol": "dns"},
			map[string]any{"tag": "direct", "protocol": "freedom"},
		},
		"dns": map[string]any{
			"tag":           "dns",
			"queryStrategy": "UseIPv4",
			"servers":       []any{"https://xbox-dns.ru/dns-query"},
		},
		"routing": map[string]any{
			"domainStrategy": "AsIs",
			"rules": []any{
				map[string]any{"type": "field", "inboundTag": []any{"dns-in"}, "outboundTag": "dns-out"},
			},
		},
	}
	raw, _ := json.Marshal(cfg)
	return raw
}

func dnsProfile() Profile {
	return Profile{ID: "warp:ai", Name: "AI Ultra", Kind: "dns", Endpoint: "xbox-dns.ru"}
}
