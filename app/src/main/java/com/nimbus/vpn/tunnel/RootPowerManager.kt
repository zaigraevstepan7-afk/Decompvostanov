package com.nimbus.vpn.tunnel

import android.os.Build
import android.util.Log
import org.amnezia.awg.util.RootShell
import java.io.File

/**
 * Uses root to keep Bozya VPN alive without fighting OEM battery killers,
 * while avoiding global "performance mode" that would drain the phone.
 */
class RootPowerManager(private val shell: RootShell) {
    data class Status(
        val rooted: Boolean,
        val kernelAmnezia: Boolean,
        val kernelWireGuard: Boolean,
        val whitelisted: Boolean,
        val message: String,
    )

    fun probe(): Status {
        val rooted = runCatching {
            shell.start()
            true
        }.getOrElse {
            Log.w(TAG, "No root", it)
            return Status(
                rooted = false,
                kernelAmnezia = File("/sys/module/amneziawg").exists(),
                kernelWireGuard = File("/sys/module/wireguard").exists(),
                whitelisted = false,
                message = "Root недоступен — работаем через VpnService",
            )
        }
        val kernelAmnezia = File("/sys/module/amneziawg").exists()
        val kernelWireGuard = File("/sys/module/wireguard").exists()
        return Status(
            rooted = rooted,
            kernelAmnezia = kernelAmnezia,
            kernelWireGuard = kernelWireGuard,
            whitelisted = false,
            message = when {
                kernelAmnezia -> "Root + ядро AmneziaWG"
                kernelWireGuard -> "Root есть, но ядро без AmneziaWG — используем userspace"
                else -> "Root есть — userspace AmneziaWG + whitelist батареи"
            },
        )
    }

    fun applyLowDrainKeepAlive(packageName: String, uid: Int, enableAlwaysOn: Boolean, lockdown: Boolean): Boolean {
        val commands = buildList {
            add("dumpsys deviceidle whitelist +$packageName")
            add("cmd deviceidle whitelist +$packageName")
            add("cmd appops set $packageName RUN_IN_BACKGROUND allow")
            add("cmd appops set $packageName RUN_ANY_IN_BACKGROUND allow")
            add("cmd appops set $packageName START_FOREGROUND allow")
            add("cmd appops set $packageName RUN_IN_BACKGROUND allow")
            add("cmd netpolicy add restrict-background-whitelist $uid")
            add("cmd appops set $packageName WAKE_LOCK allow")
            // Do not disable device idle globally — that would burn battery.
            if (enableAlwaysOn) {
                add("settings put global always_on_vpn_app $packageName")
                add("settings put global always_on_vpn_lockdown ${if (lockdown) 1 else 0}")
            }
            if (Build.MANUFACTURER.equals("xiaomi", true) ||
                Build.MANUFACTURER.equals("redmi", true) ||
                Build.BRAND.equals("poco", true)
            ) {
                add("settings put secure battery_saver_constants null")
            }
        }
        var ok = true
        commands.forEach { cmd ->
            val code = runCatching { shell.run(null, cmd) }.getOrElse {
                Log.w(TAG, "Root cmd failed: $cmd", it)
                -1
            }
            if (code != 0) {
                Log.i(TAG, "cmd `$cmd` exited $code")
                // Some OEM builds lack netpolicy / deviceidle sys-whitelist — not fatal.
            }
        }
        return ok
    }

    fun clearAlwaysOn() {
        runCatching { shell.run(null, "settings put global always_on_vpn_app none") }
        runCatching { shell.run(null, "settings put global always_on_vpn_lockdown 0") }
    }

    companion object {
        private const val TAG = "Bozya/RootPower"
    }
}
