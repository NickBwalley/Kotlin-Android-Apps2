package com.example.orderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.lang.reflect.Array.getInt

class MainActivity : AppCompatActivity() {
    var orderMessage = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Reference the XML image view objects from your activity class file
        var donut: ImageView = findViewById(R.id.donut)
        var iceCream: ImageView = findViewById(R.id.ice_cream)
        var froyo: ImageView = findViewById(R.id.froyo)
        var orderButton: FloatingActionButton = findViewById(R.id.btnOrder)

        // The check boxes
        var sprinkleCheck: CheckBox = findViewById(R.id.sprinkles)
        var oreoCheck : CheckBox = findViewById(R.id.oreos)
        var fruitCheck : CheckBox = findViewById(R.id.fruit)

        // When the donut image is clicked
        donut.setOnClickListener{
            // fetch message from string.xml using getString() method
            orderMessage = getInt(R.integer.donut_order_message)
            displayToast(orderMessage)
        }

        // When the icecream image is clicked
        iceCream.setOnClickListener{
            // fetch message from string.xml using getString() method
            orderMessage = getString(R.string.ice_cream_order_message)
            displayToast(orderMessage)
        }

        // When the froyo image is clicked
        froyo.setOnClickListener{
            // fetch message from string.xml using getString() method
            orderMessage = getString(R.string.froyo_order_message)
            displayToast(orderMessage)
        }

        //Logic for the Floating action button
        orderButton.setOnClickListener{
            //checking whether the checkboxes have beeen selected
            if(sprinkleCheck.isChecked){
                // do sth
            }
            if(oreoCheck.isChecked){
                // do sth
            }
            if(fruitCheck.isChecked){
                // do sth
            }

            var intentOrder = Intent(this, OrderActivity::class.java)
            intentOrder.putExtra("ORDER", orderMessage)
            startActivity(intentOrder)
        }
    }

    //Instead of having many Toast message declaration,
    private fun displayToast(message: String){
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}