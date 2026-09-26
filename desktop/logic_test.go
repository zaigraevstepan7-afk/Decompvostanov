package main

import (
	"bytes"
	"encoding/base64"
	"encoding/hex"
	"encoding/json"
	"os"
	"strings"
	"testing"
)

func TestRouteParsers(t *testing.T) {
	gw, err := parseLinuxDefault("default via 10.0.0.1 dev eth0 proto dhcp\n")
	if err != nil || gw.IP.String() != "10.0.0.1" || gw.Iface != "eth0" {
		t.Fatal("linux")
	}
	gw, err = parseDarwinDefault("   gateway: 192.168.1.1\n  interface: en0\n")
	if err != nil || gw.IP.String() != "192.168.1.1" || gw.Iface != "en0" {
		t.Fatal("darwin")
	}
	if _, err := parseWindowsGateway("0.0.0.0|Ethernet"); err == nil {
		t.Fatal("unspec")
	}
	gw, err = parseWindowsGateway("noise\n10.1.1.1|Wi-Fi\n")
	if err != nil || gw.IP.String() != "10.1.1.1" || gw.Iface != "Wi-Fi" {
		t.Fatal("windows")
	}
}

func TestBundledVless(t *testing.T) {
	profile, err := bundledVless()
	if err != nil {
		t.Fatal("profile")
	}
	if profile.Name != "Nikitok · custom-vless-25449" || profile.Endpoint != "ch3.h1cloud.net:25449" || profile.Kind != "vless" {
		t.Fatal("card")
	}
	if !strings.HasPrefix(profile.ID, "vless:") || len(profile.ID) != len("vless:")+16 {
		t.Fatal("id")
	}
	node, err := parseVless(profile.Link)
	if err != nil {
		t.Fatal("parse")
	}
	raw, err := vlessCore(node)
	if err != nil {
		t.Fatal("core")
	}
	text := string(raw)
	for _, want := range []string{`"network":"xhttp"`, `"security":"reality"`, "www.apple.com", "ch3.h1cloud.net", "autoSystemRoutingTable", "25449", `"path":"/"`} {
		if !strings.Contains(text, want) {
			t.Fatalf("missing %s", want)
		}
	}
	if strings.Contains(text, `"flow"`) {
		t.Fatal("flow")
	}
}

func TestVlessMappings(t *testing.T) {
	rawLink := "vless://11111111-1111-1111-1111-111111111111@example.com:443?type=tcp&security=tls&flow=xtls-rprx-vision&sni=example.com"
	node, err := parseVless(rawLink)
	if err != nil {
		t.Fatal("parse")
	}
	raw, err := vlessCore(node)
	if err != nil || !strings.Contains(string(raw), `"flow":"xtls-rprx-vision"`) || node.network != "raw" {
		t.Fatal("vision")
	}
	httpLink := "vless://11111111-1111-1111-1111-111111111111@example.com:443?type=http&security=tls&flow=xtls-rprx-vision&sni=example.com"
	node, err = parseVless(httpLink)
	if err != nil || node.network != "xhttp" {
		t.Fatal("xhttp")
	}
	raw, _ = vlessCore(node)
	if strings.Contains(string(raw), `"flow"`) {
		t.Fatal("flow on xhttp")
	}
}

func TestWhitelistFilters(t *testing.T) {
	if !isWhitelistName("LTE 1") || !isWhitelistName("Белый список") || !isWhitelistName("бс") || !isWhitelistName("обход") || !isWhitelistName("white-list") {
		t.Fatal("keep")
	}
	if isWhitelistName("Belgium") || isWhitelistName("бельгия") || isWhitelistName("обычный") || isWhitelistName("абс") {
		t.Fatal("drop")
	}
	body := "vless://11111111-1111-1111-1111-111111111111@ex.com:443?type=tcp#обычный\n" +
		"vless://22222222-2222-2222-2222-222222222222@ex.com:8443?type=tcp#LTE%20обход\n" +
		"vless://33333333-3333-3333-3333-333333333333@zieng2.org:1?type=tcp#notice\n"
	got := profilesFrom(body, true)
	if len(got) != 1 || got[0].Name != "LTE обход" || got[0].Endpoint != "ex.com:8443" {
		t.Fatal("filter")
	}
	if got[0].ID != idFor(strings.Split(strings.Split(body, "\n")[1], "#")[0]+"#LTE%20обход") && !strings.HasPrefix(got[0].ID, "bs:") {
		t.Fatal("id")
	}
	encoded := base64.StdEncoding.EncodeToString([]byte(body))
	if len(profilesFrom(encoded, false)) < 2 {
		t.Fatal("b64")
	}
	notice := profilesFrom("vless://11111111-1111-1111-1111-111111111111@ex.com:1?type=tcp#обновите%20тут", false)
	if len(notice) != 0 {
		t.Fatal("notice")
	}
}

func TestAdaptAndDNS(t *testing.T) {
	raw := `{"remarks":"x","outbounds":[{"protocol":"vless","tag":"proxy","settings":{"vnext":[{"address":"ex.com","port":443,"users":[{"id":"11111111-1111-1111-1111-111111111111"}]}]}}],"routing":{"rules":[{"type":"field","port":"80","outboundTag":"proxy"}]}}`
	got, err := adaptSubscription(raw)
	if err != nil || !strings.Contains(got, "autoSystemRoutingTable") || !strings.Contains(got, `"protocol":"dns"`) || !strings.Contains(got, "ex.com") {
		t.Fatal("adapt")
	}
	profiles := profilesFromXray(raw, false)
	if len(profiles) != 1 || profiles[0].Endpoint != "ex.com:443" || profiles[0].Core == "" {
		t.Fatal("json card")
	}
	dns := string(dnsOnlyJSON())
	if !strings.Contains(dns, "https://xbox-dns.ru/dns-query") || strings.Contains(dns, "autoSystemRoutingTable") {
		t.Fatal("dns")
	}
}

func TestWarpUAPI(t *testing.T) {
	priv := base64.StdEncoding.EncodeToString(bytes.Repeat([]byte{1}, 32))
	pub := base64.StdEncoding.EncodeToString(bytes.Repeat([]byte{2}, 32))
	keys, err := parseWarpBody(`{"success":true,"privKey":"` + priv + `","peer_pub":"` + pub + `","client_ipv4":"172.16.0.2/32","client_ipv6":"fd00::1/128"}`)
	if err != nil {
		t.Fatal("parse")
	}
	conf := buildWarpConf(keys, "pl.tribukvy.ltd", 4500)
	if !strings.Contains(conf, "Jc = 4") || !strings.Contains(conf, "Endpoint = pl.tribukvy.ltd:4500") || !strings.Contains(conf, "I1 = <b 0x") {
		t.Fatal("conf")
	}
	uapi, err := buildUAPI(conf, "1.2.3.4:4500")
	if err != nil {
		t.Fatal("uapi")
	}
	if strings.Contains(uapi, priv) || !strings.Contains(uapi, "private_key="+hex.EncodeToString(bytes.Repeat([]byte{1}, 32))) {
		t.Fatal("key")
	}
	if !strings.Contains(uapi, "jc=4") || !strings.Contains(uapi, "endpoint=1.2.3.4:4500") || !strings.Contains(uapi, "i1=<b 0x") || strings.Contains(uapi, "\n\n") {
		t.Fatal("fields")
	}
	for _, line := range strings.Split(uapi, "\n") {
		if strings.HasPrefix(line, "i1=") && !strings.HasPrefix(line, "i1=<b 0x") {
			t.Fatal("i1")
		}
	}
	skipped := map[int]bool{988: true}
	for i := 0; i < 30; i++ {
		if randomPort(skipped) == 988 {
			t.Fatal("port")
		}
	}
	pl, ok := countryByID("pl")
	if !ok || pl.host != "pl.tribukvy.ltd" || pl.lteHost != "tel.pl.tribukvy.ltd" {
		t.Fatal("pl")
	}
	fi, _ := countryByID("fi")
	if fi.lteHost != "tel.fi.tribukvy.ltd" || countryHost("ru") != "ru0.tribukvy.ltd" {
		t.Fatal("hosts")
	}
}

func countryHost(id string) string {
	c, ok := countryByID(id)
	if !ok {
		return ""
	}
	return c.host
}

func TestXrayFailure(t *testing.T) {
	log := "Xray 26.3.27\nA unified platform\nFailed to start: main: failed to create server > operation not permitted\n"
	if xrayFailure(log) != "Нужны права администратора" {
		t.Fatal("admin")
	}
	if xrayFailure("boom\nFailed to start: bad json\n") == "" {
		t.Fatal("empty")
	}
}

func TestFeedsAndJunk(t *testing.T) {
	if len(feeds) != 2 || feeds[0].label != "LTE" || feeds[0].onlyWhitelist || feeds[1].label != "вторая" || !feeds[1].onlyWhitelist {
		t.Fatal("feeds")
	}
	if !strings.HasPrefix(feeds[0].url, "https://") || !strings.HasPrefix(feeds[1].url, "https://") {
		t.Fatal("url")
	}
	if !strings.HasPrefix(junkI1, "<b 0x") || !strings.HasSuffix(junkI1, ">") || strings.Contains(junkI1, "\n") {
		t.Fatal("junk")
	}
	if dnsProfile().ID != "warp:ai" || dnsProfile().Name != "AI Ultra" {
		t.Fatal("ai")
	}
}

func TestSavedProfilesBuild(t *testing.T) {
	path := os.Getenv("BOZYA_CHECK_STORE")
	if path == "" {
		t.Skip()
	}
	raw, err := os.ReadFile(path)
	if err != nil {
		t.Fatal("read")
	}
	var disk diskState
	if json.Unmarshal(raw, &disk) != nil {
		t.Fatal("json")
	}
	var warp, link, core int
	for _, profile := range disk.Profiles {
		switch profile.Kind {
		case "warp":
			uapi, err := buildUAPI(profile.Conf, "1.2.3.4:4500")
			if err != nil || !strings.Contains(uapi, "jc=4") || !strings.Contains(uapi, "i1=<b 0x") {
				t.Fatal("warp")
			}
			warp++
		case "vless", "whitelist":
			if profile.Link != "" {
				node, err := parseVless(profile.Link)
				if err != nil {
					t.Fatalf("link %s", profile.Endpoint)
				}
				built, err := vlessCore(node)
				if err != nil || !strings.Contains(string(built), "autoSystemRoutingTable") {
					t.Fatalf("core %s", profile.Endpoint)
				}
				link++
			}
			if profile.Core != "" {
				adapted, err := adaptSubscription(profile.Core)
				if err != nil || !strings.Contains(adapted, "autoSystemRoutingTable") {
					t.Fatalf("adapt %s", profile.Endpoint)
				}
				core++
			}
		}
	}
	if warp == 0 || link == 0 {
		t.Fatal("empty")
	}
	t.Log(warp, link, core)
}
