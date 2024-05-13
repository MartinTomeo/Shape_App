package com.example.shapeapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class RectangleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)
        enableEdgeToEdge()

        val lengthEditText: EditText = findViewById(R.id.length_edit_text)
        val widthEditText: EditText = findViewById(R.id.width_edit_text)
        val areaTextView: TextView = findViewById(R.id.area_text_view)
        val calculateButton: Button = findViewById(R.id.calculate_button)

        val backButton: Button = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            finish()
        }

        calculateButton.setOnClickListener {
            val length = lengthEditText.text.toString().toDouble()
            val width = widthEditText.text.toString().toDouble()

            val area = length * width

            areaTextView.text = "Area: $area"
    }
}
}