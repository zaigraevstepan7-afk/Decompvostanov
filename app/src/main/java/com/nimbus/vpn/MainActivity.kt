package com.nimbus.vpn

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
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
import com.nimbus.vpn.ui.settings.BypassAppsScreen
import com.nimbus.vpn.ui.settings.SettingsScreen
import com.nimbus.vpn.ui.theme.BozyaTheme
import com.nimbus.vpn.ui.theme.Motion
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
            BozyaTheme {
                val nav = rememberNavController()
                val tunnel by viewModel.tunnel.collectAsStateWithLifecycle()
                val root by viewModel.root.collectAsStateWithLifecycle()
                val profiles by viewModel.profiles.collectAsStateWithLifecycle()
                val settings by viewModel.settings.collectAsStateWithLifecycle()
                val warp by viewModel.warp.collectAsStateWithLifecycle()
                val access by viewModel.access.collectAsStateWithLifecycle()
                val ping by viewModel.ping.collectAsStateWithLifecycle()
                val joy by viewModel.joy.collectAsStateWithLifecycle()
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
                    if (Build.VERSION.SDK_INT >= 33 &&
                        checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED
                    ) {
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

                fun go(route: String) {
                    nav.navigate(route) {
                        launchSingleTop = true
                    }
                }

                NavHost(
                    navController = nav,
                    startDestination = "home",
                    modifier = Modifier.fillMaxSize(),
                    enterTransition = {
                        fadeIn(Motion.fade(460)) + slideInHorizontally(Motion.offset(520)) { it / 12 }
                    },
                    exitTransition = {
                        fadeOut(Motion.fade(300)) + slideOutHorizontally(Motion.offset(380)) { -it / 18 }
                    },
                    popEnterTransition = {
                        fadeIn(Motion.fade(420)) + slideInHorizontally(Motion.offset(480)) { -it / 12 }
                    },
                    popExitTransition = {
                        fadeOut(Motion.fade(280)) + slideOutHorizontally(Motion.offset(380)) { it / 14 }
                    },
                ) {
                    composable("home") {
                        HomeScreen(
                            state = tunnel,
                            profiles = profiles,
                            access = access,
                            animate = animate,
                            onToggle = { requestConnect() },
                            onCreateWarp = { go("warp") },
                            onImport = { go("import") },
                            onSelect = viewModel::selectProfile,
                            onDelete = viewModel::deleteProfile,
                            onSettings = {
                                viewModel.onEnterSettings()
                                go("settings")
                            },
                            onConfirmAccess = viewModel::activateAccess,
                            ping = ping,
                            onPing = viewModel::pingServers,
                            settings = settings,
                            joyPulse = joy,
                            onCoachYes = { viewModel.coachYes() },
                            onCoachAbout = {
                                viewModel.onCoachAboutNext(
                                    hasProfiles = profiles.profiles.isNotEmpty(),
                                    connected = tunnel.status == com.nimbus.vpn.tunnel.ConnectionStatus.CONNECTED,
                                )
                            },
                            onCoachAdd = viewModel::onCoachAddTapped,
                            onCoachReady = viewModel::onCoachWarpCreated,
                            onCoachCelebrateNext = viewModel::onCoachCelebrateNext,
                            onMoveDog = viewModel::moveDog,
                        )
                    }
                    composable("warp") {
                        WarpCreateScreen(
                            warp = warp,
                            onBack = { nav.popBackStack() },
                            onCreate = viewModel::createServer,
                            onImport = { go("import") },
                            onCreated = {
                                viewModel.onCoachWarpCreated()
                                nav.popBackStack("home", inclusive = false)
                            },
                            onConsumed = viewModel::consumeWarpCreated,
                            guide = com.nimbus.vpn.ui.coach.CoachStep.from(settings.coachStep) ==
                                com.nimbus.vpn.ui.coach.CoachStep.PICK,
                            dogX = settings.dogX,
                            dogY = settings.dogY,
                            onMoveDog = viewModel::moveDog,
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
                            onImport = { go("import") },
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
                            onCreateWarp = { go("warp") },
                            onAccessLink = viewModel::setAccessLink,
                            onCoachNext = {
                                viewModel.onCoachTourNext(
                                    com.nimbus.vpn.ui.coach.CoachStep.from(settings.coachStep),
                                )
                            },
                            onCoachOpened = viewModel::onEnterSettings,
                            onMoveDog = viewModel::moveDog,
                            onBypass = { go("bypass") },
                        )
                    }
                    composable("bypass") {
                        BypassAppsScreen(
                            selected = settings.bypassPackages,
                            tunnelUp = tunnel.status == com.nimbus.vpn.tunnel.ConnectionStatus.CONNECTED ||
                                tunnel.status == com.nimbus.vpn.tunnel.ConnectionStatus.CONNECTING,
                            onBack = { nav.popBackStack() },
                            onChange = viewModel::setBypassPackages,
                            onReconnect = viewModel::reconnectForBypass,
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
