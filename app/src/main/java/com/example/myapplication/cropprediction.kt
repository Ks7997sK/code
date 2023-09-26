package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cropprediction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cropprediction)

        val predictcrop = findViewById<Button>(R.id.cropbutton)
        predictcrop.setOnClickListener {
            val Intent = Intent(this, estimatecrop::class.java)
            startActivity(Intent)

        }
    }
}