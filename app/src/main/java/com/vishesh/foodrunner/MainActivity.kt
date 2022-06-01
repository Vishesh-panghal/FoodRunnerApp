package com.vishesh.foodrunner

import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var txtForgotPassword: TextView
    private lateinit var register: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtForgotPassword = findViewById(R.id.frgtpass)
        register = findViewById(R.id.register)
        txtForgotPassword.setOnClickListener {
            val intent = Intent(this@MainActivity, ForgotPassword::class.java)
            startActivity(intent)
        }
        register.setOnClickListener {
            val intent = Intent(this@MainActivity, Register::class.java)
            startActivity(intent)
        }
    }
}
