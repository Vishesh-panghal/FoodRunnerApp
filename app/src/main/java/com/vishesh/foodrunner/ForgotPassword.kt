package com.vishesh.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ForgotPassword : AppCompatActivity() {
  private  lateinit var logIn : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        logIn = findViewById(R.id.LogIn)
        logIn.setOnClickListener {
            val intent = Intent(this@ForgotPassword, MainActivity::class.java)
            startActivity(intent)
        }
    }
}