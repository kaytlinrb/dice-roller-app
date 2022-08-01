package com.example.diceyroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        class Dice(val numSides: Int) {

            fun roll(): Int {
                return (1..numSides).random()
            }
        }


        val rollButton: Button = findViewById(R.id.button)


        fun rollDice() {
            var postText
            val dice = Dice(6)
            val diceRoll = dice.roll()
            val resultTextView: TextView = findViewById(R.id.textView)

            if (diceRoll != 3) {
                postText = "You rolled a ${diceRoll}"
            }
            else {
                postText = "Hey, You Rolled a ${diceRoll}, my lucky number!"
            }


            resultTextView.text = postText
        }



        rollButton.setOnClickListener { rollDice() }



    }

}