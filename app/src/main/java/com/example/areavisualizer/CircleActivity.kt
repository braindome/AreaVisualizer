package com.example.areavisualizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.math.PI

class CircleActivity : AppCompatActivity() {

    lateinit var circleEditText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        val circleBtn : Button = findViewById(R.id.circleBtnView)

        circleEditText = findViewById(R.id.circleEditTextView)

        circleBtn.setOnClickListener() {
            calculateArea()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("calculateArea", calculateArea())
            startActivity(intent)
        }

    }

    fun calculateArea() : Double {
        var radius = circleEditText.text.toString().toInt()
        return (radius*radius) * PI
    }
}