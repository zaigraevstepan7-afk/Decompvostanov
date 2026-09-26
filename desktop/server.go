package main

import (
	"encoding/json"
	"io"
	"net/http"
)

func writeJSON(w http.ResponseWriter, code int, v any) {
	w.Header().Set("Content-Type", "application/json; charset=utf-8")
	w.WriteHeader(code)
	enc := json.NewEncoder(w)
	enc.SetEscapeHTML(false)
	_ = enc.Encode(v)
}

func readJSON(r *http.Request, dest any) error {
	defer r.Body.Close()
	dec := json.NewDecoder(io.LimitReader(r.Body, 1<<20))
	return dec.Decode(dest)
}

func newMux(a *app) http.Handler {
	mux := http.NewServeMux()
	mux.HandleFunc("GET /{$}", func(w http.ResponseWriter, r *http.Request) {
		w.Header().Set("Content-Type", "text/html; charset=utf-8")
		_, _ = w.Write(indexHTML)
	})
	mux.HandleFunc("GET /api/state", func(w http.ResponseWriter, r *http.Request) {
		writeJSON(w, http.StatusOK, a.snapshot())
	})
	mux.HandleFunc("GET /api/meta", func(w http.ResponseWriter, r *http.Request) {
		type countryDTO struct {
			ID   string `json:"id"`
			Name string `json:"name"`
			Flag string `json:"flag"`
			LTE  bool   `json:"lte"`
		}
		list := make([]countryDTO, 0, len(countries))
		for _, c := range countries {
			list = append(list, countryDTO{ID: c.id, Name: c.name, Flag: c.flag, LTE: c.lteHost != ""})
		}
		writeJSON(w, http.StatusOK, map[string]any{
			"version":   appVersion,
			"bank":      supportBank,
			"phone":     supportPhone,
			"countries": list,
		})
	})
	mux.HandleFunc("POST /api/create", func(w http.ResponseWriter, r *http.Request) {
		var req struct {
			Kind    string `json:"kind"`
			Country string `json:"country"`
			LTE     bool   `json:"lte"`
		}
		if err := readJSON(r, &req); err != nil {
			writeJSON(w, http.StatusBadRequest, map[string]string{"error": "Не получилось"})
			return
		}
		if err := a.create(req.Kind, req.Country, req.LTE); err != nil {
			writeJSON(w, http.StatusBadRequest, map[string]string{"error": err.Error()})
			return
		}
		writeJSON(w, http.StatusOK, a.snapshot())
	})
	mux.HandleFunc("POST /api/delete", func(w http.ResponseWriter, r *http.Request) {
		var req struct {
			ID string `json:"id"`
		}
		if err := readJSON(r, &req); err != nil || req.ID == "" {
			writeJSON(w, http.StatusBadRequest, map[string]string{"error": "Не получилось"})
			return
		}
		a.remove(req.ID)
		writeJSON(w, http.StatusOK, a.snapshot())
	})
	mux.HandleFunc("POST /api/select", func(w http.ResponseWriter, r *http.Request) {
		var req struct {
			ID string `json:"id"`
		}
		if err := readJSON(r, &req); err != nil {
			writeJSON(w, http.StatusBadRequest, map[string]string{"error": "Не получилось"})
			return
		}
		a.selectID(req.ID)
		writeJSON(w, http.StatusOK, a.snapshot())
	})
	mux.HandleFunc("POST /api/connect", func(w http.ResponseWriter, r *http.Request) {
		var req struct {
			ID string `json:"id"`
		}
		_ = readJSON(r, &req)
		a.toggle(req.ID)
		writeJSON(w, http.StatusOK, a.snapshot())
	})
	mux.HandleFunc("POST /api/disconnect", func(w http.ResponseWriter, r *http.Request) {
		a.disconnect()
		writeJSON(w, http.StatusOK, a.snapshot())
	})
	mux.HandleFunc("POST /api/refresh", func(w http.ResponseWriter, r *http.Request) {
		a.refresh()
		writeJSON(w, http.StatusOK, a.snapshot())
	})
	mux.HandleFunc("POST /api/ping", func(w http.ResponseWriter, r *http.Request) {
		a.ping()
		writeJSON(w, http.StatusOK, a.snapshot())
	})
	mux.HandleFunc("POST /api/quit", func(w http.ResponseWriter, r *http.Request) {
		a.disconnect()
		writeJSON(w, http.StatusOK, map[string]bool{"ok": true})
		go func() { _ = httpServer.Close() }()
	})
	return mux
}
