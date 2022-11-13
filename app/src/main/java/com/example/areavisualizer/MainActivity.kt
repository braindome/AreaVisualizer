package com.example.areavisualizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val squareBtn : ImageButton = findViewById(R.id.squareButtonView)
        val rectBtn : ImageButton = findViewById(R.id.rectangleButtonView)
        val triangleBtn : ImageButton = findViewById(R.id.triangleButtonView)
        val pentBtn : ImageButton = findViewById(R.id.pentButtonView)
        val circleBtn : ImageButton = findViewById(R.id.circleButtonView)
        val ellipseBtn : ImageButton = findViewById(R.id.ellipseButtonView)

        squareBtn.setOnClickListener() {
            val intent = Intent(this, SquareActivity::class.java)
            startActivity(intent)
        }

        rectBtn.setOnClickListener() {
            val intent = Intent(this, RectangleActivity::class.java)
            startActivity(intent)
        }

        triangleBtn.setOnClickListener() {
            val intent = Intent(this, TriangleActivity::class.java)
            startActivity(intent)
        }

        pentBtn.setOnClickListener() {
            val intent = Intent(this, PentagonActivity::class.java)
            startActivity(intent)
        }

        circleBtn.setOnClickListener() {
            val intent = Intent(this, CircleActivity::class.java)
            startActivity(intent)
        }

        ellipseBtn.setOnClickListener() {
            val intent = Intent(this, EllipseActivity::class.java)
            startActivity(intent)
        }

    }


}