package com.disabella.task1hw5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextView = findViewById<CardView>(R.id.nextView)

        nextView.setOnClickListener {
            Toast.makeText(this, getString(R.string.toast), Toast.LENGTH_SHORT).show()
        }
    }
}