package com.vishesh.foodrunner

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val frgtpass: TextView = findViewById(R.id.frgtpass)
        val register: TextView = findViewById(R.id.register)
        frgtpass.movementMethod = LinkMovementMethod.getInstance()
        register.movementMethod = LinkMovementMethod.getInstance()
    }
}