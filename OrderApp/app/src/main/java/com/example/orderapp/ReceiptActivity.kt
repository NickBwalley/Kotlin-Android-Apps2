package com.example.orderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ReceiptActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receipt)

        var showReceipt: TextView = findViewById(R.id.showReceipt)
        var payBtn: FloatingActionButton = findViewById(R.id.btnPayment)

        // Receive any data you passed from the second activity and use it here

        // display the data received into the showReceipt textView for the user to see

        // LOGIC to pay
        payBtn.setOnClickListener{
            // Launch your phone's SimTookKit (STK) through an explicit intent
            // research on the way to fetch the specific STK'S package name.
        }
    }
}