package com.example.mathstarter

import androidx.lifecycle.ViewModel

class random_practiceViewModel : ViewModel() {

    fun getquestion() : Pair<Double, String> {


        // function to generate random oparator from (+ ,- ,* ,/ )
        var num_1 : Int = (1..20).random()
        var num_2 : Int = (1..20).random()

        var y : Int = (1..4).random()

//        var y : Int = (1..4).random()
        var x : String
        var check_1 : Double
        var Z : Int

        when(y) {
            1 -> {
                x = " + "
                check_1 = (num_1 + num_2).toDouble()
            }
            2 -> {
                x = " - "
                if (num_1>num_2)
                    check_1 = (num_1 - num_2).toDouble()
                else{


                    check_1 = (num_2 - num_1).toDouble()
                    Z = num_1
                    num_1 = num_2
                    num_2 = Z

                    }

            }
            3 -> {
                x =" * "
                check_1 = (num_1 * num_2).toDouble()
            }


            else -> {
                x = " / "
                check_1 = num_1/num_2.toDouble()
            }
        }

        var check = "%.2f".format(check_1).toDouble()

//    the main code goes here


        var question_statement : String = num_1.toString() + x + num_2.toString()

        return Pair(check,question_statement)
    }

    override fun onCleared() {
        super.onCleared()
    }
}