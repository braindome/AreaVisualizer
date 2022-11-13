package com.example.areavisualizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.math.sqrt

class PentagonActivity : AppCompatActivity() {

    lateinit var sideEditText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pentagon)

        val pentBtn : Button = findViewById<Button>(R.id.pentCalcBtnView)

        sideEditText = findViewById(R.id.pentSideEditText)

        pentBtn.setOnClickListener() {
            calculateArea()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("calculateArea", calculateArea())
            startActivity(intent)
        }
    }

    fun calculateArea() : Double {
        val side = sideEditText.text.toString().toInt()
        return 1.72 * (side*side)
    }
}