package com.example.services

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.media.audiofx.BassBoost.Settings
import android.os.IBinder
import android.widget.Toast

class AudioPlayerService : Service() {
    // create a MediaPlayer object to be used to access the phone's default ringtone
    lateinit var player: MediaPlayer

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    //override the onCreate callback method of the Service class
    override fun onCreate() {
        super.onCreate()
        Toast.makeText(this, "Service was Created", Toast.LENGTH_SHORT).show()
    }

    //override the onCreate callback method of the Service class
    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int{
       player = MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI)
       player.isLooping = true
       player.start()
       Toast.makeText(this, "Service was Started", Toast.LENGTH_SHORT).show()
        return START_STICKY // restart service in the case it was stopped and destroyed/killed
    }

    // Override the onDestroy method of the service class
    override fun onDestroy() {
        super.onDestroy()
        player.stop()
        Toast.makeText(this, "Service being Destroyed", Toast.LENGTH_SHORT).show()
    }
}