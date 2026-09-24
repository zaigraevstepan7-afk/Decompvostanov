package com.personal.chatui

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.personal.chatui.data.AppViewModel
import com.personal.chatui.data.ThemeMode
import com.personal.chatui.ui.AboutPage
import com.personal.chatui.ui.AccentPage
import com.personal.chatui.ui.AdsPage
import com.personal.chatui.ui.AgePage
import com.personal.chatui.ui.AppearancePage
import com.personal.chatui.ui.BugPage
import com.personal.chatui.ui.ConnectPage
import com.personal.chatui.ui.DataPage
import com.personal.chatui.ui.EmailPage
import com.personal.chatui.ui.GeneralPage
import com.personal.chatui.ui.HomeScreen
import com.personal.chatui.ui.ImagesPage
import com.personal.chatui.ui.LibraryPage
import com.personal.chatui.ui.MemoryPage
import com.personal.chatui.ui.NotificationsPage
import com.personal.chatui.ui.ParentalPage
import com.personal.chatui.ui.PersonalizationPage
import com.personal.chatui.ui.PlanPage
import com.personal.chatui.ui.PluginsPage
import com.personal.chatui.ui.PrivacyPage
import com.personal.chatui.ui.ProjectsPage
import com.personal.chatui.ui.RemotePage
import com.personal.chatui.ui.Routes
import com.personal.chatui.ui.ScheduledPage
import com.personal.chatui.ui.SearchPage
import com.personal.chatui.ui.SecurityPage
import com.personal.chatui.ui.SettingsScreen
import com.personal.chatui.ui.SignedOut
import com.personal.chatui.ui.StoragePage
import com.personal.chatui.ui.UsagePage
import com.personal.chatui.ui.VoicePage
import com.personal.chatui.ui.WellbeingPage
import com.personal.chatui.ui.WorkspacePage
import com.personal.chatui.ui.theme.LocalPalette
import com.personal.chatui.ui.theme.darkPalette
import com.personal.chatui.ui.theme.lightPalette

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel: AppViewModel = viewModel()
            ChatApp(viewModel)
        }
    }
}

@Composable
private fun ChatApp(viewModel: AppViewModel) {
    val dark = when (viewModel.themeMode) {
        ThemeMode.Dark -> true
        ThemeMode.Light -> false
        ThemeMode.System -> isSystemInDarkTheme()
    }
    val palette = if (dark) darkPalette(viewModel.accent) else lightPalette(viewModel.accent)
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as ComponentActivity).window
            window.statusBarColor = Color.TRANSPARENT
            window.navigationBarColor = Color.TRANSPARENT
            window.decorView.setBackgroundColor(if (dark) Color.BLACK else Color.WHITE)
            WindowCompat.getInsetsController(window, view).apply {
                isAppearanceLightStatusBars = !dark
                isAppearanceLightNavigationBars = !dark
            }
        }
    }
    CompositionLocalProvider(LocalPalette provides palette) {
        Box(
            Modifier
                .fillMaxSize()
                .background(palette.bg),
        ) {
            if (!viewModel.signedIn) {
                SignedOut(onReturn = { viewModel.signedIn = true })
            } else {
                val nav = rememberNavController()
                AppNav(nav, viewModel)
            }
        }
    }
}

@Composable
private fun AppNav(nav: NavHostController, viewModel: AppViewModel) {
    NavHost(navController = nav, startDestination = Routes.Home) {
        composable(Routes.Home) {
            HomeScreen(viewModel) { route -> nav.navigate(route) }
        }
        composable(Routes.Settings) {
            SettingsScreen(viewModel, onBack = { nav.popBackStack() }, onOpen = { nav.navigate(it) })
        }
        composable(Routes.Connect) { ConnectPage(viewModel) { nav.popBackStack() } }
        composable(Routes.Images) { ImagesPage { nav.popBackStack() } }
        composable(Routes.Library) {
            LibraryPage(viewModel, onBack = { nav.popBackStack() }, onOpenChat = { id ->
                viewModel.currentChatId = id
                nav.popBackStack(Routes.Home, inclusive = false)
            })
        }
        composable(Routes.Projects) { ProjectsPage(viewModel) { nav.popBackStack() } }
        composable(Routes.Remote) { RemotePage(viewModel) { nav.popBackStack() } }
        composable(Routes.Scheduled) { ScheduledPage(viewModel) { nav.popBackStack() } }
        composable(Routes.Plugins) { PluginsPage { nav.popBackStack() } }
        composable(Routes.Search) {
            SearchPage(viewModel, onBack = { nav.popBackStack() }, onOpenChat = { id ->
                viewModel.currentChatId = id
                nav.popBackStack(Routes.Home, inclusive = false)
            })
        }
        composable(Routes.Personalization) { PersonalizationPage(viewModel) { nav.popBackStack() } }
        composable(Routes.Memory) { MemoryPage(viewModel) { nav.popBackStack() } }
        composable(Routes.Workspace) { WorkspacePage { nav.popBackStack() } }
        composable(Routes.Plan) { PlanPage { nav.popBackStack() } }
        composable(Routes.Usage) { UsagePage(viewModel) { nav.popBackStack() } }
        composable(Routes.Parental) { ParentalPage(viewModel) { nav.popBackStack() } }
        composable(Routes.Email) { EmailPage(viewModel) { nav.popBackStack() } }
        composable(Routes.Age) { AgePage(viewModel) { nav.popBackStack() } }
        composable(Routes.Appearance) { AppearancePage(viewModel) { nav.popBackStack() } }
        composable(Routes.Accent) { AccentPage(viewModel) { nav.popBackStack() } }
        composable(Routes.General) { GeneralPage(viewModel) { nav.popBackStack() } }
        composable(Routes.Notifications) { NotificationsPage(viewModel) { nav.popBackStack() } }
        composable(Routes.Voice) { VoicePage(viewModel) { nav.popBackStack() } }
        composable(Routes.Wellbeing) { WellbeingPage(viewModel) { nav.popBackStack() } }
        composable(Routes.Security) { SecurityPage { nav.popBackStack() } }
        composable(Routes.Storage) { StoragePage { nav.popBackStack() } }
        composable(Routes.Privacy) { PrivacyPage(viewModel) { nav.popBackStack() } }
        composable(Routes.Data) { DataPage(viewModel) { nav.popBackStack() } }
        composable(Routes.Ads) { AdsPage(viewModel) { nav.popBackStack() } }
        composable(Routes.Bug) { BugPage(viewModel) { nav.popBackStack() } }
        composable(Routes.About) { AboutPage { nav.popBackStack() } }
    }
}
