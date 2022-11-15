package com.example.custombroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.provider.Settings
import android.widget.Toast

class CustomReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context, intent: Intent?) {
        Toast.makeText(context, "Broadcast event has been received.", Toast.LENGTH_LONG).show()
        // declaring object of MediaPlayer
        lateinit var player: MediaPlayer

        // creating a media player which
        // will play the audio of Default
        // ringtone in android device
        player = MediaPlayer.create(context, Settings.System.DEFAULT_RINGTONE_URI)

        // providing the boolean
        // value as true to play
        // the audio on loop
        player.setLooping(true)

        // starting the process
        player.start()
    }
}