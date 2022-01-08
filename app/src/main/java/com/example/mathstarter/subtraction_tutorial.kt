package com.example.mathstarter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class subtraction_tutorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subtraction_tutorial)


        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Subtraction"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)




        val back: Button = findViewById(R.id.back_but)
        val next: Button = findViewById(R.id.next)

//        back button function in activity

        back.setOnClickListener {
            val back_intent = Intent(this, addition_tutorial ::class.java)
            startActivity(back_intent)

        }

        next.setOnClickListener {
            val next_intent = Intent(this, Multiplication ::class.java)
            startActivity(next_intent)

        }

    }
}