package com.example.mathstarter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class addition_tutorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addition_tutorial)

        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Addition"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)


//        override fun onSupportNavigateUp(): Boolean {
////        onBackPressed()
////        return true
////      }

        val back: Button = findViewById(R.id.back_but)
        val next: Button = findViewById(R.id.next)


        back.setOnClickListener {
            val back_intent = Intent(this, MainActivity::class.java)
            startActivity(back_intent)

        }

        next.setOnClickListener {
            val next_intent = Intent(this, subtraction_tutorial::class.java)
            startActivity(next_intent)

        }


    }
}


