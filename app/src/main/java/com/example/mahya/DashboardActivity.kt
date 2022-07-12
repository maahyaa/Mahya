package com.example.mahya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatImageButton
import com.google.android.material.card.MaterialCardView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

       val backbutton:AppCompatImageButton= findViewById(R.id.back)
        val logOutButton: AppCompatImageButton = findViewById(R.id.city)
        val location :AppCompatImageButton=findViewById(R.id.location)
        val card:MaterialCardView=findViewById(R.id.card_view_vespa)
        backbutton.setOnClickListener {
       Toast.makeText(this,"enjoy traveling",Toast.LENGTH_SHORT).show()

        }
    }

}
