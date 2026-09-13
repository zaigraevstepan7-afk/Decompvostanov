package com.nimbus.vpn.data

import android.content.Context
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

    private val prefs = EncryptedSharedPreferences.create(
        context,
        "nimbus_profiles",
        MasterKey.Builder(context)
            .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
            .build(),
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM,
    )

    private val _index = MutableStateFlow(load())
    val index: StateFlow<ProfileIndex> = _index.asStateFlow()

    val profiles: List<VpnProfile>
        get() = _index.value.profiles

    val active: VpnProfile?
        get() = _index.value.let { idx ->
            idx.profiles.firstOrNull { it.id == idx.activeId } ?: idx.profiles.firstOrNull()
        }

    fun upsert(profile: VpnProfile, makeActive: Boolean = true) {
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

    fun delete(id: String) {
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

    fun setActive(id: String) {
        if (_index.value.profiles.none { it.id == id }) return
        persist(_index.value.copy(activeId = id))
    }

    private fun load(): ProfileIndex {
        val raw = prefs.getString(KEY, null) ?: return ProfileIndex()
        return runCatching { json.decodeFromString(ProfileIndex.serializer(), raw) }
            .getOrElse { ProfileIndex() }
    }

    private fun persist(index: ProfileIndex) {
        prefs.edit().putString(KEY, json.encodeToString(ProfileIndex.serializer(), index)).apply()
        _index.value = index
    }

    companion object {
        private const val KEY = "index"
    }
}
