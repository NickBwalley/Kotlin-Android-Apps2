package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // class level variables
    var num : Int = 0 // mutable variable
    lateinit var showCount : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // inflation views into objects
        Toast.makeText(this, "currently onCreate", Toast.LENGTH_SHORT).show()
        Log.d("GRPAB", "This is onCreate")

        var buttonCount : Button = findViewById(R.id.btnCount)
        var buttonOpen : Button = findViewById(R.id.btnOpen)

        showCount = findViewById(R.id.textCount)

        buttonCount.setOnClickListener{
            num++ // incrementing value held in the num by 1
            showCount.text = num.toString()
        }

        buttonOpen.setOnClickListener{
            var dataTobeSent = showCount.text
            var intentSecond = Intent(this, SecondActivity::class.java)

            intentSecond.putExtra("SENTDATA", dataTobeSent) // EXTRAS

            startActivity(intentSecond)
        }
    }

    override fun onStart() {
        super.onStart() // functionality from superclass
        testApp()
        // own implementation of onStart
        Log.d("GRPAB", "THIS IS onStart")
        Toast.makeText(this, "Currently onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("GRPAB", "THIS IS onResume")
        Toast.makeText(this, "Currently onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Currently onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "Currently onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Currently onDestroy", Toast.LENGTH_SHORT).show()
    }

    fun testApp() {
        Toast.makeText(this, "TESTING, TESTING", Toast.LENGTH_SHORT).show()
        Log.wtf("GRPAB", "TEST APP FUNCTION WORKS")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Toast.makeText(this, "Currently SAVE INSTANCE STATE", Toast.LENGTH_SHORT).show()
        val savedData = showCount.text.toString() // extract data from text file

        outState.putString("HIGHSCORE", savedData)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            var savedData = savedInstanceState.getString("HIGHSCORE")

            num = savedData.toString().toInt()

            showCount.text = savedData
        } else {
            Toast.makeText(this, "First instance of app use", Toast.LENGTH_SHORT).show()
        }
    }
}