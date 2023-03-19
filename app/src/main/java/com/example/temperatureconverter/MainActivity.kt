package com.example.temperatureconverter

import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.view.View
import android.os.Bundle
import android.widget.EditText
import com.example.temperatureconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onButtonClick(view: View) {
        Toast.makeText(this, "Converting now...", Toast.LENGTH_SHORT).show()
        val celsiusInput = binding.CelsiusInput
        val fahrenheitOutput = binding.fahrenheitOutput
        val kelvinOutput = binding.kelvinOutput

        // Get the Celsius temperature from the input EditText
        val celsiusTemperature = celsiusInput.text.toString().toDouble()

        // Convert the Celsius temperature to Fahrenheit and Kelvin
        val fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32
        val kelvinTemperature = celsiusTemperature + 273.15

        // Set the resulting Fahrenheit temperature to the output EditText
        fahrenheitOutput.setText("In Fahrenheit, your temperature is: " + fahrenheitTemperature.toInt())
        kelvinOutput.setText("In Kelvin, your temperature is: " + kelvinTemperature.toInt())
    }
}