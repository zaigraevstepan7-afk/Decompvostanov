package com.nimbus.vpn.data

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.serialization.json.Json

class ProfileStore(context: Context) {
    private val json = Json {
        ignoreUnknownKeys = true
        encodeDefaults = true
    }

    private val prefs: SharedPreferences = createPrefs(context)

    private val _index = MutableStateFlow(load())
    val index: StateFlow<ProfileIndex> = _index.asStateFlow()

    init {
        dropSec()
        ensureAuto()
    }

    val profiles: List<VpnProfile>
        get() = synchronized(this) { _index.value.profiles }

    val active: VpnProfile?
        get() = synchronized(this) {
            _index.value.let { idx ->
                idx.profiles.firstOrNull { it.id == idx.activeId } ?: idx.profiles.firstOrNull()
            }
        }

    fun upsert(profile: VpnProfile, makeActive: Boolean = true) = synchronized(this) {
        if (SecTunnelProfile.isSec(profile.rawConfig)) return
        val current = _index.value
        val existing = current.profiles.indexOfFirst { it.id == profile.id }
        val nextProfiles = current.profiles.toMutableList()
        if (existing >= 0) nextProfiles[existing] = profile else nextProfiles.add(0, profile)
        persist(
            ProfileIndex(
                profiles = nextProfiles,
                activeId = if (makeActive) profile.id else current.activeId ?: profile.id,
            ),
        )
    }

    fun delete(id: String) = synchronized(this) {
        if (id == WarpAutoProfile.ID) return
        val current = _index.value
        val next = current.profiles.filterNot { it.id == id }
        persist(
            ProfileIndex(
                profiles = next,
                activeId = when {
                    current.activeId != id -> current.activeId
                    else -> next.firstOrNull()?.id
                },
            ),
        )
    }

    fun setActive(id: String) = synchronized(this) {
        if (_index.value.profiles.none { it.id == id }) return
        persist(_index.value.copy(activeId = id))
    }

    fun upsertAll(incoming: List<VpnProfile>, activeId: String? = incoming.firstOrNull()?.id) = synchronized(this) {
        val clean = incoming.filterNot {
            SecTunnelProfile.isSec(it.rawConfig) || it.id == WarpAutoProfile.ID
        }
        if (clean.isEmpty()) return
        val current = _index.value
        val incomingIds = clean.map { it.id }.toSet()
        val kept = current.profiles.filterNot { it.id in incomingIds }
        persist(
            ProfileIndex(
                profiles = clean + kept,
                activeId = activeId?.takeIf { id -> clean.any { it.id == id } || kept.any { it.id == id } }
                    ?: current.activeId
                    ?: clean.first().id,
            ),
        )
    }

    private fun ensureAuto() = synchronized(this) {
        val pinned = pinAuto(_index.value)
        if (pinned != _index.value) persist(pinned)
    }

    private fun pinAuto(index: ProfileIndex): ProfileIndex {
        val rest = index.profiles.filterNot { it.id == WarpAutoProfile.ID }
        val kept = index.profiles.firstOrNull { it.id == WarpAutoProfile.ID && WarpAutoProfile.isAuto(it.rawConfig) }
        val auto = kept ?: WarpAutoProfile.create()
        return index.copy(
            profiles = listOf(auto) + rest,
            activeId = index.activeId ?: auto.id,
        )
    }

    private fun dropSec() = synchronized(this) {
        val current = _index.value
        val kept = current.profiles.filterNot { SecTunnelProfile.isSec(it.rawConfig) }
        if (kept.size == current.profiles.size) return
        persist(
            ProfileIndex(
                profiles = kept,
                activeId = kept.firstOrNull { it.id == current.activeId }?.id ?: kept.firstOrNull()?.id,
            ),
        )
    }

    private fun load(): ProfileIndex {
        val raw = runCatching { prefs.getString(KEY, null) }.getOrNull() ?: return ProfileIndex()
        return runCatching { json.decodeFromString(ProfileIndex.serializer(), raw) }
            .getOrElse { ProfileIndex() }
    }

    private fun persist(index: ProfileIndex) {
        val pinned = pinAuto(index)
        runCatching {
            prefs.edit().putString(KEY, json.encodeToString(ProfileIndex.serializer(), pinned)).apply()
        }.onFailure { Log.e(TAG, "Failed to persist profiles", it) }
        _index.value = pinned
    }

    companion object {
        private const val KEY = "index"
        private const val PREFS = "nimbus_profiles"
        private const val TAG = "Bozya/Profiles"

        private fun createPrefs(context: Context): SharedPreferences {
            fun encrypted(): SharedPreferences {
                val master = MasterKey.Builder(context)
                    .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
                    .build()
                return EncryptedSharedPreferences.create(
                    context,
                    PREFS,
                    master,
                    EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
                    EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM,
                )
            }
            return try {
                encrypted()
            } catch (first: Throwable) {
                Log.w(TAG, "Encrypted prefs failed, resetting", first)
                runCatching { context.deleteSharedPreferences(PREFS) }
                try {
                    encrypted()
                } catch (second: Throwable) {
                    Log.e(TAG, "Falling back to plain prefs", second)
                    context.getSharedPreferences("${PREFS}_plain", Context.MODE_PRIVATE)
                }
            }
        }
    }
}
