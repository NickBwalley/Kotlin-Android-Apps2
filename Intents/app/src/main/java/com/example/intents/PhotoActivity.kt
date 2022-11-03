package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class PhotoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)

        var btnLaunchMain : Button = findViewById(R.id.btnBack)

        btnLaunchMain.setOnClickListener{
            //Explicit intent
            // Move to another SPECIFIC APP replace package name with yours
            var packageName = "com.example.android"

            var launchApp: Intent? = packageManager.getLaunchIntentForPackage(packageName)

            // confirm if ther eis an app with that package name, if not tell user APP NOT FOUND
            if(launchApp != null){
                startActivity(launchApp)
            } else{
                Toast.makeText(this, "APP NOT FOUND!", Toast.LENGTH_LONG).show()
            }

        }

    }
}