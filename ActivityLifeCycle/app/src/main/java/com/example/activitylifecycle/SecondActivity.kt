package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var showReceivedText : TextView = findViewById(R.id.receiveText)

        var receivedText = intent.getStringExtra("SENTDATA")

        showReceivedText.text = receivedText
    }
}