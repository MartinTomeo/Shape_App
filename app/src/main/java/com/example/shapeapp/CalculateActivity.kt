package com.example.shapeapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
//import com.example.shapeapp.R
import kotlin.math.PI

class CalculateActivity : AppCompatActivity() {

    private lateinit var radiusInput: EditText
    private lateinit var calculateButton: Button
    private lateinit var resultCard: CardView
    private lateinit var resultText: TextView
    private lateinit var radiusImage: ImageView

    private fun calculateArea() {
        val radius = radiusInput.text.toString().toDoubleOrNull()

        if (radius != null) {
            val area = PI * radius * radius
            resultText.text = "Area: $area"
            resultCard.visibility = View.VISIBLE
        } else {
            resultText.text = "Invalid Radius"
            resultCard.visibility = View.GONE
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)

        radiusInput = findViewById(R.id.radius_input)
        calculateButton = findViewById(R.id.calculate_button)
        resultCard = findViewById(R.id.result_card)
        resultText = findViewById(R.id.result_text)
        radiusImage = findViewById(R.id.radius_image)

        val backButton: Button = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            finish()
        }

        calculateButton.setOnClickListener {
            try {
            calculateArea()
                radiusImage.visibility=View.VISIBLE
                } catch (e: Exception) {
            e.printStackTrace()
                }


        }
    }}