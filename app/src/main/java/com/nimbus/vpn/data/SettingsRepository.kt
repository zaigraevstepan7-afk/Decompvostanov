package com.nimbus.vpn.data

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.settingsStore by preferencesDataStore("nimbus_settings")

class SettingsRepository(private val context: Context) {
    val settings: Flow<AppSettings> = context.settingsStore.data.map { prefs ->
        AppSettings(
            autoConnect = prefs[AUTO_CONNECT] ?: false,
            killSwitch = prefs[KILL_SWITCH] ?: true,
            rootBatteryGuard = prefs[ROOT_BATTERY] ?: true,
            preferRoot = prefs[PREFER_ROOT] ?: true,
        )
    }

    suspend fun setAutoConnect(value: Boolean) = set(AUTO_CONNECT, value)
    suspend fun setKillSwitch(value: Boolean) = set(KILL_SWITCH, value)
    suspend fun setRootBatteryGuard(value: Boolean) = set(ROOT_BATTERY, value)
    suspend fun setPreferRoot(value: Boolean) = set(PREFER_ROOT, value)

    private suspend fun set(key: androidx.datastore.preferences.core.Preferences.Key<Boolean>, value: Boolean) {
        context.settingsStore.edit { it[key] = value }
    }

    private companion object {
        val AUTO_CONNECT = booleanPreferencesKey("auto_connect")
        val KILL_SWITCH = booleanPreferencesKey("kill_switch")
        val ROOT_BATTERY = booleanPreferencesKey("root_battery")
        val PREFER_ROOT = booleanPreferencesKey("prefer_root")
    }
}

data class AppSettings(
    val autoConnect: Boolean = false,
    val killSwitch: Boolean = true,
    val rootBatteryGuard: Boolean = true,
    val preferRoot: Boolean = true,
)
