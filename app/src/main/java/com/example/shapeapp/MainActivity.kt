package com.example.shapeapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCircle = findViewById<AppCompatButton>(R.id.btnCircle)

        btnCircle.setOnClickListener{
            val intent = Intent(this, CalculateActivity::class.java)
            startActivity(intent)
        }
    }
}