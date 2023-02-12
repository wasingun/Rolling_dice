package com.example.dice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val numberSet: TextView = findViewById(R.id.diceNum)
        val dice: Button = findViewById(R.id.rolling)
        dice.setOnClickListener {
            val number = (1..6).random()
            numberSet.text = number.toString()
        }
    }
}