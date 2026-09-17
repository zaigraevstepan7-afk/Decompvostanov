package com.antigravity.mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.antigravity.mobile.ui.AntigravityAppUi
import com.antigravity.mobile.ui.AntigravityTheme

class MainActivity : ComponentActivity() {
    private val viewModel: AntigravityViewModel by viewModels {
        AntigravityViewModel.factory(application)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        viewModel.refreshRoot()
        setContent {
            val state by viewModel.state.collectAsState()
            AntigravityTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    AntigravityAppUi(
                        state = state,
                        onLogin = { viewModel.loginWithGoogle(this) },
                        onLogout = viewModel::logout,
                        onSend = viewModel::send,
                        onModel = viewModel::setModel,
                        onWorkspace = viewModel::setWorkspace,
                        onRetryRoot = viewModel::refreshRoot,
                    )
                }
            }
        }
    }
}
