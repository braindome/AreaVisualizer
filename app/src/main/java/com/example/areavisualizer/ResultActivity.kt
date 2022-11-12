package com.example.areavisualizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    lateinit var resultField : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val area = intent.getIntExtra("calculateArea", 666)

        resultField = findViewById(R.id.resultTextView)
        resultField.text = area.toString()
    }
}