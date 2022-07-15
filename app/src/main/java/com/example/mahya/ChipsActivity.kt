package com.example.mahya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mahya.databinding.ActivityChipsBinding

class ChipsActivity : AppCompatActivity() {
    private lateinit var binding:ActivityChipsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
      binding=ActivityChipsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}