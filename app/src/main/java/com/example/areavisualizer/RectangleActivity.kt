package com.example.areavisualizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RectangleActivity : AppCompatActivity() {

    lateinit var heightEditText : EditText
    lateinit var lengthEditText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)

        val rectBtn : Button = findViewById<Button>(R.id.rectCalcBtnView)

        heightEditText = findViewById(R.id.heightEditText)
        lengthEditText = findViewById(R.id.lengthEditText)

        rectBtn.setOnClickListener() {
            calculateArea()
            val intent = Intent(this, ResultActivity::class.java )
            intent.putExtra("calculateArea", calculateArea())
            startActivity(intent)

        }
    }

    fun calculateArea() : Int {
        var length = lengthEditText.text.toString().toInt()
        var height = heightEditText.text.toString().toInt()
        return length*height
    }
}