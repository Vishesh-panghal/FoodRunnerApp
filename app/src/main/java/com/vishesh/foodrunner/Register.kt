package com.vishesh.foodrunner

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {
    private lateinit var login: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        login = findViewById(R.id.LogIn2)
        login.setOnClickListener {
            val intent = Intent(this@Register, MainActivity::class.java)
            startActivity(intent)
        }
    }
}