package com.example.dice_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class DiceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dice, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val min: EditText = view.findViewById(R.id.minNum)
        val max: EditText = view.findViewById(R.id.maxNum)
        val numberSet: TextView = view.findViewById(R.id.diceNum)
        val dice: Button = view.findViewById(R.id.rolling)


        dice.setOnClickListener {
            val min2: Int = Integer.parseInt(min.text.toString())
            val max2: Int = Integer.parseInt(max.text.toString())
            if (min2 > max2) {
                numberSet.text = "최소값이 최대값보다 큽니다."
            } else {
                val number = (min2..max2).random()
                numberSet.text = number.toString()
            }
        }
    }
}