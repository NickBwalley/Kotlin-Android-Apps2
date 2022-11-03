package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun displayToastMsg(view: View){
        val text = "hello toast!"
        val duration = Toast.LENGTH_SHORT

        val Toast = Toast.makeText(this, text, duration)
        Toast.show()

    }
    fun displayToastMsg2(view: View){
        //  CHAINING
        val Toast2 = Toast.makeText(this, "Hello Toast", android.widget.Toast.LENGTH_SHORT).show()

        val displayMsg : Button = findViewById(R.id.displayToastMsg)

        displayMsg.setOnClickListener{
            val Toast2 = Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show()

            // EXPLICIT INTENT
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
        }


    }

}