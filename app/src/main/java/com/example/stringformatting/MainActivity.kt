package com.example.stringformatting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.stringformatting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val strFormatting = getString(R.string.string_to_format, "IT wala", 2023)
        binding.txtFormatting.text = strFormatting
    }
}