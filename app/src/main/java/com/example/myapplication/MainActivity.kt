package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var tikTokButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tikTokButton = findViewById(R.id.button)
        tikTokButton.setOnclickListener { it:View!
            Toast.makeText(context: this, "Mebo", Toast.LENGTH_SHORT)
        }
    }
}