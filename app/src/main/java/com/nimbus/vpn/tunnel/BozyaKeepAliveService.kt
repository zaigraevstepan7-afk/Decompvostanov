package com.nimbus.vpn.tunnel

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.pm.ServiceInfo
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import com.nimbus.vpn.BozyaApp
import com.nimbus.vpn.MainActivity
import com.nimbus.vpn.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class BozyaKeepAliveService : Service() {
    private val serviceScope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent?.action == ACTION_STOP) {
            val app = applicationContext as? BozyaApp
            serviceScope.launch {
                runCatching { app?.container?.tunnel?.disconnect() }
            }
            runCatching { stopForeground(STOP_FOREGROUND_REMOVE) }
            stopSelf()
            return START_NOT_STICKY
        }
        val title = intent?.getStringExtra(EXTRA_TITLE) ?: getString(R.string.notification_idle)
        ensureChannel()
        if (!goForeground(title)) {
            stopSelf()
            return START_NOT_STICKY
        }
        return START_STICKY
    }

    private fun goForeground(title: String): Boolean {
        val notification = runCatching { buildNotification(title, withLargeIcon = true) }
            .getOrElse { buildNotification(title, withLargeIcon = false) }
        return try {
            if (Build.VERSION.SDK_INT >= 34) {
                startForeground(NOTIF_ID, notification, ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE)
            } else {
                startForeground(NOTIF_ID, notification)
            }
            true
        } catch (t: Throwable) {
            Log.e(TAG, "startForeground failed", t)
            runCatching { startForeground(NOTIF_ID, buildNotification(title, withLargeIcon = false)) }.isSuccess
        }
    }

    private fun buildNotification(title: String, withLargeIcon: Boolean): Notification {
        val open = PendingIntent.getActivity(
            this,
            0,
            Intent(this, MainActivity::class.java),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        val stop = PendingIntent.getService(
            this,
            1,
            Intent(this, BozyaKeepAliveService::class.java).setAction(ACTION_STOP),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_bozya)
            .setContentTitle(getString(R.string.app_name))
            .setContentText(title)
            .setColor(0xFF000000.toInt())
            .setContentIntent(open)
            .setOngoing(true)
            .setSilent(true)
            .setOnlyAlertOnce(true)
            .setCategory(NotificationCompat.CATEGORY_SERVICE)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setForegroundServiceBehavior(NotificationCompat.FOREGROUND_SERVICE_IMMEDIATE)
            .addAction(0, getString(R.string.action_disconnect), stop)
        if (withLargeIcon) {
            largeIcon(this)?.let { builder.setLargeIcon(it) }
        }
        return builder.build()
    }

    private fun ensureChannel() {
        val manager = getSystemService(NotificationManager::class.java) ?: return
        val channel = NotificationChannel(
            CHANNEL_ID,
            getString(R.string.notification_channel),
            NotificationManager.IMPORTANCE_LOW,
        ).apply {
            description = "Фоновое соединение Bozya VPN"
            setShowBadge(false)
            enableVibration(false)
            setSound(null, null)
        }
        manager.createNotificationChannel(channel)
    }

    companion object {
        private const val CHANNEL_ID = "bozya.keepalive"
        private const val NOTIF_ID = 17
        private const val EXTRA_TITLE = "title"
        private const val TAG = "Bozya/KeepAlive"
        const val ACTION_STOP = "com.nimbus.vpn.STOP"

        @Volatile
        private var cachedLargeIcon: Bitmap? = null

        fun start(context: Context, title: String) {
            val app = context.applicationContext
            val intent = Intent(app, BozyaKeepAliveService::class.java).putExtra(EXTRA_TITLE, title)
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    app.startForegroundService(intent)
                } else {
                    app.startService(intent)
                }
            } catch (t: Throwable) {
                Log.w(TAG, "Cannot start keep-alive service", t)
            }
        }

        fun stop(context: Context) {
            runCatching {
                context.applicationContext.stopService(
                    Intent(context.applicationContext, BozyaKeepAliveService::class.java),
                )
            }
        }

        private fun largeIcon(context: Context): Bitmap? {
            cachedLargeIcon?.let { return it }
            return runCatching {
                BitmapFactory.decodeResource(context.resources, R.drawable.ic_stat_large)
            }.getOrNull()?.also { cachedLargeIcon = it }
        }
    }
}
