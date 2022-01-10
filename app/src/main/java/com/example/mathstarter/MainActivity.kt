package com.example.mathstarter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.mathstarter.*



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add_1 : ImageView = findViewById(R.id.addition)
        val add_2 : Button = findViewById(R.id.addi)

        val subtraction_1 : ImageView = findViewById(R.id.subtraction)
        val subtraction_2 : Button = findViewById(R.id.subtrac)

        val multi_1 : ImageView = findViewById(R.id.multiplication)
        val multi_2 : Button = findViewById(R.id.multi)

        val divi_1 : ImageView = findViewById(R.id.division)
        val divi_2 : Button = findViewById(R.id.divi)



        val practice : Button = findViewById(R.id.practice)


//implimenting the setOnClickLisener for buttons and images

        add_1.setOnClickListener {
            val toast = Toast.makeText(this,"COOL ! Let's learn about Addition of two numbers !",Toast.LENGTH_SHORT)
            toast.show()
            //activity change logic
            val intent_add_1 = Intent(this, addition_tutorial ::class.java)
            startActivity(intent_add_1)

        }

        add_2.setOnClickListener {
            val toast = Toast.makeText(this,"COOL ! Let's learn about Addition of two numbers !",Toast.LENGTH_SHORT)
            toast.show()
            //activity change logio
            val intent_add_2 = Intent(this, addition_tutorial ::class.java)
            startActivity(intent_add_2)
        }

        subtraction_1.setOnClickListener {
            val toast = Toast.makeText(this,"NICE click !!! Now let's learn about subtraction !",Toast.LENGTH_SHORT)
            toast.show()
            //activity change logic
            val intent_sub_1 = Intent(this, subtraction_tutorial ::class.java)
            startActivity(intent_sub_1)
        }

        subtraction_2.setOnClickListener {
            val toast = Toast.makeText(this,"NICE click !!! Now let's learn about subtraction !",Toast.LENGTH_SHORT)
            toast.show()
            //activity change logic
            val intent_sub_2 = Intent(this, subtraction_tutorial ::class.java)
            startActivity(intent_sub_2)
        }


        multi_1.setOnClickListener {
            val toast = Toast.makeText(this,"What a progress ! Time to *multiply* the fun! ",Toast.LENGTH_SHORT)
            toast.show()
            //activity change logic
            val intent_multi_1 = Intent(this, Multiplication ::class.java)
            startActivity(intent_multi_1)
        }

        multi_2.setOnClickListener {
            val toast = Toast.makeText(this,"W!!!!!!!!! ",Toast.LENGTH_SHORT)
            toast.show()
            //activity change logic
            val intent_multi_1 = Intent(this, Multiplication ::class.java)
            startActivity(intent_multi_1)
        }


        divi_1.setOnClickListener {
            val toast = Toast.makeText(this,"If you already learnt the rest,, division will be too easy!!!",Toast.LENGTH_SHORT)
            toast.show()
            //activity change logic
            val intent_divi_1 = Intent(this, Division_tutorial ::class.java)
            startActivity(intent_divi_1)
        }

        divi_2.setOnClickListener {
            val toast = Toast.makeText(this,"If you already learnt the rest,, division will be too easy!!!",Toast.LENGTH_SHORT)
            toast.show()
            //activity change logic
            val intent_divi_2 = Intent(this, Division_tutorial ::class.java)
            startActivity(intent_divi_2)
        }

        practice.setOnClickListener {
//            val toast = Toast.makeText(this,"If you already learnt the rest,, division will be too easy!!!",Toast.LENGTH_SHORT)
//            toast.show()
            //activity change logic
            val prctc = Intent(this, random_practice ::class.java)
            startActivity(prctc)
        }



    }
}