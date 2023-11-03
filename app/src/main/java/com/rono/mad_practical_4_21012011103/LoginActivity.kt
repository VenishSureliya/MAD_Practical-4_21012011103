package com.rono.mad_practical_4_21012011103


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val signup: Button =findViewById<Button>(R.id.button4);
        signup.setOnClickListener{
            Intent(this@LoginActivity,SignupActivity::class.java).also{startActivity(it)}
        }
    }
}