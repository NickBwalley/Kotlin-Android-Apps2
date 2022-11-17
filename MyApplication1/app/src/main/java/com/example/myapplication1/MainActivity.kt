package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var submitButton : Button = findViewById(R.id.submitBtn)

        submitButton.setOnClickListener(){
            val text = "Hello world!"
            val duration = Toast.LENGTH_SHORT

            val Toast =Toast.makeText(this, text, duration)
            Toast.show()
        }
    }

    fun displayToastMsg(view: View){
        val text = "hello toast!"
        val duration = Toast.LENGTH_SHORT
        val Toast = Toast.makeText(this, text, duration)
        Toast.show()

    }

}