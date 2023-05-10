package com.example.remit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.remit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
      with(binding){
          calculateBtn.setOnClickListener{
              resultTv.text =
                  Math().add(firstEd.text.toString(),secondEd.translationX.toString())
          }
      }
    }
}