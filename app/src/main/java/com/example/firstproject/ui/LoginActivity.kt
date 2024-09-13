package com.example.firstproject.ui

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firstproject.databinding.ActivityLoginBinding

class LoginActivity : Activity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView(){
        binding.faqsButton.setOnClickListener{
            Toast.makeText(this, getString(R.string.faqs_button_error_text), Toast.LENGTH_SHORT).show()
        }
    }
}