package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val AgriSaver = findViewById<Button>(R.id.AgriSaverButton)
        AgriSaver.setOnClickListener {
            val Intent = Intent(this,language::class.java)
            startActivity(Intent)

        }

    }
}