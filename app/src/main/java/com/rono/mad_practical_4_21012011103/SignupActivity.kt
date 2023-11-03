package com.rono.mad_practical_4_21012011103


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val login: Button = findViewById<Button>(R.id.loginbutton1)
//        val register:Button=findViewById<Button>(R.id.registerbutton)
        login.setOnClickListener {
            Intent(this@SignupActivity, LoginActivity::class.java).also { startActivity(it) }
        }
//        register.setOnClickListener{
//            Intent(this@signupActivity,)
//        }

    }
}