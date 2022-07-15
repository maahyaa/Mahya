package com.example.mahya


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatImageButton
import com.example.mahya.databinding.ActivityDashboardBinding
import com.google.android.material.card.MaterialCardView

class DashboardActivity : AppCompatActivity() {
  private lateinit var binding:ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
       binding= ActivityDashboardBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val a = 10
        val b = 4
        val c = a *b
        binding.city.setOnClickListener {
            intentCreator(SepehrActivity())
        }

        binding.back.setOnClickListener {
       Toast.makeText(this,"body halla",Toast.LENGTH_SHORT).show()

        }

    }

}
