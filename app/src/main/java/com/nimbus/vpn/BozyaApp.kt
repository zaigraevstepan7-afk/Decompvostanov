package com.nimbus.vpn

import android.app.Application
import com.nimbus.vpn.data.ProfileStore
import com.nimbus.vpn.data.SettingsRepository
import com.nimbus.vpn.tunnel.TunnelController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import org.amnezia.awg.backend.AbstractBackend

class BozyaApp : Application() {
    lateinit var container: AppContainer
        private set

    private val appScope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    override fun onCreate() {
        super.onCreate()
        instance = this
        container = AppContainer(this)
        AbstractBackend.setAlwaysOnCallback {
            appScope.launch {
                runCatching {
                    if (container.settings.settings.first().autoConnect) {
                        container.tunnel.connectActive()
                    }
                }
            }
        }
    }

    companion object {
        lateinit var instance: BozyaApp
            private set
    }
}

class AppContainer(app: BozyaApp) {
    val profiles = ProfileStore(app)
    val settings = SettingsRepository(app)
    val tunnel = TunnelController(app, profiles, settings)
}
