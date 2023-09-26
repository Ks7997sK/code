package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class yieldprediction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yieldprediction)
        val predict = findViewById<Button>(R.id.predictbutton)
        predict.setOnClickListener{
            val Intent = Intent(this,estimateyield::class.java)
            startActivity(Intent)
        }
    }
}