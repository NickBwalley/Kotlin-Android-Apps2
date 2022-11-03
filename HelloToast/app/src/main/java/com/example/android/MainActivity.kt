package com.example.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//    private var mCount = 0
//    private var mShowCount: TextView? = null

    private var rndCount = 1
    private var rndShowCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        mShowCount = findViewById<TextView>(R.id.show_count)
        rndShowCount = findViewById<TextView>(R.id.show_count)
    }

    fun showToast(view: View) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show()
    }
    fun rollingDice(view: View) {
        rndCount = (1..6).random() // generated random from 1 to 6 included
        rndShowCount!!.text = rndCount.toString()
    }
//    fun countUp(view: View) {
//        mCount++
//        if(mShowCount != null)
//        {
//            mShowCount!!.text = mCount.toString()
//        }
//    }
}