package com.example.responsifintech

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    private lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setupRegisterLink()
        setupRecoveryLink()

        btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }


    }

    fun setupRegisterLink(){
        val linkTextReg = findViewById<TextView>(R.id.registerclick)
        linkTextReg.setTextColor(Color.BLUE)
        linkTextReg.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    fun setupRecoveryLink(){
        val linkTextReg = findViewById<TextView>(R.id.forgotpwdclick)
        linkTextReg.setTextColor(Color.BLUE)
        linkTextReg.setOnClickListener{
            val intent = Intent(this, RecoveryActivity::class.java)
            startActivity(intent)
        }
    }
}