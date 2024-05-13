package com.example.shapeapp


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCircle: Button = findViewById(R.id.btnCircle)
        val btnRectangle: Button = findViewById(R.id.btnRectangle)
        val btnTriangle: Button = findViewById(R.id.btnTriangle)
        btnCircle.setOnClickListener{
            val intent = Intent(this, CircleActivity::class.java)
            startActivity(intent)
        }
        btnRectangle.setOnClickListener{
            val intent = Intent(this, RectangleActivity::class.java)
            startActivity(intent)
        }
        btnTriangle.setOnClickListener{
            val intent = Intent(this, TriangleActivity::class.java)
            startActivity(intent)
        }
    }
}