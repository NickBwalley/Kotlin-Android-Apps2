package com.example.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra("SEND_KEY_VALUE")

        var textView: TextView = findViewById(R.id.text_message)

        textView.text = message

        // SEND ACTIVITY FROM SECONDACTIVITY TO MAINACTIVITY
        val nMessageEditText: EditText = findViewById(R.id.editText_send2)

        val buttonSend : Button = findViewById(R.id.button_send2)

        buttonSend.setOnClickListener{
            val secondActivityIntent = Intent(this, MainActivity::class.java)


            var message = nMessageEditText.text.toString().trim()
            secondActivityIntent.putExtra("SEND_VALUE_BACK", message)

            startActivity(secondActivityIntent)

        }

    }
}