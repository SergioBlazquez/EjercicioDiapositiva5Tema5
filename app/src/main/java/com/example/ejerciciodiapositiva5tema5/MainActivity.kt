package com.example.ejerciciodiapositiva5tema5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.ejerciciodiapositiva5tema5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var booleano: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.isEnabled=false


        binding.editText1.addTextChangedListener ( object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                habilitarBoton()
            }
        })

        binding.editText2.addTextChangedListener ( object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                habilitarBoton()
            }
        })

        binding.button.setOnClickListener {
            binding.editText1.setText("${binding.editText1.text} ${binding.editText2.text}")
            binding.editText2.setText("")
            binding.button.isEnabled=false
        }

        binding.button.setOnFocusChangeListener { _, hasFocus ->
            if(hasFocus){
                binding.textView.text= binding.button.tag.toString()
            }
        }
        binding.editText1.setOnFocusChangeListener { _, hasFocus ->
            if(hasFocus){
                binding.textView.text=binding.editText1.tag.toString()
            }
        }

        binding.editText2.setOnFocusChangeListener { _, hasFocus ->
            if(hasFocus){
                binding.textView.text=binding.editText2.tag.toString()
            }
        }



    }

    /*private fun addListenerToTextView(){}

    private fun addListenerToEditText1(){}

    private fun addListenerToEditText2(){}


    private fun addListenerToButton(){

        binding.button.setOnClickListener {

            binding.editText1.text=binding.editText1.text

        }

    }*/

    private fun habilitarBoton(){

        if(!binding.editText1.text.equals("") or !binding.editText2.text.equals("")){
            booleano=true
            binding.button.isEnabled=true
        }

    }




}