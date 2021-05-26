package com.example.ejerciciodiapositiva5tema5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejerciciodiapositiva5tema5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun addListenerToTextView(){}

    private fun addListenerToEditText1(){}

    private fun addListenerToEditText2(){}

    private fun addListenerToButton(){}

}