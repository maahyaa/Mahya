package com.example.mahya

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mahya.databinding.ActivitySepehrBinding

class SepehrActivity:AppCompatActivity() {
    private lateinit var binding:ActivitySepehrBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySepehrBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.sepehrCardViewVespa.setOnClickListener{
            val mahya =Intent(this,ChipsActivity::class.java)
            startActivity(mahya)
        }
    }

}