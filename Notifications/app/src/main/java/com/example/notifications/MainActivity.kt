package com.example.notifications

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class MainActivity : AppCompatActivity() {
    val CHANNEL_ID = "channelID" //unique as there can be other channel IDs
    val CHANNEL_NAME = "channelName" // name for notification channel created
    val NOTIFICATION_ID = 0 // uniquely identify notification in the channel

    // declaring variables
    lateinit var notificationManager: NotificationManager
    lateinit var notificationChannel: NotificationChannel
    lateinit var builder: Notification.Builder
    private val channelId = "i.apps.notifications"
    private val description = "Test notification"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnNotify: Button = findViewById(R.id.button)

        //Post android O (API 26) - to create notification, we need a notification channel, we create it
        // in this channel we will post our notifications and it will hold the configurations we want to
        // have in for our notifications ie notification behavior (cannot hange it afterwards)
        createNotificationChannel()

        // create notification to be posted in channel
        val notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("BBIT Notification")
            .setContentText("You have an exam in 3weeks please read. \nHave a nice day:)")
            .setSmallIcon(R.drawable.ic_people) // create your own icon here from the res >> drawable folder
            .setPriority(NotificationCompat.PRIORITY_MAX)
            .build()
        val notificationManager = NotificationManagerCompat.from(this)

        btnNotify.setOnClickListener {
            notificationManager.notify(NOTIFICATION_ID, notification)
        }

        // checking if android version is greater than oreo(API 26) or not
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            notificationChannel =
                NotificationChannel(channelId, description, NotificationManager.IMPORTANCE_HIGH)
            notificationChannel.enableLights(true)
            notificationChannel.lightColor = Color.GREEN
            notificationChannel.enableVibration(false)
            notificationManager.createNotificationChannel(notificationChannel)

            builder = Notification.Builder(this, channelId)
                .setContent(contentView)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setLargeIcon(
                    BitmapFactory.decodeResource(
                        this.resources,
                        R.drawable.ic_launcher_background
                    )
                )
                .setContentIntent(pendingIntent)
        } else {

            builder = Notification.Builder(this)
                .setContent(contentView)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setLargeIcon(
                    BitmapFactory.decodeResource(
                        this.resources,
                        R.drawable.ic_launcher_background
                    )
                )
                .setContentIntent(pendingIntent)
        }
        notificationManager.notify(1234, builder.build())
    }
}