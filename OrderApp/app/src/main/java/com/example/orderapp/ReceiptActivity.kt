package com.example.orderapp

import android.os.Bundle
import android.text.SpannableStringBuilder
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ReceiptActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receipt)

        var showReceipt: TextView = findViewById(R.id.showReceipt)
        var payBtn: FloatingActionButton = findViewById(R.id.btnPayment)

        // Receive any data you passed from the second activity and use it here
        // Retrieve the order given from the previous activity
        var receiptItem = intent.getStringExtra("RECEIPT")
        var receiptItemResult = receiptItem.toString()

        // Use a SpannableStringBuilder so that both the text and the spans are mutable
        // Use a SpannableStringBuilder so that both the text and the spans are mutable
        val firstWord = "The total cost of your order is Ksh "
        val secondWord = " Proceed to pay"
        val ssb = SpannableStringBuilder(firstWord)

        ssb.append(receiptItemResult)
        ssb.append(secondWord)

        // showReceipt.text =  receiptItem
        // var myFinalString = "The total cost of your order is Ksh $receiptItemResult Proceed to pay"
        showReceipt.setText(ssb)
        // display the data received into the showReceipt textView for the user to see

        // LOGIC to pay
        payBtn.setOnClickListener{
            // Launch your phone's SimTookKit (STK) through an explicit intent
            // research on the way to fetch the specific STK'S package name.
        }
    }
}