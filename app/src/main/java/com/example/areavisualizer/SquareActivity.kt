package com.example.areavisualizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SquareActivity : AppCompatActivity() {

    lateinit var sideEditText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)

        val calcBtn : Button = findViewById(R.id.squareCalcBtnView)

        sideEditText = findViewById(R.id.squareSideEditText)


        calcBtn.setOnClickListener() {
            calculateArea()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("calculateArea", calculateArea())
            startActivity(intent)
        }

    }

    fun calculateArea(): Int {
        var side = sideEditText.text.toString().toInt()
        return side*side
    }
}