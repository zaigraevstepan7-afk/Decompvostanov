package com.nimbus.vpn.ui

import android.app.Application
import android.content.Intent
import android.net.Uri
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.nimbus.vpn.NimbusApp
import com.nimbus.vpn.data.AppSettings
import com.nimbus.vpn.data.ConfigParser
import com.nimbus.vpn.data.VpnProfile
import com.nimbus.vpn.tunnel.ConnectionStatus
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.UUID

class AppViewModel(application: Application) : AndroidViewModel(application) {
    private val app = application as NimbusApp
    val tunnel = app.container.tunnel.ui
    val root = app.container.tunnel.rootStatus
    val profiles = app.container.profiles.index
    val settings: StateFlow<AppSettings> = app.container.settings.settings.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5_000),
        AppSettings(),
    )

    fun setUiVisible(visible: Boolean) = app.container.tunnel.setUiVisible(visible)

    fun prepareVpn(): Intent? = app.container.tunnel.prepareVpnIntent()

    fun batteryIntent(): Intent? = app.container.tunnel.requestBatteryExemption()

    fun toggle() = viewModelScope.launch { app.container.tunnel.toggle() }

    fun connect() = viewModelScope.launch { app.container.tunnel.connectActive() }

    fun disconnect() = viewModelScope.launch { app.container.tunnel.disconnect() }

    fun selectProfile(id: String) {
        val running = tunnel.value.status == ConnectionStatus.CONNECTED ||
            tunnel.value.status == ConnectionStatus.CONNECTING
        app.container.profiles.setActive(id)
        if (running) {
            viewModelScope.launch {
                app.container.tunnel.disconnect()
                app.container.tunnel.connectActive()
            }
        }
    }

    fun deleteProfile(id: String) {
        val wasActive = app.container.profiles.active?.id == id
        val connected = tunnel.value.status == ConnectionStatus.CONNECTED ||
            tunnel.value.status == ConnectionStatus.CONNECTING
        app.container.profiles.delete(id)
        if (wasActive && connected) disconnect()
    }

    fun importText(name: String, raw: String): Result<VpnProfile> {
        val prepared = ConfigParser.withKeepaliveIfMissing(raw)
        val preview = ConfigParser.parse(prepared)
        if (!preview.canConnect) {
            return Result.failure(IllegalArgumentException(preview.issues.joinToString("\n")))
        }
        val profile = VpnProfile(
            id = UUID.randomUUID().toString(),
            name = name.ifBlank { ConfigParser.suggestName(prepared) },
            rawConfig = prepared,
        )
        app.container.profiles.upsert(profile, makeActive = true)
        return Result.success(profile)
    }

    suspend fun importUri(uri: Uri, fallbackName: String): Result<VpnProfile> = withContext(Dispatchers.IO) {
        runCatching {
            val text = app.contentResolver.openInputStream(uri)?.bufferedReader()?.use { it.readText() }
                ?: error("Не удалось прочитать файл")
            val name = fallbackName.substringBeforeLast('.').ifBlank { ConfigParser.suggestName(text) }
            importText(name, text).getOrThrow()
        }
    }

    fun importUriFromIntent(uri: Uri) {
        viewModelScope.launch { importUri(uri, uri.lastPathSegment ?: "imported") }
    }

    fun setAutoConnect(value: Boolean) = viewModelScope.launch { app.container.settings.setAutoConnect(value) }
    fun setKillSwitch(value: Boolean) = viewModelScope.launch { app.container.settings.setKillSwitch(value) }
    fun setRootBattery(value: Boolean) = viewModelScope.launch { app.container.settings.setRootBatteryGuard(value) }
}
