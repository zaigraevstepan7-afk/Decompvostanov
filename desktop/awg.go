package main

import (
	"fmt"
	"net"
	"runtime"
	"strings"

	"github.com/amnezia-vpn/amneziawg-go/v3/conn"
	"github.com/amnezia-vpn/amneziawg-go/v3/device"
	"github.com/amnezia-vpn/amneziawg-go/v3/tun"
)

func warpTunName() string {
	switch runtime.GOOS {
	case "darwin":
		return "utun"
	case "windows":
		return "Bozya"
	default:
		return "bozya"
	}
}

type awgTunnel struct {
	dev     *device.Device
	cleanup func()
}

func (t *awgTunnel) Close() error {
	if t == nil {
		return nil
	}
	if t.cleanup != nil {
		t.cleanup()
		t.cleanup = nil
	}
	if t.dev != nil {
		_ = t.dev.Down()
		t.dev.Close()
		t.dev = nil
	}
	return nil
}

func startWARP(conf string) (tunnel, error) {
	host, port, err := splitEndpoint(wgValue(conf, "Endpoint"))
	if err != nil {
		return nil, fmt.Errorf("В конфиге WARP нет адреса сервера")
	}
	ip, err := resolveIPv4(host)
	if err != nil {
		return nil, err
	}
	gw, err := captureGateway()
	if err != nil {
		return nil, err
	}
	prepareTunDevice()
	ensureWintunBesideExe()
	td, err := tun.CreateTUN(warpTunName(), warpMTU)
	if err != nil {
		return nil, tunErr(err)
	}
	name, err := td.Name()
	if err != nil {
		_ = td.Close()
		return nil, tunErr(err)
	}
	dev := device.NewDevice(td, conn.NewDefaultBind(), &device.Logger{
		Verbosef: device.DiscardLogf,
		Errorf:   device.DiscardLogf,
	})
	cleanup, err := setupWarpRoutes(name, confAddrs(conf), ip, gw, warpMTU)
	if err != nil {
		dev.Close()
		return nil, err
	}
	uapi, err := buildUAPI(conf, net.JoinHostPort(ip.String(), port))
	if err != nil {
		cleanup()
		dev.Close()
		return nil, err
	}
	if err := dev.IpcSet(uapi); err != nil {
		cleanup()
		dev.Close()
		return nil, fmt.Errorf("Не удалось включить WARP")
	}
	if err := dev.Up(); err != nil {
		cleanup()
		dev.Close()
		return nil, fmt.Errorf("Не удалось включить WARP")
	}
	restore, err := setSystemDNS([]string{"1.1.1.1", "1.0.0.1"})
	if err != nil {
		cleanup()
		dev.Close()
		return nil, err
	}
	return &awgTunnel{dev: dev, cleanup: func() {
		cleanup()
		restore()
	}}, nil
}

func tunErr(err error) error {
	low := strings.ToLower(err.Error())
	if strings.Contains(low, "permitted") || strings.Contains(low, "access is denied") || strings.Contains(low, "privilege") || strings.Contains(low, "administrator") {
		return fmt.Errorf("Нужны права администратора")
	}
	return fmt.Errorf("Не удалось создать туннель")
}
