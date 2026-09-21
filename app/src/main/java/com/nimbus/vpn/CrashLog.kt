package com.nimbus.vpn

import android.content.Context
import android.util.Log
import java.io.File

object CrashLog {
    private const val DIR = "crashes"
    private const val FILE = "last.txt"

    fun install(context: Context) {
        val app = context.applicationContext
        val previous = Thread.getDefaultUncaughtExceptionHandler()
        Thread.setDefaultUncaughtExceptionHandler { thread, error ->
            write(app, thread, error)
            previous?.uncaughtException(thread, error)
        }
    }

    fun write(context: Context, thread: Thread, error: Throwable) {
        runCatching {
            val dir = File(context.applicationContext.filesDir, DIR)
            dir.mkdirs()
            File(dir, FILE).writeText(
                buildString {
                    appendLine(System.currentTimeMillis().toString())
                    appendLine("${error.javaClass.name}: ${error.message}")
                    appendLine("thread=${thread.name}")
                    appendLine(Log.getStackTraceString(error).take(8_000))
                },
            )
        }
    }

    fun summary(context: Context): String? {
        val file = File(context.applicationContext.filesDir, "$DIR/$FILE")
        if (!file.exists()) return null
        return runCatching {
            file.useLines { lines -> lines.drop(1).firstOrNull() }
        }.getOrNull()?.take(180)?.ifBlank { null }
    }
}
