package com.example.mathstarter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager




import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import com.example.mathstarter.R
import com.example.mathstarter.random_practiceViewModel

class random_practice : AppCompatActivity(), LifecycleOwner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_practice)

        var viewModel_1 = ViewModelProvider(this).get(random_practiceViewModel::class.java)



        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Division"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)




        val question : TextView = findViewById(R.id.question)
        val answer : TextView = findViewById(R.id.answer)

        val button : Button = findViewById(R.id.button)





        var (ans_check , question_statement ) = viewModel_1.getquestion()

        question.text = question_statement



        button.setOnClickListener {

            var ans_1 : String = answer.text.toString()
            var ans : Double = ans_1.toDouble()




            if (ans == ans_check ){
                val toast = Toast.makeText(this,"Perfacto ! ! you got it Right",
                    Toast.LENGTH_SHORT)
                toast.show()
                var (ans_check_1 , question_statement_1 ) = viewModel_1.getquestion()
                ans_check = ans_check_1
                question_statement = question_statement_1
                question.text = question_statement

            }

            else if (ans != ans_check){
                val toast = Toast.makeText(this,"Oh oh !! This is not the correct answer. please try again",
                    Toast.LENGTH_SHORT)
                toast.show()
            }

        }





    }

}



