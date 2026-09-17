# Google / Antigravity login

EasyCLIProxyAPI is a Tauri desktop console around CLIProxyAPI. Antigravity login is not a Gemini API key.

## Sequence

1. Start a loopback HTTP server on `127.0.0.1:51121`.
2. Open Google OAuth:
   - client_id of the official Antigravity desktop OAuth app (same client CLIProxyAPI uses)
   - `access_type=offline`, `prompt=consent`
   - scopes: `cloud-platform`, `userinfo.email`, `userinfo.profile`, `cclog`, `experimentsandconfigs`
   - redirect `http://127.0.0.1:51121/oauth-callback`
3. User signs in with a Google account that has Antigravity / Gemini Code Assist.
4. Exchange `code` at `https://oauth2.googleapis.com/token`.
5. `GET https://www.googleapis.com/oauth2/v2/userinfo` → email.
6. `POST https://cloudcode-pa.googleapis.com/v1internal:loadCodeAssist` with `metadata.ideType=ANTIGRAVITY` → `cloudaicompanionProject`. If empty, poll `daily-cloudcode-pa.googleapis.com/v1internal:onboardUser`.
7. Model calls go to `POST https://cloudcode-pa.googleapis.com/v1internal:generateContent` with envelope `{ project, model, request: { contents, systemInstruction, tools } }` and `User-Agent: antigravity/...`.

Quota endpoint used by EasyCLIProxyAPI: `POST .../v1internal:retrieveUserQuotaSummary`.

This Android app repeats the same flow on-device and never sends a Generative Language API key.
