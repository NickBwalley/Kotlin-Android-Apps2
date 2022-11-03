package com.example.orderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        //Initializing object references for XML elements
        var orderTextView: TextView = findViewById(R.id.order_textview)
        var fullName: TextInputEditText = findViewById(R.id.full_name)
        var address: TextInputEditText = findViewById(R.id.address)
        var phoneNumber: TextInputEditText = findViewById(R.id.phone_number)
        var orderDetails: TextInputEditText = findViewById(R.id.order_description)

        // The Radio buttons
        var sameDayChecked: RadioButton = findViewById(R.id.sameday)
        var nextDayChecked: RadioButton = findViewById(R.id.nextday)
        var selfPickChecked: RadioButton = findViewById(R.id.pickup)

        // The Order Button
        var orderButton: Button = findViewById(R.id.submitOrder)

        // Retrieve the order given from the previous activity
        var orderedItem = intent.getStringExtra("ORDER")
        orderTextView.text = orderedItem // show the ordered item from the Order Activity

        //Send order details to the ReceiptActivity and display the details of the order
        // from the Main and OrderActivity
        orderButton.setOnClickListener{
            // check which radio button has been selected
            if(sameDayChecked.isChecked){
                // add delivery fee
            } else if(nextDayChecked.isChecked){
                // add delivery fee
            } else if(selfPickChecked.isChecked){
                // maintain same delivery fee
            }

            var intentReceiptActivity = Intent(this, ReceiptActivity::class.java)
            startActivity(intentReceiptActivity)
        }

    }
}