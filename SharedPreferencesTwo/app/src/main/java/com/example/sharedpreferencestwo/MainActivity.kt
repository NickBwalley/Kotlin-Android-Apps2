package com.example.sharedpreferencestwo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nameET: EditText = findViewById(R.id.editTextName)
        var ageET: EditText = findViewById(R.id.editTextAge)
        var btnSave: Button = findViewById(R.id.btnSave)
        var btnLoad: Button = findViewById(R.id.btnLoad)
        var checkAge: CheckBox = findViewById(R.id.ageCheck)

        //MODE_PUBLIC - Other apps can read/access the sharedprefs
        //MODE_PRIVATE - Other apps cannot read/access the sharedprefs
        //MODE_APPEND - take existing preferences and append new preferences

        var sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)

        // whenever we want to write to SharedPrefences, we need its editor
        var editor = sharedPref.edit() // the ecit function returns the editor of our shared preference reference

        // Retrieve data in edit texts and store them in SharedPreferences by clicking button
        btnSave.setOnClickListener{
            // first argument is key of our preferences; second arg default value if preference data is not found
            var name = sharedPref.getString("name", null)
            var age = sharedPref.getInt("age", 0)
            var isAdult = sharedPref.getBoolean("isAdult", false)

            //Populate our views
            nameET.setText(name)
            ageET.setText(age.toString())
            checkAge.isChecked = isAdult
        } // closes btnLoad's onclick listener
    }// closes onCreate
} // closes MainActivity : AppCompatActivity(