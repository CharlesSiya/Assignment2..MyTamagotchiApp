package com.example.mypitbullapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class GameActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game2)

        val pitbullimageView = findViewById<ImageView>(R.id.pitbullimageView)
        val FEEDButton = findViewById<Button>(R.id.FEEDButton)
        val CLEANButton = findViewById<Button>(R.id.CLEANButton)
        val PLAYButton = findViewById<Button>(R.id.PLAYButton)

        val HungertextView =findViewById<TextView>(R.id.HungertextView)
        val CleantextView = findViewById<TextView>(R.id.CleantextView)
        val HappytextView = findViewById<TextView>(R.id.HappytextView)

        val feedMassage = intent.getStringExtra("Can you please feed me")

        HungertextView.text = feedMassage

        FEEDButton.setOnClickListener{
            pitbullimageView.setImageResource(R.drawable.pitbulleating)

            HungertextView.text =getString(R.string.feed_thank_you)

            HappytextView.text =getString(R.string.play_with_me)
        }
        CLEANButton.setOnClickListener{
            pitbullimageView.setImageResource(R.drawable.pitbullcleaing)

            CleantextView.text = getString(R.string.nice_and_clean)
        }
        PLAYButton.setOnClickListener{
            pitbullimageView.setImageResource(R.drawable.pitbullplaying)

            HappytextView.text = getString(R.string.the_play_was_fun)
            CleantextView.text = getString(R.string.clean_after_playing)
        }
    }
}