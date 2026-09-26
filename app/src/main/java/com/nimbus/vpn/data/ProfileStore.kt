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
        dropRemoved()
        restoreCountryHosts()
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
        if (isRemoved(profile)) return
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

    fun whitelistSource(): String = synchronized(this) {
        runCatching { prefs.getString(SOURCE, "").orEmpty() }.getOrDefault("")
    }

    fun rememberWhitelistSource(url: String) = synchronized(this) {
        runCatching { prefs.edit().putString(SOURCE, url).apply() }
    }

    fun replaceWhitelist(incoming: List<VpnProfile>) = synchronized(this) {
        val clean = incoming.filter { WhitelistProfile.isOne(it.rawConfig) && !isRemoved(it) }
        if (clean.isEmpty()) return
        val current = _index.value
        val kept = current.profiles.filterNot { profile ->
            WhitelistProfile.isOne(profile.rawConfig) || profile.id.startsWith("bs:")
        }
        val next = kept + clean
        persist(
            ProfileIndex(
                profiles = next,
                activeId = when {
                    next.any { it.id == current.activeId } -> current.activeId
                    else -> kept.firstOrNull()?.id ?: clean.first().id
                },
            ),
        )
    }

    fun upsertAll(incoming: List<VpnProfile>, activeId: String? = incoming.firstOrNull()?.id) = synchronized(this) {
        val clean = incoming.filterNot { isRemoved(it) }
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

    private fun restoreCountryHosts() = synchronized(this) {
        val current = _index.value
        val fixed = current.profiles.map { profile ->
            val raw = WarpConfigBuilder.restoreCountryHost(profile.id, profile.rawConfig)
            if (raw == profile.rawConfig) profile else profile.copy(rawConfig = raw)
        }
        if (fixed == current.profiles) return
        persist(
            ProfileIndex(
                profiles = fixed,
                activeId = current.activeId,
            ),
        )
    }

    private fun dropRemoved() = synchronized(this) {
        val current = _index.value
        val kept = current.profiles.filterNot { isRemoved(it) }
        if (kept.size == current.profiles.size) return
        persist(
            ProfileIndex(
                profiles = kept,
                activeId = kept.firstOrNull { it.id == current.activeId }?.id ?: kept.firstOrNull()?.id,
            ),
        )
    }

    private fun isRemoved(profile: VpnProfile): Boolean {
        if (profile.id == "warp:auto") return true
        if (SecTunnelProfile.isSec(profile.rawConfig)) return true
        return profile.rawConfig.contains("Engine = warp-auto")
    }

    private fun load(): ProfileIndex {
        val raw = runCatching { prefs.getString(KEY, null) }.getOrNull() ?: return ProfileIndex()
        return runCatching { json.decodeFromString(ProfileIndex.serializer(), raw) }
            .getOrElse { ProfileIndex() }
    }

    private fun persist(index: ProfileIndex) {
        runCatching {
            prefs.edit().putString(KEY, json.encodeToString(ProfileIndex.serializer(), index)).apply()
        }.onFailure { Log.e(TAG, "Failed to persist profiles", it) }
        _index.value = index
    }

    companion object {
        private const val KEY = "index"
        private const val SOURCE = "whitelist_source"
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
