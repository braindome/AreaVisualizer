package com.example.areavisualizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class TriangleActivity : AppCompatActivity() {

    lateinit var heightEditText : EditText
    lateinit var baseEditText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle)

        val triBtn : Button = findViewById(R.id.triangleBtnView)

        heightEditText = findViewById(R.id.triangleHeightEditText)
        baseEditText = findViewById(R.id.triangleBaseEditText)

        triBtn.setOnClickListener() {
            calculateArea()
            val intent = Intent(this, ResultActivity::class.java )
            intent.putExtra("calculateArea", calculateArea())
            startActivity(intent)
        }
    }

    fun calculateArea() : Int {
        var length = baseEditText.text.toString().toInt()
        var height = heightEditText.text.toString().toInt()
        return (length*height)/2
    }
}