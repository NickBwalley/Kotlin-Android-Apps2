package com.example.services

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.os.PersistableBundle
import android.widget.Toast

class AudioPlayerService : AppCompatActivity() {
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
        returnn
    }
}