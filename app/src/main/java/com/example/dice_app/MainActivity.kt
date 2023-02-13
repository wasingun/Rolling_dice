package com.example.dice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val min: EditText = findViewById(R.id.minNum)
        val max: EditText = findViewById(R.id.maxNum)
        val numberSet: TextView = findViewById(R.id.diceNum)
        val dice: Button = findViewById(R.id.rolling)
        dice.setOnClickListener {
            val min2: Int = Integer.parseInt(min.text.toString())
            val max2: Int = Integer.parseInt(max.text.toString())
            if (min2 > max2){
                numberSet.text = "실행할 수 없습니다."
            } else {
                val number = (min2..max2).random()
                numberSet.text = number.toString()
            }
        }
    }
}