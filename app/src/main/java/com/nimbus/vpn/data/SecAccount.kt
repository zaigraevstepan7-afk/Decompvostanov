package com.nimbus.vpn.data

import android.content.Context
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class SecAccount(
    val email: String,
    val password: String,
    val deviceId: String,
    val devicePassword: String,
) {
    fun device(): SecDevice = SecDevice(deviceId, devicePassword)

    override fun toString(): String = "SecAccount"
}

data class SecLease(
    val exits: List<SecExit>,
    val account: SecAccount,
)

/**
 * SurfEasy subscriber and device, kept so the next connect skips registration.
 * The password never goes into logs or the VPN intent.
 */
class SecAccountStore(context: Context) {
    private val json = Json { ignoreUnknownKeys = true }
    private val prefs: SharedPreferences? = runCatching { encrypted(context) }.getOrNull()

    fun load(): SecAccount? {
        val raw = prefs?.getString(KEY, null) ?: return null
        return runCatching { json.decodeFromString(SecAccount.serializer(), raw) }.getOrNull()
    }

    fun save(account: SecAccount) {
        val store = prefs ?: return
        runCatching {
            store.edit().putString(KEY, json.encodeToString(SecAccount.serializer(), account)).apply()
        }
    }

    fun clear() {
        prefs?.edit()?.remove(KEY)?.apply()
    }

    fun lastIp(region: String): String? = prefs?.getString(ipKey(region), null)?.takeIf { it.isNotBlank() }

    fun rememberIp(region: String, ip: String) {
        if (region.isBlank() || ip.isBlank()) return
        prefs?.edit()?.putString(ipKey(region), ip)?.apply()
    }

    companion object {
        private const val KEY = "account"
        private const val PREFS = "nimbus_sec_account"

        private fun ipKey(region: String) = "ip-${region.trim().uppercase()}"

        private fun encrypted(context: Context): SharedPreferences {
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
    }
}
