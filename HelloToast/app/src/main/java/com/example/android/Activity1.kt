package com.example.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        val button1 = findViewById<Button>(R.id.button1_id)

        // EXAMPLE OF AN EXPLICIT INTENT.
        button1.setOnClickListener{
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
    }
}