package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val takeMeHome: Button = findViewById(R.id.btn2)

        takeMeHome.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}