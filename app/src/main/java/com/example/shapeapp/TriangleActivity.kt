package com.example.shapeapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TriangleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle)

        val baseEditText: EditText = findViewById(R.id.base_edit_text)
        val heightEditText: EditText = findViewById(R.id.height_edit_text)
        val areaTextView: TextView = findViewById(R.id.area_text_view)

        val calculateButton: Button = findViewById(R.id.calculate_button)

        val backButton: Button = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            finish()
        }

        calculateButton.setOnClickListener {
            val base = baseEditText.text.toString().toDouble()
            val height = heightEditText.text.toString().toDouble()

            val area = 0.5 * base * height

            areaTextView.text = "Area: $area"
        }
    }
}