package com.example.mypitbullapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener{
            val intent = intent (this,GameActivity2::class.java)

            intent.putExtra("Can you please feed me")

            startActivity(intent)
        }
    }
}