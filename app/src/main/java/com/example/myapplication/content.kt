package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class content : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)


            val crop = findViewById<ImageButton>(R.id.imageButton)
            crop.setOnClickListener {
                val Intent = Intent(this, cropprediction::class.java)
                startActivity(Intent)


            }

        val yield = findViewById<ImageButton>(R.id.imageButton2)
        yield.setOnClickListener{
            val Intent = Intent(this,yieldprediction::class.java)
            startActivity(Intent)

        }



    }
}