package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // inflate --convert XML elements into actual java/kotlin objects
        var btnExplicit : Button = findViewById(R.id.btnOpenActivity)

        var btnImplicit : Button = findViewById(R.id.buttonIMPLICIT)

        btnExplicit.setOnClickListener{
            // Explicit intent
            // starting a specific Activity called PhotoActivity
            var intentOpenPhoto = Intent(this, PhotoActivity::class.java)

            startActivity(intentOpenPhoto)
        }

        btnImplicit.setOnClickListener{
            //implicit intent
            // send an intent to the Android System and request from any app that can load a web URL -- not specifying which one
            var webUrlObject = Uri.parse("https://www.strathmore.edu/")

            var webIntent = Intent(Intent.ACTION_VIEW, webUrlObject)

            startActivity(webIntent)
        }
    }
}