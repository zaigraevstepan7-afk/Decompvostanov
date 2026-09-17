package com.antigravity.mobile.auth

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.webkit.CookieManager
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import com.antigravity.core.auth.OAuthCallbackServer
import com.antigravity.core.auth.isLoopbackRedirect
import com.antigravity.core.auth.parseOAuthRedirect
import java.io.ByteArrayInputStream
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicBoolean

class GoogleLoginActivity : ComponentActivity() {
    private val finished = AtomicBoolean(false)
    private var serverExecutor = Executors.newSingleThreadExecutor()

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val authUrl = intent.getStringExtra(EXTRA_AUTH_URL).orEmpty()
        val expectedState = intent.getStringExtra(EXTRA_STATE).orEmpty()
        if (authUrl.isBlank() || expectedState.isBlank()) {
            fail("Нет URL входа")
            return
        }

        serverExecutor.execute {
            runCatching {
                val callback = OAuthCallbackServer().awaitCode(expectedState, timeoutMs = 180_000)
                succeed(callback.code)
            }
        }

        val web = WebView(this)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(web, true)
        web.settings.apply {
            javaScriptEnabled = true
            domStorageEnabled = true
            databaseEnabled = true
            mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
            userAgentString = CHROME_UA
        }
        web.webChromeClient = WebChromeClient()
        web.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
                return handleUrl(request.url.toString(), expectedState)
            }

            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                return handleUrl(url, expectedState)
            }

            override fun onPageStarted(view: WebView, url: String, favicon: Bitmap?) {
                handleUrl(url, expectedState)
            }

            override fun shouldInterceptRequest(view: WebView, request: WebResourceRequest): WebResourceResponse? {
                val url = request.url.toString()
                if (isLoopbackRedirect(url)) {
                    view.post { handleUrl(url, expectedState) }
                    return WebResourceResponse(
                        "text/html",
                        "utf-8",
                        ByteArrayInputStream("<html><body>OK</body></html>".toByteArray()),
                    )
                }
                return super.shouldInterceptRequest(view, request)
            }
        }
        setContentView(web)
        web.loadUrl(authUrl)
    }

    private fun handleUrl(url: String, expectedState: String): Boolean {
        val callback = parseOAuthRedirect(url, expectedState) ?: return false
        succeed(callback.code)
        return true
    }

    private fun succeed(code: String) {
        if (!finished.compareAndSet(false, true)) return
        setResult(RESULT_OK, Intent().putExtra(EXTRA_CODE, code))
        finish()
    }

    private fun fail(message: String) {
        if (!finished.compareAndSet(false, true)) return
        setResult(RESULT_CANCELED, Intent().putExtra(EXTRA_ERROR, message))
        finish()
    }

    override fun onDestroy() {
        serverExecutor.shutdownNow()
        super.onDestroy()
    }

    companion object {
        const val EXTRA_AUTH_URL = "auth_url"
        const val EXTRA_STATE = "state"
        const val EXTRA_CODE = "code"
        const val EXTRA_ERROR = "error"
        private const val CHROME_UA =
            "Mozilla/5.0 (Linux; Android 14; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36"

        fun intent(context: Context, authUrl: String, state: String): Intent {
            return Intent(context, GoogleLoginActivity::class.java)
                .putExtra(EXTRA_AUTH_URL, authUrl)
                .putExtra(EXTRA_STATE, state)
        }
    }
}
