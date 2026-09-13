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
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
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
import com.nimbus.vpn.ui.theme.BozyaTheme
import com.nimbus.vpn.ui.warp.WarpCreateScreen

class MainActivity : ComponentActivity() {
    private val viewModel: AppViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(
                android.graphics.Color.TRANSPARENT,
            ),
            navigationBarStyle = SystemBarStyle.dark(
                android.graphics.Color.TRANSPARENT,
            ),
        )
        setContent {
            BozyaTheme {
                val nav = rememberNavController()
                val tunnel by viewModel.tunnel.collectAsStateWithLifecycle()
                val root by viewModel.root.collectAsStateWithLifecycle()
                val profiles by viewModel.profiles.collectAsStateWithLifecycle()
                val settings by viewModel.settings.collectAsStateWithLifecycle()
                val warp by viewModel.warp.collectAsStateWithLifecycle()
                val access by viewModel.access.collectAsStateWithLifecycle()
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
                    enterTransition = {
                        fadeIn(tween(380)) + slideInHorizontally(tween(420)) { it / 5 }
                    },
                    exitTransition = {
                        fadeOut(tween(220)) + slideOutHorizontally(tween(320)) { -it / 8 }
                    },
                    popEnterTransition = {
                        fadeIn(tween(320)) + slideInHorizontally(tween(360)) { -it / 8 }
                    },
                    popExitTransition = {
                        fadeOut(tween(220)) + slideOutHorizontally(tween(320)) { it / 5 }
                    },
                ) {
                    composable("home") {
                        HomeScreen(
                            state = tunnel,
                            profiles = profiles,
                            access = access,
                            animate = animate,
                            onToggle = { requestConnect() },
                            onCreateWarp = { nav.navigate("warp") },
                            onImport = { nav.navigate("import") },
                            onSelect = viewModel::selectProfile,
                            onDelete = viewModel::deleteProfile,
                            onSettings = { nav.navigate("settings") },
                            onConfirmAccess = viewModel::activateAccess,
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
