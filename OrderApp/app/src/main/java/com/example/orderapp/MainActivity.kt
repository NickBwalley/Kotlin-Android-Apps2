package com.example.orderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.lang.reflect.Array.getInt

class MainActivity : AppCompatActivity() {
    var orderMessage = ""
    var newSprinkles = 0
    var newOreos = 0
    var newFruits = 0
    var sprinkles = ""
    var oreos = ""
    var fruit = ""
    var result1sln = 0
    var temp_donut = 0
    var temp_icecream = 0
    var temp_froyo = 0

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
            orderMessage = getString(R.string.donut_order_message)
            temp_donut = orderMessage.toInt()
            displayToast(temp_donut.toString())
        }


        // When the icecream image is clicked
        iceCream.setOnClickListener{
            // fetch message from string.xml using getString() method
            orderMessage = getString(R.string.ice_cream_order_message)
            temp_icecream = orderMessage.toInt()
            displayToast(temp_icecream.toString())
        }

        // When the froyo image is clicked
        froyo.setOnClickListener{
            // fetch message from string.xml using getString() method
            orderMessage = getString(R.string.froyo_order_message)
            temp_froyo = orderMessage.toInt()
            displayToast(temp_froyo.toString())
        }


        //Logic for the Floating action button
        orderButton.setOnClickListener{
            //checking whether the checkboxes have beeen selected
            if(sprinkleCheck.isChecked){
                sprinkles = getString(R.string.sprinkles_toppings)
                newSprinkles = 20
                var result1 = temp_donut + temp_icecream + temp_froyo + newSprinkles
                result1sln = result1
                orderMessage = result1sln.toString()
//                displayToast(orderMessage)
            }
            if(oreoCheck.isChecked){
                oreos = getString(R.string.oreos_toppings)
                newOreos = 30
                var result2 = result1sln + newOreos
                result1sln = result2
                orderMessage = result1sln.toString()
//                displayToast(orderMessage)
            }
            if(fruitCheck.isChecked){
                fruit = getString(R.string.fruit_toppings)
                newFruits = 50
                var result3 = result1sln + newFruits
                result1sln = result3
                orderMessage = result1sln.toString()
//                displayToast(orderMessage)
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