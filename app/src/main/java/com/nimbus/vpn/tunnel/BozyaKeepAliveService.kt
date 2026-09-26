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
import android.annotation.SuppressLint
import android.os.Build
import android.os.IBinder
import android.os.PowerManager
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
    private val serviceJob = SupervisorJob()
    private val serviceScope = CoroutineScope(serviceJob + Dispatchers.Default)
    private var wakeLock: PowerManager.WakeLock? = null

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val session = TunnelSession(this).read()
        val restarted = intent == null ||
            (flags and START_FLAG_RETRY) != 0 ||
            (flags and START_FLAG_REDELIVERY) != 0
        val plan = KeepAlivePolicy.plan(
            KeepAlivePolicy.Command(
                stopRequested = intent?.action == ACTION_STOP,
                title = intent?.getStringExtra(EXTRA_TITLE),
                savedTitle = session.title,
                sessionWanted = session.wanted,
                restarted = restarted,
            ),
        )
        if (plan.stop) {
            if (intent?.action == ACTION_STOP) {
                val app = applicationContext as? BozyaApp
                serviceScope.launch {
                    runCatching { app?.container?.tunnel?.disconnect() }
                }
            }
            if (plan.showForeground) {
                ensureChannel()
                goForeground(buildNotification(plan.title, withLargeIcon = false))
            }
            runCatching { stopForeground(STOP_FOREGROUND_REMOVE) }
            releaseWake()
            stopSelf()
            return START_NOT_STICKY
        }
        ensureChannel()
        // Promote before any bitmap work. A late startForeground kills the process.
        if (!goForeground(buildNotification(plan.title, withLargeIcon = false))) {
            stopSelf()
            return if (session.wanted) START_STICKY else START_NOT_STICKY
        }
        holdWake()
        serviceScope.launch(Dispatchers.IO) {
            val decorated = runCatching { buildNotification(plan.title, withLargeIcon = true) }.getOrNull() ?: return@launch
            runCatching { getSystemService(NotificationManager::class.java)?.notify(NOTIF_ID, decorated) }
        }
        if (plan.restoreTunnel) {
            val app = applicationContext as? BozyaApp
            serviceScope.launch {
                runCatching { app?.container?.tunnel?.restorePersistedSession() }
            }
        }
        return if (plan.sticky) START_STICKY else START_NOT_STICKY
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        val snap = TunnelSession(this).read()
        val title = KeepAlivePolicy.usable(snap.title)
        if (snap.wanted && title != null) {
            val restart = Intent(applicationContext, BozyaKeepAliveService::class.java)
                .putExtra(EXTRA_TITLE, title)
            runCatching {
                if (Build.VERSION.SDK_INT >= 26) {
                    applicationContext.startForegroundService(restart)
                } else {
                    applicationContext.startService(restart)
                }
            }
        }
        super.onTaskRemoved(rootIntent)
    }

    override fun onDestroy() {
        releaseWake()
        super.onDestroy()
    }

    @SuppressLint("WakelockTimeout")
    private fun holdWake() {
        if (wakeLock?.isHeld == true) return
        val pm = getSystemService(POWER_SERVICE) as PowerManager
        val lock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "bozya:tunnel")
        lock.setReferenceCounted(false)
        lock.acquire()
        wakeLock = lock
    }

    private fun releaseWake() {
        runCatching {
            if (wakeLock?.isHeld == true) wakeLock?.release()
        }
        wakeLock = null
    }

    private fun goForeground(notification: Notification): Boolean {
        return try {
            if (Build.VERSION.SDK_INT >= 34) {
                startForeground(NOTIF_ID, notification, ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE)
            } else {
                startForeground(NOTIF_ID, notification)
            }
            true
        } catch (t: Throwable) {
            Log.e(TAG, "startForeground failed", t)
            false
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
            .addAction(R.drawable.ic_bozya, getString(R.string.action_disconnect), stop)
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
