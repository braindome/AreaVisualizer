package com.example.areavisualizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.math.PI

class EllipseActivity : AppCompatActivity() {

    lateinit var axisAEditText : EditText
    lateinit var axisBEditText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ellipse)

        val ellipseBtn : Button = findViewById<Button>(R.id.ellipseCalcBtnView)

        axisAEditText = findViewById(R.id.axisAEditTextView)
        axisBEditText = findViewById(R.id.axisBEditTextView)

        ellipseBtn.setOnClickListener() {
            calculateArea()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("calculateArea", calculateArea())
            startActivity(intent)
        }
    }

    fun calculateArea() : Double {
        val axisA = axisAEditText.text.toString().toInt()
        val axisB = axisBEditText.text.toString().toInt()

        return PI * axisA * axisB
    }
}