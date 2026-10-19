package ru.yandexpraktikum.blechat

import android.app.Application
import android.app.NotificationManager.IMPORTANCE_DEFAULT
import androidx.core.app.NotificationChannelCompat
import androidx.core.app.NotificationManagerCompat
import dagger.hilt.android.HiltAndroidApp

private const val CHANNEL_ID = "channel_id"

@HiltAndroidApp
class BleChat: Application() {

    override fun onCreate() {
        super.onCreate()
        setUpNotificationsChannel()
    }

    private fun setUpNotificationsChannel() {
        NotificationManagerCompat.from(this)
            .createNotificationChannel(
                NotificationChannelCompat.Builder(CHANNEL_ID, IMPORTANCE_DEFAULT)
                    .setName(getString(R.string.app_name))
                    .build()
            )
    }
}