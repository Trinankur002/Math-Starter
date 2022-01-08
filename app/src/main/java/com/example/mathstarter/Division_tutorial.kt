package com.example.mathstarter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Division_tutorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_division_tutorial)

        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Division"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)




        val back: Button = findViewById(R.id.back_but)
        val next: Button = findViewById(R.id.next)

//        back button function in activity

        back.setOnClickListener {
            val back_intent = Intent(this, Multiplication ::class.java)
            startActivity(back_intent)

        }

        next.setOnClickListener {
            val next_intent = Intent(this, random_practice ::class.java)
            startActivity(next_intent)

        }
    }
}