package com.nimbus.vpn

import android.Manifest
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.compose.LifecycleEventEffect
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nimbus.vpn.ui.AppViewModel
import com.nimbus.vpn.ui.home.HomeScreen
import com.nimbus.vpn.ui.importcfg.ImportScreen
import com.nimbus.vpn.ui.profiles.ProfilesScreen
import com.nimbus.vpn.ui.settings.SettingsScreen
import com.nimbus.vpn.ui.theme.NimbusTheme
import com.nimbus.vpn.ui.warp.WarpCreateScreen

class MainActivity : ComponentActivity() {
    private val viewModel: AppViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                android.graphics.Color.TRANSPARENT,
                android.graphics.Color.TRANSPARENT,
            ),
            navigationBarStyle = SystemBarStyle.light(
                android.graphics.Color.TRANSPARENT,
                android.graphics.Color.TRANSPARENT,
            ),
        )
        setContent {
            NimbusTheme {
                val nav = rememberNavController()
                val tunnel by viewModel.tunnel.collectAsStateWithLifecycle()
                val root by viewModel.root.collectAsStateWithLifecycle()
                val profiles by viewModel.profiles.collectAsStateWithLifecycle()
                val settings by viewModel.settings.collectAsStateWithLifecycle()
                val warp by viewModel.warp.collectAsStateWithLifecycle()
                val lifecycleState by androidx.lifecycle.compose.LocalLifecycleOwner.current.lifecycle.currentStateFlow.collectAsStateWithLifecycle()
                val animate = lifecycleState.isAtLeast(Lifecycle.State.STARTED)

                var pendingConnect by remember { mutableStateOf(false) }
                val vpnPermission = rememberLauncherForActivityResult(
                    ActivityResultContracts.StartActivityForResult(),
                ) { result ->
                    if (result.resultCode == RESULT_OK && pendingConnect) {
                        pendingConnect = false
                        viewModel.connect()
                    } else {
                        pendingConnect = false
                    }
                }
                val notifications = rememberLauncherForActivityResult(
                    ActivityResultContracts.RequestPermission(),
                ) {}
                val battery = rememberLauncherForActivityResult(
                    ActivityResultContracts.StartActivityForResult(),
                ) {}

                LaunchedEffect(Unit) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        notifications.launch(Manifest.permission.POST_NOTIFICATIONS)
                    }
                    handleIncoming(intent)
                }

                LifecycleEventEffect(Lifecycle.Event.ON_RESUME) { viewModel.setUiVisible(true) }
                LifecycleEventEffect(Lifecycle.Event.ON_PAUSE) { viewModel.setUiVisible(false) }

                fun requestConnect() {
                    val prepare = viewModel.prepareVpn()
                    if (prepare != null) {
                        pendingConnect = true
                        vpnPermission.launch(prepare)
                    } else {
                        viewModel.toggle()
                    }
                }

                NavHost(
                    navController = nav,
                    startDestination = "home",
                    modifier = Modifier.fillMaxSize(),
                ) {
                    composable("home") {
                        HomeScreen(
                            state = tunnel,
                            profiles = profiles,
                            animate = animate,
                            onToggle = { requestConnect() },
                            onCreateWarp = { nav.navigate("warp") },
                            onImport = { nav.navigate("import") },
                            onSelect = viewModel::selectProfile,
                            onDelete = viewModel::deleteProfile,
                            onSettings = { nav.navigate("settings") },
                            onConfirmAccess = {
                                startActivity(
                                    Intent(
                                        Intent.ACTION_VIEW,
                                        android.net.Uri.parse("https://relay.tribukvy.ltd/activate/eda7da9c3c724702"),
                                    ),
                                )
                            },
                        )
                    }
                    composable("warp") {
                        WarpCreateScreen(
                            warp = warp,
                            onBack = { nav.popBackStack() },
                            onCreate = viewModel::createWarp,
                            onImport = { nav.navigate("import") },
                            onCreated = { nav.popBackStack("home", inclusive = false) },
                            onConsumed = viewModel::consumeWarpCreated,
                        )
                    }
                    composable("import") {
                        ImportScreen(
                            onBack = { nav.popBackStack() },
                            onImportText = { name, raw -> viewModel.importText(name, raw) },
                            onImportUri = { uri, name -> viewModel.importUri(uri, name) },
                        )
                    }
                    composable("profiles") {
                        ProfilesScreen(
                            index = profiles,
                            onBack = { nav.popBackStack() },
                            onSelect = {
                                viewModel.selectProfile(it)
                                nav.popBackStack()
                            },
                            onDelete = viewModel::deleteProfile,
                            onImport = { nav.navigate("import") },
                        )
                    }
                    composable("settings") {
                        SettingsScreen(
                            settings = settings,
                            root = root,
                            onBack = { nav.popBackStack() },
                            onAutoConnect = viewModel::setAutoConnect,
                            onKillSwitch = viewModel::setKillSwitch,
                            onRootBattery = viewModel::setRootBattery,
                            onBatteryExemption = {
                                viewModel.batteryIntent()?.let { battery.launch(it) }
                            },
                            onCreateWarp = { nav.navigate("warp") },
                        )
                    }
                }
            }
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        handleIncoming(intent)
    }

    private fun handleIncoming(intent: Intent?) {
        val uri = intent?.data ?: return
        if (intent.action != Intent.ACTION_VIEW) return
        viewModel.importUriFromIntent(uri)
    }
}
