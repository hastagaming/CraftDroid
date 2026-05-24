// android/app/src/main/java/com/craftdroid/CraftDroidApp.kt
package com.craftdroid

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build

class CraftDroidApp : Application() {
    override fun onCreate() {
        super.onCreate()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                "craftdroid",
                "CraftDroid",
                NotificationManager.IMPORTANCE_LOW
            )
            getSystemService(NotificationManager::class.java).createNotificationChannel(channel)
        }
    }
}