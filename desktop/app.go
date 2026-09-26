package main

import (
	"fmt"
	"net"
	"sync"
	"time"
)

type tunnel interface {
	Close() error
}

type dnsTunnel struct {
	proc    *xrayProc
	restore func()
}

func (d *dnsTunnel) watch(fn func()) {
	if d != nil && d.proc != nil {
		d.proc.watch(fn)
	}
}

func (d *dnsTunnel) Close() error {
	if d == nil {
		return nil
	}
	if d.restore != nil {
		d.restore()
	}
	if d.proc != nil {
		_ = d.proc.Close()
	}
	return nil
}

type profileView struct {
	ID       string `json:"id"`
	Name     string `json:"name"`
	Kind     string `json:"kind"`
	Endpoint string `json:"endpoint"`
	Ping     *int   `json:"ping,omitempty"`
}

type stateDTO struct {
	Version  string        `json:"version"`
	Status   string        `json:"status"`
	Error    string        `json:"error,omitempty"`
	Note     string        `json:"note,omitempty"`
	ActiveID string        `json:"activeId"`
	Profiles []profileView `json:"profiles"`
}

type app struct {
	mu       sync.Mutex
	status   string
	err      string
	note     string
	active   string
	tunnelID string
	gen      int
	profiles []Profile
	pings    map[string]int
	tun      tunnel
}

func newApp() *app {
	return &app{status: "disconnected", pings: map[string]int{}, profiles: []Profile{}}
}

func (a *app) load() {
	disk, err := loadDisk()
	a.mu.Lock()
	defer a.mu.Unlock()
	if err != nil {
		a.note = "Не удалось прочитать сохранённые серверы"
		return
	}
	if disk.Profiles != nil {
		a.profiles = disk.Profiles
	}
	a.active = disk.Active
}

func (a *app) saveLocked() error {
	return saveDisk(diskState{Active: a.active, Profiles: a.profiles})
}

func (a *app) snapshot() stateDTO {
	a.mu.Lock()
	defer a.mu.Unlock()
	return a.snapshotLocked()
}

func (a *app) snapshotLocked() stateDTO {
	views := make([]profileView, 0, len(a.profiles))
	for _, profile := range a.profiles {
		view := profileView{
			ID: profile.ID, Name: profile.Name, Kind: profile.Kind, Endpoint: profile.Endpoint,
		}
		if ms, ok := a.pings[profile.ID]; ok {
			value := ms
			view.Ping = &value
		}
		views = append(views, view)
	}
	return stateDTO{
		Version: appVersion, Status: a.status, Error: a.err, Note: a.note,
		ActiveID: a.active, Profiles: views,
	}
}

func (a *app) findLocked(id string) (Profile, bool) {
	for _, profile := range a.profiles {
		if profile.ID == id {
			return profile, true
		}
	}
	return Profile{}, false
}

func (a *app) upsertLocked(profile Profile) {
	for i := range a.profiles {
		if a.profiles[i].ID == profile.ID {
			a.profiles[i] = profile
			return
		}
	}
	a.profiles = append(a.profiles, profile)
}

func (a *app) create(kind, country string, lte bool) error {
	var profile Profile
	var err error
	switch kind {
	case "dns":
		profile = dnsProfile()
	case "vless":
		profile, err = bundledVless()
	case "warp":
		profile, err = generateWarp(country, lte, 0)
	default:
		err = fmt.Errorf("Неизвестный сервер")
	}
	if err != nil {
		return err
	}
	a.mu.Lock()
	a.upsertLocked(profile)
	a.active = profile.ID
	a.note = "Создан " + profile.Name
	err = a.saveLocked()
	a.mu.Unlock()
	return err
}

func (a *app) remove(id string) {
	a.mu.Lock()
	wasTunnel := a.tunnelID == id && (a.status == "connected" || a.status == "connecting")
	next := make([]Profile, 0, len(a.profiles))
	for _, profile := range a.profiles {
		if profile.ID != id {
			next = append(next, profile)
		}
	}
	a.profiles = next
	delete(a.pings, id)
	if a.active == id {
		a.active = ""
	}
	_ = a.saveLocked()
	a.mu.Unlock()
	if wasTunnel {
		a.disconnect()
	}
}

func (a *app) selectID(id string) {
	a.mu.Lock()
	defer a.mu.Unlock()
	if _, ok := a.findLocked(id); !ok {
		return
	}
	a.active = id
	_ = a.saveLocked()
}

func (a *app) toggle(id string) {
	a.mu.Lock()
	if id == "" {
		id = a.active
	}
	same := (a.status == "connected" && a.tunnelID == id) || (a.status == "connecting" && a.active == id)
	a.mu.Unlock()
	if same {
		a.disconnect()
		return
	}
	a.connect(id)
}

func (a *app) connect(id string) {
	a.mu.Lock()
	if id == "" {
		id = a.active
	}
	profile, ok := a.findLocked(id)
	if !ok {
		a.status = "error"
		a.err = "Сначала создай сервер"
		a.mu.Unlock()
		return
	}
	a.active = id
	a.gen++
	gen := a.gen
	a.status = "connecting"
	a.err = ""
	a.note = ""
	if profile.Kind != "warp" && !xrayInstalled() {
		a.note = "Скачиваю Xray…"
	}
	_ = a.saveLocked()
	a.mu.Unlock()
	go a.finishConnect(gen, profile)
}

func (a *app) finishConnect(gen int, profile Profile) {
	progress := func(msg string) {
		a.mu.Lock()
		if a.gen == gen {
			a.note = msg
		}
		a.mu.Unlock()
	}
	tun, err := dialTunnel(profile, progress)
	a.mu.Lock()
	if gen != a.gen {
		a.mu.Unlock()
		if tun != nil {
			_ = tun.Close()
		}
		return
	}
	if err != nil {
		if a.tun != nil {
			a.status = "connected"
			a.err = ""
			a.note = err.Error()
		} else {
			a.status = "error"
			a.err = err.Error()
			a.note = ""
			a.tunnelID = ""
		}
		a.mu.Unlock()
		if tun != nil {
			_ = tun.Close()
		}
		return
	}
	old := a.tun
	a.tun = tun
	a.tunnelID = profile.ID
	a.status = "connected"
	a.err = ""
	a.note = ""
	a.mu.Unlock()
	if old != nil {
		_ = old.Close()
	}
	if watcher, ok := tun.(interface{ watch(func()) }); ok {
		watcher.watch(func() { a.tunnelDied(gen) })
	}
}

func (a *app) tunnelDied(gen int) {
	a.mu.Lock()
	if a.gen != gen || a.status != "connected" {
		a.mu.Unlock()
		return
	}
	old := a.tun
	a.tun = nil
	a.tunnelID = ""
	a.status = "error"
	a.err = "Туннель остановился"
	a.mu.Unlock()
	if old != nil {
		_ = old.Close()
	}
}

func (a *app) disconnect() {
	a.mu.Lock()
	a.gen++
	old := a.tun
	a.tun = nil
	a.tunnelID = ""
	a.status = "disconnected"
	a.err = ""
	a.mu.Unlock()
	if old != nil {
		_ = old.Close()
	}
}

func (a *app) refresh() {
	a.mu.Lock()
	a.note = "Скачиваю белые списки…"
	a.mu.Unlock()
	go func() {
		fetched, err := downloadSubs()
		a.mu.Lock()
		if err != nil {
			a.note = err.Error()
			a.mu.Unlock()
			return
		}
		a.replaceWhitelistLocked(fetched.profiles)
		a.note = fetched.note
		_ = a.saveLocked()
		missing := a.tunnelID != "" && !a.hasLocked(a.tunnelID)
		a.mu.Unlock()
		if missing {
			a.disconnect()
		}
		a.measurePings()
	}()
}

func (a *app) replaceWhitelistLocked(next []Profile) {
	kept := make([]Profile, 0, len(a.profiles))
	for _, profile := range a.profiles {
		if profile.Kind != "whitelist" {
			kept = append(kept, profile)
		}
	}
	a.profiles = append(kept, next...)
	a.pings = map[string]int{}
	if a.active != "" && !a.hasLocked(a.active) {
		a.active = ""
	}
}

func (a *app) hasLocked(id string) bool {
	_, ok := a.findLocked(id)
	return ok
}

func (a *app) ping() {
	a.mu.Lock()
	a.note = "Пингую…"
	a.mu.Unlock()
	go a.measurePings()
}

func (a *app) measurePings() {
	a.mu.Lock()
	var list []Profile
	for _, profile := range a.profiles {
		if profile.Kind == "whitelist" {
			list = append(list, profile)
		}
	}
	a.mu.Unlock()
	pings := map[string]int{}
	if len(list) == 0 {
		a.mu.Lock()
		a.note = "Нет серверов"
		a.mu.Unlock()
		return
	}
	sem := make(chan struct{}, 8)
	var wg sync.WaitGroup
	var mu sync.Mutex
	for _, profile := range list {
		wg.Add(1)
		go func(profile Profile) {
			defer wg.Done()
			sem <- struct{}{}
			ms := pingEndpoint(profile.Endpoint)
			<-sem
			mu.Lock()
			pings[profile.ID] = ms
			mu.Unlock()
		}(profile)
	}
	wg.Wait()
	a.mu.Lock()
	a.pings = pings
	if a.note == "Пингую…" || a.note == "Скачиваю белые списки…" {
		a.note = ""
	}
	a.mu.Unlock()
}

func pingEndpoint(endpoint string) int {
	host, port, err := splitEndpoint(endpoint)
	if err != nil {
		return -1
	}
	start := time.Now()
	conn, err := net.DialTimeout("tcp", net.JoinHostPort(host, port), 4*time.Second)
	if err != nil {
		return -1
	}
	_ = conn.Close()
	ms := int(time.Since(start).Milliseconds())
	if ms < 1 {
		return 1
	}
	return ms
}

func dialTunnel(profile Profile, progress func(string)) (tunnel, error) {
	switch profile.Kind {
	case "warp":
		return startWARP(profile.Conf)
	case "dns":
		return startDNS(progress)
	case "vless":
		node, err := parseVless(profile.Link)
		if err != nil {
			return nil, err
		}
		raw, err := vlessCore(node)
		if err != nil {
			return nil, err
		}
		return startXray(raw, progress)
	case "whitelist":
		var raw []byte
		if profile.Core != "" {
			adapted, err := adaptSubscription(profile.Core)
			if err != nil {
				return nil, fmt.Errorf("Этот сервер пока нельзя включить")
			}
			raw = []byte(adapted)
		} else {
			node, err := parseVless(profile.Link)
			if err != nil {
				return nil, fmt.Errorf("Этот сервер пока нельзя включить")
			}
			raw, err = vlessCore(node)
			if err != nil {
				return nil, err
			}
		}
		return startXray(raw, progress)
	default:
		return nil, fmt.Errorf("Этот сервер пока нельзя включить")
	}
}

func startDNS(progress func(string)) (tunnel, error) {
	proc, err := startXray(dnsOnlyJSON(), progress)
	if err != nil {
		return nil, err
	}
	restore, err := setSystemDNS([]string{"127.0.0.1"})
	if err != nil {
		_ = proc.Close()
		return nil, err
	}
	return &dnsTunnel{proc: proc, restore: restore}, nil
}
