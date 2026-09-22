package com.antigravity.mobile

import android.Manifest
import android.app.Activity
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.antigravity.mobile.auth.GoogleLoginActivity
import com.antigravity.mobile.ui.DeepSeekApp
import com.deepseek.chat.ui.theme.DeepSeekTheme
import com.deepseek.chat.ui.theme.DarkBackground

class MainActivity : ComponentActivity() {
    private val viewModel: AntigravityViewModel by viewModels {
        AntigravityViewModel.factory(application)
    }

    private val googleLogin = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult(),
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val code = result.data?.getStringExtra(GoogleLoginActivity.EXTRA_CODE)
            if (!code.isNullOrBlank()) {
                viewModel.finishGoogleLogin(code)
                return@registerForActivityResult
            }
        }
        val error = result.data?.getStringExtra(GoogleLoginActivity.EXTRA_ERROR)
            ?: if (result.resultCode == Activity.RESULT_CANCELED) "Вход отменён" else "Не удалось получить код Google"
        viewModel.cancelGoogleLogin(error)
    }

    private val pickFiles = registerForActivityResult(
        ActivityResultContracts.OpenMultipleDocuments(),
    ) { uris ->
        if (uris.isNotEmpty()) viewModel.addAttachments(uris)
    }

    private val notifyPermission = registerForActivityResult(
        ActivityResultContracts.RequestPermission(),
    ) { }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        if (Build.VERSION.SDK_INT >= 33) {
            notifyPermission.launch(Manifest.permission.POST_NOTIFICATIONS)
        }
        viewModel.refreshRoot()
        setContent {
            val state by viewModel.state.collectAsState()
            DeepSeekTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = DarkBackground) {
                    DeepSeekApp(
                        state = state,
                        onLogin = {
                            val request = viewModel.createGoogleLogin()
                            if (request != null) {
                                googleLogin.launch(
                                    GoogleLoginActivity.intent(this, request.url, request.state),
                                )
                            }
                        },
                        onLogout = viewModel::logout,
                        onSend = viewModel::send,
                        onWorkspace = viewModel::setWorkspace,
                        onRetryRoot = viewModel::refreshRoot,
                        onAttach = { pickFiles.launch(arrayOf("*/*")) },
                        onNewChat = viewModel::newChat,
                        onOpenChat = viewModel::openChat,
                        onDeleteChat = viewModel::deleteChat,
                        onStop = viewModel::stop,
                        onBrain = viewModel::setBrain,
                        onSearch = viewModel::setSearch,
                        onAgent = viewModel::setAgent,
                        onRegenerate = viewModel::regenerate,
                        onRemovePending = viewModel::removeAttachment,
                    )
                }
            }
        }
    }
}
