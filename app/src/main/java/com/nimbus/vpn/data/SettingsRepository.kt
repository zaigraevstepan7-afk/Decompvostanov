package com.nimbus.vpn.data

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.floatPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.longPreferencesKey
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
            accessLink = (prefs[ACCESS_LINK] ?: 1).coerceIn(1, 2),
            coachStep = prefs[COACH_STEP] ?: 0,
            streak = prefs[STREAK] ?: 0,
            streakDay = prefs[STREAK_DAY] ?: 0L,
            dogX = prefs[DOG_X] ?: -1f,
            dogY = prefs[DOG_Y] ?: -1f,
            heardAccess = prefs[HEARD_ACCESS] ?: false,
        )
    }

    suspend fun setAutoConnect(value: Boolean) = set(AUTO_CONNECT, value)
    suspend fun setKillSwitch(value: Boolean) = set(KILL_SWITCH, value)
    suspend fun setRootBatteryGuard(value: Boolean) = set(ROOT_BATTERY, value)
    suspend fun setPreferRoot(value: Boolean) = set(PREFER_ROOT, value)
    suspend fun setAccessLink(value: Int) {
        context.settingsStore.edit { it[ACCESS_LINK] = value.coerceIn(1, 2) }
    }

    suspend fun setCoachStep(step: Int) {
        context.settingsStore.edit { it[COACH_STEP] = step }
    }

    suspend fun setStreak(count: Int, day: Long) {
        context.settingsStore.edit {
            it[STREAK] = count
            it[STREAK_DAY] = day
        }
    }

    suspend fun setHeardAccess(value: Boolean) = set(HEARD_ACCESS, value)

    suspend fun setDogAnchor(x: Float, y: Float) {
        context.settingsStore.edit {
            it[DOG_X] = x
            it[DOG_Y] = y
        }
    }

    private suspend fun set(key: androidx.datastore.preferences.core.Preferences.Key<Boolean>, value: Boolean) {
        context.settingsStore.edit { it[key] = value }
    }

    private companion object {
        val AUTO_CONNECT = booleanPreferencesKey("auto_connect")
        val KILL_SWITCH = booleanPreferencesKey("kill_switch")
        val ROOT_BATTERY = booleanPreferencesKey("root_battery")
        val PREFER_ROOT = booleanPreferencesKey("prefer_root")
        val ACCESS_LINK = intPreferencesKey("access_link")
        val COACH_STEP = intPreferencesKey("coach_step")
        val STREAK = intPreferencesKey("streak")
        val STREAK_DAY = longPreferencesKey("streak_day")
        val DOG_X = floatPreferencesKey("dog_x")
        val DOG_Y = floatPreferencesKey("dog_y")
        val HEARD_ACCESS = booleanPreferencesKey("heard_access")
    }
}

data class AppSettings(
    val autoConnect: Boolean = false,
    val killSwitch: Boolean = true,
    val rootBatteryGuard: Boolean = true,
    val preferRoot: Boolean = true,
    val accessLink: Int = 1,
    val coachStep: Int = 0,
    val streak: Int = 0,
    val streakDay: Long = 0L,
    val dogX: Float = -1f,
    val dogY: Float = -1f,
    val heardAccess: Boolean = false,
)
