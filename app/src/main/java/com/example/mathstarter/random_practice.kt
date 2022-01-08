package com.example.mathstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider

class random_practice : AppCompatActivity(), LifecycleOwner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_practice)

        var viewModel = ViewModelProvider(this).get(random_practiceViewModel::class.java)


        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Division"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)


        val question : TextView = findViewById(R.id.question)
        val answer : TextView = findViewById(R.id.answer)

        val button : Button = findViewById(R.id.button)

//        private val viewModel: InventoryViewModel by random_practiceViewModel {
//            InventoryViewModelFactory(
//                (activity?.application as random_practice).database
//                    .itemDao()
//            )
//        }

//        val ans_check : Double
//        val question_statement : String


        var (ans_check , question_statement ) = viewModel.getquestion()

        question.text = question_statement

//        val ans_1 : String = answer.text.toString()
//        val ans : Double = ans_1.toDouble()

        button.setOnClickListener {

            var ans_1 : String = answer.text.toString()
            var ans : Double = ans_1.toDouble()

            if (ans == ans_check ){
                val toast = Toast.makeText(this,"Perfacto ! ! you got it Right",
                    Toast.LENGTH_LONG)
                toast.show()
                var (ans_check_1 , question_statement_1 ) = viewModel.getquestion()
                ans_check = ans_check_1
                question_statement = question_statement_1
                question.text = question_statement

            }

            else if (ans != ans_check){
                val toast = Toast.makeText(this,"Oh oh !! This is not the correct answer. please try again",
                    Toast.LENGTH_LONG)
                toast.show()
            }

        }

    }



    // function to make the question

}

//if (ans == ans_check ){
//    var toast = Toast.makeText(this,"Perfacto ! ! you got it Right",
//        Toast.LENGTH_LONG)
//    toast.show()
//    var (ans_check_1 , question_statement_1 ) = viewModel.getquestion()
//    question.text = question_statement_1
//}








