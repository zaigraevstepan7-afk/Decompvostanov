package main

import (
	"flag"
	"net"
	"net/http"
	"os"
	"os/signal"
	"strconv"
	"syscall"
	"time"
)

var (
	flagHome = flag.String("home", "", "data directory")
	flagPort = flag.Int("port", 17931, "local port")
)

var httpServer *http.Server

func main() {
	flag.Parse()
	if *flagHome != "" {
		_ = os.Setenv("BOZYA_HOME", *flagHome)
	}
	ensureAdmin()
	restoreDNSIfNeeded()
	ensureWintunBesideExe()

	bozya := newApp()
	bozya.load()

	addr := "127.0.0.1:" + strconv.Itoa(*flagPort)
	ln, err := net.Listen("tcp", addr)
	if err != nil {
		client := &http.Client{Timeout: 800 * time.Millisecond}
		resp, getErr := client.Get("http://" + addr + "/api/state")
		if getErr == nil && resp.StatusCode == http.StatusOK {
			resp.Body.Close()
			if os.Getenv("BOZYA_NO_WINDOW") == "1" {
				return
			}
			page := "http://" + addr + "/"
			if !showAppWindow(page) {
				openBrowser(page)
			}
			return
		}
		fatal("Не удалось открыть окно Bozya VPN")
	}

	httpServer = &http.Server{
		Handler:           newMux(bozya),
		ReadHeaderTimeout: 5 * time.Second,
	}
	go func() { _ = httpServer.Serve(ln) }()
	page := "http://" + addr + "/"
	time.Sleep(250 * time.Millisecond)
	sig := make(chan os.Signal, 1)
	signal.Notify(sig, syscall.SIGINT, syscall.SIGTERM)
	go func() {
		<-sig
		bozya.disconnect()
		os.Exit(0)
	}()
	if os.Getenv("BOZYA_NO_WINDOW") == "1" {
		<-sig
	} else if !showAppWindow(page) {
		openBrowser(page)
		<-sig
	}
	bozya.disconnect()
	_ = httpServer.Close()
}
